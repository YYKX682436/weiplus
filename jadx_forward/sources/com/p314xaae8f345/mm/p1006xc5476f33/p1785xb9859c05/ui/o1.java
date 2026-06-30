package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes15.dex */
public class o1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16133x8935f7ee f224504d;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16133x8935f7ee activityC16133x8935f7ee) {
        this.f224504d = activityC16133x8935f7ee;
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
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallCountryCodeSelectUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16133x8935f7ee activityC16133x8935f7ee = this.f224504d;
        if (i17 >= activityC16133x8935f7ee.f224111d.getHeaderViewsCount()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a) activityC16133x8935f7ee.f224112e.getItem(i17 - activityC16133x8935f7ee.f224111d.getHeaderViewsCount());
            intent.putExtra("country_name", aVar.f224274a);
            intent.putExtra("couttry_code", aVar.f224275b);
            activityC16133x8935f7ee.setResult(100, intent);
        }
        activityC16133x8935f7ee.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallCountryCodeSelectUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
