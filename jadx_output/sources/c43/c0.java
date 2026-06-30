package c43;

/* loaded from: classes15.dex */
public class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c43.x f38404d;

    public c0(c43.x xVar) {
        this.f38404d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        v33.y yVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if ((view.getTag() instanceof com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo) && ((com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo) view.getTag()).can_vote) {
            boolean z17 = ((com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo) view.getTag()).voted_by_me;
            c43.x xVar = this.f38404d;
            if (z17) {
                java.lang.String str = xVar.S;
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = xVar.f38495m;
                yVar = new v33.y(str, chatroomMsgPack.seq, false, chatroomMsgPack.from_username, 16);
            } else {
                java.lang.String str2 = xVar.S;
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack2 = xVar.f38495m;
                yVar = new v33.y(str2, chatroomMsgPack2.seq, true, chatroomMsgPack2.from_username, 16);
            }
            gm0.j1.d().g(yVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
