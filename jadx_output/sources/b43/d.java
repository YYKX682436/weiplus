package b43;

/* loaded from: classes4.dex */
public class d implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public u33.e f17802d;

    /* renamed from: e, reason: collision with root package name */
    public final s33.i f17803e;

    /* renamed from: f, reason: collision with root package name */
    public v33.h f17804f;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f17808m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f17809n;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17805g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17806h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17807i = false;

    /* renamed from: o, reason: collision with root package name */
    public int f17810o = 2;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f17811p = new java.util.LinkedList();

    public d(s33.i iVar, u33.e eVar) {
        this.f17803e = iVar;
        this.f17802d = eVar;
    }

    public final synchronized void a(java.util.List list, java.lang.String str, java.lang.String str2) {
        boolean z17 = this.f17807i;
        if (!z17 && this.f17805g) {
            this.f17809n = str2;
            ((java.util.LinkedList) this.f17811p).clear();
            if (list != null) {
                ((java.util.LinkedList) this.f17811p).addAll(list);
            }
            this.f17807i = true;
            this.f17804f = new v33.h(list, str, str2, this.f17810o, hashCode());
            gm0.j1.d().g(this.f17804f);
            return;
        }
        com.tencent.mars.xlog.Log.i("GameChatRoom.GetMyChatRoomKeepAliveService", "mIsRunning：%b, mIsAlive: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f17805g));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() == 4989) {
            v33.h hVar = (v33.h) m1Var;
            if (hVar.f433116f != hashCode()) {
                com.tencent.mars.xlog.Log.i("GameChatRoom.GetMyChatRoomKeepAliveService", "instanceId is diff");
                return;
            }
            com.tencent.mm.modelbase.o oVar = hVar.f433115e;
            com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest getMyChatroomRequest = (com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest) oVar.f70710a.f70684a;
            com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomResponse getMyChatroomResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomResponse) oVar.f70711b.f70700a;
            boolean z17 = true;
            if (i17 == 0 && i18 == 0 && getMyChatroomResponse != null) {
                java.lang.String str2 = getMyChatroomRequest.version;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 == null) {
                    str2 = "";
                }
                if (!str2.equals(getMyChatroomResponse.next_version)) {
                    getMyChatroomRequest.version = getMyChatroomResponse.next_version;
                    synchronized (this) {
                        if (this.f17802d != null && getMyChatroomResponse.my_chatroom_info_list != null) {
                            com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom localMyChatRoom = new com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom();
                            localMyChatRoom.my_chatroom_info_list.addAll(getMyChatroomResponse.my_chatroom_info_list);
                            localMyChatRoom.my_chatroom_notice = getMyChatroomResponse.my_chatroom_notice;
                            com.tencent.mars.xlog.Log.i("GameChatRoom.GetMyChatRoomKeepAliveService", "before reorder size:%d, after reorder size:%d", java.lang.Integer.valueOf(getMyChatroomResponse.my_chatroom_info_list.size()), java.lang.Integer.valueOf(localMyChatRoom.my_chatroom_info_list.size()));
                            this.f17802d.w3(this.f17803e, localMyChatRoom);
                        }
                    }
                    z17 = false;
                }
            }
            com.tencent.mars.xlog.Log.i("GameChatRoom.GetMyChatRoomKeepAliveService", "hashcode = %d, newVersion:%s, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(hashCode()), getMyChatroomRequest.version, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            ((ku5.t0) ku5.t0.f312615d).k(new b43.c(this, getMyChatroomRequest), z17 ? 2000L : 0L);
        }
    }
}
