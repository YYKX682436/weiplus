package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardAcceptCardListUI f95002d;

    public f(com.tencent.mm.plugin.card.ui.CardAcceptCardListUI cardAcceptCardListUI) {
        this.f95002d = cardAcceptCardListUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardAcceptCardListUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.card.ui.CardAcceptCardListUI.M;
        com.tencent.mm.plugin.card.ui.CardAcceptCardListUI cardAcceptCardListUI = this.f95002d;
        cardAcceptCardListUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAcceptCardListUI", "doSelectShareUser");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11582, "OpenShareUserSelectView", 0, "", "", "", "");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KLabel_range_index", cardAcceptCardListUI.D);
        intent.putExtra("Klabel_name_list", cardAcceptCardListUI.E);
        intent.putExtra("Kother_user_name_list", cardAcceptCardListUI.F);
        intent.putExtra("k_sns_label_ui_title", cardAcceptCardListUI.getString(com.tencent.mm.R.string.av9));
        intent.putExtra("k_sns_label_ui_style", 0);
        intent.putExtra("KLabel_is_filter_private", true);
        j45.l.n(cardAcceptCardListUI, "sns", ".ui.SnsLabelUI", intent, 2);
        cardAcceptCardListUI.mmSetOnActivityResultCallback(cardAcceptCardListUI);
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
