package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29;

/* loaded from: classes14.dex */
public class s extends com.p314xaae8f345.mm.p872xbfc2bd01.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s f181566d = new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s();

    /* renamed from: e, reason: collision with root package name */
    public static int f181567e = 0;

    public static void o(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceByteArrayPool", "preloadCameraData, width: %s, height: %s, count: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        for (int i27 = 0; i27 < i19; i27++) {
            byte[] bArr = new byte[((i17 * i18) * 3) / 2];
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s sVar = f181566d;
            synchronized (sVar) {
                sVar.k(bArr);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceByteArrayPool", "preloadCameraData used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public java.lang.Object b(java.lang.Comparable comparable) {
        return new byte[((java.lang.Integer) comparable).intValue()];
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public void c() {
        super.c();
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public long e(java.lang.Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public java.lang.Comparable f(java.lang.Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr == null || bArr.length <= 0) {
            return 0;
        }
        return java.lang.Integer.valueOf(bArr.length);
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public long g() {
        return 20971520L;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public long h() {
        if (f181567e <= 0) {
            f181567e = ((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getLargeMemoryClass();
        }
        return f181567e >= 512 ? 20971520L : 10485760L;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public java.lang.Comparable i(java.lang.Comparable comparable) {
        return (java.lang.Integer) comparable;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public com.p314xaae8f345.mm.p872xbfc2bd01.d j(java.lang.Comparable comparable) {
        return new com.p314xaae8f345.mm.p872xbfc2bd01.h(((java.lang.Integer) comparable).intValue());
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public synchronized byte[] m(java.lang.Integer num) {
        byte[] bArr;
        bArr = (byte[]) super.m(num);
        if (bArr == null) {
            bArr = new byte[num.intValue()];
        }
        return bArr;
    }
}
