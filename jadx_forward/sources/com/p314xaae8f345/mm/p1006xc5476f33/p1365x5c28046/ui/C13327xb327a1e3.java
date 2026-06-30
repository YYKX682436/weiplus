package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* renamed from: com.tencent.mm.plugin.emoji.ui.SquareImageView */
/* loaded from: classes4.dex */
public class C13327xb327a1e3 extends android.widget.ImageView {
    public C13327xb327a1e3(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(android.view.View.getDefaultSize(0, i17), android.view.View.getDefaultSize(0, i18));
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public C13327xb327a1e3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
