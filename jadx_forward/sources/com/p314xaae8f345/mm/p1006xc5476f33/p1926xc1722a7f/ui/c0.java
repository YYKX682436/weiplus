package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes4.dex */
public class c0 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a f233662a;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a) {
        this.f233662a = activityC16724xf2604f0a;
    }

    @Override // d85.k0
    /* renamed from: onOp */
    public void mo14305x341c20(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a = this.f233662a;
        if (booleanValue) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a.D;
            activityC16724xf2604f0a.U6();
            return;
        }
        android.view.View findViewById = activityC16724xf2604f0a.findViewById(com.p314xaae8f345.mm.R.id.k5p);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$2", "onOp", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$2", "onOp", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC16724xf2604f0a.f233622f.setVisibility(8);
    }
}
