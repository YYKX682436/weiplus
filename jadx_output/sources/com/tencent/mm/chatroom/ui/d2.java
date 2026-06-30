package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public final class d2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jt5 f64100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomManagerUI f64101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f64102f;

    public d2(r45.jt5 jt5Var, com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f64100d = jt5Var;
        this.f64101e = chatroomManagerUI;
        this.f64102f = k0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            vg3.i3 i3Var = new vg3.i3();
            i3Var.f436712d = this.f64100d.f378099d;
            int i18 = com.tencent.mm.chatroom.ui.ChatroomManagerUI.f63727s;
            com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI = this.f64101e;
            i3Var.f436718m = chatroomManagerUI.Z6();
            i3Var.f436720o = 1;
            ((hn.s) ((vg3.k3) i95.n0.c(vg3.k3.class))).wi(chatroomManagerUI.getContext(), i3Var, new com.tencent.mm.chatroom.ui.c2(chatroomManagerUI));
            this.f64102f.u();
        }
    }
}
