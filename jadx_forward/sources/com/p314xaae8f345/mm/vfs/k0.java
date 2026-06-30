package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class k0 implements pm5.a, pm5.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f294555a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f294556b = new java.util.HashSet();

    public k0(java.lang.String str) {
        this.f294555a = str;
    }

    @Override // pm5.a
    public java.lang.Iterable a(java.lang.Object obj) {
        return ((com.p314xaae8f345.mm.vfs.q2) obj).mo82286x32b09e(this.f294555a);
    }

    @Override // pm5.d
    public boolean b(java.lang.Object obj) {
        com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) obj;
        return x1Var == null || !this.f294556b.add(x1Var.f294764a);
    }
}
