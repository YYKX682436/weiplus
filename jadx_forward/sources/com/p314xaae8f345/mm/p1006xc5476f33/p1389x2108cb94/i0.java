package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

/* loaded from: classes13.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f181284a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static volatile z95.c f181285b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile y95.a f181286c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f181287d;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        f181287d = new java.util.concurrent.CopyOnWriteArrayList();
        f181285b = new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.d0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.h0 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.h0.c();
        f181286c = new y95.a(c17, new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.g0(c17));
    }

    public static void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55115x3c6695de();
    }

    public static java.util.concurrent.Future b(l30.a aVar) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55128x7d80d2b7()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55120x11279679(aVar);
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (aVar != null) {
            android.content.res.AssetManager assetManager = f181285b.mo55159x11279679();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assetManager, "assetManager");
            yz5.l lVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.u) aVar).f181308a.f181310a;
            if (lVar != null) {
                lVar.mo146xb9724478(assetManager);
            }
        }
        return f181286c.f541941a;
    }

    public static java.util.concurrent.Future c(l30.g gVar) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55128x7d80d2b7()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55127x74ae259b(gVar);
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (gVar != null) {
            gVar.a(f181285b);
        }
        return f181286c.f541941a;
    }

    public static boolean d() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55128x7d80d2b7()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55129x47f87970();
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return true;
    }

    public static java.util.concurrent.Future e(boolean z17) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55128x7d80d2b7()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55137x414ef28f();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("request expansions, isInstalling = true, isForce = ");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exp.Expansions", sb6.toString());
        return f181286c.f541941a;
    }

    public static boolean f(boolean z17) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55128x7d80d2b7()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55138x448ca1ca(z17);
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return true;
    }

    public static boolean g(java.lang.String str) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55128x7d80d2b7()) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55143x8090dc3a(str, false)) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exp.Expansions", "tryLoadLibrary with delivery fail, fallback to legacy!");
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f181287d;
        if (copyOnWriteArrayList.contains(str)) {
            return true;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/expansions/JExpansions", "tryLoadLibrary", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mm/plugin/expansions/JExpansions", "tryLoadLibrary", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            copyOnWriteArrayList.add(str);
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exp.Expansions", "tryLoadLibrary fail, error = " + th6.getMessage());
            return false;
        }
    }

    public static void h(java.lang.String str) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55128x7d80d2b7()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55145xee58b257(str);
        }
    }
}
