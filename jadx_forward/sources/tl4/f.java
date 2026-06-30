package tl4;

/* loaded from: classes11.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl4.h f501839d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(tl4.h hVar) {
        super(0);
        this.f501839d = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = this.f501839d.f501841a.getSystemService("notification");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (android.app.NotificationManager) systemService;
    }
}
