package com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c;

/* renamed from: com.github.henryye.nativeiv.comm.NativeImage */
/* loaded from: classes7.dex */
class C1599xca908764 implements com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8<com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb> {
    private static final java.lang.String TAG = "Ni.NativeImage";

    /* renamed from: factory */
    private com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c.a f5301xbeeb310a;
    private com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c.C1600xa8fcb1a1 jni;

    /* renamed from: mNativeBitmapStruct */
    private com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb f5303x42aa1ee8 = null;

    /* renamed from: lastDecodeUsing */
    private long f5302xc8f3dac0 = -1;

    public C1599xca908764(com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c.C1600xa8fcb1a1 c1600xa8fcb1a1, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c.a aVar) {
        this.jni = c1600xa8fcb1a1;
        this.f5301xbeeb310a = aVar;
        synchronized (this) {
            synchronized (aVar) {
                aVar.f125607b.put(java.lang.Integer.valueOf(hashCode()), this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003c A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #1 {all -> 0x0078, blocks: (B:27:0x003c, B:29:0x0046, B:30:0x0056, B:34:0x004d, B:35:0x0062, B:36:0x0077), top: B:25:0x003a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062 A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #1 {all -> 0x0078, blocks: (B:27:0x003c, B:29:0x0046, B:30:0x0056, B:34:0x004d, B:35:0x0062, B:36:0x0077), top: B:25:0x003a, outer: #0 }] */
    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8
    /* renamed from: decodeInputStream */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void mo17129xb55d491c(java.io.InputStream r7, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab r8, f8.c r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.github.henryye.nativeiv.comm.a r9 = r6.f5301xbeeb310a     // Catch: java.lang.Throwable -> L81
            if (r9 != 0) goto L7
            monitor-exit(r6)
            return
        L7:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L81
            r9 = 0
            if (r7 != 0) goto L1c
            java.lang.String r2 = "Ni.NativeImage"
            java.lang.String r3 = "hy: non stream, mark as request clear"
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L81
            g8.f r5 = g8.g.f350942a     // Catch: java.lang.Throwable -> L81
            r5.w(r2, r3, r4)     // Catch: java.lang.Throwable -> L81
            r6.mo17133x408b7293()     // Catch: java.lang.Throwable -> L81
        L1c:
            java.nio.ByteBuffer r7 = i8.a.a(r7, r9)     // Catch: java.lang.Throwable -> L81
            android.graphics.Bitmap$Config r2 = r8.f5274xfeabaa0f     // Catch: java.lang.Throwable -> L81
            if (r2 == 0) goto L39
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L81
            if (r2 != r3) goto L29
            goto L39
        L29:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_4444     // Catch: java.lang.Throwable -> L81
            if (r2 != r3) goto L2e
            goto L39
        L2e:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Throwable -> L81
            if (r2 != r3) goto L33
            goto L39
        L33:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ALPHA_8     // Catch: java.lang.Throwable -> L81
            if (r2 != r3) goto L39
            r2 = 2
            goto L3a
        L39:
            r2 = 4
        L3a:
            if (r7 == 0) goto L62
            com.github.henryye.nativeiv.comm.NativeImageJni r3 = r6.jni     // Catch: java.lang.Throwable -> L78
            boolean r8 = r8.f5278xefd30a64     // Catch: java.lang.Throwable -> L78
            com.github.henryye.nativeiv.comm.CommNativeBitmapStruct r8 = r3.a(r7, r2, r8)     // Catch: java.lang.Throwable -> L78
            if (r8 == 0) goto L4d
            com.github.henryye.nativeiv.comm.CommNativeBitmapStruct r8 = r8.m17138xde9d3c4e()     // Catch: java.lang.Throwable -> L78
            r6.f5303x42aa1ee8 = r8     // Catch: java.lang.Throwable -> L78
            goto L56
        L4d:
            java.lang.String r8 = "Ni.NativeImage"
            java.lang.String r2 = "hy: decode failed!!"
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L78
            g8.g.a(r8, r2, r9)     // Catch: java.lang.Throwable -> L78
        L56:
            r7.clear()     // Catch: java.lang.Throwable -> L78
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L81
            long r7 = r7 - r0
            r6.f5302xc8f3dac0 = r7     // Catch: java.lang.Throwable -> L81
            monitor-exit(r6)
            return
        L62:
            java.lang.String r7 = "Ni.NativeImage"
            java.lang.String r8 = "hy: decode error!"
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L78
            g8.f r2 = g8.g.f350942a     // Catch: java.lang.Throwable -> L78
            r2.w(r7, r8, r9)     // Catch: java.lang.Throwable -> L78
            r6.mo17133x408b7293()     // Catch: java.lang.Throwable -> L78
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L78
            java.lang.String r8 = "decode error!"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L78
            throw r7     // Catch: java.lang.Throwable -> L78
        L78:
            r7 = move-exception
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L81
            long r8 = r8 - r0
            r6.f5302xc8f3dac0 = r8     // Catch: java.lang.Throwable -> L81
            throw r7     // Catch: java.lang.Throwable -> L81
        L81:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c.C1599xca908764.mo17129xb55d491c(java.io.InputStream, com.github.henryye.nativeiv.ImageDecodeConfig, f8.c):void");
    }

    /* renamed from: decodeInputStreamRegion */
    public void m17139x7d5e1730(java.io.InputStream inputStream, android.graphics.Rect rect, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab, f8.c cVar) {
        throw new java.io.IOException("Stub!");
    }

    /* renamed from: dump */
    public synchronized f8.a m17140x2f39f4() {
        f8.a aVar;
        aVar = new f8.a();
        com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb c1597xb11e7fbb = this.f5303x42aa1ee8;
        if (c1597xb11e7fbb != null) {
            aVar.f341591a = c1597xb11e7fbb.f5291x6be2dc6;
            aVar.f341592b = c1597xb11e7fbb.f5290xb7389127;
            aVar.f341593c = true;
            aVar.f341594d = java.lang.Integer.valueOf(c1597xb11e7fbb.f5288x9a7ef13c);
            aVar.f341595e = this.f5302xc8f3dac0;
        }
        return aVar;
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8
    /* renamed from: getDecodeTime */
    public long mo17130xa63469d1() {
        return this.f5302xc8f3dac0;
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8
    /* renamed from: getType */
    public com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129 mo17131xfb85f7b0() {
        return com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129.Native;
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8
    /* renamed from: recycle */
    public synchronized void mo17133x408b7293() {
        com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb c1597xb11e7fbb = this.f5303x42aa1ee8;
        if (c1597xb11e7fbb != null) {
            long j17 = c1597xb11e7fbb.ptr;
            if (j17 != -1) {
                this.jni.d(j17);
                this.f5303x42aa1ee8 = null;
            }
        }
        com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c.a aVar = this.f5301xbeeb310a;
        if (aVar != null) {
            synchronized (aVar) {
                aVar.f125607b.remove(java.lang.Integer.valueOf(hashCode()));
            }
            this.f5301xbeeb310a = null;
        }
    }

    /* renamed from: forceSet, reason: merged with bridge method [inline-methods] */
    public void m17142x1bb64d77(com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb c1597xb11e7fbb) {
        this.f5303x42aa1ee8 = c1597xb11e7fbb;
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8
    /* renamed from: provide */
    public com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb mo17132xed95cea1() {
        return this.f5303x42aa1ee8;
    }
}
