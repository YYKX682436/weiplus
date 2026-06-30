package kn;

/* loaded from: classes8.dex */
public class d0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f390916d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f390917e;

    /* renamed from: f, reason: collision with root package name */
    public r45.lt6 f390918f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f390919g;

    public d0(java.lang.String str, java.lang.String str2, int i17) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[0] = str == null ? "" : str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUpgradeAssociateChatRoom", "NetSceneUpgradeAssociateChatRoom roomname:%s", objArr);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/upgradeassociatechatroom";
        lVar.f152200d = 3927;
        lVar.f152197a = new r45.kt6();
        lVar.f152198b = new r45.lt6();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f390917e = a17;
        this.f390919g = str;
        r45.kt6 kt6Var = (r45.kt6) a17.f152243a.f152217a;
        kt6Var.f460476d = str;
        kt6Var.f460477e = str2;
        kt6Var.f460478f = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f390916d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f390917e;
        this.f390918f = (r45.lt6) oVar.f152244b.f152233a;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3927;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f390916d.mo815x76e0bfae(i18, i19, str, this);
    }
}
