package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class c9 implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be f249647d;

    public c9(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be viewOnClickListenerC18000xb62389be) {
        this.f249647d = viewOnClickListenerC18000xb62389be;
    }

    @Override // m34.e
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be viewOnClickListenerC18000xb62389be = this.f249647d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSeekTo", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$7");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SightVideoFullScreenView", "onSeek time " + i17);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be.f248182x0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1300", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            boolean z17 = viewOnClickListenerC18000xb62389be.G;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1300", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            if (z17) {
                viewOnClickListenerC18000xb62389be.m();
            } else {
                viewOnClickListenerC18000xb62389be.y();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be.b(viewOnClickListenerC18000xb62389be).s(i17 * 1000, true);
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
            yj0.a.d(e17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$7", "onSeekTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(e17, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$7", "onSeekTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSeekTo", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$7");
    }

    @Override // m34.e
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be viewOnClickListenerC18000xb62389be = this.f249647d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSeekPre", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$7");
        try {
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be.b(viewOnClickListenerC18000xb62389be) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be.b(viewOnClickListenerC18000xb62389be).r();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be.g(viewOnClickListenerC18000xb62389be, true);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSeekPre", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$7");
    }

    @Override // m34.e
    public void d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSeeking", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$7");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSeeking", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$7");
    }
}
