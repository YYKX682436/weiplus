package o42;

/* loaded from: classes15.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static int f424365b = 1000;

    /* renamed from: c, reason: collision with root package name */
    public static int f424366c = 30000;

    /* renamed from: d, reason: collision with root package name */
    public static int f424367d = 10000;

    /* renamed from: e, reason: collision with root package name */
    public static int f424368e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static long f424369f = 60000;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f424370a;

    public b() {
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_edge_computing_threshold_controller, "", true);
        if (!u46.l.e(Zi)) {
            java.lang.String[] split = Zi.split(";");
            if (split.length > 0 && !u46.l.e(split[0])) {
                f424365b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[0], 0);
            }
            if (split.length > 1 && !u46.l.e(split[1])) {
                f424367d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[1], 0);
            }
            if (split.length > 2 && !u46.l.e(split[2])) {
                f424366c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[2], 0);
            }
            if (split.length > 3 && !u46.l.e(split[3])) {
                f424368e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[3], 0);
            }
            if (split.length > 4 && !u46.l.e(split[4])) {
                f424369f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[4], 0);
            }
        }
        this.f424370a = new java.util.HashMap();
    }
}
