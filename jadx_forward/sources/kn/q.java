package kn;

/* loaded from: classes2.dex */
public class q extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f390979d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f390980e;

    public q(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ze0();
        lVar.f152198b = new r45.af0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/dismisschatroom";
        lVar.f152200d = 6217;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f390980e = a17;
        ((r45.ze0) a17.f152243a.f152217a).f473483d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f390979d = u0Var;
        return mo9409x10f9447a(sVar, this.f390980e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6217;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneExtFunctionSwitch", "return is 0.now we parse the json and resetList..");
        }
        this.f390979d.mo815x76e0bfae(i18, i19, str, this);
    }
}
