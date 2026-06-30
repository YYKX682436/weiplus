package gr;

/* loaded from: classes12.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f356236a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f356237b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f356238c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f356239d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f356240e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f356241f;

    public static int a() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CustomEmojiMaxSize"), 999);
    }

    public static boolean b() {
        boolean z17;
        boolean z18;
        if (!f356237b) {
            int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableEmoticonExternUrl", 0);
            int m64962x130a215f = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64962x130a215f();
            if ((b17 & 2) == 2) {
                try {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getPackageInfo("com.google.android.wearable.app.cn", 1);
                    z17 = true;
                } catch (java.lang.Throwable unused) {
                    z17 = false;
                }
                if (!z17) {
                    try {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getPackageInfo("com.google.android.wearable.app", 1);
                        z18 = true;
                    } catch (android.util.AndroidException | java.lang.Exception unused2) {
                        z18 = false;
                    }
                    if (!z18) {
                        f356240e = true;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(711L, 1L, 1L, false);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(711L, 0L, 1L, false);
                f356240e = false;
            } else {
                f356240e = false;
            }
            if (m64962x130a215f < 0) {
                f356240e = false;
            }
            f356237b = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmotionDynamicConfigMgr", "isEnableHevcDecode:%b", java.lang.Boolean.valueOf(f356240e));
        }
        return f356240e && ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj();
    }

    public static boolean c() {
        if (!f356238c) {
            if ((((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableEmoticonExternUrl", 0) & 4) == 4) {
                f356241f = true;
            } else {
                f356241f = false;
            }
            f356238c = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmotionDynamicConfigMgr", "isEnableHevcUpload:%b", java.lang.Boolean.valueOf(f356241f));
        return f356241f && ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj();
    }
}
