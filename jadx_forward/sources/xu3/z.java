package xu3;

/* loaded from: classes5.dex */
public final class z extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f538809d;

    /* renamed from: e, reason: collision with root package name */
    public final int f538810e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f538811f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f538812g;

    public z(int i17, int i18, int i19, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f538809d = i17;
        this.f538810e = i18;
        this.f538811f = z17;
        this.f538812g = new android.graphics.drawable.ColorDrawable(i19);
    }

    public final int d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) {
            return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager).f93394w;
        }
        if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) {
            return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager).f93453d;
        }
        return -1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int d17 = d(parent);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7946xf939df19);
        int mo1894x7e414b06 = mo7946xf939df19.mo1894x7e414b06();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int b17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams).b();
        if (b17 < 0) {
            return;
        }
        int i19 = b17 % d17;
        int i27 = this.f538810e;
        int i28 = (i19 * i27) / d17;
        boolean z17 = true;
        int i29 = i27 - (((i19 + 1) * i27) / d17);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = parent.getLayoutManager();
        if (!(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) ? !(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) || (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager).f93457h != 1 ? (b17 + 1) % d17 != 0 : (i17 = mo1894x7e414b06 % d17) != 0 ? b17 < mo1894x7e414b06 - i17 : b17 < mo1894x7e414b06 - d17) : (i18 = mo1894x7e414b06 % d17) != 0 ? b17 < mo1894x7e414b06 - i18 : b17 < mo1894x7e414b06 - d17) {
            z17 = false;
        }
        outRect.set(i28, 0, i29, (!z17 || this.f538811f) ? this.f538809d : 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDrawOver */
    public void mo7903x73cebf37(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        boolean z17;
        android.graphics.drawable.Drawable drawable;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int childCount = parent.getChildCount();
        int i18 = 0;
        while (true) {
            z17 = this.f538811f;
            drawable = this.f538812g;
            i17 = this.f538809d;
            if (i18 >= childCount) {
                break;
            }
            android.view.View childAt = parent.getChildAt(i18);
            if (i18 != childCount - 1 || z17) {
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams;
                int left = childAt.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                int right = childAt.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                drawable.setBounds(left, bottom, right, i17 + bottom);
                drawable.draw(c17);
            }
            i18++;
        }
        int childCount2 = parent.getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            if (i19 != childCount2 - 1 || z17) {
                android.view.View childAt2 = parent.getChildAt(i19);
                int d17 = d(parent);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) parent.getLayoutManager();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.t0 t0Var = c1161x57298f5d != null ? c1161x57298f5d.B : null;
                if (((t0Var != null ? t0Var.b(parent.w0(childAt2).m8183xf806b362(), d(parent)) : 0) + (t0Var != null ? t0Var.c(parent.w0(childAt2).m8183xf806b362()) : 0)) % d17 != 0) {
                    android.view.ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams3;
                    int top = childAt2.getTop() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
                    int bottom2 = childAt2.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin + i17;
                    int right2 = childAt2.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).rightMargin;
                    drawable.setBounds(right2 - this.f538810e, top, right2, bottom2);
                    drawable.draw(c17);
                }
            }
        }
    }
}
