package com.tencent.mm.chatroom.ui;

/* loaded from: classes3.dex */
public final class d9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI f64114d;

    public d9(com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI) {
        this.f64114d = roomSpecialFollowMemberManagerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f64114d.finish();
        return true;
    }
}
