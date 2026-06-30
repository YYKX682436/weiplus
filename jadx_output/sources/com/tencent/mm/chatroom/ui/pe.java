package com.tencent.mm.chatroom.ui;

/* loaded from: classes3.dex */
public class pe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.WeworkRoomUpgradeResultUI f64434d;

    public pe(com.tencent.mm.chatroom.ui.WeworkRoomUpgradeResultUI weworkRoomUpgradeResultUI) {
        this.f64434d = weworkRoomUpgradeResultUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.WeworkRoomUpgradeResultUI weworkRoomUpgradeResultUI = this.f64434d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeworkRoomUpgradeResultUI", "[goToChattingUI] username:%s", weworkRoomUpgradeResultUI.f64008d);
        android.content.Intent putExtra = new android.content.Intent().putExtra("Main_User", weworkRoomUpgradeResultUI.f64008d);
        putExtra.putExtra("From_fail_notify", true);
        putExtra.addFlags(67108864);
        putExtra.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        j45.l.u(weworkRoomUpgradeResultUI, "com.tencent.mm.ui.LauncherUI", putExtra, null);
        weworkRoomUpgradeResultUI.finish();
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
