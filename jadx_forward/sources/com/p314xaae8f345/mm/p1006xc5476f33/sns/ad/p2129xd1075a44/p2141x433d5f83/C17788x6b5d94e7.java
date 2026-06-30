package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2141x433d5f83;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB%\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/animlabel/LabelBackgroundView;", "Landroid/widget/FrameLayout;", "", "outContentW", "Ljz5/f0;", "setContentWidth", "leftEdge", "setMidDrawLeftEdge", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView */
/* loaded from: classes4.dex */
public final class C17788x6b5d94e7 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f245053d;

    /* renamed from: e, reason: collision with root package name */
    public int f245054e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f245055f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f245056g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f245057h;

    /* renamed from: i, reason: collision with root package name */
    public int f245058i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f245059m;

    /* renamed from: n, reason: collision with root package name */
    public int f245060n;

    public C17788x6b5d94e7(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.dispatchDraw(canvas);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshDraw", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        if (this.f245059m) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshDraw", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        } else {
            android.graphics.drawable.Drawable drawable = this.f245056g;
            if (drawable == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMidDrawable");
                throw null;
            }
            int i17 = this.f245058i;
            drawable.setBounds(i17, 0, getMeasuredWidth() + i17, getMeasuredHeight());
            android.graphics.drawable.GradientDrawable gradientDrawable = this.f245055f;
            if (gradientDrawable == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mLeftDrawable");
                throw null;
            }
            int i18 = this.f245058i;
            gradientDrawable.setBounds(i18 - this.f245054e, 0, i18, getMeasuredHeight());
            android.graphics.drawable.GradientDrawable gradientDrawable2 = this.f245057h;
            if (gradientDrawable2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRightDrawable");
                throw null;
            }
            gradientDrawable2.setBounds(this.f245058i + getMeasuredWidth(), 0, this.f245058i + getMeasuredWidth() + this.f245054e, getMeasuredHeight());
            android.graphics.drawable.GradientDrawable gradientDrawable3 = this.f245055f;
            if (gradientDrawable3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mLeftDrawable");
                throw null;
            }
            gradientDrawable3.draw(canvas);
            android.graphics.drawable.Drawable drawable2 = this.f245056g;
            if (drawable2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMidDrawable");
                throw null;
            }
            drawable2.draw(canvas);
            android.graphics.drawable.GradientDrawable gradientDrawable4 = this.f245057h;
            if (gradientDrawable4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRightDrawable");
                throw null;
            }
            gradientDrawable4.draw(canvas);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshDraw", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
    }

    /* renamed from: setContentWidth */
    public final void m69571xc85a7a4f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContentWidth", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        this.f245060n = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContentWidth", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
    }

    /* renamed from: setMidDrawLeftEdge */
    public final void m69572x6bb66d6e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMidDrawLeftEdge", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        if (!this.f245059m) {
            this.f245058i = i17;
            invalidate();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMidDrawLeftEdge", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17788x6b5d94e7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.f245053d = "LabelBackgroundView";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        this.f245054e = i65.a.b(getContext(), 80);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(new int[]{android.graphics.Color.parseColor("#00000000"), android.graphics.Color.parseColor("#7f000000")});
        this.f245055f = gradientDrawable;
        this.f245056g = new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor("#7f000000"));
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setGradientType(0);
        gradientDrawable2.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable2.setColors(new int[]{android.graphics.Color.parseColor("#7f000000"), android.graphics.Color.parseColor("#00000000")});
        this.f245057h = gradientDrawable2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
    }
}
