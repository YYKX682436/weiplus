package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public final class b2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomManagerUI f64049d;

    public b2(com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI) {
        this.f64049d = chatroomManagerUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI = this.f64049d;
        g4Var.d(1, chatroomManagerUI.getResources().getColor(com.tencent.mm.R.color.f479482a31), chatroomManagerUI.getString(com.tencent.mm.R.string.ayb));
    }
}
