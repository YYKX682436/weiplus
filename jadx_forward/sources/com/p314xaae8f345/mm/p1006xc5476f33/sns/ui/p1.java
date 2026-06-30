package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class p1 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b5 {
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf J0;
    public final int K0;
    public final r45.hh4 L0;
    public final r45.jj4 M0;
    public final android.view.View N0;
    public java.lang.String O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.J0 = context;
        this.K0 = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48866x28b7342c;
        this.L0 = new r45.hh4();
        this.M0 = new r45.jj4();
        this.N0 = md4.e.f407410a.b(context);
        this.O0 = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b5, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public android.view.View b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913(this.J0, null).m75396xca029dad(this.f249382i);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o1 o1Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o1(this);
        android.view.View view = this.N0;
        view.setOnClickListener(o1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        return view;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b5, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beforeCommit", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        if (((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(this.f249382i) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LinkWidget", "block for non thumb bitmap");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beforeCommit", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
            return false;
        }
        n11.a b17 = n11.a.b();
        md4.e eVar = md4.e.f407410a;
        java.lang.String Url = this.M0.f459391g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url, "Url");
        android.graphics.Bitmap e17 = b17.e(eVar.c(Url));
        if (e17 == null || e17.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LinkWidget", "block for non cover bitmap");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beforeCommit", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
            return false;
        }
        super.h();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beforeCommit", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b5, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        super.i(bundle);
        android.content.Intent intent = this.J0.getIntent();
        java.lang.String stringExtra = intent.getStringExtra("ksnsupload_bizstyle_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.O0 = stringExtra;
        java.lang.String stringExtra2 = intent.getStringExtra("ksnsupload_bizstyle_cover_url");
        java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
        r45.jj4 jj4Var = this.M0;
        jj4Var.f459391g = str;
        r45.lj4 lj4Var = new r45.lj4();
        lj4Var.f461053d = intent.getIntExtra("ksnsupload_bizstyle_cover_width", 0);
        lj4Var.f461054e = intent.getIntExtra("ksnsupload_bizstyle_cover_height", 0);
        jj4Var.f459398p = lj4Var;
        int intExtra = intent.getIntExtra("ksnsupload_bizstyle_pic_count", 0);
        r45.hh4 hh4Var = this.L0;
        hh4Var.f457682d = 8;
        hh4Var.f457693r = intExtra;
        java.lang.String stringExtra3 = intent.getStringExtra("Ksnsupload_title");
        md4.e eVar = md4.e.f407410a;
        android.view.View view = this.N0;
        java.lang.String Url = jj4Var.f459391g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url, "Url");
        eVar.e(view, Url, lj4Var.f461053d, lj4Var.f461054e, this.O0, stringExtra3, intExtra);
        c01.l2 c17 = c01.n2.d().c(this.N, true);
        if (((java.util.concurrent.ConcurrentHashMap) c17.f118838a).isEmpty()) {
            c17.i("_DATA_CENTER_ITEM_SHOW_TYPE", 8);
            c17.i("_DATA_CENTER_BIZ_PIC_COUNT", java.lang.Integer.valueOf(intExtra));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b5
    public void o(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7 y7Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("subCommit", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        super.o(y7Var, z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ni());
        r45.jj4 jj4Var = this.M0;
        java.lang.String Url = jj4Var.f459391g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url, "Url");
        byte[] bytes = Url.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        java.lang.String sb7 = sb6.toString();
        n11.a b17 = n11.a.b();
        md4.e eVar = md4.e.f407410a;
        java.lang.String Url2 = jj4Var.f459391g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url2, "Url");
        android.graphics.Bitmap e17 = b17.e(eVar.c(Url2));
        float width = e17.getWidth();
        int i17 = this.K0;
        float min = java.lang.Math.min(width / i17, e17.getHeight() / i17);
        if (min > 1.01d) {
            android.graphics.Bitmap F0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.F0(e17, e17.getWidth() / min, e17.getHeight() / min, false);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(F0, 70, android.graphics.Bitmap.CompressFormat.JPEG, sb7, !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(F0, e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LinkWidget", "save bitmap1 width:" + F0.getWidth() + " height:" + F0.getHeight());
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(e17, 70, android.graphics.Bitmap.CompressFormat.JPEG, sb7, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LinkWidget", "save bitmap2 width:" + e17.getWidth() + " height:" + e17.getHeight());
        }
        if (y7Var != null) {
            y7Var.a(sb7, "");
        }
        if (!z17 && y7Var != null) {
            java.lang.String str = this.O0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPublishUserName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            y7Var.f246314f.f39033x11f29a7f = str != null ? str : "";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPublishUserName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        }
        if (y7Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setReaderShare", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            y7Var.f246314f.f39014x86965dde.f451376n = this.L0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setReaderShare", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("subCommit", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
    }
}
