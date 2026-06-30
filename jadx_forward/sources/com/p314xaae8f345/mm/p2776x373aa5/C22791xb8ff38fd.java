package com.p314xaae8f345.mm.p2776x373aa5;

/* renamed from: com.tencent.mm.view.MaxHeightScrollView */
/* loaded from: classes11.dex */
public class C22791xb8ff38fd extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name */
    public int f294880d;

    public C22791xb8ff38fd(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        hashCode();
        a(context, attributeSet);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f528738w, 0, 0);
        try {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i17 = 0; i17 < indexCount; i17++) {
                int index = obtainStyledAttributes.getIndex(i17);
                if (index == 0) {
                    m82588x25bfb969(obtainStyledAttributes.getDimensionPixelSize(index, -1));
                }
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: getMaxHeight */
    public int m82587xc96bf8f5() {
        return this.f294880d;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f294880d > 0) {
            int measuredHeight = getMeasuredHeight();
            int i19 = this.f294880d;
            if (measuredHeight > i19) {
                setMeasuredDimension(i17, android.view.View.MeasureSpec.makeMeasureSpec(i19, Integer.MIN_VALUE));
            }
        }
    }

    /* renamed from: setMaxHeight */
    public void m82588x25bfb969(int i17) {
        this.f294880d = i17;
        requestLayout();
    }

    public C22791xb8ff38fd(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        hashCode();
        a(context, attributeSet);
    }
}
