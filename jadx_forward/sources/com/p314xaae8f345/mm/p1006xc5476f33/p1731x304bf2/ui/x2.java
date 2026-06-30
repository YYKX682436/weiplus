package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15955xbd627646 f223377d;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15955xbd627646 activityC15955xbd627646) {
        this.f223377d = activityC15955xbd627646;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] D0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().D0("pb_download_guidance");
        if (D0 == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v2(this));
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w2(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.v1(D0)));
        }
        java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15955xbd627646 activityC15955xbd627646 = this.f223377d;
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f3(d17, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.e(activityC15955xbd627646), activityC15955xbd627646.f222234m, activityC15955xbd627646.f222235n, activityC15955xbd627646.f222236o, activityC15955xbd627646.f222232h));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("game_center_pref", 0).edit().putString("game_center_pref_lang", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()).commit();
        r53.b.f474173a.b();
    }
}
