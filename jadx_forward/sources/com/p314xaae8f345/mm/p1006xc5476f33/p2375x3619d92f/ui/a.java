package com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui;

/* loaded from: classes9.dex */
public class a implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b f262570d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b activityC19159x79c8ee9b) {
        this.f262570d = activityC19159x79c8ee9b;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_ecard/ui/WalletECardBindCardListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletECardBindCardListUI", "position: %d", java.lang.Integer.valueOf(i17));
        int itemViewType = adapterView.getAdapter().getItemViewType(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b activityC19159x79c8ee9b = this.f262570d;
        java.util.Objects.requireNonNull(activityC19159x79c8ee9b.f262546g);
        if (itemViewType == 1) {
            int i18 = activityC19159x79c8ee9b.f262547h;
            activityC19159x79c8ee9b.U6();
        } else {
            r45.od odVar = (r45.od) adapterView.getAdapter().getItem(i17);
            if (odVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletECardBindCardListUI", "empty item");
                yj0.a.h(this, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardBindCardListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            activityC19159x79c8ee9b.m83106x57340563().d(odVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardBindCardListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
