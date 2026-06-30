package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes15.dex */
public class qn implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17476xb3aa84a7 f243018d;

    public qn(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17476xb3aa84a7 activityC17476xb3aa84a7) {
        this.f243018d = activityC17476xb3aa84a7;
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
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17476xb3aa84a7 activityC17476xb3aa84a7 = this.f243018d;
        if (activityC17476xb3aa84a7.f242269f.getItemViewType(i17) == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("list_type", 12);
            intent.putExtra("titile", activityC17476xb3aa84a7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571467fx));
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 2);
            intent.putExtra("max_limit_num", com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17476xb3aa84a7.f242266n);
            intent.putExtra("stay_in_wechat", true);
            intent.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC17476xb3aa84a7.f242267d, ","));
            intent.putExtra("block_contact", c01.z1.r());
            com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
            intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288321i & (-257) & (-16777217));
            intent.putExtra("KBlockOpenImFav", true);
            intent.putExtra("without_openim", true);
            intent.putExtra("too_many_member_tip_string", activityC17476xb3aa84a7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574633j06, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17476xb3aa84a7.f242266n)));
            j45.l.v(activityC17476xb3aa84a7, ".ui.contact.SelectContactUI", intent, 1);
        } else if (activityC17476xb3aa84a7.f242269f.getItemViewType(i17) == 2) {
            if (!activityC17476xb3aa84a7.f242272i) {
                activityC17476xb3aa84a7.f242272i = true;
                activityC17476xb3aa84a7.f242269f.notifyDataSetChanged();
            }
        } else if (activityC17476xb3aa84a7.f242269f.getItemViewType(i17) == 0 && activityC17476xb3aa84a7.f242272i) {
            ((java.util.ArrayList) activityC17476xb3aa84a7.f242267d).remove(activityC17476xb3aa84a7.f242269f.getItem(i17));
            if (((java.util.ArrayList) activityC17476xb3aa84a7.f242267d).size() == 0) {
                activityC17476xb3aa84a7.f242272i = false;
            }
            activityC17476xb3aa84a7.f242269f.notifyDataSetChanged();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
