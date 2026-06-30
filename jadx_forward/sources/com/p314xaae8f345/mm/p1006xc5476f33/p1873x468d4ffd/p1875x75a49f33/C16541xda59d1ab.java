package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB%\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011R$\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/mmsight/segment/SegmentClipTimeCursorView;", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "getRoot", "()Landroid/widget/LinearLayout;", "setRoot", "(Landroid/widget/LinearLayout;)V", "root", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mmsightui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mmsight.segment.SegmentClipTimeCursorView */
/* loaded from: classes3.dex */
public final class C16541xda59d1ab extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f230461d;

    /* renamed from: e, reason: collision with root package name */
    public final long f230462e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.widget.LinearLayout root;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f230464g;

    public C16541xda59d1ab(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final android.widget.LinearLayout getRoot() {
        return this.root;
    }

    /* renamed from: setRoot */
    public final void m66931x764fb064(android.widget.LinearLayout linearLayout) {
        this.root = linearLayout;
    }

    public C16541xda59d1ab(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f230462e = 1000L;
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cjg, (android.view.ViewGroup) this, true);
        android.widget.LinearLayout linearLayout = inflate instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) inflate : null;
        this.root = linearLayout;
        android.widget.TextView textView = linearLayout != null ? (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.gdo) : null;
        this.f230464g = textView instanceof android.widget.TextView ? textView : null;
    }
}
