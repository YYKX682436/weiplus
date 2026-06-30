package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class r5 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f251909g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f251910h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f251911i;

    /* renamed from: j, reason: collision with root package name */
    public int f251912j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f251913k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f251914l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f251915m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f251916n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f251917o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f251918p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f251919q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f251920r;

    /* renamed from: s, reason: collision with root package name */
    public r45.ee f251921s;

    /* renamed from: t, reason: collision with root package name */
    public final int f251922t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f251923u;

    public r5(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        super(abstractActivityC21394xb3d2c0cf);
        this.f251909g = "";
        this.f251918p = null;
        this.f251919q = null;
        this.f251920r = null;
        this.f251921s = null;
        this.f251922t = 1;
        this.f251923u = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public android.view.View b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f251490c;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d2w, (android.view.ViewGroup) null);
        this.f251918p = inflate;
        inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q5(this));
        this.f251919q = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) this.f251918p.findViewById(com.p314xaae8f345.mm.R.id.h9t);
        this.f251920r = (android.widget.TextView) this.f251918p.findViewById(com.p314xaae8f345.mm.R.id.odj);
        android.widget.ImageView imageView = (android.widget.ImageView) this.f251918p.findViewById(com.p314xaae8f345.mm.R.id.nh7);
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.raw.f80346xe0fea6fa, -1));
        imageView.setVisibility(0);
        this.f251919q.setVisibility(0);
        r45.ee eeVar = this.f251921s;
        if (eeVar != null) {
            this.f251919q.m75396xca029dad(eeVar.f454876h);
            this.f251920r.setText(this.f251921s.f454875g);
        }
        ca4.z0.A0(this.f251919q, abstractActivityC21394xb3d2c0cf);
        android.view.View view = this.f251918p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return view;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, java.lang.String str2, int i27, int i28) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("commit", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f251490c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7 y7Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7(33, abstractActivityC21394xb3d2c0cf);
        c19767x257d7f.f38864x6ac9171 = y7Var.l();
        if (i19 > q94.a.f442461a) {
            y7Var.u(1, 4);
        }
        y7Var.C(this.f251909g);
        y7Var.t(str);
        java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("ksnsupload_link_desc");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        y7Var.B(stringExtra);
        r45.ee eeVar = this.f251921s;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = y7Var.f246314f;
        if (eeVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShareMPVideo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            c19807x593d1720.f39014x86965dde.f451379q = eeVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShareMPVideo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        }
        y7Var.E(this.f251922t, this.f251923u);
        y7Var.N(this.f251912j);
        y7Var.Q(this.f251910h);
        y7Var.P(this.f251911i);
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
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f251915m)) {
            y7Var.J(this.f251915m);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f251916n)) {
            java.lang.String str4 = this.f251916n;
            y7Var.I(str4 != null ? str4 : "");
        }
        y7Var.A(ed4Var);
        y7Var.s(str2);
        y7Var.H(this.f251913k);
        y7Var.K(this.f251914l);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContentattr", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        c19807x593d1720.f39024xe8d429ea = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContentattr", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        m(y7Var);
        y7Var.i();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().d();
        abstractActivityC21394xb3d2c0cf.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("commit", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        super.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableNext", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNext", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beforeCommit", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beforeCommit", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        java.util.Map d17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        super.i(bundle);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f251490c;
        java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_appid");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f251915m = stringExtra;
        java.lang.String stringExtra2 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_appname");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f251916n = stringExtra2;
        this.f251912j = abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("Ksnsupload_source", 0);
        java.lang.String stringExtra3 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("src_username");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f251910h = stringExtra3;
        java.lang.String stringExtra4 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("src_displayname");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f251911i = stringExtra4;
        java.lang.String stringExtra5 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("KPublisherId");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.f251913k = stringExtra5;
        java.lang.String stringExtra6 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("reportSessionId");
        if (stringExtra6 == null) {
            stringExtra6 = "";
        }
        this.f251914l = stringExtra6;
        java.lang.String stringExtra7 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("ksnsupload_mp_video_xml");
        if (stringExtra7 == null) {
            stringExtra7 = "";
        }
        this.f251917o = stringExtra7;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra7) && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(this.f251917o, "mmbrandmpvideo", null)) != null) {
            this.f251921s = m21.q.c("", d17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    /* renamed from: onActivityResult */
    public boolean mo70827x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return false;
    }
}
