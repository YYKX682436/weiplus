package com.github.henryye.nativeiv.comm;

/* loaded from: classes7.dex */
class NativeImage implements com.github.henryye.nativeiv.bitmap.IBitmap<com.github.henryye.nativeiv.bitmap.NativeBitmapStruct> {
    private static final java.lang.String TAG = "Ni.NativeImage";
    private com.github.henryye.nativeiv.comm.a factory;
    private com.github.henryye.nativeiv.comm.NativeImageJni jni;
    private com.github.henryye.nativeiv.bitmap.NativeBitmapStruct mNativeBitmapStruct = null;
    private long lastDecodeUsing = -1;

    public NativeImage(com.github.henryye.nativeiv.comm.NativeImageJni nativeImageJni, com.github.henryye.nativeiv.comm.a aVar) {
        this.jni = nativeImageJni;
        this.factory = aVar;
        synchronized (this) {
            synchronized (aVar) {
                aVar.f44074b.put(java.lang.Integer.valueOf(hashCode()), this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003c A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #1 {all -> 0x0078, blocks: (B:27:0x003c, B:29:0x0046, B:30:0x0056, B:34:0x004d, B:35:0x0062, B:36:0x0077), top: B:25:0x003a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062 A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #1 {all -> 0x0078, blocks: (B:27:0x003c, B:29:0x0046, B:30:0x0056, B:34:0x004d, B:35:0x0062, B:36:0x0077), top: B:25:0x003a, outer: #0 }] */
    @Override // com.github.henryye.nativeiv.bitmap.IBitmap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void decodeInputStream(java.io.InputStream r7, com.github.henryye.nativeiv.ImageDecodeConfig r8, f8.c r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.github.henryye.nativeiv.comm.a r9 = r6.factory     // Catch: java.lang.Throwable -> L81
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
            g8.f r5 = g8.g.f269409a     // Catch: java.lang.Throwable -> L81
            r5.w(r2, r3, r4)     // Catch: java.lang.Throwable -> L81
            r6.recycle()     // Catch: java.lang.Throwable -> L81
        L1c:
            java.nio.ByteBuffer r7 = i8.a.a(r7, r9)     // Catch: java.lang.Throwable -> L81
            android.graphics.Bitmap$Config r2 = r8.mConfig     // Catch: java.lang.Throwable -> L81
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
            boolean r8 = r8.mPremultiplyAlpha     // Catch: java.lang.Throwable -> L78
            com.github.henryye.nativeiv.comm.CommNativeBitmapStruct r8 = r3.a(r7, r2, r8)     // Catch: java.lang.Throwable -> L78
            if (r8 == 0) goto L4d
            com.github.henryye.nativeiv.comm.CommNativeBitmapStruct r8 = r8.convertToCommonStruct()     // Catch: java.lang.Throwable -> L78
            r6.mNativeBitmapStruct = r8     // Catch: java.lang.Throwable -> L78
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
            r6.lastDecodeUsing = r7     // Catch: java.lang.Throwable -> L81
            monitor-exit(r6)
            return
        L62:
            java.lang.String r7 = "Ni.NativeImage"
            java.lang.String r8 = "hy: decode error!"
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L78
            g8.f r2 = g8.g.f269409a     // Catch: java.lang.Throwable -> L78
            r2.w(r7, r8, r9)     // Catch: java.lang.Throwable -> L78
            r6.recycle()     // Catch: java.lang.Throwable -> L78
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L78
            java.lang.String r8 = "decode error!"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L78
            throw r7     // Catch: java.lang.Throwable -> L78
        L78:
            r7 = move-exception
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L81
            long r8 = r8 - r0
            r6.lastDecodeUsing = r8     // Catch: java.lang.Throwable -> L81
            throw r7     // Catch: java.lang.Throwable -> L81
        L81:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.henryye.nativeiv.comm.NativeImage.decodeInputStream(java.io.InputStream, com.github.henryye.nativeiv.ImageDecodeConfig, f8.c):void");
    }

    public void decodeInputStreamRegion(java.io.InputStream inputStream, android.graphics.Rect rect, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig, f8.c cVar) {
        throw new java.io.IOException("Stub!");
    }

    public synchronized f8.a dump() {
        f8.a aVar;
        aVar = new f8.a();
        com.github.henryye.nativeiv.bitmap.NativeBitmapStruct nativeBitmapStruct = this.mNativeBitmapStruct;
        if (nativeBitmapStruct != null) {
            aVar.f260058a = nativeBitmapStruct.width;
            aVar.f260059b = nativeBitmapStruct.height;
            aVar.f260060c = true;
            aVar.f260061d = java.lang.Integer.valueOf(nativeBitmapStruct.glFormat);
            aVar.f260062e = this.lastDecodeUsing;
        }
        return aVar;
    }

    @Override // com.github.henryye.nativeiv.bitmap.IBitmap
    public long getDecodeTime() {
        return this.lastDecodeUsing;
    }

    @Override // com.github.henryye.nativeiv.bitmap.IBitmap
    public com.github.henryye.nativeiv.bitmap.BitmapType getType() {
        return com.github.henryye.nativeiv.bitmap.BitmapType.Native;
    }

    @Override // com.github.henryye.nativeiv.bitmap.IBitmap
    public synchronized void recycle() {
        com.github.henryye.nativeiv.bitmap.NativeBitmapStruct nativeBitmapStruct = this.mNativeBitmapStruct;
        if (nativeBitmapStruct != null) {
            long j17 = nativeBitmapStruct.ptr;
            if (j17 != -1) {
                this.jni.d(j17);
                this.mNativeBitmapStruct = null;
            }
        }
        com.github.henryye.nativeiv.comm.a aVar = this.factory;
        if (aVar != null) {
            synchronized (aVar) {
                aVar.f44074b.remove(java.lang.Integer.valueOf(hashCode()));
            }
            this.factory = null;
        }
    }

    public void forceSet(com.github.henryye.nativeiv.bitmap.NativeBitmapStruct nativeBitmapStruct) {
        this.mNativeBitmapStruct = nativeBitmapStruct;
    }

    @Override // com.github.henryye.nativeiv.bitmap.IBitmap
    public com.github.henryye.nativeiv.bitmap.NativeBitmapStruct provide() {
        return this.mNativeBitmapStruct;
    }
}
