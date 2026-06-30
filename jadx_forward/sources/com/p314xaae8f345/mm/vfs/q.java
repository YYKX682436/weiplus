package com.p314xaae8f345.mm.vfs;

/* loaded from: classes10.dex */
public final class q implements com.p314xaae8f345.mm.vfs.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f294662a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f294663b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.p6 f294664c;

    public q(int i17, yz5.l stgSetup, com.p314xaae8f345.mm.vfs.p6 vb6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stgSetup, "stgSetup");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vb6, "vb");
        this.f294662a = i17;
        this.f294663b = stgSetup;
        this.f294664c = vb6;
    }

    public final void b(java.lang.String name, int[] flagList, yz5.l setup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flagList, "flagList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setup, "setup");
        com.p314xaae8f345.mm.vfs.f6 f6Var = new com.p314xaae8f345.mm.vfs.f6(name);
        this.f294663b.mo146xb9724478(f6Var);
        f6Var.f294470m = this.f294662a;
        f6Var.d(java.util.Arrays.copyOf(flagList, flagList.length));
        setup.mo146xb9724478(f6Var);
        this.f294664c.b(name, f6Var.b());
    }
}
