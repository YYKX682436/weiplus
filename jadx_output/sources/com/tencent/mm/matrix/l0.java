package com.tencent.mm.matrix;

/* loaded from: classes8.dex */
public final class l0 extends com.tencent.matrix.lifecycle.a {
    @Override // com.tencent.matrix.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("MicroMsg.VivoPromotionLeakFixer", "fixVivoPromotionLeak");
        jz5.g gVar = com.tencent.mm.matrix.n0.f68824a;
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("before fix animationHandles=");
            jz5.g gVar2 = com.tencent.mm.matrix.n0.f68826c;
            sb6.append((java.util.LinkedHashMap) ((jz5.n) gVar2).getValue());
            sb6.append(", mAnimationObjs=");
            jz5.g gVar3 = com.tencent.mm.matrix.n0.f68827d;
            sb6.append((java.util.LinkedHashMap) ((jz5.n) gVar3).getValue());
            com.tencent.mars.xlog.Log.i("MicroMsg.VivoPromotionLeakFixer", sb6.toString());
            ((java.util.LinkedHashMap) ((jz5.n) gVar2).getValue()).clear();
            ((java.util.LinkedHashMap) ((jz5.n) gVar3).getValue()).clear();
            com.tencent.mars.xlog.Log.i("MicroMsg.VivoPromotionLeakFixer", "animationHandles=" + ((java.util.LinkedHashMap) ((jz5.n) gVar2).getValue()) + ", mAnimationObjs=" + ((java.util.LinkedHashMap) ((jz5.n) gVar3).getValue()));
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.VivoPromotionLeakFixer", th6, "", new java.lang.Object[0]);
        }
    }
}
