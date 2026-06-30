package c43;

/* loaded from: classes15.dex */
public class u0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c43.x f38482d;

    public u0(c43.x xVar) {
        this.f38482d = xVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        c43.x xVar = this.f38482d;
        if (xVar.M != null && !xVar.s() && !s33.y.e(xVar.S).f402491b) {
            com.tencent.mm.autogen.events.ChatRoomAtFunctionEvent chatRoomAtFunctionEvent = new com.tencent.mm.autogen.events.ChatRoomAtFunctionEvent();
            java.lang.String str = xVar.f38495m.from_username;
            am.b2 b2Var = chatRoomAtFunctionEvent.f54037g;
            b2Var.f6208a = str;
            b2Var.f6209b = ((y33.e) xVar.M).field_nickName;
            chatRoomAtFunctionEvent.e();
            com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
            long j17 = xVar.f38494i;
            long j18 = xVar.f38493h;
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = xVar.f38495m;
            fVar.g(4L, 27L, j17, j18, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0L, xVar.X);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
