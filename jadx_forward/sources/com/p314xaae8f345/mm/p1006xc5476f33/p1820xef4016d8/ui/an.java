package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes4.dex */
public class an implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f228253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.bn f228254e;

    public an(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.bn bnVar, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d, int i17) {
        this.f228254e = bnVar;
        this.f228253d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$HistoryEnvelopeEntranceVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22302, 3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.bn bnVar = this.f228254e;
        android.content.Intent intent = new android.content.Intent(bnVar.f228299g.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.pwd.ui.ActivityC19192xe32b521d.class);
        if (this.f228253d == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "click HistoryEnvelopeEntranceVH: %s", java.lang.Integer.valueOf(bnVar.m8186xceeefb69()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d = bnVar.f228299g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC16390x60cac25d, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$HistoryEnvelopeEntranceVH$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16390x60cac25d.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC16390x60cac25d, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$HistoryEnvelopeEntranceVH$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$HistoryEnvelopeEntranceVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
