package c43;

/* loaded from: classes8.dex */
public class u implements c43.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack f38480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c43.v f38481b;

    public u(c43.v vVar, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack) {
        this.f38481b = vVar;
        this.f38480a = chatroomMsgPack;
    }

    @Override // c43.f1
    public void a(android.text.SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder != null) {
            this.f38481b.Z.b(spannableStringBuilder);
        }
    }

    @Override // c43.f1
    public void b(long j17) {
        com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
        c43.v vVar = this.f38481b;
        long j18 = vVar.f38494i;
        long j19 = vVar.f38493h;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = this.f38480a;
        fVar.g(1L, j17, j18, j19, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0L, vVar.X);
    }
}
