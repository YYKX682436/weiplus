package com.tencent.mm.plugin.fav.ui.detail;

@db5.a(3)
@ul5.d(0)
/* loaded from: classes12.dex */
public class FavoriteVideoPlayUI extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int H = 0;
    public java.lang.String C;
    public long D;
    public java.lang.String E;
    public java.lang.String F;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Bundle f100656d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f100657e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f100658f;

    /* renamed from: g, reason: collision with root package name */
    public int f100659g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f100660h;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.RelativeLayout f100662m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f100663n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.widget.FavVideoView f100664o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f100665p;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s4 f100672w;

    /* renamed from: x, reason: collision with root package name */
    public int f100673x;

    /* renamed from: i, reason: collision with root package name */
    public boolean f100661i = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f100666q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f100667r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f100668s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f100669t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f100670u = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f100671v = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f100674y = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f100675z = false;
    public java.lang.String A = "";
    public boolean B = true;
    public boolean G = false;

    public final void T6(android.widget.ImageView imageView) {
        ot0.q v17;
        if (this.B) {
            this.f100664o.j(this.f100658f, this.f100675z, this.A);
            if (imageView != null) {
                if (com.tencent.mm.vfs.w6.j(this.f100657e)) {
                    imageView.setImageBitmap(com.tencent.mm.sdk.platformtools.j.a(this.f100657e, 1.0f));
                } else {
                    imageView.setImageResource(com.tencent.mm.R.drawable.f481178c02);
                }
            }
        } else {
            java.lang.String stringExtra = getIntent().getStringExtra("record_xml");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && (v17 = ot0.q.v(pt0.f0.Li(this.F, this.D).U1())) != null) {
                stringExtra = v17.f348663h0;
            }
            zs3.v vVar = (zs3.v) i95.n0.c(zs3.v.class);
            java.lang.String str = this.F;
            long j17 = this.D;
            java.lang.String str2 = this.C;
            ((bt3.x1) vVar).getClass();
            bt3.g2.O(bt3.g2.n(stringExtra, str2), str, j17, true);
            this.f100664o.j(this.f100658f, true, this.C);
            this.f100664o.setThumbView(this.f100657e);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: fullPath is not null,but not exist videoView.setVideoData(null) isDataExist:%s thumbPathExist:%s", java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.j(this.f100657e)));
    }

    public void U6() {
        int i17;
        this.f100665p.setVisibility(8);
        int width = this.f100662m.getWidth();
        int height = this.f100662m.getHeight();
        int i18 = this.f100669t;
        if (i18 != 0 && (i17 = this.f100670u) != 0) {
            height = (int) ((width / i18) * i17);
        }
        com.tencent.mm.ui.tools.s4 s4Var = this.f100672w;
        s4Var.f210699f = width;
        s4Var.f210700g = height;
        s4Var.e(this.f100668s, this.f100667r, i18, this.f100670u);
        this.f100672w.d(this.f100664o, this.f100663n, false, new com.tencent.mm.plugin.fav.ui.detail.a2(this), null);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ac7;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1 || -1 != i18) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
        java.lang.String stringExtra2 = intent == null ? null : intent.getStringExtra("custom_send_text");
        com.tencent.mm.plugin.fav.ui.detail.i2 i2Var = new com.tencent.mm.plugin.fav.ui.detail.i2(this, db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.cax), true, false, null));
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return;
        }
        java.util.Iterator it = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mm.plugin.fav.ui.x5.j(getContext(), str, this.f100658f, this.f100657e, this.f100659g, this.f100660h, i2Var, this.E);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                ((dk5.s5) tg3.t1.a()).fj(str, stringExtra2, c01.e2.C(str), 0);
            }
        }
        com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.c9u), null, this, null, null);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        U6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.graphics.Bitmap b17;
        super.onCreate(bundle);
        hideTitleView();
        if (fp.h.c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        this.f100656d = bundle;
        getWindow().addFlags(128);
        this.f100671v = getIntent().getBooleanExtra("key_detail_data_valid", true);
        this.f100658f = getIntent().getStringExtra("key_detail_fav_path");
        this.f100657e = getIntent().getStringExtra("key_detail_fav_thumb_path");
        this.f100659g = getIntent().getIntExtra("key_detail_fav_video_duration", 0);
        this.f100660h = getIntent().getStringExtra("key_detail_statExtStr");
        this.f100673x = getIntent().getIntExtra("key_detail_fav_video_scene_from", 0);
        this.f100674y = getIntent().getBooleanExtra("show_share", true);
        this.f100675z = getIntent().getBooleanExtra("key_detail_fav_video_show_download_status", false);
        this.A = getIntent().getStringExtra("key_detail_data_id");
        this.B = getIntent().getBooleanExtra("key_detail_is_data_exist", true);
        this.C = getIntent().getStringExtra("record_data_id");
        this.D = getIntent().getLongExtra("message_id", -1L);
        this.E = getIntent().getStringExtra("key_detail_msg_uuid");
        this.F = getIntent().getStringExtra("message_talker");
        if (!com.tencent.mm.vfs.w6.j(this.f100657e) && (b17 = com.tencent.mm.plugin.fav.ui.u1.b(this.f100658f)) != null) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: create thumbpath bitmap, saveBitmapToImage ");
                com.tencent.mm.sdk.platformtools.x.D0(b17, 60, android.graphics.Bitmap.CompressFormat.JPEG, this.f100657e, true);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FavoriteVideoPlayUI", e17, "", new java.lang.Object[0]);
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(this.f100671v);
        objArr[1] = com.tencent.mm.sdk.platformtools.t8.K0(this.f100657e) ? "" : this.f100657e;
        objArr[2] = com.tencent.mm.sdk.platformtools.t8.K0(this.f100658f) ? "" : this.f100658f;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: init data, isVideoValid: %B. thumbPath: %s, fullPath: %s", objArr);
        this.f100662m = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.p0w);
        this.f100664o = (com.tencent.mm.plugin.fav.ui.widget.FavVideoView) findViewById(com.tencent.mm.R.id.p0x);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.p0l);
        this.f100663n = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ght);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.du_);
        this.f100665p = linearLayout;
        if (!this.f100671v && linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        al5.y3.f6102a.b(getContext(), getContentView(), this.f100664o.getRoot(), new com.tencent.mm.plugin.fav.ui.detail.b2(this), new al5.v3() { // from class: com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI$$a
            @Override // al5.v3
            public final android.graphics.Rect a() {
                int i17 = com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI.H;
                com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI favoriteVideoPlayUI = com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI.this;
                favoriteVideoPlayUI.getClass();
                android.graphics.Rect rect = new android.graphics.Rect();
                favoriteVideoPlayUI.f100664o.getVideoView().getGlobalVisibleRect(rect);
                return rect;
            }
        }, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f100658f)) {
            T6(imageView);
        } else if (com.tencent.mm.vfs.w6.j(this.f100658f)) {
            this.f100664o.setVideoData(this.f100658f);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay:  videoView.setVideoData(fullPath)");
        } else {
            T6(imageView);
        }
        this.f100672w = new com.tencent.mm.ui.tools.s4(null);
        this.f100664o.setCallback(new com.tencent.mm.plugin.fav.ui.detail.c2(this));
        this.f100664o.setOnClickListener(new com.tencent.mm.plugin.fav.ui.detail.d2(this));
        this.f100664o.setVideoScaleType(com.tencent.mm.pluginsdk.ui.e1.CONTAIN);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        setResult(0, getIntent().putExtra("key_activity_browse_time", getActivityBrowseTimeMs()));
        this.f100664o.e();
        getWindow().clearFlags(128);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        getWindow().setFlags(2048, 2048);
        if (this.f100664o.d()) {
            this.G = true;
        }
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = this.f100664o;
        java.lang.String str = favVideoView.f101566d;
        com.tencent.mars.xlog.Log.i(str, "VideoPlay:   onPause()");
        favVideoView.k();
        if (favVideoView.f101569g.isPlaying()) {
            com.tencent.mars.xlog.Log.i(str, "VideoPlay: pausePlay()");
            favVideoView.f101569g.pause();
        }
        favVideoView.I.d();
        favVideoView.setVideoStateIv(true);
        favVideoView.f101565J.d();
        super.onPause();
        qp1.h0.b();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        getWindow().clearFlags(2048);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay:  onResume,hadOnStart is %B", java.lang.Boolean.valueOf(this.f100661i));
        this.f100661i = false;
        super.onResume();
        if (this.G) {
            this.f100664o.h();
        }
        qp1.h0.a(true, true, true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        android.os.Bundle bundle = this.f100656d;
        if (!this.f100666q) {
            this.f100666q = true;
            this.f100667r = getIntent().getIntExtra("img_gallery_top", 0);
            this.f100668s = getIntent().getIntExtra("img_gallery_left", 0);
            this.f100669t = getIntent().getIntExtra("img_gallery_width", 0);
            int intExtra = getIntent().getIntExtra("img_gallery_height", 0);
            this.f100670u = intExtra;
            this.f100672w.e(this.f100668s, this.f100667r, this.f100669t, intExtra);
            if (bundle == null) {
                this.f100664o.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.fav.ui.detail.k2(this));
            }
        }
        super.onStart();
    }
}
