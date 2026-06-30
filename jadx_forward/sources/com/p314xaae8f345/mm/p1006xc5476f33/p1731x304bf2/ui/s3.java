package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes5.dex */
public class s3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f223287d;

    /* renamed from: e, reason: collision with root package name */
    public final int f223288e;

    public s3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863 c15971xe6741863, android.content.res.Resources resources, int i17) {
        this.f223287d = new android.graphics.drawable.ColorDrawable(resources.getColor(i17));
        this.f223288e = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561345fx);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect rect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        rect.set(0, 0, 0, this.f223288e);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int paddingLeft = c1163xf1deaba4.getPaddingLeft();
        int width = c1163xf1deaba4.getWidth() - c1163xf1deaba4.getPaddingRight();
        int childCount = c1163xf1deaba4.getChildCount();
        for (int i17 = 0; i17 < childCount - 1; i17++) {
            android.view.View childAt = c1163xf1deaba4.getChildAt(i17);
            android.view.View childAt2 = ((android.view.ViewGroup) childAt).getChildAt(0);
            if ((childAt2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15940x6a15e3d2) || (childAt2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15942xb94ae91e) || (childAt2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15962xc18ff45c)) {
                super.mo8166xc398a7c3(canvas, c1163xf1deaba4, h3Var);
            } else {
                int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                int i18 = this.f223288e + bottom;
                android.graphics.drawable.Drawable drawable = this.f223287d;
                drawable.setBounds(paddingLeft, bottom, width, i18);
                drawable.draw(canvas);
            }
        }
    }
}
