package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class n1 extends com.tencent.mm.plugin.appbrand.appstorage.y0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f76276e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f76277f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager f76278g;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f76275d = false;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appstorage.x1 f76279h = null;

    /* renamed from: i, reason: collision with root package name */
    public volatile long f76280i = -1;

    public n1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String o17 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)).o();
        this.f76276e = o17;
        this.f76277f = str3;
        this.f76278g = new com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager(o17, str2, str3);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public boolean accept(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return str.startsWith(this.f76277f);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 access(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appstorage.i2 e17 = this.f76278g.e(str);
        return (e17 == null || !com.tencent.mm.vfs.w6.j(e17.f76200e)) ? com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS : com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 allocTempFile(java.lang.String str) {
        java.lang.String str2 = this.f76276e;
        com.tencent.mm.vfs.w6.u(str2);
        return new com.tencent.mm.vfs.r6(str2 + "/" + str);
    }

    public void b() {
        com.tencent.mm.vfs.w6.h(this.f76276e + "/dir.lock");
    }

    public void c() {
        com.tencent.mm.vfs.w6.S(this.f76276e + "/dir.lock", new byte[1], 0, 1);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, boolean z17, ik1.b0 b0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Luggage.FlattenFileSystem", "createTempFileFrom src[%s] suffix[%s] deleteSrc[%b] released[%b]", r6Var, str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f76275d));
        if (this.f76275d) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_FS_NOT_MOUNTED;
        }
        com.tencent.mm.plugin.appbrand.appstorage.i2 c17 = this.f76278g.c(r6Var.o(), str, z17);
        if (c17 == null) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
        }
        com.tencent.mm.plugin.appbrand.appstorage.x1 x1Var = this.f76279h;
        if (x1Var != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.file.n3) x1Var).h(this.f76276e, c17.f76200e, c17.f76202g, "FlattenFileSystem#createTempFileFrom");
        }
        b0Var.f291824a = c17.f76199d;
        return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.vfs.r6 getAbsoluteFile(java.lang.String str, boolean z17) {
        return getAbsoluteFile(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public java.util.List getSavedFileList() {
        return this.f76278g.i();
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.x1 getStorageSpaceStatistics() {
        return this.f76279h;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 getTempDirectory(ik1.b0 b0Var) {
        b0Var.f291824a = this.f76276e;
        return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void initialize() {
        if (com.tencent.mm.vfs.w6.u(this.f76276e)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Luggage.FlattenFileSystem", "Initialization Failed");
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public boolean isSavedFile(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appstorage.i2 e17 = this.f76278g.e(str);
        return e17 != null && e17.f76201f;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readDir(java.lang.String str, ik1.b0 b0Var) {
        java.util.LinkedList<com.tencent.mm.plugin.appbrand.appstorage.i2> linkedList = new java.util.LinkedList();
        nf.c.b(linkedList, this.f76278g.i());
        com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager luggageLocalFileObjectManager = this.f76278g;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(luggageLocalFileObjectManager.f());
        java.util.LinkedList linkedList2 = null;
        com.tencent.mm.vfs.r6[] H = (r6Var.m() && r6Var.y()) ? r6Var.H(new com.tencent.mm.plugin.appbrand.appstorage.l2(luggageLocalFileObjectManager)) : null;
        if (H != null && H.length > 0) {
            linkedList2 = new java.util.LinkedList();
            for (com.tencent.mm.vfs.r6 r6Var2 : H) {
                com.tencent.mm.plugin.appbrand.appstorage.i2 d17 = luggageLocalFileObjectManager.d(r6Var2.getName());
                if (d17 != null) {
                    linkedList2.add(d17);
                }
            }
        }
        nf.c.b(linkedList, linkedList2);
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        for (com.tencent.mm.plugin.appbrand.appstorage.i2 i2Var : linkedList) {
            com.tencent.mm.plugin.appbrand.appstorage.h1 h1Var = new com.tencent.mm.plugin.appbrand.appstorage.h1();
            h1Var.f76193a = i2Var.f76199d;
            linkedList3.add(h1Var);
        }
        b0Var.f291824a = linkedList3;
        return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, ik1.b0 b0Var) {
        com.tencent.mm.plugin.appbrand.appstorage.i2 e17 = this.f76278g.e(str);
        if (e17 != null && com.tencent.mm.vfs.w6.j(e17.f76200e)) {
            b0Var.f291824a = com.tencent.mm.plugin.appbrand.appstorage.l1.d(new com.tencent.mm.vfs.r6(e17.f76200e), 0L, -1L);
            return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        }
        return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public final java.io.InputStream readStream(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appstorage.i2 e17 = this.f76278g.e(str);
        if (e17 != null && com.tencent.mm.vfs.w6.j(e17.f76200e)) {
            try {
                return com.tencent.mm.vfs.w6.E(e17.f76200e);
            } catch (java.io.FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readZipEntry(java.lang.String str, ik1.b0 b0Var, java.lang.String str2, long j17, long j18) {
        com.tencent.mm.plugin.appbrand.appstorage.i2 e17 = this.f76278g.e(str);
        return (e17 == null || !com.tencent.mm.vfs.w6.j(e17.f76200e)) ? com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS : com.tencent.mm.plugin.appbrand.appstorage.l1.e(e17.f76200e, b0Var, str2, j17, j18);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void release() {
        this.f76275d = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public boolean removeSavedFile(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appstorage.i2 e17 = this.f76278g.e(str);
        boolean z17 = false;
        if (e17 != null && e17.f76201f) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(e17.f76200e);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m17.a() && m17.f213266a.d(m17.f213267b)) {
                z17 = true;
            }
            com.tencent.mm.plugin.appbrand.appstorage.x1 x1Var = this.f76279h;
            if (x1Var != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.file.n3) x1Var).g(e17.f76200e, -e17.f76202g, "FlattenFileSystem#removeSavedFile");
            }
        }
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.appbrand.appstorage.j1 saveFile(com.tencent.mm.vfs.r6 r22, java.lang.String r23, ik1.b0 r24) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appstorage.n1.saveFile(com.tencent.mm.vfs.r6, java.lang.String, ik1.b0):com.tencent.mm.plugin.appbrand.appstorage.j1");
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 stat(java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat) {
        com.tencent.mm.plugin.appbrand.appstorage.i2 e17 = this.f76278g.e(str);
        if (e17 == null || !com.tencent.mm.vfs.w6.j(e17.f76200e)) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        }
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
        return (fileStructStat != null && com.tencent.mm.plugin.appbrand.appstorage.FileStat.vfsStat(e17.f76200e, fileStructStat) == 0) ? com.tencent.mm.plugin.appbrand.appstorage.j1.OK : j1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 unlink(java.lang.String str) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 getAbsoluteFile(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appstorage.i2 e17 = this.f76278g.e(str);
        if (e17 == null) {
            return null;
        }
        return new com.tencent.mm.vfs.r6(e17.f76200e);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, long j17, long j18, ik1.b0 b0Var) {
        com.tencent.mm.plugin.appbrand.appstorage.i2 e17 = this.f76278g.e(str);
        if (e17 != null && com.tencent.mm.vfs.w6.j(e17.f76200e)) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(e17.f76200e);
            if (j18 == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                j18 = r6Var.C() - j17;
            }
            com.tencent.mm.plugin.appbrand.appstorage.j1 a17 = a(j17, j18, r6Var.C());
            com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
            if (a17 != j1Var) {
                return a17;
            }
            b0Var.f291824a = com.tencent.mm.plugin.appbrand.appstorage.l1.d(r6Var, j17, j18);
            return j1Var;
        }
        return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
    }
}
