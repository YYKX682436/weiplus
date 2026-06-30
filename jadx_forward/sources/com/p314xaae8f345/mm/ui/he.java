package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class he implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f290396d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.o8 f290397e;

    /* renamed from: f, reason: collision with root package name */
    public zy2.ka f290398f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.t1 f290399g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f290401i;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f290403n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f290404o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.af f290405p;

    /* renamed from: q, reason: collision with root package name */
    public final d70.j f290406q;

    /* renamed from: r, reason: collision with root package name */
    public final l75.z0 f290407r;

    /* renamed from: s, reason: collision with root package name */
    public final mv.z f290408s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f290409t;

    /* renamed from: u, reason: collision with root package name */
    public final zy2.ja f290410u;

    /* renamed from: h, reason: collision with root package name */
    public boolean f290400h = false;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f290402m = new com.p314xaae8f345.mm.ui.se(this);

    public he() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f290403n = new com.p314xaae8f345.mm.ui.C21415x63e3759b(this, a0Var);
        this.f290404o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5982xbac3ddd5>(a0Var) { // from class: com.tencent.mm.ui.MainTabUnreadMgr$3
            {
                this.f39173x3fe91575 = 1507664325;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5982xbac3ddd5 c5982xbac3ddd5) {
                com.p314xaae8f345.mm.ui.he heVar = com.p314xaae8f345.mm.ui.he.this;
                heVar.f290401i = true;
                java.lang.Runnable runnable = heVar.f290402m;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
                return false;
            }
        };
        this.f290406q = new com.p314xaae8f345.mm.ui.ye(this);
        this.f290407r = new com.p314xaae8f345.mm.ui.ze(this);
        this.f290408s = new mv.z() { // from class: com.tencent.mm.ui.he$$a
            @Override // mv.z
            public final void a(mv.e0 e0Var) {
                final com.p314xaae8f345.mm.ui.he heVar = com.p314xaae8f345.mm.ui.he.this;
                heVar.getClass();
                if (e0Var == null || e0Var.f413029c != mv.f0.f413035e) {
                    return;
                }
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.he$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.ui.he.this.b();
                    }
                });
            }
        };
        this.f290409t = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6186x35b2dd7b>(a0Var) { // from class: com.tencent.mm.ui.MainTabUnreadMgr$10
            {
                this.f39173x3fe91575 = 1649005931;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6186x35b2dd7b c6186x35b2dd7b) {
                c6186x35b2dd7b.getClass();
                com.p314xaae8f345.mm.ui.he heVar = com.p314xaae8f345.mm.ui.he.this;
                heVar.getClass();
                nm.j.f419976g.a(new com.p314xaae8f345.mm.ui.we(heVar));
                return false;
            }
        };
        this.f290410u = new com.p314xaae8f345.mm.ui.re(this);
    }

    public void a(int i17) {
        com.p314xaae8f345.mm.ui.t1 t1Var = this.f290399g;
        if (t1Var != null) {
            t1Var.mo78461x684367d(i17);
        }
        zy2.ka kaVar = this.f290398f;
        if (kaVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g) kaVar).f187061b = i17;
        }
        if (i17 != 3) {
            b00.q2 q2Var = (b00.q2) ((c00.b4) i95.n0.c(c00.b4.class));
            if (q2Var.f98289g) {
                q2Var.f98289g = false;
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("session_out", null, kz5.c1.k(new jz5.l("page_id", "my_page"), new jz5.l("if_red_dot", 1), new jz5.l("expose_id", q2Var.f98286d), new jz5.l("stay_time_ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - q2Var.f98287e))), 12, false);
                q2Var.f98286d = "";
                q2Var.f98287e = 0L;
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.t1 t1Var2 = this.f290399g;
        boolean z17 = t1Var2 != null && t1Var2.mo78456x98878377();
        ((oh3.i) ((p90.k) i95.n0.c(p90.k.class))).wi(2, z17);
        b00.q2 q2Var2 = (b00.q2) ((c00.b4) i95.n0.c(c00.b4.class));
        q2Var2.getClass();
        if (((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Ri()) {
            if (q2Var2.f98286d.length() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMEcsReportService", "sessionIn exposeId=" + q2Var2.f98286d + " pageEnterTime=" + q2Var2.f98287e + " needReportPageEvent=" + q2Var2.f98289g);
            }
            q2Var2.f98286d = java.lang.String.valueOf(c01.id.c());
            q2Var2.f98287e = android.os.SystemClock.elapsedRealtime();
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("MyTab");
                if (L0 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMEcsReportService", "sessionIn exposeId=" + q2Var2.f98286d + " ctrlInfo is null");
                    return;
                }
                int m55856xfb85f7b0 = L0.m55856xfb85f7b0();
                if (m55856xfb85f7b0 < 700000 || m55856xfb85f7b0 >= 799999) {
                    return;
                }
                q2Var2.f98289g = true;
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("session_in", null, kz5.c1.k(new jz5.l("page_id", "my_page"), new jz5.l("if_red_dot", 1), new jz5.l("reddot_id", L0.f65882x5364c75d), new jz5.l("expose_id", q2Var2.f98286d), new jz5.l("reddot_ext_info", L0.f65874xb5f7102a.f470032t), new jz5.l("reddot_rec_timestamp", java.lang.Long.valueOf(L0.f65879x2261f6f2)), new jz5.l("reddot_type", java.lang.Integer.valueOf(L0.m55856xfb85f7b0()))), 12, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0452  */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.he.b():void");
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj != null && (obj instanceof java.lang.String) && a1Var == c01.d9.b().r() && com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3((java.lang.String) obj)) {
            nm.j.f419976g.a(new com.p314xaae8f345.mm.ui.we(this));
        }
    }
}
