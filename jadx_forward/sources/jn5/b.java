package jn5;

/* loaded from: classes3.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f382363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f382364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jn5.i f382365f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f382366g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View view, int i17, jn5.i iVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        super(1);
        this.f382363d = view;
        this.f382364e = i17;
        this.f382365f = iVar;
        this.f382366g = k3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.view.View view = this.f382363d;
        if (view != null) {
            view.setTranslationY(intValue - this.f382364e);
            android.view.ViewPropertyAnimator animate = view.animate();
            android.view.ViewPropertyAnimator alpha = animate.translationY(0.0f).alpha(1.0f);
            jn5.i iVar = this.f382365f;
            alpha.setDuration(iVar.f93701c).setInterpolator(iVar.f382391u).setListener(new jn5.a(iVar, this.f382366g, view, animate)).start();
        }
        return jz5.f0.f384359a;
    }
}
