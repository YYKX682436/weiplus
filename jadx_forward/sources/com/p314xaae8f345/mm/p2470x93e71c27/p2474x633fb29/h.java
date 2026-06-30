package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes8.dex */
public final class h implements zq1.v {

    /* renamed from: a, reason: collision with root package name */
    public final int f270858a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f270859b;

    public h(int i17) {
        this.f270858a = i17;
    }

    public void a(java.lang.String str) {
        if (str != null && this.f270859b == null) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
            int p17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.v3.p(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270732c, "refreshInterval-".concat(str), 0, 2, null);
            if (p17 < 10) {
                p17 = 10;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(str.concat("-live-UpdateTimer"), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g(this, str), true);
            this.f270859b = b4Var;
            b4Var.c(0L, (p17 * 1000) / 2);
        }
    }

    public void b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f270859b;
        if (b4Var != null) {
            if (b4Var != null) {
                b4Var.d();
            }
            this.f270859b = null;
        }
    }
}
