package kn;

/* loaded from: classes2.dex */
public class c0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f390913d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f390914e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f390915f;

    public c0(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        this.f390915f = str2;
        r45.so6 so6Var = new r45.so6();
        so6Var.f467422d = str;
        so6Var.f467423e = str2;
        lVar.f152197a = so6Var;
        lVar.f152198b = new r45.to6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/transferchatroomowner";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.yc.f35026x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f390913d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f390914e = u0Var;
        return mo9409x10f9447a(sVar, this.f390913d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.yc.f35026x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneTransferChatRoomOwner", "errType = " + i18 + " errCode " + i19 + " errMsg " + str);
        this.f390914e.mo815x76e0bfae(i18, i19, str, this);
    }
}
