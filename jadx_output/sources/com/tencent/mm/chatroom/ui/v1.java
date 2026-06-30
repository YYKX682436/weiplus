package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class v1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomManagerUI f64588d;

    public v1(com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI) {
        this.f64588d = chatroomManagerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f64588d.finish();
        return true;
    }
}
