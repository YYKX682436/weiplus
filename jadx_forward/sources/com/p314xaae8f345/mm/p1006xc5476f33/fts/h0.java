package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes12.dex */
public class h0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f218946n = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);

    /* renamed from: o, reason: collision with root package name */
    public boolean f218947o = false;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 f218948p;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var) {
        this.f218948p = d0Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "CheckLanguageUpdate";
    }

    @Override // p13.c
    public boolean i() {
        int k17 = (int) this.f218948p.f218914f.k(-3L, 0L);
        int hashCode = this.f218946n.hashCode();
        boolean z17 = k17 != hashCode;
        this.f218947o = z17;
        if (k17 != 0 && z17) {
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6197x2d9053b9().e();
        }
        this.f218948p.f218914f.q(-3L, hashCode);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{changed: %b}", java.lang.Boolean.valueOf(this.f218947o));
    }
}
