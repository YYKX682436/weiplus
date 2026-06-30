package com.tencent.mm.matrix;

/* loaded from: classes5.dex */
public final class f extends com.tencent.matrix.lifecycle.a {
    @Override // com.tencent.matrix.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("MicroMsg.HuaweiLeakFixer", "fixHwDamageRectFpsManagerLeak");
        jz5.g gVar = com.tencent.mm.matrix.i.f68716a;
        try {
            jz5.g gVar2 = com.tencent.mm.matrix.i.f68718c;
            java.lang.reflect.Field field = (java.lang.reflect.Field) ((jz5.n) gVar2).getValue();
            jz5.g gVar3 = com.tencent.mm.matrix.i.f68717b;
            android.content.Context context = (android.content.Context) field.get(((jz5.n) gVar3).getValue());
            if (context != null) {
                if (!kotlin.jvm.internal.o.b(context, activity) && !kotlin.jvm.internal.o.b(context.getClass().getName(), "com.tencent.mm.splash.SplashHackActivity")) {
                    if (context instanceof android.app.Activity) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.HuaweiLeakFixer", "mContext is Activity, mContext = " + context + ", destroyingActivity = " + activity);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.HuaweiLeakFixer", "mContext is not Activity, mContext = " + context);
                    }
                }
                ((java.lang.reflect.Field) ((jz5.n) gVar2).getValue()).set(((jz5.n) gVar3).getValue(), null);
                com.tencent.mars.xlog.Log.i("MicroMsg.HuaweiLeakFixer", "fixed, mContext = " + context);
            }
        } catch (java.lang.ClassNotFoundException e17) {
            oj.j.d("MicroMsg.HuaweiLeakFixer", e17, "", new java.lang.Object[0]);
        } catch (java.lang.NoSuchFieldException e18) {
            oj.j.d("MicroMsg.HuaweiLeakFixer", e18, "", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.HuaweiLeakFixer", th6, "", new java.lang.Object[0]);
        }
    }
}
