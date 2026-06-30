package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class l4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752 f145833d;

    public l4(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752 activityC10347x6bb1b752) {
        this.f145833d = activityC10347x6bb1b752;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        kn.d0 d0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManagerRoomByWeworkUI", "click use");
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752 activityC10347x6bb1b752 = this.f145833d;
        if (activityC10347x6bb1b752.f145330e == 3) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            activityC10347x6bb1b752.Y6(null, false);
            activityC10347x6bb1b752.f145337o = 0;
            activityC10347x6bb1b752.f145338p = 0;
            for (java.util.Map.Entry entry : activityC10347x6bb1b752.f145335m.entrySet()) {
                if (((java.lang.Boolean) entry.getValue()).booleanValue()) {
                    activityC10347x6bb1b752.f145338p++;
                    sb6.append((java.lang.String) entry.getKey());
                    sb6.append(",");
                    if (((java.util.ArrayList) activityC10347x6bb1b752.f145332g).contains(entry.getKey())) {
                        java.lang.String str = (java.lang.String) entry.getKey();
                        java.lang.String str2 = activityC10347x6bb1b752.f145331f;
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        d0Var = new kn.d0(str, str2, 1);
                    } else {
                        java.lang.String str3 = (java.lang.String) entry.getKey();
                        java.lang.String str4 = activityC10347x6bb1b752.f145331f;
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        if (str4 == null) {
                            str4 = "";
                        }
                        d0Var = new kn.d0(str3, str4, 2);
                    }
                    activityC10347x6bb1b752.f145336n.put((java.lang.String) entry.getKey(), java.lang.Boolean.FALSE);
                    gm0.j1.d().g(d0Var);
                }
            }
            activityC10347x6bb1b752.V6(1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManagerRoomByWeworkUI", "doUpgradeAssociateChatRooms() :%s", sb6);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManagerRoomByWeworkUI", "doUpgradeAssociateChatRoom() roomId:%s", activityC10347x6bb1b752.f145329d);
            java.lang.String str5 = activityC10347x6bb1b752.f145329d;
            java.lang.String str6 = activityC10347x6bb1b752.f145331f;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            kn.d0 d0Var2 = new kn.d0(str5, str6 != null ? str6 : "", 0);
            gm0.j1.d().g(d0Var2);
            activityC10347x6bb1b752.Y6(d0Var2, true);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
