package r63;

/* loaded from: classes14.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final r63.l f474555a = new r63.l();

    /* renamed from: b, reason: collision with root package name */
    public static int f474556b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f474557c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f474558d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f474559e;

    /* renamed from: f, reason: collision with root package name */
    public static int f474560f;

    /* renamed from: g, reason: collision with root package name */
    public static int f474561g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f474562h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.Boolean f474563i;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.Boolean f474564j;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.Boolean f474565k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f474566l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f474567m;

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.String f474568n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.Map f474569o;

    /* renamed from: p, reason: collision with root package name */
    public static long f474570p;

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.String f474571q;

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.Boolean f474572r;

    /* renamed from: s, reason: collision with root package name */
    public static final jz5.g f474573s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1768xfb3909d7.p1769xc84c5534.p1770x75c02234.C16076x67cc9b34 f474574t;

    /* JADX WARN: Type inference failed for: r0v8, types: [com.tencent.mm.plugin.generic.report.finderevent.FinderPageEnterMonitor$screenStateReceiver$1] */
    static {
        o63.e[] eVarArr = o63.e.f424729d;
        f474556b = 0;
        f474557c = new java.util.LinkedHashMap();
        f474558d = new java.util.LinkedHashMap();
        f474559e = new java.util.LinkedHashSet();
        f474560f = 0;
        f474561g = 0;
        f474562h = "";
        f474567m = new java.util.LinkedHashMap();
        f474568n = "";
        f474569o = new java.util.LinkedHashMap();
        f474573s = jz5.h.b(r63.k.f474554d);
        jz5.h.b(r63.i.f474552d);
        f474574t = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.generic.report.finderevent.FinderPageEnterMonitor$screenStateReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
                java.lang.String action = intent.getAction();
                if (action != null) {
                    int hashCode = action.hashCode();
                    if (hashCode == -2128145023) {
                        if (action.equals("android.intent.action.SCREEN_OFF")) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderPageEnterMonitor", "ACTION_SCREEN_OFF!");
                        }
                    } else {
                        if (hashCode == -1454123155) {
                            if (action.equals("android.intent.action.SCREEN_ON")) {
                                r63.l lVar = r63.l.f474555a;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderPageEnterMonitor", "ACTION_SCREEN_ON!");
                                return;
                            }
                            return;
                        }
                        if (hashCode == 823795052 && action.equals("android.intent.action.USER_PRESENT")) {
                            r63.l lVar2 = r63.l.f474555a;
                            r63.l.f474570p = android.os.SystemClock.elapsedRealtime();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderPageEnterMonitor", "ACTION_USER_PRESENT，lastUserPresentTime = " + r63.l.f474570p);
                        }
                    }
                }
            }
        };
    }

    public static void c(r63.l lVar, java.lang.String str, int i17, java.lang.Integer num, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            num = null;
        }
        if ((i19 & 8) != 0) {
            i18 = 0;
        }
        lVar.getClass();
        if (num != null) {
            f474560f = num.intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderPageEnterMonitor", "floatBallSessionEnterType " + num);
        } else {
            o63.e[] eVarArr = o63.e.f424729d;
            if (i17 == 2 || i17 == 8) {
                f474561g = f474560f;
                f474560f = 1;
            } else if (i17 == 4 || i17 == 5) {
                f474561g = f474560f;
                f474560f = 2;
            } else if (i17 == 6 && f474561g != f474560f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderPageEnterMonitor", "fix mSessionEnterSource cur: " + f474560f + " -> " + f474561g);
                f474560f = f474561g;
            }
        }
        lVar.b(i18, i17);
        f474556b = i17;
        f474566l = true;
        f474571q = null;
        f474572r = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderPageEnterMonitor", "enter type " + f474556b + ", mSessionEnterSource type " + f474560f);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5330x64981f7e c5330x64981f7e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5330x64981f7e();
        if (str == null) {
            str = "";
        }
        am.w4 w4Var = c5330x64981f7e.f135643g;
        w4Var.f89795a = str;
        w4Var.f89796b = i17;
        w4Var.f89797c = f474560f;
        c5330x64981f7e.e();
    }

    public final boolean a(java.lang.String str) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.ui.LauncherUI", str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("LauncherUI", str);
    }

    public final void b(int i17, int i18) {
        if (i17 == 0) {
            return;
        }
        f474558d.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}
