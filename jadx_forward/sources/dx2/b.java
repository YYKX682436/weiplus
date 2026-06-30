package dx2;

/* loaded from: classes2.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f326029d;

    /* renamed from: e, reason: collision with root package name */
    public final int f326030e;

    public b(android.graphics.drawable.Drawable divider, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(divider, "divider");
        this.f326029d = divider;
        this.f326030e = 1;
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
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = parent.w0(view);
        java.lang.Integer valueOf = w07 != null ? java.lang.Integer.valueOf(w07.m8185xcdaf1228()) : null;
        if (valueOf != null && valueOf.intValue() == -2) {
            return;
        }
        if (valueOf != null && valueOf.intValue() == -3) {
            return;
        }
        if (valueOf != null && valueOf.intValue() == -4) {
            return;
        }
        if (valueOf != null && valueOf.intValue() == -5) {
            return;
        }
        int i17 = this.f326030e;
        android.graphics.drawable.Drawable drawable = this.f326029d;
        if (i17 == 0) {
            outRect.set(0, 0, drawable.getBounds().width(), 0);
        } else {
            outRect.set(0, 0, 0, drawable.getBounds().height());
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo8166xc398a7c3(c17, parent, state);
        int i17 = this.f326030e;
        android.graphics.drawable.Drawable drawable = this.f326029d;
        if (i17 != 0) {
            int childCount = parent.getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = parent.getChildAt(i18);
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams;
                int left = (childAt.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin) + 0;
                int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + 0;
                drawable.setBounds(left, bottom, (childAt.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin) - 0, (drawable.getBounds().height() + bottom) - 0);
                drawable.draw(c17);
            }
            return;
        }
        int childCount2 = parent.getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            android.view.View childAt2 = parent.getChildAt(i19);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = parent.w0(childAt2);
            java.lang.Integer valueOf = w07 != null ? java.lang.Integer.valueOf(w07.m8185xcdaf1228()) : null;
            if ((valueOf == null || valueOf.intValue() != -2) && ((valueOf == null || valueOf.intValue() != -3) && ((valueOf == null || valueOf.intValue() != -4) && (valueOf == null || valueOf.intValue() != -5)))) {
                android.view.ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams3;
                int right = childAt2.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).rightMargin;
                drawable.setBounds(right, childAt2.getTop() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).topMargin, drawable.getBounds().width() + right, childAt2.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin);
                drawable.draw(c17);
            }
        }
    }
}
