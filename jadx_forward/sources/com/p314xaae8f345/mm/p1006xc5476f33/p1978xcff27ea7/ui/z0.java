package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes9.dex */
public class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b f236790d;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b activityC16960x141f579b) {
        this.f236790d = activityC16960x141f579b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/RechargeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b.G;
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b activityC16960x141f579b = this.f236790d;
        if (activityC16960x141f579b.T6()) {
            if (activityC16960x141f579b.f236665q.m67831xc50a7785().f521411d == 0) {
                db5.e1.A(activityC16960x141f579b, activityC16960x141f579b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gsn, activityC16960x141f579b.f236665q.m67832xfb85ada3().toString()), "", activityC16960x141f579b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572141zu), activityC16960x141f579b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572036wx), new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p0(activityC16960x141f579b), null);
                z17 = false;
            } else {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b74 = activityC16960x141f579b.f236670v;
                activityC16960x141f579b.U6(new vs3.h(c16957xf1da7b74.f236604e, c16957xf1da7b74.f236603d, c16957xf1da7b74.f236605f, activityC16960x141f579b.X6()));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
