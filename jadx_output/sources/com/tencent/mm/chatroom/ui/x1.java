package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public final class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomManagerUI f64635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jt5 f64636e;

    public x1(com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI, r45.jt5 jt5Var) {
        this.f64635d = chatroomManagerUI;
        this.f64636e = jt5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ChatroomManagerUI$showGroupBindAppInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI = this.f64635d;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = chatroomManagerUI.f63739r;
        if (z2Var != null) {
            z2Var.B();
        }
        chatroomManagerUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) chatroomManagerUI.getContext(), 1, true);
        r45.jt5 jt5Var = this.f64636e;
        k0Var.r(com.tencent.mm.sdk.platformtools.t8.z1(chatroomManagerUI.getString(com.tencent.mm.R.string.ayd, jt5Var.f378100e), new java.lang.Object[0]), 17, i65.a.b(chatroomManagerUI, 14), null);
        k0Var.f211872n = new com.tencent.mm.chatroom.ui.b2(chatroomManagerUI);
        k0Var.f211881s = new com.tencent.mm.chatroom.ui.d2(jt5Var, chatroomManagerUI, k0Var);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ChatroomManagerUI$showGroupBindAppInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
