package db2;

/* loaded from: classes2.dex */
public final class s5 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309687d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309688e;

    public s5(java.lang.String shortUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shortUrl, "shortUrl");
        r45.ho3 ho3Var = new r45.ho3();
        ho3Var.set(1, db2.t4.f309704a.a(6963));
        ho3Var.set(6, shortUrl);
        ho3Var.set(3, 3);
        ho3Var.set(5, 11);
        ho3Var.set(4, java.lang.Integer.valueOf(com.p314xaae8f345.p457x3304c6.C3964x9fa34f55.f15759x86570412));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ho3Var;
        lVar.f152200d = 6963;
        lVar.f152198b = new r45.io3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findertemplategetspecific";
        this.f309687d = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneFinderGetSpecificTemplate", "[init] shortUrl:".concat(shortUrl));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309688e = u0Var;
        return mo9409x10f9447a(sVar, this.f309687d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6963;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneFinderGetSpecificTemplate", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309688e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
