package ws2;

/* loaded from: classes3.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.j2 f530568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.i7 f530569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f530570f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(ws2.j2 j2Var, mm2.i7 i7Var, gk2.e eVar) {
        super(3);
        this.f530568d = j2Var;
        this.f530569e = i7Var;
        this.f530570f = eVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        r45.hd5 hd5Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        r45.o12 resp = (r45.o12) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        this.f530568d.f530595i = false;
        if (booleanValue) {
            long j17 = this.f530569e.f410680d;
            mm2.i7 i7Var = ((mm2.h5) this.f530570f.a(mm2.h5.class)).f410645g;
            if (j17 == (i7Var != null ? i7Var.f410680d : 0L)) {
                mm2.i7 i7Var2 = ((mm2.h5) this.f530570f.a(mm2.h5.class)).f410645g;
                if (i7Var2 != null && (hd5Var = i7Var2.f410681e) != null) {
                    hd5Var.set(5, 0);
                }
                ((mm2.h5) this.f530570f.a(mm2.h5.class)).N6(null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
                if (k0Var != null) {
                    k0Var.mo46557x60d69242(qo0.b.f446905k2, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
