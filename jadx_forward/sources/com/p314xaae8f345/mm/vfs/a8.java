package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class a8 implements pm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.b8 f294328a;

    public a8(com.p314xaae8f345.mm.vfs.b8 b8Var) {
        this.f294328a = b8Var;
    }

    @Override // pm5.a
    public java.lang.Iterable a(java.lang.Object obj) {
        com.p314xaae8f345.mm.vfs.q2 q2Var = (com.p314xaae8f345.mm.vfs.q2) obj;
        java.util.Set singleton = java.util.Collections.singleton(q2Var);
        if (!(q2Var instanceof com.p314xaae8f345.mm.vfs.p2)) {
            return singleton;
        }
        com.p314xaae8f345.mm.vfs.b8 b8Var = this.f294328a;
        return (b8Var == null || b8Var.mo82370xab27b508(q2Var)) ? new pm5.i(singleton, new pm5.b(((com.p314xaae8f345.mm.vfs.p2) q2Var).E(), this)) : singleton;
    }
}
