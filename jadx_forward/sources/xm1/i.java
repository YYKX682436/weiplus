package xm1;

/* loaded from: classes14.dex */
public class i extends xm1.h {
    @Override // xm1.h
    public boolean A(boolean z17) {
        ym1.e eVar = ym1.f.f544667h;
        eVar.k();
        boolean z18 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.Bi()) {
            return false;
        }
        wo.c cVar = wo.v1.f529356c;
        if (cVar.f529157r0) {
            if (z17) {
                int i17 = cVar.f529159s0;
                r8 = i17 > -1 ? i17 : 3;
                if (r8 != f()) {
                    xm1.h.y(this, r8, null, 2, null);
                }
                if (!mm1.g.b(c())) {
                    super.a(true);
                }
            } else {
                int i18 = cVar.f529161t0;
                r8 = i18 > -1 ? i18 : 3;
                if (r8 != eVar.b().f()) {
                    xm1.h.y(eVar.b(), r8, null, 2, null);
                }
                if (mm1.g.b(c())) {
                    super.a(false);
                }
            }
            return z17;
        }
        if (cVar.f529122a) {
            if (cVar.b()) {
                int i19 = cVar.f529126c;
                if (i19 >= 0) {
                    xm1.h.y(this, i19, null, 2, null);
                } else if (cVar.f529128d >= 0) {
                    if (z17) {
                        xm1.h.y(this, 0, null, 2, null);
                    } else {
                        xm1.h.y(this, 2, null, 2, null);
                    }
                }
                if (cVar.f529130e > 0) {
                    super.a(z17);
                }
                return z17;
            }
            if (cVar.a()) {
                if (z17) {
                    if (cVar.a() && (cVar.f529132f & 16) > 0) {
                        z18 = true;
                    }
                    if (z18) {
                        super.a(true);
                    }
                    if (cVar.e() >= 0) {
                        xm1.h.y(this, cVar.e(), null, 2, null);
                    }
                } else {
                    if (cVar.a() && (cVar.f529132f & 1) > 0) {
                        z18 = true;
                    }
                    if (z18) {
                        s(true);
                    }
                    if (cVar.d() >= 0) {
                        xm1.h.y(this, cVar.d(), null, 2, null);
                    }
                }
                return z17;
            }
        }
        if (z17) {
            int i27 = cVar.B;
            r8 = i27 > -1 ? i27 : 3;
            if (r8 != eVar.b().f()) {
                xm1.h.y(eVar.b(), r8, null, 2, null);
            }
            super.a(true);
        } else {
            if (fp.e0.g() && 2 == wo.v1.f529366m.f529283h) {
                r8 = 2;
            }
            int i28 = cVar.C;
            if (i28 > -1) {
                r8 = i28;
            }
            if (r8 != eVar.b().f()) {
                xm1.h.y(eVar.b(), r8, null, 2, null);
            }
            super.a(z17);
        }
        return z17;
    }
}
