package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class md implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectRoomFollowMemberManagerUI f64377d;

    public md(com.tencent.mm.chatroom.ui.SelectRoomFollowMemberManagerUI selectRoomFollowMemberManagerUI) {
        this.f64377d = selectRoomFollowMemberManagerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        int i17 = com.tencent.mm.chatroom.ui.SelectRoomFollowMemberManagerUI.f63986w;
        com.tencent.mm.chatroom.ui.SelectRoomFollowMemberManagerUI selectRoomFollowMemberManagerUI = this.f64377d;
        selectRoomFollowMemberManagerUI.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(selectRoomFollowMemberManagerUI.f63981q);
        intent.putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ","));
        selectRoomFollowMemberManagerUI.setResult(-1, intent);
        selectRoomFollowMemberManagerUI.finish();
        return false;
    }
}
