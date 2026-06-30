package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class ic implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 f228556d;

    public ic(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13) {
        this.f228556d = activityC16373x8a110f13;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = this.f228556d;
        if (activityC16373x8a110f13.isFinishing() || activityC16373x8a110f13.isDestroyed()) {
            java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.f227774x2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[refreshViewByConfigAndSourceMac] isFinishing() || isDestroyed()");
            return;
        }
        activityC16373x8a110f13.t7(false);
        java.lang.String stringExtra = activityC16373x8a110f13.getIntent().getStringExtra("key_username");
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.f226985a;
        if (c01.e2.S(stringExtra)) {
            hb3.o.Ni().Di().g();
        } else if (activityC16373x8a110f13.Y == 3) {
            hb3.o.Ni().Bi().g();
        } else {
            ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.s()) {
                hb3.o.Ni().wi().g();
            }
        }
        activityC16373x8a110f13.y7();
        if (c01.e2.S(activityC16373x8a110f13.getIntent().getStringExtra("key_username"))) {
            activityC16373x8a110f13.f227801p0 = hb3.o.Ni().Di().c();
        } else if (activityC16373x8a110f13.Y == 3) {
            activityC16373x8a110f13.f227801p0 = hb3.o.Ni().Bi().c();
        } else {
            ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.s()) {
                activityC16373x8a110f13.f227801p0 = hb3.o.Ni().wi().c();
            }
        }
        activityC16373x8a110f13.h7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m mVar = activityC16373x8a110f13.f227801p0;
        if (mVar == null) {
            activityC16373x8a110f13.z7(null);
            return;
        }
        r45.wv3 wv3Var = mVar.f226968a;
        if (wv3Var != null) {
            activityC16373x8a110f13.Q1 = wv3Var != null ? wv3Var.f471049y : 0;
            java.lang.String str3 = "";
            if (wv3Var == null || (str = wv3Var.f471047w) == null) {
                str = "";
            }
            activityC16373x8a110f13.R1 = str;
            if (wv3Var != null && (str2 = wv3Var.f471048x) != null) {
                str3 = str2;
            }
            activityC16373x8a110f13.S1 = str3;
        }
        activityC16373x8a110f13.z7(wv3Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(991, 10);
    }
}
