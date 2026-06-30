package com.tencent.mm.chatroom.ui;

/* loaded from: classes3.dex */
public class db implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SeeRoomManagerUI f64115d;

    public db(com.tencent.mm.chatroom.ui.SeeRoomManagerUI seeRoomManagerUI) {
        this.f64115d = seeRoomManagerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f64115d.finish();
        return true;
    }
}
