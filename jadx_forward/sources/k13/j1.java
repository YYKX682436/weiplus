package k13;

/* loaded from: classes10.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f384761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k13.l1 l1Var) {
        super(0);
        this.f384761d = l1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = this.f384761d.b().getSystemService("vibrator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        return (android.os.Vibrator) systemService;
    }
}
