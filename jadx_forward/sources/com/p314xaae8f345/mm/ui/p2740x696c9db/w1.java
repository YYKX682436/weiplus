package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class w1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22498xb11fdc57 f292397d;

    public w1(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22498xb11fdc57 activityC22498xb11fdc57) {
        this.f292397d = activityC22498xb11fdc57;
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
        yj0.a.b("com/tencent/mm/ui/tools/CountryCodeUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22498xb11fdc57 activityC22498xb11fdc57 = this.f292397d;
        if (i17 >= activityC22498xb11fdc57.f291518d.getHeaderViewsCount()) {
            u11.a aVar = (u11.a) activityC22498xb11fdc57.f291519e.getItem(i17 - activityC22498xb11fdc57.f291518d.getHeaderViewsCount());
            intent.putExtra("country_name", aVar.f505262c);
            intent.putExtra("couttry_code", aVar.f505261b);
            intent.putExtra("iso_code", aVar.f505260a);
            activityC22498xb11fdc57.setResult(100, intent);
        }
        activityC22498xb11fdc57.finish();
        yj0.a.h(this, "com/tencent/mm/ui/tools/CountryCodeUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
