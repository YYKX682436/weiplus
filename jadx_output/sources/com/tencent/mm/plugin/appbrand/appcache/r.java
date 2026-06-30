package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class r implements com.tencent.mm.plugin.appbrand.appcache.u3, java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f75925d;

    /* renamed from: e, reason: collision with root package name */
    public volatile android.content.res.AssetManager f75926e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.io.ByteArrayOutputStream f75927f;

    /* renamed from: g, reason: collision with root package name */
    public volatile int f75928g;

    /* renamed from: h, reason: collision with root package name */
    public volatile int f75929h;

    /* renamed from: m, reason: collision with root package name */
    public volatile java.lang.String f75931m;

    /* renamed from: i, reason: collision with root package name */
    public volatile int f75930i = -1;

    /* renamed from: n, reason: collision with root package name */
    public volatile java.util.Map f75932n = null;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (r6 == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 1
            r5.f75925d = r0
            r1 = 0
            r5.f75928g = r1
            r5.f75929h = r1
            r2 = -1
            r5.f75930i = r2
            r3 = 0
            r5.f75931m = r3
            r5.f75932n = r3
            android.content.res.AssetManager r6 = r6.getAssets()
            r5.f75926e = r6
            r5.f75931m = r7
            android.content.res.AssetManager r6 = r5.f75926e     // Catch: java.io.IOException -> L43
            java.io.InputStream r6 = r6.open(r7)     // Catch: java.io.IOException -> L43
            if (r6 != 0) goto L24
            goto L40
        L24:
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L43
            r7.<init>()     // Catch: java.io.IOException -> L43
            r5.f75927f = r7     // Catch: java.io.IOException -> L43
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.io.IOException -> L43
        L2f:
            int r3 = r6.read(r7)     // Catch: java.io.IOException -> L43
            if (r3 <= r2) goto L3b
            java.io.ByteArrayOutputStream r4 = r5.f75927f     // Catch: java.io.IOException -> L43
            r4.write(r7, r1, r3)     // Catch: java.io.IOException -> L43
            goto L2f
        L3b:
            java.io.ByteArrayOutputStream r7 = r5.f75927f     // Catch: java.io.IOException -> L43
            r7.flush()     // Catch: java.io.IOException -> L43
        L40:
            r6.close()     // Catch: java.io.IOException -> L43
        L43:
            java.io.ByteArrayOutputStream r6 = r5.f75927f
            if (r6 == 0) goto L94
            java.io.ByteArrayOutputStream r6 = r5.f75927f
            if (r6 == 0) goto L55
            java.io.ByteArrayOutputStream r6 = r5.f75927f
            int r6 = r6.size()
            if (r6 <= 0) goto L55
            r6 = r0
            goto L56
        L55:
            r6 = r1
        L56:
            if (r6 == 0) goto L91
            java.io.ByteArrayOutputStream r6 = r5.f75927f
            if (r6 != 0) goto L5e
        L5c:
            r6 = r1
            goto L8e
        L5e:
            r6 = 14
            byte[] r7 = new byte[r6]
            java.io.ByteArrayOutputStream r2 = r5.f75927f
            byte[] r2 = r2.toByteArray()
            java.lang.System.arraycopy(r2, r1, r7, r1, r6)
            r6 = -66
            r2 = r7[r1]
            if (r6 != r2) goto L5c
            r6 = 13
            r6 = r7[r6]
            r2 = -19
            if (r2 == r6) goto L7a
            goto L5c
        L7a:
            r6 = 4
            f(r7, r0, r6)
            r2 = 5
            int r2 = f(r7, r2, r6)
            r5.f75928g = r2
            r2 = 9
            int r6 = f(r7, r2, r6)
            r5.f75929h = r6
            r6 = r0
        L8e:
            if (r6 == 0) goto L91
            goto L92
        L91:
            r0 = r1
        L92:
            r5.f75925d = r0
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.r.<init>(android.content.Context, java.lang.String):void");
    }

    public static int f(byte[] bArr, int i17, int i18) {
        if (bArr == null) {
            return 0;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr, i17, i18);
        wrap.order(java.nio.ByteOrder.BIG_ENDIAN);
        return wrap.getInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.u3
    public boolean a() {
        if (!this.f75925d || this.f75927f == null || this.f75928g <= 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AssetsWxaPkgReader", "readInfo, valid = %b, (null == mInputStream) = %b, mBodyInfoLength = %d, skip", java.lang.Boolean.valueOf(this.f75925d), this.f75927f, java.lang.Integer.valueOf(this.f75929h));
            return false;
        }
        if (this.f75932n != null && this.f75930i >= 0 && this.f75930i == this.f75932n.size()) {
            return true;
        }
        byte[] bArr = new byte[this.f75928g];
        java.lang.System.arraycopy(this.f75927f.toByteArray(), 14, bArr, 0, this.f75928g);
        this.f75930i = f(bArr, 0, 4);
        x.b bVar = new x.b();
        com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info wxaPkg$Info = null;
        int i17 = 0;
        int i18 = 4;
        while (i17 < this.f75930i) {
            int f17 = f(bArr, i18, 4);
            int i19 = i18 + 4;
            java.lang.String str = new java.lang.String(bArr, i19, f17);
            int i27 = i19 + f17;
            int f18 = f(bArr, i27, 4);
            int i28 = i27 + 4;
            int f19 = f(bArr, i28, 4);
            i18 = i28 + 4;
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info wxaPkg$Info2 = new com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info(this.f75931m, str, f18, f19);
            bVar.put(str, wxaPkg$Info2);
            i17++;
            wxaPkg$Info = wxaPkg$Info2;
        }
        this.f75932n = bVar;
        int size = this.f75927f.size();
        if (wxaPkg$Info != null) {
            int i29 = wxaPkg$Info.f75390f;
            if (wxaPkg$Info.f75391g + i29 > size) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AssetsWxaPkgReader", "readInfo, lastFileOffset(%d) + lastFileLength(%d) > totalFileLength(%d)", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(wxaPkg$Info.f75391g), java.lang.Integer.valueOf(size));
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.u3
    public java.lang.String b() {
        return "file:///android_asset/" + this.f75931m;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0086: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:41:0x0086 */
    @Override // com.tencent.mm.plugin.appbrand.appcache.u3
    public java.io.InputStream c(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info openReadPartialInfo;
        java.io.Closeable closeable;
        java.io.InputStream inputStream;
        java.io.Closeable closeable2 = null;
        if (this.f75927f == null || this.f75927f.size() <= 0 || (openReadPartialInfo = openReadPartialInfo(str)) == null) {
            return null;
        }
        if (!java.lang.Thread.currentThread().isInterrupted()) {
            byte[] bArr = new byte[openReadPartialInfo.f75391g];
            java.lang.System.arraycopy(this.f75927f.toByteArray(), openReadPartialInfo.f75390f, bArr, 0, openReadPartialInfo.f75391g);
            return new java.io.ByteArrayInputStream(bArr);
        }
        if (this.f75926e == null || openReadPartialInfo.f75390f < 0) {
            return null;
        }
        int i17 = openReadPartialInfo.f75391g;
        try {
            if (i17 <= 0) {
                return null;
            }
            try {
                byte[] bArr2 = new byte[i17];
                inputStream = this.f75926e.open(this.f75931m);
                try {
                    if (inputStream.skip(openReadPartialInfo.f75390f) != openReadPartialInfo.f75390f) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AssetsWxaPkgReader", "offset actual number != require");
                    } else {
                        if (inputStream.read(bArr2, 0, openReadPartialInfo.f75391g) == openReadPartialInfo.f75391g) {
                            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr2);
                            com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                            return byteArrayInputStream;
                        }
                        com.tencent.mars.xlog.Log.e("MicroMsg.AssetsWxaPkgReader", "length actual number != require");
                    }
                } catch (java.lang.Exception e17) {
                    e = e17;
                    com.tencent.mars.xlog.Log.e("MicroMsg.AssetsWxaPkgReader", "openReadOnThreadInterrupted pkgPath(%s) fileInfo.name(%s), e = %s", this.f75931m, openReadPartialInfo.f75389e, e);
                    com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                    return null;
                }
            } catch (java.lang.Exception e18) {
                e = e18;
                inputStream = null;
            } catch (java.lang.Throwable th6) {
                th = th6;
                com.tencent.mm.sdk.platformtools.t8.v1(closeable2);
                throw th;
            }
            com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
            return null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            closeable2 = closeable;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f75927f == null || this.f75927f.size() <= 0) {
            return;
        }
        try {
            this.f75927f.close();
            this.f75927f = null;
        } catch (java.lang.Exception unused) {
        }
    }

    public void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.u3
    public com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info openReadPartialInfo(java.lang.String str) {
        if (this.f75932n != null && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return (com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info) this.f75932n.get(com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true));
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(this.f75932n == null);
        objArr[1] = java.lang.Integer.valueOf(this.f75932n != null ? this.f75932n.size() : 0);
        objArr[2] = str;
        com.tencent.mars.xlog.Log.e("MicroMsg.AssetsWxaPkgReader", "openReadFile, mFileMap null = %b, mFileMap size = %d, fileName = %s", objArr);
        return null;
    }
}
