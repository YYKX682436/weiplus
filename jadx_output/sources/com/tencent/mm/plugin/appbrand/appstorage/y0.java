package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class y0 implements com.tencent.mm.plugin.appbrand.appstorage.u1 {
    public com.tencent.mm.plugin.appbrand.appstorage.j1 a(long j17, long j18, long j19) {
        return (j17 < 0 || j17 > j19 - 1) ? com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_ILLEGAL_READ_POSITION : (j18 < 1 || j18 > j19 - j17) ? com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_ILLEGAL_READ_LENGTH : com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public boolean accept(java.lang.String str) {
        return this instanceof com.tencent.mm.plugin.magicbrush.fs.d;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 access(java.lang.String str) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 allocTempFile(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public boolean canRenameFile(java.lang.String str) {
        return this instanceof com.tencent.mm.plugin.appbrand.appstorage.j3;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public boolean canSaveToLocal(java.lang.String str) {
        return !(this instanceof com.tencent.mm.plugin.appbrand.appstorage.u0);
    }

    public void cleanupDirectory() {
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 copyTo(java.lang.String str, com.tencent.mm.vfs.r6 r6Var, boolean z17) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, boolean z17, ik1.b0 b0Var) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NOT_SUPPORTED;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.vfs.r6 getAbsoluteFile(java.lang.String str, boolean z17) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 getPrivateAbsoluteFile(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public java.util.List getSavedFileList() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.x1 getStorageSpaceStatistics() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 getTempDirectory(ik1.b0 b0Var) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NOT_SUPPORTED;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void initialize() {
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public boolean isSavedFile(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 isdir(java.lang.String str) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 mkdir(java.lang.String str, boolean z17) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readDir(java.lang.String str, ik1.b0 b0Var) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, ik1.b0 b0Var) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public java.io.InputStream readStream(java.lang.String str) {
        ik1.b0 b0Var = new ik1.b0();
        if (readFile(str, b0Var) == com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
            return new nf.a((java.nio.ByteBuffer) b0Var.f291824a);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readZipEntry(java.lang.String str, ik1.b0 b0Var, java.lang.String str2, long j17, long j18) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void release() {
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public boolean removeSavedFile(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 resolvePath(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 rmdir(java.lang.String str, boolean z17) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 saveFile(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, ik1.b0 b0Var) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NOT_SUPPORTED;
    }

    public void setMaxTotalSize(long j17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 stat(java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 statDir(java.lang.String str, java.util.List list) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 unlink(java.lang.String str) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 unzip(java.lang.String str, com.tencent.mm.vfs.r6 r6Var) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 writeFile(java.lang.String str, java.io.InputStream inputStream, boolean z17) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 getAbsoluteFile(java.lang.String str) {
        return getAbsoluteFile(str, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, long j17, long j18, ik1.b0 b0Var) {
        return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
    }
}
