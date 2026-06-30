package k13;

/* loaded from: classes10.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f384797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(k13.l1 l1Var) {
        super(0);
        this.f384797d = l1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = this.f384797d.b().getSystemService("keyguard");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        return (android.app.KeyguardManager) systemService;
    }
}
