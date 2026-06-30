package yw3;

/* loaded from: classes2.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f548269d;

    public f0(android.view.View view) {
        this.f548269d = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerAnimationDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f548269d;
        view2.setScaleX(1.0f);
        view2.setScaleY(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        view2.setRotationX(0.0f);
        view2.setRotationY(0.0f);
        view2.setRotation(0.0f);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerAnimationDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
