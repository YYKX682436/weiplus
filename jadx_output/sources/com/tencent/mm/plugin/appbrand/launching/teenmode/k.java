package com.tencent.mm.plugin.appbrand.launching.teenmode;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.teenmode.k f85200a = new com.tencent.mm.plugin.appbrand.launching.teenmode.k();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f85201b = new java.util.HashMap();

    public static final void c(java.lang.String str) {
        if (!(str == null || str.length() == 0) && ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Di(str, new com.tencent.mm.plugin.appbrand.launching.teenmode.b(new com.tencent.mm.plugin.appbrand.launching.teenmode.i(str)));
        }
    }

    public static final void d(java.lang.String str) {
        if (!(str == null || str.length() == 0) && ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Di(str, new com.tencent.mm.plugin.appbrand.launching.teenmode.b(new com.tencent.mm.plugin.appbrand.launching.teenmode.j(str)));
        }
    }

    public final void a(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.HashMap hashMap = f85201b;
        java.lang.String b17 = b(str, i17);
        com.tencent.mm.plugin.appbrand.launching.teenmode.a aVar = new com.tencent.mm.plugin.appbrand.launching.teenmode.a();
        kotlin.jvm.internal.o.g(str, "<set-?>");
        aVar.f85190a = str;
        hashMap.put(b17, aVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTeenModeReporter", "addCollection %s, %d, %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(hashMap.size()));
    }

    public final java.lang.String b(java.lang.String str, int i17) {
        return str + ',' + i17;
    }

    public final void e(java.util.ArrayList arrayList) {
        f85201b.clear();
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo appBrandRecentTaskInfo = (com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) it.next();
                if (appBrandRecentTaskInfo != null) {
                    java.lang.String str = appBrandRecentTaskInfo.f76361d;
                    if (!(str == null || str.length() == 0)) {
                        int i17 = appBrandRecentTaskInfo.f76363f;
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTeenModeReporter", "getAllCollectionList info: %s, %d", str, java.lang.Integer.valueOf(i17));
                        f85200a.a(str, i17);
                    }
                }
            }
        }
    }
}
