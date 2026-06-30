package ho1;

/* loaded from: classes11.dex */
public final class i1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f364244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364246f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f364247g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f364248h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f364249i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f364250m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f364251n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(long j17, java.lang.String str, long j18, long j19, ho1.q1 q1Var, long j27, long j28, int i17) {
        super(0);
        this.f364244d = j17;
        this.f364245e = str;
        this.f364246f = j18;
        this.f364247g = j19;
        this.f364248h = q1Var;
        this.f364249i = j27;
        this.f364250m = j28;
        this.f364251n = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getChatPackageAsync taskId = ");
        sb6.append(this.f364244d);
        sb6.append(", conversationId = ");
        java.lang.String str = this.f364245e;
        sb6.append(str);
        sb6.append(", fromTime = ");
        sb6.append(this.f364246f);
        sb6.append(", toTime = ");
        sb6.append(this.f364247g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", sb6.toString());
        long j17 = this.f364246f;
        long j18 = this.f364247g;
        ho1.q1 q1Var = this.f364248h;
        if (j17 > j18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "getChatPackageAsync fromTime > toTime, skip DB query, return");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g0 g0Var = q1Var.f364320a;
            if (g0Var != null) {
                g0Var.a(this.f364244d, true, 0L, new bw5.w0());
            }
        } else {
            jz5.o a17 = co1.g.f125301a.a(this.f364245e, this.f364249i, j17, j18, this.f364250m, this.f364251n, q1Var.f364327h);
            bw5.w0 w0Var = (bw5.w0) a17.f384374d;
            boolean booleanValue = ((java.lang.Boolean) a17.f384375e).booleanValue();
            long longValue = ((java.lang.Number) a17.f384376f).longValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "onGetChatPackageComplete return, conversationId = " + str + ", isLast = " + booleanValue + ", realOffset = " + longValue);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g0 g0Var2 = q1Var.f364320a;
            if (g0Var2 != null) {
                g0Var2.a(this.f364244d, booleanValue, longValue, w0Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
