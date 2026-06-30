package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes.dex */
public class r6 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19117x82d08fb8 f262134d;

    public r6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19117x82d08fb8 activityC19117x82d08fb8) {
        this.f262134d = activityC19117x82d08fb8;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19117x82d08fb8 activityC19117x82d08fb8 = this.f262134d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view.getId() == com.p314xaae8f345.mm.R.id.pdg || view.getId() == com.p314xaae8f345.mm.R.id.pe9) {
            try {
                java.lang.String str = (java.lang.String) view.getTag();
                dp.a.m125853x26a183b(activityC19117x82d08fb8, com.p314xaae8f345.mm.R.C30867xcad56011.f575105ks2, 0).show();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(activityC19117x82d08fb8.mo55332x76847179(), str, str, null);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletOrderInfoOldUI", e17, "", new java.lang.Object[0]);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
