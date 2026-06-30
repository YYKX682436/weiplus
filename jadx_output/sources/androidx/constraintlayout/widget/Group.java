package androidx.constraintlayout.widget;

/* loaded from: classes15.dex */
public class Group extends androidx.constraintlayout.widget.ConstraintHelper {
    public Group(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void b(android.util.AttributeSet attributeSet) {
        super.b(attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void c(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f10900k0.x(0);
        layoutParams.f10900k0.t(0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void d(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i17 = 0; i17 < this.f10859e; i17++) {
            android.view.View view = (android.view.View) constraintLayout.f10863d.get(this.f10858d[i17]);
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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

    public Group(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
