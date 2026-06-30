package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class c3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2 f261704d;

    public c3(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2 activityC19109xac2e2ee2) {
        this.f261704d = activityC19109xac2e2ee2;
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
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2 activityC19109xac2e2ee2 = this.f261704d;
        activityC19109xac2e2ee2.dismissDialog(1);
        int intValue = ((java.lang.Integer) activityC19109xac2e2ee2.f261493z.a().get(i17)).intValue();
        if (activityC19109xac2e2ee2.f261473J != intValue) {
            activityC19109xac2e2ee2.f261473J = intValue;
            activityC19109xac2e2ee2.f261480m.m83213x765074af(((android.widget.CheckedTextView) view).getText().toString());
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = activityC19109xac2e2ee2.f261481n;
            int i18 = activityC19109xac2e2ee2.f261473J;
            activityC19109xac2e2ee2.getClass();
            rp5.b m83177x57f7af4d = viewOnFocusChangeListenerC22907xe18534c2.m83177x57f7af4d();
            if (m83177x57f7af4d instanceof qp5.n) {
                ((qp5.n) m83177x57f7af4d).f(i18);
            }
            activityC19109xac2e2ee2.f261481n.d();
            activityC19109xac2e2ee2.X6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
