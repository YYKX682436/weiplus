package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 f176648d;

    public p3(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a6365) {
        this.f176648d = activityC13057x768a6365;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardNewMsgUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a6365 = this.f176648d;
        if (id6 == com.p314xaae8f345.mm.R.id.dlk) {
            xt1.k kVar = (xt1.k) view.getTag();
            if (kVar == null || kVar.t0() == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.d(11941, 2, kVar.f68121x95970a65, kVar.f68122xf4648834, kVar.f68130x6583d7e, "");
            if (kVar.t0().f464930d == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_BUTTON_TYPE_URL");
                if (android.text.TextUtils.isEmpty(kVar.t0().f464932f)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardNewMsgUI", "card msg button url is empty");
                } else {
                    lu1.d.j(activityC13057x768a6365, kVar.t0().f464932f, 2);
                }
            } else if (kVar.t0().f464930d == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_BUTTON_TYPE_SHOP");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KEY_CARD_ID", kVar.f68121x95970a65);
                intent.putExtra("KEY_CARD_TP_ID", kVar.f68122xf4648834);
                intent.setClass(activityC13057x768a6365, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13058x9cebb75a.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a63652 = this.f176648d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(activityC13057x768a63652, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC13057x768a63652.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(activityC13057x768a63652, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                g0Var.d(11324, "UsedStoresView", java.lang.Integer.valueOf(kVar.f68123x8c036204), kVar.f68122xf4648834, kVar.f68121x95970a65, 0, 0, "", 0, "");
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.kjs) {
            xt1.k kVar2 = (xt1.k) view.getTag();
            if (kVar2 == null || kVar2.u0() == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (kVar2.u0().f459636d == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_OPERATION_REGION_TYPE_TEXT");
                if (android.text.TextUtils.isEmpty(kVar2.u0().f459638f)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardNewMsgUI", "card msg oper region url is empty");
                } else {
                    lu1.d.j(activityC13057x768a6365, kVar2.u0().f459638f, 2);
                }
            } else if (kVar2.u0().f459636d == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_OPERATION_REGION_TYPE_CARDS");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
