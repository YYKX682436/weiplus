package com.tencent.mm.plugin.ball.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBallMaskAnimationView;", "Landroid/widget/FrameLayout;", "Lpv/f0;", "Landroid/graphics/Bitmap;", "bitmap", "Ljz5/f0;", "setMaskBitmap", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class FloatBallMaskAnimationView extends android.widget.FrameLayout implements pv.f0 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.WindowManager f93493d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f93494e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f93495f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Boolean f93496g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatBallMaskAnimationView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public void a() {
        this.f93496g = null;
        if (getVisibility() != 8) {
            setVisibility(8);
            setScaleX(1.0f);
            setScaleY(1.0f);
            setTranslationX(0.0f);
            setTranslationY(0.0f);
            setClipToOutline(false);
        }
    }

    public void b() {
        if (!this.f93495f) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallMaskAnimationView", "show not attached");
            this.f93496g = java.lang.Boolean.TRUE;
        } else if (getVisibility() != 0) {
            setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallMaskAnimationView", "onAttachedToWindow");
        super.onAttachedToWindow();
        this.f93495f = true;
        java.lang.Boolean bool = this.f93496g;
        if (bool != null) {
            bool.booleanValue();
            this.f93496g = null;
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallMaskAnimationView", "onDetachedFromWindow");
        this.f93495f = false;
    }

    @Override // pv.f0
    public void setMaskBitmap(android.graphics.Bitmap bitmap) {
        java.util.Objects.toString(bitmap);
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        android.widget.ImageView imageView = this.f93494e;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new rp1.w0(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatBallMaskAnimationView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f93493d = (android.view.WindowManager) systemService;
        android.view.View.inflate(context, com.tencent.mm.R.layout.f489207ei4, this);
        setVisibility(8);
        this.f93494e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.uf9);
    }
}
