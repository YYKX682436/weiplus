package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* renamed from: com.tencent.mm.plugin.aa.ui.AAImagPreviewUI */
/* loaded from: classes9.dex */
public class ActivityC11339x6e0beaf2 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f153962s = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 f153963d;

    /* renamed from: e, reason: collision with root package name */
    public int f153964e;

    /* renamed from: f, reason: collision with root package name */
    public int f153965f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f153966g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f153967h;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae f153969m;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22815x98b0aff3 f153971o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f153972p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f153973q;

    /* renamed from: r, reason: collision with root package name */
    public int f153974r;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Dialog f153968i = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f153970n = false;

    public final void T6() {
        if (this.f153970n) {
            return;
        }
        this.f153970n = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreviewHdHeadImg", "runExitAnimation");
        this.f153969m.a(this.f153972p, this.f153973q, this.f153971o, new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g(this), new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.h(this));
    }

    public final void U6(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a, android.graphics.Bitmap bitmap) {
        int width = c21524xecd57b9a.getWidth();
        int height = c21524xecd57b9a.getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.reset();
        float width2 = bitmap.getWidth() / bitmap.getHeight();
        float f17 = 1.0f;
        if (bitmap.getHeight() / bitmap.getWidth() >= 2.0f && bitmap.getHeight() >= 480) {
            float f18 = width;
            float width3 = f18 / bitmap.getWidth();
            if (bitmap.getWidth() / f18 > 1.0d) {
                matrix.postScale(width3, width3);
                bitmap.getHeight();
                matrix.postTranslate((f18 - (bitmap.getWidth() * width3)) / 2.0f, 0.0f);
            } else {
                matrix.postScale(1.0f, 1.0f);
                matrix.postTranslate((width - bitmap.getWidth()) / 2, 0.0f);
            }
        } else if (width2 < 2.0f || bitmap.getWidth() < 480) {
            float f19 = width;
            float width4 = f19 / bitmap.getWidth();
            float f27 = height;
            float height2 = f27 / bitmap.getHeight();
            if (width4 >= height2) {
                width4 = height2;
            }
            float width5 = bitmap.getWidth() / f19;
            float height3 = bitmap.getHeight() / f27;
            if (width5 <= height3) {
                width5 = height3;
            }
            if (width5 > 1.0d) {
                matrix.postScale(width4, width4);
                f17 = width4;
            }
            matrix.postTranslate((f19 - (bitmap.getWidth() * f17)) / 2.0f, (f27 - (bitmap.getHeight() * f17)) / 2.0f);
        } else {
            float height4 = bitmap.getHeight() / 480.0f;
            float height5 = 480.0f / bitmap.getHeight();
            if (height4 > 1.0d) {
                matrix.postScale(height4, height5);
                matrix.postTranslate(0.0f, (height - 480) / 2);
            } else {
                matrix.postScale(1.0f, 1.0f);
                matrix.postTranslate(0.0f, (height - bitmap.getHeight()) / 2);
            }
        }
        c21524xecd57b9a.setImageMatrix(matrix);
        int width6 = bitmap.getWidth();
        int height6 = bitmap.getHeight();
        c21524xecd57b9a.f279184o = width6;
        c21524xecd57b9a.f279185p = height6;
        c21524xecd57b9a.m79201x4cf4f0ef(true);
        c21524xecd57b9a.setImageBitmap(bitmap);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        T6();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559435eq, com.p314xaae8f345.mm.R.C30854x2dc211.f559436er);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569399a3;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        m78531x8f8cf1fb();
        m78505x1ef531b7(true);
        if (fp.h.c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        this.f153969m = (com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae) findViewById(com.p314xaae8f345.mm.R.id.f564589vf);
        this.f153973q = findViewById(com.p314xaae8f345.mm.R.id.m7j);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ght);
        this.f153972p = imageView;
        if (this.f153971o == null) {
            this.f153971o = ym5.u6.b(imageView, mo55332x76847179().getWindow().getDecorView());
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89) findViewById(com.p314xaae8f345.mm.R.id.ghs);
        this.f153963d = c22506x89e75b89;
        c22506x89e75b89.setVerticalFadingEdgeEnabled(false);
        this.f153963d.setHorizontalFadingEdgeEnabled(false);
        this.f153963d.mo55657x3be48126(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.i(this));
        this.f153963d.mo55655xf8a6a4f2(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.l(this));
        this.f153963d.setAdapter((android.widget.SpinnerAdapter) new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.u(this, null));
        this.f153963d.setAccessibilityDelegate(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.m(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.n(this));
        if (this.f153970n) {
            return;
        }
        this.f153970n = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreviewHdHeadImg", "runEnterAnimation");
        com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae c22779x313407ae = this.f153969m;
        android.widget.ImageView imageView2 = this.f153972p;
        android.view.View view = this.f153973q;
        com.p314xaae8f345.mm.p2776x373aa5.C22815x98b0aff3 c22815x98b0aff3 = this.f153971o;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.f(this);
        c22779x313407ae.getClass();
        ym5.f fVar2 = new ym5.f(c22779x313407ae, view, c22815x98b0aff3, imageView2, fVar, null);
        if ((c22779x313407ae.getMeasuredState() & (-16777216)) > 0) {
            fVar2.run();
        } else {
            c22779x313407ae.getViewTreeObserver().addOnPreDrawListener(new ym5.g(c22779x313407ae, fVar2));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        T6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78497xc03943d(true);
        super.onCreate(bundle);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559435eq, com.p314xaae8f345.mm.R.C30854x2dc211.f559436er);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        this.f153964e = getIntent().getIntExtra("use_scene", 1);
        this.f153965f = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
        this.f153966g = getIntent().getStringExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        this.f153967h = getIntent().getStringExtra("url");
        this.f153971o = (com.p314xaae8f345.mm.p2776x373aa5.C22815x98b0aff3) getIntent().getParcelableExtra("view_info");
        this.f153974r = getIntent().getIntExtra("aa_type", 2);
        mo43517x10010bd5();
        setResult(0);
    }
}
