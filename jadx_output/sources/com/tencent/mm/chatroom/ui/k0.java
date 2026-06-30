package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class k0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64263d;

    public k0(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64263d = chatroomInfoUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f64263d.N = true;
    }
}
