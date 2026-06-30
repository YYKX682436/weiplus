package mx0;

/* loaded from: classes5.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f413711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f413712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 f413713f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f413714g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(mx0.e1 e1Var, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad63, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413712e = e1Var;
        this.f413713f = c4023x59e5ad63;
        this.f413714g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.o0(this.f413712e, this.f413713f, this.f413714g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.o0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f413711d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pp0.p0 p0Var = this.f413712e.f413467a;
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad63 = this.f413713f;
            this.f413711d = 1;
            obj = p0Var.K(c4023x59e5ad63, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        mx0.e1 e1Var = this.f413712e;
        e1Var.f(e1Var.f413474h ? mx0.d0.f413436q : mx0.d0.f413428f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaterialImportHelper", "exitImportCrop: after endAdjustSpatialDesc importPreviewState = " + this.f413712e.f413468b);
        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        mx0.n0 n0Var = new mx0.n0(this.f413714g, booleanValue, null);
        this.f413711d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, n0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
