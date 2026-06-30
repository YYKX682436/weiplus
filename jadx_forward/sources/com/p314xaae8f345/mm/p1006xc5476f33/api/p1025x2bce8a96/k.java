package com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96;

/* loaded from: classes10.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f156284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f156285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.m f156286f;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.m mVar, byte[] bArr, int i17) {
        this.f156286f = mVar;
        this.f156284d = bArr;
        this.f156285e = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[Catch: Exception -> 0x0093, TryCatch #0 {Exception -> 0x0093, blocks: (B:3:0x000d, B:6:0x0014, B:8:0x0018, B:10:0x001c, B:14:0x0024, B:17:0x002a, B:19:0x0033, B:21:0x0043, B:22:0x0071, B:24:0x0075, B:26:0x0079, B:41:0x002e), top: B:2:0x000d }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r11 = this;
            com.tencent.mm.plugin.api.recordView.m r0 = r11.f156286f
            com.tencent.mm.plugin.api.recordView.o r1 = r0.f156290c
            int r2 = r0.f156292e
            int r3 = r0.f156293f
            int r4 = r0.f156294g
            r1.getClass()
            int r5 = r1.f156308e     // Catch: java.lang.Exception -> L93
            int r6 = r11.f156285e
            r7 = 0
            if (r5 != r3) goto L23
            int r5 = r1.f156307d     // Catch: java.lang.Exception -> L93
            if (r5 != r2) goto L23
            int r5 = r1.f156309f     // Catch: java.lang.Exception -> L93
            if (r5 != r4) goto L23
            int r5 = r1.f156323t     // Catch: java.lang.Exception -> L93
            if (r5 == r6) goto L21
            goto L23
        L21:
            r5 = r7
            goto L24
        L23:
            r5 = 1
        L24:
            byte[] r8 = r1.f156306c     // Catch: java.lang.Exception -> L93
            byte[] r9 = r11.f156284d
            if (r8 == 0) goto L2e
            int r8 = r8.length     // Catch: java.lang.Exception -> L93
            int r10 = r9.length     // Catch: java.lang.Exception -> L93
            if (r8 == r10) goto L33
        L2e:
            int r8 = r9.length     // Catch: java.lang.Exception -> L93
            byte[] r8 = new byte[r8]     // Catch: java.lang.Exception -> L93
            r1.f156306c = r8     // Catch: java.lang.Exception -> L93
        L33:
            byte[] r8 = r1.f156306c     // Catch: java.lang.Exception -> L93
            int r10 = r9.length     // Catch: java.lang.Exception -> L93
            java.lang.System.arraycopy(r9, r7, r8, r7, r10)     // Catch: java.lang.Exception -> L93
            r1.f156307d = r2     // Catch: java.lang.Exception -> L93
            r1.f156308e = r3     // Catch: java.lang.Exception -> L93
            r1.f156309f = r4     // Catch: java.lang.Exception -> L93
            r1.f156323t = r6     // Catch: java.lang.Exception -> L93
            if (r5 == 0) goto L71
            int r4 = r3 * r2
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r4)     // Catch: java.lang.Exception -> L93
            r1.f156310g = r5     // Catch: java.lang.Exception -> L93
            int r4 = r4 / 2
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r4)     // Catch: java.lang.Exception -> L93
            r1.f156311h = r4     // Catch: java.lang.Exception -> L93
            java.nio.ByteBuffer r4 = r1.f156310g     // Catch: java.lang.Exception -> L93
            java.nio.ByteOrder r5 = java.nio.ByteOrder.nativeOrder()     // Catch: java.lang.Exception -> L93
            r4.order(r5)     // Catch: java.lang.Exception -> L93
            java.nio.ByteBuffer r4 = r1.f156311h     // Catch: java.lang.Exception -> L93
            java.nio.ByteOrder r5 = java.nio.ByteOrder.nativeOrder()     // Catch: java.lang.Exception -> L93
            r4.order(r5)     // Catch: java.lang.Exception -> L93
            float[] r4 = com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.o.f156302x     // Catch: java.lang.Exception -> L93
            java.nio.FloatBuffer r5 = r1.f156320q     // Catch: java.lang.Exception -> L93
            r5.put(r4)     // Catch: java.lang.Exception -> L93
            java.nio.FloatBuffer r4 = r1.f156320q     // Catch: java.lang.Exception -> L93
            r4.position(r7)     // Catch: java.lang.Exception -> L93
        L71:
            java.nio.ByteBuffer r4 = r1.f156310g     // Catch: java.lang.Exception -> L93
            if (r4 == 0) goto La4
            java.nio.ByteBuffer r5 = r1.f156311h     // Catch: java.lang.Exception -> L93
            if (r5 == 0) goto La4
            byte[] r5 = r1.f156306c     // Catch: java.lang.Exception -> L93
            int r2 = r2 * r3
            r4.put(r5, r7, r2)     // Catch: java.lang.Exception -> L93
            java.nio.ByteBuffer r3 = r1.f156310g     // Catch: java.lang.Exception -> L93
            r3.position(r7)     // Catch: java.lang.Exception -> L93
            java.nio.ByteBuffer r3 = r1.f156311h     // Catch: java.lang.Exception -> L93
            byte[] r4 = r1.f156306c     // Catch: java.lang.Exception -> L93
            int r5 = r2 / 2
            r3.put(r4, r2, r5)     // Catch: java.lang.Exception -> L93
            java.nio.ByteBuffer r1 = r1.f156311h     // Catch: java.lang.Exception -> L93
            r1.position(r7)     // Catch: java.lang.Exception -> L93
            goto La4
        L93:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "MicroMsg.YUVDateRenderToRGBBufferRenderer"
            java.lang.String r3 = "setDrawFrame error: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r3, r1)
        La4:
            com.tencent.mm.plugin.api.recordView.o r1 = r0.f156290c
            r2 = 0
            r1.onDrawFrame(r2)
            com.tencent.mm.plugin.api.recordView.n r0 = r0.f156291d
            if (r0 == 0) goto Lcf
            kt3.h r0 = (kt3.h) r0
            bi3.h r0 = r0.f393518a
            if (r0 == 0) goto Lcf
            tb1.x r0 = (tb1.x) r0
            boolean r1 = r0.f498483c
            if (r1 != 0) goto Lc2
            java.lang.String r0 = "MicroMsg.FrameDataCallbackHelper"
            java.lang.String r1 = "onDateUpdate not need callback"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            goto Lcf
        Lc2:
            tb1.w r1 = new tb1.w
            r1.<init>(r0)
            com.tencent.mm.plugin.appbrand.jsapi.l r0 = r0.f498481a
            r1.p(r0)
            r1.m()
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.k.run():void");
    }
}
