package com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui;

/* loaded from: classes.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18769x42826674 f256860d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18769x42826674 activityC18769x42826674) {
        this.f256860d = activityC18769x42826674;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean E = c01.d9.b().E();
        com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18769x42826674 activityC18769x42826674 = this.f256860d;
        if (!E) {
            db5.t7.k(activityC18769x42826674, null);
            yj0.a.h(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (c01.d9.e().n() == 0) {
            dp.a.m125854x26a183b(activityC18769x42826674, activityC18769x42826674.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu), 0).show();
            yj0.a.h(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent(activityC18769x42826674, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18771x75e3b580.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18769x42826674 activityC18769x428266742 = this.f256860d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC18769x428266742, arrayList2.toArray(), "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC18769x428266742.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC18769x428266742, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC18769x42826674.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
