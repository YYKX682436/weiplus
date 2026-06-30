package mx0;

/* loaded from: classes5.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f413623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f413624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f413625f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(mx0.e1 e1Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413624e = e1Var;
        this.f413625f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.k0(this.f413624e, this.f413625f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.k0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f413623d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pp0.p0 p0Var = this.f413624e.f413467a;
            this.f413623d = 1;
            obj = p0Var.o(this);
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
        jz5.l lVar = (jz5.l) obj;
        mx0.e1 e1Var = this.f413624e;
        e1Var.f(lVar != null ? mx0.d0.f413433n : e1Var.f413474h ? mx0.d0.f413436q : mx0.d0.f413428f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaterialImportHelper", "enterImportCrop: after beginAdjustSpatialDesc importPreviewState = " + this.f413624e.f413468b);
        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        mx0.j0 j0Var = new mx0.j0(this.f413625f, lVar, null);
        this.f413623d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, j0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
