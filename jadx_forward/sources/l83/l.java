package l83;

/* loaded from: classes12.dex */
public class l implements com.p314xaae8f345.mm.sdk.p2603x2137b148.q7 {

    /* renamed from: f, reason: collision with root package name */
    public long f398648f = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f398649g = false;

    /* renamed from: h, reason: collision with root package name */
    public l83.k f398650h = null;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 f398646d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 f398647e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.s7(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.q7
    public void f1(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSensorEvent, isON:");
        sb6.append(z17);
        sb6.append("  hasSkip:");
        sb6.append(this.f398649g);
        sb6.append(" tick:");
        long j17 = this.f398648f;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
        sb6.append("  lt:");
        sb6.append(this.f398648f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSensorManager", sb6.toString());
        if (this.f398649g) {
            this.f398649g = !z17;
            return;
        }
        if (!z17) {
            long j18 = this.f398648f;
            if (j18 != -1 && android.os.SystemClock.elapsedRealtime() - j18 > 400) {
                this.f398649g = true;
                return;
            }
        }
        this.f398649g = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSensorManager", "onSensorEvent, isNeedOffScreen: %b", java.lang.Boolean.valueOf(z17));
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new l83.j(this, z17), false).c(50L, 50L);
    }
}
