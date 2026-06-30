package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class vf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11462xec7fb918 f155809d;

    public vf(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11462xec7fb918 activityC11462xec7fb918) {
        this.f155809d = activityC11462xec7fb918;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11462xec7fb918 activityC11462xec7fb918 = this.f155809d;
        activityC11462xec7fb918.f155127q.setEnabled(false);
        activityC11462xec7fb918.f155129s = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = activityC11462xec7fb918.f155128r;
        if (b4Var != null) {
            b4Var.d();
            activityC11462xec7fb918.f155130t = 15;
            activityC11462xec7fb918.f155125o = 0;
            activityC11462xec7fb918.f155128r.c(0L, 1000L);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.tf(activityC11462xec7fb918), true);
            activityC11462xec7fb918.f155128r = b4Var2;
            b4Var2.c(0L, 1000L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
