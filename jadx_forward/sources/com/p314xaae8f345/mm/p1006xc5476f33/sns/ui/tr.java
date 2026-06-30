package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes11.dex */
public class tr implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18116x89222096 f252078d;

    public tr(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18116x89222096 activityC18116x89222096) {
        this.f252078d = activityC18116x89222096;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18116x89222096 activityC18116x89222096 = this.f252078d;
        if (i17 < com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18116x89222096.T6(activityC18116x89222096).getCount() - 1) {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 q2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18116x89222096.T6(activityC18116x89222096).getItem(i17);
            if (q2Var == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$2");
                return;
            }
            intent.putExtra("k_sns_tag_id", q2Var.f69153x29d92ad0);
            intent.setClass(activityC18116x89222096, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7.class);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18116x89222096 activityC18116x892220962 = this.f252078d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC18116x892220962, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC18116x892220962.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC18116x892220962, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            java.lang.String r17 = c01.z1.r();
            intent2.putExtra("titile", activityC18116x89222096.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571463ft));
            intent2.putExtra("list_type", 1);
            intent2.putExtra("KBlockOpenImFav", true);
            com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
            intent2.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288315c, 1024, 64, 262144) & (-16777217));
            intent2.putExtra("min_limit_num", 1);
            intent2.putExtra("block_contact", r17);
            j45.l.v(activityC18116x89222096, ".ui.contact.SelectContactUI", intent2, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$2");
    }
}
