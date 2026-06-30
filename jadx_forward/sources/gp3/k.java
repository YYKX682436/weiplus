package gp3;

/* loaded from: classes9.dex */
public class k implements dp3.f {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.w f355913a;

    public static void b(gp3.k kVar, android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 c16774xbacd37e9) {
        java.lang.String str2;
        kVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String str3 = c16774xbacd37e9.f234334x;
        java.lang.String k17 = wo.w0.k();
        int i17 = o45.wf.f424556a;
        java.lang.String str4 = wo.q.f529313a;
        java.lang.String m17 = wo.w0.m();
        java.lang.String l17 = wo.w0.l();
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.f(false);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52907xc5e80d49;
        }
        java.lang.String uri = parse.buildUpon().appendQueryParameter("trans_id", str3).appendQueryParameter("deviceid", k17).appendQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52907xc5e80d49, str2).appendQueryParameter("deviceType", str4).appendQueryParameter("deviceName", m17).appendQueryParameter("ostype", l17).build().toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DefaultOrderPrefFactory", "new url %s", uri);
        intent.putExtra("rawUrl", uri);
        intent.putExtra("geta8key_username", c01.z1.r());
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(context, intent);
    }

    @Override // dp3.f
    public java.util.List a(android.content.Context context, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 c16774xbacd37e9) {
        boolean z17;
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z18 = c16774xbacd37e9.f234316f == 2;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.E) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.F)) {
            gp3.p pVar = new gp3.p(context);
            pVar.P = c16774xbacd37e9.F;
            pVar.N = c16774xbacd37e9.E;
            pVar.M = new gp3.a(this, c16774xbacd37e9, context);
            arrayList.add(pVar);
            arrayList.add(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea(context, null));
        }
        gp3.w wVar = new gp3.w(context);
        wVar.N = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(c16774xbacd37e9.f234327q, c16774xbacd37e9.B);
        wVar.L(z18 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.krx) : c16774xbacd37e9.f234315e == 11 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ksw) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.krw));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234328r)) {
            try {
                wVar.M = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(c16774xbacd37e9.f234328r, true);
            } catch (java.lang.Exception unused) {
                wVar.M = -1;
            }
        }
        arrayList.add(wVar);
        if (c16774xbacd37e9.f234327q != c16774xbacd37e9.f234313J) {
            gp3.v vVar = new gp3.v(context);
            vVar.M = false;
            vVar.N = true;
            arrayList.add(vVar);
            gp3.s sVar = new gp3.s(context);
            sVar.M(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(c16774xbacd37e9.f234313J, c16774xbacd37e9.B));
            sVar.J(com.p314xaae8f345.mm.R.C30867xcad56011.ksl);
            arrayList.add(sVar);
            z17 = true;
        } else {
            z17 = false;
        }
        if (c16774xbacd37e9.f234327q != c16774xbacd37e9.f234313J && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.I)) {
            gp3.u uVar = new gp3.u(context);
            uVar.J(com.p314xaae8f345.mm.R.C30867xcad56011.ks7);
            uVar.M = rVar;
            java.lang.String[] split = c16774xbacd37e9.I.split("\n");
            if (split.length == 1) {
                uVar.N = split[0];
            } else {
                uVar.N = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ks9, java.lang.Integer.valueOf(split.length), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(c16774xbacd37e9.f234313J - c16774xbacd37e9.f234327q, c16774xbacd37e9.B));
                android.text.TextUtils.TruncateAt truncateAt = android.text.TextUtils.TruncateAt.MIDDLE;
                uVar.P = split;
                uVar.Q = truncateAt;
                uVar.R = true;
            }
            arrayList.add(uVar);
        }
        gp3.v vVar2 = new gp3.v(context);
        vVar2.M = z17;
        vVar2.N = true;
        arrayList.add(vVar2);
        if (!z18 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.T)) {
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(c16774xbacd37e9.T, true);
            if (n17 != null && ((int) n17.E2) > 0) {
                java.lang.String g27 = n17.g2();
                gp3.s sVar2 = new gp3.s(context);
                sVar2.J(com.p314xaae8f345.mm.R.C30867xcad56011.ksz);
                sVar2.M(g27);
                arrayList.add(sVar2);
            }
        }
        if (c16774xbacd37e9.f234315e == 31 && z18 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234325p0)) {
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(c16774xbacd37e9.f234325p0, true);
            if (n18 != null && ((int) n18.E2) > 0) {
                java.lang.String g28 = n18.g2();
                gp3.s sVar3 = new gp3.s(context);
                sVar3.J(com.p314xaae8f345.mm.R.C30867xcad56011.ksh);
                sVar3.M(g28);
                arrayList.add(sVar3);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234322n)) {
            if (z18) {
                gp3.s sVar4 = new gp3.s(context);
                int i18 = c16774xbacd37e9.f234315e;
                if (i18 == 32 || i18 == 33 || i18 == 31) {
                    sVar4.J(com.p314xaae8f345.mm.R.C30867xcad56011.f575104ks1);
                } else {
                    sVar4.J(com.p314xaae8f345.mm.R.C30867xcad56011.ksh);
                }
                sVar4.M(c16774xbacd37e9.f234322n);
                arrayList.add(sVar4);
            } else {
                gp3.s sVar5 = new gp3.s(context);
                if (c16774xbacd37e9.f234315e == 31) {
                    sVar5.J(com.p314xaae8f345.mm.R.C30867xcad56011.kss);
                } else {
                    sVar5.J(com.p314xaae8f345.mm.R.C30867xcad56011.f575108ks5);
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234323o)) {
                    sVar5.M(c16774xbacd37e9.f234322n);
                } else {
                    java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575103ks0);
                    java.lang.String str = c16774xbacd37e9.f234322n + " " + string;
                    int length = c16774xbacd37e9.f234322n.length() + 1;
                    int length2 = c16774xbacd37e9.f234322n.length() + 1 + string.length();
                    gp3.b bVar = new gp3.b(this, c16774xbacd37e9, sVar5, rVar);
                    sVar5.M = str;
                    sVar5.P = true;
                    sVar5.Q = length;
                    sVar5.R = length2;
                    sVar5.S = bVar;
                }
                arrayList.add(sVar5);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234326p1)) {
            gp3.s sVar6 = new gp3.s(context);
            sVar6.J(com.p314xaae8f345.mm.R.C30867xcad56011.kta);
            sVar6.M(c16774xbacd37e9.f234326p1);
            arrayList.add(sVar6);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234320l1)) {
            gp3.s sVar7 = new gp3.s(context);
            sVar7.J(com.p314xaae8f345.mm.R.C30867xcad56011.ktb);
            sVar7.M(c16774xbacd37e9.f234320l1);
            arrayList.add(sVar7);
        }
        if (!android.text.TextUtils.isEmpty(c16774xbacd37e9.V)) {
            gp3.s sVar8 = new gp3.s(context);
            sVar8.J(com.p314xaae8f345.mm.R.C30867xcad56011.krz);
            sVar8.M(c16774xbacd37e9.V);
            arrayList.add(sVar8);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234321m)) {
            gp3.s sVar9 = new gp3.s(context);
            sVar9.J(com.p314xaae8f345.mm.R.C30867xcad56011.ksk);
            sVar9.M(c16774xbacd37e9.f234321m);
            arrayList.add(sVar9);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234330t)) {
            gp3.s sVar10 = new gp3.s(context);
            sVar10.J(com.p314xaae8f345.mm.R.C30867xcad56011.f575109kt0);
            if (c16774xbacd37e9.f234315e != 31 || c01.z1.r().equals(c16774xbacd37e9.T) || c16774xbacd37e9.U <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.T) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234334x)) {
                sVar10.M(c16774xbacd37e9.f234330t);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234331u)) {
                    try {
                        sVar10.N = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(c16774xbacd37e9.f234331u, true);
                    } catch (java.lang.Exception unused2) {
                        sVar10.N = Integer.MAX_VALUE;
                    }
                }
            } else {
                java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574361i12);
                java.lang.String str2 = c16774xbacd37e9.f234330t + " " + string2;
                int length3 = c16774xbacd37e9.f234330t.length() + 1;
                int length4 = c16774xbacd37e9.f234330t.length() + string2.length() + 1;
                gp3.e eVar = new gp3.e(this, context, c16774xbacd37e9);
                sVar10.M = str2;
                sVar10.P = true;
                sVar10.Q = length3;
                sVar10.R = length4;
                sVar10.S = eVar;
            }
            arrayList.add(sVar10);
        }
        gp3.s sVar11 = new gp3.s(context);
        sVar11.J(com.p314xaae8f345.mm.R.C30867xcad56011.f575107ks4);
        sVar11.M(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.p(c16774xbacd37e9.f234332v));
        arrayList.add(sVar11);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234340z)) {
            gp3.s sVar12 = new gp3.s(context);
            sVar12.J(com.p314xaae8f345.mm.R.C30867xcad56011.ksn);
            java.lang.String str3 = c16774xbacd37e9.f234340z;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.A)) {
                str3 = str3 + "(" + c16774xbacd37e9.A + ")";
            }
            sVar12.M(str3);
            arrayList.add(sVar12);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234334x)) {
            gp3.s sVar13 = new gp3.s(context);
            sVar13.J(com.p314xaae8f345.mm.R.C30867xcad56011.kt7);
            sVar13.M(c16774xbacd37e9.f234334x);
            arrayList.add(sVar13);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234337y)) {
            gp3.s sVar14 = new gp3.s(context);
            sVar14.J(com.p314xaae8f345.mm.R.C30867xcad56011.ksx);
            if (c16774xbacd37e9.f234315e == 8) {
                sVar14.M(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ksy));
                gp3.o oVar = new gp3.o(context);
                android.graphics.Bitmap Bi = ((jd0.w1) ((kd0.k2) i95.n0.c(kd0.k2.class))).Bi(context, c16774xbacd37e9.f234337y, 5, 0);
                java.lang.String str4 = c16774xbacd37e9.f234337y;
                java.lang.String str5 = "";
                if (!android.text.TextUtils.isEmpty(str4)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    int length5 = str4.length() / 4;
                    int i19 = 0;
                    while (i19 < length5 + 1) {
                        int i27 = i19 + 1;
                        int min = java.lang.Math.min(i27 * 4, str4.length());
                        int i28 = i19 * 4;
                        sb6.append(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.a(str4.substring(i28, min), ""));
                        if (min - i28 == 4) {
                            for (int i29 = 0; i29 < 4; i29++) {
                                sb6.append(" ");
                            }
                        }
                        i19 = i27;
                    }
                    str5 = sb6.toString();
                }
                oVar.Q = str5;
                oVar.R = Bi;
                oVar.P = new gp3.f(this, Bi, c16774xbacd37e9);
                arrayList.add(sVar14);
                arrayList.add(oVar);
            } else {
                sVar14.M(c16774xbacd37e9.f234337y);
                arrayList.add(sVar14);
            }
        }
        boolean z19 = ((java.util.LinkedList) c16774xbacd37e9.f234341z1).size() != 0;
        if (z19 || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.N) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.C) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.D))) {
            i17 = 1;
            gp3.v vVar3 = new gp3.v(context);
            vVar3.M = true;
            vVar3.P = false;
            arrayList.add(vVar3);
        } else {
            gp3.v vVar4 = new gp3.v(context);
            i17 = 1;
            vVar4.M = true;
            arrayList.add(vVar4);
            arrayList.add(dp3.g.a(context, c16774xbacd37e9));
        }
        if (z19) {
            gp3.x xVar = new gp3.x(context);
            if (c16774xbacd37e9.A1 == i17) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.N) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.C) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.D)) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.P)) {
                        xVar.N = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575114kt5);
                    } else {
                        xVar.N = c16774xbacd37e9.P;
                    }
                    xVar.P = new gp3.h(this, c16774xbacd37e9, context);
                }
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.P)) {
                xVar.N = c16774xbacd37e9.P;
                xVar.P = new gp3.i(this, context, c16774xbacd37e9);
            }
            xVar.Q = c16774xbacd37e9.f234341z1;
            xVar.M = new gp3.j(this, context, c16774xbacd37e9);
            gp3.v vVar5 = new gp3.v(context);
            vVar5.M = true;
            arrayList.add(vVar5);
            arrayList.add(xVar);
        }
        return arrayList;
    }
}
