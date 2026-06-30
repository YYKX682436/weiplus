package fb3;

/* loaded from: classes.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fb3.b f342383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f342384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fb3.b bVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(0);
        this.f342383d = bVar;
        this.f342384e = activityC0065xcd7aa112;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fb3.b bVar = this.f342383d;
        db3.c cVar = new db3.c(this.f342384e, bVar.m158359x1e885992().getBooleanExtra("QSRPRecentConversationDataSourceIsBlockOpenIM", false));
        j75.f Q6 = bVar.Q6();
        if (Q6 != null) {
        }
        return cVar;
    }
}
