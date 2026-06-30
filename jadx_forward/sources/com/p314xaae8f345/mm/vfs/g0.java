package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class g0 extends com.p314xaae8f345.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f294477e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.C22743x31c787d9 f294478f;

    public g0(com.p314xaae8f345.mm.vfs.C22743x31c787d9 c22743x31c787d9, com.p314xaae8f345.mm.vfs.q2 dbFs, com.p314xaae8f345.mm.vfs.q2 fbFs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dbFs, "dbFs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fbFs, "fbFs");
        this.f294478f = c22743x31c787d9;
        this.f294477e = kz5.c0.i(fbFs, dbFs);
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public java.util.List K() {
        return this.f294477e;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public com.p314xaae8f345.mm.vfs.q2 L(java.lang.String path, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.util.List list = this.f294477e;
        if (i17 != 0 && kz5.v.g(com.p314xaae8f345.mm.vfs.j0.f294541a, path, 0, 0, 6, null) >= 0) {
            return (com.p314xaae8f345.mm.vfs.q2) list.get(1);
        }
        return (com.p314xaae8f345.mm.vfs.q2) list.get(0);
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public java.lang.Iterable M(java.lang.String path, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        int g17 = kz5.v.g(com.p314xaae8f345.mm.vfs.j0.f294541a, path, 0, 0, 6, null);
        java.util.List list = this.f294477e;
        if (g17 >= 0) {
            java.util.Set singleton = java.util.Collections.singleton(list.get(1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(singleton, "singleton(...)");
            return singleton;
        }
        java.util.Set singleton2 = java.util.Collections.singleton(list.get(0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(singleton2, "singleton(...)");
        return singleton2;
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb y() {
        return this.f294478f;
    }
}
