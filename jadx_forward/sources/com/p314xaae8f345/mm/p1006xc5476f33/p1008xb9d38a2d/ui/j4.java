package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class j4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f155480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf f155481e;

    public j4(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf activityC11413x78c85cdf, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f155481e = activityC11413x78c85cdf;
        this.f155480d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginHistoryUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf activityC11413x78c85cdf = this.f155481e;
        if (activityC11413x78c85cdf.f154860f.f154727x) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        activityC11413x78c85cdf.mo48674x36654fab();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f155480d;
        k0Var.v();
        v61.d.h("login_other_account", 1);
        db5.g4 g4Var = k0Var.L;
        if (g4Var.findItem(7003) != null) {
            v61.d.h("register_account", 1);
        }
        if (g4Var.findItem(7011) != null) {
            v61.d.h("export_chat_history_login", 1);
        }
        if (g4Var.findItem(7004) != null) {
            v61.d.h("security_center_login", 1);
        }
        if (g4Var.findItem(7012) != null) {
            v61.d.h("frozen_account_login", 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
