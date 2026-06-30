package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class d3 implements com.p314xaae8f345.mm.vfs.x5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.f1 f294427a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.v5 f294428b;

    public d3(java.lang.String str, com.p314xaae8f345.mm.vfs.v5 v5Var) {
        this.f294427a = new com.p314xaae8f345.mm.vfs.f1(str);
        this.f294428b = v5Var;
    }

    @Override // com.p314xaae8f345.mm.vfs.x5
    public com.p314xaae8f345.mm.vfs.w5 b(java.util.Map map) {
        java.lang.String a17 = this.f294427a.a(map);
        if (a17 == null) {
            return null;
        }
        return new com.p314xaae8f345.mm.vfs.c3(a17, this.f294428b);
    }
}
