package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class i3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardNewMsgUI f95028d;

    public i3(com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI) {
        this.f95028d = cardNewMsgUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        int t17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardNewMsgUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI = this.f95028d;
        if (i17 != cardNewMsgUI.f94895e.getCount()) {
            xt1.k kVar = (xt1.k) cardNewMsgUI.f94895e.getItem(i17);
            if (kVar != null) {
                int i18 = kVar.field_jump_type;
                if (i18 == 3) {
                    if (!android.text.TextUtils.isEmpty(kVar.field_card_id)) {
                        cardNewMsgUI.U6(kVar.field_card_id, false);
                    } else if (android.text.TextUtils.isEmpty(kVar.field_card_tp_id)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.CardNewMsgUI", "field_card_id and field_card_tp_id is null");
                    } else {
                        cardNewMsgUI.U6(kVar.field_card_tp_id, false);
                    }
                } else if (i18 == 2) {
                    if (android.text.TextUtils.isEmpty(kVar.field_url)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.CardNewMsgUI", "field_url is null");
                    } else {
                        lu1.d.j(cardNewMsgUI, kVar.field_url, 4);
                    }
                } else if (i18 == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardNewMsgUI", "field_jump_type is MM_CARD_ITEM_XML_MSG_JUMP_TYPE_NO");
                } else if (i18 == 4) {
                    if (!android.text.TextUtils.isEmpty(kVar.field_card_id)) {
                        cardNewMsgUI.U6(kVar.field_card_id, true);
                    } else if (android.text.TextUtils.isEmpty(kVar.field_card_tp_id)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.CardNewMsgUI", "field_card_id and field_card_tp_id is null");
                    } else {
                        cardNewMsgUI.U6(kVar.field_card_tp_id, true);
                    }
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, java.lang.Integer.valueOf(cardNewMsgUI.getIntent().getBooleanExtra("from_menu", false) ? 7 : 1), kVar.field_card_id, kVar.field_card_tp_id, kVar.field_msg_id, "");
            }
            yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (xt1.t0.Vi().f() > 0) {
            xt1.t0.Vi().f456518d.A("CardMsgInfo", " update CardMsgInfo set read_state = 0  where read_state = 1");
            t17 = 1;
        } else {
            t17 = cardNewMsgUI.f94895e.t();
        }
        cardNewMsgUI.f94895e.f();
        if (!cardNewMsgUI.f94899i) {
            if (cardNewMsgUI.f94897g.getParent() != null) {
                cardNewMsgUI.f94894d.removeFooterView(cardNewMsgUI.f94897g);
            }
            com.tencent.mm.plugin.card.ui.s3 s3Var = cardNewMsgUI.f94895e;
            if (!(s3Var.f95157o >= s3Var.f95158p) && cardNewMsgUI.f94898h.getParent() == null && t17 > 0) {
                cardNewMsgUI.f94894d.addFooterView(cardNewMsgUI.f94898h);
                com.tencent.mars.xlog.Log.i("MicroMsg.CardNewMsgUI", "add mLoadingFooterView");
            }
        }
        cardNewMsgUI.f94899i = true;
        android.view.View view2 = cardNewMsgUI.f94897g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
