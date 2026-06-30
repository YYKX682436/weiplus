package e05;

/* loaded from: classes9.dex */
public class l implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ViewOnClickListenerC19553xcfaf7ef f327716d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ViewOnClickListenerC19553xcfaf7ef viewOnClickListenerC19553xcfaf7ef) {
        this.f327716d = viewOnClickListenerC19553xcfaf7ef;
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
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ViewOnClickListenerC19553xcfaf7ef viewOnClickListenerC19553xcfaf7ef = this.f327716d;
        viewOnClickListenerC19553xcfaf7ef.dismissDialog(2);
        if (viewOnClickListenerC19553xcfaf7ef.f270063m) {
            if (i17 == 0) {
                viewOnClickListenerC19553xcfaf7ef.f270059f.f307144c = "Y";
            } else {
                viewOnClickListenerC19553xcfaf7ef.f270059f.f307144c = "N";
            }
        } else if (i17 == 0) {
            viewOnClickListenerC19553xcfaf7ef.f270060g.f307144c = "Y";
        } else {
            viewOnClickListenerC19553xcfaf7ef.f270060g.f307144c = "N";
        }
        viewOnClickListenerC19553xcfaf7ef.V6();
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
