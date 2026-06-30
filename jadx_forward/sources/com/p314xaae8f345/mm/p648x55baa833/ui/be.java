package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes8.dex */
public class be implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10375x35d0ae60 f145593d;

    public be(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10375x35d0ae60 activityC10375x35d0ae60) {
        this.f145593d = activityC10375x35d0ae60;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SelectedMemberChattingRecordUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10375x35d0ae60 activityC10375x35d0ae60 = this.f145593d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) activityC10375x35d0ae60.f145535g.getItem(i17);
        if (f9Var != null) {
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            activityC10375x35d0ae60.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectedMemberChattingRecordUI", "[goToChattingUI] msgLocalId:%s", java.lang.Long.valueOf(m124847x74d37ac6));
            j45.l.u(activityC10375x35d0ae60, ".ui.chatting.ChattingUI", new android.content.Intent().putExtra("Chat_User", activityC10375x35d0ae60.f145536h).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", m124847x74d37ac6), null);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectedMemberChattingRecordUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
