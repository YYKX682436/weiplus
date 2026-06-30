package com.tencent.mm.plugin.card.ui;

@db5.a(3)
/* loaded from: classes12.dex */
public class CardGiftImageUI extends com.tencent.mm.ui.MMActivity implements lu1.b {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.card.model.CardGiftInfo f94803d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f94804e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f94805f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f94806g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.tools.MMGestureGallery f94807h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ProgressBar f94808i;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s6 f94810n;

    /* renamed from: o, reason: collision with root package name */
    public android.os.Bundle f94811o;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s4 f94813q;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.card.ui.d1 f94818v;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f94809m = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    public boolean f94812p = false;

    /* renamed from: r, reason: collision with root package name */
    public int f94814r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f94815s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f94816t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f94817u = 0;

    @Override // lu1.b
    public void I1(java.lang.String str, java.lang.String str2) {
        this.f94809m.post(new com.tencent.mm.plugin.card.ui.c1(this, str2));
    }

    @Override // lu1.b
    public void J(java.lang.String str) {
    }

    public void T6() {
        this.f94813q.e(this.f94815s, this.f94814r, this.f94816t, this.f94817u);
        this.f94813q.d(this.f94806g, this.f94805f, false, new com.tencent.mm.plugin.card.ui.a1(this), null);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        T6();
        return true;
    }

    @Override // lu1.b
    public void g2(java.lang.String str, int i17, int i18) {
        this.f94809m.post(new com.tencent.mm.plugin.card.ui.b1(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488302pk;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f94805f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ght);
        this.f94808i = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.h_0);
        this.f94806g = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.h_t);
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = (com.tencent.mm.ui.tools.MMGestureGallery) findViewById(com.tencent.mm.R.id.ghs);
        this.f94807h = mMGestureGallery;
        mMGestureGallery.setVerticalFadingEdgeEnabled(false);
        this.f94807h.setHorizontalFadingEdgeEnabled(false);
        com.tencent.mm.plugin.card.ui.d1 d1Var = new com.tencent.mm.plugin.card.ui.d1(this, null);
        this.f94818v = d1Var;
        this.f94807h.setAdapter((android.widget.SpinnerAdapter) d1Var);
        this.f94807h.setSingleClickOverListener(new com.tencent.mm.plugin.card.ui.u0(this));
        this.f94807h.setOnItemLongClickListener(new com.tencent.mm.plugin.card.ui.v0(this));
        this.f94813q = new com.tencent.mm.ui.tools.s4(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (getIntent().getExtras() != null) {
            getIntent().getExtras().setClassLoader(getClass().getClassLoader());
        }
        super.onCreate(bundle);
        hideTitleView();
        this.f94811o = bundle;
        getWindow().setFlags(1024, 1024);
        com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo = (com.tencent.mm.plugin.card.model.CardGiftInfo) getIntent().getParcelableExtra("key_gift_into");
        this.f94803d = cardGiftInfo;
        if (cardGiftInfo != null) {
            cardGiftInfo.toString();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftImageUI", "imgPath:%s", this.f94804e);
        initView();
        lu1.c.b(this);
        com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo2 = this.f94803d;
        if (cardGiftInfo2 == null || com.tencent.mm.sdk.platformtools.t8.K0(cardGiftInfo2.f94651h)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftImageUI", "fromUserContentPicUrl is null");
        } else {
            com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo3 = this.f94803d;
            lu1.c.a(cardGiftInfo3.f94651h, cardGiftInfo3.f94654n, cardGiftInfo3.f94665x, 2);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        lu1.c.c(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.card.ui.d1 d1Var = this.f94818v;
        if (d1Var != null) {
            d1Var.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        android.os.Bundle bundle = this.f94811o;
        if (!this.f94812p) {
            this.f94812p = true;
            this.f94814r = getIntent().getIntExtra("img_top", 0);
            this.f94815s = getIntent().getIntExtra("img_left", 0);
            this.f94816t = getIntent().getIntExtra("img_width", 0);
            int intExtra = getIntent().getIntExtra("img_height", 0);
            this.f94817u = intExtra;
            this.f94813q.e(this.f94815s, this.f94814r, this.f94816t, intExtra);
            if (bundle == null) {
                this.f94806g.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.card.ui.y0(this));
            }
        }
        super.onStart();
    }
}
