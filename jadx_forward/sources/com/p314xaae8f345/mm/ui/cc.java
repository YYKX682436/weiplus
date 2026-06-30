package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public class cc implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f279622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f279623e;

    public cc(android.content.Intent intent, android.app.Activity activity) {
        this.f279622d = intent;
        this.f279623e = activity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 39L, 1L, true);
        android.content.Intent intent = this.f279622d;
        if (intent != null) {
            android.app.Activity activity = this.f279623e;
            activity.finish();
            android.app.Activity activity2 = this.f279623e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/ui/MMErrorProcessor$10", "onCancel", "(Landroid/content/DialogInterface;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity2, "com/tencent/mm/ui/MMErrorProcessor$10", "onCancel", "(Landroid/content/DialogInterface;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            db5.f.a(activity, intent);
        }
    }
}
