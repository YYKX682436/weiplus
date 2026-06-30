package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI */
/* loaded from: classes8.dex */
public class ActivityC18746x694b7935 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final o11.g D;

    /* renamed from: d, reason: collision with root package name */
    public int f256448d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f256449e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f256450f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f256451g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f256452h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f256453i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f256454m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f256455n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f256456o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f256457p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f256458q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f256459r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f256460s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f256461t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f256462u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f256463v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f256464w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18056x3bc9e3cf f256465x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f256466y;

    /* renamed from: z, reason: collision with root package name */
    public long f256467z = 0;
    public boolean A = false;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 B = null;
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z C = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.i2(this);

    static {
        o11.f fVar = new o11.f();
        fVar.f423611b = true;
        fVar.f423612c = true;
        fVar.f423629t = false;
        fVar.f423624o = com.p314xaae8f345.mm.R.C30859x5a72f63.f560752t7;
        D = fVar.a();
    }

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18746x694b7935 activityC18746x694b7935) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        com.p314xaae8f345.mm.ui.ga gaVar = activityC18746x694b7935.f39322x2305be9;
        if (gaVar != null) {
            java.lang.String string = activityC18746x694b7935.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571344ce);
            if (gaVar.G == null || (c22699x3dcdb352 = gaVar.K) == null) {
                return;
            }
            c22699x3dcdb352.setContentDescription(string);
        }
    }

    public final void U6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17080, 3, 2, this.f256450f);
        if (this.f256465x.getText().toString().length() > 0) {
            db5.e1.l(this, com.p314xaae8f345.mm.R.C30867xcad56011.f574931k15, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f572141zu, com.p314xaae8f345.mm.R.C30867xcad56011.f572036wx, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.k2(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.a2(this), com.p314xaae8f345.mm.R.C30859x5a72f63.f560267fp);
        } else {
            V6(false);
        }
    }

    public final void V6(boolean z17) {
        if (z17) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_LAST_ENTER_TAB_REC_INT, 110);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_HAS_HAOKAN_RESULT_INT, 1);
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str = this.f256450f;
            ((kt.c) i0Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
            com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11259xee7a56f0.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11259xee7a56f0.Resp();
            resp.f32999xb32a65a0 = "";
            resp.f32868xb2d5068c = "";
            resp.f32869xc3c3c505 = h17.f67384x996f3ea;
            resp.f32867xa7c470f2 = 0;
            resp.f32998xd7e6e31a = this.f256449e;
            android.os.Bundle bundle = new android.os.Bundle();
            resp.mo48431x792022dd(bundle);
            bundle.putString("_openbusinessview_app_name", h17.f67372x453d1e07);
            bundle.putString("_openbusinessview_package_name", h17.f67386xa1e9e82c);
            o11.g gVar = wm4.u.f528842a;
            wm4.u.u(this, 54, bundle, "", new java.util.HashMap());
        } else {
            ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai(this.f256449e, "", this.f256450f, 0, "");
        }
        finish();
        this.A = true;
    }

    public final void W6() {
        int length = this.f256465x.getText().toString().length();
        if (length <= 0) {
            this.f256465x.setHint(com.p314xaae8f345.mm.R.C30867xcad56011.f574930k14);
        } else {
            this.f256465x.setHint("");
        }
        if (length < 180) {
            this.f256461t.setVisibility(8);
            this.f256462u.setVisibility(8);
            return;
        }
        this.f256461t.setVisibility(0);
        this.f256462u.setVisibility(0);
        int color = length <= 200 ? getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9a) : getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y);
        this.f256461t.setText("" + length);
        this.f256461t.setTextColor(color);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        U6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d29;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("micromsg.topstory.TopStoryUploadUI", "onCreate");
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.k19);
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j2(this), null, com.p314xaae8f345.mm.ui.fb.YELLOW);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.b2(this));
        gm0.j1.d().a(2534, this);
        this.f256448d = getIntent().getIntExtra("KEY_TYPE", 0);
        this.f256449e = getIntent().getStringExtra("KEY_BIZTYPE");
        this.f256450f = getIntent().getStringExtra("KEY_APPID");
        this.f256453i = getIntent().getStringExtra("KEY_EXTINFO");
        this.f256451g = getIntent().getStringExtra("KEY_TITLE");
        getIntent().getStringExtra("KEY_DESC");
        this.f256452h = getIntent().getStringExtra("KEY_THUMBURL");
        this.f256454m = getIntent().getStringExtra("KEY_APPVERSION");
        this.f256455n = getIntent().getStringExtra("KEY_MEDIANAME");
        getIntent().getStringExtra("KEY_MEDIAHEADURL");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("micromsg.topstory.TopStoryUploadUI", "onCreate, thumbUrl:%s", this.f256452h);
        this.f256456o = findViewById(com.p314xaae8f345.mm.R.id.ozb);
        this.f256459r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.p0t);
        this.f256460s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oyj);
        this.f256465x = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18056x3bc9e3cf) findViewById(com.p314xaae8f345.mm.R.id.c86);
        this.f256466y = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hzs);
        this.f256461t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pnx);
        this.f256462u = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569276po0);
        this.f256457p = findViewById(com.p314xaae8f345.mm.R.id.a1l);
        this.f256458q = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.a1k);
        this.f256463v = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a1n);
        this.f256464w = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a1i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("micromsg.topstory.TopStoryUploadUI", "onProcessBitmap type = " + this.f256448d + "， isfile exist = " + com.p314xaae8f345.mm.vfs.w6.j(this.f256452h));
        int i17 = this.f256448d;
        o11.g gVar = D;
        if (i17 == 1) {
            android.view.View view = this.f256456o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f256457p;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f256459r.setText(this.f256451g);
            this.f256460s.setText(this.f256455n);
            n11.a.b().i(this.f256452h, this.f256458q, gVar, new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.d2(this));
        } else {
            android.view.View view3 = this.f256456o;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f256457p;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f256463v.setText(this.f256451g);
            this.f256464w.setText(this.f256455n);
            n11.a.b().h(this.f256452h, this.f256458q, gVar);
        }
        this.f256466y.setText(java.lang.String.format("<a href='%s'>%s</a>", "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyi) + "/cgi-bin/recweb/clientjump?tag=colikefirstsight#wechat_redirect", getString(com.p314xaae8f345.mm.R.C30867xcad56011.k17)));
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(this.f256466y, 1);
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).wi(this.C);
        W6();
        this.f256465x.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.e2(this));
        this.f256465x.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.g2(this));
        this.f39322x2305be9.G.j().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.h2(this), 150L);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17080, 6, 1, this.f256450f);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getBoolean("tophitory_show_init_dialog", false)) {
            return;
        }
        mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.c2 c2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.c2(this);
        boolean Ai = ((lf0.h0) g0Var).Ai();
        aw4.m0 m0Var = aw4.n0.f96434a;
        if (!Ai) {
            m0Var.e(this, c2Var, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1e));
        } else {
            m0Var.b(this, c2Var, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574938on5), getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574937on4), true, "tophitory_show_init_dialog");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("micromsg.topstory.TopStoryUploadUI", "onDestroy");
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.B;
        if (u3Var != null) {
            u3Var.dismiss();
            this.B = null;
        }
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).Ni(this.C);
        gm0.j1.d().q(2534, this);
        if (this.A) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17080, 3, 2, this.f256450f);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.B;
        if (u3Var != null) {
            u3Var.dismiss();
            this.B = null;
        }
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof sm4.g) {
                r45.ie ieVar = ((r45.q50) ((sm4.g) m1Var).f491474e.f152244b.f152233a).f76492x92037252;
                if (ieVar.f458492d == 0) {
                    V6(true);
                    return;
                }
                r45.du5 du5Var = ieVar.f458493e;
                if (du5Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(du5Var.f454289d)) {
                    db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.k18), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574932k16));
                } else {
                    db5.e1.s(this, ieVar.f458493e.f454289d, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574932k16));
                }
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.k0_), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574932k16));
        } else {
            db5.e1.s(this, str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574932k16));
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(1032L, 2L, 1L, false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(m82.q.class);
    }
}
