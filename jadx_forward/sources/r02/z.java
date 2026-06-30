package r02;

/* loaded from: classes5.dex */
public class z extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f449878d;

    /* renamed from: e, reason: collision with root package name */
    public final int f449879e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f449880f;

    public z(android.content.res.Resources resources) {
        this.f449878d = new android.graphics.drawable.ColorDrawable(resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560430k6));
        this.f449879e = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562075a36);
        this.f449880f = new android.graphics.drawable.ColorDrawable(resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect rect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        rect.set(0, 0, 0, this.f449879e);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int paddingLeft = c1163xf1deaba4.getPaddingLeft();
        int width = c1163xf1deaba4.getWidth() - c1163xf1deaba4.getPaddingRight();
        int childCount = c1163xf1deaba4.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c1163xf1deaba4.getChildAt(i17);
            android.view.View childAt2 = ((android.view.ViewGroup) childAt).getChildAt(0);
            int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            int i18 = this.f449879e + bottom;
            int visibility = childAt.getVisibility();
            android.graphics.drawable.Drawable drawable = this.f449880f;
            if (visibility != 8 && childAt2.getVisibility() != 8) {
                boolean z17 = childAt2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13251x9a0aef3a;
                android.graphics.drawable.Drawable drawable2 = this.f449878d;
                if (z17 || (childAt2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13248x1980fe57) || (childAt2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13245x96fe8c7f)) {
                    drawable2.setBounds(paddingLeft, bottom, width, i18);
                    drawable2.draw(canvas);
                } else if (childAt2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d) {
                    android.view.View childAt3 = c1163xf1deaba4.getChildAt(i17 + 1);
                    if (childAt3 != null) {
                        android.view.View childAt4 = ((android.view.ViewGroup) childAt3).getChildAt(0);
                        if (childAt4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13248x1980fe57) {
                            super.mo8166xc398a7c3(canvas, c1163xf1deaba4, h3Var);
                        } else if ((childAt4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13245x96fe8c7f) && childAt4.getVisibility() == 8) {
                            drawable2.setBounds(paddingLeft, bottom, width, i18);
                            drawable2.draw(canvas);
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d) childAt2;
                    drawable2.setBounds(c13249xf095011d.m54724xb68269f7() + paddingLeft, bottom, width, i18);
                    drawable2.draw(canvas);
                    drawable.setBounds(paddingLeft, bottom, c13249xf095011d.m54724xb68269f7() + paddingLeft, i18);
                    drawable.draw(canvas);
                } else {
                    super.mo8166xc398a7c3(canvas, c1163xf1deaba4, h3Var);
                }
            } else if (childAt2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d) {
                drawable.setBounds(paddingLeft, bottom, width, i18);
                drawable.draw(canvas);
            }
        }
    }
}
