package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes13.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f240489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196 f240490e;

    public m1(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196 c17265xca2bb196) {
        this.f240489d = str;
        this.f240490e = c17265xca2bb196;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.n1.f240496e;
        java.lang.String str = this.f240489d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(concurrentHashMap.get(str), java.lang.Boolean.TRUE)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.n1 n1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.n1.f240492a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsResourceManager", "releaseResource requestKey: %s", str);
            concurrentHashMap.remove(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196 c17265xca2bb196 = this.f240490e;
            java.lang.String decorationImagePath = c17265xca2bb196.f240204p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorationImagePath, "decorationImagePath");
            n1Var.c(decorationImagePath);
            java.lang.String successImagePath = c17265xca2bb196.f240205q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(successImagePath, "successImagePath");
            n1Var.c(successImagePath);
            java.lang.String scanTipsImagePath = c17265xca2bb196.f240206r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(scanTipsImagePath, "scanTipsImagePath");
            n1Var.c(scanTipsImagePath);
        }
    }
}
