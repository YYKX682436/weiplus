package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2;

/* loaded from: classes15.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4 f172881a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.s f172882b;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f172884d;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b1 f172883c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.l(this);

    /* renamed from: e, reason: collision with root package name */
    public int f172885e = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public boolean f172886f = false;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4 t4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.s sVar) {
        this.f172881a = t4Var;
        this.f172882b = sVar;
    }

    public final void a(int i17, int i18, int i19, int i27, int i28) {
        int i29 = this.f172885e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4 t4Var = this.f172881a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.s sVar = this.f172882b;
        if ((i29 == Integer.MIN_VALUE || i29 >= 0 - i28) && i18 - i17 >= i27 + i28) {
            sVar.f172834m = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4) t4Var).m53466xfb86a31b();
            sVar.f172826e = i27 + (i28 * 2);
            sVar.f172828g = 0 - i28;
            sVar.f172829h = true;
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 e4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4) t4Var;
        if (i17 - e4Var.m53466xfb86a31b().getHeight() >= i27) {
            sVar.f172834m = e4Var.m53466xfb86a31b();
            sVar.f172826e = (i28 * 2) + i27;
            sVar.f172828g = (-(i27 + i28)) - e4Var.m53466xfb86a31b().getHeight();
            sVar.f172829h = true;
            return;
        }
        if (i27 > i19) {
            a(i17, i18, i19, i27 - i19, i28);
            return;
        }
        sVar.f172826e = i19;
        sVar.f172834m = e4Var.m53466xfb86a31b();
        int i37 = 0 - i28;
        if (this.f172885e < i37) {
            sVar.f172828g = (-(i27 + i28)) - e4Var.m53466xfb86a31b().getHeight();
            sVar.f172829h = true;
        } else {
            sVar.f172828g = i37;
            sVar.f172829h = true;
        }
    }

    public final void b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.s sVar = this.f172882b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.v vVar = sVar.f172825d;
        if (vVar != null && sVar.b()) {
            if (1 == i17 && this.f172886f) {
                this.f172885e = Integer.MIN_VALUE;
                this.f172886f = false;
            }
            vVar.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.n(this, vVar, i17));
        }
    }
}
