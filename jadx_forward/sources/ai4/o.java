package ai4;

/* loaded from: classes11.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f86711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.f1 f86712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86713f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ai4.a f86714g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f86715h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86716i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j17, p3325xe03a0797.p3326xc267989b.f1 f1Var, java.lang.String str, ai4.a aVar, int i17, java.lang.String str2) {
        super(1);
        this.f86711d = j17;
        this.f86712e = f1Var;
        this.f86713f = str;
        this.f86714g = aVar;
        this.f86715h = i17;
        this.f86716i = str2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f86711d;
        ai4.j0 j0Var = (ai4.j0) this.f86712e.f();
        boolean z17 = j0Var.f86691a;
        long j17 = j0Var.f86692b;
        long j18 = j0Var.f86693c;
        boolean z18 = z17 && j18 >= j17;
        if (z18) {
            ai4.b0.f86657b.G(this.f86713f, true);
        }
        java.lang.String b17 = ai4.b0.f86656a.b(ai4.b0.f86661f);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = ai4.b0.f86657b;
        long max = java.lang.Math.max(o4Var.getLong(b17, 0L), currentTimeMillis);
        o4Var.B(b17, max);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkStartTransferJob: ");
        sb6.append(this.f86714g.name());
        sb6.append(", complete ");
        sb6.append(z18);
        sb6.append(", timeCost=");
        sb6.append(currentTimeMillis);
        sb6.append(", curMaxJobTimeCost=");
        sb6.append(max);
        sb6.append(", err=");
        sb6.append(th6 != null ? jz5.a.b(th6) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffDBTransfer", sb6.toString());
        qj4.s.f445491a.r(2L, java.lang.Integer.valueOf(this.f86715h), java.lang.Integer.valueOf(ai4.b0.f86661f), this.f86716i, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        return jz5.f0.f384359a;
    }
}
