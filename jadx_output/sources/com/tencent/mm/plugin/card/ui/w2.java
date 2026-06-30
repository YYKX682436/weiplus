package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class w2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardListSelectedUI f95432d;

    public w2(com.tencent.mm.plugin.card.ui.CardListSelectedUI cardListSelectedUI) {
        this.f95432d = cardListSelectedUI;
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
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardListSelectedUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (view.getAlpha() != 1.0f) {
            yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.tencent.mm.plugin.card.ui.CardListSelectedUI cardListSelectedUI = this.f95432d;
        if (cardListSelectedUI.f94880n) {
            cardListSelectedUI.f94882p.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(!((java.lang.Boolean) cardListSelectedUI.f94882p.get(java.lang.Integer.valueOf(i17))).booleanValue()));
        } else {
            for (int i18 = 0; i18 < cardListSelectedUI.f94881o.size(); i18++) {
                cardListSelectedUI.f94882p.put(java.lang.Integer.valueOf(i18), java.lang.Boolean.FALSE);
            }
            cardListSelectedUI.f94882p.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
            cardListSelectedUI.f94872J = (xt1.a) cardListSelectedUI.f94881o.get(i17);
        }
        cardListSelectedUI.f94879m.notifyDataSetChanged();
        for (int i19 = 0; i19 < cardListSelectedUI.f94881o.size(); i19++) {
            java.lang.Boolean bool = (java.lang.Boolean) cardListSelectedUI.f94882p.get(java.lang.Integer.valueOf(i19));
            if (bool != null && bool.booleanValue()) {
                cardListSelectedUI.enableOptionMenu(true);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
