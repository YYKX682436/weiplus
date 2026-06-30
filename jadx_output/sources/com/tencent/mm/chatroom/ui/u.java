package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class u implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64559d;

    public u(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64559d = chatroomInfoUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64559d;
        g4Var.d(0, chatroomInfoUI.getResources().getColor(com.tencent.mm.R.color.f479483a32), chatroomInfoUI.getString(com.tencent.mm.R.string.f490507x1));
    }
}
