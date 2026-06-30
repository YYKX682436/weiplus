package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class fw extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f249896g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f249897h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f249898i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f249899j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f249900k;

    /* renamed from: l, reason: collision with root package name */
    public m21.w f249901l;

    /* renamed from: m, reason: collision with root package name */
    public int f249902m;

    /* renamed from: n, reason: collision with root package name */
    public int f249903n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f249904o;

    public fw(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        super(abstractActivityC21394xb3d2c0cf);
        this.f249896g = "";
        this.f249897h = "";
        this.f249898i = false;
        this.f249899j = false;
        this.f249900k = null;
        this.f249901l = null;
        this.f249903n = 1;
        this.f249904o = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public android.view.View b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.TextWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, java.lang.String str2, int i27, int i28) {
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("commit", "com.tencent.mm.plugin.sns.ui.TextWidget");
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a55042 = this.f249900k;
        if (c11286x34a55042 != null) {
            c11286x34a55042.f33121x993583fc = str;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject iMediaObject = c11286x34a55042.f33122xe4128443;
            if (iMediaObject != null && (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11296xa95b008d)) {
                ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11296xa95b008d) iMediaObject).f33229x36452d = str;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7 s17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().s(this.f249900k, str, this.f249896g, this.f249897h);
        if (s17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextWidget", "packHelper == null, %s, %s", this.f249896g, this.f249897h);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("commit", "com.tencent.mm.plugin.sns.ui.TextWidget");
            return false;
        }
        c19767x257d7f.f38864x6ac9171 = s17.l();
        if (i19 > q94.a.f442461a) {
            s17.u(1, 4);
        }
        s17.N(this.f249902m);
        if (this.f249898i) {
            s17.N(5);
        }
        s17.x(linkedList);
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
        s17.W(linkedList2);
        if (iVar != null) {
            s17.U(iVar.f398225d, iVar.f398226e);
        }
        s17.A(ed4Var);
        if (z17) {
            s17.z(1);
        } else {
            s17.z(0);
        }
        s17.y(list2);
        s17.G(i17);
        s17.O(null, null, null, i27, i28);
        s17.E(this.f249903n, this.f249904o);
        if (this.f249899j && (c11286x34a5504 = this.f249900k) != null) {
            s17.R(c11286x34a5504.f33123xa4d390c1);
            java.lang.String str4 = this.f249896g;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a55043 = this.f249900k;
            s17.T(str4, c11286x34a55043.f33125x9b39409a, c11286x34a55043.f33124x838b091d);
        }
        m(s17);
        int i29 = s17.i();
        m21.w wVar = this.f249901l;
        if (wVar != null) {
            wVar.a(i29);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.x0.f246531b.b(this.f249901l);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().d();
        this.f251490c.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("commit", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleronDestroy", "com.tencent.mm.plugin.sns.ui.TextWidget");
        super.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleronDestroy", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableNext", "com.tencent.mm.plugin.sns.ui.TextWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNext", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.TextWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.TextWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beforeCommit", "com.tencent.mm.plugin.sns.ui.TextWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beforeCommit", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.TextWidget");
        super.i(bundle);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f251490c;
        this.f249901l = m21.w.f(abstractActivityC21394xb3d2c0cf.getIntent());
        abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Kdescription");
        java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_appid");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f249896g = stringExtra;
        java.lang.String stringExtra2 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_appname");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f249897h = stringExtra2;
        this.f249898i = abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("KThrid_app", false);
        this.f249899j = abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("KSnsAction", false);
        this.f249902m = abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("Ksnsupload_source", 0);
        this.f249900k = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req(abstractActivityC21394xb3d2c0cf.getIntent().getBundleExtra("Ksnsupload_timeline")).f33049x38eb0007;
        if (abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f249903n = 1;
        } else {
            this.f249903n = 0;
        }
        java.lang.String stringExtra3 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("SendAppMessageWrapper_PkgName");
        this.f249904o = stringExtra3 != null ? stringExtra3 : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.TextWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("needAutoDraft", "com.tencent.mm.plugin.sns.ui.TextWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needAutoDraft", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    /* renamed from: onActivityResult */
    public boolean mo70827x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.TextWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return false;
    }
}
