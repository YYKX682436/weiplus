package k91;

/* loaded from: classes7.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f387094a = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("com.tencent.mm.plugin.appbrand.config.AppDebugInfoHelper");

    public static boolean a(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f387094a;
        boolean z17 = o4Var.getBoolean(str + "ENABLE_AUDITS_FLAG", false);
        o4Var.putBoolean(str + "ENABLE_AUDITS_FLAG", false);
        return z17;
    }

    public static void b(java.lang.String str, boolean z17) {
        f387094a.putBoolean(str + "_AppDebugEnabled", z17);
    }
}
