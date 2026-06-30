package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f169540a;

    /* renamed from: b, reason: collision with root package name */
    public final int f169541b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f169542c;

    /* renamed from: d, reason: collision with root package name */
    public int f169543d;

    public k(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f169540a = appId;
        this.f169541b = i17;
        this.f169542c = new java.util.ArrayList(4);
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.util.ArrayList<com.p314xaae8f345.p542x3306d5.smc.C4582x424c344> arrayList = this.f169542c;
        g0Var.j(arrayList, false, false);
        for (com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 : arrayList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIInvalidIntentTraceReport", "flush report appId:" + this.f169540a + " versionType:" + this.f169541b + " idkey: " + c4582x424c344.m40327x4182ad1() + ' ' + c4582x424c344.m40328x7eed3b49());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.j(this.f169540a, 0, this.f169541b, c4582x424c344.m40327x4182ad1(), c4582x424c344.m40328x7eed3b49(), 1L);
        }
    }

    public final void b(long j17) {
        int i17;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        if (j17 > timeUnit.toMillis(24L)) {
            i17 = 11;
        } else if (j17 > timeUnit.toMillis(12L)) {
            i17 = 10;
        } else if (j17 > timeUnit.toMillis(6L)) {
            i17 = 9;
        } else if (j17 > timeUnit.toMillis(2L)) {
            i17 = 8;
        } else if (j17 > timeUnit.toMillis(1L)) {
            i17 = 7;
        } else {
            java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MINUTES;
            i17 = j17 > timeUnit2.toMillis(30L) ? 6 : j17 > timeUnit2.toMillis(10L) ? 5 : j17 > timeUnit2.toMillis(5L) ? 4 : j17 > timeUnit2.toMillis(2L) ? 3 : j17 > timeUnit2.toMillis(1L) ? 2 : j17 > 30000 ? 1 : -1;
        }
        if (i17 > 0) {
            this.f169542c.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1774, i17 + this.f169543d, 1));
        }
    }
}
