package c43;

/* loaded from: classes13.dex */
public class n0 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c43.o0 f119998a;

    public n0(c43.o0 o0Var) {
        this.f119998a = o0Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        c43.o0 o0Var = this.f119998a;
        if (o0Var.f120000d) {
            c43.x xVar = o0Var.f120001e;
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = xVar.f120032q;
            c22789xd23e9a9b.m82581x764e93a7("assets://game/game_avatar_star.pag");
            c22789xd23e9a9b.setVisibility(0);
            c22789xd23e9a9b.m82583xcde73672(1);
            c22789xd23e9a9b.m82582x3ae760af(0.0d);
            c22789xd23e9a9b.g();
            c22789xd23e9a9b.a(new c43.q0(xVar));
        }
    }
}
