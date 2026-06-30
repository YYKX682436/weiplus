package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class r implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64468d;

    public r(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64468d = chatroomInfoUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64468d;
        g0Var.d(14553, 3, 3, chatroomInfoUI.A);
        android.app.ProgressDialog progressDialog = chatroomInfoUI.f63689d;
        if (progressDialog != null) {
            progressDialog.show();
        }
        chatroomInfoUI.N = false;
        kn.l0.e(chatroomInfoUI.A);
        c01.w9.h(chatroomInfoUI.f63695m.d1(), new com.tencent.mm.chatroom.ui.c1(chatroomInfoUI, chatroomInfoUI, chatroomInfoUI.f63695m.d1()));
    }
}
