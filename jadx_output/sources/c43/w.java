package c43;

/* loaded from: classes8.dex */
public class w extends c43.x {
    public com.tencent.mm.ui.widget.MMNeat7extView Z;

    public w(android.view.View view, int i17) {
        super(view, i17);
    }

    @Override // c43.x
    public void k(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack) {
        this.Z.b(this.f38492g.getString(com.tencent.mm.R.string.fkx));
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f38492g).inflate(com.tencent.mm.R.layout.f489139bf0, (android.view.ViewGroup) null);
        this.Z = (com.tencent.mm.ui.widget.MMNeat7extView) inflate.findViewById(com.tencent.mm.R.id.f485100gj3);
        return inflate;
    }
}
