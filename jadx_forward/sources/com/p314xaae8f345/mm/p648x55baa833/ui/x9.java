package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class x9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 f146195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146196e;

    public x9(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 activityC10359x5d5d51f0, java.lang.String str) {
        this.f146195d = activityC10359x5d5d51f0;
        this.f146196e = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            int i18 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0.f145403q;
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 activityC10359x5d5d51f0 = this.f146195d;
            activityC10359x5d5d51f0.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startRemoveFollowMember userName:");
            java.lang.String userName = this.f146196e;
            sb6.append(userName);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", sb6.toString());
            activityC10359x5d5d51f0.f145411n = db5.e1.Q(activityC10359x5d5d51f0.mo55332x76847179(), activityC10359x5d5d51f0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC10359x5d5d51f0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gga), true, false, null);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = activityC10359x5d5d51f0.f145410m.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) it.next();
                if (z3Var.d1().equals(userName)) {
                    un.l lVar = (un.l) activityC10359x5d5d51f0.m80391xac8f1cfd(un.l.class);
                    boolean r27 = z3Var.r2();
                    lVar.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                    dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = lVar.m158354x19263085();
                    jz5.l[] lVarArr = new jz5.l[4];
                    lVarArr[0] = new jz5.l("chat_name", lVar.O6());
                    lVarArr[1] = new jz5.l("chatroom_info_sid", lVar.P6());
                    lVarArr[2] = new jz5.l("target_username", userName);
                    lVarArr[3] = new jz5.l("if_friend", r27 ? "1" : "0");
                    ((cy1.a) rVar).Cj("remove_follow_member", m158354x19263085, kz5.c1.k(lVarArr), 34574);
                } else {
                    linkedList.add(z3Var.d1());
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "startRemoveFollowMember newFollowMemberList:" + linkedList);
            pq5.g l17 = new kn.c(activityC10359x5d5d51f0.X6(), linkedList).l();
            l17.f(activityC10359x5d5d51f0);
            l17.h(new com.p314xaae8f345.mm.p648x55baa833.ui.aa(activityC10359x5d5d51f0, userName));
        }
    }
}
