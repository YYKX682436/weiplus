package yf5;

/* loaded from: classes11.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.m f543425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf5.x f543426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f543427f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yf5.m mVar, yf5.x xVar, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f543425d = mVar;
        this.f543426e = xVar;
        this.f543427f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yf5.k(this.f543425d, this.f543426e, this.f543427f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yf5.k kVar = (yf5.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        kVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yf5.m mVar = this.f543425d;
        java.lang.String str = mVar.f543441b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("submitInsert, ");
        yf5.x xVar = this.f543426e;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = xVar.f543528d;
        sb6.append(l4Var != null ? l4Var.h1() : null);
        sb6.append(", ");
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = xVar.f543528d;
        sb6.append(l4Var2 != null ? new java.lang.Long(l4Var2.G0()) : null);
        sb6.append(", ");
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var3 = xVar.f543528d;
        sb6.append(l4Var3 != null ? new java.lang.Long(l4Var3.w0()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (xVar.f543528d.G0() >= mVar.f543445f.f543396a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = mVar.f543440a.f543495f;
            if (c16718x7059cefe != null) {
                c16718x7059cefe.o(xVar, false);
            }
        } else {
            mVar.f543444e.put(xVar.f543528d.h1(), new yf5.f(xVar, xm3.i.f536854d, this.f543427f));
        }
        return jz5.f0.f384359a;
    }
}
