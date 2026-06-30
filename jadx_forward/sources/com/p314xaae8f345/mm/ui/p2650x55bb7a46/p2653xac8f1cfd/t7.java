package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class t7 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ig {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f281502a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public long f281503b = 0;

    public java.util.List a(java.lang.String str) {
        synchronized (this.f281502a) {
            this.f281503b = 0L;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str);
        int d17 = p17 != null ? p17.d1() : 0;
        if (d17 < 1) {
            return null;
        }
        java.util.List y57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().y5(str, d17);
        if (y57 != null && !y57.isEmpty()) {
            synchronized (this.f281502a) {
                if (!y57.isEmpty()) {
                    this.f281503b = ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) y57.get(y57.size() - 1)).mo78012x3fdd41df();
                    y57.size();
                }
            }
        }
        return y57;
    }
}
