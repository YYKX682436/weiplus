package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f227129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f227130f;

    public s0(java.lang.String str, int i17, int i18) {
        this.f227128d = str;
        this.f227129e = i17;
        this.f227130f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f227128d;
        int i17 = this.f227129e;
        int i18 = this.f227130f;
        try {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.lang.String str2 = "null" + i18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckMoneyEffectResourceMgr", "on saveEffectResource: %s %s %s %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
            com.p314xaae8f345.mm.vfs.w6.Q(str, str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckMoneyEffectResourceMgr", "saveEffectResource used %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LuckMoneyEffectResourceMgr", e17, "saveEffectResourceImpl error: %s", e17.getMessage());
        }
    }
}
