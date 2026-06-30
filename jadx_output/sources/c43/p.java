package c43;

/* loaded from: classes8.dex */
public final class p extends c43.x {
    public android.widget.ImageView Z;

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f38469p0;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f38470x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.view.View itemView, int i17) {
        super(itemView, i17);
        kotlin.jvm.internal.o.g(itemView, "itemView");
    }

    @Override // c43.x
    public void k(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack) {
        com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink chatroomMsgShareLink;
        if (chatroomMsgPack == null || (msgContent = chatroomMsgPack.msg_content) == null || (chatroomMsgShareLink = msgContent.chatroom_share_link) == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(chatroomMsgShareLink.pic_url)) {
            android.widget.ImageView imageView = this.Z;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("rightImg");
                throw null;
            }
            imageView.setVisibility(8);
        } else {
            android.widget.ImageView imageView2 = this.Z;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("rightImg");
                throw null;
            }
            imageView2.setVisibility(0);
        }
        r53.v vVar = new r53.v();
        vVar.f392707e = false;
        r53.y a17 = r53.y.a();
        android.widget.ImageView imageView3 = this.Z;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("rightImg");
            throw null;
        }
        a17.e(imageView3, chatroomMsgShareLink.pic_url, vVar.a(), null);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f38469p0;
        if (mMNeat7extView == null) {
            kotlin.jvm.internal.o.o("titleTv");
            throw null;
        }
        mMNeat7extView.b(chatroomMsgShareLink.title);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = this.f38470x0;
        if (mMNeat7extView2 != null) {
            mMNeat7extView2.b(chatroomMsgShareLink.desc);
        } else {
            kotlin.jvm.internal.o.o("descTv");
            throw null;
        }
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f38492g).inflate(com.tencent.mm.R.layout.bey, (android.view.ViewGroup) null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f486898mt2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.Z = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f486899mt3);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f38469p0 = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.f486897mt1);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f38470x0 = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById3;
        return inflate;
    }

    @Override // c43.x
    public void w(android.view.View view) {
        com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink chatroomMsgShareLink;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = this.f38495m;
        if (chatroomMsgPack == null || (msgContent = chatroomMsgPack.msg_content) == null || (chatroomMsgShareLink = msgContent.chatroom_share_link) == null || s()) {
            return;
        }
        s33.y.h(this.f38492g, chatroomMsgShareLink.jump_info);
    }
}
