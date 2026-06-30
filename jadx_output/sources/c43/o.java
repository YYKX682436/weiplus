package c43;

/* loaded from: classes8.dex */
public class o extends c43.x {
    public com.tencent.mm.ui.widget.MMNeat7extView Z;

    /* renamed from: p0, reason: collision with root package name */
    public final c43.h1 f38466p0;

    public o(android.view.View view, int i17) {
        super(view, i17);
        this.f38466p0 = new c43.h1();
    }

    @Override // c43.x
    public void k(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack) {
        com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgNotice chatroomMsgNotice;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl chatroomMsgTpl;
        if (chatroomMsgPack == null || (msgContent = chatroomMsgPack.msg_content) == null || (chatroomMsgNotice = msgContent.chatroom_notice) == null || (chatroomMsgTpl = chatroomMsgNotice.chatroom_msg_tpl) == null) {
            return;
        }
        this.f38466p0.a(this.f38492g, chatroomMsgTpl.tpl_block_list, s(), new c43.n(this, chatroomMsgPack));
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        android.view.View inflate = android.view.LayoutInflater.from(this.f38492g).inflate(com.tencent.mm.R.layout.bex, viewGroup, false);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) inflate.findViewById(com.tencent.mm.R.id.f485100gj3);
        this.Z = mMNeat7extView;
        mMNeat7extView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y(mMNeat7extView, new com.tencent.mm.pluginsdk.ui.span.y0(this.Z.getContext())));
        return inflate;
    }
}
