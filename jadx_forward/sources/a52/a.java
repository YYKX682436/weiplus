package a52;

/* loaded from: classes15.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f83106a;

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f83107b;

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f83108c;

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f83109d;

    /* renamed from: e, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f f83110e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f83111f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f83112g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f83113h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public static boolean f83114i = false;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f83115j = false;

    /* renamed from: k, reason: collision with root package name */
    public static int f83116k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f83117l = "";

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f83118m = "";

    /* renamed from: n, reason: collision with root package name */
    public static boolean f83119n = false;

    public static boolean a() {
        if (f83107b == null) {
            java.lang.String c17 = l62.c.b().c(e42.d0.clicfg_hellhound_frontback_switch, "1", false);
            com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
            f83107b = c19762x487075a;
            c19762x487075a.f38859x6ac9171 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(c17, 0) > 0;
        }
        if (!f83107b.f38859x6ac9171) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellhoundConfig", "HellhoundConfig, frontbackSwitch: [false]");
        }
        return f83107b.f38859x6ac9171;
    }

    public static boolean b() {
        if (f83106a == null) {
            java.lang.String c17 = l62.c.b().c(e42.d0.clicfg_hellhound_switch, "1", false);
            com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
            f83106a = c19762x487075a;
            c19762x487075a.f38859x6ac9171 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(c17, 0) > 0;
        }
        if (!f83106a.f38859x6ac9171) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellhoundConfig", "HellhoundConfig, hellhoundSwitch: [false]");
        }
        return f83106a.f38859x6ac9171;
    }

    public static boolean c() {
        if (f83108c == null) {
            java.lang.String c17 = l62.c.b().c(e42.d0.clicfg_hellhound_frontback_switch, "1", false);
            com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
            f83108c = c19762x487075a;
            c19762x487075a.f38859x6ac9171 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(c17, 0) > 0;
        }
        if (!f83108c.f38859x6ac9171) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellhoundConfig", "HellhoundConfig, sessionSwitch: [false]");
        }
        return f83108c.f38859x6ac9171;
    }

    public static void d(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellhoundConfig", "FinderLiveCommentScene set " + str);
        if (str == null) {
            str = "";
        }
        f83117l = str;
    }
}
