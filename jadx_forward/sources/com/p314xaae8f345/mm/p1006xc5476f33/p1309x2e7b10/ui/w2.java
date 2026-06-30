package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class w2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13056x715f08fd f176965d;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13056x715f08fd activityC13056x715f08fd) {
        this.f176965d = activityC13056x715f08fd;
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
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardListSelectedUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (view.getAlpha() != 1.0f) {
            yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13056x715f08fd activityC13056x715f08fd = this.f176965d;
        if (activityC13056x715f08fd.f176413n) {
            activityC13056x715f08fd.f176415p.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(!((java.lang.Boolean) activityC13056x715f08fd.f176415p.get(java.lang.Integer.valueOf(i17))).booleanValue()));
        } else {
            for (int i18 = 0; i18 < activityC13056x715f08fd.f176414o.size(); i18++) {
                activityC13056x715f08fd.f176415p.put(java.lang.Integer.valueOf(i18), java.lang.Boolean.FALSE);
            }
            activityC13056x715f08fd.f176415p.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
            activityC13056x715f08fd.f176405J = (xt1.a) activityC13056x715f08fd.f176414o.get(i17);
        }
        activityC13056x715f08fd.f176412m.notifyDataSetChanged();
        for (int i19 = 0; i19 < activityC13056x715f08fd.f176414o.size(); i19++) {
            java.lang.Boolean bool = (java.lang.Boolean) activityC13056x715f08fd.f176415p.get(java.lang.Integer.valueOf(i19));
            if (bool != null && bool.booleanValue()) {
                activityC13056x715f08fd.m78501x43e00957(true);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
