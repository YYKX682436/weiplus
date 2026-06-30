package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class ja implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomUpgradeUI f64257d;

    public ja(com.tencent.mm.chatroom.ui.RoomUpgradeUI roomUpgradeUI) {
        this.f64257d = roomUpgradeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f64257d.finish();
        return true;
    }
}
