package com.tencent.mm.plugin.appbrand.performance;

/* loaded from: classes12.dex */
public final class y implements hm0.q {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f87390d;

    public y() {
        boolean z17;
        if (java.lang.System.currentTimeMillis() % 100 == 1 || z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192974b) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        this.f87390d = z17;
    }

    @Override // hm0.q
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // hm0.q
    public void onLowMemory() {
        if (this.f87390d && !com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE.isBackground()) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.performance.x(this), "MemoryNegativeFeedbackReporter");
        }
    }

    @Override // hm0.q
    public void onTerminate() {
    }

    @Override // hm0.q
    public void onTrimMemory(int i17) {
        if (this.f87390d && !com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE.isBackground()) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.performance.w(this, i17), "MemoryNegativeFeedbackReporter");
        }
    }
}
