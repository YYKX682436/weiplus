package jj5;

/* loaded from: classes.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f381575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jj5.f f381576e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, jj5.f fVar) {
        super(0);
        this.f381575d = activityC0065xcd7aa112;
        this.f381576e = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        wi5.n0 n0Var;
        jj5.d dVar = new jj5.d(this.f381575d);
        jj5.f fVar = this.f381576e;
        j75.f Q6 = fVar.Q6();
        if (Q6 != null && (n0Var = (wi5.n0) Q6.mo140437x75286adb()) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(n0Var.f527853p, "<set-?>");
            java.util.ArrayList<java.lang.String> stringArrayListExtra = fVar.m158359x1e885992().getStringArrayListExtra("selectedUserNames");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(stringArrayListExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            dVar.f381574f = stringArrayListExtra;
            rk0.c.c("MicroMsg.SelectedDataSourceUIC", stringArrayListExtra.toString(), new java.lang.Object[0]);
        }
        return dVar;
    }
}
