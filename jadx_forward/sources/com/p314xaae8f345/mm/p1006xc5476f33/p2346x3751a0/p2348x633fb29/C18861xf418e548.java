package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.voip.model.NewVoipMgr$4 */
/* loaded from: classes14.dex */
public class C18861xf418e548 implements ve0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 f257837a;

    public C18861xf418e548(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var) {
        this.f257837a = d0Var;
    }

    @Override // ve0.f
    public void a(final int i17) {
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.voip.model.NewVoipMgr$4$$a
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String string;
                java.lang.String str;
                int i18 = i17;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
                final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18861xf418e548.this.f257837a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onCallStateChanged :%d, isStartVoip: %b,oldState:%d", valueOf, java.lang.Boolean.valueOf(d0Var.H), java.lang.Integer.valueOf(d0Var.S));
                if (d0Var.H) {
                    int i19 = d0Var.S;
                    if ((i19 == 0 && i18 == 1) || (i19 == 0 && i18 == 2)) {
                        d0Var.P++;
                    }
                    vq4.z zVar = d0Var.f257906d;
                    if (i18 == 1) {
                        d0Var.f257905J = true;
                        if (i19 == 0) {
                            d0Var.M = java.lang.System.currentTimeMillis();
                        }
                        d0Var.S = 1;
                        gq4.v.Bi().A(1, 1);
                        d0Var.U = true;
                    } else if (i18 == 2) {
                        d0Var.f257905J = false;
                        if (i19 == 1) {
                            d0Var.N = java.lang.System.currentTimeMillis();
                        }
                        d0Var.S = 2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "phone call coming now!");
                        if (vq4.n0.h(d0Var.f257907e.f520902a)) {
                            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kab, d0Var.q0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(d0Var.B)));
                        } else {
                            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(d0Var.f257920r ? com.p314xaae8f345.mm.R.C30867xcad56011.f574991ka3 : com.p314xaae8f345.mm.R.C30867xcad56011.kad);
                        }
                        java.lang.String str2 = string;
                        java.lang.String d17 = d0Var.f257919q.d1();
                        if (d0Var.f257921s) {
                            int i27 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
                            str = "voip_content_video";
                        } else {
                            int i28 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
                            str = "voip_content_voice";
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b2.e(d17, str, d0Var.f257920r ? 1 : 0, 6, str2, false, new yz5.l() { // from class: com.tencent.mm.plugin.voip.model.NewVoipMgr$9
                            @Override // yz5.l
                            /* renamed from: invoke */
                            public java.lang.Object mo146xb9724478(java.lang.Object obj) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this.v0(1);
                                return null;
                            }
                        });
                        if (d0Var.f257920r && !vq4.n0.h(d0Var.f257907e.f520902a)) {
                            gq4.v.Bi().c();
                        }
                        gq4.v.Bi().s(4);
                        d0Var.E0(4107);
                        d0Var.m0();
                        d0Var.R = true;
                        gq4.v.Bi().A(2, 1);
                        d0Var.U = false;
                    } else if (i18 == 0) {
                        if (i19 == 1 || i19 == 2) {
                            d0Var.N = java.lang.System.currentTimeMillis();
                        }
                        d0Var.S = 0;
                        gq4.v.Bi().A(2, 1);
                        if (d0Var.f257905J) {
                            if (d0Var.A != null && vq4.n0.h(d0Var.f257907e.f520902a)) {
                                cv.v0 info = d0Var.A;
                                vq4.m0 m0Var = (vq4.m0) zVar;
                                m0Var.getClass();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
                                m0Var.m(info);
                            } else if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui()) {
                                cv.v0 v0Var = new cv.v0(4, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6m), 3);
                                vq4.m0 m0Var2 = (vq4.m0) zVar;
                                m0Var2.getClass();
                                m0Var2.m(v0Var);
                            } else if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).aj()) {
                                cv.v0 v0Var2 = new cv.v0(3, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6o), 3);
                                vq4.m0 m0Var3 = (vq4.m0) zVar;
                                m0Var3.getClass();
                                m0Var3.m(v0Var2);
                            }
                            d0Var.f257905J = false;
                            d0Var.U = false;
                        }
                    }
                    ((vq4.m0) zVar).f520891v = d0Var.U;
                }
            }
        });
    }

    @Override // ve0.f
    public void b(android.content.Intent intent) {
    }

    @Override // ve0.f
    /* renamed from: onSignalStrengthsChanged */
    public void mo72737xe75d7d89(android.telephony.SignalStrength signalStrength) {
    }
}
