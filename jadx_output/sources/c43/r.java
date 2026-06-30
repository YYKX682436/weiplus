package c43;

/* loaded from: classes8.dex */
public class r extends c43.x {
    public com.tencent.mm.ui.widget.MMNeat7extView Z;

    /* renamed from: p0, reason: collision with root package name */
    public final c43.h1 f38474p0;

    public r(android.view.View view, int i17) {
        super(view, i17);
        this.f38474p0 = new c43.h1();
    }

    @Override // c43.x
    public void k(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack) {
        com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSys chatroomMsgSys;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl chatroomMsgTpl;
        if (chatroomMsgPack == null || (msgContent = chatroomMsgPack.msg_content) == null || (chatroomMsgSys = msgContent.chatroom_sys) == null || (chatroomMsgTpl = chatroomMsgSys.chatroom_msg_tpl) == null) {
            return;
        }
        this.f38474p0.a(this.f38492g, chatroomMsgTpl.tpl_block_list, s(), new c43.q(this, chatroomMsgPack));
    }

    @Override // c43.x
    public boolean n() {
        return true;
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f38492g).inflate(com.tencent.mm.R.layout.bez, (android.view.ViewGroup) null);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) inflate.findViewById(com.tencent.mm.R.id.f485100gj3);
        this.Z = mMNeat7extView;
        mMNeat7extView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y(mMNeat7extView, new com.tencent.mm.pluginsdk.ui.span.y0(this.Z.getContext())));
        return inflate;
    }
}
