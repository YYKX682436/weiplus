package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class oj implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pj f281180b;

    public oj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pj pjVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f281180b = pjVar;
        this.f281179a = f9Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pj pjVar = this.f281180b;
        boolean z17 = false;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
            if (fVar2 == null) {
                pjVar.f280113d.b();
                return null;
            }
            r45.vx vxVar = (r45.vx) fVar2;
            if (vxVar.f470163d != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemittanceRevokeComponent", "show alert dialog: %s", vxVar.f470164e);
                android.app.Activity g17 = pjVar.f280113d.g();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                aVar.f293262s = ((r45.vx) fVar.f152151d).f470164e;
                aVar.f293265v = of5.b.a(g17).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj);
                r45.v56 v56Var = ((r45.vx) fVar.f152151d).f470166g;
                if (v56Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v56Var.f469453d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.vx) fVar.f152151d).f470166g.f469454e)) {
                    r45.v56 v56Var2 = ((r45.vx) fVar.f152151d).f470166g;
                    aVar.f293265v = v56Var2.f469454e;
                    aVar.f293266w = v56Var2.f469453d;
                    aVar.E = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.nj(this, fVar);
                    aVar.Z = true;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(g17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                j0Var.e(aVar);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
                if (d0Var != null) {
                    d0Var.a(j0Var.f293370r);
                }
                j0Var.show();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceRevokeComponent", "revoke_ticket: %s", vxVar.f470165f);
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.vx) fVar.f152151d).f470165f);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f281179a;
                if (K0) {
                    pjVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceRevokeComponent", "do revoke local remittance msg");
                    f9Var.j1(0);
                    f9Var.m124850x7650bebc(268445456);
                    f9Var.d1(pjVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5s));
                    f9Var.x3(pjVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5s));
                    f9Var.y3();
                    tg3.p1.f500739a.d(f9Var);
                    ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5946x34ca3d16 c5946x34ca3d16 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5946x34ca3d16();
                    long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
                    am.ds dsVar = c5946x34ca3d16.f136247g;
                    dsVar.f88029a = m124847x74d37ac6;
                    dsVar.f88031c = f9Var.Q0();
                    c5946x34ca3d16.e();
                    ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Zi(f9Var.Q0(), f9Var.m124847x74d37ac6(), f9Var.I0());
                    java.lang.Object l17 = c01.d9.b().p().l(290818, 0);
                    c01.d9.b().p().w(290818, java.lang.Integer.valueOf((l17 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(l17.toString(), 0) : 0) + 1));
                    if (f9Var.k2()) {
                        v90.v vVar = (v90.v) i95.n0.c(v90.v.class);
                        ot0.u.a(f9Var);
                        ((u90.a) vVar).getClass();
                        com.p314xaae8f345.mm.p959x883644fd.e.f153038a.getClass();
                    } else {
                        ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
                        com.p314xaae8f345.mm.p959x883644fd.e.f153038a.getClass();
                    }
                } else {
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ck) ((sb5.s1) pjVar.f280113d.f542241c.a(sb5.s1.class))).m0(f9Var, ((r45.vx) fVar.f152151d).f470165f, false, false);
                    z17 = true;
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemittanceRevokeComponent", "net error, do skip");
        }
        if (z17) {
            return null;
        }
        pjVar.f280113d.b();
        return null;
    }
}
