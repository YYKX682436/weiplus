package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9;

/* loaded from: classes11.dex */
public final class h0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.j0 f164331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.C12218xee12cb06 f164332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f164333c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f164334d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.j0 j0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.C12218xee12cb06 c12218xee12cb06, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, int i17) {
        this.f164331a = j0Var;
        this.f164332b = c12218xee12cb06;
        this.f164333c = u3Var;
        this.f164334d = i17;
    }

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.j0 j0Var = this.f164331a;
        m50421x3c6fed6a = j0Var.m50421x3c6fed6a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.C12218xee12cb06 c12218xee12cb06 = this.f164332b;
        if (m50421x3c6fed6a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ProfileTask", "handleRequest, getNow callback, context has already been detached!");
            c12218xee12cb06.f164298d = 0;
            j0Var.m50420x7b736e5c(c12218xee12cb06);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f164333c;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || ((int) n17.E2) <= 0) {
            n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(str);
            z17 = false;
        } else {
            str = n17.d1();
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ProfileTask", "handleRequest, getNow callback fail");
            c12218xee12cb06.f164298d = 0;
            j0Var.m50420x7b736e5c(c12218xee12cb06);
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.g.f(str, 3);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.wi().i(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
        if (n17.k2()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, n17.d1() + ',' + this.f164334d);
            c12218xee12cb06.f164299e = c12218xee12cb06.f164299e | 1;
        }
        if (n17.r2()) {
            c12218xee12cb06.f164299e |= 2;
        }
        c12218xee12cb06.f164298d = 1;
        j0Var.m50420x7b736e5c(c12218xee12cb06);
    }
}
