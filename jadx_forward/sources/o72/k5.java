package o72;

/* loaded from: classes4.dex */
public class k5 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f424924d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f424925e = null;

    public k5() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.rf3();
        lVar.f152198b = new r45.sf3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getfavinfo";
        lVar.f152200d = 438;
        lVar.f152201e = 217;
        lVar.f152202f = 1000000217;
        this.f424924d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f424925e = u0Var;
        return mo9409x10f9447a(sVar, this.f424924d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 438;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.sf3 sf3Var = (r45.sf3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            o72.x1.I0(sf3Var.f467196d);
            o72.x1.H0(sf3Var.f467197e);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).edit().putLong("fav_mx_auto_download_size", sf3Var.f467200h).commit();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).edit().putLong("fav_mx_auto_upload_size", sf3Var.f467199g).commit();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).edit().putLong("fav_mx_file_size", sf3Var.f467198f).commit();
        }
        this.f424925e.mo815x76e0bfae(i18, i19, str, this);
    }
}
