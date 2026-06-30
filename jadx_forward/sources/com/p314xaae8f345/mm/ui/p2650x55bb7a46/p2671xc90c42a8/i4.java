package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f283795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m4 f283797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f283798g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f283799h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.a3 f283800i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f283801m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f283802n;

    public i4(int i17, int i18, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m4 m4Var, java.util.HashMap hashMap, java.util.List list, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, java.util.List list2, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f283795d = i17;
        this.f283796e = i18;
        this.f283797f = m4Var;
        this.f283798g = hashMap;
        this.f283799h = list;
        this.f283800i = a3Var;
        this.f283801m = list2;
        this.f283802n = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.d4 p17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m4 m4Var = this.f283797f;
        java.util.concurrent.CountDownLatch countDownLatch = this.f283802n;
        try {
            for (int i17 = this.f283795d; i17 < this.f283796e && !m4Var.f283879t.get(); i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f283798g.get(this.f283799h.get(i17));
                if (f9Var != null && (p17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m4.p(m4Var, f9Var, this.f283800i)) != null) {
                    this.f283801m.add(p17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
