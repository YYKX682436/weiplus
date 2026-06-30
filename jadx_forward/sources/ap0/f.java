package ap0;

/* loaded from: classes2.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap0.g f94126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp0.n f94127e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ap0.g gVar, cp0.n nVar) {
        super(0);
        this.f94126d = gVar;
        this.f94127e = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View b17;
        ap0.g gVar = this.f94126d;
        gVar.f94128a.setDuration(320L);
        cp0.n nVar = gVar.f94129b;
        if (nVar == null) {
            nVar = this.f94127e;
        }
        ap0.e eVar = new ap0.e(nVar);
        android.view.animation.Animation animation = gVar.f94128a;
        animation.setAnimationListener(eVar);
        if (nVar != null && (b17 = nVar.b()) != null) {
            b17.startAnimation(animation);
        }
        return jz5.f0.f384359a;
    }
}
