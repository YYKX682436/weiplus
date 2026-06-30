package s74;

/* loaded from: classes4.dex */
public final class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f485923d;

    public k2(s74.o2 o2Var) {
        this.f485923d = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e92;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$updateActionBtnText$1");
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        if (Bi != null) {
            s74.o2 o2Var = this.f485923d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.AdCardActionBtnInfo U = o2Var.U();
            java.lang.String str = null;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((U == null || (c17702x544f64e92 = U.f38287xf7a0a3ac) == null) ? null : c17702x544f64e92.M)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.AdCardActionBtnInfo U2 = o2Var.U();
                if (U2 != null && (c17702x544f64e9 = U2.f38287xf7a0a3ac) != null) {
                    str = c17702x544f64e9.M;
                }
                if (str == null) {
                    str = "";
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new s74.j2(Bi.n(str, true), o2Var));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$updateActionBtnText$1");
    }
}
