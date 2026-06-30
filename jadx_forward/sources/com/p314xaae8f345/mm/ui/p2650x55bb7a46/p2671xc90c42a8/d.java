package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f283688e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f283689f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n f283690g;

    public d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n nVar, java.lang.String str, java.util.Map map, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f283690g = nVar;
        this.f283687d = str;
        this.f283688e = map;
        this.f283689f = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n nVar = this.f283690g;
        java.util.concurrent.CountDownLatch countDownLatch = this.f283689f;
        try {
            if (nVar.f283885s.get()) {
                return;
            }
            android.database.Cursor d17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).d1(nVar.f284075e, this.f283687d);
            if (d17 != null) {
                while (d17.moveToNext()) {
                    try {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        f9Var.m124849x5361953a(d17.getLong(0));
                        f9Var.m124850x7650bebc(d17.getInt(1));
                        f9Var.e1(d17.getLong(2));
                        f9Var.u1(d17.getString(3));
                        f9Var.d1(d17.getString(4));
                        f9Var.j1(d17.getInt(5));
                        f9Var.o1(d17.getLong(6));
                        f9Var.i1(d17.getString(7));
                        f9Var.p1(d17.getString(8));
                        f9Var.f1(d17.getInt(9));
                        f9Var.r1(d17.getInt(10));
                        this.f283688e.put(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), f9Var);
                    } catch (java.lang.Throwable th6) {
                        d17.close();
                        throw th6;
                    }
                }
                d17.close();
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
