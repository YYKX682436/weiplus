package com.p314xaae8f345.mm.vfs;

/* loaded from: classes10.dex */
public final class p6 implements com.p314xaae8f345.mm.vfs.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f294659a = new java.util.LinkedHashMap();

    public final void b(java.lang.String name, com.p314xaae8f345.mm.vfs.c6 storage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        if (this.f294659a.put(name, storage) != null) {
            throw new java.lang.AssertionError("Duplicated filesystem: ".concat(name));
        }
    }

    public final void c(int i17, yz5.l setup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setup, "setup");
        setup.mo146xb9724478(new com.p314xaae8f345.mm.vfs.q(i17, com.p314xaae8f345.mm.vfs.o6.f294649d, this));
    }

    public final void d(int i17, yz5.l storageSetup, yz5.l setup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageSetup, "storageSetup");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setup, "setup");
        setup.mo146xb9724478(new com.p314xaae8f345.mm.vfs.q(i17, storageSetup, this));
    }

    public final void e(java.lang.String name, int[] flagList, yz5.l setup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flagList, "flagList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setup, "setup");
        com.p314xaae8f345.mm.vfs.f6 f6Var = new com.p314xaae8f345.mm.vfs.f6(name);
        f6Var.d(java.util.Arrays.copyOf(flagList, flagList.length));
        setup.mo146xb9724478(f6Var);
        b(name, f6Var.b());
    }
}
