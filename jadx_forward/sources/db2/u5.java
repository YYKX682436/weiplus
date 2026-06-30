package db2;

/* loaded from: classes.dex */
public final class u5 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f309722d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309723e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309724f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f309725g;

    public u5(java.util.List urlList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(urlList, "urlList");
        this.f309722d = "Finder.NetSceneFinderGetUser";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.ta1 ta1Var = new r45.ta1();
        ta1Var.m75941xfb821914(1).addAll(urlList);
        r45.ua1 ua1Var = new r45.ua1();
        lVar.f152197a = ta1Var;
        lVar.f152198b = ua1Var;
        lVar.f152200d = 3512;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetuser";
        this.f309723e = lVar.a();
        this.f309725g = urlList;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309724f = u0Var;
        return mo9409x10f9447a(sVar, this.f309723e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3512;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309722d, "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309724f;
        if (u0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
