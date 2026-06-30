package ah1;

/* loaded from: classes7.dex */
public final class h0 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ah1.i0 f86362a;

    public h0(ah1.i0 i0Var) {
        this.f86362a = i0Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        android.app.Activity a17 = q75.a.a(this.f86362a.getContext());
        if (a17 != null) {
            vj5.n.b(a17).e();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
