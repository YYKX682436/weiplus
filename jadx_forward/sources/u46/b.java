package u46;

/* loaded from: classes13.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f506192a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f506193b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f506194c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f506195d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ java.lang.Class f506196e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ java.lang.Class f506197f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ java.lang.Class f506198g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ java.lang.Class f506199h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ java.lang.Class f506200i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ java.lang.Class f506201j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ java.lang.Class f506202k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ java.lang.Class f506203l;

    static {
        java.lang.String.valueOf('.');
        java.lang.String.valueOf('$');
        java.util.HashMap hashMap = new java.util.HashMap();
        f506192a = hashMap;
        java.lang.Class cls = java.lang.Boolean.TYPE;
        java.lang.Class cls2 = f506196e;
        if (cls2 == null) {
            cls2 = b("java.lang.Boolean");
            f506196e = cls2;
        }
        hashMap.put(cls, cls2);
        java.lang.Class cls3 = java.lang.Byte.TYPE;
        java.lang.Class cls4 = f506197f;
        if (cls4 == null) {
            cls4 = b("java.lang.Byte");
            f506197f = cls4;
        }
        hashMap.put(cls3, cls4);
        java.lang.Class cls5 = java.lang.Character.TYPE;
        java.lang.Class cls6 = f506198g;
        if (cls6 == null) {
            cls6 = b("java.lang.Character");
            f506198g = cls6;
        }
        hashMap.put(cls5, cls6);
        java.lang.Class cls7 = java.lang.Short.TYPE;
        java.lang.Class cls8 = f506199h;
        if (cls8 == null) {
            cls8 = b("java.lang.Short");
            f506199h = cls8;
        }
        hashMap.put(cls7, cls8);
        java.lang.Class cls9 = java.lang.Integer.TYPE;
        java.lang.Class cls10 = f506200i;
        if (cls10 == null) {
            cls10 = b("java.lang.Integer");
            f506200i = cls10;
        }
        hashMap.put(cls9, cls10);
        java.lang.Class cls11 = java.lang.Long.TYPE;
        java.lang.Class cls12 = f506201j;
        if (cls12 == null) {
            cls12 = b("java.lang.Long");
            f506201j = cls12;
        }
        hashMap.put(cls11, cls12);
        java.lang.Class cls13 = java.lang.Double.TYPE;
        java.lang.Class cls14 = f506202k;
        if (cls14 == null) {
            cls14 = b("java.lang.Double");
            f506202k = cls14;
        }
        hashMap.put(cls13, cls14);
        java.lang.Class cls15 = java.lang.Float.TYPE;
        java.lang.Class cls16 = f506203l;
        if (cls16 == null) {
            cls16 = b("java.lang.Float");
            f506203l = cls16;
        }
        hashMap.put(cls15, cls16);
        java.lang.Class cls17 = java.lang.Void.TYPE;
        hashMap.put(cls17, cls17);
        f506193b = new java.util.HashMap();
        for (java.lang.Class cls18 : hashMap.keySet()) {
            java.lang.Class cls19 = (java.lang.Class) f506192a.get(cls18);
            if (!cls18.equals(cls19)) {
                f506193b.put(cls19, cls18);
            }
        }
        f506194c = new java.util.HashMap();
        f506195d = new java.util.HashMap();
        a("int", "I");
        a(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56125x52684c03, "Z");
        a("float", "F");
        a("long", "J");
        a("short", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3025x7c20d01a);
        a("byte", "B");
        a("double", "D");
        a("char", "C");
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        f506194c.put(str, str2);
        f506195d.put(str2, str);
    }

    public static /* synthetic */ java.lang.Class b(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException e17) {
            throw new java.lang.NoClassDefFoundError(e17.getMessage());
        }
    }
}
