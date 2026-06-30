package ff1;

/* loaded from: classes15.dex */
public class a implements ye1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 f343131a;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47) {
        this.f343131a = abstractC12277x3bbbdb47;
    }

    @Override // ye1.l
    public boolean a(ye1.e eVar, int i17, int i18) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)};
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47.Q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47 = this.f343131a;
        abstractC12277x3bbbdb47.d("onInfo [%d %d]", objArr);
        ff1.a0 a0Var = abstractC12277x3bbbdb47.f165200r;
        if (a0Var == null) {
            return false;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12279x72b371cf) a0Var).u(i17, i18);
        return false;
    }
}
