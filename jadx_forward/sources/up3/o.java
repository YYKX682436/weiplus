package up3;

/* loaded from: classes12.dex */
public final class o implements tp3.c {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f511371d = tp3.b.a("\u0098¿´¢¾\u009f «ã\u0088ª¼ª¢\u008f¥±§\u008b¯¦« ");

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f511372e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f511373f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f511374g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f511375h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f511376i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f511377m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f511378n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f511379o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.Map f511380p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.Map f511381q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f511382r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f511383s;

    static {
        java.lang.String a17 = tp3.b.a("ù³¼¶ý¨¤¯¨¦¦¹¿\u00ad¦è¡¥µ¡«");
        f511372e = a17;
        f511373f = a17 + tp3.b.a("êá²¦²¦§·");
        f511374g = a17 + tp3.b.a("åà«£³·®°¨");
        f511375h = a17 + tp3.b.a("æí¤ª© \u0099µ¥¦§»");
        f511376i = a17 + tp3.b.a("åàµ´¨£¤±°");
        f511377m = a17 + tp3.b.a("çî\u00ad\u00ad©£\u0098° ¶«");
        java.lang.String a18 = tp3.b.a("·¨¤ª");
        f511378n = a18;
        java.lang.String a19 = tp3.b.a(" ¬º");
        f511379o = a19;
        java.util.Comparator comparator = java.lang.String.CASE_INSENSITIVE_ORDER;
        java.util.TreeMap treeMap = new java.util.TreeMap(comparator);
        f511380p = treeMap;
        java.util.TreeMap treeMap2 = new java.util.TreeMap(comparator);
        f511381q = treeMap2;
        f511382r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(tp3.b.a("©§¨¦¦¹¿\u00ad¦ë¡¥µ¡«"));
        f511383s = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName();
        treeMap.put(a18, new up3.d());
        treeMap.put(a19, new up3.e());
        treeMap2.put(tp3.b.a("¦¤µ¢í ²¨"), new up3.f());
        treeMap2.put(tp3.b.a("©¥¶£ê¯¥§»"), new up3.g());
        treeMap2.put(tp3.b.a("©¥¶£ê¶¥§»"), new up3.h());
        treeMap2.put(tp3.b.a("§§´¥ì±¬"), new up3.j());
        treeMap2.put(tp3.b.a("\u00ad ²°"), new up3.k());
        treeMap2.put(tp3.b.a("´\u00ad ²°"), new up3.l());
        treeMap2.put(tp3.b.a("µ¾³ì±¬"), new up3.m());
    }

    public o() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str = up3.n.f511366a;
        synchronized (up3.n.class) {
            if (up3.n.f511370e != null) {
                return;
            }
            up3.n.f511370e = new up3.n();
            android.content.IntentFilter intentFilter = new android.content.IntentFilter(up3.n.f511367b);
            try {
                if (fp.h.a(33)) {
                    context.registerReceiver(up3.n.f511370e, intentFilter, up3.n.f511366a, null);
                } else {
                    context.registerReceiver(up3.n.f511370e, intentFilter, up3.n.f511366a, null, 4);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(f511371d, th6, "[-] Fail to register receiver.", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
            }
        }
    }

    public static void a(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        int i17;
        try {
            i17 = gm0.j1.b().h();
        } catch (java.lang.Throwable unused) {
            i17 = 0;
        }
        com.p314xaae8f345.mm.app.i3.c(r6Var.o(), 12347, i17, null, null, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f511371d, "[+] Explained by src 1: %s", r6Var.o());
    }

    public static java.lang.String e(java.lang.String str, char c17, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        int i17 = str.charAt(0) == c17 ? 1 : 0;
        while (z17 && i17 < str.length() && str.charAt(i17) == c17) {
            i17++;
        }
        return str.substring(i17);
    }

    @Override // tp3.c
    public java.lang.String b() {
        return f511372e;
    }

    @Override // tp3.c
    public void c(java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get(f511373f);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        java.lang.String str2 = f511371d;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "[-] Target is null or empty!");
            return;
        }
        if (!((java.util.TreeMap) f511381q).containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "[-] Target is absent.");
            return;
        }
        java.lang.String str3 = (java.lang.String) map.get(f511374g);
        java.lang.String str4 = f511378n;
        if (str3 == null) {
            str3 = str4;
        }
        java.util.TreeMap treeMap = (java.util.TreeMap) f511380p;
        if (!treeMap.containsKey(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "[-] Explained by src 9: %s", str3);
            return;
        }
        boolean booleanValue = ((java.lang.Boolean) ((up3.p) treeMap.get(str3)).a(map)).booleanValue();
        java.lang.String str5 = f511379o;
        if (!booleanValue) {
            if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                str4 = str5;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "[!] Explained by src 10: %s, %s", str4, str3);
        } else {
            if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                str4 = str5;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[+] Explained by src 11: %s, %s, %s", str, str3, str4);
            f511382r.mo50293x3498a0(new up3.c(this, str, map));
        }
    }

    @Override // tp3.c
    public void d() {
    }
}
