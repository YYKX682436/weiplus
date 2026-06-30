package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public final class i1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomManagerUI f64217d;

    public i1(com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI) {
        this.f64217d = chatroomManagerUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI = this.f64217d;
        g4Var.d(0, chatroomManagerUI.getResources().getColor(com.tencent.mm.R.color.f479483a32), chatroomManagerUI.getString(com.tencent.mm.R.string.bq_));
    }
}
