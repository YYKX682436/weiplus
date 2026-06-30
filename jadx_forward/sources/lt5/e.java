package lt5;

/* loaded from: classes8.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f402832a;

    /* renamed from: b, reason: collision with root package name */
    public static final lt5.f[] f402833b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean[] f402834c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f402835d;

    static {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        f402832a = concurrentHashMap;
        f402833b = new lt5.f[]{null};
        f402834c = new boolean[]{false};
        concurrentHashMap.put("FF5E66B", new lt5.d(new mt5.q()));
        concurrentHashMap.put("C1AAFC7", new lt5.d(new mt5.g()));
        concurrentHashMap.put("B2F39F1", new lt5.d(new mt5.d()));
        concurrentHashMap.put("E389A21", new lt5.d(new mt5.j()));
        concurrentHashMap.put("750379B", new lt5.d(new mt5.j()));
        concurrentHashMap.put("C892BA2", new lt5.d(new mt5.m()));
        concurrentHashMap.put("7CD3AF2", new lt5.d(new mt5.m()));
        concurrentHashMap.put("C1F2239", new lt5.d(new mt5.a()));
        concurrentHashMap.put("936AA2D", new lt5.d(new mt5.a()));
        concurrentHashMap.put("B09207F", new lt5.d(new mt5.p()));
        concurrentHashMap.put("43780D5", new lt5.d(new mt5.m()));
        concurrentHashMap.put("22C4185", new lt5.d(new mt5.k()));
        concurrentHashMap.put("FE54627", new lt5.d(new mt5.n()));
        concurrentHashMap.put("22792AF", new lt5.d(new mt5.l()));
        concurrentHashMap.put("7675ECA", new lt5.d(new mt5.r()));
        concurrentHashMap.put("58749C2", new lt5.d(new mt5.b()));
        concurrentHashMap.put("750BD40", new lt5.d(new mt5.b()));
        concurrentHashMap.put("14BB28A", new lt5.d(new mt5.b()));
        concurrentHashMap.put("KUBISAI", new lt5.d(new mt5.i()));
        concurrentHashMap.put("TESTID0", new lt5.d(new mt5.o()));
        f402835d = "";
        try {
            java.lang.String substring = nt5.a.a(android.os.Build.MANUFACTURER.toLowerCase().getBytes()).substring(0, 7);
            f402835d = substring;
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("MicroMsg.MsaIdManager", "start %s", substring);
        } catch (java.lang.Throwable unused) {
        }
    }

    public static synchronized void a(android.content.Context context) {
        boolean z17;
        synchronized (lt5.e.class) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("MicroMsg.MsaIdManager", "[+] asyncInit called.");
            boolean[] zArr = f402834c;
            synchronized (zArr) {
                synchronized (zArr) {
                    z17 = zArr[0];
                }
            }
            if (z17) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("MicroMsg.MsaIdManager", "[!] Initializing before, ignore this invocation. call_stack: %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                return;
            }
            synchronized (zArr) {
                zArr[0] = true;
            }
            lt5.d dVar = (lt5.d) ((java.util.concurrent.ConcurrentHashMap) f402832a).get(b(context));
            if (dVar != null) {
                ((ku5.t0) ku5.t0.f394148d).j(new lt5.c(dVar, context), "sn-msa-init-waiter");
                return;
            }
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("MicroMsg.MsaIdManager", "[-] asyncInit, Unsupport device.");
            lt5.f[] fVarArr = f402833b;
            synchronized (fVarArr) {
                fVarArr[0] = lt5.f.a(-10);
            }
            d();
        }
    }

    public static java.lang.String b(android.content.Context context) {
        boolean z17;
        java.lang.String str;
        boolean z18;
        if (mt5.c.b()) {
            return "58749C2";
        }
        boolean z19 = false;
        try {
            z17 = ((java.lang.Boolean) java.lang.Class.forName("android.tencent.sdid.TencentIdentifierManager").getMethod("isSupported", new java.lang.Class[0]).invoke(context.getSystemService("tencent_identifier"), new java.lang.Object[0])).booleanValue();
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("TuringMSa", "support = " + z17);
        } catch (java.lang.Throwable unused) {
            z17 = false;
        }
        if (z17) {
            return "TESTID0";
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            str = (java.lang.String) cls.getMethod("get", java.lang.String.class, java.lang.String.class).invoke(cls, "ro.odm.manufacturer", "");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("TuringMSa", th6, "error");
            str = null;
        }
        if ("PRIZE".equalsIgnoreCase(str != null ? str : "")) {
            return "KUBISAI";
        }
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            android.content.Intent intent = new android.content.Intent("com.hihonor.id.HnOaIdService");
            intent.setPackage("com.hihonor.id");
            z18 = !packageManager.queryIntentServices(intent, 0).isEmpty();
        } catch (java.lang.Exception unused2) {
            z18 = false;
        }
        if (z18) {
            return "B2F39F1";
        }
        java.util.Map map = f402832a;
        java.lang.String str2 = f402835d;
        if (!((java.util.concurrent.ConcurrentHashMap) map).containsKey(str2)) {
            java.lang.String[] strArr = {"com.huawei.hwid", "com.huawei.hms", "com.huawei.hwid.tv"};
            android.content.pm.PackageManager packageManager2 = context.getPackageManager();
            int i17 = 0;
            while (true) {
                if (i17 >= 3) {
                    break;
                }
                if (packageManager2.getPackageInfo(strArr[i17], 0) != null) {
                    z19 = true;
                    break;
                }
                i17++;
            }
            if (z19 && ((java.util.concurrent.ConcurrentHashMap) map).containsKey("C1AAFC7")) {
                return "C1AAFC7";
            }
        }
        return str2;
    }

    public static synchronized lt5.f c(android.content.Context context) {
        boolean z17;
        lt5.f fVar;
        lt5.f fVar2;
        lt5.f a17;
        lt5.f a18;
        int i17;
        synchronized (lt5.e.class) {
            lt5.f[] fVarArr = f402833b;
            synchronized (fVarArr) {
                lt5.f fVar3 = fVarArr[0];
                if (fVar3 != null && (i17 = fVar3.f402837b) != -12) {
                    com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("MicroMsg.MsaIdManager", "[+] getOAID, hit cache, errcode: %s, oaid: %s", java.lang.Integer.valueOf(i17), fVarArr[0].f402836a);
                    return fVarArr[0];
                }
                boolean[] zArr = f402834c;
                synchronized (zArr) {
                    z17 = zArr[0];
                }
                if (z17) {
                    com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("MicroMsg.MsaIdManager", "[!] still initializing, skip rest logic.");
                    synchronized (fVarArr) {
                        a18 = lt5.f.a(-12);
                        fVarArr[0] = a18;
                    }
                    return a18;
                }
                lt5.d dVar = (lt5.d) ((java.util.concurrent.ConcurrentHashMap) f402832a).get(b(context));
                if (dVar == null) {
                    synchronized (fVarArr) {
                        fVarArr[0] = lt5.f.a(-10);
                        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("MicroMsg.MsaIdManager", "[!] getOAID, unsupported device.");
                        fVar = fVarArr[0];
                    }
                    return fVar;
                }
                int i18 = dVar.f402831b;
                if (i18 > 5) {
                    synchronized (fVarArr) {
                        fVarArr[0] = lt5.f.a(-13);
                        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("MicroMsg.MsaIdManager", "[!] getOAID, too many attempts.");
                        fVar2 = fVarArr[0];
                    }
                    return fVar2;
                }
                dVar.f402831b = i18 + 1;
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("MicroMsg.MsaIdManager", "[!] getOAID, no cached res, trigger async init now.");
                a(context);
                synchronized (fVarArr) {
                    a17 = lt5.f.a(-12);
                    fVarArr[0] = a17;
                }
                return a17;
            }
        }
    }

    public static void d() {
        boolean[] zArr = f402834c;
        synchronized (zArr) {
            zArr[0] = false;
        }
    }
}
