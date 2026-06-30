package com.p314xaae8f345.mm.p872xbfc2bd01;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p872xbfc2bd01.g f150492d;

    public e(com.p314xaae8f345.mm.p872xbfc2bd01.g gVar) {
        this.f150492d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            com.p314xaae8f345.mm.p872xbfc2bd01.g gVar = this.f150492d;
            java.util.Vector vector = gVar.f150494b;
            if (vector.size() <= 0) {
                return;
            }
            java.lang.System.currentTimeMillis();
            int i17 = 0;
            com.p314xaae8f345.mm.p872xbfc2bd01.f fVar = (com.p314xaae8f345.mm.p872xbfc2bd01.f) vector.remove(0);
            com.p314xaae8f345.mm.p872xbfc2bd01.d j17 = gVar.j(gVar.i(fVar.c()));
            long b17 = fVar.b();
            int a17 = fVar.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BucketPool", "%s preload start preloadSize: %s sizeInBytes: %s  preLoadBytes: %s and nums: %s", gVar, fVar.c(), gVar.i(fVar.c()), java.lang.Long.valueOf(b17), java.lang.Integer.valueOf(a17));
            long j18 = 0;
            while (gVar.f150495c < gVar.h() && ((b17 <= 0 || j18 < b17) && (a17 <= 0 || i17 < a17))) {
                java.lang.Object b18 = gVar.b(fVar.c());
                ((java.util.concurrent.ConcurrentLinkedQueue) j17.f150490a).add(b18);
                j18 += gVar.e(b18);
                i17++;
                long e17 = gVar.e(b18);
                synchronized (gVar) {
                    gVar.f150495c += e17;
                }
            }
            java.lang.System.currentTimeMillis();
            ((java.util.concurrent.ConcurrentLinkedQueue) j17.f150490a).size();
            ((java.util.concurrent.ConcurrentSkipListMap) gVar.f150493a).put(gVar.i(fVar.c()), j17);
        }
    }
}
