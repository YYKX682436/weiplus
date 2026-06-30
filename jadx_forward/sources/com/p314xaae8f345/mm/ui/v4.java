package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class v4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f292636d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21357x5e7365bb f292638f;

    public v4(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb, android.view.View view) {
        this.f292638f = c21357x5e7365bb;
        this.f292637e = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = this.f292638f;
        if (c21357x5e7365bb.m7474xfb86a31b() == null) {
            return;
        }
        int a17 = com.p314xaae8f345.mm.ui.bl.a(c21357x5e7365bb.mo7438x76847179());
        int i17 = com.p314xaae8f345.mm.ui.bl.i(c21357x5e7365bb.mo7438x76847179(), -1);
        if (i17 <= 0) {
            if (this.f292636d < 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] try getStatusHeight again!");
                c21357x5e7365bb.m7474xfb86a31b().post(this);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] try getStatusHeight finally!");
            }
            this.f292636d++;
        } else {
            java.util.List list = com.p314xaae8f345.mm.ui.C21357x5e7365bb.R1;
            int K0 = c21357x5e7365bb.K0();
            int height = this.f292637e.getHeight();
            if (K0 != c21357x5e7365bb.m7474xfb86a31b().getPaddingTop()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] now:%s old:%s", java.lang.Integer.valueOf(K0), java.lang.Integer.valueOf(c21357x5e7365bb.m7474xfb86a31b().getPaddingTop()));
                if (com.p314xaae8f345.mm.ui.a4.f278650a.h(c21357x5e7365bb.mo78409x676b27cd())) {
                    c21357x5e7365bb.m7474xfb86a31b().setPadding(0, K0, 0, 0);
                } else {
                    c21357x5e7365bb.m7474xfb86a31b().setPadding(0, K0, 0, height);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] has try more once! it's right! statusHeight:%s actionBarHeight:%s tabBarHeight:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17), java.lang.Integer.valueOf(height));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] tryCount:%s statusHeight:%s actionBarHeight:%s", java.lang.Integer.valueOf(this.f292636d), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17));
    }
}
