package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardNewMsgUI f95115d;

    public p3(com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI) {
        this.f95115d = cardNewMsgUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardNewMsgUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI = this.f95115d;
        if (id6 == com.tencent.mm.R.id.dlk) {
            xt1.k kVar = (xt1.k) view.getTag();
            if (kVar == null || kVar.t0() == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(11941, 2, kVar.field_card_id, kVar.field_card_tp_id, kVar.field_msg_id, "");
            if (kVar.t0().f383397d == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_BUTTON_TYPE_URL");
                if (android.text.TextUtils.isEmpty(kVar.t0().f383399f)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.CardNewMsgUI", "card msg button url is empty");
                } else {
                    lu1.d.j(cardNewMsgUI, kVar.t0().f383399f, 2);
                }
            } else if (kVar.t0().f383397d == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_BUTTON_TYPE_SHOP");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KEY_CARD_ID", kVar.field_card_id);
                intent.putExtra("KEY_CARD_TP_ID", kVar.field_card_tp_id);
                intent.setClass(cardNewMsgUI, com.tencent.mm.plugin.card.ui.CardShopUI.class);
                com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI2 = this.f95115d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(cardNewMsgUI2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                cardNewMsgUI2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(cardNewMsgUI2, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                g0Var.d(11324, "UsedStoresView", java.lang.Integer.valueOf(kVar.field_card_type), kVar.field_card_tp_id, kVar.field_card_id, 0, 0, "", 0, "");
            }
        } else if (view.getId() == com.tencent.mm.R.id.kjs) {
            xt1.k kVar2 = (xt1.k) view.getTag();
            if (kVar2 == null || kVar2.u0() == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (kVar2.u0().f378103d == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_OPERATION_REGION_TYPE_TEXT");
                if (android.text.TextUtils.isEmpty(kVar2.u0().f378105f)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.CardNewMsgUI", "card msg oper region url is empty");
                } else {
                    lu1.d.j(cardNewMsgUI, kVar2.u0().f378105f, 2);
                }
            } else if (kVar2.u0().f378103d == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_OPERATION_REGION_TYPE_CARDS");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
