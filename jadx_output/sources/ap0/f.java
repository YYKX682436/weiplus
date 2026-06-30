package ap0;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap0.g f12593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp0.n f12594e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ap0.g gVar, cp0.n nVar) {
        super(0);
        this.f12593d = gVar;
        this.f12594e = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View b17;
        ap0.g gVar = this.f12593d;
        gVar.f12595a.setDuration(320L);
        cp0.n nVar = gVar.f12596b;
        if (nVar == null) {
            nVar = this.f12594e;
        }
        ap0.e eVar = new ap0.e(nVar);
        android.view.animation.Animation animation = gVar.f12595a;
        animation.setAnimationListener(eVar);
        if (nVar != null && (b17 = nVar.b()) != null) {
            b17.startAnimation(animation);
        }
        return jz5.f0.f302826a;
    }
}
