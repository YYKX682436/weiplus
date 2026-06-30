package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes7.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.a0 f170124d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.a0 a0Var) {
        this.f170124d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.C12570xcc3b76da.f35160x681a0c0c.getClass();
        long a17 = hq.d.a() - 2592000000L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.a0 a0Var = this.f170124d;
        a0Var.getClass();
        p75.n0 n0Var = dm.f0.f318291r;
        n0Var.getClass();
        p75.m0 x17 = dm.f0.f318293t.x(java.lang.Long.valueOf(a17));
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.b();
        p75.h hVar = (p75.h) x17;
        java.lang.String b17 = hVar.b();
        java.lang.String[] e17 = hVar.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandScreenshotInfoStorage", sb6.toString());
        l75.k0 k0Var = a0Var.f169999d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandScreenshotInfoStorage", "deleteAllExpired, deleteCount: " + (k0Var != null ? k0Var.mo70514xb06685ab(table, b17, e17) : -1));
    }
}
