package yw;

/* loaded from: classes9.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f547944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f547945e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yw.y yVar, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f547944d = yVar;
        this.f547945e = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yw.o(this.f547944d, this.f547945e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yw.o oVar = (yw.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        oVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int wi6 = ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b2) ((rv.c3) i95.n0.c(rv.c3.class))).wi();
        dw5.i iVar = new dw5.i();
        if (wi6 < 0) {
            iVar.f325900e = 99999;
            iVar.f325902g[2] = true;
        } else {
            iVar.f325900e = wi6;
            iVar.f325902g[2] = true;
        }
        iVar.f325899d = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).l() != -1;
        iVar.f325902g[1] = true;
        ((ku5.t0) ku5.t0.f394148d).h(new yw.n(iVar, this.f547944d, this.f547945e), "BizFlutterResortUserActiveReportInfo");
        return jz5.f0.f384359a;
    }
}
