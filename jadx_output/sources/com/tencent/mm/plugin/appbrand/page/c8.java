package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes.dex */
public class c8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f86462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f86463e;

    public c8(com.tencent.mm.plugin.appbrand.page.n7 n7Var, boolean z17) {
        this.f86463e = n7Var;
        this.f86462d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f86462d;
        int i17 = z17 ? 0 : 4;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f86463e;
        android.view.View findViewById = n7Var.O1.r0().findViewById(com.tencent.mm.R.id.hqb);
        android.view.View findViewById2 = n7Var.O1.r0().findViewById(com.tencent.mm.R.id.ham);
        if (findViewById == null || findViewById2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageViewWC", "setLiteGameCapsule widget visible(%b) but null", java.lang.Boolean.valueOf(z17));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
