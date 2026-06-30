package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public class nf implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17432x38b6fe4 f242893d;

    public nf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17432x38b6fe4 activityC17432x38b6fe4) {
        this.f242893d = activityC17432x38b6fe4;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        r45.ov6 item;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17432x38b6fe4 activityC17432x38b6fe4 = this.f242893d;
        if (!activityC17432x38b6fe4.f242022i && (item = activityC17432x38b6fe4.f242019f.getItem(i17)) != null) {
            android.content.Intent intent = new android.content.Intent(activityC17432x38b6fe4, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17443x5ce564a4.class);
            android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29.C17359xa27bff69> creator = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29.C17359xa27bff69.f37949x681a0c0c;
            java.util.LinkedList linkedList = item.f464096g;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29.C17359xa27bff69[] newArray = creator.newArray(linkedList.size());
            for (int i18 = 0; i18 < linkedList.size(); i18++) {
                r45.pv6 pv6Var = (r45.pv6) linkedList.get(i18);
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29.C17359xa27bff69 c17359xa27bff69 = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29.C17359xa27bff69();
                c17359xa27bff69.f241587d = pv6Var.f464953d;
                c17359xa27bff69.f241588e = pv6Var.f464954e;
                c17359xa27bff69.f241589f = pv6Var.f464955f;
                c17359xa27bff69.f241590g = pv6Var.f464956g;
                newArray[i18] = c17359xa27bff69;
            }
            intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, item.f464093d);
            intent.putExtra("app_name", item.f464094e);
            intent.putExtra("modify_scene", 1);
            intent.putParcelableArrayListExtra("app_auth_items", new java.util.ArrayList<>(java.util.Arrays.asList(newArray)));
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17432x38b6fe4 activityC17432x38b6fe42 = this.f242893d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC17432x38b6fe42, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC17432x38b6fe42.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC17432x38b6fe42, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
