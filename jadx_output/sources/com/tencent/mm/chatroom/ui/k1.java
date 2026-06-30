package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class k1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomManagerUI f64264d;

    public k1(com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI) {
        this.f64264d = chatroomManagerUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI = this.f64264d;
        if (i17 != 0) {
            chatroomManagerUI.W6(2L, -1L);
            return;
        }
        chatroomManagerUI.W6(3L, -1L);
        com.tencent.mm.chatroom.ui.j1 j1Var = new com.tencent.mm.chatroom.ui.j1(chatroomManagerUI);
        java.lang.String Z6 = chatroomManagerUI.Z6();
        kn.l lVar = new kn.l(chatroomManagerUI, new com.tencent.mm.chatroom.ui.a2(chatroomManagerUI, chatroomManagerUI, j1Var));
        lVar.f309415g = true;
        kn.j jVar = new kn.j(lVar);
        lVar.f309417i = jVar;
        com.tencent.mm.sdk.platformtools.u3.i(jVar, 200L);
        kn.h hVar = new kn.h(lVar);
        lVar.f309416h = hVar;
        com.tencent.mm.sdk.platformtools.u3.i(hVar, 60000L);
        gm0.j1.n().f273288b.a(6217, lVar);
        gm0.j1.n().f273288b.g(new kn.q(Z6));
    }
}
