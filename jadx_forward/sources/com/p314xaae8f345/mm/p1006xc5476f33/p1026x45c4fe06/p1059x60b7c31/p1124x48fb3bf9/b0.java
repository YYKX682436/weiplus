package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9;

/* loaded from: classes7.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f165407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f165408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f165409f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f165410g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.c0 f165411h;

    public b0(boolean z17, of1.w1 w1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.c0 c0Var2) {
        this.f165407d = z17;
        this.f165408e = w1Var;
        this.f165409f = c0Var;
        this.f165410g = i17;
        this.f165411h = c0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        of1.x1 m151222x143f1b92;
        of1.x1 m151222x143f1b922;
        boolean z17 = this.f165407d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.c0 c0Var = this.f165411h;
        int i17 = this.f165410g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var2 = this.f165409f;
        of1.w1 w1Var = this.f165408e;
        if (z17) {
            if (w1Var == null || (m151222x143f1b922 = w1Var.m151222x143f1b92()) == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.z zVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.z(c0Var2, i17, c0Var);
            of1.v0 v0Var = (of1.v0) m151222x143f1b922;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd = v0Var.f426555a2;
            if (c19231x33dc2abd == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("transHelper");
                throw null;
            }
            of1.p0 p0Var = new of1.p0(v0Var, zVar);
            synchronized (c19231x33dc2abd.f263285r) {
                if (c19231x33dc2abd.f263275e == null) {
                    c19231x33dc2abd.f263286s.add(p0Var);
                    return;
                } else {
                    p0Var.mo152xb9724478();
                    return;
                }
            }
        }
        if (w1Var == null || (m151222x143f1b92 = w1Var.m151222x143f1b92()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.a0 a0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.a0(c0Var2, i17, c0Var);
        of1.v0 v0Var2 = (of1.v0) m151222x143f1b92;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd2 = v0Var2.f426555a2;
        if (c19231x33dc2abd2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("transHelper");
            throw null;
        }
        of1.l0 l0Var = new of1.l0(v0Var2, a0Var);
        synchronized (c19231x33dc2abd2.f263285r) {
            if (c19231x33dc2abd2.f263275e == null) {
                c19231x33dc2abd2.f263286s.add(l0Var);
            } else {
                l0Var.mo152xb9724478();
            }
        }
    }
}
