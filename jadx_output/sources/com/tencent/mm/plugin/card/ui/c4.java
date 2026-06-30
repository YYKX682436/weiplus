package com.tencent.mm.plugin.card.ui;

/* loaded from: classes4.dex */
public class c4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardShopUI f94973d;

    public c4(com.tencent.mm.plugin.card.ui.CardShopUI cardShopUI) {
        this.f94973d = cardShopUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        r45.nu nuVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardShopUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.tencent.mm.R.id.mu9 && (nuVar = (r45.nu) view.getTag()) != null) {
            float f17 = nuVar.f381681p;
            float f18 = nuVar.f381680o;
            java.lang.String str = nuVar.f381672d;
            java.lang.String str2 = nuVar.f381678m;
            com.tencent.mm.plugin.card.ui.CardShopUI cardShopUI = this.f94973d;
            lu1.d.c(cardShopUI, f17, f18, str, str2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, 5, cardShopUI.f94905g.g(), cardShopUI.f94905g.f(), "", nuVar.f381672d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardShopUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
