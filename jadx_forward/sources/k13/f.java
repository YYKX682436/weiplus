package k13;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.g f384740d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k13.g gVar) {
        super(0);
        this.f384740d = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = this.f384740d.b().getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (android.view.WindowManager) systemService;
    }
}
