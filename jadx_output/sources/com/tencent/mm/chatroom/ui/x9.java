package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class x9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI f64662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64663e;

    public x9(com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI, java.lang.String str) {
        this.f64662d = roomStillNotifyMessageManagerUI;
        this.f64663e = str;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            int i18 = com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI.f63870q;
            com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI = this.f64662d;
            roomStillNotifyMessageManagerUI.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startRemoveFollowMember userName:");
            java.lang.String userName = this.f64663e;
            sb6.append(userName);
            com.tencent.mars.xlog.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", sb6.toString());
            roomStillNotifyMessageManagerUI.f63878n = db5.e1.Q(roomStillNotifyMessageManagerUI.getContext(), roomStillNotifyMessageManagerUI.getString(com.tencent.mm.R.string.f490573yv), roomStillNotifyMessageManagerUI.getString(com.tencent.mm.R.string.gga), true, false, null);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = roomStillNotifyMessageManagerUI.f63877m.iterator();
            while (it.hasNext()) {
                com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) it.next();
                if (z3Var.d1().equals(userName)) {
                    un.l lVar = (un.l) roomStillNotifyMessageManagerUI.component(un.l.class);
                    boolean r27 = z3Var.r2();
                    lVar.getClass();
                    kotlin.jvm.internal.o.g(userName, "userName");
                    dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                    androidx.appcompat.app.AppCompatActivity activity = lVar.getActivity();
                    jz5.l[] lVarArr = new jz5.l[4];
                    lVarArr[0] = new jz5.l("chat_name", lVar.O6());
                    lVarArr[1] = new jz5.l("chatroom_info_sid", lVar.P6());
                    lVarArr[2] = new jz5.l("target_username", userName);
                    lVarArr[3] = new jz5.l("if_friend", r27 ? "1" : "0");
                    ((cy1.a) rVar).Cj("remove_follow_member", activity, kz5.c1.k(lVarArr), 34574);
                } else {
                    linkedList.add(z3Var.d1());
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "startRemoveFollowMember newFollowMemberList:" + linkedList);
            pq5.g l17 = new kn.c(roomStillNotifyMessageManagerUI.X6(), linkedList).l();
            l17.f(roomStillNotifyMessageManagerUI);
            l17.h(new com.tencent.mm.chatroom.ui.aa(roomStillNotifyMessageManagerUI, userName));
        }
    }
}
