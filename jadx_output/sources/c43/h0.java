package c43;

/* loaded from: classes8.dex */
public class h0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f38431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c43.x f38432e;

    public h0(c43.x xVar, long j17) {
        this.f38432e = xVar;
        this.f38431d = j17;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 9530) {
            c43.x xVar = this.f38432e;
            gm0.j1.d().g(new v33.a(xVar.S, this.f38431d));
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = xVar.f38495m;
            if (chatroomMsgPack != null) {
                com.tencent.mm.game.report.g.f68195a.g(10L, 2L, xVar.f38494i, xVar.f38493h, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0L, xVar.X);
            }
        }
    }
}
