package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public final class c2 implements vg3.j3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomManagerUI f64065a;

    public c2(com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI) {
        this.f64065a = chatroomManagerUI;
    }

    @Override // vg3.j3
    public final void a(boolean z17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI;
        r45.kt5 kt5Var;
        if (z17 && (kt5Var = (chatroomManagerUI = this.f64065a).f63733i) != null) {
            kotlin.jvm.internal.o.d(kt5Var);
            if (com.tencent.mm.sdk.platformtools.t8.L0(kt5Var.f378942e)) {
                return;
            }
            kotlin.jvm.internal.o.d(chatroomManagerUI.f63733i);
            r2.f378941d--;
            try {
                r45.kt5 kt5Var2 = chatroomManagerUI.f63733i;
                kotlin.jvm.internal.o.d(kt5Var2);
                kt5Var2.f378942e.removeFirst();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomManagerUI", e17.getMessage());
            }
            com.tencent.mm.chatroom.ui.ChatroomManagerUI.V6(chatroomManagerUI);
        }
    }
}
