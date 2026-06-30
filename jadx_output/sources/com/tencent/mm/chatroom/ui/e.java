package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public final class e implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatRoomOpenErrorInfoUI f64121d;

    public e(com.tencent.mm.chatroom.ui.ChatRoomOpenErrorInfoUI chatRoomOpenErrorInfoUI) {
        this.f64121d = chatRoomOpenErrorInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f64121d.finish();
        return false;
    }
}
