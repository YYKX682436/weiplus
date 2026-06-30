package ue0;

/* loaded from: classes4.dex */
public class n implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StaticTeenagerModeBecomeGuardianNewXmlReceived", "onNewXmlReceived");
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.teenagermodebecomeguardian.guardianusername");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.teenagermodebecomeguardian.wardusername");
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.teenagermodebecomeguardian.ticket");
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(".sysmsg.teenagermodebecomeguardian.becomeguardiantime"), c01.id.e());
        uh4.h0 h0Var = new uh4.h0();
        h0Var.f77361x8d828e4c = str2;
        h0Var.f77364xb1cc66b7 = str3;
        h0Var.f77362x11bb99f1 = str4;
        h0Var.f77363x2261f6f2 = V * 1000;
        wh4.j jVar = wh4.j.f527545a;
        ((wh4.d) ((jz5.n) wh4.j.f527548d).mo141623x754a37bb()).mo11260x413cb2b4(h0Var);
        if (c01.z1.r().equalsIgnoreCase(str3)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 l17 = c01.e2.l(str2);
            int m124896xfb85f7b0 = l17.m124896xfb85f7b0();
            l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            l17.mo43621x7650bebc(m124896xfb85f7b0 | 1073741824);
            c01.e2.h0(l17);
            if (c01.e2.a0()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var.j1(0);
                f9Var.r1(3);
                f9Var.u1(str2);
                f9Var.e1(c01.w9.m(str2, c01.id.a() / 1000));
                f9Var.d1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jr9, l17.g2()));
                f9Var.m124850x7650bebc(10000);
                f9Var.f1(f9Var.w0() | 8);
                c01.w9.x(f9Var);
                ((uh4.c0) i95.n0.c(uh4.c0.class)).K4();
            }
        } else if (c01.z1.r().equalsIgnoreCase(str2)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 l18 = c01.e2.l(str3);
            int m124896xfb85f7b02 = l18.m124896xfb85f7b0();
            l75.e0 e0Var2 = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            l18.mo43621x7650bebc(m124896xfb85f7b02 | com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
            c01.e2.h0(l18);
        }
        ((ku5.t0) ku5.t0.f394148d).g(new ue0.m(this));
    }
}
