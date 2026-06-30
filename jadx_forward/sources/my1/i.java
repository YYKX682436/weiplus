package my1;

/* loaded from: classes4.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f414222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ my1.j f414223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414224f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(my1.j jVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414223e = jVar;
        this.f414224f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new my1.i(this.f414223e, this.f414224f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((my1.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        mk.e eVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f414222d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            my1.j jVar = this.f414223e;
            bw5.t4 t4Var = new bw5.t4();
            t4Var.f114773d = this.f414224f;
            t4Var.f114774e[2] = true;
            bw5.u4 u4Var = new bw5.u4();
            this.f414222d = 1;
            obj = jVar.a(28220, "/cgi-bin/mmfddataecappsvr/edgesentinelrouter", t4Var, u4Var, null, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        bw5.u4 u4Var2 = (bw5.u4) ((my1.d) obj).f414208a;
        if (u4Var2 != null && (eVar = this.f414223e.f414225a) != null) {
            ((ry5.b) eVar).d(u4Var2.f115265e[2] ? u4Var2.f115264d : "");
        }
        return jz5.f0.f384359a;
    }
}
