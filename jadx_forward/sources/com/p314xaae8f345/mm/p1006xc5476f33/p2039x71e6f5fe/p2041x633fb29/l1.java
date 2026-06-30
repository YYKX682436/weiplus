package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes13.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196 f240482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f240483e;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196 c17265xca2bb196, long j17) {
        this.f240482d = c17265xca2bb196;
        this.f240483e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.n1 n1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.n1.f240492a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196 c17265xca2bb196 = this.f240482d;
        java.lang.String format = java.lang.String.format("deco:%s,succ:%s,tips:%s", java.util.Arrays.copyOf(new java.lang.Object[]{c17265xca2bb196.f240204p, c17265xca2bb196.f240205q, c17265xca2bb196.f240206r}, 3));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.n1.f240496e;
        if (concurrentHashMap.containsKey(format)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsResourceManager", "loadResource set can not release");
            concurrentHashMap.put(format, java.lang.Boolean.FALSE);
        }
        long j17 = this.f240483e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196 c17265xca2bb1962 = this.f240482d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String decorationImagePath = c17265xca2bb1962.f240204p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorationImagePath, "decorationImagePath");
        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i1(decorationImagePath));
        java.lang.String successImagePath = c17265xca2bb1962.f240205q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(successImagePath, "successImagePath");
        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i1(successImagePath));
        java.lang.String scanTipsImagePath = c17265xca2bb1962.f240206r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(scanTipsImagePath, "scanTipsImagePath");
        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i1(scanTipsImagePath));
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.g1 g1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.g1(j17, arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsResourceManager", "batchDecodeImage start");
        boolean z17 = false;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i1 i1Var : g1Var.f240444b) {
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.n1.f240495d.get(i1Var.f240467a);
            if (bitmap == null || bitmap.isRecycled()) {
                ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h1(i1Var, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.k1(g1Var)));
                z17 = true;
            } else {
                i1Var.f240469c = 2;
                i1Var.f240468b = 0;
            }
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsResourceManager", "batchDecodeImage use cache no need to decode");
        n1Var.b(g1Var.f240443a, 0, "ok");
    }
}
