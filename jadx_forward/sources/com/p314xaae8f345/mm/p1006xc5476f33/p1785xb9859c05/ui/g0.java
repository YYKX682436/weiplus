package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class g0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 f224364d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var) {
        this.f224364d = m0Var;
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
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var = this.f224364d;
        if (m0Var.f224463b.p(i17)) {
            yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (adapterView instanceof android.widget.ListView) {
            s83.l lVar = (s83.l) m0Var.f224463b.f224413q.get(i17 - ((android.widget.ListView) adapterView).getHeaderViewsCount());
            if (lVar == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            s83.c J0 = lVar.f68172xcebea32a > 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.wi().J0(lVar.f68172xcebea32a) : null;
            android.content.Intent intent = new android.content.Intent(m0Var.f224465d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16151x42cade4d.class);
            if (J0 != null) {
                intent.putExtra("IPCallProfileUI_contactid", J0.f67827x821cd056);
                intent.putExtra("IPCallProfileUI_systemUsername", J0.f67829x5c31173f);
                intent.putExtra("IPCallProfileUI_wechatUsername", J0.f67830xf13c6c01);
            } else {
                intent.putExtra("IPCallProfileUI_phonenumber", lVar.f68176x5b3f2672);
            }
            intent.putExtra("IPCallProfileUI_isNeedShowRecord", true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16128x168466e3 activityC16128x168466e3 = m0Var.f224465d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC16128x168466e3, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$4", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16128x168466e3.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC16128x168466e3, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$4", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
