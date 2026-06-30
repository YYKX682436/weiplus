package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes10.dex */
public final class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.l2 f240477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f240478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f240479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f240480g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f240481h;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.l2 l2Var, byte[] bArr, android.graphics.Point point, int i17, long j17) {
        this.f240477d = l2Var;
        this.f240478e = bArr;
        this.f240479f = point;
        this.f240480g = i17;
        this.f240481h = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Point point;
        byte[] bArr = this.f240478e;
        int i17 = this.f240480g;
        long j17 = this.f240481h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.l2 l2Var = this.f240477d;
        l2Var.getClass();
        try {
            if (!(!(bArr.length == 0)) || (point = this.f240479f) == null) {
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(bArr, 17, point.x, point.y, null);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, point.x, point.y), 100, byteArrayOutputStream);
            android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(byteArrayOutputStream.toByteArray());
            int currentTimeMillis2 = (int) (java.lang.System.currentTimeMillis() - currentTimeMillis);
            if (G != null) {
                long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(G, i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslateHandler", "processFrame decode cost %d, rotate cost %d", java.lang.Integer.valueOf(currentTimeMillis2), java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() - currentTimeMillis3)));
                if (w07 != null) {
                    java.lang.String wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.u0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.a0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.a0.class))).wi("jpg");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wi6);
                    l2Var.e(wi6, 0, w07, j17);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanTranslateHandler", e17, "scanTranslate processFrame exception", new java.lang.Object[0]);
        }
    }
}
