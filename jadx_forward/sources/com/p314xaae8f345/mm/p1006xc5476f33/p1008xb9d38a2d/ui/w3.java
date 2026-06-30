package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11408xe972dee3 f155816d;

    public w3(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11408xe972dee3 activityC11408xe972dee3) {
        this.f155816d = activityC11408xe972dee3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11408xe972dee3 activityC11408xe972dee3 = this.f155816d;
        activityC11408xe972dee3.f154845x.setEnabled(false);
        activityC11408xe972dee3.B = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = activityC11408xe972dee3.A;
        if (b4Var != null) {
            b4Var.d();
            activityC11408xe972dee3.C = 15;
            activityC11408xe972dee3.f154843v = 0;
            activityC11408xe972dee3.A.c(0L, 1000L);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t3(activityC11408xe972dee3), true);
            activityC11408xe972dee3.A = b4Var2;
            b4Var2.c(0L, 1000L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
