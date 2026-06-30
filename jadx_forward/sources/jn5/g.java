package jn5;

/* loaded from: classes3.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f382385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f382386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jn5.i f382387f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f382388g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, android.view.View view, jn5.i iVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        super(1);
        this.f382385d = i17;
        this.f382386e = view;
        this.f382387f = iVar;
        this.f382388g = k3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue() - this.f382385d;
        android.view.View view = this.f382386e;
        if (view != null) {
            android.view.ViewPropertyAnimator animate = view.animate();
            android.view.ViewPropertyAnimator alpha = animate.translationY(intValue).alpha(0.0f);
            jn5.i iVar = this.f382387f;
            alpha.setDuration(iVar.f93702d).setInterpolator(iVar.f382391u).setListener(new jn5.f(iVar, this.f382388g, animate, view)).start();
        }
        return jz5.f0.f384359a;
    }
}
