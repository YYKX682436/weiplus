package com.tencent.mm.plugin.expansions;

/* loaded from: classes13.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f99751a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static volatile z95.c f99752b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile y95.a f99753c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f99754d;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        f99754d = new java.util.concurrent.CopyOnWriteArrayList();
        f99752b = new com.tencent.mm.plugin.expansions.d0();
        com.tencent.mm.plugin.expansions.h0 c17 = com.tencent.mm.plugin.expansions.h0.c();
        f99753c = new y95.a(c17, new com.tencent.mm.plugin.expansions.g0(c17));
    }

    public static void a() {
        com.tencent.mm.plugin.expansions.Delivery.dumpAppClassLoader();
    }

    public static java.util.concurrent.Future b(l30.a aVar) {
        if (com.tencent.mm.plugin.expansions.Delivery.isEnabled()) {
            return com.tencent.mm.plugin.expansions.Delivery.getAssets(aVar);
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (aVar != null) {
            android.content.res.AssetManager assetManager = f99752b.getAssets();
            kotlin.jvm.internal.o.g(assetManager, "assetManager");
            yz5.l lVar = ((com.tencent.mm.plugin.expansions.u) aVar).f99775a.f99777a;
            if (lVar != null) {
                lVar.invoke(assetManager);
            }
        }
        return f99753c.f460408a;
    }

    public static java.util.concurrent.Future c(l30.g gVar) {
        if (com.tencent.mm.plugin.expansions.Delivery.isEnabled()) {
            return com.tencent.mm.plugin.expansions.Delivery.install(gVar);
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (gVar != null) {
            gVar.a(f99752b);
        }
        return f99753c.f460408a;
    }

    public static boolean d() {
        if (com.tencent.mm.plugin.expansions.Delivery.isEnabled()) {
            return com.tencent.mm.plugin.expansions.Delivery.isInstalled();
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return true;
    }

    public static java.util.concurrent.Future e(boolean z17) {
        if (com.tencent.mm.plugin.expansions.Delivery.isEnabled()) {
            return com.tencent.mm.plugin.expansions.Delivery.request();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("request expansions, isInstalling = true, isForce = ");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.exp.Expansions", sb6.toString());
        return f99753c.f460408a;
    }

    public static boolean f(boolean z17) {
        if (com.tencent.mm.plugin.expansions.Delivery.isEnabled()) {
            return com.tencent.mm.plugin.expansions.Delivery.requestSync(z17);
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return true;
    }

    public static boolean g(java.lang.String str) {
        if (com.tencent.mm.plugin.expansions.Delivery.isEnabled()) {
            if (com.tencent.mm.plugin.expansions.Delivery.tryLoadLibrary(str, false)) {
                return true;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.exp.Expansions", "tryLoadLibrary with delivery fail, fallback to legacy!");
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f99754d;
        if (copyOnWriteArrayList.contains(str)) {
            return true;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/expansions/JExpansions", "tryLoadLibrary", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mm/plugin/expansions/JExpansions", "tryLoadLibrary", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            copyOnWriteArrayList.add(str);
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.exp.Expansions", "tryLoadLibrary fail, error = " + th6.getMessage());
            return false;
        }
    }

    public static void h(java.lang.String str) {
        if (com.tencent.mm.plugin.expansions.Delivery.isEnabled()) {
            com.tencent.mm.plugin.expansions.Delivery.updateLang(str);
        }
    }
}
