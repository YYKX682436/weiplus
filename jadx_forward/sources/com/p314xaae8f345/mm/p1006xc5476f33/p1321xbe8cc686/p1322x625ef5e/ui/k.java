package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui;

/* loaded from: classes12.dex */
public class k extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.ColorDrawable f177074d = new android.graphics.drawable.ColorDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560492lz));

    /* renamed from: e, reason: collision with root package name */
    public final int f177075e = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.l f177076f;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.l lVar) {
        this.f177076f = lVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        wv1.a x17;
        int paddingLeft = c1163xf1deaba4.getPaddingLeft();
        int width = c1163xf1deaba4.getWidth() - c1163xf1deaba4.getPaddingRight();
        int childCount = c1163xf1deaba4.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c1163xf1deaba4.getChildAt(i17);
            if (childAt.getTag() != null && ((x17 = this.f177076f.f177077d.x(((java.lang.Integer) childAt.getTag()).intValue() + 1)) == null || x17.h() != 0)) {
                int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                int i18 = this.f177075e + bottom;
                android.graphics.drawable.ColorDrawable colorDrawable = this.f177074d;
                colorDrawable.setBounds(paddingLeft, bottom, width, i18);
                colorDrawable.draw(canvas);
            }
        }
    }
}
