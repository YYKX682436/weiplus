package v26;

/* loaded from: classes14.dex */
public abstract class g implements v26.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final oz5.l f514535d;

    /* renamed from: e, reason: collision with root package name */
    public final int f514536e;

    /* renamed from: f, reason: collision with root package name */
    public final u26.u f514537f;

    public g(oz5.l lVar, int i17, u26.u uVar) {
        this.f514535d = lVar;
        this.f514536e = i17;
        this.f514537f = uVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.j
    public java.lang.Object a(p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object f17 = p3325xe03a0797.p3326xc267989b.z0.f(new v26.e(kVar, this, null), interfaceC29045xdcb5ca57);
        return f17 == pz5.a.f440719d ? f17 : jz5.f0.f384359a;
    }

    @Override // v26.h0
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j b(oz5.l lVar, int i17, u26.u uVar) {
        oz5.l lVar2 = this.f514535d;
        oz5.l mo7096x348d9a = lVar.mo7096x348d9a(lVar2);
        u26.u uVar2 = u26.u.SUSPEND;
        u26.u uVar3 = this.f514537f;
        int i18 = this.f514536e;
        if (uVar == uVar2) {
            if (i18 != -3) {
                if (i17 != -3) {
                    if (i18 != -2) {
                        if (i17 != -2) {
                            i17 += i18;
                            if (i17 < 0) {
                                i17 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i17 = i18;
            }
            uVar = uVar3;
        }
        return (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo7096x348d9a, lVar2) && i17 == i18 && uVar == uVar3) ? this : g(mo7096x348d9a, i17, uVar);
    }

    public java.lang.String c() {
        return null;
    }

    public abstract java.lang.Object f(u26.r0 r0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    public abstract v26.g g(oz5.l lVar, int i17, u26.u uVar);

    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j h() {
        return null;
    }

    public u26.t0 i(p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        int i17 = this.f514536e;
        if (i17 == -3) {
            i17 = -2;
        }
        p3325xe03a0797.p3326xc267989b.a1 a1Var = p3325xe03a0797.p3326xc267989b.a1.ATOMIC;
        yz5.p fVar = new v26.f(this, null);
        u26.q0 q0Var = new u26.q0(p3325xe03a0797.p3326xc267989b.m0.b(y0Var, this.f514535d), u26.z.a(i17, this.f514537f, null, 4, null));
        q0Var.j0(a1Var, q0Var, fVar);
        return q0Var;
    }

    /* renamed from: toString */
    public java.lang.String mo144002x9616526c() {
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        java.lang.String c17 = c();
        if (c17 != null) {
            arrayList.add(c17);
        }
        oz5.m mVar = oz5.m.f431862d;
        oz5.l lVar = this.f514535d;
        if (lVar != mVar) {
            arrayList.add("context=" + lVar);
        }
        int i17 = this.f514536e;
        if (i17 != -3) {
            arrayList.add("capacity=" + i17);
        }
        u26.u uVar = u26.u.SUSPEND;
        u26.u uVar2 = this.f514537f;
        if (uVar2 != uVar) {
            arrayList.add("onBufferOverflow=" + uVar2);
        }
        return getClass().getSimpleName() + '[' + kz5.n0.g0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
