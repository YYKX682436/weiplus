package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes9.dex */
public class t0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b f236758d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b activityC16960x141f579b) {
        this.f236758d = activityC16960x141f579b;
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
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/RechargeUI$14", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b activityC16960x141f579b = this.f236758d;
        activityC16960x141f579b.dismissDialog(1);
        activityC16960x141f579b.f236670v = (com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74) activityC16960x141f579b.f236664p.f236719d.get(i17);
        activityC16960x141f579b.f236664p.a(i17);
        activityC16960x141f579b.f236664p.notifyDataSetChanged();
        java.util.Map map = activityC16960x141f579b.A;
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b74 = activityC16960x141f579b.f236670v;
        ((java.util.HashMap) map).remove(activityC16960x141f579b.V6(c16957xf1da7b74.f236614r, c16957xf1da7b74.f236605f, activityC16960x141f579b.W6()));
        activityC16960x141f579b.T6();
        activityC16960x141f579b.c7();
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$14", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
