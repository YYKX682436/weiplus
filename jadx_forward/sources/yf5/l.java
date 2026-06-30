package yf5;

/* loaded from: classes11.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.m f543432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf5.x f543433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f543434f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f543435g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yf5.m mVar, yf5.x xVar, boolean z17, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f543432d = mVar;
        this.f543433e = xVar;
        this.f543434f = z17;
        this.f543435g = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yf5.l(this.f543432d, this.f543433e, this.f543434f, this.f543435g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yf5.l lVar = (yf5.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        lVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yf5.m mVar = this.f543432d;
        java.lang.String str = mVar.f543441b;
        yf5.x xVar = this.f543433e;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = xVar.f543528d;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = xVar.f543528d;
        if (l4Var2 != null) {
            new java.lang.Long(l4Var2.G0());
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var3 = xVar.f543528d;
        if (l4Var3 != null) {
            new java.lang.Long(l4Var3.w0());
        }
        if (xVar.f543528d.G0() >= mVar.f543445f.f543396a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = mVar.f543440a.f543495f;
            if (c16718x7059cefe != null) {
                c16718x7059cefe.y(xVar, this.f543434f);
            }
        } else {
            mVar.f543444e.put(xVar.f543528d.h1(), new yf5.f(xVar, xm3.i.f536855e, this.f543435g));
        }
        return jz5.f0.f384359a;
    }
}
