package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class k4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI f64271d;

    public k4(com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI managerRoomByWeworkUI) {
        this.f64271d = managerRoomByWeworkUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ManagerRoomByWeworkUI", "onMenuItemClick click");
        com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI managerRoomByWeworkUI = this.f64271d;
        com.tencent.mm.chatroom.ui.WeworkRoomUpgradeResultUI.T6(managerRoomByWeworkUI);
        managerRoomByWeworkUI.finish();
        int i17 = managerRoomByWeworkUI.f63797e;
        if (i17 != 3) {
            com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI.T6(managerRoomByWeworkUI.f63796d, i17, 0, 0);
            return true;
        }
        managerRoomByWeworkUI.V6(0);
        return true;
    }
}
