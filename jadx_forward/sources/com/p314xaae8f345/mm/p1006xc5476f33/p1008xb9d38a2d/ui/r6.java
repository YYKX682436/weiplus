package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class r6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 f155689d;

    public r6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98) {
        this.f155689d = activityC11419x78fe9e98;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98 = this.f155689d;
        android.content.Intent intent = new android.content.Intent(activityC11419x78fe9e98, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.class);
        intent.putExtra("mobile_input_purpose", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e982 = this.f155689d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC11419x78fe9e982, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginPasswordUI$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11419x78fe9e982.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC11419x78fe9e982, "com/tencent/mm/plugin/account/ui/LoginPasswordUI$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11419x78fe9e98.finish();
    }
}
