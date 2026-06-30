package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class b6 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public m21.v f249418g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.o50 f249419h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f249420i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f249421j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f249422k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f249423l;

    /* renamed from: m, reason: collision with root package name */
    public m21.w f249424m;

    /* renamed from: n, reason: collision with root package name */
    public int f249425n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f249421j = "";
        this.f249422k = "";
    }

    public static final void o(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b6 b6Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$updateThumbData", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        b6Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateThumbData", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        if (!(str == null || str.length() == 0) && com.p314xaae8f345.mm.vfs.w6.j(str)) {
            b6Var.f249423l = com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateThumbData", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$updateThumbData", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public android.view.View b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f251490c).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d2z, (android.view.ViewGroup) null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18736x613b2f1 c18736x613b2f1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18736x613b2f1) inflate.findViewById(com.p314xaae8f345.mm.R.id.o9e);
        if (c18736x613b2f1 != null) {
            c18736x613b2f1.m72281xefe20a96(c18736x613b2f1.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
            android.content.Context context = c18736x613b2f1.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            c18736x613b2f1.b(il4.d.c(context, this.f249419h, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, java.lang.String str2, int i27, int i28) {
        java.lang.String str3;
        java.lang.String str4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("commit", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        if (this.f249423l != null) {
            p(str, linkedList, iVar, ed4Var, z17, list2, i17, i27, i28, c19767x257d7f, i19, list);
            str4 = "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget";
            str3 = "commit";
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicTingCategoryWidget", "commit thumbData null and try to download, coverUrl: %s", this.f249420i);
            ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
            java.lang.String str5 = this.f249420i;
            if (str5 == null) {
                str5 = "";
            }
            str3 = "commit";
            str4 = "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget";
            ((dl4.m0) tVar).Bi(str5, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z5(this, str, linkedList, iVar, ed4Var, z17, list2, i17, i27, i28, c19767x257d7f, i19, list));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().d();
        this.f251490c.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str4);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        super.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableNext", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNext", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beforeCommit", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beforeCommit", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        super.i(bundle);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f251490c;
        java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_ting_album_share_object_xml");
        boolean z17 = true;
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(stringExtra, "tingCategoryItem", null);
            if (d17 != null) {
                m21.v vVar = new m21.v();
                r45.km6 Zi = ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).Zi("", d17);
                vVar.f404534a = Zi;
                this.f249418g = vVar;
                bw5.o50 v17 = il4.d.v(Zi.f460372e);
                this.f249419h = v17;
                this.f249420i = il4.d.k(v17);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shareTingCategory tingAlbumXml: ");
                sb6.append(stringExtra);
                sb6.append(", tingCategoryItem.type: ");
                bw5.o50 o50Var = this.f249419h;
                sb6.append(o50Var != null ? java.lang.Integer.valueOf(o50Var.f112497n) : null);
                sb6.append(", tingCategoryItem.category_id: ");
                bw5.o50 o50Var2 = this.f249419h;
                sb6.append(o50Var2 != null ? o50Var2.c() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicTingCategoryWidget", sb6.toString());
            }
        }
        this.f249424m = m21.w.f(abstractActivityC21394xb3d2c0cf.getIntent());
        this.f249425n = abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("Ksnsupload_source", 0);
        java.lang.String stringExtra2 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_title");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f249422k = stringExtra2;
        java.lang.String stringExtra3 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_link");
        this.f249421j = stringExtra3 != null ? stringExtra3 : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initThumbData", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        java.lang.String str = this.f249420i;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Bi(this.f249420i, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.a6(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initThumbData", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    /* renamed from: onActivityResult */
    public boolean mo70827x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        return false;
    }

    public final void p(java.lang.String str, java.util.LinkedList linkedList, l56.i iVar, r45.ed4 ed4Var, boolean z17, java.util.List list, int i17, int i18, int i19, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, int i27, java.util.List list2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doCommit", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7 y7Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7(48, this.f251490c);
        m21.v vVar = this.f249418g;
        if (vVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShareTingAlbum", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            y7Var.f246314f.f39014x86965dde.A = vVar.f404534a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShareTingAlbum", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        }
        y7Var.C(this.f249422k);
        y7Var.B(this.f249421j);
        y7Var.D(this.f249421j);
        y7Var.t(str);
        byte[] bArr = this.f249423l;
        if (bArr != null) {
            y7Var.c(bArr, "", "");
        }
        y7Var.N(this.f249425n);
        y7Var.x(linkedList);
        if (iVar != null) {
            y7Var.U(iVar.f398225d, iVar.f398226e);
        }
        y7Var.A(ed4Var);
        y7Var.z(z17 ? 1 : 0);
        y7Var.y(list);
        y7Var.G(i17);
        y7Var.O(null, null, null, i18, i19);
        if (c19767x257d7f != null) {
            c19767x257d7f.f38864x6ac9171 = y7Var.l();
        }
        if (i27 > q94.a.f442461a) {
            y7Var.u(1, 4);
        }
        if (list2 != null) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            ((yb0.e) ((zb0.z) i95.n0.c(zb0.z.class))).getClass();
            java.util.List b17 = k35.c.b();
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (!((java.util.ArrayList) b17).contains(str2)) {
                    r45.jb6 jb6Var = new r45.jb6();
                    jb6Var.f459223d = str2;
                    linkedList2.add(jb6Var);
                }
            }
            y7Var.W(linkedList2);
        }
        m(y7Var);
        int i28 = y7Var.i();
        m21.w wVar = this.f249424m;
        if (wVar != null) {
            wVar.a(i28);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.x0.f246531b.b(wVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doCommit", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
    }
}
