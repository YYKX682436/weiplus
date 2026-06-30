package com.tencent.mm.plugin.choosemsgfile.logic.ui;

/* loaded from: classes12.dex */
public class k extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.ColorDrawable f95541d = new android.graphics.drawable.ColorDrawable(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478959lz));

    /* renamed from: e, reason: collision with root package name */
    public final int f95542e = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479563f);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.logic.ui.l f95543f;

    public k(com.tencent.mm.plugin.choosemsgfile.logic.ui.l lVar) {
        this.f95543f = lVar;
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        wv1.a x17;
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = recyclerView.getChildAt(i17);
            if (childAt.getTag() != null && ((x17 = this.f95543f.f95544d.x(((java.lang.Integer) childAt.getTag()).intValue() + 1)) == null || x17.h() != 0)) {
                int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                int i18 = this.f95542e + bottom;
                android.graphics.drawable.ColorDrawable colorDrawable = this.f95541d;
                colorDrawable.setBounds(paddingLeft, bottom, width, i18);
                colorDrawable.draw(canvas);
            }
        }
    }
}
