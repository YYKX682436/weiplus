package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class r8 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19120x14dda335 f262136d;

    public r8(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19120x14dda335 activityC19120x14dda335) {
        this.f262136d = activityC19120x14dda335;
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
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletSelectBankcardUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) adapterView.getItemAtPosition(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19120x14dda335 activityC19120x14dda335 = this.f262136d;
        if (c19091x9511676c != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19120x14dda335 activityC19120x14dda3352 = this.f262136d;
            db5.e1.K(activityC19120x14dda3352, true, activityC19120x14dda3352.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575147kz2, c19091x9511676c.f69233x225aa2b6, c19091x9511676c.f69249x61dbf87), activityC19120x14dda335.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575149kz4), activityC19120x14dda335.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575146kz1), activityC19120x14dda335.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575148kz3), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p8(this, c19091x9511676c), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.q8(this, c19091x9511676c));
        } else {
            activityC19120x14dda335.m83105x7498fe14().putBoolean("key_balance_change_phone_need_confirm_phone", false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19120x14dda335.U6(activityC19120x14dda335, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletSelectBankcardUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
