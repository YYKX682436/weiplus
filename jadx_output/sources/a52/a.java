package a52;

/* loaded from: classes15.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.pointers.PBool f1573a;

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.pointers.PBool f1574b;

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.pointers.PBool f1575c;

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.pointers.PBool f1576d;

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.pointers.PInt f1577e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f1578f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f1579g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f1580h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public static boolean f1581i = false;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f1582j = false;

    /* renamed from: k, reason: collision with root package name */
    public static int f1583k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f1584l = "";

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f1585m = "";

    /* renamed from: n, reason: collision with root package name */
    public static boolean f1586n = false;

    public static boolean a() {
        if (f1574b == null) {
            java.lang.String c17 = l62.c.b().c(e42.d0.clicfg_hellhound_frontback_switch, "1", false);
            com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
            f1574b = pBool;
            pBool.value = com.tencent.mm.sdk.platformtools.t8.P(c17, 0) > 0;
        }
        if (!f1574b.value) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellhoundConfig", "HellhoundConfig, frontbackSwitch: [false]");
        }
        return f1574b.value;
    }

    public static boolean b() {
        if (f1573a == null) {
            java.lang.String c17 = l62.c.b().c(e42.d0.clicfg_hellhound_switch, "1", false);
            com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
            f1573a = pBool;
            pBool.value = com.tencent.mm.sdk.platformtools.t8.P(c17, 0) > 0;
        }
        if (!f1573a.value) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellhoundConfig", "HellhoundConfig, hellhoundSwitch: [false]");
        }
        return f1573a.value;
    }

    public static boolean c() {
        if (f1575c == null) {
            java.lang.String c17 = l62.c.b().c(e42.d0.clicfg_hellhound_frontback_switch, "1", false);
            com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
            f1575c = pBool;
            pBool.value = com.tencent.mm.sdk.platformtools.t8.P(c17, 0) > 0;
        }
        if (!f1575c.value) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellhoundConfig", "HellhoundConfig, sessionSwitch: [false]");
        }
        return f1575c.value;
    }

    public static void d(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellhoundConfig", "FinderLiveCommentScene set " + str);
        if (str == null) {
            str = "";
        }
        f1584l = str;
    }
}
