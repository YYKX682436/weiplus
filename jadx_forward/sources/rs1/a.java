package rs1;

/* loaded from: classes3.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f480854d;

    /* renamed from: e, reason: collision with root package name */
    public final int f480855e;

    /* renamed from: f, reason: collision with root package name */
    public final int f480856f;

    public a(int i17, int i18, int i19) {
        this.f480854d = i17;
        this.f480855e = i18;
        this.f480856f = i19;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        int i17;
        int i18;
        int i19;
        int i27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        int u07 = parent.u0(view);
        if (u07 != -1 && (i17 = this.f480854d) > 1 && (i18 = this.f480856f) > 0 && (i19 = this.f480855e) > 0 && (i27 = u07 % i17) >= 0 && i27 < i17) {
            int i28 = i19 - (i18 * i17);
            float f17 = (i28 > 0 ? i28 / i17 : 0.0f) / (i17 - 1);
            if (i27 == 0) {
                outRect.left = 0;
                outRect.right = 0;
            } else {
                outRect.left = (int) (i27 * f17);
                outRect.right = 0;
            }
        }
    }
}
