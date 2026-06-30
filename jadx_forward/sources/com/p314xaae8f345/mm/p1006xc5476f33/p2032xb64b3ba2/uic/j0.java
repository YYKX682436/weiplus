package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx3.e f239965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v0 f239966e;

    public j0(qx3.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v0 v0Var) {
        this.f239965d = eVar;
        this.f239966e = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List<ox3.a> m82898xfb7e5820;
        java.util.List<ox3.a> m82898xfb7e58202;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        java.util.List<ox3.a> m82898xfb7e58203;
        qx3.e eVar = this.f239965d;
        long j17 = eVar.f448884a;
        int i17 = eVar.f448885b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v0 v0Var = this.f239966e;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = v0Var.f240051m;
            if (c22848x6ddd90cf2 == null || (m82898xfb7e5820 = c22848x6ddd90cf2.m82898xfb7e5820()) == null) {
                return;
            }
            for (ox3.a aVar : m82898xfb7e5820) {
                if (aVar.f431255e && aVar.mo2128x1ed62e84() != j17) {
                    aVar.f431255e = false;
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = v0Var.f240051m;
                    if (c22848x6ddd90cf3 != null) {
                        c22848x6ddd90cf3.d0(aVar.mo2128x1ed62e84(), java.lang.Boolean.FALSE);
                    }
                }
            }
            return;
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf4 = v0Var.f240051m;
            if (c22848x6ddd90cf4 == null || (m82898xfb7e58202 = c22848x6ddd90cf4.m82898xfb7e5820()) == null) {
                return;
            }
            for (ox3.a aVar2 : m82898xfb7e58202) {
                if (aVar2.mo2128x1ed62e84() == j17) {
                    aVar2.f431255e = true;
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf5 = v0Var.f240051m;
                    if (c22848x6ddd90cf5 != null) {
                        c22848x6ddd90cf5.d0(aVar2.mo2128x1ed62e84(), java.lang.Boolean.TRUE);
                    }
                } else if (aVar2.f431255e) {
                    aVar2.f431255e = false;
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf6 = v0Var.f240051m;
                    if (c22848x6ddd90cf6 != null) {
                        c22848x6ddd90cf6.d0(aVar2.mo2128x1ed62e84(), java.lang.Boolean.FALSE);
                    }
                }
            }
            return;
        }
        if (i17 != 3 || (c22848x6ddd90cf = v0Var.f240051m) == null || (m82898xfb7e58203 = c22848x6ddd90cf.m82898xfb7e5820()) == null) {
            return;
        }
        for (ox3.a aVar3 : m82898xfb7e58203) {
            if (aVar3.f431255e && aVar3.mo2128x1ed62e84() == j17) {
                aVar3.f431255e = false;
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf7 = v0Var.f240051m;
                if (c22848x6ddd90cf7 != null) {
                    c22848x6ddd90cf7.d0(aVar3.mo2128x1ed62e84(), java.lang.Boolean.FALSE);
                }
            }
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
    }
}
