package sn2;

/* loaded from: classes11.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sn2.b f491650d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sn2.b bVar) {
        super(0);
        this.f491650d = bVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = this.f491650d.f491651a.getSystemService("notification");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (android.app.NotificationManager) systemService;
    }
}
