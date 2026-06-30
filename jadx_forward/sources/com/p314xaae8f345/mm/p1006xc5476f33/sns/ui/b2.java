package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class b2 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f249331g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f249332h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f249333i;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.Bitmap f249334j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f249335k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f249336l;

    /* renamed from: m, reason: collision with root package name */
    public int f249337m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f249338n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f249339o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f249340p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f249341q;

    /* renamed from: r, reason: collision with root package name */
    public int f249342r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f249343s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f249344t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f249345u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f249346v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f249347w;

    /* renamed from: x, reason: collision with root package name */
    public m21.w f249348x;

    /* renamed from: y, reason: collision with root package name */
    public int f249349y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f249350z;

    public b2(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        super(abstractActivityC21394xb3d2c0cf);
        this.f249331g = "";
        this.f249332h = "";
        this.f249333i = "";
        this.f249334j = null;
        this.f249338n = null;
        this.f249339o = null;
        this.f249340p = null;
        this.f249341q = false;
        this.f249343s = "";
        this.f249344t = "";
        this.f249345u = "";
        this.f249346v = "";
        this.f249347w = "";
        this.f249348x = null;
        this.f249349y = 1;
        this.f249350z = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public android.view.View b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.EmojiListShareWidget");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f251490c;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d2w, (android.view.ViewGroup) null);
        this.f249338n = inflate;
        this.f249339o = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) inflate.findViewById(com.p314xaae8f345.mm.R.id.h9t);
        this.f249340p = (android.widget.TextView) this.f249338n.findViewById(com.p314xaae8f345.mm.R.id.odj);
        if (this.f249341q) {
            android.view.View findViewById = this.f249338n.findViewById(com.p314xaae8f345.mm.R.id.nh7);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/EmojiListShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/EmojiListShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById2 = this.f249338n.findViewById(com.p314xaae8f345.mm.R.id.nh7);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/EmojiListShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/ui/EmojiListShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f249340p.setText(this.f249332h);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f249333i)) {
            this.f249339o.setVisibility(0);
            this.f249339o.m75396xca029dad(this.f249333i);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(null)) {
            this.f249339o.setVisibility(8);
        } else {
            this.f249339o.setVisibility(0);
            android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(null);
            this.f249334j = G;
            this.f249339o.setImageBitmap(G);
        }
        ca4.z0.A0(this.f249339o, abstractActivityC21394xb3d2c0cf);
        android.view.View view = this.f249338n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.EmojiListShareWidget");
        return view;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, java.lang.String str2, int i27, int i28) {
        boolean z18;
        k70.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("commit", "com.tencent.mm.plugin.sns.ui.EmojiListShareWidget");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f251490c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7 y7Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7(23, abstractActivityC21394xb3d2c0cf);
        c19767x257d7f.f38864x6ac9171 = y7Var.l();
        if (i19 > q94.a.f442461a) {
            y7Var.u(1, 2);
        }
        if (iVar != null) {
            y7Var.U(iVar.f398225d, iVar.f398226e);
        }
        y7Var.C(this.f249332h);
        y7Var.B(this.f249344t);
        y7Var.D(this.f249331g);
        y7Var.t(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f249347w)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f249333i) && (vVar = (k70.v) i95.n0.c(k70.v.class)) != null) {
                android.graphics.Bitmap Bi = ((j70.e) vVar).Bi(this.f249333i);
                if (Bi != null) {
                    z18 = y7Var.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.c(Bi), this.f249344t, this.f249332h, this.f249342r, this.f249343s);
                }
            }
            z18 = false;
        } else {
            z18 = y7Var.d(com.p314xaae8f345.mm.vfs.w6.N(this.f249347w, 0, -1), this.f249344t, this.f249332h, this.f249342r, this.f249343s);
        }
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmotionListShareWidget", "set userData user imgurl ");
            java.lang.String str3 = this.f249333i;
            y7Var.b(str3, str3, this.f249344t, this.f249342r, this.f249343s);
            z18 = true;
        }
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmotionListShareWidget", "set userData faild");
        }
        y7Var.E(this.f249349y, this.f249350z);
        y7Var.N(this.f249337m);
        y7Var.Q(this.f249335k);
        y7Var.P(this.f249336l);
        y7Var.x(linkedList);
        y7Var.G(i17);
        if (z17) {
            y7Var.z(1);
        } else {
            y7Var.z(0);
        }
        y7Var.y(list2);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f249346v)) {
            y7Var.J(this.f249346v);
            y7Var.I(this.f249345u);
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (list != null) {
            new java.util.LinkedList();
            ((yb0.e) ((zb0.z) i95.n0.c(zb0.z.class))).getClass();
            java.util.List b17 = k35.c.b();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str4 = (java.lang.String) it.next();
                if (!((java.util.ArrayList) b17).contains(str4)) {
                    r45.jb6 jb6Var = new r45.jb6();
                    jb6Var.f459223d = str4;
                    linkedList2.add(jb6Var);
                }
            }
        }
        y7Var.W(linkedList2);
        m(y7Var);
        y7Var.A(ed4Var);
        y7Var.O(null, null, null, i27, i28);
        int i29 = y7Var.i();
        m21.w wVar = this.f249348x;
        if (wVar != null) {
            wVar.a(i29);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.x0.f246531b.b(this.f249348x);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().d();
        abstractActivityC21394xb3d2c0cf.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("commit", "com.tencent.mm.plugin.sns.ui.EmojiListShareWidget");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleronDestroy", "com.tencent.mm.plugin.sns.ui.EmojiListShareWidget");
        super.e();
        android.graphics.Bitmap bitmap = this.f249334j;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f249334j.recycle();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleronDestroy", "com.tencent.mm.plugin.sns.ui.EmojiListShareWidget");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableNext", "com.tencent.mm.plugin.sns.ui.EmojiListShareWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNext", "com.tencent.mm.plugin.sns.ui.EmojiListShareWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.EmojiListShareWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.EmojiListShareWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beforeCommit", "com.tencent.mm.plugin.sns.ui.EmojiListShareWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beforeCommit", "com.tencent.mm.plugin.sns.ui.EmojiListShareWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.EmojiListShareWidget");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f251490c;
        this.f249348x = m21.w.f(abstractActivityC21394xb3d2c0cf.getIntent());
        abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("Ksnsupload_width", -1);
        abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("Ksnsupload_height", -1);
        this.f249337m = abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("Ksnsupload_source", 0);
        java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_link");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f249331g = stringExtra;
        java.lang.String stringExtra2 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_title");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f249332h = stringExtra2;
        java.lang.String stringExtra3 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_imgurl");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f249333i = stringExtra3;
        this.f249347w = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("KsnsUpload_imgPath");
        this.f249341q = abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("ksnsis_video", false);
        java.lang.String stringExtra4 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("src_username");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f249335k = stringExtra4;
        java.lang.String stringExtra5 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("src_displayname");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.f249336l = stringExtra5;
        java.lang.String stringExtra6 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("KContentObjDesc");
        if (stringExtra6 == null) {
            stringExtra6 = "";
        }
        this.f249344t = stringExtra6;
        java.lang.String stringExtra7 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("KUploadProduct_UserData");
        if (stringExtra7 == null) {
            stringExtra7 = "";
        }
        this.f249343s = stringExtra7;
        java.lang.String stringExtra8 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_appname");
        if (stringExtra8 == null) {
            stringExtra8 = "";
        }
        this.f249345u = stringExtra8;
        java.lang.String stringExtra9 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_appid");
        if (stringExtra9 == null) {
            stringExtra9 = "";
        }
        this.f249346v = stringExtra9;
        this.f249342r = abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("KUploadProduct_subType", 0);
        if (abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f249349y = 1;
        } else {
            this.f249349y = 0;
        }
        java.lang.String stringExtra10 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("SendAppMessageWrapper_PkgName");
        this.f249350z = stringExtra10 != null ? stringExtra10 : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.EmojiListShareWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("needAutoDraft", "com.tencent.mm.plugin.sns.ui.EmojiListShareWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needAutoDraft", "com.tencent.mm.plugin.sns.ui.EmojiListShareWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    /* renamed from: onActivityResult */
    public boolean mo70827x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.EmojiListShareWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.EmojiListShareWidget");
        return false;
    }
}
