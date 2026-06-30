package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes10.dex */
public final class t2 implements c01.p8 {
    @Override // c01.p8
    public void a(java.lang.String str, java.lang.String str2, int i17) {
    }

    @Override // c01.p8
    public void b(java.lang.String str, int i17, c01.o8 o8Var) {
        if (str != null) {
            i(str, o8Var);
        }
    }

    @Override // c01.p8
    public void d() {
    }

    @Override // c01.p8
    public void e(java.lang.String str) {
    }

    @Override // c01.p8
    public void f(java.lang.String str) {
    }

    @Override // c01.p8
    public void g(java.lang.String str, java.lang.String str2, int i17, c01.o8 o8Var) {
        if (str != null) {
            i(str, o8Var);
        }
    }

    @Override // c01.p8
    public void h(java.lang.String str, int i17, java.lang.String str2) {
    }

    public final void i(java.lang.String str, c01.o8 o8Var) {
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = str;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(str)) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            h0Var.f391656d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a.h(str);
            str2 = str;
        } else {
            str2 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GetContactInterceptor", "[getContact] sessionId=" + str2 + " talker=" + ((java.lang.String) h0Var.f391656d));
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3((java.lang.String) h0Var.f391656d)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Ri((java.lang.String) h0Var.f391656d, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.o2(str, h0Var, o8Var));
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.U3((java.lang.String) h0Var.f391656d)) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).cj((java.lang.String) h0Var.f391656d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a.c(str, 3), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.q2(str, h0Var, o8Var));
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.T3((java.lang.String) h0Var.f391656d)) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a.c(str, 2);
            zy2.e6 e6Var = (zy2.e6) i95.n0.c(zy2.e6.class);
            java.lang.String str3 = (java.lang.String) h0Var.f391656d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s2 s2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s2(str, h0Var, o8Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1 s1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) e6Var;
            s1Var.getClass();
            if (str3 == null || str3.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ContactService", "username is null.");
                s2Var.a(new ya2.b2());
                return;
            }
            if (c17.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ContactService", "sessionId is null.");
                s2Var.a(new ya2.b2());
                return;
            }
            ya2.b2 y07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ma0) ((jz5.n) s1Var.f207731f).mo141623x754a37bb()).y0(str3);
            if (y07 != null) {
                if (!(y07.w0().length() == 0) && !com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1.pj(s1Var, y07, false, 0L, 6, null)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContactService", "[getFinderMsgAliasContact] local completed! result=" + y07.D0() + '=' + y07.w0());
                    s2Var.a(y07);
                    return;
                }
            }
            if (!s1Var.qj(y07) || com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1.pj(s1Var, y07, false, 0L, 6, null)) {
                s1Var.Zi().e(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.j1(s2Var));
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getFinderMsgAliasContact] isContactRetryLimited contact=");
            sb6.append(y07 != null ? y07.D0() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ContactService", sb6.toString());
            if (y07 == null) {
                y07 = new ya2.b2(str3);
            }
            s2Var.a(y07);
        }
    }
}
