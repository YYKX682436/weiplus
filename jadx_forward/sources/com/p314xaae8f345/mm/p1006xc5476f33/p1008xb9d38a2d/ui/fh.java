package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class fh implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 f155399d;

    public fh(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b0) {
        this.f155399d = activityC11466x7d774b0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b0 = this.f155399d;
        if (activityC11466x7d774b0.N == 2) {
            intent = new android.content.Intent(activityC11466x7d774b0, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.class);
            intent.putExtra("mobile_input_purpose", 2);
        } else {
            intent = new android.content.Intent(activityC11466x7d774b0, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174.class);
        }
        intent.addFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b02 = this.f155399d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC11466x7d774b02, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI$25", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11466x7d774b02.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC11466x7d774b02, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$25", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11466x7d774b0.finish();
    }
}
