package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class ob implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SeeRoomMemberUI f64413d;

    public ob(com.tencent.mm.chatroom.ui.SeeRoomMemberUI seeRoomMemberUI) {
        this.f64413d = seeRoomMemberUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.chatroom.ui.SeeRoomMemberUI seeRoomMemberUI = this.f64413d;
        seeRoomMemberUI.setResult(0);
        seeRoomMemberUI.finish();
        return true;
    }
}
