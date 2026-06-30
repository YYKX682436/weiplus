package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public abstract class o8 extends com.p314xaae8f345.mm.vfs.a implements com.p314xaae8f345.mm.vfs.p2 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.q2 f294651e;

    public o8(com.p314xaae8f345.mm.vfs.q2 q2Var) {
        this.f294651e = q2Var;
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public java.lang.Iterable C(java.lang.String str) {
        return this.f294651e.C(str);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public java.lang.String D(java.lang.String str, boolean z17) {
        return this.f294651e.D(str, z17);
    }

    @Override // com.p314xaae8f345.mm.vfs.p2
    public java.util.List E() {
        return java.util.Collections.singletonList(this.f294651e);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public boolean F(java.lang.String str) {
        return this.f294651e.F(str);
    }

    @Override // com.p314xaae8f345.mm.vfs.a
    public long G(java.lang.String str, com.p314xaae8f345.mm.vfs.q2 q2Var, java.lang.String str2, boolean z17) {
        return this.f294651e.i(str, q2Var, str2, z17);
    }

    @Override // com.p314xaae8f345.mm.vfs.a
    public boolean H(java.lang.String str, com.p314xaae8f345.mm.vfs.q2 q2Var, java.lang.String str2) {
        com.p314xaae8f345.mm.vfs.q2 q17 = com.p314xaae8f345.mm.vfs.e8.q(this.f294651e, str, 2);
        com.p314xaae8f345.mm.vfs.q2 q18 = com.p314xaae8f345.mm.vfs.e8.q(q2Var, str2, 1);
        if (q17 == null || q18 == null) {
            throw new java.io.IOException("Cannot resolve delegate filesystem.");
        }
        return q17 instanceof com.p314xaae8f345.mm.vfs.a ? ((com.p314xaae8f345.mm.vfs.a) q17).H(str, q18, str2) : q17.t(str, q18, str2);
    }

    @Override // com.p314xaae8f345.mm.vfs.a
    public boolean I(java.lang.String str, com.p314xaae8f345.mm.vfs.q2 q2Var, java.lang.String str2) {
        com.p314xaae8f345.mm.vfs.q2 q17 = com.p314xaae8f345.mm.vfs.e8.q(this.f294651e, str2, 2);
        com.p314xaae8f345.mm.vfs.q2 q18 = com.p314xaae8f345.mm.vfs.e8.q(q2Var, str, 1);
        if (q18 == null || q17 == null) {
            return false;
        }
        if (q17 instanceof com.p314xaae8f345.mm.vfs.a) {
            return ((com.p314xaae8f345.mm.vfs.a) q17).I(str, q18, str2);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public java.io.InputStream a(java.lang.String str) {
        return this.f294651e.a(str);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public java.io.OutputStream c(java.lang.String str, boolean z17) {
        return this.f294651e.c(str, z17);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public boolean d(java.lang.String str) {
        return this.f294651e.d(str);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public boolean e(java.lang.String str, boolean z17) {
        return this.f294651e.e(str, z17);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.o2 g(java.lang.String str) {
        return this.f294651e.g(str);
    }

    @Override // com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    public java.nio.channels.WritableByteChannel h(java.lang.String str, boolean z17) {
        return this.f294651e.h(str, z17);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    /* renamed from: list */
    public java.lang.Iterable mo82286x32b09e(java.lang.String str) {
        return this.f294651e.mo82286x32b09e(str);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.x1 m(java.lang.String str) {
        return this.f294651e.m(str);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public boolean n(java.lang.String str, long j17) {
        return this.f294651e.n(str, j17);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public int o() {
        return this.f294651e.o();
    }

    @Override // com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
        this.f294651e.q(cancellationSignal);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public boolean r(java.lang.String str) {
        return this.f294651e.r(str);
    }

    @Override // com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    public java.nio.channels.ReadableByteChannel s(java.lang.String str) {
        return this.f294651e.s(str);
    }

    @Override // com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    public android.os.ParcelFileDescriptor x(java.lang.String str, java.lang.String str2) {
        return this.f294651e.x(str, str2);
    }

    public o8(com.p314xaae8f345.mm.vfs.q2 q2Var, com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb, java.util.Map map) {
        super(interfaceC22750xe27c22eb, map);
        this.f294651e = q2Var;
    }
}
