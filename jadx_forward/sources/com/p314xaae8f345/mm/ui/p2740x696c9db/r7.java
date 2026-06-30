package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public final class r7 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7 f292203d;

    public r7(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7 activityC22515xdd3b1ad7) {
        this.f292203d = activityC22515xdd3b1ad7;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/NewCountryCodeUI$initItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7 activityC22515xdd3b1ad7 = this.f292203d;
        android.widget.ListView listView = activityC22515xdd3b1ad7.f291646d;
        if (i17 >= (listView != null ? listView.getHeaderViewsCount() : 0)) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.m7 m7Var = activityC22515xdd3b1ad7.f291647e;
            if (m7Var != null) {
                android.widget.ListView listView2 = activityC22515xdd3b1ad7.f291646d;
                obj = m7Var.getItem(i17 - (listView2 != null ? listView2.getHeaderViewsCount() : 0));
            } else {
                obj = null;
            }
            u11.a aVar = obj instanceof u11.a ? (u11.a) obj : null;
            if (aVar != null) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("country_name", aVar.f505262c);
                intent.putExtra("couttry_code", aVar.f505261b);
                intent.putExtra("iso_code", aVar.f505260a);
                activityC22515xdd3b1ad7.setResult(100, intent);
            }
            activityC22515xdd3b1ad7.finish();
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/NewCountryCodeUI$initItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
