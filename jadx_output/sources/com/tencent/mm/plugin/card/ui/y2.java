package com.tencent.mm.plugin.card.ui;

/* loaded from: classes11.dex */
public class y2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardListSelectedUI f95459d;

    public y2(com.tencent.mm.plugin.card.ui.CardListSelectedUI cardListSelectedUI) {
        this.f95459d = cardListSelectedUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardListSelectedUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.card.ui.CardListSelectedUI cardListSelectedUI = this.f95459d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(cardListSelectedUI.E)) {
            lu1.d.k(cardListSelectedUI, cardListSelectedUI.E, cardListSelectedUI.getString(com.tencent.mm.R.string.ath));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
