package j65;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.r6 f379451g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.r6 f379452h;

    /* renamed from: i, reason: collision with root package name */
    public static final fp.h0 f379453i;

    /* renamed from: a, reason: collision with root package name */
    public long f379454a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f379455b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f379456c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final org.json.JSONObject f379457d = new org.json.JSONObject();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379458e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f379459f = 0;

    static {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir(), "uncompressed_base_strings");
        f379451g = r6Var;
        f379452h = new com.p314xaae8f345.mm.vfs.r6(r6Var, "96b2c56e4056b923191227d71602c0ce");
        f379453i = new fp.h0("UncompressBaseResStrings");
    }

    public b() {
        f();
    }

    public static java.lang.String a(java.lang.String str) {
        return str + ".mmstr";
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair c(java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j65.b.c(java.lang.String, java.lang.String):android.util.Pair");
    }

    public static boolean g(java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f274380a.contains(str) && !"language_default".equals(str)) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = f379452h;
            if (!r6Var.m()) {
                return true;
            }
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(a(str), false, true);
            com.p314xaae8f345.mm.vfs.z7 z7Var = r6Var == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : r6Var.f294699d;
            if (l17 != null && !l17.isEmpty()) {
                java.lang.String str2 = z7Var.f294812f;
                z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, str2 + '/' + l17, z7Var.f294813g, z7Var.f294814h);
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null);
            if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseStringsOpener", "shouldUpdateUncompressStrings true, %s not exists", a(str));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x032f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair h(java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j65.b.h(java.lang.String, java.lang.String, java.lang.String):android.util.Pair");
    }

    public boolean b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f379455b;
        boolean z17 = false;
        if (j17 == 0) {
            return false;
        }
        if (currentTimeMillis - j17 >= 1800000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseStringsOpener", "isInvalid: cache duration expired, resetting failure state");
            this.f379455b = 0L;
            this.f379456c = 0;
            return false;
        }
        long j18 = currentTimeMillis - j17;
        boolean z18 = this.f379456c > 3;
        boolean z19 = j18 >= 300000;
        if (z18 && z19) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseStringsOpener", "isInvalid: %b (failure count = %d, time since first failure = %d ms, min cooldown passed = %b)", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f379456c), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(z19));
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
    
        if (g(r19) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream d(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j65.b.d(java.lang.String):java.io.InputStream");
    }

    public void e(java.lang.Boolean bool, java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f274380a.contains(str) || "language_default".equals(str)) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!bool.booleanValue() || currentTimeMillis - this.f379454a >= 1800000) {
            ((fm.h) ((k65.j) i95.n0.c(k65.j.class))).getClass();
            if (com.p314xaae8f345.mm.app.w.INSTANCE.f135422n) {
                this.f379454a = currentTimeMillis;
                k65.j jVar = (k65.j) i95.n0.c(k65.j.class);
                org.json.JSONObject stepJson = this.f379457d;
                java.lang.String errorMsg = this.f379458e;
                long j17 = this.f379459f;
                fm.h hVar = (fm.h) jVar;
                hVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stepJson, "stepJson");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
                j65.p[] pVarArr = j65.p.f379504d;
                int optInt = stepJson.optInt("SuccessStep");
                if (optInt == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseStringResFeatureService", "reportLoadStep record mmkv");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong("mmkv_base_string_record_empty", java.lang.System.currentTimeMillis());
                }
                if (optInt == 1) {
                    long j18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("mmkv_base_string_record_empty", 0L);
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseStringResFeatureService", "reportLoadStep emptyLoadCost: " + currentTimeMillis2 + " lastEmptyTimeStamp: " + j18);
                    if (j18 > 0 && currentTimeMillis2 > 0) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong("mmkv_base_string_record_empty", 0L);
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6693xbd9eeeab Ai = hVar.Ai();
                        fm.a[] aVarArr = fm.a.f345494d;
                        Ai.f140309g = 5;
                        Ai.p(java.lang.String.valueOf(currentTimeMillis2));
                        Ai.k();
                    }
                }
                java.lang.String jSONObject = stepJson.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                java.lang.String t17 = r26.i0.t(jSONObject, ",", ";", false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseStringResFeatureService", "reportLoadStep step: " + t17 + ", errorMsg: " + errorMsg + " , cost: " + j17);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6693xbd9eeeab Ai2 = hVar.Ai();
                Ai2.f140314l = Ai2.b("loadStep", t17, true);
                Ai2.f140313k = Ai2.b("errMsg", errorMsg, true);
                fm.a[] aVarArr2 = fm.a.f345494d;
                Ai2.f140309g = 2;
                Ai2.p(java.lang.String.valueOf(j17));
                Ai2.k();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseStringResFeatureService", "reportLoadStep done");
            }
        }
    }

    public final void f() {
        org.json.JSONObject jSONObject = this.f379457d;
        this.f379458e = "";
        this.f379459f = 0L;
        try {
            j65.p[] pVarArr = j65.p.f379504d;
            jSONObject.put("CheckUncompressStringsStep", 0);
            j65.p[] pVarArr2 = j65.p.f379504d;
            jSONObject.put("CheckUDRResourceStep", 0);
            j65.p[] pVarArr3 = j65.p.f379504d;
            jSONObject.put("Un7zStep", 0);
            j65.p[] pVarArr4 = j65.p.f379504d;
            jSONObject.put("MoveStep", 0);
            j65.p[] pVarArr5 = j65.p.f379504d;
            jSONObject.put("SuccessStep", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseStringsOpener", "Failed to initialize resourceLoadStep", e17);
        }
    }
}
