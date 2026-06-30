package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes.dex */
public class c8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f167995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f167996e;

    public c8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, boolean z17) {
        this.f167996e = n7Var;
        this.f167995d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f167995d;
        int i17 = z17 ? 0 : 4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f167996e;
        android.view.View findViewById = n7Var.O1.r0().findViewById(com.p314xaae8f345.mm.R.id.hqb);
        android.view.View findViewById2 = n7Var.O1.r0().findViewById(com.p314xaae8f345.mm.R.id.ham);
        if (findViewById == null || findViewById2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPageViewWC", "setLiteGameCapsule widget visible(%b) but null", java.lang.Boolean.valueOf(z17));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$22", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$22", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$22", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$22", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
