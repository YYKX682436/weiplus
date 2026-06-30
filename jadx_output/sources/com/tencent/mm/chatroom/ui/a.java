package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatRoomBindAppUI f64020d;

    public a(com.tencent.mm.chatroom.ui.ChatRoomBindAppUI chatRoomBindAppUI) {
        this.f64020d = chatRoomBindAppUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f64020d.finish();
        return true;
    }
}
