package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f88007a;

    /* renamed from: b, reason: collision with root package name */
    public final int f88008b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f88009c;

    /* renamed from: d, reason: collision with root package name */
    public int f88010d;

    public k(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f88007a = appId;
        this.f88008b = i17;
        this.f88009c = new java.util.ArrayList(4);
    }

    public final void a() {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.util.ArrayList<com.tencent.mars.smc.IDKey> arrayList = this.f88009c;
        g0Var.j(arrayList, false, false);
        for (com.tencent.mars.smc.IDKey iDKey : arrayList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIInvalidIntentTraceReport", "flush report appId:" + this.f88007a + " versionType:" + this.f88008b + " idkey: " + iDKey.GetID() + ' ' + iDKey.GetKey());
            com.tencent.mm.plugin.appbrand.report.v0.j(this.f88007a, 0, this.f88008b, iDKey.GetID(), iDKey.GetKey(), 1L);
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
            this.f88009c.add(new com.tencent.mars.smc.IDKey(1774, i17 + this.f88010d, 1));
        }
    }
}
