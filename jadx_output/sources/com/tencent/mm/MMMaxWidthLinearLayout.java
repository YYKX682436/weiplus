package com.tencent.mm;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/MMMaxWidthLinearLayout;", "Landroid/widget/LinearLayout;", "", "maxWeightDp", "Ljz5/f0;", "setMaxWidthDp", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class MMMaxWidthLinearLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public float f53144d;

    public MMMaxWidthLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        float f17 = this.f53144d;
        if (f17 < 0.0f) {
            super.onMeasure(i17, i18);
            return;
        }
        int i19 = (int) f17;
        if (android.view.View.MeasureSpec.getMode(i17) == 0) {
            i17 = android.view.View.MeasureSpec.makeMeasureSpec(i19, Integer.MIN_VALUE);
        } else if (android.view.View.MeasureSpec.getSize(i17) > i19) {
            i17 = android.view.View.MeasureSpec.getMode(i17) == Integer.MIN_VALUE ? android.view.View.MeasureSpec.makeMeasureSpec(i19, Integer.MIN_VALUE) : android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
        }
        super.onMeasure(i17, i18);
    }

    public final void setMaxWidthDp(float f17) {
        this.f53144d = (f17 > (-1.0f) ? 1 : (f17 == (-1.0f) ? 0 : -1)) == 0 ? -1.0f : i65.a.a(getContext(), f17);
        invalidate();
    }

    public MMMaxWidthLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f53144d = -1.0f;
    }
}
