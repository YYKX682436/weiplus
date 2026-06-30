package az0;

/* loaded from: classes5.dex */
public final class r5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f97393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f97394f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(java.lang.String str, az0.n7 n7Var, java.lang.Integer num) {
        super(1);
        this.f97392d = str;
        this.f97393e = n7Var;
        this.f97394f = num;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("buildTemplate: ");
        java.lang.String str = this.f97392d;
        sb6.append(str);
        sb6.append(" try cancel");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", sb6.toString());
        az0.n7 n7Var = this.f97393e;
        p3325xe03a0797.p3326xc267989b.l.d(n7Var.f97279e, null, null, new az0.q5(str, n7Var, this.f97394f, null), 3, null);
        return jz5.f0.f384359a;
    }
}
