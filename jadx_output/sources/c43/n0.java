package c43;

/* loaded from: classes13.dex */
public class n0 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c43.o0 f38465a;

    public n0(c43.o0 o0Var) {
        this.f38465a = o0Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        c43.o0 o0Var = this.f38465a;
        if (o0Var.f38467d) {
            c43.x xVar = o0Var.f38468e;
            com.tencent.mm.view.MMPAGView mMPAGView = xVar.f38499q;
            mMPAGView.setPath("assets://game/game_avatar_star.pag");
            mMPAGView.setVisibility(0);
            mMPAGView.setRepeatCount(1);
            mMPAGView.setProgress(0.0d);
            mMPAGView.g();
            mMPAGView.a(new c43.q0(xVar));
        }
    }
}
