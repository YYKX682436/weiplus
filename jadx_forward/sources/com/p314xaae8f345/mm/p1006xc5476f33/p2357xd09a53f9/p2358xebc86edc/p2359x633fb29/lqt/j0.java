package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f259192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f259193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0 f259194f;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0 l0Var, byte[] bArr, boolean z17) {
        this.f259194f = l0Var;
        this.f259192d = bArr;
        this.f259193e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr = this.f259192d;
        if (bArr != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0 l0Var = this.f259194f;
            l0Var.f259211g.lock();
            boolean z17 = this.f259193e;
            if (z17) {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0.f259203r;
                if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                    com.p314xaae8f345.mm.vfs.w6.g(str, true);
                }
                com.p314xaae8f345.mm.vfs.w6.u(str);
                l0Var.f259209e = null;
            } else {
                java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0.f259204s;
                if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                    com.p314xaae8f345.mm.vfs.w6.g(str2, true);
                }
                com.p314xaae8f345.mm.vfs.w6.u(str2);
                l0Var.f259210f = null;
            }
            l0Var.f259211g.unlock();
            try {
                java.lang.String str3 = java.lang.System.currentTimeMillis() + "";
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0.f259203r : com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0.f259204s;
                objArr[1] = str3;
                objArr[2] = java.lang.Boolean.valueOf(z17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtBindQueryInfoCache", "saveCacheToDisk, dir: %s, name: %s, save: %s", objArr);
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0.f259203r : com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0.f259204s);
                sb6.append(str3);
                com.p314xaae8f345.mm.vfs.w6.R(sb6.toString(), bArr);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtBindQueryInfoCache", "finish saveCacheToDisk, used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LqtBindQueryInfoCache", e17, "saveCacheToDisk error: %s", e17.getMessage());
            }
        }
    }
}
