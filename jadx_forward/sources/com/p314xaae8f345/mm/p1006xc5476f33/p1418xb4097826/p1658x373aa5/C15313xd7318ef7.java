package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u000eJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLiveFansView;", "Landroid/widget/FrameLayout;", "", "", "fansLevel", "Ljz5/f0;", "setFansLevel", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderLiveFansView */
/* loaded from: classes.dex */
public final class C15313xd7318ef7 extends android.widget.FrameLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f212729d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f212730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15313xd7318ef7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aqq, (android.view.ViewGroup) this, true);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ecy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f212729d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ecz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f212730e = (android.widget.TextView) findViewById2;
    }

    /* renamed from: setFansLevel */
    public final void m62158x4ee0dd62(int i17) {
        android.widget.ImageView imageView = this.f212729d;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fansLevelIcons");
            throw null;
        }
        imageView.setImageResource(0);
        android.widget.TextView textView = this.f212730e;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(i17));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fansLevelTv");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15313xd7318ef7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aqq, (android.view.ViewGroup) this, true);
    }
}
