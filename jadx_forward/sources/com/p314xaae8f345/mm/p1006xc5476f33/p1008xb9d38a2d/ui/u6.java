package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class u6 implements wd0.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 f155772a;

    public u6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98) {
        this.f155772a = activityC11419x78fe9e98;
    }

    @Override // wd0.c1
    public void a(final wd0.e1 e1Var) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k());
        hashMap.put("fingerprint_verify_result", java.lang.Integer.valueOf(e1Var.f526236a));
        hashMap.put("login_sessionid", v61.d.a(1));
        ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Ai(null, "fingerprint_login_request_end", hashMap);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.G1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginPasswordUI", "[fingerprint login] showFingerprintDialog result %d,errMsg %s", java.lang.Integer.valueOf(e1Var.f526236a), e1Var.f526237b);
        int i18 = e1Var.f526236a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98 = this.f155772a;
        if (i18 != 0) {
            activityC11419x78fe9e98.m7(i18);
        } else {
            activityC11419x78fe9e98.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.u6$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e982 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.u6.this.f155772a;
                    gm0.j1.d().g(new com.p314xaae8f345.mm.p957x53236a1b.v0(activityC11419x78fe9e982.E, e1Var.f526239d, 0, "", "", "", 0, "", false, true));
                    activityC11419x78fe9e982.g7(true);
                }
            });
        }
    }

    @Override // wd0.c1
    public void b(boolean z17) {
        this.f155772a.g7(z17);
    }
}
