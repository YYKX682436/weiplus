package yn1;

/* loaded from: classes11.dex */
public final class e3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f545185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f545186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f545187f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f545188g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f545189h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f545190i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545191m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f545192n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f545193o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(long j17, long j18, yn1.a4 a4Var, long j19, long j27, boolean z17, java.lang.String str, long j28, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545185d = j17;
        this.f545186e = j18;
        this.f545187f = a4Var;
        this.f545188g = j19;
        this.f545189h = j27;
        this.f545190i = z17;
        this.f545191m = str;
        this.f545192n = j28;
        this.f545193o = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.e3(this.f545185d, this.f545186e, this.f545187f, this.f545188g, this.f545189h, this.f545190i, this.f545191m, this.f545192n, this.f545193o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yn1.e3 e3Var = (yn1.e3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        e3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        long j17 = this.f545185d;
        long j18 = this.f545186e;
        yn1.a4 a4Var = this.f545187f;
        if (j17 > j18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a4Var.f545139a, "[getChatPackageAsync] fromTime > toTime, skip DB query, return");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar2 = a4Var.f545142d;
            if (aVar2 != null) {
                aVar2.a(this.f545188g, true, this.f545189h, new bw5.w0());
            }
        } else {
            jz5.o a17 = co1.g.f125301a.a(this.f545191m, this.f545192n, j17, j18, this.f545189h, this.f545193o, new do1.a(false, this.f545190i));
            bw5.w0 w0Var = (bw5.w0) a17.f384374d;
            boolean booleanValue = ((java.lang.Boolean) a17.f384375e).booleanValue();
            long longValue = ((java.lang.Number) a17.f384376f).longValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a4Var.f545139a, "[getChatPackageAsync] taskId=" + this.f545188g + ", isDone=" + booleanValue + ", afterOffset=" + longValue);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar3 = a4Var.f545142d;
            if (aVar3 != null) {
                aVar3.a(this.f545188g, booleanValue, longValue, w0Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
