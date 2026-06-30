package s74;

/* loaded from: classes4.dex */
public final class g1 implements w64.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f485829a;

    public g1(s74.o2 o2Var) {
        this.f485829a = o2Var;
    }

    @Override // w64.k
    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9) {
        android.widget.Button T;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIStateChange", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$mClickStateChangeListener$1");
        s74.o2 o2Var = this.f485829a;
        if (c17702x544f64e9 == null || o2Var.T() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(o2Var.j(), "adCardActionBtnInfo or mActionBtn is null, can not updateActionBtnTitle");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIStateChange", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$mClickStateChangeListener$1");
            return;
        }
        int i17 = c17702x544f64e9.f244104b;
        if (i17 != 6) {
            if (i17 == 7) {
                java.lang.String str = c17702x544f64e9.Q;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (T = o2Var.T()) != null) {
                    T.setText(str);
                }
            } else if (i17 == 13) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$updateAddFinderBtnInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
                o2Var.a0();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$updateAddFinderBtnInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
            } else if (i17 == 16 && o2Var.i() != null && c17702x544f64e9.f244127m0 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) o2Var.i();
                java.lang.String d17 = l44.d.d(ca4.z0.t0(c17933xe8d1b226 != null ? c17933xe8d1b226.f68891x29d1292e : 0L), c17702x544f64e9.f244127m0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$updateNewOrderUI", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
                o2Var.d0(d17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$updateNewOrderUI", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
            }
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17702x544f64e9.f244132p)) {
            android.widget.Button T2 = o2Var.T();
            if (T2 != null) {
                T2.setTextColor(-7829368);
            }
            android.widget.Button T3 = o2Var.T();
            if (T3 != null) {
                T3.setText(c17702x544f64e9.f244132p);
            }
            android.widget.Button T4 = o2Var.T();
            if (T4 != null) {
                T4.setEnabled(false);
            }
            android.widget.Button T5 = o2Var.T();
            if (T5 != null) {
                s74.q4.f486046a.t(T5, false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIStateChange", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$mClickStateChangeListener$1");
    }
}
