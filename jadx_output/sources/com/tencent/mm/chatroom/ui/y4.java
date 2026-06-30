package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class y4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI f64682d;

    public y4(com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI) {
        this.f64682d = modRemarkRoomNameUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f64682d.finish();
        return true;
    }
}
