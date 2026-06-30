package ha1;

/* loaded from: classes7.dex */
public final class i extends ha1.v {

    /* renamed from: c, reason: collision with root package name */
    public static final ha1.i f361302c = new ha1.i();

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f361303d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Float f361304e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f361305f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f361306g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f361307h;

    /* renamed from: i, reason: collision with root package name */
    public static android.app.ActivityManager.MemoryInfo f361308i;

    static {
        java.lang.String a17 = bm5.f1.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getProcessName(...)");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getPackageName(...)");
        f361303d = "MicroMsg.WAGameGcFactor".concat(r26.i0.t(a17, str, "", false));
        f361305f = jz5.h.b(ha1.g.f361300d);
        f361306g = jz5.h.b(ha1.f.f361299d);
        f361307h = jz5.h.b(ha1.h.f361301d);
    }

    @Override // ha1.v
    public e42.d0 b() {
        return e42.d0.clicfg_magicbrush_gcfactor;
    }

    @Override // ha1.v
    public java.lang.String d() {
        return "gcfactor";
    }

    @Override // ha1.v
    public java.lang.Object f() {
        return java.lang.Float.valueOf(0.0f);
    }

    @Override // ha1.v
    public java.lang.Object g(java.lang.String str) {
        return java.lang.Float.valueOf(0.0f);
    }

    public final float i(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.Float f17 = f361304e;
        if (f17 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
            return f17.floatValue();
        }
        float floatValue = ((java.lang.Number) e()).floatValue();
        boolean z17 = floatValue == -1.0f;
        java.lang.String str = f361303d;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "rawConfig == [" + floatValue + "] != -1, just return");
            f361304e = java.lang.Float.valueOf(floatValue);
            return floatValue;
        }
        float f18 = context.getResources().getDisplayMetrics().density;
        float f19 = (context.getResources().getDisplayMetrics().widthPixels / f18) * (context.getResources().getDisplayMetrics().heightPixels / f18) * 4 * 2;
        if (f361308i == null) {
            java.lang.Object systemService = context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            f361308i = memoryInfo;
            ((android.app.ActivityManager) systemService).getMemoryInfo(memoryInfo);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getAvailableMemory avail = [");
            android.app.ActivityManager.MemoryInfo memoryInfo2 = f361308i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(memoryInfo2);
            sb6.append(memoryInfo2.availMem);
            sb6.append("] total = [");
            android.app.ActivityManager.MemoryInfo memoryInfo3 = f361308i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(memoryInfo3);
            sb6.append(memoryInfo3.totalMem);
            sb6.append(']');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        }
        android.app.ActivityManager.MemoryInfo memoryInfo4 = f361308i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(memoryInfo4);
        long floatValue2 = ((float) memoryInfo4.totalMem) * ((java.lang.Number) ((jz5.n) f361307h).mo141623x754a37bb()).floatValue();
        float f27 = ((float) floatValue2) / f19;
        float min = java.lang.Math.min(((java.lang.Number) ((jz5.n) f361306g).mo141623x754a37bb()).floatValue(), java.lang.Math.max(((java.lang.Number) ((jz5.n) f361305f).mo141623x754a37bb()).floatValue(), f27));
        float f28 = 67108864 / (min * f19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "calculate gc_factor automatically unit = [" + (f19 / 1024.0f) + "]kb limit = [65536]kb system = [" + (floatValue2 / 1024) + "]kb raw = [" + min + ':' + f27 + "] actually = [" + f28 + ']');
        java.lang.Float valueOf = java.lang.Float.valueOf(f28);
        f361304e = valueOf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
        return valueOf.floatValue();
    }
}
