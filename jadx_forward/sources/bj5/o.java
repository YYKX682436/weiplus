package bj5;

/* loaded from: classes.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.y f102744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f102745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(bj5.y yVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(0);
        this.f102744d = yVar;
        this.f102745e = activityC0065xcd7aa112;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bj5.y yVar = this.f102744d;
        java.lang.String stringExtra = yVar.m158359x1e885992().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String str = (java.lang.String) ((jz5.n) yVar.f102782h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "access$getAtSomeoneRecentDisplay(...)");
        return new pi5.f(this.f102745e, stringExtra, str);
    }
}
