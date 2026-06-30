package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class ud implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.wd f146117d;

    public ud(com.p314xaae8f345.mm.p648x55baa833.ui.wd wdVar) {
        this.f146117d = wdVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.yd ydVar = (com.p314xaae8f345.mm.p648x55baa833.ui.yd) view.getTag();
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10374x1787784b activityC10374x1787784b = this.f146117d.f146166n;
        int i17 = ydVar.f146232e;
        view.getId();
        activityC10374x1787784b.f145522e.clearFocus();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(view);
        java.util.List list = activityC10374x1787784b.f145525h.f146163h;
        if (list == null || list.size() < i17) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[1] = java.lang.Integer.valueOf(list != null ? list.size() : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectServiceNotifySenderUI", "user should not be null. position:%d, size:%d", objArr);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", "notifymessage");
            intent.putExtra("key_notify_message_real_username", ((com.p314xaae8f345.mm.p648x55baa833.ui.xd) list.get(i17)).f146206b);
            intent.putExtra("finish_direct", true);
            intent.putExtra("chat_from_scene", 6);
            j45.l.u(activityC10374x1787784b.mo55332x76847179(), ".ui.chatting.ChattingUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
