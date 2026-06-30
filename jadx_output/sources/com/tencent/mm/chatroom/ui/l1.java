package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class l1 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomManagerUI f64297d;

    public l1(com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI) {
        this.f64297d = chatroomManagerUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        this.f64297d.W6(2L, -1L);
    }
}
