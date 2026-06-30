package dv2;

/* loaded from: classes2.dex */
public final class u0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f325485d;

    /* renamed from: e, reason: collision with root package name */
    public final int f325486e;

    /* renamed from: f, reason: collision with root package name */
    public final int f325487f;

    /* renamed from: g, reason: collision with root package name */
    public final int f325488g;

    public u0(android.content.Context context) {
        int i17 = com.p314xaae8f345.mm.ui.bh.a(context).f278668a;
        this.f325485d = i17;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ajy);
        this.f325486e = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        this.f325487f = dimensionPixelSize2;
        this.f325488g = ((i17 - dimensionPixelSize) - (dimensionPixelSize2 * 2)) / 2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        int u07 = parent.u0(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = parent.getLayoutManager();
        int m8020x7e414b06 = layoutManager != null ? layoutManager.m8020x7e414b06() : 0;
        int i17 = this.f325487f;
        int i18 = this.f325486e;
        int i19 = this.f325485d;
        int i27 = this.f325488g;
        outRect.set(u07 == 0 ? ((i19 - i18) - i27) - i17 : i27 / 2, 0, u07 == m8020x7e414b06 + (-1) ? ((i19 - i18) - i27) - i17 : i27 / 2, 0);
    }
}
