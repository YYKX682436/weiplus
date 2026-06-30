package e33;

/* loaded from: classes5.dex */
public class h2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f328778d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f328779e;

    /* renamed from: f, reason: collision with root package name */
    public final int f328780f;

    /* renamed from: g, reason: collision with root package name */
    public final int f328781g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f328782h;

    /* renamed from: i, reason: collision with root package name */
    public final int f328783i;

    /* renamed from: m, reason: collision with root package name */
    public final int f328784m;

    public h2(int i17, int i18, int i19, boolean z17, java.util.List list, int i27, int i28, e33.g2 g2Var) {
        this.f328780f = i17;
        this.f328779e = z17;
        this.f328781g = i18;
        this.f328778d = new android.graphics.drawable.ColorDrawable(i19);
        this.f328782h = new java.util.ArrayList(list);
        this.f328783i = i27;
        this.f328784m = i28;
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

    public final boolean e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        if (c1163xf1deaba4.mo7946xf939df19() == null || i17 >= c1163xf1deaba4.mo7946xf939df19().mo1894x7e414b06()) {
            return false;
        }
        int mo863xcdaf1228 = c1163xf1deaba4.mo7946xf939df19().mo863xcdaf1228(i17);
        return ((java.util.ArrayList) this.f328782h).contains(java.lang.Integer.valueOf(mo863xcdaf1228));
    }

    public final boolean f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18, int i19) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        int i27 = this.f328783i;
        int i28 = i17 - i27;
        int i29 = (i19 - i27) - this.f328784m;
        if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) {
            int i37 = i29 % i18;
            if (i37 == 0) {
                if (i28 < i29 - i18) {
                    return false;
                }
            } else if (i28 < i29 - i37) {
                return false;
            }
            return true;
        }
        if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) {
            if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager).f93457h == 1) {
                int i38 = i29 % i18;
                if (i38 == 0) {
                    if (i28 < i29 - i18) {
                        return false;
                    }
                } else if (i28 < i29 - i38) {
                    return false;
                }
                return true;
            }
            if ((i28 + 1) % i18 == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect rect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int d17 = d(c1163xf1deaba4);
        int mo1894x7e414b06 = c1163xf1deaba4.mo7946xf939df19().mo1894x7e414b06();
        int b17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams()).b();
        if (b17 >= 0 && !e(c1163xf1deaba4, b17)) {
            int i17 = b17 % d17;
            int i18 = this.f328781g;
            int i19 = (i17 * i18) / d17;
            int i27 = i18 - (((i17 + 1) * i18) / d17);
            boolean f17 = f(c1163xf1deaba4, b17, d17, mo1894x7e414b06);
            int i28 = this.f328780f;
            if (f17 && !this.f328779e) {
                i28 = 0;
            }
            rect.set(i19, 0, i27, i28);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDrawOver */
    public void mo7903x73cebf37(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        android.graphics.drawable.Drawable drawable;
        int i17;
        int childCount = c1163xf1deaba4.getChildCount();
        int i18 = 0;
        while (true) {
            drawable = this.f328778d;
            i17 = this.f328780f;
            if (i18 >= childCount) {
                break;
            }
            if (!e(c1163xf1deaba4, i18)) {
                android.view.View childAt = c1163xf1deaba4.getChildAt(i18);
                if (!f(c1163xf1deaba4, i18, d(c1163xf1deaba4), childCount) || this.f328779e) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) childAt.getLayoutParams();
                    int left = childAt.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    int right = childAt.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    drawable.setBounds(left, bottom, right, i17 + bottom);
                    drawable.draw(canvas);
                }
            }
            i18++;
        }
        int childCount2 = c1163xf1deaba4.getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            if (!e(c1163xf1deaba4, i19)) {
                android.view.View childAt2 = c1163xf1deaba4.getChildAt(i19);
                if (((c1163xf1deaba4.w0(childAt2).m8183xf806b362() + 1) - this.f328783i) % d(c1163xf1deaba4) != 0) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) childAt2.getLayoutParams();
                    int top = childAt2.getTop() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                    int bottom2 = childAt2.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i17;
                    int right2 = childAt2.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                    int i27 = this.f328781g;
                    int i28 = right2 + i27;
                    if (i19 == childCount2 - 1) {
                        i28 -= i27;
                    }
                    drawable.setBounds(right2, top, i28, bottom2);
                    drawable.draw(canvas);
                }
            }
        }
    }
}
