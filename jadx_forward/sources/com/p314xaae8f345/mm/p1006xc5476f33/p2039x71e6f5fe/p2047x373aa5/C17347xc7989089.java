package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* renamed from: com.tencent.mm.plugin.scanner.view.ScanRectDecorView */
/* loaded from: classes13.dex */
public class C17347xc7989089 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.animation.ValueAnimator f241443d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f241444e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17343xd470dac9 f241445f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Rect f241446g;

    /* renamed from: h, reason: collision with root package name */
    public int f241447h;

    /* renamed from: i, reason: collision with root package name */
    public int f241448i;

    /* renamed from: m, reason: collision with root package name */
    public float f241449m;

    public C17347xc7989089(android.content.Context context) {
        super(context);
        this.f241449m = 0.0f;
        a();
    }

    public final void a() {
        this.f241447h = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a99);
        this.f241448i = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a98);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17343xd470dac9 c17343xd470dac9 = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17343xd470dac9(getContext());
        this.f241445f = c17343xd470dac9;
        addView(c17343xd470dac9, new android.widget.FrameLayout.LayoutParams(-1, -1));
        b();
        setWillNotDraw(false);
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f241444e = imageView;
        addView(imageView, new android.widget.FrameLayout.LayoutParams(this.f241447h, -2));
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f241444e.getLayoutParams();
        layoutParams.gravity = 1;
        this.f241444e.setLayoutParams(layoutParams);
        this.f241444e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cdk);
        this.f241444e.setVisibility(8);
        this.f241449m = 0.15384616f;
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1300L);
        this.f241443d = duration;
        duration.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.f241443d.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.u0(this));
        this.f241443d.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.v0(this));
        this.f241443d.setRepeatMode(1);
        this.f241443d.setRepeatCount(-1);
    }

    public final void b() {
        android.graphics.Point point = new android.graphics.Point();
        ((android.app.Activity) getContext()).getWindowManager().getDefaultDisplay().getSize(point);
        int i17 = (point.x / 2) - (this.f241447h / 2);
        int i18 = (point.y / 2) - (this.f241448i / 2);
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, this.f241447h + i17, this.f241448i + i18);
        this.f241446g = rect;
        this.f241445f.m68906x764f8966(rect);
    }

    public void c(int i17, int i18) {
        this.f241447h = i17;
        this.f241448i = i18;
        b();
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f241444e.getLayoutParams();
        layoutParams.width = i17;
        this.f241444e.setLayoutParams(layoutParams);
    }

    /* renamed from: getDecorRect */
    public android.graphics.Rect m68913x1edf9e33() {
        return this.f241446g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.f241443d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: setDecorRect */
    public void m68914x7b335ea7(android.graphics.Rect rect) {
        if (rect != null) {
            this.f241447h = rect.width();
            this.f241448i = rect.height();
            this.f241446g = new android.graphics.Rect(rect);
        }
        this.f241445f.m68906x764f8966(this.f241446g);
        this.f241445f.postInvalidate();
    }

    public C17347xc7989089(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f241449m = 0.0f;
        a();
    }

    public C17347xc7989089(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f241449m = 0.0f;
        a();
    }
}
