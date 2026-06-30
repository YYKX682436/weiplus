package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class y8 implements com.tencent.mm.plugin.appbrand.appcache.u3, java.io.Closeable {

    /* renamed from: o, reason: collision with root package name */
    public static final java.nio.ByteOrder f76067o = java.nio.ByteOrder.BIG_ENDIAN;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.vfs.r6 f76068d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.io.RandomAccessFile f76069e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.nio.channels.FileChannel f76070f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f76071g;

    /* renamed from: h, reason: collision with root package name */
    public volatile java.util.Map f76072h;

    /* renamed from: i, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.appstorage.FileStructStat f76073i;

    /* renamed from: m, reason: collision with root package name */
    public volatile int f76074m;

    /* renamed from: n, reason: collision with root package name */
    public volatile o81.a f76075n;

    public y8(com.tencent.mm.vfs.r6 r6Var) {
        this.f76070f = null;
        this.f76071g = true;
        this.f76072h = null;
        this.f76074m = -1;
        this.f76068d = r6Var;
        i();
    }

    public static int f(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m()) {
            return -1;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = new com.tencent.mm.plugin.appbrand.appcache.y8(r6Var);
            try {
                int p17 = y8Var.f76071g ? y8Var.p() : -1;
                y8Var.close();
                return p17;
            } catch (java.lang.Throwable th6) {
                try {
                    y8Var.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        } finally {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkg", "getPkgInnerVersion(%s) cost:%dms", str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    public static java.lang.String l(java.lang.String str, java.lang.String str2) {
        try {
            com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = new com.tencent.mm.plugin.appbrand.appcache.y8(str);
            try {
                y8Var.a();
                java.lang.String d17 = ik1.f.d(y8Var.c(str2));
                y8Var.close();
                return d17;
            } finally {
            }
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    @Override // com.tencent.mm.plugin.appbrand.appcache.u3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            r6 = this;
            boolean r0 = r6.f76071g
            java.lang.String r1 = "MicroMsg.WxaPkg"
            r2 = 0
            if (r0 != 0) goto L17
            com.tencent.mm.vfs.r6 r0 = r6.f76068d
            java.lang.String r0 = r0.o()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = "readInfo, file(%s) valid==false"
            com.tencent.mars.xlog.Log.e(r1, r3, r0)
            return r2
        L17:
            o81.a r0 = r6.f76075n
            r3 = 1
            if (r0 != 0) goto L74
            boolean r0 = r6.k()
            if (r0 != 0) goto L24
        L22:
            r0 = r2
            goto L62
        L24:
            int r0 = r6.p()
            if (r0 >= 0) goto L2b
            goto L22
        L2b:
            if (r0 == 0) goto L37
            if (r0 == r3) goto L31
            r0 = 0
            goto L3c
        L31:
            o81.c r0 = new o81.c
            r0.<init>()
            goto L3c
        L37:
            o81.d r0 = new o81.d
            r0.<init>()
        L3c:
            r6.f76075n = r0
            o81.a r0 = r6.f76075n
            if (r0 != 0) goto L48
            java.lang.String r0 = "parseHeader, mIWxaPkgAction is null"
            com.tencent.mars.xlog.Log.e(r1, r0)
            goto L22
        L48:
            o81.a r0 = r6.f76075n     // Catch: java.io.IOException -> L51
            java.nio.channels.FileChannel r4 = r6.f76070f     // Catch: java.io.IOException -> L51
            boolean r0 = r0.g(r4)     // Catch: java.io.IOException -> L51
            goto L62
        L51:
            r0 = move-exception
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.f192989a
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.z3.c(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = "parseHeader, exp = %s"
            com.tencent.mars.xlog.Log.e(r1, r4, r0)
            goto L22
        L62:
            if (r0 != 0) goto L74
            com.tencent.mm.vfs.r6 r0 = r6.f76068d
            java.lang.String r0 = r0.o()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = "readInfo, file(%s) parseHeaderFully==false"
            com.tencent.mars.xlog.Log.e(r1, r3, r0)
            return r2
        L74:
            o81.a r0 = r6.f76075n
            int r0 = r0.J0()
            r4 = 4
            if (r0 > r4) goto La1
            com.tencent.mm.vfs.r6 r0 = r6.f76068d
            java.lang.String r0 = r0.o()
            com.tencent.mm.vfs.r6 r3 = r6.f76068d
            long r3 = r3.C()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            com.tencent.mm.vfs.r6 r4 = r6.f76068d
            boolean r4 = r4.m()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3, r4}
            java.lang.String r3 = "readInfo, file(%s) getBodyInfoLength<=4, fileLength:%d, fileExists:%b"
            com.tencent.mars.xlog.Log.e(r1, r3, r0)
            return r2
        La1:
            java.util.Map r0 = r6.f76072h
            if (r0 == 0) goto Lbc
            o81.a r0 = r6.f76075n
            int r0 = r0.r()
            if (r0 < 0) goto Lbc
            o81.a r0 = r6.f76075n
            int r0 = r0.r()
            java.util.Map r4 = r6.f76072h
            int r4 = r4.size()
            if (r0 != r4) goto Lbc
            return r3
        Lbc:
            o81.a r0 = r6.f76075n     // Catch: java.lang.Exception -> Lce
            java.nio.channels.FileChannel r4 = r6.f76070f     // Catch: java.lang.Exception -> Lce
            com.tencent.mm.vfs.r6 r5 = r6.f76068d     // Catch: java.lang.Exception -> Lce
            java.util.Map r0 = r0.E(r4, r5)     // Catch: java.lang.Exception -> Lce
            r6.f76072h = r0     // Catch: java.lang.Exception -> Lce
            java.util.Map r0 = r6.f76072h
            if (r0 == 0) goto Lcd
            r2 = r3
        Lcd:
            return r2
        Lce:
            r0 = move-exception
            com.tencent.mm.vfs.r6 r3 = r6.f76068d
            java.lang.String r3 = r3.o()
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.f192989a
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.z3.c(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            java.lang.String r3 = "readInfo, file(%s) getInfo failed exp = %s"
            com.tencent.mars.xlog.Log.e(r1, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.y8.a():boolean");
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.u3
    public java.lang.String b() {
        return this.f76068d.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.RandomAccessFile, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // com.tencent.mm.plugin.appbrand.appcache.u3
    public java.io.InputStream c(java.lang.String str) {
        java.lang.Exception e17;
        ?? r27;
        com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info openReadPartialInfo = openReadPartialInfo(str);
        java.lang.String str2 = "can't find info of file: %s";
        ?? r37 = null;
        if (this.f76075n != null && this.f76075n.L(openReadPartialInfo)) {
            if (openReadPartialInfo != null) {
                return this.f76075n.j1(openReadPartialInfo);
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.WxaPkg", "can't find info of file: %s", str);
            return null;
        }
        if (openReadPartialInfo == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxaPkg", "can't find info of file: %s", str);
            return null;
        }
        if (!java.lang.Thread.currentThread().isInterrupted()) {
            try {
                if (!this.f76070f.isOpen()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkg", "file channel closed unexpectly!");
                    i();
                }
                java.nio.MappedByteBuffer map = this.f76070f.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, openReadPartialInfo.f75390f, openReadPartialInfo.f75391g);
                map.order(f76067o);
                map.limit(openReadPartialInfo.f75391g);
                return new nf.a(map);
            } catch (java.lang.Exception e18) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(openReadPartialInfo.f75390f);
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(openReadPartialInfo.f75391g);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkg", "handleOpenReadFile, fileName = %s, fileOffset = %d, fileLength = %d, exp = %s", str, valueOf, valueOf2, com.tencent.mm.sdk.platformtools.z3.c(e18));
                return null;
            }
        }
        com.tencent.mm.vfs.r6 r6Var = this.f76068d;
        try {
            try {
                r27 = com.tencent.mm.vfs.w6.B(r6Var.u(), false);
                try {
                    byte[] bArr = new byte[openReadPartialInfo.f75391g];
                    r27.seek(openReadPartialInfo.f75390f);
                    r27.readFully(bArr);
                    java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
                    com.tencent.mm.sdk.platformtools.t8.v1(r27);
                    r37 = byteArrayInputStream;
                    str2 = r27;
                } catch (java.lang.Exception e19) {
                    e17 = e19;
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkg", "openReadOnThreadInterrupted pkgPath(%s) fileInfo.name(%s), e = %s", r6Var.u(), openReadPartialInfo.f75389e, e17);
                    com.tencent.mm.sdk.platformtools.t8.v1(r27);
                    str2 = r27;
                    return r37;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                r37 = str2;
                com.tencent.mm.sdk.platformtools.t8.v1(r37);
                throw th;
            }
        } catch (java.lang.Exception e27) {
            e17 = e27;
            r27 = 0;
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.tencent.mm.sdk.platformtools.t8.v1(r37);
            throw th;
        }
        return r37;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        s46.d.a(this.f76070f);
        s46.d.a(this.f76069e);
    }

    public void finalize() {
        try {
            close();
            if (this.f76075n != null) {
                this.f76075n.close();
            }
        } finally {
            super.finalize();
        }
    }

    public final void i() {
        com.tencent.mm.vfs.r6 r6Var = this.f76068d;
        this.f76071g = (r6Var != null && r6Var.m() && (r6Var.C() > 14L ? 1 : (r6Var.C() == 14L ? 0 : -1)) > 0) && p() >= 0;
    }

    public java.util.List j() {
        if (!a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkg", "listInfos readInfo returns false");
        }
        return this.f76072h == null ? java.util.Collections.emptyList() : new java.util.LinkedList(this.f76072h.values());
    }

    public final boolean k() {
        if (this.f76070f != null && this.f76070f.isOpen()) {
            return true;
        }
        try {
            s46.d.a(this.f76070f);
            s46.d.a(this.f76069e);
            java.io.RandomAccessFile B = com.tencent.mm.vfs.w6.B(this.f76068d.u(), false);
            this.f76069e = B;
            this.f76070f = B.getChannel();
            return true;
        } catch (java.io.IOException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkg", "open(), exp = %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.u3
    public com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info openReadPartialInfo(java.lang.String str) {
        if (this.f76072h != null && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info wxaPkg$Info = (com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info) this.f76072h.get(str);
            if (wxaPkg$Info == null) {
                return (com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info) this.f76072h.get(com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true));
            }
            return wxaPkg$Info;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(this.f76072h == null);
        objArr[1] = java.lang.Integer.valueOf(this.f76072h != null ? this.f76072h.size() : 0);
        objArr[2] = str;
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkg", "handleInterruptReadFile, mFileMap null = %b, mFileMap size = %d, fileName = %s", objArr);
        return null;
    }

    public final int p() {
        int i17 = -1;
        if (!k()) {
            return -1;
        }
        if (this.f76074m >= 0) {
            return this.f76074m;
        }
        try {
            this.f76070f.position(1L);
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(4);
            allocateDirect.order(f76067o);
            this.f76070f.read(allocateDirect);
            i17 = o81.b.a(ik1.f.a(allocateDirect), 0, 4);
            this.f76074m = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkg", "parsed header version:%d, path:%s", java.lang.Integer.valueOf(i17), this.f76068d.o());
            return i17;
        } catch (java.io.IOException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkg", "parseHeaderVersion, exp = %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return i17;
        }
    }

    public com.tencent.mm.plugin.appbrand.appstorage.FileStructStat q() {
        com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat = this.f76073i;
        if (fileStructStat != null) {
            return fileStructStat;
        }
        com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat2 = new com.tencent.mm.plugin.appbrand.appstorage.FileStructStat();
        com.tencent.mm.plugin.appbrand.appstorage.FileStat.vfsStat(this.f76068d.o(), fileStructStat2);
        this.f76073i = fileStructStat2;
        return fileStructStat2;
    }

    public y8(java.lang.String str) {
        this(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)));
    }
}
