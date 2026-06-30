package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public class h5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf f155435d;

    public h5(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf activityC11413x78c85cdf) {
        this.f155435d = activityC11413x78c85cdf;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginHistoryUI$34", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf activityC11413x78c85cdf = this.f155435d;
        if (activityC11413x78c85cdf.f154860f.f154727x) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$34", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        activityC11413x78c85cdf.mo48674x36654fab();
        if (fp.h.c(31)) {
            android.view.View decorView = activityC11413x78c85cdf.getWindow().getDecorView();
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.b1.a(decorView).f(8)) {
                activityC11413x78c85cdf.U = true;
                yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$34", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        activityC11413x78c85cdf.f7(((db5.h4) ((java.util.ArrayList) activityC11413x78c85cdf.V).get(0)).f309899g);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$34", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
