package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class m implements o65.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64348a;

    public m(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64348a = chatroomInfoUI;
    }

    @Override // o65.c, o65.b
    /* renamed from: b */
    public void a(int i17, int i18, java.lang.String str, o65.c cVar) {
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64348a;
        com.tencent.mm.storage.a3 a3Var = chatroomInfoUI.F;
        if (a3Var != null) {
            chatroomInfoUI.C = a3Var.A0().size();
        }
        chatroomInfoUI.t7();
        chatroomInfoUI.w7();
        chatroomInfoUI.x7();
        chatroomInfoUI.A7();
    }
}
