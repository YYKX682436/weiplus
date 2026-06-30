package rb5;

/* loaded from: classes11.dex */
public class d implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rb5.f f475398a;

    public d(rb5.f fVar) {
        this.f475398a = fVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f475398a.f475401b.f475421o = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingCompat", "klem animationEnd");
        rb5.l lVar = this.f475398a.f475401b;
        lVar.getClass();
        ku5.u0 u0Var = ku5.t0.f394148d;
        rb5.g gVar = new rb5.g(lVar);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(gVar, 60L, false);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        rb5.f fVar = this.f475398a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingCompat", "klem onAnimationStart onDrawed->onAnimationStart:%sms", java.lang.Long.valueOf(currentTimeMillis - fVar.f475400a));
        rb5.l lVar = fVar.f475401b;
        lVar.f475421o = true;
        lVar.f475418i.setTranslationX(0.0f);
        lVar.f475418i.e();
        fVar.f475401b.k(false, 0);
    }
}
