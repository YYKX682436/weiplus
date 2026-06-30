package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\tJ\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/ContentFloatBallEduView;", "Landroid/widget/FrameLayout;", "Landroid/widget/PopupWindow$OnDismissListener;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Ljz5/f0;", "setDismissListener", "", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "setEduText", "", "marginOfRight", "setArrowIconPosition", "marginEnd", "setMarginEnd", "topOffsetY", "setTopOffsetY", "Landroid/view/ViewGroup$LayoutParams;", "params", "setLayoutParams", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ball-impl-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ball.view.ContentFloatBallEduView */
/* loaded from: classes7.dex */
public final class C12915xed9c02f9 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f174931d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f174932e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f174933f;

    /* renamed from: g, reason: collision with root package name */
    public int f174934g;

    /* renamed from: h, reason: collision with root package name */
    public int f174935h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.PopupWindow.OnDismissListener f174936i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12915xed9c02f9(android.content.Context context) {
        this(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: setArrowIconPosition */
    public final void m54091x9baa4729(int i17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f174931d;
        if (c22699x3dcdb352 == null) {
            return;
        }
        if (c22699x3dcdb352 == null || (layoutParams = c22699x3dcdb352.getLayoutParams()) == null) {
            layoutParams = null;
        } else if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(i17 + com.p314xaae8f345.mm.ui.zk.a(getContext(), 21));
        }
        c22699x3dcdb352.setLayoutParams(layoutParams);
    }

    /* renamed from: setDismissListener */
    public final void m54092x2051c9c(android.widget.PopupWindow.OnDismissListener listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f174936i = listener;
    }

    /* renamed from: setEduText */
    public final void m54093x4150ff41(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        android.widget.TextView textView = this.f174932e;
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(this.f174935h - com.p314xaae8f345.mm.ui.zk.a(getContext(), 13));
            marginLayoutParams.topMargin = this.f174934g - com.p314xaae8f345.mm.ui.zk.a(getContext(), 21);
        }
        super.setLayoutParams(layoutParams);
    }

    /* renamed from: setMarginEnd */
    public final void m54094x1d7ab60b(int i17) {
        this.f174935h = i17;
    }

    /* renamed from: setTopOffsetY */
    public final void m54095x90c9d113(int i17) {
        this.f174934g = i17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12915xed9c02f9(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12915xed9c02f9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570731ei0, this);
        this.f174931d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.txa);
        this.f174932e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.txe);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.txb);
        this.f174933f = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new rp1.b(this));
        }
    }
}
