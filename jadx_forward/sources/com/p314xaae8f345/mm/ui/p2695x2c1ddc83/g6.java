package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes3.dex */
public class g6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 f289233d;

    public g6(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var) {
        this.f289233d = q5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var = this.f289233d;
        q5Var.f289535e.dismiss();
        android.content.Intent intent = new android.content.Intent(q5Var.f289542o, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.ActivityC13198x17b4d807.class);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        android.app.Activity activity = q5Var.f289542o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/conversation/InitHelper$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/conversation/InitHelper$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
