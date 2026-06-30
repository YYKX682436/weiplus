package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

@db5.a(m123858x6ac9171 = 3)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI */
/* loaded from: classes12.dex */
public class ActivityC13594x1487ddc7 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final /* synthetic */ int H = 0;
    public java.lang.String C;
    public long D;
    public java.lang.String E;
    public java.lang.String F;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Bundle f182189d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f182190e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f182191f;

    /* renamed from: g, reason: collision with root package name */
    public int f182192g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f182193h;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.RelativeLayout f182195m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f182196n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 f182197o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f182198p;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.s4 f182205w;

    /* renamed from: x, reason: collision with root package name */
    public int f182206x;

    /* renamed from: i, reason: collision with root package name */
    public boolean f182194i = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f182199q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f182200r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f182201s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f182202t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f182203u = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f182204v = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f182207y = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f182208z = false;
    public java.lang.String A = "";
    public boolean B = true;
    public boolean G = false;

    public final void T6(android.widget.ImageView imageView) {
        ot0.q v17;
        if (this.B) {
            this.f182197o.j(this.f182191f, this.f182208z, this.A);
            if (imageView != null) {
                if (com.p314xaae8f345.mm.vfs.w6.j(this.f182190e)) {
                    imageView.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.a(this.f182190e, 1.0f));
                } else {
                    imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562711c02);
                }
            }
        } else {
            java.lang.String stringExtra = getIntent().getStringExtra("record_xml");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && (v17 = ot0.q.v(pt0.f0.Li(this.F, this.D).U1())) != null) {
                stringExtra = v17.f430196h0;
            }
            zs3.v vVar = (zs3.v) i95.n0.c(zs3.v.class);
            java.lang.String str = this.F;
            long j17 = this.D;
            java.lang.String str2 = this.C;
            ((bt3.x1) vVar).getClass();
            bt3.g2.O(bt3.g2.n(stringExtra, str2), str, j17, true);
            this.f182197o.j(this.f182191f, true, this.C);
            this.f182197o.m55412xab04b759(this.f182190e);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: fullPath is not null,but not exist videoView.setVideoData(null) isDataExist:%s thumbPathExist:%s", java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.j(this.f182190e)));
    }

    public void U6() {
        int i17;
        this.f182198p.setVisibility(8);
        int width = this.f182195m.getWidth();
        int height = this.f182195m.getHeight();
        int i18 = this.f182202t;
        if (i18 != 0 && (i17 = this.f182203u) != 0) {
            height = (int) ((width / i18) * i17);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = this.f182205w;
        s4Var.f292232f = width;
        s4Var.f292233g = height;
        s4Var.e(this.f182201s, this.f182200r, i18, this.f182203u);
        this.f182205w.d(this.f182197o, this.f182196n, false, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a2(this), null);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ac7;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1 || -1 != i18) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
        java.lang.String stringExtra2 = intent == null ? null : intent.getStringExtra("custom_send_text");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.i2 i2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.i2(this, db5.e1.Q(mo55332x76847179(), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            return;
        }
        java.util.Iterator it = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(",")).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.j(mo55332x76847179(), str, this.f182191f, this.f182190e, this.f182192g, this.f182193h, i2Var, this.E);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                ((dk5.s5) tg3.t1.a()).fj(str, stringExtra2, c01.e2.C(str), 0);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9u), null, this, null, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        U6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.graphics.Bitmap b17;
        super.onCreate(bundle);
        m78531x8f8cf1fb();
        if (fp.h.c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        this.f182189d = bundle;
        getWindow().addFlags(128);
        this.f182204v = getIntent().getBooleanExtra("key_detail_data_valid", true);
        this.f182191f = getIntent().getStringExtra("key_detail_fav_path");
        this.f182190e = getIntent().getStringExtra("key_detail_fav_thumb_path");
        this.f182192g = getIntent().getIntExtra("key_detail_fav_video_duration", 0);
        this.f182193h = getIntent().getStringExtra("key_detail_statExtStr");
        this.f182206x = getIntent().getIntExtra("key_detail_fav_video_scene_from", 0);
        this.f182207y = getIntent().getBooleanExtra("show_share", true);
        this.f182208z = getIntent().getBooleanExtra("key_detail_fav_video_show_download_status", false);
        this.A = getIntent().getStringExtra("key_detail_data_id");
        this.B = getIntent().getBooleanExtra("key_detail_is_data_exist", true);
        this.C = getIntent().getStringExtra("record_data_id");
        this.D = getIntent().getLongExtra("message_id", -1L);
        this.E = getIntent().getStringExtra("key_detail_msg_uuid");
        this.F = getIntent().getStringExtra("message_talker");
        if (!com.p314xaae8f345.mm.vfs.w6.j(this.f182190e) && (b17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.b(this.f182191f)) != null) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: create thumbpath bitmap, saveBitmapToImage ");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(b17, 60, android.graphics.Bitmap.CompressFormat.JPEG, this.f182190e, true);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FavoriteVideoPlayUI", e17, "", new java.lang.Object[0]);
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(this.f182204v);
        objArr[1] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f182190e) ? "" : this.f182190e;
        objArr[2] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f182191f) ? "" : this.f182191f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: init data, isVideoValid: %B. thumbPath: %s, fullPath: %s", objArr);
        this.f182195m = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.p0w);
        this.f182197o = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505) findViewById(com.p314xaae8f345.mm.R.id.p0x);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.p0l);
        this.f182196n = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ght);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.du_);
        this.f182198p = linearLayout;
        if (!this.f182204v && linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        al5.y3.f87635a.b(mo55332x76847179(), m78513xc2a54588(), this.f182197o.m55405xfb84e958(), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.b2(this), new al5.v3() { // from class: com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI$$a
            @Override // al5.v3
            public final android.graphics.Rect a() {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13594x1487ddc7.H;
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13594x1487ddc7 activityC13594x1487ddc7 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13594x1487ddc7.this;
                activityC13594x1487ddc7.getClass();
                android.graphics.Rect rect = new android.graphics.Rect();
                activityC13594x1487ddc7.f182197o.m55406x4ee17f0a().getGlobalVisibleRect(rect);
                return rect;
            }
        }, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f182191f)) {
            T6(imageView);
        } else if (com.p314xaae8f345.mm.vfs.w6.j(this.f182191f)) {
            this.f182197o.m55413xab2cf483(this.f182191f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay:  videoView.setVideoData(fullPath)");
        } else {
            T6(imageView);
        }
        this.f182205w = new com.p314xaae8f345.mm.ui.p2740x696c9db.s4(null);
        this.f182197o.m55407x6c4ebec7(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.c2(this));
        this.f182197o.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.d2(this));
        this.f182197o.m55414x5981726b(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        setResult(0, getIntent().putExtra("key_activity_browse_time", mo78509x4b0ac5a2()));
        this.f182197o.e();
        getWindow().clearFlags(128);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        getWindow().setFlags(2048, 2048);
        if (this.f182197o.d()) {
            this.G = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505 = this.f182197o;
        java.lang.String str = viewOnClickListenerC13625xe5fb4505.f183099d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "VideoPlay:   onPause()");
        viewOnClickListenerC13625xe5fb4505.k();
        if (viewOnClickListenerC13625xe5fb4505.f183102g.mo69311xc00617a4()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "VideoPlay: pausePlay()");
            viewOnClickListenerC13625xe5fb4505.f183102g.mo69313x65825f6();
        }
        viewOnClickListenerC13625xe5fb4505.I.d();
        viewOnClickListenerC13625xe5fb4505.m55415x1d620e25(true);
        viewOnClickListenerC13625xe5fb4505.f183098J.d();
        super.onPause();
        qp1.h0.b();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        getWindow().clearFlags(2048);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay:  onResume,hadOnStart is %B", java.lang.Boolean.valueOf(this.f182194i));
        this.f182194i = false;
        super.onResume();
        if (this.G) {
            this.f182197o.h();
        }
        qp1.h0.a(true, true, true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        android.os.Bundle bundle = this.f182189d;
        if (!this.f182199q) {
            this.f182199q = true;
            this.f182200r = getIntent().getIntExtra("img_gallery_top", 0);
            this.f182201s = getIntent().getIntExtra("img_gallery_left", 0);
            this.f182202t = getIntent().getIntExtra("img_gallery_width", 0);
            int intExtra = getIntent().getIntExtra("img_gallery_height", 0);
            this.f182203u = intExtra;
            this.f182205w.e(this.f182201s, this.f182200r, this.f182202t, intExtra);
            if (bundle == null) {
                this.f182197o.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.k2(this));
            }
        }
        super.onStart();
    }
}
