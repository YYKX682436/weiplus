package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class x implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64634d;

    public x(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64634d = chatroomInfoUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.storage.a3 a3Var;
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64634d;
        if (i17 != 0) {
            chatroomInfoUI.k7(4L);
            return;
        }
        chatroomInfoUI.k7(3L);
        com.tencent.mm.chatroom.ui.ChatroomInfoUI.W6(chatroomInfoUI, false);
        chatroomInfoUI.getClass();
        com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
        talkRoomServerEvent.f54883g.f7583a = true;
        talkRoomServerEvent.e();
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(chatroomInfoUI.A) && chatroomInfoUI.A.equals(talkRoomServerEvent.f54884h.f7671a);
        if (!z17 && chatroomInfoUI.B && (a3Var = chatroomInfoUI.F) != null && a3Var.A0().size() > 2) {
            chatroomInfoUI.h7(0, "");
        } else {
            chatroomInfoUI.g7(z17, "");
        }
    }
}
