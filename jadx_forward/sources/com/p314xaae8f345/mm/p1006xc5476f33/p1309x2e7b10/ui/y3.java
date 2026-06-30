package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes4.dex */
public class y3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f176993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13058x9cebb75a f176994e;

    public y3(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13058x9cebb75a activityC13058x9cebb75a, android.content.Intent intent) {
        this.f176994e = activityC13058x9cebb75a;
        this.f176993d = intent;
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
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardShopUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (i17 == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardShopUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i17 > 0) {
            i17--;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13058x9cebb75a activityC13058x9cebb75a = this.f176994e;
        r45.nu nuVar = (r45.nu) activityC13058x9cebb75a.f176437f.get(i17);
        if (!android.text.TextUtils.isEmpty(nuVar.f463216r) && !android.text.TextUtils.isEmpty(nuVar.f463217s)) {
            lu1.d.d(activityC13058x9cebb75a.f176440i, nuVar.f463216r, nuVar.f463217s, 1052, this.f176993d.getIntExtra("key_from_appbrand_type", 0));
        } else if (!android.text.TextUtils.isEmpty(nuVar.f463215q)) {
            lu1.d.j(activityC13058x9cebb75a, nuVar.f463215q, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, 4, activityC13058x9cebb75a.f176438g.g(), activityC13058x9cebb75a.f176438g.f(), "", nuVar.f463205d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardShopUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
