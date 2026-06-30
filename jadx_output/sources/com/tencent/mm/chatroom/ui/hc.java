package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class hc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectAddRoomManagerUI f64213d;

    public hc(com.tencent.mm.chatroom.ui.SelectAddRoomManagerUI selectAddRoomManagerUI) {
        this.f64213d = selectAddRoomManagerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        int i17 = com.tencent.mm.chatroom.ui.SelectAddRoomManagerUI.f63956w;
        com.tencent.mm.chatroom.ui.SelectAddRoomManagerUI selectAddRoomManagerUI = this.f64213d;
        selectAddRoomManagerUI.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(selectAddRoomManagerUI.f63981q);
        intent.putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ","));
        selectAddRoomManagerUI.setResult(-1, intent);
        selectAddRoomManagerUI.finish();
        selectAddRoomManagerUI.hideVKB();
        return false;
    }
}
