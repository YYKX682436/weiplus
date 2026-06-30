package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class v0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64587d;

    public v0(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64587d = chatroomInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64587d;
        android.content.Intent intent = new android.content.Intent(chatroomInfoUI, (java.lang.Class<?>) com.tencent.mm.chatroom.ui.ChatroomMemberSearchUI.class);
        intent.putExtra("chatroomName", chatroomInfoUI.A);
        intent.putExtra("KEY_NEED_SEAR_HEADER", true);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477804bx);
        intent.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.by);
        pf5.j0.a(intent, cj5.s.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, dj5.m.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, un.k0.class);
        chatroomInfoUI.startActivityForResult(intent, 5);
        chatroomInfoUI.getClass();
        return false;
    }
}
