package fg4;

/* loaded from: classes8.dex */
public class n implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.ActivityC18532x1d9906e0 f344016d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.ActivityC18532x1d9906e0 activityC18532x1d9906e0) {
        this.f344016d = activityC18532x1d9906e0;
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
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.ActivityC18532x1d9906e0 activityC18532x1d9906e0 = this.f344016d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18533xf1098150 c18533xf1098150 = activityC18532x1d9906e0.f253941e;
        if (c18533xf1098150 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ServiceAppUI", "wx onItemClick wxServicePref null");
            yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = (i17 < 0 || i17 >= c18533xf1098150.M.getCount()) ? null : (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) c18533xf1098150.M.getItem(i17);
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ServiceAppUI", "wx onItemClick app is null");
            yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServiceAppUI", "onItemClick, jumpType[%d], package[%s], appid[%s]", java.lang.Integer.valueOf(mVar.f319924x1), mVar.f67386xa1e9e82c, mVar.f67370x28d45f97);
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.ActivityC18532x1d9906e0.V6(activityC18532x1d9906e0, mVar);
            yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }
}
