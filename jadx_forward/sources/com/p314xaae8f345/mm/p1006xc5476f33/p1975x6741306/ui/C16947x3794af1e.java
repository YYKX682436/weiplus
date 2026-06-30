package com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView;", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialSmoothScrollView;", "", "Lqs3/v;", "i", "Lqs3/v;", "getOnItemClickListener", "()Lqs3/v;", "setOnItemClickListener", "(Lqs3/v;)V", "onItemClickListener", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;", "m", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;", "getMTable", "()Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;", "setMTable", "(Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;)V", "mTable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-radar_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.radar.ui.RadarSpecialGridView */
/* loaded from: classes3.dex */
public final class C16947x3794af1e extends com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16948x67c5bc73 implements xn5.a0 {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public qs3.v onItemClickListener;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5 mTable;

    /* renamed from: n, reason: collision with root package name */
    public int f236531n;

    /* renamed from: o, reason: collision with root package name */
    public int f236532o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16947x3794af1e(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        m67802x1719de63(new com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5(context2));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        m67800x23e4aa57().setLayoutParams(layoutParams);
        m67800x23e4aa57().setStretchAllColumns(true);
        m67800x23e4aa57().setShrinkAllColumns(true);
        m67800x23e4aa57().setGravity(80);
        addView(m67800x23e4aa57());
    }

    /* renamed from: getMTable */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5 m67800x23e4aa57() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5 c16949x6f38aba5 = this.mTable;
        if (c16949x6f38aba5 != null) {
            return c16949x6f38aba5;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTable");
        throw null;
    }

    public final qs3.v getOnItemClickListener() {
        return this.onItemClickListener;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int scrollX;
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = 0;
        if (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            scrollX = (getScrollX() + childAt.getWidth()) - this.f236532o;
            this.f236532o = childAt.getWidth();
            if (scrollX <= 0) {
                scrollX = 0;
            }
        } else {
            scrollX = getScrollX();
        }
        if (getChildCount() > 0) {
            android.view.View childAt2 = getChildAt(0);
            int scrollY = (getScrollY() + childAt2.getHeight()) - this.f236531n;
            this.f236531n = childAt2.getHeight();
            if (scrollY > 0) {
                i28 = scrollY;
            }
        } else {
            i28 = getScrollY();
        }
        scrollTo(scrollX, i28);
    }

    /* renamed from: setMTable */
    public final void m67802x1719de63(com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5 c16949x6f38aba5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c16949x6f38aba5, "<set-?>");
        this.mTable = c16949x6f38aba5;
    }

    /* renamed from: setOnItemClickListener */
    public final void m67803xa1aeda28(qs3.v vVar) {
        this.onItemClickListener = vVar;
    }
}
