package jg0;

/* loaded from: classes12.dex */
public final class g extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jg0.x f381101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.f0 f381102e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(jg0.x xVar, qi3.f0 f0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f381101d = xVar;
        this.f381102e = f0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jg0.g(this.f381101d, this.f381102e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((jg0.g) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        jg0.x xVar = this.f381101d;
        cg0.d dVar = xVar.f381171i;
        z15.b bVar = new z15.b();
        cg0.d dVar2 = xVar.f381171i;
        bVar.u(dVar2.f122588h);
        bVar.t(false);
        bVar.q(dVar2.f122589i);
        bVar.r(c01.z1.r());
        dVar.f122585e = bVar;
        java.lang.String str = "newSendVoice_" + dVar2.f122582b;
        w21.w0 w0Var = new w21.w0();
        w0Var.f524018b = dVar2.f122582b;
        w0Var.f524019c = dVar2.f122581a;
        long j17 = 1000;
        w0Var.f524026j = java.lang.System.currentTimeMillis() / j17;
        w0Var.f524020d = str;
        w0Var.f524027k = java.lang.System.currentTimeMillis() / j17;
        w0Var.f524025i = 1;
        w0Var.f524030n = c01.z1.r();
        w0Var.f524017a = -1;
        ((bv.p0) ((cv.i1) i95.n0.c(cv.i1.class))).getClass();
        boolean L0 = w21.p0.Di().L0(w0Var);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!L0) {
            this.f381102e.f445233a = -520014;
        }
        return f0Var;
    }
}
