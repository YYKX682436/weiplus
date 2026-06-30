package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class g2 implements com.tencent.mm.plugin.appbrand.appstorage.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f76189d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.u1 f76190e = new com.tencent.mm.plugin.appbrand.appstorage.y0();

    public g2(java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        this.f76189d = linkedList2;
        linkedList2.addAll(linkedList);
    }

    public final com.tencent.mm.plugin.appbrand.appstorage.u1 a(java.lang.String str) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var = this.f76190e;
        if (K0) {
            return u1Var;
        }
        java.util.Iterator it = this.f76189d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var2 = (com.tencent.mm.plugin.appbrand.appstorage.u1) it.next();
            if (u1Var2.accept(str)) {
                return u1Var2;
            }
        }
        return u1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public boolean accept(java.lang.String str) {
        java.lang.String[] strArr = {"file://", "http://", "https://"};
        for (int i17 = 0; i17 < 3; i17++) {
            if (nf.z.d(str, strArr[i17])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 access(java.lang.String str) {
        return a(str).access(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 allocTempFile(java.lang.String str) {
        return ((com.tencent.mm.plugin.appbrand.appstorage.n1) b(com.tencent.mm.plugin.appbrand.appstorage.n1.class)).allocTempFile(str);
    }

    public com.tencent.mm.plugin.appbrand.appstorage.u1 b(java.lang.Class cls) {
        java.util.Iterator it = this.f76189d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var = (com.tencent.mm.plugin.appbrand.appstorage.u1) it.next();
            if (cls.isInstance(u1Var)) {
                return u1Var;
            }
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public boolean canRenameFile(java.lang.String str) {
        java.util.Iterator it = this.f76189d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var = (com.tencent.mm.plugin.appbrand.appstorage.u1) it.next();
            if (u1Var.accept(str) && u1Var.canRenameFile(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public boolean canSaveToLocal(java.lang.String str) {
        java.util.Iterator it = this.f76189d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var = (com.tencent.mm.plugin.appbrand.appstorage.u1) it.next();
            if (u1Var.accept(str) && !u1Var.canSaveToLocal(str)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 copyTo(java.lang.String str, com.tencent.mm.vfs.r6 r6Var, boolean z17) {
        return a(str).copyTo(str, r6Var, z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, boolean z17, ik1.b0 b0Var) {
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var;
        com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom;
        java.util.Iterator it = this.f76189d.iterator();
        do {
            boolean hasNext = it.hasNext();
            j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NOT_SUPPORTED;
            if (!hasNext) {
                return j1Var;
            }
            createTempFileFrom = ((com.tencent.mm.plugin.appbrand.appstorage.u1) it.next()).createTempFileFrom(r6Var, str, z17, b0Var);
        } while (createTempFileFrom == j1Var);
        return createTempFileFrom;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 getAbsoluteFile(java.lang.String str) {
        return getAbsoluteFile(str, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 getPrivateAbsoluteFile(java.lang.String str) {
        return a(str).getPrivateAbsoluteFile(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public java.util.List getSavedFileList() {
        return ((com.tencent.mm.plugin.appbrand.appstorage.n1) b(com.tencent.mm.plugin.appbrand.appstorage.n1.class)).getSavedFileList();
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.x1 getStorageSpaceStatistics() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 getTempDirectory(ik1.b0 b0Var) {
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var;
        com.tencent.mm.plugin.appbrand.appstorage.j1 tempDirectory;
        java.util.Iterator it = this.f76189d.iterator();
        do {
            boolean hasNext = it.hasNext();
            j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NOT_SUPPORTED;
            if (!hasNext) {
                return j1Var;
            }
            tempDirectory = ((com.tencent.mm.plugin.appbrand.appstorage.u1) it.next()).getTempDirectory(b0Var);
        } while (tempDirectory == j1Var);
        return tempDirectory;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void initialize() {
        java.util.Iterator it = this.f76189d.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.appstorage.u1) it.next()).initialize();
        }
        this.f76190e.getClass();
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public boolean isSavedFile(java.lang.String str) {
        return ((com.tencent.mm.plugin.appbrand.appstorage.n1) b(com.tencent.mm.plugin.appbrand.appstorage.n1.class)).isSavedFile(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 isdir(java.lang.String str) {
        return a(str).isdir(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 mkdir(java.lang.String str, boolean z17) {
        return a(str).mkdir(str, z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readDir(java.lang.String str, ik1.b0 b0Var) {
        return a(str).readDir(str, b0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, ik1.b0 b0Var) {
        return a(str).readFile(str, b0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public final java.io.InputStream readStream(java.lang.String str) {
        return a(str).readStream(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readZipEntry(java.lang.String str, ik1.b0 b0Var, java.lang.String str2, long j17, long j18) {
        return a(str).readZipEntry(str, b0Var, str2, j17, j18);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void release() {
        java.util.Iterator it = this.f76189d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var = (com.tencent.mm.plugin.appbrand.appstorage.u1) it.next();
            if (u1Var instanceof com.tencent.mm.plugin.appbrand.appstorage.n1) {
                ((com.tencent.mm.plugin.appbrand.appstorage.n1) u1Var).b();
            }
            u1Var.release();
        }
        this.f76190e.getClass();
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public boolean removeSavedFile(java.lang.String str) {
        return ((com.tencent.mm.plugin.appbrand.appstorage.n1) b(com.tencent.mm.plugin.appbrand.appstorage.n1.class)).removeSavedFile(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 resolvePath(java.lang.String str) {
        return a(str).resolvePath(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 rmdir(java.lang.String str, boolean z17) {
        return a(str).rmdir(str, z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 saveFile(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, ik1.b0 b0Var) {
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var;
        com.tencent.mm.plugin.appbrand.appstorage.j1 saveFile;
        java.util.Iterator it = this.f76189d.iterator();
        do {
            boolean hasNext = it.hasNext();
            j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NOT_SUPPORTED;
            if (!hasNext) {
                return j1Var;
            }
            saveFile = ((com.tencent.mm.plugin.appbrand.appstorage.u1) it.next()).saveFile(r6Var, str, b0Var);
        } while (saveFile == j1Var);
        return saveFile;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 stat(java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat) {
        return a(str).stat(str, fileStructStat);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 statDir(java.lang.String str, java.util.List list) {
        return a(str).statDir(str, list);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 unlink(java.lang.String str) {
        return a(str).unlink(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 unzip(java.lang.String str, com.tencent.mm.vfs.r6 r6Var) {
        return a(str).unzip(str, r6Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 writeFile(java.lang.String str, java.io.InputStream inputStream, boolean z17) {
        return a(str).writeFile(str, inputStream, z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.vfs.r6 getAbsoluteFile(java.lang.String str, boolean z17) {
        return a(str).getAbsoluteFile(str, z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, long j17, long j18, ik1.b0 b0Var) {
        return a(str).readFile(str, j17, j18, b0Var);
    }
}
