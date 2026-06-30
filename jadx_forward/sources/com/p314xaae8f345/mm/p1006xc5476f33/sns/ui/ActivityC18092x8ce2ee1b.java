package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsPermissionUI */
/* loaded from: classes4.dex */
public class ActivityC18092x8ce2ee1b extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f248885r = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f248888f;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f248886d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f248887e = "";

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f248889g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f248890h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f248891i = false;

    /* renamed from: m, reason: collision with root package name */
    public long f248892m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f248893n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f248894o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f248895p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f248896q = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final int V6() {
        ?? r27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkActionCode", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f248889g;
        if (z3Var != null) {
            boolean x27 = z3Var.x2();
            r27 = x27;
            if (W6(this.f248887e, 5L)) {
                r27 = (x27 ? 1 : 0) | 2;
            }
        } else {
            r27 = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkActionCode", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        return r27;
    }

    public final boolean W6(java.lang.String str, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isInTagList", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 D0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().D0(j17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D0.f69152x693306bd)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInTagList", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
            return false;
        }
        boolean contains = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(D0.f69152x693306bd.split(",")).contains(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInTagList", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        return contains;
    }

    public final void X6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateState", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f248887e, true);
        this.f248889g = n17;
        n17.X1(this.f248887e);
        boolean x27 = this.f248889g.x2();
        boolean W6 = W6(this.f248887e, 5L);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248888f).h("sns_outside_permiss");
        c21541x1c1b08fe.O(x27);
        int i17 = this.f248889g.I;
        if (i17 == 1) {
            c21541x1c1b08fe.J(com.p314xaae8f345.mm.R.C30867xcad56011.jdc);
        } else if (i17 == 2) {
            c21541x1c1b08fe.J(com.p314xaae8f345.mm.R.C30867xcad56011.jdb);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248888f).h("sns_black_permiss");
        if (i17 == 1) {
            c21541x1c1b08fe2.J(com.p314xaae8f345.mm.R.C30867xcad56011.j9h);
        } else if (i17 == 2) {
            c21541x1c1b08fe2.J(com.p314xaae8f345.mm.R.C30867xcad56011.j9g);
        }
        c21541x1c1b08fe2.O(W6);
        if (!this.f248889g.r2()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248888f).w("sns_black_permiss");
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21563x29f29d94 c21563x29f29d94 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21563x29f29d94) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248888f).h("sns_openim_desc_footer");
        boolean z17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(this.f248887e) && "3552365301".equals(this.f248889g.Q0());
        this.f248895p = z17;
        if (z17) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248888f).m("sns_outside_permiss", true);
            c21563x29f29d94.G(com.p314xaae8f345.mm.R.C30867xcad56011.jdd);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248888f).m("sns_openim_desc_footer", true);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248888f).notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateState", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
            return dispatchKeyEvent;
        }
        setResult(-1, new android.content.Intent());
        finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        return com.p314xaae8f345.mm.R.xml.f576493cq;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        this.f248888f = m79336x8b97809d();
        if (this.f248889g != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(this.f248887e) && "3552365301".equals(this.f248889g.Q0())) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.jdf);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.jde);
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.eo(this));
        this.f248894o = W6(this.f248887e, 5L);
        X6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        super.onCreate(bundle);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(291, this);
        this.f248887e = getIntent().getStringExtra("sns_permission_userName");
        getIntent().getBooleanExtra("sns_permission_anim", false);
        this.f248892m = getIntent().getLongExtra("sns_permission_snsinfo_svr_id", 0L);
        this.f248893n = getIntent().getIntExtra("sns_permission_block_scene", 0);
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f248887e, true);
        this.f248889g = n17;
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsPermissionUI", "the error cause by get contact by %s", this.f248887e);
            finish();
        }
        this.f248889g.X1(this.f248887e);
        mo43517x10010bd5();
        this.f248896q = V6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doSync", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doSync", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        gm0.j1.i();
        gm0.j1.n().f354821b.q(291, this);
        long j17 = this.f248892m;
        if (j17 != 0 && j17 != -1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6060x149206d c6060x149206d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6060x149206d();
            boolean z17 = this.f248891i;
            am.rv rvVar = c6060x149206d.f136342g;
            rvVar.f89380a = z17;
            rvVar.f89381b = this.f248892m;
            c6060x149206d.e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportPerMission", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        int V6 = V6();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6901xd73fd110 c6901xd73fd110 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6901xd73fd110();
        c6901xd73fd110.f142215d = c6901xd73fd110.b("Username", this.f248887e, true);
        c6901xd73fd110.f142216e = c6901xd73fd110.b("PublishId", ca4.z0.t0(this.f248892m), true);
        c6901xd73fd110.f142217f = this.f248896q;
        c6901xd73fd110.f142218g = V6;
        c6901xd73fd110.f142219h = 5;
        c6901xd73fd110.k();
        android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportPerMission", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        if (this.f248895p) {
            boolean W6 = W6(this.f248887e, 5L);
            boolean z19 = this.f248894o;
            if (z19 && !W6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.L(this.f248887e, 2, 2);
            } else if (z19 || !W6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.L(this.f248887e, 2, 1);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.L(this.f248887e, 2, 3);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        java.lang.String str = c21560x1fce98fb.f279313q;
        if (str.equals("sns_outside_permiss")) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a c6082xbd84dd0a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a();
            am.jw jwVar = c6082xbd84dd0a.f136360g;
            jwVar.getClass();
            jwVar.f88635a = false;
            jwVar.f88636b = this.f248887e;
            c6082xbd84dd0a.e();
            if (this.f248889g.x2()) {
                c01.e2.x0(this.f248889g, false, true);
            } else {
                c01.e2.x0(this.f248889g, true, true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
            return true;
        }
        if (!str.equals("sns_black_permiss")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a c6082xbd84dd0a2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a();
        am.jw jwVar2 = c6082xbd84dd0a2.f136360g;
        jwVar2.getClass();
        jwVar2.f88635a = true;
        jwVar2.f88636b = this.f248887e;
        c6082xbd84dd0a2.e();
        boolean W6 = W6(this.f248887e, 5L);
        java.lang.String str2 = this.f248887e;
        int i17 = W6 ? 2 : 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateTagIdList", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        if (i17 == 1) {
            this.f248890h = true;
            this.f248891i = false;
        } else {
            this.f248890h = false;
            this.f248891i = false;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.e3(i17, 5L, "", linkedList.size(), linkedList, this.f248893n);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(e3Var);
        this.f248886d = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.jfx), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fo(this, e3Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateTagIdList", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPermissionUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " " + m1Var.mo808xfb85f7b0());
        if (m1Var.mo808xfb85f7b0() == 291) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f248886d;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f248886d = null;
            }
            X6();
            if (this.f248890h) {
                this.f248891i = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
    }
}
