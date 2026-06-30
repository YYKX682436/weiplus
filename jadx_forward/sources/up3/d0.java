package up3;

/* loaded from: classes12.dex */
public class d0 implements tp3.c {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f511356d = tp3.b.a("\u0094³¸¦º\u009b¤·ÿ\u009c¶»\u0098¾£§¨®\u008d\u00ad©£\u008b¯¦« ");

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f511357e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f511358f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f511359g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f511360h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f511361i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.List f511362m;

    static {
        java.lang.String a17 = tp3.b.a("ý¹½¢ ©\u00ad\u008c¢¨ µé¦¨®¦");
        f511357e = a17;
        f511358f = a17 + tp3.b.a("é° ¶«");
        f511359g = a17 + tp3.b.a("ê·²¿® ¯¦");
        f511360h = a17 + tp3.b.a("è¢\u00ad «¯");
        f511361i = tp3.b.a("î±£¨");
        java.util.ArrayList arrayList = new java.util.ArrayList(16);
        f511362m = arrayList;
        arrayList.add(new up3.r());
        arrayList.add(new up3.s());
        arrayList.add(new up3.t());
        arrayList.add(new up3.u());
        arrayList.add(new up3.v());
        arrayList.add(new up3.w());
    }

    public static void a(java.lang.String str, java.lang.String str2, boolean z17) {
        i(str, str2, z17, 12347);
    }

    public static com.p314xaae8f345.mm.vfs.r6 e() {
        return up3.b.c(tp3.b.a("®°¹º\u009c") + java.lang.System.currentTimeMillis() + "." + android.os.Process.myPid(), f511361i);
    }

    public static java.lang.String[] f(java.lang.String str) {
        int indexOf = str.indexOf(64);
        if (indexOf < 0) {
            return null;
        }
        java.lang.String[] split = str.substring(indexOf + 1, str.length() - 1).toLowerCase(java.util.Locale.ENGLISH).split("\\s*;\\s*");
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
        for (int i17 = 0; i17 < split.length; i17++) {
            if (split[i17].equals("mm")) {
                split[i17] = str2;
            } else {
                split[i17] = str2 + ":" + split[i17];
            }
        }
        return split;
    }

    public static java.lang.String g(java.lang.String str) {
        java.lang.String replaceAll = str.replaceAll(h("app_base"), up3.b.e().r()).replaceAll(h("app_data"), lp0.b.X()).replaceAll(h("ext_data"), lp0.b.e0()).replaceAll(h("abi"), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k ? "arm64-v8a" : "armeabi-v7a").replaceAll(h("arch"), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k ? "arm64" : "arm").replaceAll(h("lib_arch"), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k ? "lib64" : com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428);
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("flutterPrivate/profiler"), true);
        java.lang.String h17 = h("flutter_profiler");
        if (i17 == null) {
            i17 = "";
        }
        java.lang.String replaceAll2 = replaceAll.replaceAll(h17, i17);
        java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("flutter_snapshot"), true);
        return new java.io.File(replaceAll2.replaceAll(h("flutter_snapshot"), i18 != null ? i18 : "")).getCanonicalPath();
    }

    public static java.lang.String h(java.lang.String str) {
        return "(?<![$\\\\])\\$\\{" + str.replaceAll("\\$", "\\\\$").replaceAll("\\{", "\\\\{").replaceAll("\\}", "\\\\}").replaceAll("\\.", "\\\\.").replaceAll("\\?", "\\\\?").replaceAll("\\*", "\\\\*") + "\\}";
    }

    public static void i(java.lang.String str, java.lang.String str2, boolean z17, int i17) {
        try {
            com.p314xaae8f345.mm.app.i3.c(str2, i17, gm0.j1.b().h(), str, null, new up3.x(z17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(f511356d, th6, "Failure.", new java.lang.Object[0]);
        }
    }

    @Override // tp3.c
    public java.lang.String b() {
        return f511357e;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0063  */
    @Override // tp3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.util.Map r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: up3.d0.c(java.util.Map):void");
    }

    @Override // tp3.c
    public void d() {
        up3.b0 b0Var = new up3.b0(null);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        try {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter(up3.b0.f511344a);
            if (fp.h.a(33)) {
                context.registerReceiver(b0Var, intentFilter, com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a(), null);
            } else {
                context.registerReceiver(b0Var, intentFilter, com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a(), null, 4);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(f511356d, th6, "Explained by code.", new java.lang.Object[0]);
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        up3.z zVar = new up3.z(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(zVar, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, null);
    }
}
