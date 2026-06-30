package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes4.dex */
public class m4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752 f145893d;

    public m4(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752 activityC10347x6bb1b752) {
        this.f145893d = activityC10347x6bb1b752;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManagerRoomByWeworkUI", "select_group_ll click");
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752 activityC10347x6bb1b752 = this.f145893d;
        activityC10347x6bb1b752.H = 1;
        if (activityC10347x6bb1b752.F.f145977h == 5) {
            db5.t7.m123882x26a183b(activityC10347x6bb1b752, com.p314xaae8f345.mm.R.C30867xcad56011.k4w, 0).show();
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(activityC10347x6bb1b752, "com.tencent.mm.ui.contact.GroupCardSelectUI");
        intent.putExtra("grou_order_by_conversation_time", true);
        intent.putExtra("group_select_type", true);
        intent.putExtra("group_select_need_result", true);
        intent.putExtra("group_select_only_need_self_owner", true);
        intent.putExtra("group_select_filter_associate_chat_room", true);
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
        java.util.Iterator it = ((java.util.ArrayList) activityC10347x6bb1b752.f145333h).iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.mm.p2621x8fb0427b.z3) it.next()).d1());
        }
        intent.putStringArrayListExtra("group_select_block_chatroom", arrayList2);
        intent.putExtra("group_select_chatroom_max_num", c01.v1.q());
        activityC10347x6bb1b752.startActivityForResult(intent, 0);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
