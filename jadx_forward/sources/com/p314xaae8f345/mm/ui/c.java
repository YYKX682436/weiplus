package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f279598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21337x7f9078ec f279599e;

    public c(com.p314xaae8f345.mm.ui.ActivityC21337x7f9078ec activityC21337x7f9078ec, android.content.Intent intent) {
        this.f279599e = activityC21337x7f9078ec;
        this.f279598d = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.ui.ActivityC21337x7f9078ec activityC21337x7f9078ec = this.f279599e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f279598d);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC21337x7f9078ec, arrayList.toArray(), "com/tencent/mm/ui/AccountExpiredUI$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC21337x7f9078ec.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC21337x7f9078ec, "com/tencent/mm/ui/AccountExpiredUI$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.ui.ActivityC21337x7f9078ec activityC21337x7f9078ec2 = this.f279599e;
        db5.f.i(activityC21337x7f9078ec2);
        activityC21337x7f9078ec2.finish();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5180xccb1ebb1 c5180xccb1ebb1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5180xccb1ebb1();
        c5180xccb1ebb1.f135526g.f88523a = true;
        c5180xccb1ebb1.e();
    }
}
