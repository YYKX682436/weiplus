package h34;

/* loaded from: classes2.dex */
public class h extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f360068d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f360069e;

    public h(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.hz4();
        lVar.f152198b = new r45.iz4();
        lVar.f152199c = "/cgi-bin/mmoctv/optvhist";
        lVar.f152200d = 1740;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f360069e = a17;
        r45.hz4 hz4Var = (r45.hz4) a17.f152243a.f152217a;
        hz4Var.f458103d = i17;
        hz4Var.f458104e = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f360068d = u0Var;
        return mo9409x10f9447a(sVar, this.f360069e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1740;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneOpTvHist", "onGYNetEnd [%d,%d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f360068d.mo815x76e0bfae(i18, i19, str, this);
    }
}
