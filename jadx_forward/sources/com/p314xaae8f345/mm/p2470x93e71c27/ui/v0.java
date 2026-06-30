package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes8.dex */
public final class v0 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d2 f273562d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f273563e;

    public v0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d2 d2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c2 c2Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        d2Var = (i17 & 1) != 0 ? null : d2Var;
        abstractC15633xee433078 = (i17 & 2) != 0 ? null : abstractC15633xee433078;
        this.f273562d = d2Var;
        this.f273563e = abstractC15633xee433078;
    }

    /* renamed from: equals */
    public boolean m75912xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.v0) && mo2128x1ed62e84() == ((com.p314xaae8f345.mm.p2470x93e71c27.ui.v0) obj).mo2128x1ed62e84();
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        if (h() == 1) {
            return this.f273562d != null ? r0.hashCode() : hashCode();
        }
        if (h() != 2) {
            return hashCode();
        }
        return this.f273563e != null ? r0.hashCode() : hashCode();
    }

    @Override // in5.c
    public int h() {
        if (this.f273562d != null) {
            return 1;
        }
        return this.f273563e != null ? 2 : 0;
    }
}
