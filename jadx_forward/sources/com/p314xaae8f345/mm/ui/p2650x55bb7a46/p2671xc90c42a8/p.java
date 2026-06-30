package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class p extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.ColorDrawable f283946d;

    /* renamed from: e, reason: collision with root package name */
    public final int f283947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y f283948f;

    public p(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y yVar) {
        this.f283948f = yVar;
        this.f283946d = new android.graphics.drawable.ColorDrawable(yVar.f284074d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560492lz));
        this.f283947e = (int) yVar.f284074d.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int paddingLeft = c1163xf1deaba4.getPaddingLeft();
        int width = c1163xf1deaba4.getWidth() - c1163xf1deaba4.getPaddingRight();
        int childCount = c1163xf1deaba4.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c1163xf1deaba4.getChildAt(i17);
            if (childAt.getTag() != null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 h17 = this.f283948f.h(((java.lang.Integer) childAt.getTag()).intValue() + 1);
                if (h17 == null || h17.a() != Integer.MAX_VALUE) {
                    int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                    int i18 = this.f283947e + bottom;
                    android.graphics.drawable.ColorDrawable colorDrawable = this.f283946d;
                    colorDrawable.setBounds(paddingLeft, bottom, width, i18);
                    colorDrawable.draw(canvas);
                }
            }
        }
    }
}
