package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView */
/* loaded from: classes5.dex */
public class C12697x85b15aaf extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {

    /* renamed from: b2, reason: collision with root package name */
    public int f171029b2;

    public C12697x85b15aaf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: getMaxHeight */
    public int m52924xc96bf8f5() {
        return this.f171029b2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f171029b2;
        if (i19 > 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(i19, Integer.MIN_VALUE);
        }
        super.onMeasure(i17, i18);
    }

    /* renamed from: setMaxHeight */
    public void m52925x25bfb969(int i17) {
        this.f171029b2 = i17;
        invalidate();
        requestLayout();
    }

    public C12697x85b15aaf(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
