package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class c4 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI f289138d;

    public c4(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI enterpriseConversationFmUI) {
        this.f289138d = enterpriseConversationFmUI;
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
        yj0.a.b("com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI enterpriseConversationFmUI = this.f289138d;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7 item = enterpriseConversationFmUI.f288883i.getItem(i17);
        dg5.v l07 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI.l0(enterpriseConversationFmUI, item);
        if (l07 != null) {
            l07.b(item);
            yj0.a.h(this, "com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnterpriseConversationUI", "user should not be null. position:%d, size:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(enterpriseConversationFmUI.f288883i.getCount()));
            enterpriseConversationFmUI.f288883i.notifyDataSetChanged();
            yj0.a.h(this, "com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }
}
