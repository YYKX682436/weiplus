package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class n8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAnnouncementUI f64392d;

    public n8(com.tencent.mm.chatroom.ui.RoomAnnouncementUI roomAnnouncementUI) {
        this.f64392d = roomAnnouncementUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.chatroom.ui.RoomAnnouncementUI roomAnnouncementUI = this.f64392d;
        roomAnnouncementUI.setResult(0);
        roomAnnouncementUI.finish();
        return true;
    }
}
