package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/shakead/bidding/CommonShakeView;", "Landroid/widget/FrameLayout;", "", "isShakable", "Ljz5/f0;", "setDebugTipColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView */
/* loaded from: classes4.dex */
public final class C17816xdbf1b100 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f245410d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17816xdbf1b100(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: setDebugTipColor */
    public final void m69691x5c74c1b9(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDebugTipColor", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView");
        if (z17) {
            android.widget.TextView textView = this.f245410d;
            if (textView != null) {
                textView.setTextColor(-65536);
            }
        } else {
            android.widget.TextView textView2 = this.f245410d;
            if (textView2 != null) {
                textView2.setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.adh));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDebugTipColor", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17816xdbf1b100(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView");
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommonShakeView", "com.tencent.mm.plugin.sns.ad.improve.layout.builder.AdCommBizLayoutBuilder");
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 c0092xf45d4375 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375(context2, null);
        c44.a.o();
        if (c0092xf45d4375.getLayoutParams() == null) {
            c44.a.o();
            c0092xf45d4375.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = c0092xf45d4375.getLayoutParams();
            layoutParams.width = -2;
            c0092xf45d4375.setLayoutParams(layoutParams);
        }
        c44.a.l();
        if (c0092xf45d4375.getLayoutParams() == null) {
            c44.a.o();
            c0092xf45d4375.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = c0092xf45d4375.getLayoutParams();
            layoutParams2.height = -1;
            c0092xf45d4375.setLayoutParams(layoutParams2);
        }
        int a17 = c44.b.a(10);
        android.view.ViewGroup.LayoutParams layoutParams3 = c0092xf45d4375.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = a17;
        }
        int a18 = c44.b.a(10);
        android.view.ViewGroup.LayoutParams layoutParams4 = c0092xf45d4375.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.rightMargin = a18;
        }
        c0092xf45d4375.setGravity(c44.a.d());
        c0092xf45d4375.setTextSize(0, c44.b.a(12));
        c0092xf45d4375.setTextColor(i65.a.d(c0092xf45d4375.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.adh));
        java.lang.String string = c0092xf45d4375.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574703ls2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        c0092xf45d4375.setText(string);
        c0092xf45d4375.setIncludeFontPadding(false);
        c0092xf45d4375.setMaxLines(1);
        c0092xf45d4375.setShadowLayer(1.0f, 0.0f, 1.0f, android.graphics.Color.parseColor("#33000000"));
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.b(c0092xf45d4375, 5, (int) c0092xf45d4375.getTextSize(), 1, 0);
        android.graphics.drawable.Drawable drawable = context2.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.coc);
        if (drawable != null) {
            drawable.setBounds(0, 0, c44.b.a(16), c44.b.a(16));
        }
        c0092xf45d4375.setCompoundDrawables(drawable, null, null, null);
        c0092xf45d4375.setCompoundDrawablePadding(c44.b.a(4));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommonShakeView", "com.tencent.mm.plugin.sns.ad.improve.layout.builder.AdCommBizLayoutBuilder");
        this.f245410d = c0092xf45d4375;
        setBackground(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, android.graphics.Color.parseColor("#8C000000")}));
        android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(c0092xf45d4375.getLayoutParams());
        layoutParams5.gravity = 1;
        addView(c0092xf45d4375, layoutParams5);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView");
    }
}
