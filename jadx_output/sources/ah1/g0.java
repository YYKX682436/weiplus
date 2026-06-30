package ah1;

/* loaded from: classes7.dex */
public final class g0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f4826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ah1.i0 f4827e;

    public g0(android.view.View view, ah1.i0 i0Var) {
        this.f4826d = view;
        this.f4827e = i0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view = this.f4826d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ah1.i0 i0Var = this.f4827e;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(i0Var.getContext(), com.tencent.mm.ui.uc.f211078a);
        loadAnimation.setAnimationListener(new ah1.h0(i0Var));
        view.startAnimation(loadAnimation);
        return true;
    }
}
