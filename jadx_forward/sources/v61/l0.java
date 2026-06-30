package v61;

/* loaded from: classes2.dex */
public class l0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f514990d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f514991e = null;

    public l0(r45.mz5 mz5Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = mz5Var;
        lVar.f152198b = new r45.nz5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/sendphoto2fbwall";
        lVar.f152200d = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60882xebef0e00;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f514990d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f514991e = u0Var;
        return mo9409x10f9447a(sVar, this.f514990d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60882xebef0e00;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f514991e.mo815x76e0bfae(i18, i19, str, this);
    }
}
