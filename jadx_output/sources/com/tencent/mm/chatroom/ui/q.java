package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class q implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64435d;

    public q(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64435d = chatroomInfoUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64435d;
        g0Var.d(14553, 3, 4, chatroomInfoUI.A);
        chatroomInfoUI.N = true;
        if (chatroomInfoUI.H) {
            chatroomInfoUI.finish();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", chatroomInfoUI.f63695m.d1());
        intent.addFlags(67108864);
        j45.l.u(chatroomInfoUI, ".ui.chatting.ChattingUI", intent, null);
    }
}
