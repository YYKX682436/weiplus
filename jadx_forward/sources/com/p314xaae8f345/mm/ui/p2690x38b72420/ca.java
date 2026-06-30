package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class ca implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 f288178d;

    public ca(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8) {
        this.f288178d = activityC22325x8baa24f8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SelectContactUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8 = this.f288178d;
        java.lang.String str = activityC22325x8baa24f8.B1;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "click selectRecordMsgBt %s", objArr);
        activityC22325x8baa24f8.mo48674x36654fab();
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", activityC22325x8baa24f8.B1).putExtra("finish_direct", true).putExtra("key_record_msg_select", true).putExtra("key_record_select_min_msg_id", activityC22325x8baa24f8.F1).putExtra("key_record_select_msg_num", activityC22325x8baa24f8.C1);
        java.util.ArrayList<java.lang.String> arrayList2 = activityC22325x8baa24f8.E1;
        if (arrayList2 != null) {
            putExtra.putStringArrayListExtra("key_record_selected_msg_list", arrayList2);
        }
        j45.l.v(activityC22325x8baa24f8, ".ui.chatting.ChattingUI", putExtra, 6);
        a14.a.a().f82115a.f141892f = 1;
        yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
