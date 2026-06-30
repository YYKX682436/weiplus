package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class u1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.x1 f240029d;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.x1 x1Var) {
        this.f240029d = x1Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        qx3.e eVar = (qx3.e) obj;
        int i17 = eVar.f448885b;
        if (i17 != 1) {
            if (i17 == 2) {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.s1(eVar, this.f240029d));
            } else if (i17 == 3 && eVar.f448884a == c01.z1.r().hashCode()) {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.t1(this.f240029d));
                if (by3.a.f117903b) {
                    b21.m.g();
                    ((ll3.j1) ((c21.i) i95.n0.c(c21.i.class))).getClass();
                    b21.r b17 = b21.m.b();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicFloatBallService", "resumeMusicFloatBall %s", b17);
                    if ((b17 == null || b17.N) ? false : true) {
                        b17.N = true;
                        b21.m.k(b17);
                    }
                    ll3.q0.d(b17);
                }
                by3.a.f117903b = false;
            }
        } else if (eVar.f448884a != c01.z1.r().hashCode()) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.r1(this.f240029d));
        }
        return jz5.f0.f384359a;
    }
}
