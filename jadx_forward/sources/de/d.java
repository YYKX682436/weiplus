package de;

/* loaded from: classes7.dex */
public final class d implements de.a {
    @Override // de.a
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime, yz5.l callback) {
        jz5.f0 f0Var;
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f229341e = runtime.C0().getF229341e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var2 = f229341e != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) f229341e.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class) : null;
        if (f0Var2 != null) {
            ce.g gVar = (ce.g) runtime.C0().V0().B1(ce.g.class);
            com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad m34856x4a42b983 = (gVar == null || (c4216x654bedf2 = ((ce.o) gVar).f122219g) == null) ? null : c4216x654bedf2.m34856x4a42b983();
            if (m34856x4a42b983 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicBrushCaptureDelegate", "hy: no magicbrush.");
                callback.mo146xb9724478(null);
            } else {
                if ((m34856x4a42b983.f130110a == 0 ? false : m34856x4a42b983.m34768x51ffefa(m34856x4a42b983.f130110a)) && f0Var2.g()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicBrushCaptureDelegate", "hy: you can not ");
                }
                callback.mo146xb9724478(yg.b.e(m34856x4a42b983.f130124o, null, 1, null));
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicBrushCaptureDelegate", "hy: no js thread handler. can not capture magicbrush screenshot");
            callback.mo146xb9724478(null);
        }
    }
}
