package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.TouchImageView */
/* loaded from: classes4.dex */
public class C18149x2128f641 extends android.widget.ImageView {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f249179m = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f249180d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f249181e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f249182f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f249183g;

    /* renamed from: h, reason: collision with root package name */
    public final int f249184h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f249185i;

    public C18149x2128f641(android.content.Context context) {
        super(context);
        this.f249182f = new android.graphics.RectF();
        this.f249183g = new android.graphics.Paint();
        this.f249184h = 90;
        this.f249185i = true;
        a();
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.TouchImageView");
        this.f249180d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f249181e = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.gy(this);
        super.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hy(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.TouchImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        super.onAttachedToWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.TouchImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.TouchImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        super.onDraw(canvas);
        if (isPressed()) {
            float paddingLeft = getPaddingLeft();
            android.graphics.RectF rectF = this.f249182f;
            rectF.left = paddingLeft;
            rectF.top = getPaddingTop();
            rectF.right = getWidth() - getPaddingRight();
            rectF.bottom = getHeight() - getPaddingBottom();
            android.graphics.Paint paint = this.f249183g;
            paint.setARGB(this.f249184h, 0, 0, 0);
            canvas.drawRoundRect(rectF, getWidth() / 10, getHeight() / 10, paint);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.ui.TouchImageView");
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnTouchListener", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnTouchListener", "com.tencent.mm.plugin.sns.ui.TouchImageView");
    }

    /* renamed from: settouchEnable */
    public void m70820x59285800(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("settouchEnable", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        this.f249185i = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("settouchEnable", "com.tencent.mm.plugin.sns.ui.TouchImageView");
    }

    public C18149x2128f641(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f249182f = new android.graphics.RectF();
        this.f249183g = new android.graphics.Paint();
        this.f249184h = 90;
        this.f249185i = true;
        a();
    }
}
