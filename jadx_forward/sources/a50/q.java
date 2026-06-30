package a50;

/* loaded from: classes9.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f83058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83059e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a50.a0 a0Var, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f83058d = a0Var;
        this.f83059e = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a50.q(this.f83058d, this.f83059e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        a50.q qVar = (a50.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        qVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int wi6 = ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b2) ((rv.c3) i95.n0.c(rv.c3.class))).wi();
        cw5.f fVar = new cw5.f();
        if (wi6 < 0) {
            fVar.f305887e = 99999;
            fVar.f305889g[2] = true;
        } else {
            fVar.f305887e = wi6;
            fVar.f305889g[2] = true;
        }
        fVar.f305886d = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).l() != -1;
        fVar.f305889g[1] = true;
        ((ku5.t0) ku5.t0.f394148d).h(new a50.p(fVar, this.f83058d, this.f83059e), "BizFlutterResortUserActiveReportInfo");
        return jz5.f0.f384359a;
    }
}
