package d85;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static long f308689e;

    /* renamed from: a, reason: collision with root package name */
    public static final d85.f f308685a = new d85.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f308686b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f308687c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f308688d = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f308690f = jz5.h.b(d85.e.f308681d);

    public static final void a(d85.f fVar, int i17, int i18, java.lang.String str) {
        fVar.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5224x8e522367 c5224x8e522367 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5224x8e522367();
        am.o1 o1Var = c5224x8e522367.f135557g;
        o1Var.f89035a = i17;
        o1Var.f89036b = i18;
        o1Var.f89037c = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CameraHooker", "publish event type:" + i17 + " event:" + c5224x8e522367 + " scene:" + str);
        c5224x8e522367.e();
    }

    public static final void b(d85.f fVar, java.lang.String str, java.lang.Throwable th6, java.lang.String... strArr) {
        fVar.getClass();
        fVar.c(str, th6, new java.util.LinkedHashMap(), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final void c(java.lang.String str, java.lang.Throwable th6, java.util.Map map, java.lang.String... strArr) {
        if (((java.lang.Boolean) ((jz5.n) f308690f).mo141623x754a37bb()).booleanValue()) {
            if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                th6 = null;
            }
            java.lang.String[] strArr2 = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length);
            java.lang.String a17 = ap.d.a();
            java.lang.String replace = th6 == null ? "" : android.util.Log.getStackTraceString(th6).replace('\n', ';').replace("\t", "");
            java.lang.String str2 = strArr2.length >= 1 ? strArr2[0] : "";
            java.lang.String str3 = strArr2.length >= 2 ? strArr2[1] : "";
            java.lang.String str4 = strArr2.length >= 3 ? strArr2[2] : "";
            java.lang.String str5 = strArr2.length >= 4 ? strArr2[3] : "";
            map.put("key5", strArr2.length >= 5 ? strArr2[4] : "");
            map.put("dev-fingerprint", android.os.Build.FINGERPRINT);
            map.put("dev-romInfo", fp.e0.a());
            java.lang.String b17 = ap.c.b(map);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompatReporter", "#reportCommon: " + str);
            ap.c.a(1, 0, str, a17, replace, str2, str3, str4, str5, b17);
        }
    }
}
