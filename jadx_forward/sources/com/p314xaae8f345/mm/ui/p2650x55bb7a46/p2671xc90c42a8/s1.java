package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f283983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f283984f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1 f283985g;

    public s1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1 p1Var, java.lang.String str, java.util.Map map, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f283985g = p1Var;
        this.f283982d = str;
        this.f283983e = map;
        this.f283984f = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1 p1Var = this.f283985g;
        java.util.concurrent.CountDownLatch countDownLatch = this.f283984f;
        try {
            if (p1Var.f283952s.get()) {
                return;
            }
            android.database.Cursor d17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).d1(p1Var.f284075e, this.f283982d);
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
                        f9Var.i1(d17.getString(6));
                        f9Var.p1(d17.getString(7));
                        f9Var.f1(d17.getInt(8));
                        f9Var.r1(d17.getInt(9));
                        this.f283983e.put(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), f9Var);
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
