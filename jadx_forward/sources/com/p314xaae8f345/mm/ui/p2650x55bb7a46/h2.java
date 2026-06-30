package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public class h2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 f283164d;

    public h2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 viewOnClickListenerC21613xfaa83484) {
        this.f283164d = viewOnClickListenerC21613xfaa83484;
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
        yj0.a.b("com/tencent/mm/ui/chatting/ChatFooterCustom$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 viewOnClickListenerC21613xfaa83484 = this.f283164d;
        viewOnClickListenerC21613xfaa83484.onClick(view);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(viewOnClickListenerC21613xfaa83484.f279712s)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_name", viewOnClickListenerC21613xfaa83484.f279712s);
            hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(viewOnClickListenerC21613xfaa83484.E)));
            hashMap.put("enter_sessionid", viewOnClickListenerC21613xfaa83484.D);
            hashMap.put("item_index", java.lang.Integer.valueOf(i17));
            hashMap.put("view_id", "yuanbao_menu_item");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChatFooterCustom$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
