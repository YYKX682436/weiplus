package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class b5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m5 f283666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283667e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f283668f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentHashMap f283669g;

    public b5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m5 m5Var, java.lang.String str, java.util.concurrent.CountDownLatch countDownLatch, java.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        this.f283666d = m5Var;
        this.f283667e = str;
        this.f283668f = countDownLatch;
        this.f283669g = concurrentHashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m5 m5Var = this.f283666d;
        java.util.concurrent.CountDownLatch countDownLatch = this.f283668f;
        try {
            if (m5Var.f283881s.get()) {
                return;
            }
            android.database.Cursor d17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).d1(m5Var.f284075e, this.f283667e);
            if (d17 != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f283669g;
                while (d17.moveToNext()) {
                    try {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        f9Var.m124849x5361953a(d17.getLong(0));
                        f9Var.m124850x7650bebc(d17.getInt(1));
                        f9Var.e1(d17.getLong(2));
                        f9Var.u1(d17.getString(3));
                        f9Var.d1(d17.getString(4));
                        f9Var.j1(d17.getInt(5));
                        f9Var.p1(d17.getString(6));
                        f9Var.f1(d17.getInt(7));
                        f9Var.r1(d17.getInt(8));
                        concurrentHashMap.put(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), f9Var);
                    } finally {
                    }
                }
                vz5.b.a(d17, null);
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
