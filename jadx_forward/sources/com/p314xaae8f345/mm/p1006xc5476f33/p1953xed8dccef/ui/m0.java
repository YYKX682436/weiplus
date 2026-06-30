package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class m0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16816x5ca1ddba f234848d;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16816x5ca1ddba activityC16816x5ca1ddba) {
        this.f234848d = activityC16816x5ca1ddba;
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
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductSelectSkuUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        android.util.Pair pair = (android.util.Pair) view.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16816x5ca1ddba activityC16816x5ca1ddba = this.f234848d;
        wq3.j jVar = activityC16816x5ca1ddba.f234757p;
        java.lang.String str = (java.lang.String) pair.first;
        java.lang.String str2 = (java.lang.String) pair.second;
        java.util.Map map = jVar.f530095o;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        if (!hashMap.containsKey(str) || !((java.lang.String) hashMap.get(str)).equals(str2)) {
            hashMap.put(str, str2);
            java.lang.String m17 = wq3.j.m(map);
            jVar.f530087g = m17;
            java.util.Map map2 = jVar.f530094n;
            if (map2 != null) {
                jVar.f530098r = (wq3.l) ((java.util.HashMap) map2).get(m17);
            }
            activityC16816x5ca1ddba.f234759r = r2;
            activityC16816x5ca1ddba.T6();
            yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductSelectSkuUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
        hashMap.remove(str);
        java.lang.String m18 = wq3.j.m(map);
        jVar.f530087g = m18;
        java.util.Map map3 = jVar.f530094n;
        jVar.f530098r = map3 != null ? (wq3.l) ((java.util.HashMap) map3).get(m18) : null;
        jVar.v();
        r2 = jVar.f530098r;
        activityC16816x5ca1ddba.f234759r = r2;
        activityC16816x5ca1ddba.T6();
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductSelectSkuUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
