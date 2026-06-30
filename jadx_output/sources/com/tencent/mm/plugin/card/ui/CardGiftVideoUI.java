package com.tencent.mm.plugin.card.ui;

@db5.a(3)
/* loaded from: classes12.dex */
public class CardGiftVideoUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.pluginsdk.ui.tools.a4, lu1.b {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.card.model.CardGiftInfo f94842d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f94843e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f94844f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f94845g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f94846h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.f4 f94847i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.RelativeLayout f94848m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f94849n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f94850o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ProgressBar f94851p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMPinProgressBtn f94852q;

    /* renamed from: s, reason: collision with root package name */
    public android.os.Bundle f94854s;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s4 f94856u;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s6 f94861z;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f94853r = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: t, reason: collision with root package name */
    public boolean f94855t = false;

    /* renamed from: v, reason: collision with root package name */
    public int f94857v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f94858w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f94859x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f94860y = 0;
    public final com.tencent.mm.sdk.platformtools.b4 A = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.card.ui.b2(this), true);
    public int B = 0;

    @Override // lu1.b
    public void I1(java.lang.String str, java.lang.String str2) {
        boolean equals = str.equals(this.f94842d.f94652i);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f94853r;
        if (equals) {
            n3Var.post(new com.tencent.mm.plugin.card.ui.r1(this, str2));
        } else if (str.equals(this.f94842d.f94653m)) {
            n3Var.post(new com.tencent.mm.plugin.card.ui.s1(this, str2));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftVideoUI", "fieldId:%s is unsuitable", str);
        }
    }

    @Override // lu1.b
    public void J(java.lang.String str) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
    }

    public final void T6(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftVideoUI", "the videoPath is null, fail~!!!");
            setResult(0);
            finish();
        } else {
            if (com.tencent.mm.vfs.w6.j(str)) {
                this.f94847i.setVideoPath(str);
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftVideoUI", "the videoPath is %s, the file isn't exist~!!!", str);
            setResult(0);
            finish();
        }
    }

    public final void U6() {
        if (this.f94861z == null) {
            this.f94861z = new com.tencent.mm.ui.tools.s6(getContext());
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94844f)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftVideoUI", "videoPath is null");
        } else {
            this.f94861z.c((com.tencent.mm.pluginsdk.ui.tools.VideoTextureView) this.f94847i, new com.tencent.mm.plugin.card.ui.t1(this), new com.tencent.mm.plugin.card.ui.v1(this));
        }
    }

    public void V6() {
        this.f94856u.e(this.f94858w, this.f94857v, this.f94859x, this.f94860y);
        this.f94856u.d(this.f94845g, this.f94846h, false, new com.tencent.mm.plugin.card.ui.a2(this), null);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        V6();
        return true;
    }

    @Override // lu1.b
    public void g2(java.lang.String str, int i17, int i18) {
        if (str.equals(this.f94842d.f94652i)) {
            this.f94853r.post(new com.tencent.mm.plugin.card.ui.q1(this, i18, i17));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488304pm;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f94845g = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.p0w);
        this.f94848m = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f487563p06);
        this.f94849n = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.p0l);
        this.f94850o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oyr);
        this.f94852q = (com.tencent.mm.ui.widget.MMPinProgressBtn) findViewById(com.tencent.mm.R.id.f487558p01);
        this.f94851p = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.ozc);
        this.f94847i = new com.tencent.mm.pluginsdk.ui.tools.VideoTextureView(this, null);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.f94847i.setMute(this.f94843e);
        this.f94847i.setVideoCallback(this);
        this.f94848m.addView((android.view.View) this.f94847i, layoutParams);
        this.f94846h = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ght);
        this.f94845g.setOnTouchListener(new com.tencent.mm.plugin.card.ui.w1(this));
        ((android.view.View) this.f94847i).setOnClickListener(new com.tencent.mm.plugin.card.ui.x1(this));
        this.f94856u = new com.tencent.mm.ui.tools.s4(this);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftVideoUI", "%d on completion", java.lang.Integer.valueOf(hashCode()));
        ((com.tencent.mm.pluginsdk.ui.tools.VideoTextureView) this.f94847i).b(0.0d);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (getIntent().getExtras() != null) {
            getIntent().getExtras().setClassLoader(getClass().getClassLoader());
        }
        super.onCreate(bundle);
        hideTitleView();
        this.f94854s = bundle;
        getWindow().setFlags(1024, 1024);
        if (com.tencent.mm.booter.b.d() != null) {
            com.tencent.mm.booter.b.d().a();
        }
        this.f94842d = (com.tencent.mm.plugin.card.model.CardGiftInfo) getIntent().getParcelableExtra("key_gift_into");
        this.f94844f = getIntent().getStringExtra("key_video_path");
        this.f94843e = getIntent().getBooleanExtra("key_is_mute", false);
        com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo = this.f94842d;
        if (cardGiftInfo != null) {
            cardGiftInfo.toString();
        }
        initView();
        lu1.c.b(this);
        U6();
        com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo2 = this.f94842d;
        if (cardGiftInfo2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftVideoUI", "cardGiftInfo is null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(cardGiftInfo2.f94652i)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftVideoUI", "fromUserContentVideoUrl is null");
            return;
        }
        com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo3 = this.f94842d;
        lu1.c.a(cardGiftInfo3.f94653m, cardGiftInfo3.f94656p, cardGiftInfo3.f94668z, 2);
        com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo4 = this.f94842d;
        lu1.c.a(cardGiftInfo4.f94652i, cardGiftInfo4.f94655o, cardGiftInfo4.f94667y, 1);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ((com.tencent.mm.pluginsdk.ui.tools.VideoTextureView) this.f94847i).stop();
        this.A.d();
        lu1.c.c(this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        setResult(0);
        ((com.tencent.mm.pluginsdk.ui.tools.VideoTextureView) this.f94847i).stop();
        com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftVideoUI", "%d on play video error what %d extra %d.", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        ((com.tencent.mm.pluginsdk.ui.tools.VideoTextureView) this.f94847i).pause();
        super.onPause();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        setResult(-1);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f94853r;
        n3Var.post(new com.tencent.mm.plugin.card.ui.c2(this, true));
        n3Var.post(new com.tencent.mm.plugin.card.ui.d2(this));
        ((com.tencent.mm.pluginsdk.ui.tools.VideoTextureView) this.f94847i).start();
        this.B = this.f94847i.getDuration() / 1000;
        this.A.c(500L, 500L);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftVideoUI", "onPrepared videoView.start duration:%d", java.lang.Integer.valueOf(this.B));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f94844f)) {
            T6(this.f94844f);
        }
        super.onResume();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        android.os.Bundle bundle = this.f94854s;
        if (!this.f94855t) {
            this.f94855t = true;
            this.f94857v = getIntent().getIntExtra("img_top", 0);
            this.f94858w = getIntent().getIntExtra("img_left", 0);
            this.f94859x = getIntent().getIntExtra("img_width", 0);
            int intExtra = getIntent().getIntExtra("img_height", 0);
            this.f94860y = intExtra;
            this.f94856u.e(this.f94858w, this.f94857v, this.f94859x, intExtra);
            if (bundle == null) {
                this.f94845g.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.card.ui.y1(this));
            }
        }
        super.onStart();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
