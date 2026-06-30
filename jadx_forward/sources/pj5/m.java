package pj5;

/* loaded from: classes9.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pj5.l f436921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f436922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z01.d0 f436923f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22089x7f01e429 f436924g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(pj5.l lVar, in5.s0 s0Var, z01.d0 d0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22089x7f01e429 c22089x7f01e429) {
        super(1);
        this.f436921d = lVar;
        this.f436922e = s0Var;
        this.f436923f = d0Var;
        this.f436924g = c22089x7f01e429;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xm3.t0 b17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe;
        long longValue = ((java.lang.Number) obj).longValue();
        pj5.l lVar = (pj5.l) this.f436921d.y0();
        lVar.f436920d.f461210f = (int) (longValue / 1000);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o17 = this.f436922e.o();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = o17 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) o17 : null;
        if (c22849x81a93d25 != null && (b17 = xm3.u0.b(c22849x81a93d25)) != null && (c16718x7059cefe = b17.I) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.A(c16718x7059cefe, lVar, false, 2, null);
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(longValue);
        z01.d0 d0Var = this.f436923f;
        d0Var.f550522g = valueOf;
        this.f436924g.m48330xfcfee142(d0Var);
        return jz5.f0.f384359a;
    }
}
