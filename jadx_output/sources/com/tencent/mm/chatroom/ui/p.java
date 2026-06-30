package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class p implements android.content.DialogInterface.OnCancelListener {
    public p(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.chatroom.ui.ChatroomInfoUI.Y = true;
    }
}
