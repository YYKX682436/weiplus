package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderBubbleLayout;", "Landroid/widget/FrameLayout;", "", "resId", "Ljz5/f0;", "setContent", "color", "setBubbleColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderBubbleLayout */
/* loaded from: classes2.dex */
public final class C15255xb682823c extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f212406d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f212407e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15255xb682823c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aer, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.b1p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f212406d = imageView;
        imageView.setEnabled(false);
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.b1o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f212407e = (android.widget.FrameLayout) findViewById2;
    }

    /* renamed from: setBubbleColor */
    public final void m61706x9d1d3c75(int i17) {
        this.f212406d.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79144x80f8d20f, i17));
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(i17);
        gradientDrawable.setCornerRadius(getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
        this.f212407e.setBackground(gradientDrawable);
    }

    /* renamed from: setContent */
    public final void m61707xe9f5bdb7(int i17) {
        android.view.LayoutInflater.from(getContext()).inflate(i17, (android.view.ViewGroup) this.f212407e, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15255xb682823c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aer, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.b1p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f212406d = imageView;
        imageView.setEnabled(false);
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.b1o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f212407e = (android.widget.FrameLayout) findViewById2;
    }
}
