package aj5;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f86969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.i f86970e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, aj5.i iVar) {
        super(0);
        this.f86969d = activityC0065xcd7aa112;
        this.f86970e = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        wi5.n0 n0Var;
        oi5.c cVar = new oi5.c(this.f86969d);
        j75.f Q6 = this.f86970e.Q6();
        if (Q6 != null && (n0Var = (wi5.n0) Q6.mo140437x75286adb()) != null) {
            java.util.HashSet hashSet = n0Var.f527853p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashSet, "<set-?>");
            cVar.f427186g = hashSet;
        }
        return cVar;
    }
}
