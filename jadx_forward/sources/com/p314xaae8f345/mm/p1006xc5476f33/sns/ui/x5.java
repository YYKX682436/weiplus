package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class x5 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f253014g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f253015h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f253016i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f253017j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f253018k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f253019l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f253020m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f253021n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f253022o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9 f253023p;

    /* renamed from: q, reason: collision with root package name */
    public m21.p f253024q;

    static {
        yo0.f fVar = new yo0.f();
        fVar.f545611b = true;
        fVar.f545610a = true;
        fVar.a();
    }

    public x5(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        super(abstractActivityC21394xb3d2c0cf);
        this.f253014g = "";
        this.f253020m = null;
        this.f253021n = null;
        this.f253022o = null;
        this.f253023p = null;
        this.f253024q = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public android.view.View b() {
        r45.ek4 ek4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f251490c;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cro, (android.view.ViewGroup) null);
        this.f253020m = inflate;
        this.f253021n = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n8n);
        this.f253022o = (android.widget.ImageView) this.f253020m.findViewById(com.p314xaae8f345.mm.R.id.n8m);
        this.f253023p = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9) this.f253020m.findViewById(com.p314xaae8f345.mm.R.id.n8k);
        m21.p pVar = this.f253024q;
        if (pVar != null && (ek4Var = pVar.f404530a) != null) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(ek4Var.m75941xfb821914(6))) {
                r45.dk4 dk4Var = (r45.dk4) ek4Var.m75941xfb821914(6).get(0);
                android.util.Pair k17 = m21.y.k((int) dk4Var.m75938x746dc8a6(2), (int) dk4Var.m75938x746dc8a6(3), abstractActivityC21394xb3d2c0cf, false);
                this.f253020m.setLayoutParams(new android.view.ViewGroup.LayoutParams(((java.lang.Integer) k17.first).intValue(), ((java.lang.Integer) k17.second).intValue()));
                this.f253020m.requestLayout();
                if (android.text.TextUtils.isEmpty(dk4Var.m75945x2fec8307(4))) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l.f542035a.h(dk4Var.m75945x2fec8307(1), this.f253021n, mn2.f1.B);
                } else {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l.f542035a.h(dk4Var.m75945x2fec8307(4), this.f253021n, mn2.f1.B);
                }
            }
            this.f253022o.setVisibility(0);
            this.f253023p.setVisibility(8);
            this.f253020m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.w5(this));
        }
        android.view.View view = this.f253020m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return view;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, java.lang.String str2, int i27, int i28) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("commit", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f251490c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7 y7Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7(36, abstractActivityC21394xb3d2c0cf);
        m21.p pVar = this.f253024q;
        if (pVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMegaVideoShareObject", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            y7Var.f246314f.f39014x86965dde.f451382t = pVar.f404530a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMegaVideoShareObject", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        }
        c19767x257d7f.f38864x6ac9171 = y7Var.l();
        if (i19 > q94.a.f442461a) {
            y7Var.u(1, 4);
        }
        y7Var.C(this.f253014g);
        y7Var.t(str);
        java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("ksnsupload_link_desc");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        y7Var.B(stringExtra);
        y7Var.x(linkedList);
        y7Var.G(i17);
        if (z17) {
            y7Var.z(1);
        } else {
            y7Var.z(0);
        }
        y7Var.y(list2);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (list != null) {
            new java.util.LinkedList();
            ((yb0.e) ((zb0.z) i95.n0.c(zb0.z.class))).getClass();
            java.util.List b17 = k35.c.b();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                if (!((java.util.ArrayList) b17).contains(str3)) {
                    r45.jb6 jb6Var = new r45.jb6();
                    jb6Var.f459223d = str3;
                    linkedList2.add(jb6Var);
                }
            }
        }
        if (iVar != null) {
            y7Var.U(iVar.f398225d, iVar.f398226e);
        }
        y7Var.W(linkedList2);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f253015h)) {
            y7Var.J(this.f253015h);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f253016i)) {
            java.lang.String str4 = this.f253016i;
            y7Var.I(str4 != null ? str4 : "");
        }
        y7Var.A(ed4Var);
        y7Var.s(str2);
        y7Var.H(this.f253017j);
        y7Var.K(this.f253018k);
        m(y7Var);
        int i29 = y7Var.i();
        if (this.f253019l) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.P = i29;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().d();
        abstractActivityC21394xb3d2c0cf.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("commit", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        super.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableNext", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        boolean z17 = this.f253024q != null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNext", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beforeCommit", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beforeCommit", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        java.util.Map d17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        super.i(bundle);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f251490c;
        java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_title");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f253014g = stringExtra;
        java.lang.String stringExtra2 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("KPublisherId");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f253017j = stringExtra2;
        java.lang.String stringExtra3 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("reportSessionId");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f253018k = stringExtra3;
        java.lang.String stringExtra4 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_appid");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f253015h = stringExtra4;
        java.lang.String stringExtra5 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_appname");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.f253016i = stringExtra5;
        this.f253019l = abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("ksnsupload_finder_need_report", false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.Q = abstractActivityC21394xb3d2c0cf.getIntent().getLongExtra("finder_feed_id", 0L);
        java.lang.String stringExtra6 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("ksnsupload_mega_video_object_xml");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra6) && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(stringExtra6, "finderMegaVideo", null)) != null) {
            m21.p pVar = new m21.p();
            this.f253024q = pVar;
            pVar.b("", d17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    /* renamed from: onActivityResult */
    public boolean mo70827x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return false;
    }
}
