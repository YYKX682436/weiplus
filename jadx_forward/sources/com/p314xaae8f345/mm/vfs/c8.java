package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class c8 implements pm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.q2 f294416a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f294417b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.b8 f294418c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.x1[] f294419d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f294420e;

    public c8(com.p314xaae8f345.mm.vfs.q2 q2Var, boolean z17, com.p314xaae8f345.mm.vfs.b8 b8Var) {
        this.f294416a = q2Var;
        this.f294417b = z17;
        this.f294418c = b8Var;
        com.p314xaae8f345.mm.vfs.x1[] x1VarArr = new com.p314xaae8f345.mm.vfs.x1[1];
        this.f294419d = x1VarArr;
        this.f294420e = java.util.Arrays.asList(x1VarArr);
    }

    @Override // pm5.a
    public java.lang.Iterable a(java.lang.Object obj) {
        java.lang.Iterable mo82286x32b09e;
        com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) obj;
        this.f294419d[0] = x1Var;
        boolean z17 = x1Var.f294769f;
        java.util.List list = this.f294420e;
        if (!z17) {
            return list;
        }
        com.p314xaae8f345.mm.vfs.b8 b8Var = this.f294418c;
        if (!(b8Var == null || b8Var.mo82370xab27b508(x1Var)) || (mo82286x32b09e = this.f294416a.mo82286x32b09e(x1Var.f294764a)) == null) {
            return list;
        }
        pm5.b bVar = new pm5.b(mo82286x32b09e, this);
        java.util.Set singleton = java.util.Collections.singleton(x1Var);
        return this.f294417b ? new pm5.i(bVar, singleton) : new pm5.i(singleton, bVar);
    }
}
