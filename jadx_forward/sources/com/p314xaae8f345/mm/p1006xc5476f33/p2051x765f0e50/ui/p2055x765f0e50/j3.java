package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes14.dex */
public final class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17393x8aef9d67 f242712d;

    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17393x8aef9d67 activityC17393x8aef9d67) {
        this.f242712d = activityC17393x8aef9d67;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17393x8aef9d67 activityC17393x8aef9d67 = this.f242712d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = activityC17393x8aef9d67.f241746m;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        activityC17393x8aef9d67.f241745i = false;
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(activityC17393x8aef9d67, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17395x33991581.class);
        rk0.c.c("MicroMsg.SettingFingerprintHomeUI", "[fingerprint login] jump into fingerprint verify", new java.lang.Object[0]);
        activityC17393x8aef9d67.m78751x5dc77fb5(intent);
    }
}
