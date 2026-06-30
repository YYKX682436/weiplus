package c43;

/* loaded from: classes8.dex */
public final class i extends c43.x {
    public android.widget.ImageView Z;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.ImageView f38434p0;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f38435x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.View itemView, int i17) {
        super(itemView, i17);
        kotlin.jvm.internal.o.g(itemView, "itemView");
    }

    @Override // c43.x
    public void k(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack) {
        com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard chatroomMsgImgCard;
        if (chatroomMsgPack == null || (msgContent = chatroomMsgPack.msg_content) == null || (chatroomMsgImgCard = msgContent.chatroom_img_card) == null) {
            return;
        }
        r53.v vVar = new r53.v();
        vVar.f392707e = false;
        r53.y a17 = r53.y.a();
        android.widget.ImageView imageView = this.Z;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("bgImg");
            throw null;
        }
        a17.e(imageView, chatroomMsgImgCard.pic_url, vVar.a(), null);
        if (chatroomMsgImgCard.show_video_play) {
            android.widget.ImageView imageView2 = this.f38434p0;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("playImg");
                throw null;
            }
            imageView2.setVisibility(0);
        } else {
            android.widget.ImageView imageView3 = this.f38434p0;
            if (imageView3 == null) {
                kotlin.jvm.internal.o.o("playImg");
                throw null;
            }
            imageView3.setVisibility(8);
        }
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f38435x0;
        if (mMNeat7extView != null) {
            mMNeat7extView.b(chatroomMsgImgCard.desc);
        } else {
            kotlin.jvm.internal.o.o("descTv");
            throw null;
        }
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f38492g).inflate(com.tencent.mm.R.layout.bep, (android.view.ViewGroup) null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.hak);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.Z = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.h8u);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f38434p0 = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.h8t);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f38435x0 = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById3;
        return inflate;
    }

    @Override // c43.x
    public void w(android.view.View view) {
        com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard chatroomMsgImgCard;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = this.f38495m;
        if (chatroomMsgPack == null || (msgContent = chatroomMsgPack.msg_content) == null || (chatroomMsgImgCard = msgContent.chatroom_img_card) == null || s()) {
            return;
        }
        s33.y.h(this.f38492g, chatroomMsgImgCard.img_jump_info);
    }
}
