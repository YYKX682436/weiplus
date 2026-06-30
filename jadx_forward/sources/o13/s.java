package o13;

/* loaded from: classes12.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final o13.r f423788a = new o13.r(19968, 40869);

    /* renamed from: b, reason: collision with root package name */
    public static final o13.r f423789b = new o13.r(40870, 40907);

    /* renamed from: c, reason: collision with root package name */
    public static final o13.r f423790c = new o13.r(13312, 19893);

    /* renamed from: d, reason: collision with root package name */
    public static final o13.r f423791d = new o13.r(131072, 173782);

    /* renamed from: e, reason: collision with root package name */
    public static final o13.r f423792e = new o13.r(173824, 177972);

    /* renamed from: f, reason: collision with root package name */
    public static final o13.r f423793f = new o13.r(177984, 178205);

    /* renamed from: g, reason: collision with root package name */
    public static final o13.r f423794g = new o13.r(65, 90);

    /* renamed from: h, reason: collision with root package name */
    public static final o13.r f423795h = new o13.r(97, 122);

    /* renamed from: i, reason: collision with root package name */
    public static final o13.r f423796i = new o13.r(48, 57);

    /* renamed from: j, reason: collision with root package name */
    public static final q13.b f423797j = new q13.b();

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.HashMap f423798k = new java.util.HashMap();

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.HashMap f423799l = new java.util.HashMap();

    public static boolean a(char c17) {
        return f423788a.a(c17) || f423789b.a(c17) || f423790c.a(c17) || f423791d.a(c17) || f423792e.a(c17) || f423793f.a(c17);
    }

    public static boolean b(char c17) {
        return f423794g.a(c17) || f423795h.a(c17);
    }

    public static final java.lang.String c(java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (char c17 : str.toCharArray()) {
            if (a(c17)) {
                java.lang.String str2 = (java.lang.String) f423798k.get(java.lang.String.valueOf(c17));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    stringBuffer.append(str2);
                }
            }
            stringBuffer.append(c17);
        }
        return stringBuffer.toString();
    }
}
