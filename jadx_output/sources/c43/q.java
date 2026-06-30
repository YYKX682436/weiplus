package c43;

/* loaded from: classes8.dex */
public class q implements c43.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack f38472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c43.r f38473b;

    public q(c43.r rVar, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack) {
        this.f38473b = rVar;
        this.f38472a = chatroomMsgPack;
    }

    @Override // c43.f1
    public void a(android.text.SpannableStringBuilder spannableStringBuilder) {
        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
        if (spannableStringBuilder != null) {
            java.lang.String str = this.f38472a.msg_content.chatroom_sys.title;
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            c43.r rVar = this.f38473b;
            if (K0) {
                spannableStringBuilder2.append((java.lang.CharSequence) spannableStringBuilder);
            } else {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = rVar.f38492g;
                ((ke0.e) xVar).getClass();
                android.text.SpannableString spannableString = new android.text.SpannableString(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
                spannableString.setSpan(new com.tencent.mm.plugin.game.chatroom.view.k0(str, rVar.f38492g.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3), rVar.f38492g.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8), (int) (ym5.x.a(rVar.f38492g, 10.0f) * i65.a.q(rVar.f38492g)), ym5.x.a(rVar.f38492g, 13.0f), ym5.x.a(rVar.f38492g, 6.0f), ym5.x.a(rVar.f38492g, 6.0f), ym5.x.a(rVar.f38492g, 3.0f), ym5.x.a(rVar.f38492g, 3.0f)), 0, str.length(), 33);
                spannableStringBuilder2.append((java.lang.CharSequence) spannableString).append((java.lang.CharSequence) "  ").append((java.lang.CharSequence) spannableStringBuilder);
            }
            rVar.Z.b(spannableStringBuilder2);
        }
    }

    @Override // c43.f1
    public void b(long j17) {
        com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
        c43.r rVar = this.f38473b;
        long j18 = rVar.f38494i;
        long j19 = rVar.f38493h;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = this.f38472a;
        fVar.g(1L, j17, j18, j19, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0L, rVar.X);
    }
}
