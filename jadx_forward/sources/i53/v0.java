package i53;

/* loaded from: classes15.dex */
public class v0 {

    /* renamed from: e, reason: collision with root package name */
    public m33.o1 f370286e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f370282a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f370283b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f370284c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f370285d = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f370287f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f370288g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f370289h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370290i = "";

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m0 f370291j = new i53.s0(this);

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 f370292k = new i53.u0(this);

    public static boolean a(i53.v0 v0Var, java.lang.String str, int i17, int i18, int i19) {
        v0Var.f370284c.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "uploadMediaFile, localId : %s", str);
        return com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().c("", str, i17, i18, i19, null);
    }

    public static void b(i53.v0 v0Var) {
        v0Var.f370287f.clear();
        v0Var.f370288g.clear();
        v0Var.f370289h.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().i(v0Var.f370292k);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.i4 bj6 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m0 m0Var = v0Var.f370291j;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = bj6.f264471e;
        if (copyOnWriteArraySet == null || m0Var == null) {
            return;
        }
        copyOnWriteArraySet.remove(m0Var);
    }
}
