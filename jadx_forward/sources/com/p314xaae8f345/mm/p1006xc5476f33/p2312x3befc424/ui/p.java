package com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui;

/* loaded from: classes.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18770xd1a110d4 f256866d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18770xd1a110d4 activityC18770xd1a110d4) {
        this.f256866d = activityC18770xd1a110d4;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18770xd1a110d4.f256837i)) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18770xd1a110d4.f256837i);
            if (r6Var.m()) {
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.f(this.f256866d.mo55332x76847179(), intent, r6Var, "text/plain", false);
                intent.addFlags(268435456);
                com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18770xd1a110d4 activityC18770xd1a110d4 = this.f256866d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(activityC18770xd1a110d4, arrayList2.toArray(), "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC18770xd1a110d4.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(activityC18770xd1a110d4, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
