package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class AAImagPreviewUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f72429s = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.tools.MMGestureGallery f72430d;

    /* renamed from: e, reason: collision with root package name */
    public int f72431e;

    /* renamed from: f, reason: collision with root package name */
    public int f72432f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f72433g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f72434h;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.view.AnimationLayout f72436m;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.view.ViewAnimHelper$ViewInfo f72438o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f72439p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f72440q;

    /* renamed from: r, reason: collision with root package name */
    public int f72441r;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Dialog f72435i = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f72437n = false;

    public final void T6() {
        if (this.f72437n) {
            return;
        }
        this.f72437n = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.PreviewHdHeadImg", "runExitAnimation");
        this.f72436m.a(this.f72439p, this.f72440q, this.f72438o, new com.tencent.mm.plugin.aa.ui.g(this), new com.tencent.mm.plugin.aa.ui.h(this));
    }

    public final void U6(com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView, android.graphics.Bitmap bitmap) {
        int width = multiTouchImageView.getWidth();
        int height = multiTouchImageView.getHeight();
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
        multiTouchImageView.setImageMatrix(matrix);
        int width6 = bitmap.getWidth();
        int height6 = bitmap.getHeight();
        multiTouchImageView.f197651o = width6;
        multiTouchImageView.f197652p = height6;
        multiTouchImageView.setMaxZoomDoubleTab(true);
        multiTouchImageView.setImageBitmap(bitmap);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        T6();
        overridePendingTransition(com.tencent.mm.R.anim.f477902eq, com.tencent.mm.R.anim.f477903er);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487866a3;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        hideTitleView();
        fullScreenNoTitleBar(true);
        if (fp.h.c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        this.f72436m = (com.tencent.mm.view.AnimationLayout) findViewById(com.tencent.mm.R.id.f483056vf);
        this.f72440q = findViewById(com.tencent.mm.R.id.m7j);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ght);
        this.f72439p = imageView;
        if (this.f72438o == null) {
            this.f72438o = ym5.u6.b(imageView, getContext().getWindow().getDecorView());
        }
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = (com.tencent.mm.ui.tools.MMGestureGallery) findViewById(com.tencent.mm.R.id.ghs);
        this.f72430d = mMGestureGallery;
        mMGestureGallery.setVerticalFadingEdgeEnabled(false);
        this.f72430d.setHorizontalFadingEdgeEnabled(false);
        this.f72430d.setSingleClickOverListener(new com.tencent.mm.plugin.aa.ui.i(this));
        this.f72430d.setLongClickOverListener(new com.tencent.mm.plugin.aa.ui.l(this));
        this.f72430d.setAdapter((android.widget.SpinnerAdapter) new com.tencent.mm.plugin.aa.ui.u(this, null));
        this.f72430d.setAccessibilityDelegate(new com.tencent.mm.plugin.aa.ui.m(this));
        setBackBtn(new com.tencent.mm.plugin.aa.ui.n(this));
        if (this.f72437n) {
            return;
        }
        this.f72437n = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.PreviewHdHeadImg", "runEnterAnimation");
        com.tencent.mm.view.AnimationLayout animationLayout = this.f72436m;
        android.widget.ImageView imageView2 = this.f72439p;
        android.view.View view = this.f72440q;
        com.tencent.mm.view.ViewAnimHelper$ViewInfo viewAnimHelper$ViewInfo = this.f72438o;
        com.tencent.mm.plugin.aa.ui.f fVar = new com.tencent.mm.plugin.aa.ui.f(this);
        animationLayout.getClass();
        ym5.f fVar2 = new ym5.f(animationLayout, view, viewAnimHelper$ViewInfo, imageView2, fVar, null);
        if ((animationLayout.getMeasuredState() & (-16777216)) > 0) {
            fVar2.run();
        } else {
            animationLayout.getViewTreeObserver().addOnPreDrawListener(new ym5.g(animationLayout, fVar2));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        T6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        customfixStatusbar(true);
        super.onCreate(bundle);
        overridePendingTransition(com.tencent.mm.R.anim.f477902eq, com.tencent.mm.R.anim.f477903er);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        this.f72431e = getIntent().getIntExtra("use_scene", 1);
        this.f72432f = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        this.f72433g = getIntent().getStringExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        this.f72434h = getIntent().getStringExtra("url");
        this.f72438o = (com.tencent.mm.view.ViewAnimHelper$ViewInfo) getIntent().getParcelableExtra("view_info");
        this.f72441r = getIntent().getIntExtra("aa_type", 2);
        initView();
        setResult(0);
    }
}
