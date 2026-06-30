package s65;

/* loaded from: classes11.dex */
public class m0 {

    /* renamed from: h, reason: collision with root package name */
    public static long f485026h = 125829120;

    /* renamed from: f, reason: collision with root package name */
    public final s65.x0 f485032f;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f485027a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new s65.j0(this), true);

    /* renamed from: b, reason: collision with root package name */
    public long f485028b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f485029c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f485030d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f485031e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f485033g = false;

    public m0(s65.x0 x0Var) {
        this.f485032f = x0Var;
    }

    public final void a(boolean z17) {
        if (z17 || this.f485028b + this.f485029c >= 524288) {
            long j17 = this.f485028b + this.f485029c;
            long j18 = 0;
            s65.x0 x0Var = this.f485032f;
            if (j17 > 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
                intent.putExtra("intent_extra_flow_stat_upstream", this.f485028b);
                intent.putExtra("intent_extra_flow_stat_downstream", this.f485029c);
                android.content.Context context = x0Var.A;
                if (context != null) {
                    this.f485033g = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context);
                }
                intent.putExtra("intent_extra_flow_stat_is_wifi", this.f485033g);
                intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
                android.content.Context context2 = x0Var.A;
                if (context2 != null) {
                    context2.sendBroadcast(intent, com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a());
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f485030d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TrafficStatistic", "traffic is null!");
            } else {
                java.lang.String str = this.f485030d;
                long j19 = this.f485028b;
                long j27 = this.f485029c;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "update_flowstat_prefs", 4);
                long j28 = o4Var.getLong(str, 0L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "putPackFlowStat pack %s, flowUp %s, flowDown %s", str, java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "putPackFlowStat pack %s, flow %s", str, java.lang.Long.valueOf(j28));
                long j29 = j28 + j19 + j27;
                o4Var.putLong(str, j29);
                this.f485028b = 0L;
                this.f485029c = 0L;
                j18 = j29;
            }
            if (j18 < f485026h || x0Var.f485077r != 2) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TrafficStatistic", "checkIfTrafficAlert reach traffic alert line!");
            x0Var.k();
        }
    }

    public void b() {
        a(true);
        this.f485027a.d();
        this.f485031e = false;
    }
}
