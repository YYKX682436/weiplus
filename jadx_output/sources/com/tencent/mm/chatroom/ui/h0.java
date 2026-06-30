package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64196d;

    public h0(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64196d = chatroomInfoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64196d;
        db5.t7.h(chatroomInfoUI.getContext(), chatroomInfoUI.getResources().getString(com.tencent.mm.R.string.hqj));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("dismiss_chatroom", true);
        chatroomInfoUI.setResult(-1, intent);
        if (chatroomInfoUI.isFinishing()) {
            return;
        }
        chatroomInfoUI.finish();
    }
}
