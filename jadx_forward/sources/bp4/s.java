package bp4;

/* loaded from: classes5.dex */
public final class s implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f104901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f104902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bp4.t f104903c;

    public s(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, bp4.t tVar) {
        this.f104901a = k3Var;
        this.f104902b = i17;
        this.f104903c = tVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f104901a.f3639x46306858.setTag(null);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f104901a;
        k3Var.f3639x46306858.setTag(new java.lang.Object());
        if (this.f104902b == 2) {
            int m8183xf806b362 = k3Var.m8183xf806b362();
            bp4.t tVar = this.f104903c;
            tVar.f104911c = m8183xf806b362;
            tVar.f104910b = tVar.f104911c;
            tVar.getClass();
            tVar.getClass();
        }
    }
}
