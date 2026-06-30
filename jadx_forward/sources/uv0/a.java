package uv0;

/* loaded from: classes3.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f512849d;

    /* renamed from: e, reason: collision with root package name */
    public final int f512850e;

    public a(int i17, int i18) {
        this.f512849d = i17;
        this.f512850e = i18;
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
        int i17 = this.f512849d;
        int i18 = this.f512850e;
        if (u07 == 0) {
            outRect.left = i17;
        } else {
            outRect.left = i18;
        }
        if (u07 == state.b() - 1) {
            outRect.right = i17;
        } else {
            outRect.right = i18;
        }
    }
}
