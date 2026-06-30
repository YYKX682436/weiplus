package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes10.dex */
public final class t7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 f195884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var) {
        super(0);
        this.f195884d = x7Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nj2.f fVar;
        nj2.w wVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = this.f195884d;
        nj2.z B1 = x7Var.B1();
        if (B1 != null && B1.q()) {
            nj2.z B12 = x7Var.B1();
            if (B12 != null && (wVar = B12.f419411u) != null) {
                nj2.z zVar = wVar.f419397a;
                if (zVar.q()) {
                    nj2.r y17 = zVar.y();
                    y17.getClass();
                    pm0.v.X(new nj2.l(y17));
                    zVar.z().r("onTimerUpdateData");
                    zVar.f419412v.c();
                }
            }
        } else {
            nj2.h w17 = x7Var.w1();
            if (w17 != null && w17.P()) {
                nj2.h w18 = x7Var.w1();
                if (w18 != null && (fVar = w18.S) != null) {
                    nj2.h hVar = fVar.f419365a;
                    if (hVar.P()) {
                        nj2.j e07 = nj2.h.e0(hVar);
                        e07.getClass();
                        pm0.v.X(new nj2.l(e07));
                        ((mj2.f) ((jz5.n) hVar.N).mo141623x754a37bb()).r("onTimerUpdateData");
                    }
                }
            } else {
                if (x7Var.A1().q()) {
                    x7Var.A1().z();
                }
                if (x7Var.v1().q()) {
                    x7Var.v1().z();
                }
                if (x7Var.w0() == 0) {
                    x7Var.L1();
                }
                if (x7Var.z1().q()) {
                    x7Var.z1().H();
                }
                if (x7Var.y1().q()) {
                    x7Var.y1().H();
                }
                if (((mm2.o4) x7Var.P0(mm2.o4.class)).Z == null) {
                    jz5.g gVar = x7Var.K;
                    if (((qi2.n) ((jz5.n) gVar).mo141623x754a37bb()).q()) {
                        ((qi2.n) ((jz5.n) gVar).mo141623x754a37bb()).a();
                    }
                    jz5.g gVar2 = x7Var.f196568J;
                    if (((qi2.n) ((jz5.n) gVar2).mo141623x754a37bb()).q()) {
                        ((qi2.n) ((jz5.n) gVar2).mo141623x754a37bb()).a();
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
