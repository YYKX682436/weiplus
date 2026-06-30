package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class h2 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f250008g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f250009h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f250010i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f250011j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f250012k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f250013l;

    /* renamed from: m, reason: collision with root package name */
    public int f250014m;

    /* renamed from: n, reason: collision with root package name */
    public int f250015n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f250016o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f250017p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f250018q;

    /* renamed from: r, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f250019r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f250014m = 1;
        this.f250018q = new java.util.HashMap();
    }

    public static final /* synthetic */ java.lang.String o(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h2 h2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getPath$p", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        java.lang.String str = h2Var.f250008g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getPath$p", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public android.view.View b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        android.view.View inflate = android.view.LayoutInflater.from(this.f251490c).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ct_, (android.view.ViewGroup) null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hjz);
        imageView.setBackground(null);
        imageView.setPadding(0, 0, 0, 0);
        java.lang.String str = this.f250008g;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            throw null;
        }
        imageView.setTag(str);
        java.util.HashMap hashMap = this.f250018q;
        java.lang.String str2 = this.f250008g;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            throw null;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) hashMap.get(str2);
        if (ca4.z0.f(bitmap)) {
            imageView.setImageBitmap(bitmap);
        } else {
            p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            this.f250019r = p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.f2(this, imageView, null), 2, null);
        }
        inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g2(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, java.lang.String str2, int i27, int i28) {
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("commit", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f251490c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7 y7Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7(1, abstractActivityC21394xb3d2c0cf);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.lang.String str3 = this.f250008g;
        if (str3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            throw null;
        }
        ca4.w0 w0Var = new ca4.w0(str3, 2);
        w0Var.f121570e = 2;
        w0Var.f121569d = i17;
        w0Var.f121568c = i18;
        if (iVar != null) {
            w0Var.f121575j = iVar.f398225d;
            w0Var.f121576k = iVar.f398226e;
        }
        w0Var.f121577l = str;
        w0Var.f121580o = false;
        linkedList2.add(w0Var);
        if (iVar != null) {
            y7Var.U(iVar.f398225d, iVar.f398226e);
        }
        if (i19 > q94.a.f442461a) {
            y7Var.u(1, 3);
        }
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        if (list != null) {
            ((yb0.e) ((zb0.z) i95.n0.c(zb0.z.class))).getClass();
            java.util.List b17 = k35.c.b();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str4 = (java.lang.String) it.next();
                if (!((java.util.ArrayList) b17).contains(str4)) {
                    r45.jb6 jb6Var = new r45.jb6();
                    jb6Var.f459223d = str4;
                    linkedList3.add(jb6Var);
                }
            }
        }
        y7Var.t(str);
        y7Var.x(linkedList);
        y7Var.A(ed4Var);
        y7Var.W(linkedList3);
        y7Var.G(i17);
        y7Var.S(i18);
        if (z17) {
            y7Var.z(1);
        } else {
            y7Var.z(0);
        }
        m(y7Var);
        java.lang.String str5 = this.f250010i;
        if (str5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appId");
            throw null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            java.lang.String str6 = this.f250010i;
            if (str6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appId");
                throw null;
            }
            y7Var.J(str6);
        }
        java.lang.String str7 = this.f250011j;
        if (str7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appName");
            throw null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
            java.lang.String str8 = this.f250011j;
            if (str8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appName");
                throw null;
            }
            y7Var.I(str8);
        }
        y7Var.N(this.f250015n);
        if (this.f250016o && (c11286x34a5504 = this.f250017p) != null) {
            y7Var.R(c11286x34a5504 != null ? c11286x34a5504.f33123xa4d390c1 : null);
        }
        y7Var.O(null, null, null, i27, i28);
        int i29 = this.f250014m;
        java.lang.String str9 = this.f250013l;
        if (str9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sdkPackageName");
            throw null;
        }
        y7Var.E(i29, str9);
        y7Var.y(list2);
        java.lang.String str10 = this.f250012k;
        if (str10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            throw null;
        }
        y7Var.K(str10);
        java.lang.String str11 = this.f250009h;
        if (str11 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("excerptUrl");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addPicExcerptUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadPackHelper", "[addPicExcerptUrl] url = " + str11);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str11)) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = y7Var.f246314f;
            c19807x593d1720.f39037x819f4fc6 = str11;
            c19807x593d1720.f39026x8eaeecf7 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addPicExcerptUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        y7Var.V(linkedList2);
        int i37 = y7Var.i();
        android.content.Intent intent = new android.content.Intent();
        ta4.v.f498379a.f498380a = i37;
        intent.putExtra("sns_local_id", i37);
        abstractActivityC21394xb3d2c0cf.setResult(-1, intent);
        abstractActivityC21394xb3d2c0cf.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("commit", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleronDestroy", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        super.e();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f250019r;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        java.util.HashMap hashMap = this.f250018q;
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) hashMap.get((java.lang.String) it.next());
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        hashMap.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleronDestroy", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableNext", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNext", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beforeCommit", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        java.lang.String str = this.f250008g;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkMediaFile", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.vfs.w6.j(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMediaFile", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        if (!z17) {
            db5.e1.i(this.f251490c, com.p314xaae8f345.mm.R.C30867xcad56011.f574791jh0, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beforeCommit", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        super.i(bundle);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f251490c;
        this.f250008g = java.lang.String.valueOf(abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("sns_kemdia_path"));
        this.f250009h = java.lang.String.valueOf(abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("sns_exceprt_url"));
        java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_appid");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f250010i = stringExtra;
        java.lang.String stringExtra2 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_appname");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f250011j = stringExtra2;
        this.f250016o = abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("KSnsAction", false);
        this.f250015n = abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("Ksnsupload_source", 0);
        java.lang.String stringExtra3 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("reportSessionId");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f250012k = stringExtra3;
        android.os.Bundle bundleExtra = abstractActivityC21394xb3d2c0cf.getIntent().getBundleExtra("Ksnsupload_timeline");
        if (bundleExtra != null) {
            this.f250017p = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req(bundleExtra).f33049x38eb0007;
        }
        this.f250014m = abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true) ? 1 : 0;
        java.lang.String stringExtra4 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("SendAppMessageWrapper_PkgName");
        this.f250013l = stringExtra4 != null ? stringExtra4 : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("needAutoDraft", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needAutoDraft", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    /* renamed from: onActivityResult */
    public boolean mo70827x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        return true;
    }
}
