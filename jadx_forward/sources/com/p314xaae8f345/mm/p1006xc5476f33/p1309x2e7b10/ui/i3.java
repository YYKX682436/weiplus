package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class i3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 f176561d;

    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a6365) {
        this.f176561d = activityC13057x768a6365;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a6365 = this.f176561d;
        if (i17 != activityC13057x768a6365.f176428e.getCount()) {
            xt1.k kVar = (xt1.k) activityC13057x768a6365.f176428e.getItem(i17);
            if (kVar != null) {
                int i18 = kVar.f68127xc374eba6;
                if (i18 == 3) {
                    if (!android.text.TextUtils.isEmpty(kVar.f68121x95970a65)) {
                        activityC13057x768a6365.U6(kVar.f68121x95970a65, false);
                    } else if (android.text.TextUtils.isEmpty(kVar.f68122xf4648834)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardNewMsgUI", "field_card_id and field_card_tp_id is null");
                    } else {
                        activityC13057x768a6365.U6(kVar.f68122xf4648834, false);
                    }
                } else if (i18 == 2) {
                    if (android.text.TextUtils.isEmpty(kVar.f68139x4b6e88aa)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardNewMsgUI", "field_url is null");
                    } else {
                        lu1.d.j(activityC13057x768a6365, kVar.f68139x4b6e88aa, 4);
                    }
                } else if (i18 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardNewMsgUI", "field_jump_type is MM_CARD_ITEM_XML_MSG_JUMP_TYPE_NO");
                } else if (i18 == 4) {
                    if (!android.text.TextUtils.isEmpty(kVar.f68121x95970a65)) {
                        activityC13057x768a6365.U6(kVar.f68121x95970a65, true);
                    } else if (android.text.TextUtils.isEmpty(kVar.f68122xf4648834)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardNewMsgUI", "field_card_id and field_card_tp_id is null");
                    } else {
                        activityC13057x768a6365.U6(kVar.f68122xf4648834, true);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, java.lang.Integer.valueOf(activityC13057x768a6365.getIntent().getBooleanExtra("from_menu", false) ? 7 : 1), kVar.f68121x95970a65, kVar.f68122xf4648834, kVar.f68130x6583d7e, "");
            }
            yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (xt1.t0.Vi().f() > 0) {
            xt1.t0.Vi().f538051d.A("CardMsgInfo", " update CardMsgInfo set read_state = 0  where read_state = 1");
            t17 = 1;
        } else {
            t17 = activityC13057x768a6365.f176428e.t();
        }
        activityC13057x768a6365.f176428e.f();
        if (!activityC13057x768a6365.f176432i) {
            if (activityC13057x768a6365.f176430g.getParent() != null) {
                activityC13057x768a6365.f176427d.removeFooterView(activityC13057x768a6365.f176430g);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s3 s3Var = activityC13057x768a6365.f176428e;
            if (!(s3Var.f176690o >= s3Var.f176691p) && activityC13057x768a6365.f176431h.getParent() == null && t17 > 0) {
                activityC13057x768a6365.f176427d.addFooterView(activityC13057x768a6365.f176431h);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardNewMsgUI", "add mLoadingFooterView");
            }
        }
        activityC13057x768a6365.f176432i = true;
        android.view.View view2 = activityC13057x768a6365.f176430g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
