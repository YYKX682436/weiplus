package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public class m4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI f64360d;

    public m4(com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI managerRoomByWeworkUI) {
        this.f64360d = managerRoomByWeworkUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.ManagerRoomByWeworkUI", "select_group_ll click");
        com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI managerRoomByWeworkUI = this.f64360d;
        managerRoomByWeworkUI.H = 1;
        if (managerRoomByWeworkUI.F.f64444h == 5) {
            db5.t7.makeText(managerRoomByWeworkUI, com.tencent.mm.R.string.k4w, 0).show();
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(managerRoomByWeworkUI, "com.tencent.mm.ui.contact.GroupCardSelectUI");
        intent.putExtra("grou_order_by_conversation_time", true);
        intent.putExtra("group_select_type", true);
        intent.putExtra("group_select_need_result", true);
        intent.putExtra("group_select_only_need_self_owner", true);
        intent.putExtra("group_select_filter_associate_chat_room", true);
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
        java.util.Iterator it = ((java.util.ArrayList) managerRoomByWeworkUI.f63800h).iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.tencent.mm.storage.z3) it.next()).d1());
        }
        intent.putStringArrayListExtra("group_select_block_chatroom", arrayList2);
        intent.putExtra("group_select_chatroom_max_num", c01.v1.q());
        managerRoomByWeworkUI.startActivityForResult(intent, 0);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
