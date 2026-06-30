package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.view.SquareFrameLayout */
/* loaded from: classes5.dex */
public class C17504xec56b57a extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public x14.z f243202d;

    public C17504xec56b57a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        if (size != 0 || size2 != 0) {
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec((size == 0 || size2 == 0) ? java.lang.Math.max(size, size2) : java.lang.Math.min(size, size2), 1073741824);
            super.onMeasure(makeMeasureSpec, makeMeasureSpec);
            x14.z zVar = this.f243202d;
            if (zVar != null) {
                ((p14.n) zVar).a(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            return;
        }
        super.onMeasure(i17, i18);
        int min = java.lang.Math.min(getMeasuredWidth(), getMeasuredHeight());
        setMeasuredDimension(min, min);
        x14.z zVar2 = this.f243202d;
        if (zVar2 != null) {
            ((p14.n) zVar2).a(min, min);
        }
    }

    /* renamed from: setOnMeasureListener */
    public void m69099xb5627411(x14.z zVar) {
        this.f243202d = zVar;
    }

    public C17504xec56b57a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
