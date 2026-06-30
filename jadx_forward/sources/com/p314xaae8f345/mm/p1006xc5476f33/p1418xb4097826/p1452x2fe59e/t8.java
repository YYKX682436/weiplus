package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public abstract class t8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj {
    public final boolean A;
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g B;
    public long C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public long G;
    public boolean H;
    public yz5.p I;

    /* renamed from: J, reason: collision with root package name */
    public yz5.p f190578J;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 K;
    public boolean L;
    public int M;
    public boolean N;
    public java.lang.String P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public r45.a34 T;
    public java.lang.String U;
    public int V;
    public java.lang.String W;
    public r45.nv2 X;
    public long Y;
    public boolean Z;

    /* renamed from: y, reason: collision with root package name */
    public final int f190579y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f190580z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(int i17, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, boolean z17, boolean z18, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(context);
        z17 = (i19 & 4) != 0 ? false : z17;
        z18 = (i19 & 8) != 0 ? false : z18;
        i18 = (i19 & 16) != 0 ? 0 : i18;
        gVar = (i19 & 32) != 0 ? null : gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f190579y = i17;
        this.f190580z = z17;
        this.A = z18;
        this.B = gVar;
        this.f187960m = i18;
        this.E = "";
        this.F = "";
        this.H = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void C() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm) this).f211282x0, "loadMoreData: needRelatedList=" + this.H + ", isFirstRefreshEnd=" + this.Z);
        if (this.H && this.Z) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a;
            int i17 = this.f187960m;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f187954d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.t(v1Var, i17, 2, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), 10L, false, 16, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.o(v1Var, this.f187960m, true, null, false, 0L, false, 60, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188103t;
            if (abstractC13919x46aff122 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(abstractC13919x46aff122, false, 1, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void D(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.D(callback);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f187954d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7.class)).P6(callback.m56068x4905e9fa());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void P() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        if (this.N && this.H && this.S) {
            this.Q = true;
            if (this.R) {
                p0(false);
                return;
            }
            return;
        }
        this.S = true;
        java.lang.String str = this.P;
        if ((str == null || str.length() == 0) == false) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r8(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a;
        int i17 = this.f187960m;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f187954d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.t(v1Var, i17, 0, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), 10L, false, 16, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.o(v1Var, this.f187960m, true, null, false, 0L, false, 60, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s8 s8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s8(this);
        r6 = null;
        java.lang.Long l17 = null;
        if (this.L) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm) this;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadFirstFeed objectId = 0, localId = ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.K;
            if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null) {
                l17 = java.lang.Long.valueOf(feedObject.m59260x51f8f5b0());
            }
            sb6.append(l17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qmVar.f211282x0, sb6.toString());
            if (this.K == null) {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.o8(this));
                return;
            }
            return;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).Ai() && ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.O().r()).intValue() == 1) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p8(this));
            return;
        }
        if (activity.getIntent().getIntExtra("business_type", 0) != 1) {
            Z(s8Var);
            return;
        }
        java.lang.String stringExtra = activity.getIntent().getStringExtra("finder_user_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String str2 = stringExtra;
        long j17 = this.C;
        java.lang.String str3 = this.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        pq5.g l18 = new db2.n4(j17, str2, str3, 1, nyVar != null ? nyVar.V6() : null).l();
        l18.f(activity);
        l18.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q8(this, s8Var));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj
    public boolean Q() {
        return this.f190580z;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj
    public void V() {
        super.V();
        java.lang.String stringExtra = this.f187954d.getIntent().getStringExtra("FLOAT_BALL_KEY");
        if (stringExtra == null || stringExtra.length() == 0) {
            return;
        }
        this.Z = true;
    }

    public final void Z(yz5.a aVar) {
        long j17 = this.C;
        java.lang.String str = this.E;
        int i17 = this.f187955e;
        int i18 = this.f190579y;
        java.lang.String str2 = this.F;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f187954d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        db2.g4 g4Var = new db2.g4(j17, str, i17, i18, "", true, null, null, 0L, null, false, false, str2, nyVar != null ? nyVar.V6() : null, 0, null, false, null, this.B, null, this.T, this.U, 0, this.V, this.W, this.X, true, this.D, null, 273403840, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.l(this.f187960m, true, this.C != 0, this.F.length() > 0);
        pq5.g l17 = g4Var.l();
        l17.f(context);
        l17.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m8(this, aVar));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public boolean d0() {
        return this.A;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fp
    public java.util.ArrayList f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188103t;
        if (abstractC13919x46aff122 != null) {
            return abstractC13919x46aff122.m56388xcaeb60d0();
        }
        return null;
    }

    public final void i0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        java.lang.String str2 = this.P;
        if (!(str2 == null || str2.length() == 0) || feed.getFeedObject().m59315x31740422()) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f187954d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            java.lang.String str3 = this.P;
            if (str3 == null) {
                ya2.b2 contact = feed.getContact();
                java.lang.String D0 = contact != null ? contact.D0() : null;
                if (D0 != null) {
                    str = D0;
                    pm0.v.T(new ho2.c(V6, str, 0, 4, null).l(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.n8(this, feed)).f(context);
                }
                str3 = "";
            }
            str = str3;
            pm0.v.T(new ho2.c(V6, str, 0, 4, null).l(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.n8(this, feed)).f(context);
        }
    }

    public final void j0() {
        if (this.R && this.N && this.H) {
            java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm) this).f211282x0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "preloadSlideUp");
            long a17 = c01.id.a();
            if (a17 - this.Y <= 3500) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "ignore preloadSlideUp");
            } else {
                this.Y = a17;
                p0(true);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0, fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        super.mo979x3f5eee52();
    }

    public final void p0(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188103t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8 c13861xc72e20d8 = abstractC13919x46aff122 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8) abstractC13919x46aff122 : null;
        if (c13861xc72e20d8 == null || !c13861xc72e20d8.L) {
            return;
        }
        c13861xc72e20d8.L = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56344x8e35192c(c13861xc72e20d8, c13861xc72e20d8.f188973n ? null : new db2.t0(c13861xc72e20d8.f188966d, c13861xc72e20d8.f188968f, c13861xc72e20d8.f188969g, c13861xc72e20d8.m56357x44e5026c(), null, c13861xc72e20d8.f188971i, c13861xc72e20d8.N, c13861xc72e20d8.P, c13861xc72e20d8.f188972m, null, c13861xc72e20d8.m56354xfe9224be(), 0.0f, 0.0f, c13861xc72e20d8.f188974o, 0, 19, null, c13861xc72e20d8.f188978s, null, 0, c13861xc72e20d8.f188979t, c13861xc72e20d8.f188980u, c13861xc72e20d8.f188981v, null, c13861xc72e20d8.f188982w, c13861xc72e20d8.f188983x, c13861xc72e20d8.f188984y, null, c13861xc72e20d8.A, null, 680352256, null), null, 2, null);
    }

    public final void u0(java.lang.String str, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        int i17 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().I;
        if (i17 == 0 || i17 == 1 || i17 != 2) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm) this).f211282x0, "startPreloadVideo " + str + " feedId:" + pm0.v.u(c19792x256d2725.m76784x5db1b11()) + " return for disable");
    }
}
