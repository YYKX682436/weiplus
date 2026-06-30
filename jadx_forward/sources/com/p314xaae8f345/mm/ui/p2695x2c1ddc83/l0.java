package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class l0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22362x9bac7ed5.ConvBoxServiceConversationFmUI f289352d;

    public l0(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22362x9bac7ed5.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI) {
        this.f289352d = convBoxServiceConversationFmUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 o2Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b3 b3Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var3;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 o2Var2;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 o2Var3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22362x9bac7ed5.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI = this.f289352d;
        o2Var = convBoxServiceConversationFmUI.f39567xbb6ca34f;
        convBoxServiceConversationFmUI.f39570x2c1ddc83 = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) o2Var.getItem(i17);
        l4Var = convBoxServiceConversationFmUI.f39570x2c1ddc83;
        if (l4Var == null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            o2Var2 = convBoxServiceConversationFmUI.f39567xbb6ca34f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConvBoxServiceConversationFmUI", "user should not be null. position:%d, size:%d", valueOf, java.lang.Integer.valueOf(o2Var2.getCount()));
            o2Var3 = convBoxServiceConversationFmUI.f39567xbb6ca34f;
            o2Var3.notifyDataSetChanged();
            yj0.a.h(this, "com/tencent/mm/ui/conversation/ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(l4Var.h1(), true) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConvBoxServiceConversationFmUI", "position=%s cont is null", java.lang.Integer.valueOf(i17));
            yj0.a.h(this, "com/tencent/mm/ui/conversation/ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (l4Var.I0() > 0) {
            l4Var.C1(0);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).W(l4Var, l4Var.h1());
        }
        if (l4Var.d2(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb)) {
            l4Var.e2(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).W(l4Var, l4Var.h1());
        }
        b3Var = convBoxServiceConversationFmUI.f39569x339642d6;
        l4Var2 = convBoxServiceConversationFmUI.f39570x2c1ddc83;
        java.lang.String h17 = l4Var2.h1();
        l4Var3 = convBoxServiceConversationFmUI.f39570x2c1ddc83;
        b3Var.a(h17, view, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.r0(view, l4Var3.h1()));
        ((j00.k1) ((c00.e3) i95.n0.c(c00.e3.class))).Vi(l4Var.h1());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("specific_chat_from_scene", 7);
        bundle.putInt("KOpenArticleSceneFromScene", 93);
        bundle.putInt("chat_from_scene_for_group_chats", 3);
        bundle.putInt("Main_IndexInSessionList", i17);
        bundle.putInt("Main_UnreadCount", l4Var.d1());
        bundle.putInt("chat_from_scene", 0);
        convBoxServiceConversationFmUI.f288820ui.m80491x5d4f20c8(l4Var.h1(), bundle, true);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
