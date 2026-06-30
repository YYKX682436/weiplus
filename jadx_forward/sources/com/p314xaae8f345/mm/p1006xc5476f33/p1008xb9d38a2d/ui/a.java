package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f155234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f155235e;

    public a(android.content.Intent intent, android.app.Activity activity) {
        this.f155234d = intent;
        this.f155235e = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = this.f155234d;
        if (intent != null) {
            android.app.Activity activity = this.f155235e;
            activity.finish();
            android.app.Activity activity2 = this.f155235e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/AccountExpiredUtil$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity2, "com/tencent/mm/plugin/account/ui/AccountExpiredUtil$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            db5.f.a(activity, intent);
        }
    }
}
