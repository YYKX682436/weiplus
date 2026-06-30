package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class s implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.u f261020a;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.u uVar) {
        this.f261020a = uVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.u uVar = this.f261020a;
        if (!uVar.f420366a.isFinishing()) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = uVar.f420366a;
            if (!abstractActivityC21394xb3d2c0cf.isDestroyed()) {
                ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf).m83114xe5d7a18f();
                if (fVar.f152148a == 0 && fVar.f152149b == 0) {
                    r45.tj5 tj5Var = (r45.tj5) fVar.f152151d;
                    if (tj5Var.f468039d == 0) {
                        uVar.f261032d.o(abstractActivityC21394xb3d2c0cf, 0, new android.os.Bundle());
                    } else {
                        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.M(abstractActivityC21394xb3d2c0cf, tj5Var.f468040e);
                    }
                    return java.lang.Boolean.TRUE;
                }
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.K(abstractActivityC21394xb3d2c0cf, fVar.f152150c);
            }
        }
        return null;
    }
}
