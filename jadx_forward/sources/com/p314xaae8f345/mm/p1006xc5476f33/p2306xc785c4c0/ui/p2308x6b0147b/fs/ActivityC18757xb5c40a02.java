package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs;

/* renamed from: com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI */
/* loaded from: classes15.dex */
public class ActivityC18757xb5c40a02 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements fn4.b, pm4.s {
    public static long S;
    public static final /* synthetic */ int T = 0;
    public boolean A;
    public fn4.k0 F;
    public fn4.a1 G;
    public fn4.r0 H;
    public fn4.l1 I;

    /* renamed from: J, reason: collision with root package name */
    public fn4.z0 f256680J;
    public android.graphics.Point K;
    public int L;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 M;
    public boolean N;
    public in4.q P;
    public boolean Q;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f256681d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f256682e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f256683f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f256684g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageButton f256685h;

    /* renamed from: i, reason: collision with root package name */
    public r45.un6 f256686i;

    /* renamed from: m, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f256687m;

    /* renamed from: n, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f256688n;

    /* renamed from: o, reason: collision with root package name */
    public gn4.c1 f256689o;

    /* renamed from: p, reason: collision with root package name */
    public gn4.x0 f256690p;

    /* renamed from: q, reason: collision with root package name */
    public android.app.ProgressDialog f256691q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f256692r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f256693s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f256694t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f256695u;

    /* renamed from: v, reason: collision with root package name */
    public in4.k f256696v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f256697w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18765xae0673c5 f256698x;

    /* renamed from: y, reason: collision with root package name */
    public xm4.a f256699y;

    /* renamed from: z, reason: collision with root package name */
    public an4.a f256700z;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 B = new gn4.f0(this);
    public int C = 0;
    public long D = -1;
    public final long E = -1;
    public final com.p314xaae8f345.mm.p944x882e457a.u0 R = new gn4.l0(this);

    @Override // fn4.b
    public void A4(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gn4.j0(this, str));
    }

    @Override // fn4.b
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf B() {
        return this;
    }

    @Override // fn4.b
    public void B2() {
        W6();
    }

    @Override // fn4.b
    public void E3(java.lang.String str) {
        this.f256686i.f469052y = str;
    }

    @Override // fn4.b
    public void F2(android.view.View view, int i17) {
        if (this.I.d()) {
            this.I.h();
            this.N = true;
        }
        in4.q qVar = new in4.q(mo55332x76847179(), this.f256680J.d(i17), new gn4.g0(this, view, i17));
        this.P = qVar;
        qVar.c(view, true, 0, 0);
        try {
            ((gn4.c0) this.I.f346107c.mo129842x143e7d6c()).z();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // fn4.b
    public boolean H4() {
        return this.f256686i.f469039i != 326;
    }

    @Override // fn4.b
    public boolean H6() {
        return this.f256686i.f469039i != 36;
    }

    @Override // fn4.b
    public fn4.l1 I2() {
        return this.I;
    }

    @Override // fn4.b
    public void O1(java.util.List list, boolean z17) {
        this.f256689o.x(list, z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new gn4.i0(this), 50L);
    }

    @Override // fn4.b
    public fn4.r0 Q4() {
        return this.H;
    }

    @Override // fn4.b
    public void R2() {
        runOnUiThread(new gn4.m0(this));
    }

    @Override // fn4.b
    public void T2(int i17, r45.x56 x56Var) {
    }

    @Override // fn4.b
    public void U0(r45.xn6 xn6Var, android.view.View view) {
        if (xn6Var != null) {
            if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(this)) {
                dp.a.m125854x26a183b(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.k0_), 0).show();
                return;
            }
            java.lang.String str = xn6Var.G;
            int i17 = xn6Var.R ? 5 : 4;
            java.lang.String str2 = "" + java.lang.System.currentTimeMillis();
            r45.un6 un6Var = this.f256686i;
            gm0.j1.d().g(new sm4.j(xn6Var, str, i17, str2, un6Var.f469039i, un6Var.f469040m, p6() ? qf1.f.f76475x366c91de : qf1.j.f76479x366c91de, xn6Var.f471792h, xn6Var.S, 1));
            boolean z17 = !xn6Var.R;
            xn6Var.R = z17;
            if (z17) {
                xn6Var.X++;
            } else {
                xn6Var.X--;
            }
            ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.poh)).setText(wm4.u.p(xn6Var.X));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "onWowBtnClick thumb:" + xn6Var.R);
        }
    }

    public final void U6() {
        android.view.View view = this.f256693s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f256692r;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f256680J.p(0);
    }

    public final int V6() {
        return ((android.media.AudioManager) mo55332x76847179().getSystemService("audio")).getStreamVolume(3);
    }

    public final void W6() {
        getWindow().setFlags(201327616, 201327616);
        android.view.View decorView = getWindow().getDecorView();
        if (fp.h.a(19)) {
            decorView.setSystemUiVisibility(2);
        } else {
            decorView.setSystemUiVisibility(4102);
        }
        getWindow().addFlags(128);
    }

    @Override // fn4.b
    public void X1(int i17) {
        this.f256686i.f469049v = i17;
    }

    public void X6(r45.xn6 xn6Var, android.view.View view, boolean z17) {
        in4.k kVar;
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "onLikeSceneEnd vid:%s, thumb:%s", xn6Var.f471792h, java.lang.Boolean.valueOf(z17));
        if (!z17) {
            if (this.f256695u.getVisibility() != 0 || (kVar = this.f256696v) == null || (str = kVar.f374511f) == null || !str.equals(xn6Var.f471792h)) {
                return;
            }
            android.view.View view2 = this.f256695u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.String str2 = "" + java.lang.System.currentTimeMillis();
        java.lang.String str3 = xn6Var.G;
        java.lang.String str4 = xn6Var.f471788d;
        r45.un6 un6Var = this.f256686i;
        sm4.f fVar = new sm4.f(str2, str3, "", "", "", "", str4, un6Var.f469040m, un6Var.f469039i, p6() ? qf1.f.f76475x366c91de : qf1.j.f76479x366c91de, xn6Var.f471792h, xn6Var.S, 1);
        android.view.View view3 = this.f256695u;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f256696v = new in4.k(this, this.f256697w, new gn4.o0(this, xn6Var), fVar, xn6Var.f471792h);
        this.f256695u.postDelayed(new gn4.p0(this), 2000L);
        this.f256696v.a(view, true, 0, 0);
    }

    @Override // fn4.b
    public int Y2() {
        return this.f256686i.f469049v;
    }

    public final void Y6() {
        if (this.f256686i.f469051x) {
            this.f256683f.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f81237xc9d81dfe);
        } else {
            this.f256683f.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f81238x8261cf70);
        }
        fn4.l1 l1Var = this.I;
        if (l1Var.f346109e) {
            l1Var.l(this.f256686i.f469051x);
        }
    }

    @Override // fn4.b
    public void a2(r45.xn6 xn6Var) {
        an4.a aVar = this.f256700z;
        if (aVar != null) {
            aVar.c0(this.f256686i, xn6Var);
        }
        xm4.a aVar2 = this.f256699y;
        if (aVar2 != null) {
            aVar2.u0(this.f256686i, xn6Var);
        }
    }

    @Override // fn4.b
    public int b1() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_topstory_v_video_play, 0);
    }

    @Override // fn4.b
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 d2() {
        return this.M;
    }

    @Override // fn4.b
    public void g1(r45.xn6 xn6Var, fn4.g gVar, int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return p6() ? 1 : 0;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d1r;
    }

    @Override // fn4.b
    /* renamed from: getRecyclerView */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo72292x4905e9fa() {
        return this.f256687m;
    }

    @Override // fn4.b
    /* renamed from: getVideoHeight */
    public int mo72293x463504c() {
        if (this.L == 0) {
            if (p6()) {
                this.L = 1280;
                int i17 = (y4().y * 3) / 5;
                if (this.L > i17) {
                    this.L = i17;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "getVideoHeight %d maxVideoHeight %d", java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(i17));
            } else {
                this.L = (mo72294x8d5c7601() * 280) / com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0.f34847x366c91de;
            }
        }
        return this.L;
    }

    @Override // fn4.b
    /* renamed from: getVideoWidth */
    public int mo72294x8d5c7601() {
        return java.lang.Math.min(y4().x, y4().y);
    }

    @Override // fn4.b
    public boolean h1() {
        return false;
    }

    @Override // fn4.b
    public int h3() {
        return this.f256686i.f469053z;
    }

    @Override // fn4.b
    /* renamed from: isMute */
    public boolean mo72295xb9a62e63() {
        return this.f256686i.f469051x;
    }

    @Override // fn4.b
    public void k4(int i17) {
        this.f256686i.f469053z = i17;
    }

    @Override // fn4.b
    public int l4() {
        return 0;
    }

    @Override // fn4.b
    public void m() {
        this.f256681d.animate().alpha(0.0f).setDuration(200L).setStartDelay(1800L);
        android.view.View view = this.f256695u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onEnterImmersionModel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onEnterImmersionModel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // fn4.b
    public fn4.a1 o4() {
        return this.G;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        fn4.m a17;
        fn4.b1.f346014b.b(this, i17, i18, intent);
        if (i17 == 10001) {
            if (((this.F.f346102c == 1) || su4.r2.k()) && (a17 = fn4.d.a(this)) != null) {
                a17.s(false);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            m78497xc03943d(true);
        }
        super.onCreate(bundle);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_context");
        r45.un6 un6Var = new r45.un6();
        this.f256686i = un6Var;
        try {
            un6Var.mo11468x92b714fd(byteArrayExtra);
        } catch (java.lang.Exception unused) {
            finish();
        }
        fn4.z0 z0Var = new fn4.z0();
        this.f256680J = z0Var;
        z0Var.f346164a = this;
        fn4.r0 r0Var = new fn4.r0();
        this.H = r0Var;
        r0Var.c(this);
        fn4.a1 a1Var = new fn4.a1();
        this.G = a1Var;
        a1Var.f346009c++;
        a1Var.f346008b = this;
        fn4.l1 l1Var = new fn4.l1();
        this.I = l1Var;
        l1Var.f346105a++;
        l1Var.f346114j = this;
        this.F = new fn4.k0();
        this.f256690p = new gn4.x0();
        r45.xn6 xn6Var = this.f256686i.f469042o;
        if (xn6Var != null) {
            fn4.z0 z0Var2 = this.f256680J;
            synchronized (z0Var2) {
                ((java.util.LinkedList) z0Var2.b()).add(xn6Var);
            }
        }
        xm4.a aVar = new xm4.a(new xm4.b(this));
        this.f256699y = aVar;
        aVar.b(8, this.f256686i.f469045r);
        this.f256699y.Z(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k07));
        an4.a aVar2 = new an4.a(new an4.b(this));
        this.f256700z = aVar2;
        aVar2.y(8, this.f256686i.f469045r);
        this.f256700z.L(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k07));
        if (mo2533x106ab264() != null) {
            mo2533x106ab264().w(new android.graphics.drawable.ColorDrawable(0));
            mo2533x106ab264().o();
        }
        if (this.f256686i.f469047t) {
            this.F.f346100a = true;
        }
        W6();
        this.f256681d = findViewById(com.p314xaae8f345.mm.R.id.f568869oc0);
        this.f256682e = findViewById(com.p314xaae8f345.mm.R.id.k0z);
        this.f256684g = findViewById(com.p314xaae8f345.mm.R.id.jqy);
        this.f256683f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f567594k11);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) findViewById(com.p314xaae8f345.mm.R.id.aa8);
        this.f256685h = imageButton;
        imageButton.getDrawable().setColorFilter(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an), android.graphics.PorterDuff.Mode.SRC_ATOP);
        this.f256685h.setOnClickListener(new gn4.q0(this));
        this.f256682e.setOnClickListener(new gn4.r0(this));
        android.view.View view = this.f256682e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f256694t = findViewById(com.p314xaae8f345.mm.R.id.gfi);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.f569093p03);
        this.f256687m = c1163xf1deaba4;
        c1163xf1deaba4.i(this.B);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this);
        this.f256688n = c1162x665295de;
        this.f256687m.mo7967x900dcbe1(c1162x665295de);
        this.M = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(this.f256688n);
        gn4.c1 c1Var = new gn4.c1(this);
        this.f256689o = c1Var;
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571120d24, (android.view.ViewGroup) null);
        inflate.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        this.f256693s = inflate.findViewById(com.p314xaae8f345.mm.R.id.gbx);
        this.f256692r = inflate.findViewById(com.p314xaae8f345.mm.R.id.f566574gc1);
        x.o oVar = c1Var.f346023e;
        oVar.g(oVar.h() + 200000, inflate);
        this.f256687m.mo7960x6cab2c8d(this.f256689o);
        new gn4.c().b(this.f256687m);
        r45.un6 un6Var2 = this.f256686i;
        if (!((un6Var2.f469039i == 36 || un6Var2.A) ? false : true)) {
            android.view.View view2 = this.f256693s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f256692r;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (this.F.b()) {
            U6();
            this.A = false;
            r45.un6 un6Var3 = this.f256686i;
            if (un6Var3.f469039i != 21 && un6Var3.f469043p == null) {
                this.f256691q = db5.e1.Q(this, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new gn4.s0(this));
            }
        } else {
            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.hsk, 1).show();
            this.A = true;
        }
        this.f256689o.f355135i = true;
        android.view.View view4 = this.f256694t;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if ((this.F.f346102c == 2) && su4.r2.k() && java.lang.System.currentTimeMillis() - S > 86400000) {
            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.k0d, 0).show();
            S = java.lang.System.currentTimeMillis();
        }
        this.f256695u = findViewById(com.p314xaae8f345.mm.R.id.czk);
        this.f256697w = findViewById(com.p314xaae8f345.mm.R.id.czl);
        android.view.View view5 = this.f256695u;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f256695u.setOnTouchListener(new gn4.t0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18765xae0673c5 c18765xae0673c5 = (com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18765xae0673c5) findViewById(com.p314xaae8f345.mm.R.id.f565373c72);
        this.f256698x = c18765xae0673c5;
        c18765xae0673c5.setVisibility(8);
        this.f256698x.d(this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new gn4.u0(this));
        if (p6()) {
            this.f256685h.setImageResource(com.p314xaae8f345.mm.R.raw.f81226xab778994);
            if (com.p314xaae8f345.mm.ui.bk.u(this, false)) {
                int p17 = com.p314xaae8f345.mm.ui.bk.p(this);
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f256681d.getLayoutParams();
                layoutParams.topMargin = p17 + i65.a.b(this, 12);
                this.f256681d.setLayoutParams(layoutParams);
            }
        }
        this.f256684g.setOnClickListener(new gn4.v0(this));
        gm0.j1.d().a(2802, this.R);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        pm4.y.g(this.f256686i, mo78509x4b0ac5a2(), this.f256680J.d(this.f256686i.f469049v));
        gm0.j1.d().q(2802, this.R);
        this.f256680J.i();
        ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai().getClass();
        this.I.f();
        fn4.k0 k0Var = this.F;
        k0Var.getClass();
        gm0.j1.n().d(k0Var.f346103d);
        k0Var.f346101b = null;
        k0Var.f346102c = 0;
        k0Var.f346100a = false;
        this.G.b();
        this.H.d();
        this.f256698x.f256793h.d();
        uu4.a.a(16);
        xm4.a aVar = this.f256699y;
        if (aVar != null) {
            aVar.o0();
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4 && this.f256698x.getVisibility() == 0) {
            this.f256698x.b();
            return true;
        }
        if (i17 == 25 && keyEvent.getAction() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "onKeyDown KEYCODE_VOLUME_DOWN %d", java.lang.Integer.valueOf(V6()));
            this.f256686i.f469051x = V6() <= 1;
            Y6();
        } else if (i17 == 24 && keyEvent.getAction() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "onKeyDown KEYCODE_VOLUME_UP %d", java.lang.Integer.valueOf(V6()));
            this.f256686i.f469051x = false;
            Y6();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        fn4.c1 c1Var = this.I.f346106b;
        if (c1Var != null) {
            c1Var.e();
        }
        ((pm4.r) i95.n0.c(pm4.r.class)).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18765xae0673c5 c18765xae0673c5 = this.f256698x;
        c18765xae0673c5.f256793h.f291933e = null;
        gm0.j1.d().q(2906, c18765xae0673c5);
        uu4.a.a(15);
        an4.a aVar = this.f256700z;
        if (aVar != null) {
            aVar.A();
        }
        xm4.a aVar2 = this.f256699y;
        if (aVar2 != null) {
            aVar2.z();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        W6();
        Y6();
        ((pm4.r) i95.n0.c(pm4.r.class)).getClass();
        fn4.l1 l1Var = this.I;
        fn4.c1 c1Var = l1Var.f346106b;
        if (c1Var != null) {
            c1Var.g();
            fn4.g gVar = l1Var.f346107c;
            if (gVar != null) {
                gVar.c();
            }
        }
        fn4.k0 k0Var = this.F;
        k0Var.f346102c = k0Var.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18765xae0673c5 c18765xae0673c5 = this.f256698x;
        c18765xae0673c5.f256793h.f291933e = c18765xae0673c5;
        gm0.j1.d().a(2906, c18765xae0673c5);
        uu4.a.a(14);
        an4.a aVar = this.f256700z;
        if (aVar != null) {
            aVar.z();
        }
        xm4.a aVar2 = this.f256699y;
        if (aVar2 != null) {
            aVar2.x();
        }
    }

    @Override // fn4.b
    public boolean p6() {
        return this.f256686i.f469038h == 100203;
    }

    @Override // fn4.b
    public r45.un6 r0() {
        return this.f256686i;
    }

    @Override // fn4.b
    public fn4.k0 s1() {
        return this.F;
    }

    @Override // fn4.b
    public fn4.z0 s4() {
        return this.f256680J;
    }

    @Override // fn4.b
    public void t() {
        this.f256681d.animate().cancel();
        android.view.View view = this.f256681d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onExitImmersionModel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onExitImmersionModel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // fn4.b
    public fn4.e t0() {
        return this.f256689o;
    }

    @Override // fn4.b
    public boolean t1(int i17) {
        android.view.View view = this.f256695u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "tryToPlayPositionVideo", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "tryToPlayPositionVideo", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "tryToPlayPositionVideo %d", java.lang.Integer.valueOf(i17));
        try {
            if (i17 >= (this.f256689o.mo1894x7e414b06() - this.f256689o.y()) - this.f256689o.z()) {
                return false;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f256687m;
            int z17 = i17 + this.f256689o.z();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(z17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "tryToPlayPositionVideo", "(I)Z", "Undefined", "smoothScrollToPosition", "(I)V");
            c1163xf1deaba4.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "tryToPlayPositionVideo", "(I)Z", "Undefined", "smoothScrollToPosition", "(I)V");
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TopStory.TopStoryFSVideoUI", "tryToPlayPositionVideo Exception:%s", e17.getMessage());
            return false;
        }
    }

    @Override // fn4.b
    public java.lang.String t3() {
        java.lang.String str = this.f256686i.f469052y;
        return str == null ? "" : str;
    }

    @Override // fn4.b
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager u6() {
        return this.f256688n;
    }

    @Override // fn4.b
    public void v6(r45.xn6 xn6Var, fn4.g gVar, int i17, int i18) {
    }

    @Override // fn4.b
    public android.graphics.Point y4() {
        if (this.K == null) {
            this.K = com.p314xaae8f345.mm.ui.bk.h(this);
        }
        return this.K;
    }

    @Override // pm4.s
    public void z3(int i17, int i18) {
        if ((i18 == 2 || i18 == 1) && this.A) {
            U6();
        }
        this.I.e(i17, i18);
    }

    @Override // fn4.b
    public java.lang.String z4() {
        return pm4.w.j(this.f256686i.f469045r);
    }
}
