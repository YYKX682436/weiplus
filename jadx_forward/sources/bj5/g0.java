package bj5;

/* loaded from: classes.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.k0 f102718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f102719e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(bj5.k0 k0Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(0);
        this.f102718d = k0Var;
        this.f102719e = activityC0065xcd7aa112;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f102718d.m158359x1e885992().getStringExtra("label_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new j93.n1(this.f102719e, stringExtra);
    }
}
