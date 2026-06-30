package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class y implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64676d;

    public y(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64676d = chatroomInfoUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        this.f64676d.k7(4L);
    }
}
