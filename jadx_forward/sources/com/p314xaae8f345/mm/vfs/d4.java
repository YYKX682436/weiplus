package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class d4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f294429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.e4 f294430e;

    public d4(com.p314xaae8f345.mm.vfs.e4 e4Var) {
        this.f294430e = e4Var;
        this.f294429d = new pm5.m(e4Var.f294439d.iterator(), e4Var, e4Var, false);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        try {
            return ((pm5.m) this.f294429d).hasNext();
        } catch (java.lang.RuntimeException e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("VFS.NativeFileSystem", e17, "Cannot iterate through directory: " + this.f294430e.f294440e.toString());
            return false;
        }
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return ((pm5.m) this.f294429d).next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("remove");
    }
}
