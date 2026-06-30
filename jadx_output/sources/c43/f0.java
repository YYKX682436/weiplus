package c43;

/* loaded from: classes15.dex */
public class f0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c43.x f38424d;

    public f0(c43.x xVar) {
        this.f38424d = xVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpInfo chatroomJumpInfo;
        com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo;
        com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions msgOptions;
        com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo voteInfo;
        int itemId = menuItem.getItemId();
        com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
        c43.x xVar = this.f38424d;
        switch (itemId) {
            case 9527:
                if (xVar.f38495m == null || xVar.M == null) {
                    return;
                }
                com.tencent.mm.autogen.events.ChatRoomAtFunctionEvent chatRoomAtFunctionEvent = new com.tencent.mm.autogen.events.ChatRoomAtFunctionEvent();
                java.lang.String str = xVar.f38495m.from_username;
                am.b2 b2Var = chatRoomAtFunctionEvent.f54037g;
                b2Var.f6208a = str;
                b2Var.f6209b = ((y33.e) xVar.M).field_nickName;
                chatRoomAtFunctionEvent.e();
                long j17 = xVar.f38494i;
                long j18 = xVar.f38493h;
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = xVar.f38495m;
                fVar.g(5L, 2L, j17, j18, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0L, xVar.X);
                return;
            case 9528:
                if (xVar.f38495m != null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", xVar.f38495m.msg_options.complaint_url);
                    j45.l.j(xVar.f38492g, "webview", ".ui.tools.WebViewUI", intent, null);
                    return;
                }
                return;
            case 9529:
                if (xVar.M == null || xVar.N == null || (chatroomJumpInfo = xVar.Q) == null || (jumpInfo = chatroomJumpInfo.manage_jump_info) == null) {
                    return;
                }
                java.lang.String str2 = jumpInfo.jump_url;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    return;
                }
                java.lang.String b17 = s33.y.b(str2, "username=" + ((y33.e) xVar.M).field_userName);
                if (((y33.e) xVar.N).field_userRole != null) {
                    b17 = s33.y.b(b17, "from_role=" + ((y33.e) xVar.N).field_userRole.role);
                }
                if (((y33.e) xVar.M).field_userRole != null) {
                    b17 = s33.y.b(b17, "to_role=" + ((y33.e) xVar.M).field_userRole.role);
                }
                java.lang.String b18 = s33.y.b(b17, "chatroom_name=" + xVar.S);
                com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
                try {
                    jumpInfo2.parseFrom(xVar.Q.manage_jump_info.toByteArray());
                    jumpInfo2.jump_url = b18;
                    s33.y.h(xVar.f38492g, jumpInfo2);
                    return;
                } catch (java.io.IOException unused) {
                    return;
                }
            case 9530:
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack2 = xVar.f38495m;
                if (chatroomMsgPack2 != null) {
                    long j19 = chatroomMsgPack2.seq;
                    xVar.getClass();
                    android.content.Context context = xVar.f38492g;
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
                    k0Var.f211872n = new c43.g0(xVar);
                    k0Var.f211881s = new c43.h0(xVar, j19);
                    k0Var.t(true);
                    android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bht, (android.view.ViewGroup) null);
                    ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mty)).setText(com.tencent.mm.R.string.j4e);
                    k0Var.s(inflate, false);
                    k0Var.v();
                    return;
                }
                return;
            case 9531:
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack3 = xVar.f38495m;
                if (chatroomMsgPack3 != null) {
                    c43.x.i(xVar, chatroomMsgPack3.seq, true);
                    return;
                }
                return;
            case 9532:
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack4 = xVar.f38495m;
                if (chatroomMsgPack4 != null) {
                    c43.x.i(xVar, chatroomMsgPack4.seq, false);
                    return;
                }
                return;
            case 9533:
                if (xVar.f38495m != null) {
                    com.tencent.mm.autogen.events.ChatRoomLocateInfoEvent chatRoomLocateInfoEvent = new com.tencent.mm.autogen.events.ChatRoomLocateInfoEvent();
                    am.d2 d2Var = chatRoomLocateInfoEvent.f54039g;
                    d2Var.f6428a = 0;
                    d2Var.f6429b = xVar.f38495m.seq;
                    d2Var.f6430c = true;
                    chatRoomLocateInfoEvent.e();
                    long j27 = xVar.f38494i;
                    long j28 = xVar.f38493h;
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack5 = xVar.f38495m;
                    fVar.g(13L, 2L, j27, j28, chatroomMsgPack5.seq, chatroomMsgPack5.from_username, 0L, xVar.X);
                    return;
                }
                return;
            case 9534:
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack6 = xVar.f38495m;
                if (chatroomMsgPack6 == null || (msgOptions = chatroomMsgPack6.msg_options) == null || (voteInfo = msgOptions.vote_info) == null || !voteInfo.can_vote) {
                    return;
                }
                gm0.j1.d().g(voteInfo.voted_by_me ? new v33.y(xVar.S, chatroomMsgPack6.seq, false, chatroomMsgPack6.from_username, 15) : new v33.y(xVar.S, chatroomMsgPack6.seq, true, chatroomMsgPack6.from_username, 15));
                return;
            default:
                xVar.x(menuItem.getItemId());
                return;
        }
    }
}
