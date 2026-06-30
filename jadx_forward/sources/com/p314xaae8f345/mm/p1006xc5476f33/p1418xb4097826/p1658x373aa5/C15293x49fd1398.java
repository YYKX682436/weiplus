package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderHalfContactHeartLikePermissionItem;", "Landroid/widget/FrameLayout;", "", "d", "Ljz5/g;", "getEdge2A", "()I", "edge2A", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderHalfContactHeartLikePermissionItem */
/* loaded from: classes4.dex */
public final class C15293x49fd1398 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g edge2A;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f212654e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f212655f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15293x49fd1398(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.edge2A = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ua(this));
        a();
    }

    /* renamed from: getEdge2A */
    private final int m62094x17221bc2() {
        return ((java.lang.Number) this.edge2A.mo141623x754a37bb()).intValue();
    }

    public final void a() {
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570703eh1, (android.view.ViewGroup) this, true);
        this.f212654e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.upm);
        this.f212655f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.upk);
        android.widget.TextView textView = this.f212654e;
        if (textView == null) {
            return;
        }
        java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ogk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        textView.setText(hc2.x0.k(string, context, '#', com.p314xaae8f345.mm.R.C30861xcebc809e.d5e, com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833, m62094x17221bc2(), m62094x17221bc2(), 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null));
    }

    public final java.lang.CharSequence b(java.lang.CharSequence charSequence) {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return hc2.x0.k(charSequence, context, '#', com.p314xaae8f345.mm.R.C30861xcebc809e.d5e, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832, m62094x17221bc2(), m62094x17221bc2(), 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
    }

    public final java.lang.CharSequence c(java.lang.CharSequence charSequence, int i17) {
        java.lang.CharSequence j17;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        j17 = hc2.x0.j(charSequence, context, i17, com.p314xaae8f345.mm.R.C30861xcebc809e.d5e, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832, m62094x17221bc2(), m62094x17221bc2(), (r23 & 64) != 0 ? 0 : 0, (r23 & 128) != 0 ? 0 : 0, (r23 & 256) != 0 ? 1 : 0);
        return j17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15293x49fd1398(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.edge2A = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ua(this));
        a();
    }
}
