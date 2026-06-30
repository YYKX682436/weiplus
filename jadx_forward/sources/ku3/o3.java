package ku3;

/* loaded from: classes3.dex */
public final class o3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.y3 f393885d;

    public o3(ku3.y3 y3Var) {
        this.f393885d = y3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuCountDownPlugin$initSecondBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        ku3.y3 y3Var = this.f393885d;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(y3Var.c(), "scaleX", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(y3Var.c(), "alpha", 1.0f, 0.0f);
        y3Var.c().setPivotX(y3Var.C);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animatorSet.addListener(new ku3.n3(y3Var));
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuCountDownPlugin$initSecondBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
