package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class ka implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomUpgradeUI f64280d;

    public ka(com.tencent.mm.chatroom.ui.RoomUpgradeUI roomUpgradeUI) {
        this.f64280d = roomUpgradeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomUpgradeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.RoomUpgradeUI roomUpgradeUI = this.f64280d;
        int i17 = roomUpgradeUI.f63905u;
        if (i17 != 1) {
            if (i17 == 2 || i17 == 5) {
                if (roomUpgradeUI.f63907w) {
                    roomUpgradeUI.T6();
                } else {
                    android.content.Intent intent = new android.content.Intent(roomUpgradeUI, (java.lang.Class<?>) com.tencent.mm.chatroom.ui.RoomAnnouncementUI.class);
                    intent.putExtra("need_bind_mobile", false);
                    intent.putExtra("RoomInfo_Id", roomUpgradeUI.f63891d);
                    roomUpgradeUI.startActivityForResult(intent, 600);
                }
            }
        } else if (roomUpgradeUI.f63907w) {
            com.tencent.mm.chatroom.ui.ea.a(roomUpgradeUI, roomUpgradeUI.f63891d, true);
        } else {
            android.content.Intent intent2 = new android.content.Intent(roomUpgradeUI, (java.lang.Class<?>) com.tencent.mm.chatroom.ui.RoomAnnouncementUI.class);
            intent2.putExtra("need_bind_mobile", true);
            intent2.putExtra("RoomInfo_Id", roomUpgradeUI.f63891d);
            roomUpgradeUI.startActivityForResult(intent2, 600);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomUpgradeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
