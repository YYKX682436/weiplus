package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class n implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64380d;

    public n(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64380d = chatroomInfoUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.chatroom.ui.ChatroomInfoUI.W6(this.f64380d, true);
    }
}
