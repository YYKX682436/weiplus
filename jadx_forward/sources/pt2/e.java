package pt2;

/* loaded from: classes2.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f439779d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.C14959x1a54a2ac c14959x1a54a2ac, int i17) {
        this.f439779d = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = parent.w0(view);
        int i17 = this.f439779d;
        int i18 = (int) (i17 / 2.0f);
        outRect.top = i17;
        android.view.ViewGroup.LayoutParams layoutParams = w07.f3639x46306858.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams)) {
            outRect.left = i17;
            outRect.right = i17;
        } else if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams).e() == 0) {
            outRect.left = i17;
            outRect.right = i18;
        } else {
            outRect.left = i18;
            outRect.right = i17;
        }
    }
}
