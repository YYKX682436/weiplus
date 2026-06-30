package com.tencent.mm.memory;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.memory.g f68959d;

    public e(com.tencent.mm.memory.g gVar) {
        this.f68959d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            com.tencent.mm.memory.g gVar = this.f68959d;
            java.util.Vector vector = gVar.f68961b;
            if (vector.size() <= 0) {
                return;
            }
            java.lang.System.currentTimeMillis();
            int i17 = 0;
            com.tencent.mm.memory.f fVar = (com.tencent.mm.memory.f) vector.remove(0);
            com.tencent.mm.memory.d j17 = gVar.j(gVar.i(fVar.c()));
            long b17 = fVar.b();
            int a17 = fVar.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.BucketPool", "%s preload start preloadSize: %s sizeInBytes: %s  preLoadBytes: %s and nums: %s", gVar, fVar.c(), gVar.i(fVar.c()), java.lang.Long.valueOf(b17), java.lang.Integer.valueOf(a17));
            long j18 = 0;
            while (gVar.f68962c < gVar.h() && ((b17 <= 0 || j18 < b17) && (a17 <= 0 || i17 < a17))) {
                java.lang.Object b18 = gVar.b(fVar.c());
                ((java.util.concurrent.ConcurrentLinkedQueue) j17.f68957a).add(b18);
                j18 += gVar.e(b18);
                i17++;
                long e17 = gVar.e(b18);
                synchronized (gVar) {
                    gVar.f68962c += e17;
                }
            }
            java.lang.System.currentTimeMillis();
            ((java.util.concurrent.ConcurrentLinkedQueue) j17.f68957a).size();
            ((java.util.concurrent.ConcurrentSkipListMap) gVar.f68960a).put(gVar.i(fVar.c()), j17);
        }
    }
}
