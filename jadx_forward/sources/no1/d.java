package no1;

/* loaded from: classes5.dex */
public final class d implements mv.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1261x7643c6b5.ServiceC12852xd025bba9 f420269a;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1261x7643c6b5.ServiceC12852xd025bba9 serviceC12852xd025bba9) {
        this.f420269a = serviceC12852xd025bba9;
    }

    @Override // mv.z
    public void a(mv.e0 e0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1261x7643c6b5.ServiceC12852xd025bba9 serviceC12852xd025bba9 = this.f420269a;
        if (e0Var != null) {
            if (e0Var.f413029c != mv.f0.f413034d) {
                java.lang.String str = e0Var.f413030d;
                if (!(str.length() == 0)) {
                    if (e0Var.f413028b == mv.h0.f413043f) {
                        return;
                    }
                    if (((nv.v1) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1261x7643c6b5.ServiceC12852xd025bba9.f174260i).f421936f) {
                        serviceC12852xd025bba9.b(str);
                        return;
                    }
                    if (e0Var.f413032f.length() == 0) {
                        serviceC12852xd025bba9.b(str + ' ' + e0Var.f413031e + '%');
                        return;
                    }
                    serviceC12852xd025bba9.b(str + ' ' + e0Var.f413031e + "%, " + e0Var.f413032f);
                    return;
                }
            }
        }
        serviceC12852xd025bba9.b("");
    }
}
