package com.p314xaae8f345.mm.p849xbf8d97c1;

/* loaded from: classes5.dex */
public final class f extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.a {
    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiLeakFixer", "fixHwDamageRectFpsManagerLeak");
        jz5.g gVar = com.p314xaae8f345.mm.p849xbf8d97c1.i.f150249a;
        try {
            jz5.g gVar2 = com.p314xaae8f345.mm.p849xbf8d97c1.i.f150251c;
            java.lang.reflect.Field field = (java.lang.reflect.Field) ((jz5.n) gVar2).mo141623x754a37bb();
            jz5.g gVar3 = com.p314xaae8f345.mm.p849xbf8d97c1.i.f150250b;
            android.content.Context context = (android.content.Context) field.get(((jz5.n) gVar3).mo141623x754a37bb());
            if (context != null) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(context, activity) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(context.getClass().getName(), "com.tencent.mm.splash.SplashHackActivity")) {
                    if (context instanceof android.app.Activity) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiLeakFixer", "mContext is Activity, mContext = " + context + ", destroyingActivity = " + activity);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiLeakFixer", "mContext is not Activity, mContext = " + context);
                    }
                }
                ((java.lang.reflect.Field) ((jz5.n) gVar2).mo141623x754a37bb()).set(((jz5.n) gVar3).mo141623x754a37bb(), null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiLeakFixer", "fixed, mContext = " + context);
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
