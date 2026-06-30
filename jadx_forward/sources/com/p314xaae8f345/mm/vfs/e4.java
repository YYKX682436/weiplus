package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public abstract class e4 implements java.lang.Iterable, pm5.j, pm5.k {

    /* renamed from: d, reason: collision with root package name */
    public java.nio.file.DirectoryStream f294439d;

    /* renamed from: e, reason: collision with root package name */
    public final java.nio.file.Path f294440e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.h4 f294441f;

    public e4(java.nio.file.Path path, com.p314xaae8f345.mm.vfs.h4 h4Var) {
        this.f294440e = path;
        this.f294441f = h4Var;
    }

    @Override // pm5.k
    public void e() {
        com.p314xaae8f345.mm.vfs.e8.d(this.f294439d);
        this.f294439d = null;
    }

    /* renamed from: finalize */
    public void m82382xd764dc1e() {
        e();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        java.nio.file.Path path = this.f294440e;
        com.p314xaae8f345.mm.vfs.e8.d(this.f294439d);
        try {
            this.f294439d = java.nio.file.Files.newDirectoryStream(path);
            return new com.p314xaae8f345.mm.vfs.d4(this);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("VFS.NativeFileSystem", e17, "Cannot list directory '" + path + "'");
            this.f294439d = null;
            return java.util.Collections.emptyIterator();
        }
    }
}
