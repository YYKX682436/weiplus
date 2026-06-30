package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes12.dex */
public class t0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.o6 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f264643g = {l75.n0.m145250x3fdc6f77(dm.t6.m125512x3593deb(dm.t6.class), "JsLogBlockList")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f264644d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.p6 f264645e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.p6(this, gm0.j1.e().a(), 100, 20, 300000, 1000);

    /* renamed from: f, reason: collision with root package name */
    public long f264646f;

    public t0(l75.k0 k0Var) {
        this.f264644d = k0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.o6
    public boolean B() {
        l75.k0 k0Var = this.f264644d;
        if (k0Var.G()) {
            return false;
        }
        long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        this.f264646f = F;
        return F > 0;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.o6
    public void d0(com.p314xaae8f345.mm.sdk.p2603x2137b148.p6 p6Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.n6 n6Var) {
        int i17 = n6Var.f274405a;
        l75.k0 k0Var = this.f264644d;
        if (i17 == 1) {
            android.content.ContentValues contentValues = new android.content.ContentValues(2);
            contentValues.put("logId", (java.lang.Integer) n6Var.f274406b);
            contentValues.put("liftTime", (java.lang.Long) n6Var.f274407c);
            k0Var.m("JsLogBlockList", "logId", contentValues);
            return;
        }
        if (i17 != 2) {
            return;
        }
        k0Var.mo70514xb06685ab("JsLogBlockList", "logId=" + n6Var.f274406b, null);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.o6
    public void u() {
        long j17 = this.f264646f;
        if (j17 > 0) {
            this.f264644d.w(java.lang.Long.valueOf(j17));
        }
    }
}
