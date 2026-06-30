package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallShareViewPager */
/* loaded from: classes5.dex */
public class C16149x39221284 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d {
    public C16149x39221284(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = 0;
        for (int i27 = 0; i27 < getChildCount(); i27++) {
            android.view.View childAt = getChildAt(i27);
            childAt.measure(i17, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight > i19) {
                i19 = measuredHeight;
            }
        }
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
    }
}
