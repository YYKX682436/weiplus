package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes.dex */
public class fa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 f288242d;

    public fa(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8) {
        this.f288242d = activityC22325x8baa24f8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SelectContactUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8 = this.f288242d;
        intent.setClassName(activityC22325x8baa24f8, "com.tencent.mm.ui.contact.GroupCardSelectUI");
        intent.putExtra("group_select_type", true);
        boolean d17 = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(activityC22325x8baa24f8.D, 16384);
        intent.putExtra("group_select_need_result", d17);
        if (!d17) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f82 = this.f288242d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC22325x8baa24f82, arrayList2.toArray(), "com/tencent/mm/ui/contact/SelectContactUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC22325x8baa24f82.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC22325x8baa24f82, "com/tencent/mm/ui/contact/SelectContactUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (activityC22325x8baa24f8.U == 14) {
            intent.putExtra("group_multi_select", true);
            intent.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC22325x8baa24f8.E7(true), ","));
            intent.putExtra("max_limit_num", activityC22325x8baa24f8.getIntent().getIntExtra("max_limit_num", 9));
            activityC22325x8baa24f8.startActivityForResult(intent, 4);
        } else {
            activityC22325x8baa24f8.startActivityForResult(intent, 0);
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
