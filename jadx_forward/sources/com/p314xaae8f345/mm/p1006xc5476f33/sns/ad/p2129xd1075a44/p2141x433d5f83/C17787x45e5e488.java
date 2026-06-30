package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2141x433d5f83;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB%\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/animlabel/AnimLabelView;", "Landroid/widget/RelativeLayout;", "", "outContentW", "Ljz5/f0;", "setContentWidth", "Lc84/f;", "value", "setContentDisappearListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView */
/* loaded from: classes4.dex */
public final class C17787x45e5e488 extends android.widget.RelativeLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f245041r = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f245042d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f245043e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f245044f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f245045g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f245046h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f245047i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2141x433d5f83.C17788x6b5d94e7 f245048m;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.AnimatorSet f245049n;

    /* renamed from: o, reason: collision with root package name */
    public android.animation.AnimatorSet f245050o;

    /* renamed from: p, reason: collision with root package name */
    public android.animation.AnimatorSet f245051p;

    /* renamed from: q, reason: collision with root package name */
    public c84.f f245052q;

    public C17787x45e5e488(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        setVisibility(0);
        android.widget.ImageView imageView = this.f245047i;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mArrowIcon");
            throw null;
        }
        imageView.setAlpha(0.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startContentAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        if (this.f245050o == null) {
            float b17 = i65.a.b(getContext(), 12);
            android.view.View view = this.f245043e;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContentView");
                throw null;
            }
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", -b17, 0.0f);
            ofFloat.setDuration(500L);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
            android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
            ofFloat.setInterpolator(pathInterpolator);
            android.view.View view2 = this.f245043e;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContentView");
                throw null;
            }
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f);
            ofFloat2.setDuration(500L);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
            android.view.animation.PathInterpolator pathInterpolator2 = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
            ofFloat2.setInterpolator(pathInterpolator2);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.addListener(new p84.g(this));
            this.f245050o = animatorSet;
        }
        android.animation.AnimatorSet animatorSet2 = this.f245050o;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startContentAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startBackgroundAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2141x433d5f83.C17788x6b5d94e7 c17788x6b5d94e7 = this.f245048m;
        if (c17788x6b5d94e7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBackgroundView");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startTranslateAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        c17788x6b5d94e7.f245059m = false;
        int measuredWidth = c17788x6b5d94e7.getMeasuredWidth();
        if (measuredWidth == 0 && (i17 = c17788x6b5d94e7.f245060n) != 0) {
            measuredWidth = i17;
        }
        int i18 = measuredWidth + c17788x6b5d94e7.f245054e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c17788x6b5d94e7.f245053d, "startTranslateAnim, isStoped=" + c17788x6b5d94e7.f245059m + ", transDis=" + i18 + ", measuredWidth=" + c17788x6b5d94e7.getMeasuredWidth() + ", outW=" + c17788x6b5d94e7.f245060n);
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(c17788x6b5d94e7, "midDrawLeftEdge", -i18, 0);
        ofInt.setDuration(1000L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
        android.view.animation.PathInterpolator pathInterpolator3 = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
        ofInt.setInterpolator(pathInterpolator3);
        android.animation.ObjectAnimator ofInt2 = android.animation.ObjectAnimator.ofInt(c17788x6b5d94e7, "midDrawLeftEdge", 0, 0);
        ofInt2.setDuration(500L);
        android.animation.ObjectAnimator ofInt3 = android.animation.ObjectAnimator.ofInt(c17788x6b5d94e7, "midDrawLeftEdge", 0, i18);
        ofInt3.setDuration(1000L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
        android.view.animation.PathInterpolator pathInterpolator4 = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
        ofInt3.setInterpolator(pathInterpolator4);
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        animatorSet3.play(ofInt);
        animatorSet3.play(ofInt2).after(ofInt);
        animatorSet3.play(ofInt3).after(ofInt2);
        animatorSet3.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startTranslateAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startBackgroundAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        super.onDetachedFromWindow();
        android.animation.AnimatorSet animatorSet = this.f245049n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
    }

    /* renamed from: setContentDisappearListener */
    public final void m69569x1b1bcc80(c84.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContentDisappearListener", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        this.f245052q = fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContentDisappearListener", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
    }

    /* renamed from: setContentWidth */
    public final void m69570xc85a7a4f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContentWidth", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2141x433d5f83.C17788x6b5d94e7 c17788x6b5d94e7 = this.f245048m;
        if (c17788x6b5d94e7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBackgroundView");
            throw null;
        }
        c17788x6b5d94e7.m69571xc85a7a4f(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContentWidth", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
    }

    public C17787x45e5e488(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f245042d = "AnimLabelView";
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.coo, (android.view.ViewGroup) this, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.lbg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f245044f = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.lbh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f245045g = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.cuv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f245046h = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.a4s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f245047i = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.chq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f245043e = findViewById5;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2141x433d5f83.C17788x6b5d94e7 c17788x6b5d94e7 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2141x433d5f83.C17788x6b5d94e7(getContext(), null);
        this.f245048m = c17788x6b5d94e7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopTranslateAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        c17788x6b5d94e7.f245059m = true;
        c17788x6b5d94e7.invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopTranslateAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2141x433d5f83.C17788x6b5d94e7 c17788x6b5d94e72 = this.f245048m;
        if (c17788x6b5d94e72 != null) {
            addView(c17788x6b5d94e72, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBackgroundView");
            throw null;
        }
    }
}
