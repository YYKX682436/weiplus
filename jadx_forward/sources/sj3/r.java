package sj3;

/* loaded from: classes14.dex */
public class r extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f490254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f490255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 f490256f;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 c16584x79838812, android.view.View view, int i17) {
        this.f490256f = c16584x79838812;
        this.f490254d = view;
        this.f490255e = i17;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        android.view.View view;
        android.view.View view2 = this.f490254d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 c16584x79838812 = this.f490256f;
        if (f17 == 1.0f) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$7", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$7", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c16584x79838812.getClass();
        } else {
            if (f17 >= c16584x79838812.f231851q && (view = c16584x79838812.f231849o) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$7", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$7", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = c16584x79838812.f231849o;
            if (view3 != null) {
                float f18 = 1.0f - f17;
                float f19 = ((double) f18) * 2.5d < 1.0d ? 2.5f * f18 : 1.0f;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(java.lang.Float.valueOf(f19));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$7", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$7", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            ((android.widget.LinearLayout.LayoutParams) view2.getLayoutParams()).topMargin = (int) (sj3.i1.f490098j * f17);
            ((android.widget.LinearLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = (int) (sj3.i1.f490093e * f17);
            android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i17 = this.f490255e;
            layoutParams.height = i17 - ((int) (i17 * f17));
        }
        view2.requestLayout();
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
