package ai4;

/* loaded from: classes11.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f5178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.f1 f5179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5180f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ai4.a f5181g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5182h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5183i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j17, kotlinx.coroutines.f1 f1Var, java.lang.String str, ai4.a aVar, int i17, java.lang.String str2) {
        super(1);
        this.f5178d = j17;
        this.f5179e = f1Var;
        this.f5180f = str;
        this.f5181g = aVar;
        this.f5182h = i17;
        this.f5183i = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f5178d;
        ai4.j0 j0Var = (ai4.j0) this.f5179e.f();
        boolean z17 = j0Var.f5158a;
        long j17 = j0Var.f5159b;
        long j18 = j0Var.f5160c;
        boolean z18 = z17 && j18 >= j17;
        if (z18) {
            ai4.b0.f5124b.G(this.f5180f, true);
        }
        java.lang.String b17 = ai4.b0.f5123a.b(ai4.b0.f5128f);
        com.tencent.mm.sdk.platformtools.o4 o4Var = ai4.b0.f5124b;
        long max = java.lang.Math.max(o4Var.getLong(b17, 0L), currentTimeMillis);
        o4Var.B(b17, max);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkStartTransferJob: ");
        sb6.append(this.f5181g.name());
        sb6.append(", complete ");
        sb6.append(z18);
        sb6.append(", timeCost=");
        sb6.append(currentTimeMillis);
        sb6.append(", curMaxJobTimeCost=");
        sb6.append(max);
        sb6.append(", err=");
        sb6.append(th6 != null ? jz5.a.b(th6) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusAffDBTransfer", sb6.toString());
        qj4.s.f363958a.r(2L, java.lang.Integer.valueOf(this.f5182h), java.lang.Integer.valueOf(ai4.b0.f5128f), this.f5183i, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        return jz5.f0.f302826a;
    }
}
