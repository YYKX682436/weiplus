package c43;

/* loaded from: classes15.dex */
public class t extends com.tencent.mm.pluginsdk.ui.span.y {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c43.v f38478m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(c43.v vVar, com.tencent.neattextview.textview.view.NeatTextView neatTextView, android.view.View.OnTouchListener onTouchListener) {
        super(neatTextView, onTouchListener);
        this.f38478m = vVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.y, com.tencent.neattextview.textview.view.i, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatItemTplVH", if1.m.NAME);
        js5.c cVar = this.f215211g;
        if (cVar != null) {
            android.text.style.CharacterStyle characterStyle = cVar.f301571g;
            if (characterStyle instanceof com.tencent.mm.plugin.game.chatroom.view.n1) {
                com.tencent.mm.plugin.game.chatroom.view.n1 n1Var = (com.tencent.mm.plugin.game.chatroom.view.n1) characterStyle;
                java.lang.Object obj = n1Var.f139239e;
                if (obj instanceof c43.b1) {
                    c43.b1 b1Var = (c43.b1) obj;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(b1Var.f38398d) && b1Var.f38399e) {
                        java.lang.String str = ((c43.b1) n1Var.f139239e).f38398d;
                        c43.v vVar = this.f38478m;
                        vVar.getClass();
                        u33.h Bi = ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).Bi(str);
                        if (Bi != null && !vVar.s() && !s33.y.e(vVar.S).f402491b) {
                            com.tencent.mm.autogen.events.ChatRoomAtFunctionEvent chatRoomAtFunctionEvent = new com.tencent.mm.autogen.events.ChatRoomAtFunctionEvent();
                            y33.e eVar = (y33.e) Bi;
                            java.lang.String str2 = eVar.field_userName;
                            am.b2 b2Var = chatRoomAtFunctionEvent.f54037g;
                            b2Var.f6208a = str2;
                            b2Var.f6209b = eVar.field_nickName;
                            chatRoomAtFunctionEvent.e();
                        }
                    }
                }
            }
        }
        super.onLongPress(motionEvent);
    }
}
