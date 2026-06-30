package c43;

/* loaded from: classes8.dex */
public class s extends c43.x {
    public com.tencent.mm.ui.widget.MMNeat7extView Z;

    public s(android.view.View view, int i17) {
        super(view, i17);
    }

    @Override // c43.x
    public void k(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack) {
        com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent;
        if (chatroomMsgPack == null || (msgContent = chatroomMsgPack.msg_content) == null || msgContent.chatroom_text == null) {
            return;
        }
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.Z;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = chatroomMsgPack.msg_content.chatroom_text.content;
        ((ke0.e) xVar).getClass();
        mMNeat7extView.b(com.tencent.mm.pluginsdk.ui.span.c0.i(this.f38492g, str));
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f38492g).inflate(com.tencent.mm.R.layout.f489139bf0, (android.view.ViewGroup) null);
        this.Z = (com.tencent.mm.ui.widget.MMNeat7extView) inflate.findViewById(com.tencent.mm.R.id.f485100gj3);
        return inflate;
    }

    @Override // c43.x
    public void v(db5.g4 g4Var) {
        int y17 = g4Var.y(9531);
        int y18 = g4Var.y(9532);
        if (g4Var.findItem(1001) == null) {
            android.content.Context context = this.f38492g;
            if (y17 >= 0) {
                g4Var.e(1001, y17 + 1, context.getString(com.tencent.mm.R.string.f490359sr), com.tencent.mm.R.raw.icons_filled_copy, 0, false);
            } else if (y18 >= 0) {
                g4Var.e(1001, y18 + 1, context.getString(com.tencent.mm.R.string.f490359sr), com.tencent.mm.R.raw.icons_filled_copy, 0, false);
            } else {
                g4Var.e(1001, 0, context.getString(com.tencent.mm.R.string.f490359sr), com.tencent.mm.R.raw.icons_filled_copy, 0, false);
            }
        }
    }

    @Override // c43.x
    public void x(int i17) {
        if (i17 == 1001) {
            com.tencent.mm.sdk.platformtools.b0.e(this.Z.a());
            android.content.Context context = this.f38492g;
            db5.e1.W(context, context.getString(com.tencent.mm.R.string.f490361st));
        }
    }
}
