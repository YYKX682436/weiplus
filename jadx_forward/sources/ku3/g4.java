package ku3;

/* loaded from: classes3.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.m4 f393772d;

    public g4(ku3.m4 m4Var) {
        this.f393772d = m4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuFilterPlugin$initFilterBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        ku3.m4 m4Var = this.f393772d;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(m4Var.a(), "scaleX", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(m4Var.a(), "alpha", 1.0f, 0.0f);
        m4Var.a().setPivotX(m4Var.f393860p);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animatorSet.addListener(new ku3.f4(m4Var));
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuFilterPlugin$initFilterBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
