package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class j3 extends com.tencent.mm.plugin.appbrand.appstorage.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f76225d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f76226e;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f76227f = -1;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appstorage.x1 f76228g = null;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.i3 f76229h = new com.tencent.mm.plugin.appbrand.appstorage.x2(this);

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.i3 f76230i = new com.tencent.mm.plugin.appbrand.appstorage.y2(this);

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.h3 f76231m = new com.tencent.mm.plugin.appbrand.appstorage.z2(this);

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.h3 f76232n = new com.tencent.mm.plugin.appbrand.appstorage.a3(this);

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.h3 f76233o = new com.tencent.mm.plugin.appbrand.appstorage.c3(this);

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.h3 f76234p = new com.tencent.mm.plugin.appbrand.appstorage.d3(this);

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.h3 f76235q = new com.tencent.mm.plugin.appbrand.appstorage.e3(this);

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.h3 f76236r = new com.tencent.mm.plugin.appbrand.appstorage.f3(this);

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.i3 f76237s = new com.tencent.mm.plugin.appbrand.appstorage.g3(this);

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.h3 f76238t = new com.tencent.mm.plugin.appbrand.appstorage.p2(this);

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.h3 f76239u = new com.tencent.mm.plugin.appbrand.appstorage.r2(this);

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.h3 f76240v = new com.tencent.mm.plugin.appbrand.appstorage.s2(this);

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.h3 f76241w = new com.tencent.mm.plugin.appbrand.appstorage.t2(this);

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.h3 f76242x = new com.tencent.mm.plugin.appbrand.appstorage.u2(this);

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.h3 f76243y = new com.tencent.mm.plugin.appbrand.appstorage.w2(this);

    public j3(java.lang.String str, java.lang.String str2) {
        this.f76225d = str;
        this.f76226e = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageNonFlattenedFileSystem", "mRootPath:%s mPathPrefix:%s", str, str2);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public boolean accept(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return str.startsWith(this.f76226e);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 access(java.lang.String str) {
        return d(str, this.f76229h, false, new java.lang.Object[0]);
    }

    public final com.tencent.mm.vfs.r6 b() {
        com.tencent.mm.vfs.z7 a17;
        com.tencent.mm.vfs.z2 m17;
        java.lang.String str = this.f76225d;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str);
        if (r6Var.m() && r6Var.A()) {
            r6Var.l();
        }
        r6Var.J();
        try {
            a17 = com.tencent.mm.vfs.z7.a(r6Var.u() + "/.nomedia");
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        } catch (java.lang.Exception unused) {
        }
        if (!m17.a()) {
            throw new java.io.FileNotFoundException("Cannot resolve path or URI: " + a17);
        }
        com.tencent.mm.vfs.q2 q2Var = m17.f213266a;
        java.lang.String str3 = m17.f213267b;
        if (!q2Var.F(str3)) {
            q2Var.c(str3, false).close();
        }
        return r6Var;
    }

    public final long c() {
        return com.tencent.mm.plugin.appbrand.appstorage.l1.c(new com.tencent.mm.vfs.r6(this.f76225d));
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0
    public void cleanupDirectory() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(this.f76225d);
        com.tencent.mm.plugin.appbrand.appstorage.l1.f(r6Var);
        if (r6Var.m()) {
            r6Var.l();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 copyTo(java.lang.String str, com.tencent.mm.vfs.r6 r6Var, boolean z17) {
        return d(str, this.f76240v, false, r6Var, java.lang.Boolean.valueOf(z17));
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, boolean z17, ik1.b0 b0Var) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NOT_SUPPORTED;
    }

    public final com.tencent.mm.plugin.appbrand.appstorage.j1 d(java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.h3 h3Var, boolean z17, java.lang.Object... objArr) {
        java.lang.String str2;
        boolean z18;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
        if (K0) {
            return j1Var;
        }
        java.lang.String str3 = this.f76226e;
        if (str3.endsWith("/")) {
            str2 = str3;
        } else {
            str2 = str3 + "/";
        }
        if (str.equals(str3)) {
            str = str2;
        } else if (!str.startsWith(str2)) {
            return j1Var;
        }
        java.lang.String replace = com.tencent.mm.plugin.appbrand.appstorage.l1.h(str.replaceFirst(java.util.regex.Pattern.quote(str3), "")).replace("\u0000", "");
        com.tencent.mm.vfs.r6 b17 = b();
        if (b17 == null) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_FS_NOT_MOUNTED;
        }
        java.lang.String a17 = s46.c.a(b17.o(), replace);
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            return j1Var;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(a17);
        com.tencent.mm.vfs.r6 b18 = b();
        boolean z19 = false;
        if (b18 != null) {
            com.tencent.mm.vfs.r6 r6Var2 = r6Var;
            while (true) {
                if (r6Var2 == null) {
                    z18 = false;
                    break;
                }
                if (b18.equals(r6Var2)) {
                    z18 = true;
                    break;
                }
                r6Var2 = r6Var2.s();
            }
            if (z18) {
                z19 = true;
            }
        }
        return !z19 ? j1Var : (z17 || r6Var.s().m()) ? h3Var.a(r6Var, objArr) : com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PARENT_DIR_NOT_EXISTS;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.vfs.r6 getAbsoluteFile(java.lang.String str, boolean z17) {
        ik1.b0 b0Var = new ik1.b0();
        d(str, this.f76241w, false, b0Var);
        com.tencent.mm.vfs.r6 r6Var = (com.tencent.mm.vfs.r6) b0Var.f291824a;
        if (r6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageNonFlattenedFileSystem", "getAbsoluteFile with path(%s), get null file", str);
            return null;
        }
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageNonFlattenedFileSystem", "getAbsoluteFile with path(%s), file not exists", str);
            return null;
        }
        if (!z17 && !r6Var.A()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageNonFlattenedFileSystem", "getAbsoluteFile with path(%s), not a file", str);
            return null;
        }
        if (!com.tencent.mm.plugin.appbrand.appstorage.l1.a(r6Var)) {
            return r6Var;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LuggageNonFlattenedFileSystem", "getAbsoluteFile with path(%s), symlink file", str);
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public java.util.List getSavedFileList() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.x1 getStorageSpaceStatistics() {
        return this.f76228g;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 getTempDirectory(ik1.b0 b0Var) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NOT_SUPPORTED;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void initialize() {
        com.tencent.mm.vfs.r6 b17 = b();
        if (b17 == null || !b17.m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageNonFlattenedFileSystem", "Initialization Failed");
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 isdir(java.lang.String str) {
        return d(str, this.f76230i, false, new java.lang.Object[0]);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 mkdir(java.lang.String str, boolean z17) {
        return d(str, this.f76231m, z17, java.lang.Boolean.valueOf(z17));
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readDir(java.lang.String str, ik1.b0 b0Var) {
        return d(str, this.f76233o, false, b0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, ik1.b0 b0Var) {
        return d(str, this.f76234p, false, b0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public final java.io.InputStream readStream(java.lang.String str) {
        ik1.b0 b0Var = new ik1.b0();
        if (com.tencent.mm.plugin.appbrand.appstorage.j1.OK == d(str, this.f76243y, false, b0Var)) {
            return (java.io.InputStream) b0Var.f291824a;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readZipEntry(java.lang.String str, ik1.b0 b0Var, java.lang.String str2, long j17, long j18) {
        return d(str, this.f76235q, false, b0Var, str2, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void release() {
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 resolvePath(java.lang.String str) {
        ik1.b0 b0Var = new ik1.b0();
        d(str, this.f76241w, false, b0Var);
        com.tencent.mm.vfs.r6 r6Var = (com.tencent.mm.vfs.r6) b0Var.f291824a;
        if (r6Var != null) {
            return r6Var;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LuggageNonFlattenedFileSystem", "getAbsoluteFile with path(%s), get null file", str);
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 rmdir(java.lang.String str, boolean z17) {
        return d(str, this.f76232n, z17, java.lang.Boolean.valueOf(z17));
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 saveFile(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, ik1.b0 b0Var) {
        long c17;
        long C;
        long j17;
        boolean accept = accept(str);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NOT_SUPPORTED;
        if (!accept) {
            return j1Var;
        }
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var2 = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
        if (r6Var != null && r6Var.m()) {
            if (android.text.TextUtils.isEmpty(str)) {
                return j1Var;
            }
            com.tencent.mm.plugin.appbrand.appstorage.x1 x1Var = this.f76228g;
            try {
                if (x1Var != null) {
                    j17 = ((com.tencent.mm.plugin.appbrand.jsapi.file.n3) x1Var).c(this.f76225d, r6Var.o()) + r6Var.C();
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuggageNonFlattenedFileSystem", "saveFile: WxaStorageSpaceStatisticsService getDirTotalSize=" + (j17 - r6Var.C()));
                    if (j17 == -1) {
                        c17 = c();
                        C = r6Var.C();
                    }
                    if (this.f76227f > 0 || j17 <= this.f76227f) {
                        com.tencent.mm.plugin.appbrand.appstorage.j1 isdir = isdir(str);
                        return (isdir != com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS || isdir == com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_IS_FILE) ? d(str, new com.tencent.mm.plugin.appbrand.appstorage.v2(this, r6Var, b0Var, str), false, new java.lang.Object[0]) : isdir;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuggageNonFlattenedFileSystem", "saveFile exceed directory max size, MAX_SIZE[%d MB], TOTAL_SIZE[%d MB]", java.lang.Long.valueOf(this.f76227f / 1048576), java.lang.Long.valueOf(j17 / 1048576));
                    return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE;
                }
                c17 = c();
                C = r6Var.C();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuggageNonFlattenedFileSystem", e17, "saveFile() error", new java.lang.Object[0]);
            }
            j17 = c17 + C;
            if (this.f76227f > 0) {
            }
            com.tencent.mm.plugin.appbrand.appstorage.j1 isdir2 = isdir(str);
            if (isdir2 != com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS) {
            }
        }
        return j1Var2;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 stat(java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat) {
        return d(str, this.f76238t, false, fileStructStat);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 statDir(java.lang.String str, java.util.List list) {
        return d(str, this.f76239u, false, list);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 unlink(java.lang.String str) {
        return d(str, this.f76237s, false, new java.lang.Object[0]);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 unzip(java.lang.String str, com.tencent.mm.vfs.r6 r6Var) {
        return d(str, this.f76242x, false, r6Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 writeFile(java.lang.String str, java.io.InputStream inputStream, boolean z17) {
        return inputStream == null ? com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL : d(str, this.f76236r, false, inputStream, java.lang.Boolean.valueOf(z17));
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, long j17, long j18, ik1.b0 b0Var) {
        return d(str, this.f76234p, false, b0Var, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
    }
}
