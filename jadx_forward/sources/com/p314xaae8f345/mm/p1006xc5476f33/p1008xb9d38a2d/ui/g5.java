package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class g5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f155409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf f155410e;

    public g5(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf activityC11413x78c85cdf, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f155410e = activityC11413x78c85cdf;
        this.f155409d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginHistoryUI$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf activityC11413x78c85cdf = this.f155410e;
        if (activityC11413x78c85cdf.f154860f.f154727x) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        activityC11413x78c85cdf.mo48674x36654fab();
        if (activityC11413x78c85cdf.e7()) {
            q61.j.g(1, 0);
        }
        this.f155409d.v();
        v61.d.g("other_verify_login", 1);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
