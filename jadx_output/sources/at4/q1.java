package at4;

/* loaded from: classes9.dex */
public class q1 implements com.tencent.mm.wallet_core.ui.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13931a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13932b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13933c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f13934d;

    public q1(long j17, long j18, long j19, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        this.f13931a = j17;
        this.f13932b = j18;
        this.f13933c = j19;
        this.f13934d = bankcard;
    }

    @Override // com.tencent.mm.wallet_core.ui.n1
    public void a(java.util.Map map) {
        if (map != null) {
            long k17 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) map.get("wallet_balance_version"), -1L);
            long k18 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) map.get("wallet_balance_last_update_time"), -1L);
            long j17 = this.f13932b;
            if (k18 >= 0 && k17 >= 0 && k18 + this.f13931a <= android.os.SystemClock.elapsedRealtime() && j17 < k17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletQueryBankcardParser", "hy: new balance comes but last msg is not timeout and balance version is smaller than before");
                return;
            }
            long j18 = this.f13933c;
            com.tencent.mm.wallet_core.ui.r1.c(new com.tencent.mm.wallet_core.ui.q1("wallet_balance_version", java.lang.Long.valueOf(j17)), new com.tencent.mm.wallet_core.ui.q1("wallet_balance_last_update_time", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime())), new com.tencent.mm.wallet_core.ui.q1("wallet_balance", java.lang.Double.valueOf(j18 / 100.0d)));
            this.f13934d.O2 = j18 / 100.0d;
        }
    }
}
