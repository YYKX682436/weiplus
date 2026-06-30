package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class ch implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f155317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 f155318e;

    public ch(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b0, java.lang.String[] strArr) {
        this.f155318e = activityC11466x7d774b0;
        this.f155317d = strArr;
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
        yj0.a.b("com/tencent/mm/plugin/account/ui/RegSetInfoUI$22", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b0 = this.f155318e;
        db5.d5 d5Var = activityC11466x7d774b0.I;
        if (d5Var != null) {
            d5Var.dismiss();
            activityC11466x7d774b0.I = null;
        }
        activityC11466x7d774b0.f155163e.setText(this.f155317d[i17]);
        activityC11466x7d774b0.f155163e.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.bh(this), 50L);
        activityC11466x7d774b0.f155173r.setText(activityC11466x7d774b0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxy));
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$22", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
