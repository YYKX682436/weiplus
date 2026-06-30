package a0;

/* loaded from: classes14.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f81607d;

    /* renamed from: e, reason: collision with root package name */
    public int f81608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f81609f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f81610g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.o f81611h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f81612i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(n0.e5 e5Var, long j17, c0.o oVar, n0.v2 v2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f81609f = e5Var;
        this.f81610g = j17;
        this.f81611h = oVar;
        this.f81612i = v2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a0.b0(this.f81609f, this.f81610g, this.f81611h, this.f81612i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        c0.r rVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f81608e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (((java.lang.Boolean) ((yz5.a) this.f81609f.mo128745x754a37bb()).mo152xb9724478()).booleanValue()) {
                long j17 = a0.f0.f81655a;
                this.f81608e = 1;
                if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = (c0.r) this.f81607d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                this.f81612i.mo148714x53d8522f(rVar);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        c0.r rVar2 = new c0.r(this.f81610g, null);
        this.f81607d = rVar2;
        this.f81608e = 2;
        if (((c0.p) this.f81611h).a(rVar2, this) == aVar) {
            return aVar;
        }
        rVar = rVar2;
        this.f81612i.mo148714x53d8522f(rVar);
        return jz5.f0.f384359a;
    }
}
