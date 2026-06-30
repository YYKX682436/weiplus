package p012xc85e97e9.p071xe6df7747.p072xd1075a44;

/* renamed from: androidx.constraintlayout.widget.Group */
/* loaded from: classes15.dex */
public class C1075x41e065f extends p012xc85e97e9.p071xe6df7747.p072xd1075a44.AbstractC1072x7767bc0b {
    public C1075x41e065f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p012xc85e97e9.p071xe6df7747.p072xd1075a44.AbstractC1072x7767bc0b
    public void b(android.util.AttributeSet attributeSet) {
        super.b(attributeSet);
    }

    @Override // p012xc85e97e9.p071xe6df7747.p072xd1075a44.AbstractC1072x7767bc0b
    public void c(p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787) {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) getLayoutParams();
        layoutParams.f92433k0.x(0);
        layoutParams.f92433k0.t(0);
    }

    @Override // p012xc85e97e9.p071xe6df7747.p072xd1075a44.AbstractC1072x7767bc0b
    public void d(p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i17 = 0; i17 < this.f92392e; i17++) {
            android.view.View view = (android.view.View) c1073x7e08a787.f92396d.get(this.f92391d[i17]);
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(visibility));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "androidx/constraintlayout/widget/Group", "updatePreLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "androidx/constraintlayout/widget/Group", "updatePreLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (elevation > 0.0f) {
                    view.setElevation(elevation);
                }
            }
        }
    }

    public C1075x41e065f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
