package com.p314xaae8f345.mm.ui;

/* loaded from: classes3.dex */
public class d implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f289850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21337x7f9078ec f289851e;

    public d(com.p314xaae8f345.mm.ui.ActivityC21337x7f9078ec activityC21337x7f9078ec, android.content.Intent intent) {
        this.f289851e = activityC21337x7f9078ec;
        this.f289850d = intent;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.ui.ActivityC21337x7f9078ec activityC21337x7f9078ec = this.f289851e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f289850d);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC21337x7f9078ec, arrayList.toArray(), "com/tencent/mm/ui/AccountExpiredUI$4", "onCancel", "(Landroid/content/DialogInterface;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC21337x7f9078ec.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC21337x7f9078ec, "com/tencent/mm/ui/AccountExpiredUI$4", "onCancel", "(Landroid/content/DialogInterface;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.ui.ActivityC21337x7f9078ec activityC21337x7f9078ec2 = this.f289851e;
        db5.f.i(activityC21337x7f9078ec2);
        activityC21337x7f9078ec2.finish();
    }
}
