package com.tencent.mm.plugin.facedetect.model;

/* loaded from: classes14.dex */
public class s extends com.tencent.mm.memory.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.facedetect.model.s f100033d = new com.tencent.mm.plugin.facedetect.model.s();

    /* renamed from: e, reason: collision with root package name */
    public static int f100034e = 0;

    public static void o(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceByteArrayPool", "preloadCameraData, width: %s, height: %s, count: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        for (int i27 = 0; i27 < i19; i27++) {
            byte[] bArr = new byte[((i17 * i18) * 3) / 2];
            com.tencent.mm.plugin.facedetect.model.s sVar = f100033d;
            synchronized (sVar) {
                sVar.k(bArr);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceByteArrayPool", "preloadCameraData used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    @Override // com.tencent.mm.memory.g
    public java.lang.Object b(java.lang.Comparable comparable) {
        return new byte[((java.lang.Integer) comparable).intValue()];
    }

    @Override // com.tencent.mm.memory.g
    public void c() {
        super.c();
    }

    @Override // com.tencent.mm.memory.g
    public long e(java.lang.Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // com.tencent.mm.memory.g
    public java.lang.Comparable f(java.lang.Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr == null || bArr.length <= 0) {
            return 0;
        }
        return java.lang.Integer.valueOf(bArr.length);
    }

    @Override // com.tencent.mm.memory.g
    public long g() {
        return 20971520L;
    }

    @Override // com.tencent.mm.memory.g
    public long h() {
        if (f100034e <= 0) {
            f100034e = ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getLargeMemoryClass();
        }
        return f100034e >= 512 ? 20971520L : 10485760L;
    }

    @Override // com.tencent.mm.memory.g
    public java.lang.Comparable i(java.lang.Comparable comparable) {
        return (java.lang.Integer) comparable;
    }

    @Override // com.tencent.mm.memory.g
    public com.tencent.mm.memory.d j(java.lang.Comparable comparable) {
        return new com.tencent.mm.memory.h(((java.lang.Integer) comparable).intValue());
    }

    @Override // com.tencent.mm.memory.a
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
