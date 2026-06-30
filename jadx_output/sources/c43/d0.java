package c43;

/* loaded from: classes15.dex */
public class d0 extends rl5.r {

    /* renamed from: p1, reason: collision with root package name */
    public final /* synthetic */ android.view.View f38411p1;

    /* renamed from: x1, reason: collision with root package name */
    public final /* synthetic */ c43.x f38412x1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c43.x xVar, android.content.Context context, android.view.View view) {
        super(context);
        this.f38412x1 = xVar;
        this.f38411p1 = view;
    }

    @Override // rl5.r
    public boolean n(int i17, int i18) {
        c43.x xVar = this.f38412x1;
        if (xVar.s() || xVar.n()) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = xVar.f38495m;
        if (chatroomMsgPack != null) {
            com.tencent.mm.game.report.g.f68195a.g(1L, 27L, xVar.f38494i, xVar.f38493h, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0L, xVar.X);
        }
        android.view.View view = this.f38411p1;
        if (view.getParent() != null) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.n(i17, i18);
    }

    @Override // rl5.r, android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        android.view.View view = this.f38411p1;
        if (view.getParent() != null) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        super.onDismiss();
    }
}
