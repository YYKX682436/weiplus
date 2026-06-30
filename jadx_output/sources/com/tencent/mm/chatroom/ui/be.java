package com.tencent.mm.chatroom.ui;

/* loaded from: classes8.dex */
public class be implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI f64060d;

    public be(com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI selectedMemberChattingRecordUI) {
        this.f64060d = selectedMemberChattingRecordUI;
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
        com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI selectedMemberChattingRecordUI = this.f64060d;
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) selectedMemberChattingRecordUI.f64002g.getItem(i17);
        if (f9Var != null) {
            long msgId = f9Var.getMsgId();
            selectedMemberChattingRecordUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectedMemberChattingRecordUI", "[goToChattingUI] msgLocalId:%s", java.lang.Long.valueOf(msgId));
            j45.l.u(selectedMemberChattingRecordUI, ".ui.chatting.ChattingUI", new android.content.Intent().putExtra("Chat_User", selectedMemberChattingRecordUI.f64003h).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", msgId), null);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectedMemberChattingRecordUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
