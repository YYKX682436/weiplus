package com.p314xaae8f345.mm.p849xbf8d97c1;

/* loaded from: classes8.dex */
public final class l0 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.a {
    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VivoPromotionLeakFixer", "fixVivoPromotionLeak");
        jz5.g gVar = com.p314xaae8f345.mm.p849xbf8d97c1.n0.f150357a;
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("before fix animationHandles=");
            jz5.g gVar2 = com.p314xaae8f345.mm.p849xbf8d97c1.n0.f150359c;
            sb6.append((java.util.LinkedHashMap) ((jz5.n) gVar2).mo141623x754a37bb());
            sb6.append(", mAnimationObjs=");
            jz5.g gVar3 = com.p314xaae8f345.mm.p849xbf8d97c1.n0.f150360d;
            sb6.append((java.util.LinkedHashMap) ((jz5.n) gVar3).mo141623x754a37bb());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VivoPromotionLeakFixer", sb6.toString());
            ((java.util.LinkedHashMap) ((jz5.n) gVar2).mo141623x754a37bb()).clear();
            ((java.util.LinkedHashMap) ((jz5.n) gVar3).mo141623x754a37bb()).clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VivoPromotionLeakFixer", "animationHandles=" + ((java.util.LinkedHashMap) ((jz5.n) gVar2).mo141623x754a37bb()) + ", mAnimationObjs=" + ((java.util.LinkedHashMap) ((jz5.n) gVar3).mo141623x754a37bb()));
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.VivoPromotionLeakFixer", th6, "", new java.lang.Object[0]);
        }
    }
}
