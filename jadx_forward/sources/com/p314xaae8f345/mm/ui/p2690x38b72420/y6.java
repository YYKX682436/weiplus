package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes4.dex */
public class y6 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22321x6fa86dd0 f288794d;

    public y6(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22321x6fa86dd0 activityC22321x6fa86dd0) {
        this.f288794d = activityC22321x6fa86dd0;
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
        yj0.a.b("com/tencent/mm/ui/contact/OnlyChatContactMgrUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22321x6fa86dd0 activityC22321x6fa86dd0 = this.f288794d;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = activityC22321x6fa86dd0.f288036e.getItem(i17);
        if (item == null || !(item instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u)) {
            yj0.a.h(this, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        java.lang.String str = ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) item).f288352z;
        com.p314xaae8f345.mm.ui.p2690x38b72420.j7 j7Var = activityC22321x6fa86dd0.f288036e;
        if (j7Var.f288611f) {
            java.util.LinkedList linkedList = (java.util.LinkedList) j7Var.f288499r;
            if (linkedList.contains(str)) {
                linkedList.remove(str);
            } else {
                linkedList.add(str);
            }
            j7Var.notifyDataSetChanged();
            if (((java.util.LinkedList) activityC22321x6fa86dd0.f288036e.f288499r).size() > 0) {
                activityC22321x6fa86dd0.f288042n.setText(activityC22321x6fa86dd0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571414ec) + "(" + ((java.util.LinkedList) activityC22321x6fa86dd0.f288036e.f288499r).size() + ")");
                activityC22321x6fa86dd0.f288042n.setEnabled(true);
            } else {
                activityC22321x6fa86dd0.f288042n.setText(activityC22321x6fa86dd0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571414ec));
                activityC22321x6fa86dd0.f288042n.setEnabled(false);
            }
        } else {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.k4(str)) {
                android.content.Intent intent = new android.content.Intent(activityC22321x6fa86dd0.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.class);
                intent.putExtra("Contact_GroupFilter_Type", "@biz.contact");
                com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22321x6fa86dd0 activityC22321x6fa86dd02 = this.f288794d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(activityC22321x6fa86dd02, arrayList2.toArray(), "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC22321x6fa86dd02.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(activityC22321x6fa86dd02, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                yj0.a.h(this, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", str);
            intent2.putExtra("Contact_Scene", 3);
            intent2.putExtra("CONTACT_INFO_UI_SOURCE", 4);
            if (str != null && str.length() > 0) {
                j45.l.j(activityC22321x6fa86dd0.mo55332x76847179(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
