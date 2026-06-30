package l41;

/* loaded from: classes11.dex */
public abstract class j0 {
    public static com.p314xaae8f345.mm.p2621x8fb0427b.z3 a(r45.a05 a05Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(a05Var.f451114d, true);
        if (n17 == null) {
            n17 = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        }
        n17.X1(a05Var.f451114d);
        n17.M1(a05Var.f451115e);
        n17.mo43621x7650bebc(a05Var.f451116f);
        n17.W1(a05Var.f451132y);
        n17.n1(a05Var.f451117g);
        n17.j3(a05Var.f451120m);
        n17.R1(a05Var.f451121n);
        n17.S1(a05Var.f451122o);
        n17.p1(a05Var.f451123p);
        n17.o1(a05Var.f451124q);
        r45.b05 b05Var = a05Var.f451125r;
        n17.J1 = b05Var == null ? "" : b05Var.f451929e;
        n17.f318114u = true;
        n17.I1 = b05Var == null ? 0 : b05Var.f451928d;
        n17.f318114u = true;
        n17.C2(a05Var.f451126s);
        n17.P1(a05Var.f451127t);
        n17.g3(a05Var.f451128u);
        n17.C1(a05Var.f451129v);
        n17.K2((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        if (n17.A0() == null) {
            n17.q1(new r45.o80());
        }
        n17.A0().f463552e = a05Var.f451133z;
        return n17;
    }

    public static int b(r45.ck3 ck3Var) {
        int i17 = ck3Var.f453151d;
        r45.a05 a05Var = ck3Var.f453152e;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 a17 = a(a05Var);
        java.lang.Object[] objArr = new java.lang.Object[11];
        objArr[0] = a17.d1();
        objArr[1] = a17.P0();
        objArr[2] = a17.w0();
        objArr[3] = java.lang.Integer.valueOf(a17.m43619x2fa78b11());
        objArr[4] = java.lang.Integer.valueOf(a17.I);
        objArr[5] = a17.Q0();
        objArr[6] = a17.J1;
        objArr[7] = java.lang.Integer.valueOf(a17.I1);
        objArr[8] = java.lang.Integer.valueOf(a17.m124896xfb85f7b0());
        objArr[9] = a17.G0();
        objArr[10] = a17.A0() != null ? java.lang.Integer.valueOf(a17.A0().f463552e) : r45.f05.OPENIM_ENTERPRISE_AUTHORIZATION_STATUS_UNKNOWN;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMContactLogic", "onGYNetEnd openim_processModContact user:%s nick:%s remark:%s, source:%d, sex%d, appId:%s, customDetail:%s, customDetailVisible:%d， type:%d, wordingId:%s, enterprise_auth_status:%d", objArr);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(a17);
        ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Bi(a05Var.f451127t, a05Var.f451129v, 0);
        c(a05Var);
        e(a05Var);
        d(a05Var);
        return i17;
    }

    public static void c(r45.a05 a05Var) {
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(a05Var.f451114d);
        if (n07 != null) {
            str = n07.c();
            str2 = n07.d();
        } else {
            str = "";
            str2 = "";
        }
        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
        r0Var.f152070i = -1;
        r0Var.f152062a = a05Var.f451114d;
        r0Var.f152065d = a05Var.f451119i;
        r0Var.f152066e = a05Var.f451118h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMContactLogic", "dealwithAvatarFromModContact contact %s b[%s] s[%s]", r0Var.e(), r0Var.c(), r0Var.d());
        boolean z18 = true;
        if (r0Var.c().equals(str)) {
            z17 = false;
        } else {
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().p(a05Var.f451114d, true);
            z17 = true;
        }
        if (r0Var.d().equals(str2)) {
            z18 = z17;
        } else {
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().p(a05Var.f451114d, false);
        }
        if (z18) {
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
            com.p314xaae8f345.mm.p943x351df9c2.d1.wi().i(a05Var.f451114d);
        }
    }

    public static void d(r45.a05 a05Var) {
        if (a05Var.f451114d != null) {
            u41.g gVar = new u41.g();
            gVar.f68493x315f5dc9 = a05Var.f451114d;
            java.lang.String str = a05Var.f451130w;
            if (str == null) {
                str = "";
            }
            gVar.f68492xbb25cf8a = str;
            ((i41.l) i95.n0.c(i41.l.class)).Ni().mo11260x413cb2b4(gVar);
        }
    }

    public static void e(r45.a05 a05Var) {
        if (a05Var.f451114d != null) {
            u41.i iVar = new u41.i();
            iVar.f68766x315f5dc9 = a05Var.f451114d;
            iVar.f68765x66a9f5b1 = a05Var.f451131x;
            ((i41.l) i95.n0.c(i41.l.class)).Ri().mo11260x413cb2b4(iVar);
        }
    }
}
