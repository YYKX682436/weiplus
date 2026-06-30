package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64469d;

    public r0(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64469d = chatroomInfoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64469d;
        if (chatroomInfoUI.f63693h != null) {
            chatroomInfoUI.W = chatroomInfoUI.getListView().getTranscriptMode();
            chatroomInfoUI.getListView().setTranscriptMode(2);
            ((com.tencent.mm.ui.base.preference.h0) chatroomInfoUI.f63693h).notifyDataSetChanged();
            com.tencent.mm.sdk.platformtools.b4 b4Var = chatroomInfoUI.V;
            if (b4Var != null) {
                b4Var.d();
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.chatroom.ui.s0(chatroomInfoUI, "room_notify_new_msg"), true);
            chatroomInfoUI.V = b4Var2;
            b4Var2.c(5L, 5L);
        }
        chatroomInfoUI.f63688J = true;
    }
}
