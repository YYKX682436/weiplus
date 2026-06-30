package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public abstract class m0 {
    public static final oz5.l a(oz5.l lVar, oz5.l lVar2, boolean z17) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        p3325xe03a0797.p3326xc267989b.l0 l0Var = p3325xe03a0797.p3326xc267989b.l0.f392083d;
        boolean booleanValue = ((java.lang.Boolean) lVar.mo7093x300c01(bool, l0Var)).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) lVar2.mo7093x300c01(bool, l0Var)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return lVar.mo7096x348d9a(lVar2);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = lVar2;
        oz5.m mVar = oz5.m.f431862d;
        oz5.l lVar3 = (oz5.l) lVar.mo7093x300c01(mVar, new p3325xe03a0797.p3326xc267989b.k0(h0Var, z17));
        if (booleanValue2) {
            h0Var.f391656d = ((oz5.l) h0Var.f391656d).mo7093x300c01(mVar, p3325xe03a0797.p3326xc267989b.j0.f392077d);
        }
        return lVar3.mo7096x348d9a((oz5.l) h0Var.f391656d);
    }

    public static final oz5.l b(p3325xe03a0797.p3326xc267989b.y0 y0Var, oz5.l lVar) {
        oz5.l a17 = a(y0Var.getF93115e(), lVar, true);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        if (a17 == p0Var) {
            return a17;
        }
        int i17 = oz5.f.Y0;
        return a17.get(oz5.e.f431860d) == null ? a17.mo7096x348d9a(p0Var) : a17;
    }

    public static final p3325xe03a0797.p3326xc267989b.c4 c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, oz5.l lVar, java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.c4 c4Var = null;
        if (!(interfaceC29045xdcb5ca57 instanceof qz5.e)) {
            return null;
        }
        if (!(lVar.get(p3325xe03a0797.p3326xc267989b.d4.f391701d) != null)) {
            return null;
        }
        qz5.e eVar = (qz5.e) interfaceC29045xdcb5ca57;
        while (true) {
            if ((eVar instanceof p3325xe03a0797.p3326xc267989b.m1) || (eVar = eVar.mo144028x366976c()) == null) {
                break;
            }
            if (eVar instanceof p3325xe03a0797.p3326xc267989b.c4) {
                c4Var = (p3325xe03a0797.p3326xc267989b.c4) eVar;
                break;
            }
        }
        if (c4Var != null) {
            c4Var.f391683g.set(new jz5.l(lVar, obj));
        }
        return c4Var;
    }
}
