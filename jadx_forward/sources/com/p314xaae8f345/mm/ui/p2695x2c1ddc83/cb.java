package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes9.dex */
public class cb implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22384x2b6f00ff f289151d;

    public cb(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22384x2b6f00ff activityC22384x2b6f00ff) {
        this.f289151d = activityC22384x2b6f00ff;
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
        yj0.a.b("com/tencent/mm/ui/conversation/SettingCheckUnProcessWalletConvUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22384x2b6f00ff activityC22384x2b6f00ff = this.f289151d;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 item = activityC22384x2b6f00ff.f288958f.getItem(i17);
        if (item == null) {
            yj0.a.h(this, "com/tencent/mm/ui/conversation/SettingCheckUnProcessWalletConvUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", item.h1());
        intent.putExtra("chat_from_scene", 4);
        j45.l.u(activityC22384x2b6f00ff, ".ui.chatting.ChattingUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/SettingCheckUnProcessWalletConvUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
