package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class z extends com.p314xaae8f345.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.q2[] f294795e;

    /* renamed from: f, reason: collision with root package name */
    public final int f294796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.C22741x121c47d0 f294797g;

    public z(com.p314xaae8f345.mm.vfs.C22741x121c47d0 c22741x121c47d0, com.p314xaae8f345.mm.vfs.q2[] q2VarArr, int i17) {
        this.f294797g = c22741x121c47d0;
        this.f294795e = q2VarArr;
        this.f294796f = i17;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public java.util.List K() {
        return java.util.Arrays.asList(this.f294795e);
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public com.p314xaae8f345.mm.vfs.q2 L(java.lang.String str, int i17) {
        for (com.p314xaae8f345.mm.vfs.y yVar : this.f294797g.f294232f) {
            java.util.regex.Pattern pattern = yVar.f294777a;
            if (pattern == null || pattern.matcher(str).matches()) {
                return this.f294795e[yVar.f294778b];
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.o2 g(java.lang.String str) {
        return this.f294795e[r0.length - 1].g(str);
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.q2
    public int o() {
        return this.f294796f;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.q2
    public boolean r(java.lang.String str) {
        boolean z17 = false;
        for (com.p314xaae8f345.mm.vfs.q2 q2Var : this.f294795e) {
            z17 |= q2Var.r(str);
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb y() {
        return this.f294797g;
    }
}
