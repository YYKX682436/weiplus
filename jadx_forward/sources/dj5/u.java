package dj5;

/* loaded from: classes.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj5.b0 f314627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f314628e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(dj5.b0 b0Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(0);
        this.f314627d = b0Var;
        this.f314628e = activityC0065xcd7aa112;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f314627d.m158359x1e885992().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new pi5.y(this.f314628e, stringExtra, false, 4, null);
    }
}
