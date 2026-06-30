package xx0;

/* loaded from: classes2.dex */
public final class o extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f539458d;

    /* renamed from: e, reason: collision with root package name */
    public final int f539459e;

    /* renamed from: f, reason: collision with root package name */
    public final int f539460f;

    /* renamed from: g, reason: collision with root package name */
    public final int f539461g;

    public o(android.content.Context context, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f539458d = i17;
        this.f539459e = i18;
        this.f539460f = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ait);
        this.f539461g = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562132aq4);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int width = parent.getWidth();
        int u07 = parent.u0(view);
        int i17 = this.f539458d;
        int i18 = u07 % i17;
        int i19 = this.f539460f;
        int i27 = this.f539459e;
        outRect.left = (i19 + (i18 * (i27 + (((width - (i19 * 2)) - (i17 * i27)) / (i17 - 1))))) - ((((width - (i17 * i27)) / i17) + i27) * i18);
        if (u07 < i17) {
            outRect.top = this.f539461g;
        }
    }
}
