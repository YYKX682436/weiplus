package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMAutoHeightViewPager */
/* loaded from: classes3.dex */
public class C21482x75478f48 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe {
    private static final java.lang.String TAG = "MicoMsg.MMAutoHeightViewPager";

    public C21482x75478f48(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe, android.view.View
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

    public C21482x75478f48(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C21482x75478f48(android.content.Context context) {
        super(context);
    }
}
