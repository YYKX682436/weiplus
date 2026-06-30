package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class z8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be f253216d;

    public z8(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be viewOnClickListenerC18000xb62389be) {
        this.f253216d = viewOnClickListenerC18000xb62389be;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be viewOnClickListenerC18000xb62389be = this.f253216d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$4");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SightVideoFullScreenView", "sightVideoStartPlay");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be.b(viewOnClickListenerC18000xb62389be).m();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be.d(viewOnClickListenerC18000xb62389be, true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1700", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            java.lang.Runnable runnable = viewOnClickListenerC18000xb62389be.f248194p0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1700", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
            android.view.View e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be.e(viewOnClickListenerC18000xb62389be);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(e17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(e17, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewOnClickListenerC18000xb62389be.z();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$4");
    }
}
