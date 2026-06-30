package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes9.dex */
public class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b f236681d;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b activityC16960x141f579b) {
        this.f236681d = activityC16960x141f579b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/RechargeUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bt4.f b17 = bt4.f.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b activityC16960x141f579b = this.f236681d;
        java.lang.String str = activityC16960x141f579b.f236668t.f261352d;
        b17.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.util.HashMap hashMap = (java.util.HashMap) b17.f106003a;
            if (hashMap.containsKey(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27) hashMap.get(str);
                if ("1".equals(c19101x8593f27.f261364d)) {
                    c19101x8593f27.f261364d = "2";
                    b17.g();
                }
            }
        }
        activityC16960x141f579b.f236660i.setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
