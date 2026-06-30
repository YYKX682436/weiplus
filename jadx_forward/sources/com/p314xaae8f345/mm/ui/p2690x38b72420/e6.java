package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class e6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 f288221d;

    public e6(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 activityC22313x70d15e01, com.p314xaae8f345.mm.ui.p2690x38b72420.v5 v5Var) {
        this.f288221d = activityC22313x70d15e01;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/ModRemarkNameUI$LabelEditOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01.f287999y1;
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 activityC22313x70d15e01 = this.f288221d;
        activityC22313x70d15e01.getClass();
        android.content.Intent intent = new android.content.Intent();
        java.util.List list = activityC22313x70d15e01.V;
        if (list != null) {
            intent.putStringArrayListExtra("label_str_list", (java.util.ArrayList) list);
        }
        activityC22313x70d15e01.X = true;
        intent.putStringArrayListExtra("contact_net_label_list", (java.util.ArrayList) activityC22313x70d15e01.U);
        int i18 = 0;
        java.lang.String str = "";
        while (true) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            if (i18 >= arrayList2.size()) {
                intent.putExtra("label_id_list", str);
                intent.putExtra("is_stranger", true);
                intent.putExtra("label_username", activityC22313x70d15e01.f288005h);
                intent.putExtra("contact_search_label_new_list", activityC22313x70d15e01.f288025y0);
                intent.putExtra("contact_search_label_add_list", activityC22313x70d15e01.f288007l1);
                intent.putExtra("contact_select_label_add_list", activityC22313x70d15e01.f288023x1);
                intent.putExtra("contact_select_label_new_list", activityC22313x70d15e01.f288013p1);
                ((j93.n) pf5.z.f435481a.a(activityC22313x70d15e01).a(j93.n.class)).V6(600, intent, false, (java.util.ArrayList) list);
                yj0.a.h(this, "com/tencent/mm/ui/contact/ModRemarkNameUI$LabelEditOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.String str2 = (java.lang.String) arrayList2.get(i18);
            if (!x51.t1.b(str2)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(b93.r.wi().p1(str2));
                sb6.append(i18 < arrayList2.size() - 1 ? "," : "");
                str = sb6.toString();
            }
            i18++;
        }
    }
}
