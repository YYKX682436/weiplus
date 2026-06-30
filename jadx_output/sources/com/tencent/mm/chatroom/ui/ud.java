package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class ud implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.wd f64584d;

    public ud(com.tencent.mm.chatroom.ui.wd wdVar) {
        this.f64584d = wdVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.yd ydVar = (com.tencent.mm.chatroom.ui.yd) view.getTag();
        com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI selectServiceNotifySenderUI = this.f64584d.f64633n;
        int i17 = ydVar.f64699e;
        view.getId();
        selectServiceNotifySenderUI.f63989e.clearFocus();
        com.tencent.mm.sdk.platformtools.t8.t0(view);
        java.util.List list = selectServiceNotifySenderUI.f63992h.f64630h;
        if (list == null || list.size() < i17) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[1] = java.lang.Integer.valueOf(list != null ? list.size() : 0);
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectServiceNotifySenderUI", "user should not be null. position:%d, size:%d", objArr);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", "notifymessage");
            intent.putExtra("key_notify_message_real_username", ((com.tencent.mm.chatroom.ui.xd) list.get(i17)).f64673b);
            intent.putExtra("finish_direct", true);
            intent.putExtra("chat_from_scene", 6);
            j45.l.u(selectServiceNotifySenderUI.getContext(), ".ui.chatting.ChattingUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
