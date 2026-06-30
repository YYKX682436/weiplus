package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public class ec implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f289930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f289931f;

    public ec(java.lang.String str, android.app.Activity activity, android.content.Intent intent) {
        this.f289929d = str;
        this.f289930e = activity;
        this.f289931f = intent;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(322L, 24L, 1L, true);
        java.lang.String str = this.f289929d;
        g0Var.d(11098, 4024, java.lang.String.format("%b|%s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)), str));
        android.app.Activity activity = this.f289930e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.content.Intent intent = this.f289931f;
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/MMErrorProcessor$4", "onCancel", "(Landroid/content/DialogInterface;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/MMErrorProcessor$4", "onCancel", "(Landroid/content/DialogInterface;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.a(this.f289930e, intent);
    }
}
