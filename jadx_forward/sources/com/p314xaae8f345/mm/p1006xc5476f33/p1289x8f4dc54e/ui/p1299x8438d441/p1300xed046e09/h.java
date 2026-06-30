package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static int f175785d;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h f175782a = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h();

    /* renamed from: b, reason: collision with root package name */
    public static final int f175783b = java.lang.Runtime.getRuntime().availableProcessors();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f175784c = java.util.concurrent.ConcurrentHashMap.newKeySet();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.LinkedList f175786e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Object f175787f = new java.lang.Object();

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h hVar, java.lang.String str, int i17) {
        hVar.getClass();
        o11.f fVar = new o11.f();
        fVar.f423611b = true;
        fVar.f423634y = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper()) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b.f274030a : null;
        fVar.D = hVar.c(str);
        fVar.f423610a = false;
        fVar.f423615f = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c2.b(str);
        n11.a.b().i(str, null, fVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e(i17));
    }

    public final void b() {
        synchronized (f175787f) {
            f175786e.clear();
            f175784c.clear();
            f175785d = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizImagePreloadMgr", "do clearQueue");
    }

    public final java.lang.String c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        byte[] bytes = str.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getMessageDigest(...)");
        return g17;
    }

    public final void d(java.util.List list, int i17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(2110L, 0L, 1L, false);
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        for (java.lang.String str : arrayList) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h hVar = f175782a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            android.graphics.Bitmap e17 = n11.a.b().e(hVar.c(str));
            if (!((e17 == null || e17.isRecycled()) ? false : true)) {
                synchronized (f175787f) {
                    if (f175784c.add(str)) {
                        int i18 = f175785d;
                        if (i18 >= f175783b) {
                            java.util.LinkedList linkedList = f175786e;
                            linkedList.addLast(str);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizImagePreloadMgr", "queued: " + str + ", currentRequestCount: " + f175785d + ", queueSize: " + linkedList.size());
                        } else {
                            f175785d = i18 + 1;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizImagePreloadMgr", "doStartDownload: " + str + ", currentRequestCount: " + f175785d);
                            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.g(str, i17));
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizImagePreloadMgr", "has request or queued: " + str);
                    }
                }
            }
        }
    }
}
