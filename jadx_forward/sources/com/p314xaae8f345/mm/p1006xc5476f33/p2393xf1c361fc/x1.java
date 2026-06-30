package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f263255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1 f263256e;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1 w1Var, boolean z17) {
        this.f263256e = w1Var;
        this.f263255d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f263256e.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.PluginWebSearch", "only work in main process");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.PluginWebSearch", "checkWebSearchTemplate %b", java.lang.Boolean.valueOf(this.f263255d));
        int[] iArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int i17 = 0; i17 < 12; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(iArr[i17]).g();
        }
    }
}
