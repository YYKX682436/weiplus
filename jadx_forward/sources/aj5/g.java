package aj5;

/* loaded from: classes.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f86961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.i f86962e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, aj5.i iVar) {
        super(0);
        this.f86961d = activityC0065xcd7aa112;
        this.f86962e = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        wi5.n0 n0Var;
        oi5.e eVar = new oi5.e(this.f86961d);
        j75.f Q6 = this.f86962e.Q6();
        if (Q6 != null && (n0Var = (wi5.n0) Q6.mo140437x75286adb()) != null) {
            java.util.HashSet hashSet = n0Var.f527853p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashSet, "<set-?>");
            eVar.f427191g = hashSet;
        }
        return eVar;
    }
}
