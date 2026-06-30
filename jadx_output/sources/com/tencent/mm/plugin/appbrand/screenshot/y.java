package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.screenshot.a0 f88591d;

    public y(com.tencent.mm.plugin.appbrand.screenshot.a0 a0Var) {
        this.f88591d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo.CREATOR.getClass();
        long a17 = hq.d.a() - 2592000000L;
        com.tencent.mm.plugin.appbrand.screenshot.a0 a0Var = this.f88591d;
        a0Var.getClass();
        p75.n0 n0Var = dm.f0.f236758r;
        n0Var.getClass();
        p75.m0 x17 = dm.f0.f236760t.x(java.lang.Long.valueOf(a17));
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.b();
        p75.h hVar = (p75.h) x17;
        java.lang.String b17 = hVar.b();
        java.lang.String[] e17 = hVar.e();
        kotlin.jvm.internal.o.g(table, "table");
        java.lang.String str = "";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteLastModifiedEarlierThan, sql: ");
        if (b17 != null) {
            if ((r26.n0.N(b17) ^ true ? b17 : null) != null) {
                java.lang.String str2 = " WHERE " + b17;
                if (str2 != null) {
                    str = str2;
                }
            }
        }
        sb6.append("DELETE FROM " + table + str);
        sb6.append(", timeMs: ");
        sb6.append(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotInfoStorage", sb6.toString());
        l75.k0 k0Var = a0Var.f88466d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotInfoStorage", "deleteAllExpired, deleteCount: " + (k0Var != null ? k0Var.delete(table, b17, e17) : -1));
    }
}
