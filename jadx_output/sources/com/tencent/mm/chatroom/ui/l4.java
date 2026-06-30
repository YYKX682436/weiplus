package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class l4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI f64300d;

    public l4(com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI managerRoomByWeworkUI) {
        this.f64300d = managerRoomByWeworkUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        kn.d0 d0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.ManagerRoomByWeworkUI", "click use");
        com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI managerRoomByWeworkUI = this.f64300d;
        if (managerRoomByWeworkUI.f63797e == 3) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            managerRoomByWeworkUI.Y6(null, false);
            managerRoomByWeworkUI.f63804o = 0;
            managerRoomByWeworkUI.f63805p = 0;
            for (java.util.Map.Entry entry : managerRoomByWeworkUI.f63802m.entrySet()) {
                if (((java.lang.Boolean) entry.getValue()).booleanValue()) {
                    managerRoomByWeworkUI.f63805p++;
                    sb6.append((java.lang.String) entry.getKey());
                    sb6.append(",");
                    if (((java.util.ArrayList) managerRoomByWeworkUI.f63799g).contains(entry.getKey())) {
                        java.lang.String str = (java.lang.String) entry.getKey();
                        java.lang.String str2 = managerRoomByWeworkUI.f63798f;
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        d0Var = new kn.d0(str, str2, 1);
                    } else {
                        java.lang.String str3 = (java.lang.String) entry.getKey();
                        java.lang.String str4 = managerRoomByWeworkUI.f63798f;
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        if (str4 == null) {
                            str4 = "";
                        }
                        d0Var = new kn.d0(str3, str4, 2);
                    }
                    managerRoomByWeworkUI.f63803n.put((java.lang.String) entry.getKey(), java.lang.Boolean.FALSE);
                    gm0.j1.d().g(d0Var);
                }
            }
            managerRoomByWeworkUI.V6(1);
            com.tencent.mars.xlog.Log.i("MicroMsg.ManagerRoomByWeworkUI", "doUpgradeAssociateChatRooms() :%s", sb6);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ManagerRoomByWeworkUI", "doUpgradeAssociateChatRoom() roomId:%s", managerRoomByWeworkUI.f63796d);
            java.lang.String str5 = managerRoomByWeworkUI.f63796d;
            java.lang.String str6 = managerRoomByWeworkUI.f63798f;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            kn.d0 d0Var2 = new kn.d0(str5, str6 != null ? str6 : "", 0);
            gm0.j1.d().g(d0Var2);
            managerRoomByWeworkUI.Y6(d0Var2, true);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
