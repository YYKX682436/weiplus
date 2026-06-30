package com.p314xaae8f345.mm.ui;

/* loaded from: classes3.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f278733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21337x7f9078ec f278734e;

    public b(com.p314xaae8f345.mm.ui.ActivityC21337x7f9078ec activityC21337x7f9078ec, android.content.Intent intent) {
        this.f278734e = activityC21337x7f9078ec;
        this.f278733d = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.ui.ActivityC21337x7f9078ec activityC21337x7f9078ec = this.f278734e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f278733d);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC21337x7f9078ec, arrayList.toArray(), "com/tencent/mm/ui/AccountExpiredUI$2", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC21337x7f9078ec.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC21337x7f9078ec, "com/tencent/mm/ui/AccountExpiredUI$2", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.ui.ActivityC21337x7f9078ec activityC21337x7f9078ec2 = this.f278734e;
        db5.f.i(activityC21337x7f9078ec2);
        activityC21337x7f9078ec2.finish();
    }
}
