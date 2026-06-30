package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI */
/* loaded from: classes9.dex */
public class ActivityC12979xbcc07f40 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f175538o = 0;

    /* renamed from: d, reason: collision with root package name */
    public or1.j1 f175539d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f175540e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 f175541f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f175542g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f175543h;

    /* renamed from: m, reason: collision with root package name */
    public long f175545m;

    /* renamed from: i, reason: collision with root package name */
    public boolean f175544i = false;

    /* renamed from: n, reason: collision with root package name */
    public long f175546n = 0;

    public final void T6(java.util.List list) {
        java.util.List<r45.d67> list2 = list;
        if (list == null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.d67 d67Var = new r45.d67();
            d67Var.f453718d = 1;
            d67Var.f453719e = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572657c13);
            d67Var.f453720f = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyw) + "/node/wework/images/icon_im.48490d44c5.png";
            linkedList.add(d67Var);
            list2 = linkedList;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (r45.d67 d67Var2 : list2) {
            if (d67Var2.f453718d != 2) {
                or1.n0 n0Var = new or1.n0();
                n0Var.f453210e = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                n0Var.f453211f = new qk.o();
                n0Var.f429074g = true;
                n0Var.f429075h = d67Var2;
                arrayList.add(n0Var);
            }
        }
        this.f175541f.m54314x88574db3(arrayList);
        this.f175541f.i();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        this.f175546n = java.lang.System.currentTimeMillis() / 1000;
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570276a94;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.util.LinkedList linkedList;
        qk.o b17;
        mo54450xbf7c1df6(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f175540e, true).f2());
        mo54448x9c8c0d33(new or1.d0(this));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f175540e) && (b17 = r01.z.b(this.f175540e)) != null && b17.I0()) {
            or1.j1 j1Var = this.f175539d;
            j1Var.getClass();
            m78478x84f07bce(1, com.p314xaae8f345.mm.R.C30867xcad56011.f571350cl, com.p314xaae8f345.mm.R.raw.f78351x6c69febc, new or1.i1(j1Var));
        }
        this.f175542g = findViewById(com.p314xaae8f345.mm.R.id.f565767dh3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 c12980x8e9ea871 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871) findViewById(com.p314xaae8f345.mm.R.id.f565765dh1);
        this.f175541f = c12980x8e9ea871;
        c12980x8e9ea871.m54313x16db6000(this.f175540e);
        this.f175541f.m54312x542a48d3(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 c12980x8e9ea8712 = this.f175541f;
        c12980x8e9ea8712.getClass();
        c12980x8e9ea8712.m79360xa1aeda28(new or1.j0(c12980x8e9ea8712));
        if (c12980x8e9ea8712.m79354xfb82a219() == 0) {
            c12980x8e9ea8712.m79361x1c3e70c(new or1.k0(c12980x8e9ea8712));
        }
        this.f175541f.m54311xee5033df(new or1.e0(this));
        try {
            r01.m y07 = r01.q3.bj().y0(this.f175540e);
            r45.ik ikVar = new r45.ik();
            ikVar.mo11468x92b714fd(y07.f66039x3c18ecc6);
            linkedList = ikVar.f458635d;
        } catch (java.lang.Throwable unused) {
            linkedList = null;
        }
        T6(linkedList);
        r01.q3.bj().b1(this.f175540e, new or1.h0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        or1.j1 j1Var = this.f175539d;
        if (j1Var != null) {
            j1Var.a(i17, i18, intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("enterprise_biz_name");
        this.f175540e = stringExtra;
        this.f175539d = new or1.j1(this, stringExtra);
        this.f175545m = java.lang.System.currentTimeMillis() / 1000;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f175543h;
        if (n3Var == null) {
            this.f175543h = new or1.f0(this);
        } else {
            n3Var.mo50303x856b99f0(1);
        }
        this.f175543h.mo50307xb9e94560(1, 500L);
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.EnterpriseBizContactListUI)).Rj(this, iy1.a.EnterpriseBiz);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (this.f175541f != null) {
            ((java.util.ArrayList) r01.q3.pj().f449808a).clear();
        }
        long j17 = this.f175545m;
        if (j17 > 0) {
            long j18 = this.f175546n;
            if (j18 > 0) {
                long j19 = j18 - j17;
                r01.m y07 = r01.q3.bj().y0(this.f175540e);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13465, "", java.lang.Integer.valueOf(y07 != null ? y07.f66038x29b98d8d : 0), 0, java.lang.Integer.valueOf(y07 != null ? y07.f66045x6bcd764a : 0), 2, java.lang.Long.valueOf(j19));
            }
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!c01.e2.J(this.f175540e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.EnterpriseBizContactListUI", "%s !isContact", this.f175540e);
            finish();
            return;
        }
        mo43517x10010bd5();
        if (this.f175544i) {
            return;
        }
        int intExtra = getIntent().getIntExtra("enterprise_from_scene", 5);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 c12980x8e9ea871 = this.f175541f;
        int m54310xab916345 = c12980x8e9ea871 != null ? c12980x8e9ea871.m54310xab916345() : -1;
        r01.m y07 = r01.q3.bj().y0(this.f175540e);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12892, this.f175540e, java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(m54310xab916345), "", 0, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(y07 != null ? y07.f66038x29b98d8d : 0), java.lang.Long.valueOf(y07 != null ? y07.f66046x771ad30a : 0L), java.lang.Long.valueOf(y07 != null ? y07.f66050x2a8d0441 : 0L));
        this.f175544i = true;
    }
}
