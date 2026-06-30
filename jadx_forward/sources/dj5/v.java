package dj5;

/* loaded from: classes.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj5.b0 f314629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f314630e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(dj5.b0 b0Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(0);
        this.f314629d = b0Var;
        this.f314630e = activityC0065xcd7aa112;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dj5.b0 b0Var = this.f314629d;
        java.lang.String stringExtra = b0Var.m158359x1e885992().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String str = (java.lang.String) ((jz5.n) b0Var.f314590f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "access$getOwnerHeadDisplay(...)");
        return new pi5.l(this.f314630e, stringExtra, str);
    }
}
