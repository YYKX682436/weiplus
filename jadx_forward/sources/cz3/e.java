package cz3;

/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final cz3.e f306560a;

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f306561b;

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 f306562c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f306563d;

    /* renamed from: e, reason: collision with root package name */
    public static final kk.j f306564e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f306565f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f306566g;

    static {
        cz3.e eVar = new cz3.e();
        f306560a = eVar;
        f306563d = new java.util.HashMap();
        f306564e = new jt0.j(20);
        f306565f = jz5.h.b(cz3.c.f306558d);
        f306566g = jz5.h.b(cz3.d.f306559d);
        if (eVar.c()) {
            try {
                boolean a17 = gm0.j1.a();
                if (a17 && f306561b == null) {
                    java.lang.String str = c01.z1.r() + "scan_crash_protect_mmkv";
                    f306561b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(str);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(str);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
                    f306562c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.v3(M, eVar.d());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFileCrashManager", "initMMKV %s, mmkv: %s", java.lang.Boolean.valueOf(a17), f306561b);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanFileCrashManager", e17, "checkInitMMKV exception", new java.lang.Object[0]);
            }
        }
        if (f306560a.c()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f306561b;
            int i17 = o4Var != null ? o4Var.getInt("key_client_version", 0) : 0;
            int i18 = o45.wf.f424562g;
            if (i17 != i18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanFileCrashManager", "initCrashInfo clientVersion not the same, and clear crash info. last: %X, current: %X", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = f306562c;
                if (v3Var != null) {
                    v3Var.a();
                }
                f306564e.mo143584x5a5b64d();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = f306561b;
                if (o4Var2 != null) {
                    o4Var2.putInt("key_client_version", i18);
                }
            }
        }
    }

    public static final r45.tu5 a(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        byte[] j17;
        try {
            r45.tu5 tu5Var = (r45.tu5) ((lt0.f) f306564e).i(str);
            if (tu5Var == null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = f306562c;
                if (v3Var == null || (o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) v3Var.i()) == null) {
                    return null;
                }
                if (o4Var.f(str) && (j17 = o4Var.j(str)) != null) {
                    if (!(j17.length == 0)) {
                        try {
                            java.lang.Object newInstance = r45.tu5.class.newInstance();
                            ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance).mo11468x92b714fd(j17);
                            fVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance;
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                        }
                        tu5Var = (r45.tu5) fVar;
                    }
                }
                fVar = null;
                tu5Var = (r45.tu5) fVar;
            }
            return tu5Var;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final java.lang.String b(kd0.a aVar, java.lang.String str) {
        return "key_crash_info-" + aVar.f388132d + '-' + str;
    }

    public static final void e(java.lang.String str, r45.tu5 tu5Var) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = f306562c;
        if (v3Var != null && (o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) v3Var.i()) != null) {
            o4Var.H(str, tu5Var.mo14344x5f01b1f6());
        }
        ((lt0.f) f306564e).put(str, tu5Var);
    }

    public final boolean c() {
        return ((java.lang.Boolean) f306565f.mo141623x754a37bb()).booleanValue();
    }

    public final long d() {
        return ((java.lang.Number) f306566g.mo141623x754a37bb()).longValue();
    }
}
