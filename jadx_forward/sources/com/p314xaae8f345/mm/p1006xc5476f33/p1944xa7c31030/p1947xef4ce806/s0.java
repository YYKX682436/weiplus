package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.s0 f234659a = new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.s0();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f234660b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("oom_monitor");

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f234661c = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.t0.a() + "_pid";

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f234662d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.r0.f234653d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f234663e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.q0.f234650d);

    public final void a(ob0.s3 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (!((java.lang.Boolean) f234662d.mo141623x754a37bb()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NativeOOMMonitor", "disabled");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.m0.f234635c.h(info);
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.p0.f234644c.h(info);
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.n0 n0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.n0.f234637a;
        long j17 = info.f425490n;
        if (2147483649L <= j17 && j17 < 500000000001L) {
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.n0.f234638b;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f234660b;
            long q17 = o4Var.q(str, -1L);
            long j18 = info.f425490n;
            if (j18 > q17) {
                o4Var.B(str, j18);
                o4Var.B(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.n0.f234639c, java.lang.System.currentTimeMillis());
            }
        }
    }

    public final void b() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.m0.f234635c.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.p0.f234644c.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.n0.f234637a.a();
            f234660b.A(f234661c, android.os.Process.myPid());
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.NativeOOMMonitor", th6, "", new java.lang.Object[0]);
        }
    }
}
