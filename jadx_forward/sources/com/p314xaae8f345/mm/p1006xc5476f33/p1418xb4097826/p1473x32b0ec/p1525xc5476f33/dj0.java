package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class dj0 implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ej0 f193830a;

    public dj0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ej0 ej0Var) {
        this.f193830a = ej0Var;
    }

    @Override // j35.a
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        kn0.p pVar;
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ej0 ej0Var = this.f193830a;
        if (ej0Var.f193962q) {
            if (ej0Var.f193961p.mo11219xd0598cf8() == 1) {
                zl2.r4 r4Var = zl2.r4.f555483a;
                if (r4Var.W1(ej0Var.S0()) || r4Var.z1(ej0Var.S0())) {
                    if (sn0.b.f491497e2 == null) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.LiveCoreSecondaryDevice", "createInstance", new java.lang.Object[0]);
                        sn0.b.f491497e2 = new sn0.b();
                    }
                    sn0.b bVar = sn0.b.f491497e2;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
                    bVar.D.f391114a = true;
                } else {
                    if (in0.q.f374302b2 == null) {
                        in0.q.f374302b2 = new in0.q(rn0.a.f479142a.a());
                    }
                    in0.q qVar = in0.q.f374302b2;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar);
                    qVar.D.f391114a = true;
                }
            } else {
                co0.b c17 = co0.b.f125242e2.c(((mm2.e1) ej0Var.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
                if (c17 != null && (pVar = c17.D) != null) {
                    pVar.f391114a = true;
                }
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 2);
            bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 12);
            ej0Var.f193961p.mo46557x60d69242(qo0.b.B, bundle);
            if (ej0Var.f193961p.mo11219xd0598cf8() != 1) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Mj(true, ml2.z1.f409866g);
                return;
            }
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            y4Var.U = true;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            y4Var.V = false;
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.z4 z4Var = ml2.z4.f409885g;
            ml2.z1 z1Var = ml2.z1.f409864e;
            zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(2), null, 4, null);
        }
    }

    @Override // j35.a
    public void b(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        qo0.c.a(this.f193830a.f193961p, qo0.b.G, null, 2, null);
    }

    @Override // j35.a
    public void c(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        qo0.c.a(this.f193830a.f193961p, qo0.b.E, null, 2, null);
    }
}
