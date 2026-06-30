package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284114f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f284115g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b4 f284116h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.c4 f284117i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o3 f284118m;

    public z3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o3 o3Var, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b4 b4Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.c4 c4Var) {
        this.f284118m = o3Var;
        this.f284112d = str;
        this.f284113e = str2;
        this.f284114f = str3;
        this.f284115g = j17;
        this.f284116h = b4Var;
        this.f284117i = c4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o3 o3Var = this.f284118m;
        if (o3Var.f283939s.get()) {
            return;
        }
        kk.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.f182997a;
        int a17 = o25.y.a(this.f284112d);
        java.lang.String v17 = o72.x1.v(o3Var.f284074d, this.f284113e);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17)) {
            v17 = this.f284114f;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = o3Var.f283940t;
        long j17 = this.f284115g;
        concurrentHashMap.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(a17));
        o3Var.f283941u.put(java.lang.Long.valueOf(j17), v17);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b4 b4Var = this.f284116h;
        b4Var.getClass();
        b4Var.f283661k = v17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y3(this, v17));
    }
}
