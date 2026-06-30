package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public final class f2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomManagerUI f64146a;

    public f2(com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI) {
        this.f64146a = chatroomManagerUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.kt5 kt5Var = (r45.kt5) obj;
        if (kt5Var == null || com.tencent.mm.sdk.platformtools.t8.L0(kt5Var.f378942e)) {
            return null;
        }
        com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI = this.f64146a;
        chatroomManagerUI.f63733i = kt5Var;
        com.tencent.mm.chatroom.ui.ChatroomManagerUI.V6(chatroomManagerUI);
        return null;
    }
}
