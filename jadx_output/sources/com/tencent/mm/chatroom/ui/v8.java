package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class v8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomInfoDetailUI f64602d;

    public v8(com.tencent.mm.chatroom.ui.RoomInfoDetailUI roomInfoDetailUI) {
        this.f64602d = roomInfoDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f64602d.finish();
        return true;
    }
}
