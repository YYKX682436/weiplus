package com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4;

/* renamed from: com.tencent.mm.ui.contact.address.BaseAddressUIFragment */
/* loaded from: classes11.dex */
public abstract class AbstractC22341xb20d9d07 extends com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f288133n = 0;

    public void B() {
    }

    public void V() {
    }

    public void e0() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment
    public void l0(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment
    public void m0() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment
    public void n0() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: noActionBar */
    public boolean mo48374x69604d3c() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment
    public void o0() {
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        x0();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment
    public void p0() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment
    public void q0() {
    }

    public void r() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment
    public void r0() {
    }

    public abstract java.lang.String s0();

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: supportNavigationSwipeBack */
    public boolean mo25471x430f73e() {
        return false;
    }

    public final int t0() {
        int i17;
        int a17 = com.p314xaae8f345.mm.ui.bl.a(mo7438x76847179());
        int i18 = com.p314xaae8f345.mm.ui.bl.i(mo7438x76847179(), -1);
        android.view.View findViewById = m7474xfb86a31b().getRootView().findViewById(com.p314xaae8f345.mm.R.id.f563968ei);
        if (!com.p314xaae8f345.mm.ui.bk.Y()) {
            int i19 = android.os.Build.VERSION.SDK_INT;
            boolean isInMultiWindowMode = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b() != null ? com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b().isInMultiWindowMode() : false;
            if (!isInMultiWindowMode) {
                android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
                if (((d17 != null ? d17.getBoolean("Main_need_read_top_margin", false) : false) || i19 >= 31) && (i17 = d17.getInt("Main_top_marign", -1)) >= 0) {
                    return a17 + i17;
                }
            }
            if (isInMultiWindowMode) {
                i18 = findViewById != null ? findViewById.getTop() : 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s0(), "getTopHeight statusHeight:%s, isInMultiWindowMode:%s", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(isInMultiWindowMode));
        } else {
            if (findViewById == null) {
                return a17 + i18;
            }
            i18 = findViewById.getTop();
        }
        return a17 + i18;
    }

    public abstract void u0();

    public abstract void w0(boolean z17);

    public void x0() {
        android.view.View findViewById = m7474xfb86a31b().getRootView().findViewById(com.p314xaae8f345.mm.R.id.huj);
        int a17 = com.p314xaae8f345.mm.ui.bl.a(mo7438x76847179());
        int i17 = com.p314xaae8f345.mm.ui.bl.i(mo7438x76847179(), -1);
        tf5.h hVar = new tf5.h(this, findViewById);
        if (i17 <= 0) {
            m7474xfb86a31b().post(hVar);
            return;
        }
        int t07 = t0();
        if (com.p314xaae8f345.mm.ui.a4.f278650a.h(mo78409x676b27cd())) {
            m7474xfb86a31b().setPadding(0, t07, 0, 0);
        } else {
            m7474xfb86a31b().setPadding(0, t07, 0, findViewById.getHeight());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s0(), "[trySetParentViewPadding] actionBarHeight:%s actionBarHeight:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17));
        m7474xfb86a31b().postDelayed(hVar, 100L);
    }
}
