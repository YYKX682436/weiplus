package l45;

/* loaded from: classes10.dex */
public class g implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l45.n f397976a;

    public g(l45.n nVar) {
        this.f397976a = nVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        l45.n nVar = this.f397976a;
        android.view.View mo177318xd03217ea = nVar.f397993a.mo177318xd03217ea();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo177318xd03217ea, arrayList.toArray(), "com/tencent/mm/presenter/DrawingPresenter$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo177318xd03217ea.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo177318xd03217ea, "com/tencent/mm/presenter/DrawingPresenter$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l45.m mVar = nVar.f398012t;
        if (mVar != null) {
            mVar.c(java.lang.Boolean.FALSE);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
