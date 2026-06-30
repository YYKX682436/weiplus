package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class e8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI f64131d;

    public e8(com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI roomAccessVerifyApplicationUI) {
        this.f64131d = roomAccessVerifyApplicationUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f64131d.finish();
        return true;
    }
}
