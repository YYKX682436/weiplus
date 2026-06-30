package y41;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f540874a;

    static {
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("OpenImKefuContactUpdateInterval_Second", 86400);
        if (b17 > 0) {
            f540874a = b17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImKefuConfigManager", "initOpenImKefuConfig configUpdateInterval: " + b17 + ", finalUpdateInterval: " + f540874a);
    }
}
