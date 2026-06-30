package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class j0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64243e;

    public j0(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI, java.lang.String str) {
        this.f64243e = chatroomInfoUI;
        this.f64242d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64243e;
        g0Var.d(14553, 4, 3, chatroomInfoUI.A);
        chatroomInfoUI.r7();
        chatroomInfoUI.N = false;
        chatroomInfoUI.f7(chatroomInfoUI.A, this.f64242d);
    }
}
