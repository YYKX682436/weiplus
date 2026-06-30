package androidx.constraintlayout.widget;

/* loaded from: classes10.dex */
public class Guideline extends android.view.View {
    public Guideline(android.content.Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i17) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f10879a = i17;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i17) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f10881b = i17;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f17) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f10883c = f17;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
    }

    public Guideline(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Guideline(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        super.setVisibility(8);
    }
}
