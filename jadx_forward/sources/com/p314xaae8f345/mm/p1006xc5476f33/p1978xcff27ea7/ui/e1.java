package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes9.dex */
public class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b f236689d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b activityC16960x141f579b) {
        this.f236689d = activityC16960x141f579b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/RechargeUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b activityC16960x141f579b = this.f236689d;
        activityC16960x141f579b.f236665q.m67830x746efb22();
        if (activityC16960x141f579b.f236665q.m67831xc50a7785().f521411d == 2) {
            activityC16960x141f579b.f236665q.m67838x53271888(null);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16960x141f579b.f236665q.m67832xfb85ada3().toString())) {
            activityC16960x141f579b.f236665q.f236619g.showDropDown();
        }
        activityC16960x141f579b.mo26063x7b383410();
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
