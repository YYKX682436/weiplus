package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes15.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f270861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f270862f;

    public h0(java.lang.String str, int i17, long j17) {
        this.f270860d = str;
        this.f270861e = i17;
        this.f270862f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.f270874b;
        java.lang.String str = this.f270860d;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e0 e0Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e0) hashMap.get(str);
        if (e0Var == null) {
            e0Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e0(str);
            hashMap.put(str, e0Var);
        }
        java.util.HashMap hashMap2 = e0Var.f270818f;
        int i17 = this.f270861e;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.d0 d0Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.d0) hashMap2.get(java.lang.Integer.valueOf(i17));
        if (d0Var == null) {
            d0Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.d0(e0Var.f270817e, i17);
            hashMap2.put(java.lang.Integer.valueOf(i17), d0Var);
        }
        if (d0Var.f270803a == 0) {
            d0Var.f270803a = 1;
        }
        long j17 = this.f270862f;
        if (i17 == 1 || i17 == 2) {
            d0Var.a(j17);
        } else {
            d0Var.a(j17);
        }
    }
}
