package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29;

/* loaded from: classes7.dex */
public class b0 extends com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n {

    /* renamed from: c, reason: collision with root package name */
    public final ku5.f f271198c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.g f271199d;

    public b0(java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.g gVar) {
        this.f271198c = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j(this, str, 4, 4, new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.a0());
        this.f271199d = gVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n
    public ku5.f c() {
        return this.f271198c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r0 == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int g(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.u r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.f271245a
            boolean r0 = r7.d(r0)
            r1 = 0
            java.lang.String r2 = "MicroMsg.ResDownloader.NetworkWorker"
            java.lang.String r3 = r8.f271245a
            if (r0 != 0) goto L7c
            java.util.Map r0 = r7.f271225b
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L19
            goto L7c
        L19:
            int r0 = wo.p1.a()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            int r5 = r8.f271246b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r6}
            java.lang.String r6 = "currentNetType(%d), requestNetType(%d)"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6, r4)
            r4 = 2
            r6 = 1
            if (r0 != 0) goto L35
            goto L3c
        L35:
            if (r4 != r5) goto L38
            goto L3a
        L38:
            if (r0 != r6) goto L3c
        L3a:
            r0 = r6
            goto L3d
        L3c:
            r0 = r1
        L3d:
            if (r0 != 0) goto L4a
            java.lang.Object[] r8 = new java.lang.Object[]{r3}
            java.lang.String r0 = "urlKey = %s, mismatch networkType , skip task"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0, r8)
            return r6
        L4a:
            ku5.f r0 = r7.f271198c
            boolean r2 = r0.isShutdown()
            if (r2 != 0) goto L73
            boolean r2 = r0.isTerminated()
            if (r2 != 0) goto L73
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f394107d
            int r0 = r0.get()
            if (r0 >= 0) goto L62
            r2 = r6
            goto L63
        L62:
            r2 = r1
        L63:
            if (r2 != 0) goto L70
            r2 = 1610612736(0x60000000, float:3.689349E19)
            if (r0 >= r2) goto L6b
            r0 = r6
            goto L6c
        L6b:
            r0 = r1
        L6c:
            if (r0 == 0) goto L70
            r0 = r6
            goto L71
        L70:
            r0 = r1
        L71:
            if (r0 == 0) goto L74
        L73:
            r1 = r6
        L74:
            if (r1 == 0) goto L78
            r8 = 4
            return r8
        L78:
            r7.f(r8)
            return r4
        L7c:
            java.lang.Object[] r8 = new java.lang.Object[]{r3}
            java.lang.String r0 = "urlKey = %s is already queueing, skip repeated task"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.b0.g(com.tencent.mm.pluginsdk.res.downloader.model.u):int");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n
    /* renamed from: h */
    public com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.m e(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.u uVar) {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x xVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.NetworkWorker", "request.class = ".concat(uVar.getClass().getSimpleName()));
        ((yy.o) ((zy.s) i95.n0.c(zy.s.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a.getClass();
        int hashCode = uVar.c().hashCode();
        java.util.Iterator it = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.m0.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloaderCore", "plugin = %s, groupId = %s", ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.o) it.next()).getClass().getSimpleName(), "CheckResUpdate");
            if (-1894509183 == hashCode) {
                if (uVar instanceof com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "return CheckResUpdateNetworkRequestHandler");
                    xVar = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.u((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t) uVar);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "get mismatch NetworkRequest type, return null");
                }
            }
        }
        xVar = null;
        if (xVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.NetworkWorker", "get null handler from plugin, use default handler");
            xVar = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.y(uVar);
        }
        xVar.f271269g = this.f271199d;
        return xVar;
    }
}
