package at4;

/* loaded from: classes9.dex */
public class o1 implements com.tencent.mm.wallet_core.ui.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13915c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f13917e;

    public o1(at4.p1 p1Var, long j17, long j18, int i17, int i18, java.util.Map map) {
        this.f13913a = j17;
        this.f13914b = j18;
        this.f13915c = i17;
        this.f13916d = i18;
        this.f13917e = map;
    }

    @Override // com.tencent.mm.wallet_core.ui.n1
    public void a(java.util.Map map) {
        if (map != null) {
            long k17 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) map.get("wallet_balance_version"), -1L);
            long k18 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) map.get("wallet_balance_last_update_time"), -1L);
            long j17 = this.f13914b;
            if (k18 >= 0 && k17 >= 0 && k18 + this.f13913a <= android.os.SystemClock.elapsedRealtime() && j17 < k17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletPushNotifyManager", "hy: new balance comes but last msg is not timeout and balance version is smaller than before");
            } else {
                com.tencent.mm.wallet_core.ui.r1.c(new com.tencent.mm.wallet_core.ui.q1("wallet_balance_version", java.lang.Long.valueOf(j17)), new com.tencent.mm.wallet_core.ui.q1("wallet_balance_last_update_time", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime())), new com.tencent.mm.wallet_core.ui.q1("wallet_balance", java.lang.Double.valueOf(this.f13915c / 100.0d)));
                com.tencent.mm.sdk.platformtools.u3.h(new at4.n1(this.f13916d, this.f13917e, null));
            }
        }
    }
}
