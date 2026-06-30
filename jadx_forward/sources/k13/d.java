package k13;

/* loaded from: classes10.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.g f384734d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k13.g gVar) {
        super(0);
        this.f384734d = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = this.f384734d.b().getSystemService("power");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return (android.os.PowerManager) systemService;
    }
}
