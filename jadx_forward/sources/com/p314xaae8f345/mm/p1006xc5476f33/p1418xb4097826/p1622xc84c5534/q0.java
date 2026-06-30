package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes15.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0 f206787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0 r0Var) {
        super(0);
        this.f206787d = r0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0 r0Var = this.f206787d;
        if (r0Var.f206818i != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            vg3.t3 t3Var = r0Var.f206818i;
            com.p314xaae8f345.mm.p2621x8fb0427b.p4 p4Var = Di.f276652f;
            p4Var.getClass();
            fm5.b bVar = new fm5.b(t3Var, p4Var);
            synchronized (p4Var) {
                p4Var.f345714d.remove(bVar);
            }
            r0Var.f206818i = null;
        }
        r0Var.f206821o.y();
        return jz5.f0.f384359a;
    }
}
