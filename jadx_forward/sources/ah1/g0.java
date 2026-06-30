package ah1;

/* loaded from: classes7.dex */
public final class g0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f86359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ah1.i0 f86360e;

    public g0(android.view.View view, ah1.i0 i0Var) {
        this.f86359d = view;
        this.f86360e = i0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view = this.f86359d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ah1.i0 i0Var = this.f86360e;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(i0Var.getContext(), com.p314xaae8f345.mm.ui.uc.f292611a);
        loadAnimation.setAnimationListener(new ah1.h0(i0Var));
        view.startAnimation(loadAnimation);
        return true;
    }
}
