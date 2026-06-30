package r61;

/* loaded from: classes2.dex */
public class d1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f474369d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f474370e;

    public d1(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 870;
        r45.bi biVar = new r45.bi();
        biVar.f452304d = str;
        lVar.f152197a = biVar;
        lVar.f152199c = "/cgi-bin/micromsg-bin/bindoldwx";
        lVar.f152198b = new r45.ci();
        this.f474369d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f474370e = u0Var;
        return mo9409x10f9447a(sVar, this.f474369d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 870;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBindOldWx", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f474370e.mo815x76e0bfae(i18, i19, str, this);
    }
}
