package bp4;

/* loaded from: classes5.dex */
public final class r implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f23357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bp4.t f23358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bp4.x f23359c;

    public r(androidx.recyclerview.widget.k3 k3Var, bp4.t tVar, bp4.x xVar) {
        this.f23357a = k3Var;
        this.f23358b = tVar;
        this.f23359c = xVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f23357a.itemView.setTag(null);
        bp4.t tVar = this.f23358b;
        int i17 = tVar.f23377b;
        int i18 = tVar.f23378c;
        yz5.p pVar = this.f23359c.f23420m;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(tVar.f23378c));
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f23357a.itemView.setTag(new java.lang.Object());
    }
}
