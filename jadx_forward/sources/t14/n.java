package t14;

/* loaded from: classes10.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t14.q f496117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f496118e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t14.q qVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(0);
        this.f496117d = qVar;
        this.f496118e = activityC0065xcd7aa112;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f496117d.m158359x1e885992().getStringExtra("KEY_CUSTOM_PAGE_NAME");
        return !(stringExtra == null || r26.n0.N(stringExtra)) ? stringExtra : this.f496118e.getClass().getSimpleName();
    }
}
