package b43;

/* loaded from: classes4.dex */
public class f implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public u33.e f17814d;

    /* renamed from: e, reason: collision with root package name */
    public v33.s f17815e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17816f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17817g = false;

    public f(s33.i iVar, u33.e eVar) {
        this.f17814d = eVar;
    }

    public final synchronized void a(java.lang.String str, long j17, java.lang.String str2) {
        boolean z17 = this.f17817g;
        if (!z17 && this.f17816f) {
            this.f17817g = true;
            this.f17815e = new v33.s(str, j17, str2, hashCode());
            gm0.j1.d().g(this.f17815e);
            return;
        }
        com.tencent.mars.xlog.Log.i("GameChatRoom.ReceiveChatRoomMsgKeepAliveService", "mIsRunning：%b, mIsAlive: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f17816f));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        if (m1Var.getType() == 4302) {
            v33.s sVar = (v33.s) m1Var;
            if (sVar.f433147f != hashCode()) {
                com.tencent.mars.xlog.Log.i("GameChatRoom.ReceiveChatRoomMsgKeepAliveService", "instanceId is diff");
                return;
            }
            com.tencent.mm.modelbase.o oVar = sVar.f433146e;
            com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgRequest receiveChatroomMsgRequest = (com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgRequest) oVar.f70710a.f70684a;
            com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse receiveChatroomMsgResponse = (com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse) oVar.f70711b.f70700a;
            if (i17 == 0 && i18 == 0 && receiveChatroomMsgResponse != null) {
                receiveChatroomMsgRequest.seq = receiveChatroomMsgResponse.next_seq;
                receiveChatroomMsgRequest.version = receiveChatroomMsgResponse.next_version;
                u33.e eVar = this.f17814d;
                if (eVar != null) {
                    eVar.w3(s33.i.KEEP_ALIVE_TYPE_RECEIVE_CHATROOM_MSG, receiveChatroomMsgResponse);
                }
                z17 = false;
            } else {
                z17 = true;
            }
            com.tencent.mars.xlog.Log.i("GameChatRoom.ReceiveChatRoomMsgKeepAliveService", "hashcode = %d, chatroom:%s, newSeq:%d, nextVersion:%s, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(hashCode()), receiveChatroomMsgRequest.chatroom_name, java.lang.Long.valueOf(receiveChatroomMsgRequest.seq), receiveChatroomMsgRequest.version, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            ((ku5.t0) ku5.t0.f312615d).k(new b43.e(this, receiveChatroomMsgRequest), z17 ? 2000L : 0L);
        }
    }
}
