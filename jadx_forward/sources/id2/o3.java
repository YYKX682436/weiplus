package id2;

/* loaded from: classes.dex */
public final class o3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f372240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f372242f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f372243g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f372244h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f372245i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f372246m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f372247n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f372248o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ km2.b f372249p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.l f372250q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(id2.u3 u3Var, java.lang.String str, android.content.Context context, long j17, long j18, boolean z17, boolean z18, boolean z19, km2.b bVar, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372241e = u3Var;
        this.f372242f = str;
        this.f372243g = context;
        this.f372244h = j17;
        this.f372245i = j18;
        this.f372246m = z17;
        this.f372247n = z18;
        this.f372248o = z19;
        this.f372249p = bVar;
        this.f372250q = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new id2.o3(this.f372241e, this.f372242f, this.f372243g, this.f372244h, this.f372245i, this.f372246m, this.f372247n, this.f372248o, this.f372249p, this.f372250q, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.o3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f372240d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            id2.n3 n3Var = new id2.n3(this.f372241e, this.f372242f, this.f372243g, this.f372244h, this.f372245i, this.f372246m, this.f372247n, this.f372248o, this.f372249p, this.f372250q, null);
            this.f372240d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, n3Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
