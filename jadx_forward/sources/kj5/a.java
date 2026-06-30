package kj5;

/* loaded from: classes.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj5.f f389988d;

    public a(kj5.f fVar) {
        this.f389988d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/uic/createchatroom/CreateChatroomSelectContactBottomMenuUIC$onCreate$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kj5.f fVar = this.f389988d;
        java.lang.String stringExtra = fVar.m158359x1e885992().getStringExtra("key_create_chatroom_from_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateChatroomSelectContactBottomMenuUIC", "click selectRecordMsgBt %s", stringExtra);
        fVar.m174141x36654fab();
        android.content.Intent intent = new android.content.Intent();
        java.lang.String stringExtra2 = fVar.m158359x1e885992().getStringExtra("key_create_chatroom_from_username");
        android.content.Intent putExtra = intent.putExtra("Chat_User", stringExtra2 != null ? stringExtra2 : "").putExtra("finish_direct", true).putExtra("key_record_msg_select", true).putExtra("key_record_select_min_msg_id", fVar.f389996s).putExtra("key_record_select_msg_num", fVar.f389993p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
        java.util.ArrayList<java.lang.String> arrayList2 = fVar.f389995r;
        if (arrayList2 != null) {
            putExtra.putStringArrayListExtra("key_record_selected_msg_list", arrayList2);
        }
        j45.l.v(fVar.m158354x19263085(), ".ui.chatting.ChattingUI", putExtra, 1000001001);
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/uic/createchatroom/CreateChatroomSelectContactBottomMenuUIC$onCreate$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
