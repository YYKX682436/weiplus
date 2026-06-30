package pv3;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final pv3.f f440122a = new pv3.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f440123b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f440124c = jz5.h.b(pv3.e.f440121d);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f440125d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f440126e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static c50.x0 f440127f;

    public final void a(long j17, iv3.a aVar) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f440126e;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new java.util.LinkedList()))) != null) {
            obj = putIfAbsent;
        }
        ((java.util.LinkedList) obj).add(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a r25, iv3.a r26) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pv3.f.b(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo, iv3.a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r16, java.lang.String r18, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a r19) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pv3.f.c(long, java.lang.String, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo):void");
    }

    public final boolean d(java.lang.String str) {
        return o35.a.b(str) && o35.a.g(str) > 0;
    }

    public final void e(boolean z17, lv3.a aVar) {
        long j17 = aVar.f403041a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MusicCacheManager", "[notifyVideoFinish] success:" + z17 + " key:" + pm0.v.u(j17));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f440126e;
        java.util.LinkedList linkedList = (java.util.LinkedList) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((iv3.a) it.next()).a(z17, aVar);
            }
        }
        concurrentHashMap.remove(java.lang.Long.valueOf(j17));
    }
}
