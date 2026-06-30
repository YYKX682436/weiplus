package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class b5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f163260b;

    public b5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, boolean z17) {
        this.f163259a = lVar;
        this.f163260b = z17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = (com.p314xaae8f345.mm.vfs.r6) obj;
        if (!this.f163259a.mo50262x39e05d35()) {
            km5.u.b().a(new java.lang.Exception("component not running"));
        } else {
            if (!this.f163260b) {
                return r6Var;
            }
            try {
                return new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t7.e(r6Var.o()));
            } catch (java.lang.Exception e17) {
                if (z65.c.a()) {
                    throw e17;
                }
                km5.u.b().a(e17);
            }
        }
        return null;
    }
}
