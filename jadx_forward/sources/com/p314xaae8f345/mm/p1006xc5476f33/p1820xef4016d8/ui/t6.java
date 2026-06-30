package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class t6 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.w6 f228977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 f228978e;

    public t6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 activityC16370x5a91dd69, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.w6 w6Var) {
        this.f228978e = activityC16370x5a91dd69;
        this.f228977d = w6Var;
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
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 activityC16370x5a91dd69 = this.f228978e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = activityC16370x5a91dd69.H;
        if (j0Var != null && j0Var.isShowing()) {
            activityC16370x5a91dd69.H.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.w6 w6Var = this.f228977d;
        java.lang.String str = (java.lang.String) w6Var.f229168d.get(i17);
        w6Var.f229169e = i17;
        if (!str.equals(activityC16370x5a91dd69.C)) {
            activityC16370x5a91dd69.C = str;
            activityC16370x5a91dd69.f227695r.setText(activityC16370x5a91dd69.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gnd, str));
            activityC16370x5a91dd69.f227700w = 0;
            ((java.util.LinkedList) activityC16370x5a91dd69.f227701x).clear();
            ((java.util.HashMap) activityC16370x5a91dd69.f227703z).clear();
            java.util.ArrayList arrayList2 = activityC16370x5a91dd69.f227702y;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            activityC16370x5a91dd69.W6();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, java.lang.Integer.valueOf(activityC16370x5a91dd69.f227687g == 1 ? 8 : 9), 0, 0, 0, 3, str);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
