package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class lb extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.hb {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f166298h;

    /* renamed from: i, reason: collision with root package name */
    public final int f166299i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 f166300m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z5 f166301n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 f166302o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f166303p = false;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f166304q = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a.a();

    /* renamed from: r, reason: collision with root package name */
    public final boolean f166305r = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.h1.a(true);

    public lb(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553, int i19, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p pVar, boolean z17, boolean z18) {
        this.f166298h = str;
        this.f166299i = i17;
        this.f166302o = c12566x87f2d8b7;
        this.f166300m = c11829x68027553;
        r45.y50 y50Var = new r45.y50();
        y50Var.f472330d = i18;
        pVar.a(y50Var);
        if (z18) {
            y50Var.f472332f = 1;
        } else {
            y50Var.f472332f = z17 ? 102 : 101;
        }
        this.f166301n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.mb(this, str, i17, i19, str2, str3, c11829x68027553, c12566x87f2d8b7, y50Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.hb
    public java.lang.String f() {
        return "MicroMsg.AppBrand.PrepareStepCheckAppPkgWrapper";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.hb
    public final void g(boolean z17) {
        this.f166183g = z17;
        java.util.concurrent.Callable callable = this.f166301n;
        if (callable instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y5) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y5) callable)).f166647o = z17;
        } else if (callable instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.hb) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.hb) callable).g(z17);
        }
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 call() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(this.f166299i)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553 = this.f166300m;
            if (c11829x68027553.B >= 0 && c11829x68027553.f158977d > 0) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ec) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ec.class)).z0(this.f166298h, c11829x68027553.f158977d, c11829x68027553.B);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r8) this.f166301n).call();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        if (c11667xc7e59dd6 != null) {
            if (this.f166303p) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.f(this.f166298h, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35243xb69baf20, "", currentTimeMillis, currentTimeMillis2);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.f(this.f166298h, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35242x3377c4f6, "", currentTimeMillis, currentTimeMillis2);
            }
        } else if (this.f166303p) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.d(this.f166298h, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35243xb69baf20, "", "", currentTimeMillis, currentTimeMillis2);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.d(this.f166298h, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35242x3377c4f6, "", "", currentTimeMillis, currentTimeMillis2);
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.d9.a(this.f166302o.f169667d, c11667xc7e59dd6 != null, currentTimeMillis2 - currentTimeMillis);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PrepareStepCheckAppPkgWrapper", "call() reportUpdateResultAfterVersionFallbackIfNeed get exception %s", th6);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PrepareStepCheckAppPkgWrapper", "call() for appId:%s, WEAKNET_MOCK:%b, hasDownload:%b", this.f166298h, java.lang.Boolean.valueOf(this.f166304q), java.lang.Boolean.valueOf(this.f166303p));
        if (this.f166304q && this.f166303p) {
            java.lang.Thread.sleep(60000L);
        } else if (this.f166305r && this.f166303p && c11667xc7e59dd6 != null) {
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i.a(this.f166298h, c11667xc7e59dd6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e3.f171948a, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.lb$$a
                @Override // java.lang.Runnable
                public final void run() {
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(1L, java.util.concurrent.TimeUnit.MINUTES);
            } catch (java.lang.InterruptedException unused) {
            }
        }
        return c11667xc7e59dd6;
    }

    public void j(int i17) {
    }

    public void k() {
        this.f166303p = true;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(this.f166299i)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x5.b();
        }
    }
}
