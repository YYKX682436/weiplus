package com.tencent.mm.chatroom.ui;

/* loaded from: classes9.dex */
public class qd implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI f64463d;

    public qd(com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI selectServiceNotifySenderUI) {
        this.f64463d = selectServiceNotifySenderUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI selectServiceNotifySenderUI = this.f64463d;
        selectServiceNotifySenderUI.setResult(0, intent);
        selectServiceNotifySenderUI.finish();
        return true;
    }
}
