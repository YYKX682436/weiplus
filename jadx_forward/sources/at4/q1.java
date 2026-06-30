package at4;

/* loaded from: classes9.dex */
public class q1 implements com.p314xaae8f345.mm.p2802xd031a825.ui.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f95464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f95465b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f95466c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f95467d;

    public q1(long j17, long j18, long j19, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        this.f95464a = j17;
        this.f95465b = j18;
        this.f95466c = j19;
        this.f95467d = c19091x9511676c;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.n1
    public void a(java.util.Map map) {
        if (map != null) {
            long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) map.get("wallet_balance_version"), -1L);
            long k18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) map.get("wallet_balance_last_update_time"), -1L);
            long j17 = this.f95465b;
            if (k18 >= 0 && k17 >= 0 && k18 + this.f95464a <= android.os.SystemClock.elapsedRealtime() && j17 < k17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletQueryBankcardParser", "hy: new balance comes but last msg is not timeout and balance version is smaller than before");
                return;
            }
            long j18 = this.f95466c;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.c(new com.p314xaae8f345.mm.p2802xd031a825.ui.q1("wallet_balance_version", java.lang.Long.valueOf(j17)), new com.p314xaae8f345.mm.p2802xd031a825.ui.q1("wallet_balance_last_update_time", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime())), new com.p314xaae8f345.mm.p2802xd031a825.ui.q1("wallet_balance", java.lang.Double.valueOf(j18 / 100.0d)));
            this.f95467d.O2 = j18 / 100.0d;
        }
    }
}
