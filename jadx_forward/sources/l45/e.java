package l45;

/* loaded from: classes10.dex */
public class e implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l45.n f397973a;

    public e(l45.n nVar) {
        this.f397973a = nVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        l45.n nVar = this.f397973a;
        ((android.widget.EditText) nVar.f397993a.mo177319xb073c692().findViewById(com.p314xaae8f345.mm.R.id.o4a)).setText("");
        android.view.View mo177319xb073c692 = nVar.f397993a.mo177319xb073c692();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo177319xb073c692, arrayList.toArray(), "com/tencent/mm/presenter/DrawingPresenter$4", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo177319xb073c692.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo177319xb073c692, "com/tencent/mm/presenter/DrawingPresenter$4", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        this.f397973a.f397993a.m160419xa85e9179().c(false);
    }
}
