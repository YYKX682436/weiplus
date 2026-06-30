package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class n6 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 f228756d;

    public n6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 activityC16370x5a91dd69) {
        this.f228756d = activityC16370x5a91dd69;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o4 item;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        int i18 = (int) j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69.I;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 activityC16370x5a91dd69 = this.f228756d;
        g0Var.d(11701, java.lang.Integer.valueOf(activityC16370x5a91dd69.f227687g == 1 ? 8 : 9), 0, 0, 0, 2);
        if (i18 >= 0 && i18 < activityC16370x5a91dd69.f227699v.getCount() && (item = activityC16370x5a91dd69.f227699v.getItem(i18)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f227042t)) {
            android.content.Intent intent = new android.content.Intent();
            int i27 = item.f227043u;
            if (i27 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyMyRecordUI", "onItemClick: go busi detail");
                intent.setClass(activityC16370x5a91dd69.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16359x81eae2a6.class);
            } else if (i27 == 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyMyRecordUI", "onItemClick: go union detail");
                intent.putExtra("key_hb_kind", item.f227043u);
                intent.setClass(activityC16370x5a91dd69.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c.class);
            } else if (i27 == 6) {
                intent.putExtra("key_hb_kind", i27);
                intent.putExtra("key_hk_scene", 2);
                intent.setClass(activityC16370x5a91dd69.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16334x8c51adff.class);
            } else if (i27 == 7) {
                intent.putExtra("key_hb_kind", i27);
                intent.setClass(activityC16370x5a91dd69.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c.class);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyMyRecordUI", "onItemClick: go normal detail");
                intent.setClass(activityC16370x5a91dd69.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c.class);
            }
            intent.putExtra("key_sendid", item.f227042t);
            int i28 = activityC16370x5a91dd69.f227687g == 1 ? 3 : 1;
            intent.putExtra("key_jump_from", i28);
            if (i28 == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f227041s)) {
                intent.putExtra("key_receiveid", item.f227041s);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 activityC16370x5a91dd692 = this.f228756d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC16370x5a91dd692, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI$3", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16370x5a91dd692.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC16370x5a91dd692, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI$3", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
