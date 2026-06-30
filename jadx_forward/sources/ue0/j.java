package ue0;

/* loaded from: classes.dex */
public class j implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.teenagermodeagreenauthorization.guardianusername");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.teenagermodeagreenauthorization.wardusername");
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.teenagermodeagreenauthorization.businesskey");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.teenagermodeagreenauthorization.businesstype"), 0);
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(".sysmsg.teenagermodeagreenauthorization.agreenauthorizationtime"), c01.id.e());
        long V2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(".sysmsg.teenagermodeagreenauthorization.requestauthorizationmsgid"), 0L);
        uh4.g0 g0Var = new uh4.g0();
        g0Var.f77355xb4c6a6ba = str4;
        g0Var.f77356xe412923f = P;
        g0Var.f77357x8d828e4c = str2;
        g0Var.f77360xb1cc66b7 = str3;
        g0Var.f77359x2261f6f2 = V * 1000;
        g0Var.f77358xd09be28e = V2;
        wh4.j.f527545a.a().mo11260x413cb2b4(g0Var);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5157x6316f13d c5157x6316f13d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5157x6316f13d();
        c5157x6316f13d.f135506g.getClass();
        c5157x6316f13d.f135506g.f88818a = P;
        c5157x6316f13d.e();
        ((ku5.t0) ku5.t0.f394148d).g(new ue0.i(this, str3, str2, P, V2));
    }
}
