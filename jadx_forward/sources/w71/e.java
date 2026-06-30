package w71;

/* loaded from: classes11.dex */
public abstract class e {
    public static final void a(java.lang.String username, boolean z17, byte[] tingItemData, long j17, java.lang.String extraInfo, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItemData, "tingItemData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraInfo, "extraInfo");
        try {
            bw5.lp0 mo11468x92b714fd = new bw5.lp0().mo11468x92b714fd(tingItemData);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
            int i17 = rk4.j5.g(mo11468x92b714fd) ? 14 : 15;
            zy2.e6 e6Var = (zy2.e6) i95.n0.c(zy2.e6.class);
            int i18 = z17 ? 2 : 1;
            java.lang.Long l17 = 0L;
            int i19 = (int) j17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1 s1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) e6Var;
            s1Var.getClass();
            s1Var.Di(username, i18, l17.longValue(), false, i19, i17, i19, extraInfo);
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterTingInteractPlugin", "doFollowFinder exp=" + e17);
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
        }
    }

    public static final void b(java.lang.String username, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        bw5.w wVar = new bw5.w();
        wVar.f116075d = username;
        boolean[] zArr = wVar.f116077f;
        zArr[1] = true;
        boolean z17 = false;
        if (n17 != null && n17.r2()) {
            z17 = true;
        }
        wVar.f116076e = z17;
        zArr[2] = true;
        if (lVar != null) {
            lVar.mo146xb9724478(wVar);
        }
    }

    public static final void c(java.lang.String username, yz5.l lVar) {
        com.p314xaae8f345.mm.p943x351df9c2.s0 Ni;
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.String str = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(username)) {
            if (lVar != null) {
                lVar.mo146xb9724478(null);
                return;
            }
            return;
        }
        bw5.y0 y0Var = new bw5.y0();
        y0Var.f116827d = username;
        boolean[] zArr = y0Var.f116831h;
        zArr[1] = true;
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        y0Var.f116828e = c01.a2.e(username);
        zArr[2] = true;
        if (((kv.a0) i95.n0.c(kv.a0.class)) != null && (Ni = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni()) != null && (n07 = Ni.n0(username)) != null) {
            str = n07.d();
        }
        y0Var.f116829f = str;
        zArr[3] = true;
        if (lVar != null) {
            lVar.mo146xb9724478(y0Var);
        }
    }

    public static final void d(java.lang.String[] hashUsernames, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashUsernames, "hashUsernames");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : hashUsernames) {
            n73.e eVar = (n73.e) i95.n0.c(n73.e.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 wi6 = eVar != null ? ((m73.q) eVar).wi(str, 2) : null;
            if (wi6 != null) {
                bw5.y0 y0Var = new bw5.y0();
                y0Var.f116827d = wi6.d1();
                boolean[] zArr = y0Var.f116831h;
                zArr[1] = true;
                y0Var.f116828e = wi6.P0();
                zArr[2] = true;
                y0Var.f116830g = str;
                zArr[4] = true;
                arrayList.add(y0Var);
            }
        }
        if (lVar != null) {
            lVar.mo146xb9724478(arrayList.toArray(new bw5.y0[0]));
        }
    }

    public static final void e(java.lang.String username, yz5.l lVar) {
        java.lang.String str;
        java.lang.String m76175x6d346f39;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa Rj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Rj(username);
        bw5.d0 d0Var = new bw5.d0();
        d0Var.f107795d = username;
        boolean[] zArr = d0Var.f107799h;
        zArr[1] = true;
        boolean z17 = false;
        if (Rj != null) {
            int m76170x756826b3 = Rj.m76170x756826b3();
            l75.e0 e0Var = ya2.b2.O2;
            if (m76170x756826b3 == ya2.b2.Q2) {
                z17 = true;
            }
        }
        d0Var.f107798g = z17;
        zArr[4] = true;
        java.lang.String str2 = "";
        if (Rj == null || (str = Rj.m76184x8010e5e4()) == null) {
            str = "";
        }
        d0Var.f107796e = str;
        zArr[2] = true;
        if (Rj != null && (m76175x6d346f39 = Rj.m76175x6d346f39()) != null) {
            str2 = m76175x6d346f39;
        }
        d0Var.f107797f = str2;
        zArr[3] = true;
        if (lVar != null) {
            lVar.mo146xb9724478(d0Var);
        }
    }

    public static final void f(yz5.l lVar) {
        bw5.s0 s0Var = new bw5.s0();
        boolean[] zArr = s0Var.f114275h;
        java.lang.Object l17 = gm0.j1.u().c().l(67591, null);
        java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "lbs location is null, no cached data!");
        } else {
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                java.lang.Integer valueOf = java.lang.Integer.valueOf(((java.lang.String[]) r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]))[0]);
                float intValue = java.lang.Integer.valueOf(r4[2]).intValue() / 1000000.0f;
                s0Var.f114271d = intValue;
                zArr[1] = true;
                s0Var.f114272e = java.lang.Integer.valueOf(r4[3]).intValue() / 1000000.0f;
                zArr[2] = true;
                s0Var.f114273f = valueOf.intValue();
                zArr[3] = true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterTingInteractPlugin", "getCurrentGPSData parse value error.", e17);
            }
        }
        if (lVar != null) {
            lVar.mo146xb9724478(s0Var);
        }
    }
}
