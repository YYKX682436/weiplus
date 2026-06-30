package l41;

/* loaded from: classes2.dex */
public class g0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, ab0.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f397348d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f397349e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f397350f;

    public g0(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        this.f397350f = str2;
        r45.ko4 ko4Var = new r45.ko4();
        ko4Var.f460410d = str;
        r45.xz4 xz4Var = new r45.xz4();
        ko4Var.f460411e = xz4Var;
        xz4Var.f472163d = str2;
        lVar.f152197a = ko4Var;
        lVar.f152198b = new r45.lo4();
        lVar.f152199c = "/cgi-bin/micromsg-bin/modopenimchatroomowner";
        lVar.f152200d = 811;
        this.f397348d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f397349e = u0Var;
        return mo9409x10f9447a(sVar, this.f397348d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 811;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneTransferOpenImChatRoomOwner", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f397349e.mo815x76e0bfae(i18, i19, str, this);
    }
}
