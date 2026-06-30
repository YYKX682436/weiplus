package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public abstract class gc {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f75557a = 0;

    static {
        com.tencent.mm.plugin.appbrand.appcache.gc.class.getClassLoader();
        fp.d0.n("wechatzstd");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r9, java.lang.String r10) {
        /*
            com.tencent.mm.vfs.z7 r0 = com.tencent.mm.vfs.z7.a(r9)
            r1 = 0
            java.lang.String r2 = r0.f213279f
            if (r2 == 0) goto L22
            java.lang.String r6 = com.tencent.mm.vfs.e8.l(r2, r1, r1)
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L22
            com.tencent.mm.vfs.z7 r2 = new com.tencent.mm.vfs.z7
            java.lang.String r4 = r0.f213277d
            java.lang.String r5 = r0.f213278e
            java.lang.String r7 = r0.f213280g
            java.lang.String r8 = r0.f213281h
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = r2
        L22:
            com.tencent.mm.vfs.b3 r2 = com.tencent.mm.vfs.a3.f212781a
            r3 = 0
            com.tencent.mm.vfs.z2 r2 = r2.m(r0, r3)
            boolean r4 = r2.a()
            if (r4 != 0) goto L31
            r2 = r1
            goto L39
        L31:
            com.tencent.mm.vfs.q2 r4 = r2.f213266a
            java.lang.String r2 = r2.f213267b
            boolean r2 = r4.F(r2)
        L39:
            java.lang.String r4 = "MicroMsg.AppBrand.ZstdLogic"
            if (r2 != 0) goto L43
            java.lang.String r9 = "mayProcessZstd downloadFile not exists"
            com.tencent.mars.xlog.Log.e(r4, r9)
            return r1
        L43:
            boolean r2 = b(r9)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r5 = "doProcessZstd, file header valid? %b"
            com.tencent.mars.xlog.Log.i(r4, r5, r2)
            com.tencent.mm.vfs.r6 r2 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r10 = com.tencent.mm.vfs.z7.a(r10)
            r2.<init>(r10)
            boolean r10 = r2.m()
            if (r10 == 0) goto L6f
            boolean r10 = r2.l()
            if (r10 != 0) goto L6f
            java.lang.String r9 = "mayProcessZstd targetFile delete failed"
            com.tencent.mars.xlog.Log.e(r4, r9)
            return r1
        L6f:
            com.tencent.mars.zstd.ZstdInputStream r10 = new com.tencent.mars.zstd.ZstdInputStream     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
            java.io.InputStream r0 = com.tencent.mm.vfs.w6.E(r0)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
            java.io.OutputStream r3 = com.tencent.mm.vfs.w6.H(r2)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lb8
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lb8
        L84:
            int r5 = r10.read(r2, r1, r0)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lb8
            r6 = -1
            if (r5 == r6) goto L8f
            r3.write(r2, r1, r5)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lb8
            goto L84
        L8f:
            r3.flush()     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lb8
            com.tencent.mm.vfs.w6.h(r9)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lb8
            r3.close()     // Catch: java.io.IOException -> L98
        L98:
            r10.close()     // Catch: java.io.IOException -> L9b
        L9b:
            r9 = 1
            return r9
        L9d:
            r9 = move-exception
            goto La4
        L9f:
            r9 = move-exception
            r10 = r3
            goto Lb9
        La2:
            r9 = move-exception
            r10 = r3
        La4:
            java.lang.String r0 = "mayProcessZstd exp: %s"
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> Lb8
            com.tencent.mars.xlog.Log.e(r4, r0, r9)     // Catch: java.lang.Throwable -> Lb8
            if (r3 == 0) goto Lb2
            r3.close()     // Catch: java.io.IOException -> Lb2
        Lb2:
            if (r10 == 0) goto Lb7
            r10.close()     // Catch: java.io.IOException -> Lb7
        Lb7:
            return r1
        Lb8:
            r9 = move-exception
        Lb9:
            if (r3 == 0) goto Lbe
            r3.close()     // Catch: java.io.IOException -> Lbe
        Lbe:
            if (r10 == 0) goto Lc3
            r10.close()     // Catch: java.io.IOException -> Lc3
        Lc3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.gc.a(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if (r2[3] == (-3)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(java.lang.String r5) {
        /*
            r0 = 0
            java.io.InputStream r5 = com.tencent.mm.vfs.w6.E(r5)     // Catch: java.io.IOException -> L3e
            r1 = 4
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L32
            int r3 = r5.read(r2)     // Catch: java.lang.Throwable -> L32
            if (r3 >= r1) goto L12
            r5.close()     // Catch: java.io.IOException -> L3e
            return r0
        L12:
            r1 = r2[r0]     // Catch: java.lang.Throwable -> L32
            r3 = 40
            if (r1 != r3) goto L2d
            r1 = 1
            r3 = r2[r1]     // Catch: java.lang.Throwable -> L32
            r4 = -75
            if (r3 != r4) goto L2d
            r3 = 2
            r3 = r2[r3]     // Catch: java.lang.Throwable -> L32
            r4 = 47
            if (r3 != r4) goto L2d
            r3 = 3
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L32
            r3 = -3
            if (r2 != r3) goto L2d
            goto L2e
        L2d:
            r1 = r0
        L2e:
            r5.close()     // Catch: java.io.IOException -> L3e
            return r1
        L32:
            r1 = move-exception
            if (r5 == 0) goto L3d
            r5.close()     // Catch: java.lang.Throwable -> L39
            goto L3d
        L39:
            r5 = move-exception
            r1.addSuppressed(r5)     // Catch: java.io.IOException -> L3e
        L3d:
            throw r1     // Catch: java.io.IOException -> L3e
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.gc.b(java.lang.String):boolean");
    }
}
