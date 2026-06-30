package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.b50 f246327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a3 f246328e;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a3 a3Var, r45.b50 b50Var) {
        this.f246328e = a3Var;
        this.f246327d = b50Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        boolean z18;
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b3 b3Var = this.f246328e.f245607a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c3 c3Var = b3Var.f245624c;
        r45.b50 b50Var = this.f246327d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = b3Var.f245623b;
        c3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processSnsAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        try {
            r45.l76 l76Var = (r45.l76) new r45.l76().mo11468x92b714fd(b50Var.f452064e.f453374f.g());
            long j17 = l76Var.f460736d;
            long j18 = l76Var.f460737e;
            r45.k76 k76Var = l76Var.f460738f;
            java.lang.String str = l76Var.f460740h;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "process action " + k76Var.f459995h + " " + j17 + " " + str2);
            switch (k76Var.f459995h) {
                case 9:
                    z18 = true;
                    c3Var.L(l76Var, k76Var, j17, j18, str2, n3Var);
                    break;
                case 10:
                    z18 = true;
                    c3Var.J(l76Var, k76Var, j17, j18, str2, n3Var);
                    break;
                case 11:
                    z18 = true;
                    c3Var.R(l76Var, k76Var, j17, j18, str2, n3Var);
                    break;
                case 12:
                    z18 = true;
                    c3Var.K(l76Var, k76Var, j17, j18, str2, n3Var);
                    break;
                case 13:
                    z18 = true;
                    c3Var.N(l76Var, k76Var, j17, j18, str2, n3Var);
                    break;
                case 14:
                    z18 = true;
                    c3Var.M(l76Var, k76Var, j17, j18, str2, n3Var);
                    break;
                case 15:
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.u1.b(j17);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(j17);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = W0.m70371x485d7();
                    m70371x485d7.f39034xebc78809 = 1;
                    W0.m70466xfabce6e3(m70371x485d7);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().v3(j17, W0);
                    z18 = true;
                    break;
                case 16:
                    c3Var.P(j17, k76Var.f460006v, l76Var);
                    z18 = true;
                    break;
                case 17:
                    c3Var.Q(j17);
                    z18 = true;
                    break;
                default:
                    z18 = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c3.O(l76Var);
                    break;
            }
            synchronized (jm0.k.f381803i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
            }
            ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).i7(j17, o75.b.f425116d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x2(c3Var, !com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.i(k76Var.f460005u, 2) ? z18 : false, k76Var, n3Var));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processSnsAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            z17 = z18;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneNewSyncAlbum", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processSnsAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            z17 = false;
        }
        if (!z17) {
            this.f246328e.f245607a.f245623b.mo50305x3d8a09a2(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1$2");
    }
}
