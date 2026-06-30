package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.AsyncMaskImageView */
/* loaded from: classes14.dex */
public class C17941xa09a2818 extends android.widget.ImageView {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f247746h = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f247747d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f247748e;

    /* renamed from: f, reason: collision with root package name */
    public final int f247749f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f247750g;

    public C17941xa09a2818(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f247749f = 90;
        this.f247750g = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        this.f247747d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f247748e = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.s0(this);
        super.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.t0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        super.onAttachedToWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        super.onDraw(canvas);
        if (isPressed()) {
            canvas.drawARGB(this.f247749f, 0, 0, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnTouchListener", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        iz5.a.g(null, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnTouchListener", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
    }

    /* renamed from: settouchEnable */
    public void m70547x59285800(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("settouchEnable", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        this.f247750g = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("settouchEnable", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
    }
}
