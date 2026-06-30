package om1;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f427796a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f427797b;

    /* renamed from: c, reason: collision with root package name */
    public static int f427798c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f427799d;

    /* renamed from: e, reason: collision with root package name */
    public static long f427800e;

    public static final void a() {
        long j17 = f427800e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        wo.c cVar = wo.v1.f529356c;
        int i17 = cVar.f529160t;
        if (i17 == -1) {
            i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_audio_bluetooth_forbid_use_sco_refresh_time, 50);
        }
        if (elapsedRealtime > i17 * 1000) {
            int i18 = cVar.f529158s;
            if (i18 == -1) {
                i18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_audio_bluetooth_forbid_use_sco_strategy, 1);
            }
            if (i18 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BluetoothMgr", "refresh forbidden time");
                an1.c.f90369d = true;
            }
        }
        f427798c = 0;
    }
}
