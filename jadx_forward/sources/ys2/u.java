package ys2;

/* loaded from: classes3.dex */
public final class u implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ys2.x f546726a;

    public u(ys2.x xVar) {
        this.f546726a = xVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        ys2.x xVar = this.f546726a;
        if2.d0 d0Var = xVar.f546729m;
        if (d0Var != null) {
            d0Var.d(8);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", false);
        ((mm2.c1) xVar.m56788xbba4bfc0(mm2.c1.class)).N1 = false;
        xVar.X6(qo0.b.Z2, bundle);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
