package c43;

/* loaded from: classes9.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c43.e f38408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f38409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack f38410f;

    public d(c43.e eVar, com.tencent.mm.api.IEmojiInfo iEmojiInfo, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack) {
        this.f38408d = eVar;
        this.f38409e = iEmojiInfo;
        this.f38410f = chatroomMsgPack;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.game.chatroom.view.GameChatEmojiView gameChatEmojiView = this.f38408d.f38416p0;
        if (gameChatEmojiView != null) {
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = this.f38410f;
            long j17 = chatroomMsgPack.seq;
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f38409e;
            gameChatEmojiView.b(iEmojiInfo, j17, iEmojiInfo.k() && bm5.d1.d(chatroomMsgPack.seq, chatroomMsgPack.from_username));
        }
    }
}
