package p012xc85e97e9.p071xe6df7747.p072xd1075a44;

/* renamed from: androidx.constraintlayout.widget.Guideline */
/* loaded from: classes10.dex */
public class C1076xfbb92cd0 extends android.view.View {
    public C1076xfbb92cd0(android.content.Context context) {
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

    /* renamed from: setGuidelineBegin */
    public void m7186xde2b469b(int i17) {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) getLayoutParams();
        layoutParams.f92412a = i17;
        setLayoutParams(layoutParams);
    }

    /* renamed from: setGuidelineEnd */
    public void m7187xdf772b4d(int i17) {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) getLayoutParams();
        layoutParams.f92414b = i17;
        setLayoutParams(layoutParams);
    }

    /* renamed from: setGuidelinePercent */
    public void m7188xe5a37db7(float f17) {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) getLayoutParams();
        layoutParams.f92416c = f17;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
    }

    public C1076xfbb92cd0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public C1076xfbb92cd0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        super.setVisibility(8);
    }
}
