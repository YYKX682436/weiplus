package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static int f94252d;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.brandservice.ui.timeline.preload.h f94249a = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.h();

    /* renamed from: b, reason: collision with root package name */
    public static final int f94250b = java.lang.Runtime.getRuntime().availableProcessors();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f94251c = java.util.concurrent.ConcurrentHashMap.newKeySet();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.LinkedList f94253e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Object f94254f = new java.lang.Object();

    public static final void a(com.tencent.mm.plugin.brandservice.ui.timeline.preload.h hVar, java.lang.String str, int i17) {
        hVar.getClass();
        o11.f fVar = new o11.f();
        fVar.f342078b = true;
        fVar.f342101y = kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper()) ? com.tencent.mm.sdk.platformtools.c4.f192496b.f192497a : null;
        fVar.D = hVar.c(str);
        fVar.f342077a = false;
        fVar.f342082f = com.tencent.mm.plugin.brandservice.ui.timeline.preload.c2.b(str);
        n11.a.b().i(str, null, fVar.a(), new com.tencent.mm.plugin.brandservice.ui.timeline.preload.e(i17));
    }

    public final void b() {
        synchronized (f94254f) {
            f94253e.clear();
            f94251c.clear();
            f94252d = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizImagePreloadMgr", "do clearQueue");
    }

    public final java.lang.String c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        kotlin.jvm.internal.o.d(str);
        byte[] bytes = str.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        kotlin.jvm.internal.o.f(g17, "getMessageDigest(...)");
        return g17;
    }

    public final void d(java.util.List list, int i17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2110L, 0L, 1L, false);
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        for (java.lang.String str : arrayList) {
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.h hVar = f94249a;
            kotlin.jvm.internal.o.d(str);
            android.graphics.Bitmap e17 = n11.a.b().e(hVar.c(str));
            if (!((e17 == null || e17.isRecycled()) ? false : true)) {
                synchronized (f94254f) {
                    if (f94251c.add(str)) {
                        int i18 = f94252d;
                        if (i18 >= f94250b) {
                            java.util.LinkedList linkedList = f94253e;
                            linkedList.addLast(str);
                            com.tencent.mars.xlog.Log.i("MicroMsg.BizImagePreloadMgr", "queued: " + str + ", currentRequestCount: " + f94252d + ", queueSize: " + linkedList.size());
                        } else {
                            f94252d = i18 + 1;
                            com.tencent.mars.xlog.Log.i("MicroMsg.BizImagePreloadMgr", "doStartDownload: " + str + ", currentRequestCount: " + f94252d);
                            pm0.v.X(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.g(str, i17));
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BizImagePreloadMgr", "has request or queued: " + str);
                    }
                }
            }
        }
    }
}
