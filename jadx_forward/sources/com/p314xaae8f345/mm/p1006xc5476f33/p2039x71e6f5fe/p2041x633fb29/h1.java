package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes13.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i1 f240451d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f240452e;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i1 info, yz5.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f240451d = info;
        this.f240452e = callback;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i1 i1Var = this.f240451d;
        java.lang.String str = i1Var.f240467a;
        java.lang.String str2 = i1Var.f240467a;
        i1Var.f240469c = 1;
        android.graphics.Bitmap bitmap = null;
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            try {
                bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str2, null);
                if (bitmap == null || bitmap.isRecycled()) {
                    i1Var.f240468b = 3;
                } else {
                    i1Var.f240468b = 0;
                }
                if (bitmap != null) {
                    bitmap.getAllocationByteCount();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanGoodsResourceManager", e17, "decodeImage exception", new java.lang.Object[0]);
                i1Var.f240468b = 3;
            }
            i1Var.f240469c = 2;
            if (bitmap != null && !bitmap.isRecycled()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.n1.f240495d.put(str2, bitmap);
            }
        } else {
            i1Var.f240468b = 2;
            i1Var.f240469c = 2;
        }
        this.f240452e.mo149xb9724478(i1Var, bitmap);
    }
}
