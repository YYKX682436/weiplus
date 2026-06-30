package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class rd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f82901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f82902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f82903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.md f82904g;

    public rd(com.tencent.mm.plugin.appbrand.jsapi.md mdVar, com.tencent.mm.vfs.r6 r6Var, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        this.f82904g = mdVar;
        this.f82901d = r6Var;
        this.f82902e = bitmap;
        this.f82903f = bitmap2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        if (r1.isRecycled() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0092, code lost:
    
        r1.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if (r1.isRecycled() == false) goto L29;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r10 = this;
            java.lang.String r0 = "bitmap recycle %s"
            android.graphics.Bitmap r1 = r10.f82902e
            android.graphics.Bitmap r2 = r10.f82903f
            com.tencent.mm.vfs.r6 r3 = r10.f82901d
            java.lang.String r4 = r3.o()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.o()
            r5.append(r3)
            java.lang.String r3 = "_full"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "processRecognizeQRCodeLogic capturePath:%s"
            java.lang.Object[] r6 = new java.lang.Object[]{r4}
            java.lang.String r7 = "MicroMsg.JsApiShowImageOperateSheet"
            com.tencent.mars.xlog.Log.i(r7, r5, r6)
            com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam r5 = new com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam
            r5.<init>()
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6d
            r8 = 1
            r9 = 100
            com.tencent.mm.sdk.platformtools.x.D0(r1, r9, r6, r3, r8)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6d
            r5.f78642d = r3     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6d
            if (r2 == 0) goto L4f
            boolean r6 = r2.isRecycled()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6d
            if (r6 != 0) goto L4f
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6d
            com.tencent.mm.sdk.platformtools.x.D0(r2, r9, r6, r4, r8)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6d
            r5.f78642d = r4     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6d
            r5.f78643e = r3     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6d
            goto L52
        L4d:
            r3 = move-exception
            goto L6f
        L4f:
            r3 = 0
            r5.f78643e = r3     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6d
        L52:
            if (r2 == 0) goto L64
            boolean r3 = r2.isRecycled()
            if (r3 != 0) goto L64
            java.lang.Object[] r3 = new java.lang.Object[]{r2}
            com.tencent.mars.xlog.Log.i(r7, r0, r3)
            r2.recycle()
        L64:
            if (r1 == 0) goto L95
            boolean r0 = r1.isRecycled()
            if (r0 != 0) goto L95
            goto L92
        L6d:
            r3 = move-exception
            goto La2
        L6f:
            java.lang.String r4 = "save temp bitmap to file failed, . exception : %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L6d
            com.tencent.mars.xlog.Log.w(r7, r4, r3)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L8a
            boolean r3 = r2.isRecycled()
            if (r3 != 0) goto L8a
            java.lang.Object[] r3 = new java.lang.Object[]{r2}
            com.tencent.mars.xlog.Log.i(r7, r0, r3)
            r2.recycle()
        L8a:
            if (r1 == 0) goto L95
            boolean r0 = r1.isRecycled()
            if (r0 != 0) goto L95
        L92:
            r1.recycle()
        L95:
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.w9.f193053a
            com.tencent.mm.plugin.appbrand.jsapi.qd r1 = new com.tencent.mm.plugin.appbrand.jsapi.qd
            r1.<init>(r10)
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.ee> r2 = com.tencent.mm.plugin.appbrand.jsapi.ee.class
            com.tencent.mm.ipcinvoker.d0.d(r0, r5, r2, r1)
            return
        La2:
            if (r2 == 0) goto Lb4
            boolean r4 = r2.isRecycled()
            if (r4 != 0) goto Lb4
            java.lang.Object[] r4 = new java.lang.Object[]{r2}
            com.tencent.mars.xlog.Log.i(r7, r0, r4)
            r2.recycle()
        Lb4:
            if (r1 == 0) goto Lbf
            boolean r0 = r1.isRecycled()
            if (r0 != 0) goto Lbf
            r1.recycle()
        Lbf:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.rd.run():void");
    }
}
