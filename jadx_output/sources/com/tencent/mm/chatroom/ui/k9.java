package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class k9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI f64278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64279e;

    public k9(com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI, java.lang.String str) {
        this.f64278d = roomSpecialFollowMemberManagerUI;
        this.f64279e = str;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            com.tencent.mm.chatroom.ui.b9 b9Var = com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI.f63855u;
            com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI = this.f64278d;
            roomSpecialFollowMemberManagerUI.f63864o = db5.e1.Q(roomSpecialFollowMemberManagerUI.getContext(), roomSpecialFollowMemberManagerUI.getString(com.tencent.mm.R.string.f490573yv), roomSpecialFollowMemberManagerUI.getString(com.tencent.mm.R.string.gga), true, false, null);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = roomSpecialFollowMemberManagerUI.f63862m.iterator();
            while (it.hasNext()) {
                linkedList.add((java.lang.String) it.next());
            }
            linkedList.remove(this.f64279e);
            pq5.g l17 = new kn.c(roomSpecialFollowMemberManagerUI.f63857e, linkedList).l();
            l17.f(roomSpecialFollowMemberManagerUI);
            l17.h(new com.tencent.mm.chatroom.ui.l9(roomSpecialFollowMemberManagerUI, linkedList));
        }
    }
}
