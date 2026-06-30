package at4;

/* loaded from: classes9.dex */
public class o1 implements com.p314xaae8f345.mm.p2802xd031a825.ui.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f95446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f95447b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f95448c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f95449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f95450e;

    public o1(at4.p1 p1Var, long j17, long j18, int i17, int i18, java.util.Map map) {
        this.f95446a = j17;
        this.f95447b = j18;
        this.f95448c = i17;
        this.f95449d = i18;
        this.f95450e = map;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.n1
    public void a(java.util.Map map) {
        if (map != null) {
            long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) map.get("wallet_balance_version"), -1L);
            long k18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) map.get("wallet_balance_last_update_time"), -1L);
            long j17 = this.f95447b;
            if (k18 >= 0 && k17 >= 0 && k18 + this.f95446a <= android.os.SystemClock.elapsedRealtime() && j17 < k17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletPushNotifyManager", "hy: new balance comes but last msg is not timeout and balance version is smaller than before");
            } else {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.c(new com.p314xaae8f345.mm.p2802xd031a825.ui.q1("wallet_balance_version", java.lang.Long.valueOf(j17)), new com.p314xaae8f345.mm.p2802xd031a825.ui.q1("wallet_balance_last_update_time", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime())), new com.p314xaae8f345.mm.p2802xd031a825.ui.q1("wallet_balance", java.lang.Double.valueOf(this.f95448c / 100.0d)));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new at4.n1(this.f95449d, this.f95450e, null));
            }
        }
    }
}
