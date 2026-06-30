package qw3;

/* loaded from: classes9.dex */
public class j1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17108xc009cad5 f448702d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17108xc009cad5 activityC17108xc009cad5) {
        this.f448702d = activityC17108xc009cad5;
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
        yj0.a.b("com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitSelectBankUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        r45.qd qdVar = (r45.qd) ((fb5.n) adapterView.getAdapter().getItem(i17)).f342431b;
        if (qdVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17098x7cd03d04 c17098x7cd03d04 = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17098x7cd03d04(qdVar);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_bank_card_elem_parcel", c17098x7cd03d04);
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17108xc009cad5 activityC17108xc009cad5 = this.f448702d;
            activityC17108xc009cad5.setResult(-1, intent);
            activityC17108xc009cad5.finish();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BankRemitSelectBankUI", "bankcardelem is null, : %s", java.lang.Integer.valueOf(i17));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitSelectBankUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
