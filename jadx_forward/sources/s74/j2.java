package s74;

/* loaded from: classes4.dex */
public final class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f485897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f485898e;

    public j2(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, s74.o2 o2Var) {
        this.f485897d = z3Var;
        this.f485898e = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$updateActionBtnText$1$1");
        s74.o2 o2Var = this.f485898e;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f485897d;
        if (z3Var == null || !z3Var.r2()) {
            android.widget.Button T = o2Var.T();
            if (T != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.AdCardActionBtnInfo U = o2Var.U();
                T.setText(U != null ? U.f38286x7d0c4d5c : null);
            }
        } else {
            android.widget.Button T2 = o2Var.T();
            if (T2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.AdCardActionBtnInfo U2 = o2Var.U();
                if (U2 != null && (c17702x544f64e9 = U2.f38287xf7a0a3ac) != null) {
                    r2 = c17702x544f64e9.Q;
                }
                T2.setText(r2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$updateActionBtnText$1$1");
    }
}
