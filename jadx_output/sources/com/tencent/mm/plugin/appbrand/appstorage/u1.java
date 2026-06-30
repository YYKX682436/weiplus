package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public interface u1 extends nd.b {
    boolean accept(java.lang.String str);

    com.tencent.mm.plugin.appbrand.appstorage.j1 access(java.lang.String str);

    com.tencent.mm.vfs.r6 allocTempFile(java.lang.String str);

    boolean canRenameFile(java.lang.String str);

    boolean canSaveToLocal(java.lang.String str);

    com.tencent.mm.plugin.appbrand.appstorage.j1 copyTo(java.lang.String str, com.tencent.mm.vfs.r6 r6Var, boolean z17);

    com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, boolean z17, ik1.b0 b0Var);

    com.tencent.mm.vfs.r6 getAbsoluteFile(java.lang.String str);

    com.tencent.mm.vfs.r6 getAbsoluteFile(java.lang.String str, boolean z17);

    com.tencent.mm.vfs.r6 getPrivateAbsoluteFile(java.lang.String str);

    java.util.List getSavedFileList();

    com.tencent.mm.plugin.appbrand.appstorage.x1 getStorageSpaceStatistics();

    com.tencent.mm.plugin.appbrand.appstorage.j1 getTempDirectory(ik1.b0 b0Var);

    void initialize();

    boolean isSavedFile(java.lang.String str);

    com.tencent.mm.plugin.appbrand.appstorage.j1 isdir(java.lang.String str);

    com.tencent.mm.plugin.appbrand.appstorage.j1 mkdir(java.lang.String str, boolean z17);

    com.tencent.mm.plugin.appbrand.appstorage.j1 readDir(java.lang.String str, ik1.b0 b0Var);

    com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, long j17, long j18, ik1.b0 b0Var);

    com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, ik1.b0 b0Var);

    java.io.InputStream readStream(java.lang.String str);

    com.tencent.mm.plugin.appbrand.appstorage.j1 readZipEntry(java.lang.String str, ik1.b0 b0Var, java.lang.String str2, long j17, long j18);

    void release();

    boolean removeSavedFile(java.lang.String str);

    com.tencent.mm.vfs.r6 resolvePath(java.lang.String str);

    com.tencent.mm.plugin.appbrand.appstorage.j1 rmdir(java.lang.String str, boolean z17);

    com.tencent.mm.plugin.appbrand.appstorage.j1 saveFile(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, ik1.b0 b0Var);

    com.tencent.mm.plugin.appbrand.appstorage.j1 stat(java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat);

    com.tencent.mm.plugin.appbrand.appstorage.j1 statDir(java.lang.String str, java.util.List list);

    com.tencent.mm.plugin.appbrand.appstorage.j1 unlink(java.lang.String str);

    com.tencent.mm.plugin.appbrand.appstorage.j1 unzip(java.lang.String str, com.tencent.mm.vfs.r6 r6Var);

    com.tencent.mm.plugin.appbrand.appstorage.j1 writeFile(java.lang.String str, java.io.InputStream inputStream, boolean z17);
}
