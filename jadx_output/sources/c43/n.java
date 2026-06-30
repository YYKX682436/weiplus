package c43;

/* loaded from: classes15.dex */
public class n implements c43.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack f38463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c43.o f38464b;

    public n(c43.o oVar, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack) {
        this.f38464b = oVar;
        this.f38463a = chatroomMsgPack;
    }

    @Override // c43.f1
    public void a(android.text.SpannableStringBuilder spannableStringBuilder) {
        u33.h hVar;
        if (spannableStringBuilder != null) {
            c43.o oVar = this.f38464b;
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = oVar.Z;
            oVar.getClass();
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = this.f38463a;
            com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo tickleInfo = chatroomMsgPack.msg_options.tickle_info;
            if (tickleInfo != null && tickleInfo.is_tickle && (hVar = oVar.N) != null) {
                y33.e eVar = (y33.e) hVar;
                if (eVar.field_userName.equals(chatroomMsgPack.from_username) || eVar.field_userName.equals(chatroomMsgPack.msg_options.tickle_info.to_username)) {
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), 0, spannableStringBuilder.length(), 18);
                }
            }
            mMNeat7extView.b(spannableStringBuilder);
        }
    }

    @Override // c43.f1
    public void b(long j17) {
        com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
        c43.o oVar = this.f38464b;
        long j18 = oVar.f38494i;
        long j19 = oVar.f38493h;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = this.f38463a;
        fVar.g(1L, j17, j18, j19, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0L, oVar.X);
    }
}
