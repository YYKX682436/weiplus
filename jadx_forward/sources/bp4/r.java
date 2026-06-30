package bp4;

/* loaded from: classes5.dex */
public final class r implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f104890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bp4.t f104891b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bp4.x f104892c;

    public r(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, bp4.t tVar, bp4.x xVar) {
        this.f104890a = k3Var;
        this.f104891b = tVar;
        this.f104892c = xVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f104890a.f3639x46306858.setTag(null);
        bp4.t tVar = this.f104891b;
        int i17 = tVar.f104910b;
        int i18 = tVar.f104911c;
        yz5.p pVar = this.f104892c.f104953m;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(tVar.f104911c));
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f104890a.f3639x46306858.setTag(new java.lang.Object());
    }
}
