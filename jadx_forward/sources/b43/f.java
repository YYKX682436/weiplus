package b43;

/* loaded from: classes4.dex */
public class f implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public u33.e f99347d;

    /* renamed from: e, reason: collision with root package name */
    public v33.s f99348e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f99349f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f99350g = false;

    public f(s33.i iVar, u33.e eVar) {
        this.f99347d = eVar;
    }

    public final synchronized void a(java.lang.String str, long j17, java.lang.String str2) {
        boolean z17 = this.f99350g;
        if (!z17 && this.f99349f) {
            this.f99350g = true;
            this.f99348e = new v33.s(str, j17, str2, hashCode());
            gm0.j1.d().g(this.f99348e);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.ReceiveChatRoomMsgKeepAliveService", "mIsRunning：%b, mIsAlive: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f99349f));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        if (m1Var.mo808xfb85f7b0() == 4302) {
            v33.s sVar = (v33.s) m1Var;
            if (sVar.f514680f != hashCode()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.ReceiveChatRoomMsgKeepAliveService", "instanceId is diff");
                return;
            }
            com.p314xaae8f345.mm.p944x882e457a.o oVar = sVar.f514679e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15805x42667c84 c15805x42667c84 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15805x42667c84) oVar.f152243a.f152217a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15806xd90c8ec c15806xd90c8ec = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15806xd90c8ec) oVar.f152244b.f152233a;
            if (i17 == 0 && i18 == 0 && c15806xd90c8ec != null) {
                c15805x42667c84.seq = c15806xd90c8ec.f36840x54ebc513;
                c15805x42667c84.f36836x14f51cd8 = c15806xd90c8ec.f36841x5f83ab8c;
                u33.e eVar = this.f99347d;
                if (eVar != null) {
                    eVar.w3(s33.i.KEEP_ALIVE_TYPE_RECEIVE_CHATROOM_MSG, c15806xd90c8ec);
                }
                z17 = false;
            } else {
                z17 = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.ReceiveChatRoomMsgKeepAliveService", "hashcode = %d, chatroom:%s, newSeq:%d, nextVersion:%s, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(hashCode()), c15805x42667c84.f36835x3923b317, java.lang.Long.valueOf(c15805x42667c84.seq), c15805x42667c84.f36836x14f51cd8, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            ((ku5.t0) ku5.t0.f394148d).k(new b43.e(this, c15805x42667c84), z17 ? 2000L : 0L);
        }
    }
}
