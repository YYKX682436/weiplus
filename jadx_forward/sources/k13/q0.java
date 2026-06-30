package k13;

/* loaded from: classes10.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f384793d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(k13.l1 l1Var) {
        super(0);
        this.f384793d = l1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = this.f384793d.b().getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (android.media.AudioManager) systemService;
    }
}
