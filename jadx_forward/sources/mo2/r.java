package mo2;

/* loaded from: classes2.dex */
public final class r extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f411934d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f411935e;

    public r(android.graphics.drawable.Drawable divider, int[] padding, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(divider, "divider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(padding, "padding");
        this.f411934d = divider;
        this.f411935e = padding;
        divider.setBounds(0, 0, 0, i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        if (parent.v0(view) == 0) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = parent.w0(view);
        java.lang.Integer valueOf = w07 != null ? java.lang.Integer.valueOf(w07.m8185xcdaf1228()) : null;
        if (valueOf != null && valueOf.intValue() == -17) {
            return;
        }
        outRect.set(0, this.f411934d.getBounds().height(), 0, 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo8166xc398a7c3(c17, parent, state);
        int childCount = parent.getChildCount();
        for (int i17 = 1; i17 < childCount; i17++) {
            android.view.View childAt = parent.getChildAt(i17);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = parent.w0(childAt);
            java.lang.Integer valueOf = w07 != null ? java.lang.Integer.valueOf(w07.m8185xcdaf1228()) : null;
            if (valueOf == null || valueOf.intValue() != -17) {
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams;
                int left = childAt.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                int[] iArr = this.f411935e;
                int i18 = left + iArr[0];
                int right = (childAt.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin) - iArr[2];
                int top = childAt.getTop();
                android.graphics.drawable.Drawable drawable = this.f411934d;
                drawable.setBounds(i18, (top - drawable.getBounds().height()) + iArr[1], right, childAt.getTop() - iArr[3]);
                drawable.draw(c17);
            }
        }
    }
}
