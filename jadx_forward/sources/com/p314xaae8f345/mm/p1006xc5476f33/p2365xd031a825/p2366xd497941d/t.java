package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class t implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.u f261026a;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.u uVar) {
        this.f261026a = uVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.u uVar = this.f261026a;
        if (uVar.f420366a.isFinishing() || uVar.f420366a.isDestroyed() || fVar.f152148a != 0 || fVar.f152149b != 0) {
            return null;
        }
        r45.pj5 pj5Var = (r45.pj5) fVar.f152151d;
        if (pj5Var.f464636d == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pj5Var.f464637e)) {
            return null;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.L(((r45.pj5) fVar.f152151d).f464637e);
        return null;
    }
}
