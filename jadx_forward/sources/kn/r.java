package kn;

/* loaded from: classes8.dex */
public class r extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f390981d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f390982e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ca3 f390983f;

    public r(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[0] = str == null ? "" : str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetAssociateChatRoomManageInfo", "NetSceneGetAssociateChatRoomManageInfo roomname:%s", objArr);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getassociatechatroommanageinfo";
        lVar.f152200d = 3553;
        lVar.f152197a = new r45.ba3();
        lVar.f152198b = new r45.ca3();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f390982e = a17;
        r45.ba3 ba3Var = (r45.ba3) a17.f152243a.f152217a;
        ba3Var.f452180d = str == null ? "" : str;
        ba3Var.f452182f = 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f390981d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f390982e;
        this.f390983f = (r45.ca3) oVar.f152244b.f152233a;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3553;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f390981d.mo815x76e0bfae(i18, i19, str, this);
    }

    public r(java.lang.String str, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[0] = str == null ? "" : str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetAssociateChatRoomManageInfo", "NetSceneGetAssociateChatRoomManageInfo ticket:%s", objArr);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getassociatechatroommanageinfo";
        lVar.f152200d = 3553;
        lVar.f152197a = new r45.ba3();
        lVar.f152198b = new r45.ca3();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f390982e = a17;
        r45.ba3 ba3Var = (r45.ba3) a17.f152243a.f152217a;
        ba3Var.f452181e = str == null ? "" : str;
        ba3Var.f452182f = 1;
    }
}
