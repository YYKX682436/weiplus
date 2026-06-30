package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class j9 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI f289316d;

    public j9(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f289316d = openImKefuServiceConversationFmUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI$OpenImKefuServiceConversationFmUI$initData$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h8 h8Var = this.f289316d.f288935g;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = h8Var != null ? (com.p314xaae8f345.mm.p2621x8fb0427b.l4) h8Var.getItem(i17) : null;
        java.lang.String h17 = l4Var != null ? l4Var.h1() : null;
        if (h17 == null || h17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenImKefuServiceConversationUI", "startKefuChatting username invalid, position: " + i17);
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h9(l4Var));
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u8 u8Var = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.f288925n;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 ui6 = this.f289316d.f288820ui;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ui6, "ui");
        u8Var.a(ui6, l4Var != null ? l4Var.h1() : null, true, true, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.i9.f289290d);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI$OpenImKefuServiceConversationFmUI$initData$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
