package com.tencent.mm.plugin.card.ui;

/* loaded from: classes4.dex */
public class y3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f95460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardShopUI f95461e;

    public y3(com.tencent.mm.plugin.card.ui.CardShopUI cardShopUI, android.content.Intent intent) {
        this.f95461e = cardShopUI;
        this.f95460d = intent;
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
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardShopUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (i17 == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardShopUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i17 > 0) {
            i17--;
        }
        com.tencent.mm.plugin.card.ui.CardShopUI cardShopUI = this.f95461e;
        r45.nu nuVar = (r45.nu) cardShopUI.f94904f.get(i17);
        if (!android.text.TextUtils.isEmpty(nuVar.f381683r) && !android.text.TextUtils.isEmpty(nuVar.f381684s)) {
            lu1.d.d(cardShopUI.f94907i, nuVar.f381683r, nuVar.f381684s, 1052, this.f95460d.getIntExtra("key_from_appbrand_type", 0));
        } else if (!android.text.TextUtils.isEmpty(nuVar.f381682q)) {
            lu1.d.j(cardShopUI, nuVar.f381682q, 1);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, 4, cardShopUI.f94905g.g(), cardShopUI.f94905g.f(), "", nuVar.f381672d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardShopUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
