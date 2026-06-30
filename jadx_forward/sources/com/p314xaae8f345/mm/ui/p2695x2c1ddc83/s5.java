package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes.dex */
public class s5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 f289598d;

    public s5(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var) {
        this.f289598d = q5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var = this.f289598d;
        intent.setClassName(q5Var.f289542o, "com.tencent.mm.plugin.account.ui.RegByFacebookSetPwdUI");
        android.app.Activity activity = q5Var.f289542o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/conversation/InitHelper$11", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/conversation/InitHelper$11", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
