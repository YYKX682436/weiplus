package fm3;

/* loaded from: classes10.dex */
public final class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f345582b = true;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f345583c = "";

    /* renamed from: d, reason: collision with root package name */
    public static int f345584d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Integer f345585e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Long f345586f;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f345588h;

    /* renamed from: i, reason: collision with root package name */
    public static r45.hf2 f345589i;

    /* renamed from: j, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2495xc50a8b8b.g f345590j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.List f345591k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.ArrayList f345592l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashMap f345593m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.HashMap f345594n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.HashMap f345595o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.HashMap f345596p;

    /* renamed from: q, reason: collision with root package name */
    public static hm3.t f345597q;

    /* renamed from: r, reason: collision with root package name */
    public static int f345598r;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f345599s;

    /* renamed from: t, reason: collision with root package name */
    public static android.app.Activity f345600t;

    /* renamed from: a, reason: collision with root package name */
    public static final fm3.f0 f345581a = new fm3.f0();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f345587g = new java.util.HashMap();

    static {
        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(synchronizedList, "synchronizedList(...)");
        f345591k = synchronizedList;
        f345592l = new java.util.ArrayList();
        f345593m = new java.util.HashMap();
        f345594n = new java.util.HashMap();
        f345595o = new java.util.HashMap();
        f345596p = new java.util.HashMap();
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper(), fm3.e0.f345578d);
    }

    public final void a(boolean z17) {
        f345588h = z17;
        r45.hf2 hf2Var = f345589i;
        java.lang.String m75945x2fec8307 = hf2Var != null ? hf2Var.m75945x2fec8307(5) : null;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = f345590j;
        if (m75945x2fec8307 == null || gVar == null) {
            return;
        }
        gm0.j1.d().g(new hm3.r(m75945x2fec8307, gVar, z17, 0));
    }

    public final void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSessionEnd, songName:");
        r45.hf2 hf2Var = f345589i;
        sb6.append(hf2Var != null ? hf2Var.m75945x2fec8307(0) : null);
        sb6.append(", singer:");
        r45.hf2 hf2Var2 = f345589i;
        sb6.append(hf2Var2 != null ? hf2Var2.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvChattingDataManger", sb6.toString());
        a(true);
        f345592l.clear();
        f345582b = true;
    }
}
