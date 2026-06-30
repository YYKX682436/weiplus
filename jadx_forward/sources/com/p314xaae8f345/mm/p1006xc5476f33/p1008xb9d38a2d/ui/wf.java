package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class wf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11462xec7fb918 f155834d;

    public wf(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11462xec7fb918 activityC11462xec7fb918) {
        this.f155834d = activityC11462xec7fb918;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.SENDTO");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("smsto:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11462xec7fb918 activityC11462xec7fb918 = this.f155834d;
        sb6.append(activityC11462xec7fb918.f155119f);
        intent.setData(android.net.Uri.parse(sb6.toString()));
        intent.putExtra("sms_body", activityC11462xec7fb918.f155118e);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11462xec7fb918 activityC11462xec7fb9182 = this.f155834d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC11462xec7fb9182, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC11462xec7fb9182.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC11462xec7fb9182, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC11462xec7fb918.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RegByMobileSendSmsUI", e17.getMessage());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
