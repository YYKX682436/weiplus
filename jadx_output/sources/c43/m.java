package c43;

/* loaded from: classes8.dex */
public final class m extends c43.x {
    public android.widget.ImageView Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.View f38457l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.ImageView f38458p0;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.ImageView f38459x0;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.TextView f38460y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.view.View itemView, int i17) {
        super(itemView, i17);
        kotlin.jvm.internal.o.g(itemView, "itemView");
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x00ac, code lost:
    
        if (r2.getHeight() != r1.pic_height) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r2.getHeight() != r1.pic_height) goto L27;
     */
    @Override // c43.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r21) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c43.m.k(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack):void");
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f38492g).inflate(com.tencent.mm.R.layout.beq, (android.view.ViewGroup) null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f485101gj4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.Z = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.gj6);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f38458p0 = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.gj8);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f38459x0 = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.gj9);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f38460y0 = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.gj7);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f38457l1 = findViewById5;
        return inflate;
    }

    @Override // c43.x
    public void w(android.view.View view) {
        com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink chatroomMsgImgLink;
        long j17;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = this.f38495m;
        if (chatroomMsgPack == null || (msgContent = chatroomMsgPack.msg_content) == null || (chatroomMsgImgLink = msgContent.chatroom_img_link) == null || s()) {
            return;
        }
        int h17 = s33.y.h(this.f38492g, chatroomMsgImgLink.jump_info);
        if (h17 == 1) {
            j17 = 6;
        } else if (h17 == 2) {
            j17 = 7;
        } else if (h17 != 3) {
            return;
        } else {
            j17 = 28;
        }
        long j18 = j17;
        com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
        long j19 = this.f38494i;
        long j27 = this.f38493h;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack2 = this.f38495m;
        com.tencent.mm.game.report.f.j(fVar, 1L, j18, j19, j27, chatroomMsgPack2.seq, chatroomMsgPack2.from_username, 0L, this.X, null, 256, null);
    }
}
