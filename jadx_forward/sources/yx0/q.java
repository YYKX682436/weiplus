package yx0;

/* loaded from: classes5.dex */
public final class q implements com.p314xaae8f345.p457x3304c6.p461x3a6d265.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f549093a;

    public q(yx0.b8 corePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(corePlugin, "corePlugin");
        this.f549093a = new java.lang.ref.WeakReference(corePlugin);
    }

    public void a(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2) {
        yx0.b8 b8Var;
        if (c4128x879fba0a == null || c4128x879fba0a2 == null || (b8Var = (yx0.b8) this.f549093a.get()) == null) {
            return;
        }
        if (b8Var.B1 == 1) {
            c4128x879fba0a2 = b8Var.f548710d.mo47330x4bddc11e();
        } else if (!c4128x879fba0a2.m33980x66356283()) {
            c4128x879fba0a2 = b8Var.V1;
        }
        yz5.p pVar = b8Var.U1;
        if (pVar != null) {
            pVar.mo149xb9724478(c4128x879fba0a, c4128x879fba0a2);
        }
        boolean m33980x66356283 = c4128x879fba0a2.m33980x66356283();
        if (c4128x879fba0a.m33980x66356283() && m33980x66356283) {
            double m33988x124aa384 = (c4128x879fba0a.m33988x124aa384() / c4128x879fba0a2.m33988x124aa384()) * 100;
            yz5.l lVar = b8Var.T1;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Integer.valueOf((int) m33988x124aa384));
            }
        }
        c4128x879fba0a.m33988x124aa384();
        c4128x879fba0a2.m33988x124aa384();
        if (m33980x66356283 && b8Var.f548725s == yx0.v.f549238s && !b8Var.F1 && !c4128x879fba0a.m33986x9f3f7b48(c4128x879fba0a2)) {
            b8Var.F1 = true;
            p3325xe03a0797.p3326xc267989b.y0 y0Var = b8Var.L;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new yx0.p(c4128x879fba0a, c4128x879fba0a2, b8Var, null), 2, null);
        }
    }
}
