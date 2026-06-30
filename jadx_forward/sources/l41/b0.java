package l41;

/* loaded from: classes2.dex */
public class b0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f397314d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f397315e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f397316f;

    public b0(java.lang.String str, java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.u04();
        lVar.f152198b = new r45.v04();
        lVar.f152199c = "/cgi-bin/micromsg-bin/inviteopenimchatroommember";
        lVar.f152200d = 887;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397315e = a17;
        this.f397316f = str;
        r45.u04 u04Var = (r45.u04) a17.f152243a.f152217a;
        u04Var.f468441d = str;
        u04Var.f468442e = linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneInviteOpenIMChatRoomMember", "roomname: %s, size:%d", str, java.lang.Integer.valueOf(linkedList.size()));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f397314d = u0Var;
        return mo9409x10f9447a(sVar, this.f397315e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 887;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneInviteOpenIMChatRoomMember", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, this.f397316f);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f397314d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
