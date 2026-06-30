package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes13.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.n1 f240492a = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.n1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f240493b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f240494c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f240495d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f240496e = new java.util.concurrent.ConcurrentHashMap();

    public final android.graphics.Bitmap a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return (android.graphics.Bitmap) f240495d.get(str);
    }

    public final void b(long j17, int i17, java.lang.String errMsg) {
        java.util.HashMap hashMap = f240493b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.f1 f1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.f1) hashMap.get(java.lang.Long.valueOf(j17));
        if (f1Var != null) {
            c04.y yVar = (c04.y) f1Var;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsMaskView", "loadResource onLoadResult errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), errMsg);
            if (i17 == 0) {
                java.lang.String decorationImagePath = yVar.f119232b.f240204p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorationImagePath, "decorationImagePath");
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a.v(yVar.f119231a, decorationImagePath);
            }
        }
        hashMap.remove(java.lang.Long.valueOf(j17));
    }

    public final void c(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f240495d;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) concurrentHashMap.get(str);
        if (bitmap != null) {
            bitmap.recycle();
        }
        concurrentHashMap.remove(str);
    }
}
