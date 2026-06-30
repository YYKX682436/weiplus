package w11;

/* loaded from: classes11.dex */
public class c implements vg3.w4 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg3.w4
    public void a(java.lang.Object obj, r45.b50 b50Var, int i17, byte[] bArr, boolean z17, r45.cx4 cx4Var, vg3.z4 z4Var) {
        java.lang.String str;
        java.lang.Object[] objArr;
        int i18 = b50Var.f452063d;
        if (i18 == 13) {
            r45.ho4 ho4Var = (r45.ho4) new r45.ho4().mo11468x92b714fd(bArr);
            if (1 != ho4Var.f457862e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BigBallOfMudSyncExtension", "unknown micro blog type:" + ho4Var.f457862e);
                return;
            }
            xg3.r0 y17 = c01.d9.b().y();
            java.lang.String g17 = x51.j1.g(ho4Var.f457861d);
            boolean z18 = ho4Var.f457864g == 1 ? 1 : 0;
            java.lang.Object[] objArr2 = ho4Var.f457863f == 1;
            com.p314xaae8f345.mm.p2621x8fb0427b.ka kaVar = (com.p314xaae8f345.mm.p2621x8fb0427b.ka) y17;
            kaVar.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoleStorage", "insert role info failed: empty user");
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.ja n07 = kaVar.n0(g17);
            if (n07 == null) {
                kaVar.u0(new com.p314xaae8f345.mm.p2621x8fb0427b.ja(g17, z18, true, 2));
                return;
            }
            if (z18 != 0) {
                n07.f276593d |= z18;
            } else {
                n07.f276593d &= -2;
            }
            if (objArr2 == true) {
                n07.f276593d |= objArr2 == true ? 2 : 0;
            } else {
                n07.f276593d &= -3;
            }
            n07.f276590a = 4;
            kaVar.z0(n07);
            return;
        }
        if (i18 == 15) {
            r45.nn4 nn4Var = (r45.nn4) new r45.nn4().mo11468x92b714fd(bArr);
            if (nn4Var == null) {
                return;
            }
            java.lang.String g18 = x51.j1.g(nn4Var.f463064d);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(g18, true);
            n17.X1(g18);
            n17.M1(x51.j1.g(nn4Var.f463065e));
            n17.R1(x51.j1.g(nn4Var.f463066f));
            n17.S1(x51.j1.g(nn4Var.f463067g));
            n17.g3(nn4Var.f463068h);
            n17.n1(x51.j1.g(nn4Var.f463071n));
            n17.o1(x51.j1.g(nn4Var.f463073p));
            n17.p1(x51.j1.g(nn4Var.f463072o));
            n17.M2(nn4Var.f463074q);
            com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
            r0Var.f152070i = -1;
            r0Var.f152062a = n17.d1();
            r0Var.f152065d = nn4Var.I;
            r0Var.f152066e = nn4Var.H;
            r0Var.f152067f = 1;
            int i19 = nn4Var.f463070m;
            if (i19 == 3 || i19 == 4) {
                n17.V2(i19);
                r0Var.f152063b = nn4Var.f463070m;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
            } else if (i19 == 2) {
                n17.V2(3);
                r0Var.f152063b = 3;
                n17.V2(3);
                if (c01.z1.r().equals(n17.d1())) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
                } else {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    com.p314xaae8f345.mm.p943x351df9c2.d1.wi().j(n17.d1(), r0Var);
                }
            }
            ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).l0(n17);
            qk.o b17 = r01.q3.cj().b1(n17.d1());
            b17.f66748xdec927b = n17.d1();
            b17.f66736x6bad7fc0 = nn4Var.f463063J;
            r45.va0 va0Var = nn4Var.K;
            if (va0Var != null) {
                b17.f66733x6baace8e = va0Var.f469554d;
                b17.f66735x6bac33d0 = va0Var.f469556f;
                b17.f66734xea1bd3d4 = va0Var.f469557g;
                java.lang.String str2 = va0Var.f469555e;
                b17.f66740x26b3182a = str2;
                b17.f66731x4b3625c7 = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "update extInfo=%s", str2);
            }
            if (r01.q3.cj().mo11260x413cb2b4(b17)) {
                return;
            }
            r01.q3.cj().mo880xb970c2b9(b17);
            return;
        }
        if (i18 == 33) {
            r45.kn4 kn4Var = (r45.kn4) new r45.kn4().mo11468x92b714fd(bArr);
            iz5.a.g(null, kn4Var != null);
            java.lang.String str3 = kn4Var.f460378d;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            iz5.a.g(null, (str3 != null ? str3 : "").length() > 0);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            z3Var.X1(kn4Var.f460378d);
            z3Var.mo43621x7650bebc(kn4Var.f460379e);
            z3Var.g3(kn4Var.f460380f);
            z3Var.c3(com.p314xaae8f345.mm.p2621x8fb0427b.ha.q(kn4Var.f460386o, kn4Var.f460382h, kn4Var.f460381g));
            z3Var.h3(kn4Var.f460383i);
            com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var2 = new com.p314xaae8f345.mm.p943x351df9c2.r0();
            r0Var2.f152070i = -1;
            r0Var2.f152062a = kn4Var.f460378d;
            r0Var2.f152065d = kn4Var.f460388q;
            r0Var2.f152066e = kn4Var.f460387p;
            int i27 = kn4Var.f460384m;
            r0Var2.f152067f = kn4Var.f460385n != 0 ? 1 : 0;
            if (i27 == 3 || i27 == 4) {
                z3Var.V2(i27);
                r0Var2.f152063b = kn4Var.f460384m;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var2);
            } else if (i27 == 2) {
                z3Var.V2(3);
                r0Var2.f152063b = 3;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.d1.wi().j(kn4Var.f460378d, r0Var2);
            } else {
                z3Var.V2(3);
                r0Var2.f152063b = 3;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var2);
            }
            ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).m0(z3Var);
            return;
        }
        if (i18 == 35) {
            r45.ep4 ep4Var = (r45.ep4) new r45.ep4().mo11468x92b714fd(bArr);
            iz5.a.g(null, ep4Var != null);
            java.lang.String r17 = c01.z1.r();
            int i28 = ep4Var.f455187d;
            if (i28 == 2) {
                r17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y4(r17);
                str = (java.lang.String) c01.d9.b().p().l(12553, null);
            } else {
                str = (java.lang.String) c01.d9.b().p().l(12297, null);
            }
            if (str == null || !str.equals(ep4Var.f455190g)) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().p(r17, true);
                c01.d9.b().p().w(i28 != 2 ? 12297 : 12553, ep4Var.f455190g);
                objArr = true;
            } else {
                objArr = false;
            }
            java.lang.String str4 = ep4Var.f455191h;
            java.lang.String str5 = ep4Var.f455192i;
            com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var3 = new com.p314xaae8f345.mm.p943x351df9c2.r0();
            r0Var3.f152062a = r17;
            r0Var3.f152066e = str4;
            r0Var3.f152065d = str5;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0Var3.d())) {
                if (i28 == 1) {
                    c01.d9.b().p().w(59, java.lang.Boolean.TRUE);
                } else {
                    c01.d9.b().p().w(60, java.lang.Boolean.TRUE);
                }
            }
            r0Var3.f152067f = 0;
            r0Var3.f152070i = 56;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ep4Var.f455190g)) {
                r0Var3.f152067f = 1;
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var3);
            if (objArr == true) {
                gm0.j1.e().j(new w11.b(this, r17));
                return;
            }
            return;
        }
        if (i18 == 44) {
            b((r45.dw6) new r45.dw6().mo11468x92b714fd(bArr));
            return;
        }
        if (i18 == 53) {
            r45.cu4 cu4Var = (r45.cu4) new r45.cu4().mo11468x92b714fd(bArr);
            int i29 = cu4Var.f453370g;
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.w4(cu4Var.f453367d)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5949x47dfece6 c5949x47dfece6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5949x47dfece6();
                c5949x47dfece6.f136248g.f88139a = cu4Var.f453371h;
                c5949x47dfece6.e();
                return;
            }
            return;
        }
        if (i18 == 204) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6029xbb3f0190 c6029xbb3f0190 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6029xbb3f0190();
            c6029xbb3f0190.f136319g.f89671a = bArr;
            c6029xbb3f0190.e();
            return;
        }
        if (i18 == 219) {
            r45.gz5 gz5Var = (r45.gz5) new r45.gz5().mo11468x92b714fd(bArr);
            if (gz5Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().r0(gz5Var.f457205d, gz5Var.f457206e);
                return;
            }
            return;
        }
        if (i18 == 999999) {
            try {
                int a17 = kk.u.a(bArr, 0);
                if (a17 > 0) {
                    java.lang.Thread.sleep(a17);
                    return;
                }
                return;
            } catch (java.lang.InterruptedException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BigBallOfMudSyncExtension", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        switch (i18) {
            case 22:
                r45.o04 o04Var = (r45.o04) new r45.o04().mo11468x92b714fd(bArr);
                r61.v0 v0Var = new r61.v0();
                v0Var.f474501a = o04Var.f463329d;
                v0Var.f474502b = o04Var.f463330e;
                v0Var.f474503c = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                m61.k.Ni().n0(v0Var);
                return;
            case 23:
                r45.p53 p53Var = (r45.p53) new r45.p53().mo11468x92b714fd(bArr);
                int i37 = p53Var.f464294d;
                if (i37 == 1) {
                    c01.d9.b().p().w(17, java.lang.Integer.valueOf(p53Var.f464295e));
                    return;
                } else {
                    if (i37 != 4) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BigBallOfMudSyncExtension", "unknown function switch id:" + p53Var.f464294d);
                        return;
                    }
                    return;
                }
            case 24:
                r45.sf5 sf5Var = (r45.sf5) new r45.sf5().mo11468x92b714fd(bArr);
                iz5.a.g(null, sf5Var != null);
                java.lang.String str6 = sf5Var.f467217d;
                boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str6 == null) {
                    str6 = "";
                }
                iz5.a.g(null, str6.length() > 0);
                if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(sf5Var.f467217d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BigBallOfMudSyncExtension", "processModQContact: qcontact should ends with @t.qq.com");
                    return;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(sf5Var.f467217d, true);
                if (n18 == null || ((int) n18.E2) == 0) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(sf5Var.f467217d);
                    z3Var2.mo43621x7650bebc(z3Var2.m124896xfb85f7b0() | 2);
                    z3Var2.M1(sf5Var.f467218e);
                    z3Var2.n1(sf5Var.f467218e);
                    z3Var2.M2(4);
                    if (((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).i0(z3Var2) == -1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BigBallOfMudSyncExtension", "processModQContact: insert contact failed");
                        return;
                    }
                    kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
                    java.lang.String d17 = z3Var2.d1();
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
                    com.p314xaae8f345.mm.p943x351df9c2.g.g(d17);
                } else {
                    java.lang.String str7 = sf5Var.f467218e;
                    if (str7 == null) {
                        str7 = "";
                    }
                    java.lang.String d18 = n18.d1();
                    if (!str7.equals(d18 != null ? d18 : "")) {
                        n18.M1(sf5Var.f467218e);
                        n18.n1(sf5Var.f467218e);
                        if (((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).p0(n18.d1(), n18) == -1) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BigBallOfMudSyncExtension", "processModQContact: update contact failed");
                        }
                    }
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5860xa14c0589 c5860xa14c0589 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5860xa14c0589();
                c5860xa14c0589.f136166g.getClass();
                c5860xa14c0589.e();
                return;
            case 25:
                r45.nj6 nj6Var = (r45.nj6) new r45.nj6().mo11468x92b714fd(bArr);
                iz5.a.g(null, nj6Var != null);
                java.lang.String str8 = nj6Var.f462985d;
                boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str8 == null) {
                    str8 = "";
                }
                iz5.a.g(null, str8.length() > 0);
                if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(nj6Var.f462985d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BigBallOfMudSyncExtension", "processModTContact: tcontact should ends with @t.qq.com");
                    return;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n19 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(nj6Var.f462985d, true);
                if (n19 == null || ((int) n19.E2) == 0) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3 = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(nj6Var.f462985d);
                    z3Var3.n1(nj6Var.f462986e);
                    z3Var3.M2(1);
                    z3Var3.mo43621x7650bebc(z3Var3.m124896xfb85f7b0() | 2);
                    if (((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).i0(z3Var3) == -1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BigBallOfMudSyncExtension", "processModTContact: insert contact failed");
                        return;
                    }
                    java.lang.String d19 = z3Var3.d1();
                    if (d19 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AvatarLogic", "setMBTAvatarImgFlag failed : invalid username");
                    } else if (d19.endsWith("@t.qq.com")) {
                        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var4 = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                        r0Var4.f152062a = d19;
                        r0Var4.f152063b = 3;
                        r0Var4.f152070i = 3;
                        com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var4);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AvatarLogic", "setMBTAvatarImgFlag failed : invalid username");
                    }
                } else {
                    java.lang.String str9 = nj6Var.f462986e;
                    if (str9 == null) {
                        str9 = "";
                    }
                    java.lang.String d110 = n19.d1();
                    if (!str9.equals(d110 != null ? d110 : "")) {
                        n19.n1(nj6Var.f462986e);
                        if (((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).p0(n19.d1(), n19) == -1) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BigBallOfMudSyncExtension", "processModTContact: update contact failed");
                        }
                    }
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6149x34dd3566 c6149x34dd3566 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6149x34dd3566();
                c6149x34dd3566.f136410g.getClass();
                c6149x34dd3566.e();
                return;
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BigBallOfMudSyncExtension", "doCmd: no processing method, cmd id=" + b50Var.f452063d);
                return;
        }
    }

    public void b(r45.dw6 dw6Var) {
        r45.cu5 cu5Var;
        int i17;
        int i18;
        java.util.LinkedList linkedList;
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "snsExtFlag:%s, snsExtFlagEx:%s, snsPrivacyRecent:%s", java.lang.Integer.valueOf(dw6Var.f454322d.f452961d), java.lang.Integer.valueOf(dw6Var.f454322d.f452964g), java.lang.Integer.valueOf(dw6Var.f454322d.f452965h));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "processModUserInfoExt snsExtFlag:%s, snsExtFlagEx:%s, snsPrivacyRecent:%s", java.lang.Integer.valueOf(dw6Var.f454322d.f452961d), java.lang.Integer.valueOf(dw6Var.f454322d.f452964g), java.lang.Integer.valueOf(dw6Var.f454322d.f452965h));
        java.lang.String str2 = (java.lang.String) c01.d9.b().p().l(2, null);
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "processModUserInfoExt, userName:%s", str2);
        if (p94.w0.c() != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).z1(str2, dw6Var.f454322d);
        }
        if (o25.w1.a() != null) {
            p94.i0 a17 = o25.w1.a();
            r45.cb6 cb6Var = dw6Var.f454322d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a2 a2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a2) a17;
            a2Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateBg", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            if (cb6Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBg", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            } else {
                a2Var.f247457f.P6(cb6Var.f452963f);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBg", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "finderSetting:%s", java.lang.Long.valueOf(dw6Var.f454333p0));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, java.lang.Long.valueOf(dw6Var.f454333p0));
        qk.o b17 = r01.z.b(c01.z1.r());
        if (b17 == null) {
            b17 = new qk.o();
        }
        b17.f66748xdec927b = str2;
        b17.f66736x6bad7fc0 = dw6Var.f454323e;
        if (b17.G0() && b17.D0(false) != null && b17.D0(false).d() != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.y0())) {
            java.lang.String enterpriseFather = b17.y0();
            b17.f66739xdfb76cc2 = enterpriseFather;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterpriseFather, "enterpriseFather");
            bn0.g gVar = bn0.g.f104312a;
            bn0.a f17 = gVar.f(str2);
            gVar.j(str2, new bn0.a(f17 != null ? f17.f104301a : 0, f17 != null ? f17.f104302b : 0, f17 != null ? f17.f104303c : 0, f17 != null ? f17.f104304d : 0, enterpriseFather));
        }
        if (!r01.q3.cj().mo11260x413cb2b4(b17)) {
            r01.q3.cj().mo880xb970c2b9(b17);
        }
        int i19 = dw6Var.f454326h;
        int i27 = dw6Var.f454327i;
        int i28 = dw6Var.f454329m;
        c01.d9.b().p().w(135175, java.lang.Integer.valueOf(i19));
        c01.d9.b().p().w(135176, java.lang.Integer.valueOf(i27));
        c01.d9.b().p().w(135177, java.lang.Integer.valueOf(i28));
        c01.d9.b().p().w(144385, java.lang.Integer.valueOf(dw6Var.f454339u));
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, java.lang.Integer.valueOf(dw6Var.I));
        c01.je.m(dw6Var.I);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SMCRYPTO_FLAG_TYPE_INT_SYNC, java.lang.Integer.valueOf(dw6Var.f454346y0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "sync do cmd smcrypto flag:%d", java.lang.Integer.valueOf(dw6Var.f454346y0));
        xp1.d.f();
        c01.d9.b().p().w(339975, java.lang.Integer.valueOf(dw6Var.G));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "hy: sync do cmd pay wallet type: %d %d", java.lang.Integer.valueOf(dw6Var.G), java.lang.Integer.valueOf(dw6Var.I));
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PROFILE_WEIDIANINFO_STRING;
        java.lang.String str3 = dw6Var.H;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str3 == null) {
            str3 = "";
        }
        p17.x(u3Var, str3);
        c01.d9.b().p().w(147457, java.lang.Long.valueOf(dw6Var.f454321J));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.ExtStatus:%s", java.lang.Long.valueOf(dw6Var.f454321J));
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(dw6Var.f454347y1));
        bn0.g.f104312a.g("USERINFO_EXT_STATUS2_LONG_SYNC", dw6Var.f454347y1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.ExtStatus2:%s", java.lang.Long.valueOf(dw6Var.f454347y1));
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_USER_STATUS_INT_SYNC, java.lang.Integer.valueOf(dw6Var.L));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.UserStatus:%s", java.lang.Integer.valueOf(dw6Var.L));
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_BIND_XMAIL_STRING_SYNC, dw6Var.Q);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.BindXMail:%s", dw6Var.Q);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_PAY_SETTING_LONG_SYNC, java.lang.Long.valueOf(dw6Var.M));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.PaySetting:%s", java.lang.Long.toBinaryString(dw6Var.M));
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_F2F_RING_TONE_STRING, dw6Var.K);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MOBILE_REMITTANCE_BIND_MOBILE_TRANSFER_INT_SYNC, java.lang.Integer.valueOf(dw6Var.N));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.PayBindMobileTransfer:%s", java.lang.Integer.valueOf(dw6Var.N));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_STRING_SYNC, dw6Var.R);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.PatSuffix:%s", dw6Var.R);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_VERSION_INT_SYNC, java.lang.Integer.valueOf(dw6Var.S));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.PatSuffixVersion:%d", java.lang.Integer.valueOf(dw6Var.S));
        gm0.j1.u().c().w(274436, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u1(dw6Var.f454345y, "CN"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.RegCountry:%s", dw6Var.f454345y);
        int i29 = dw6Var.S;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = lp3.p.f401835a;
        try {
            lp3.p.c(str2, "pat_user_suffix_version", java.lang.Integer.valueOf(i29));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PatUserMMKV", e17, "", new java.lang.Object[0]);
        }
        c01.d9.b().p().w(147458, java.lang.Long.valueOf(dw6Var.f454344x1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.DiscoveryPageCtrlFlag:%s", java.lang.Long.valueOf(dw6Var.f454344x1));
        if (!di4.i.f314315a.e()) {
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).uj(dw6Var.X, dw6Var.Y, java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.C20713xcd976ff7()) == 0));
        }
        boolean z18 = (dw6Var.f454321J & 1099511627776L) != 0;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_STATE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "mod contact write isTeenModeEnable: %b", java.lang.Boolean.valueOf(z18));
        int i37 = dw6Var.T;
        boolean a07 = c01.e2.a0();
        if (a07) {
            i37 = 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt write teenMode rang %b %d", java.lang.Boolean.valueOf(a07), java.lang.Integer.valueOf(i37));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_FINDER_RANGE_INT_SYNC, java.lang.Integer.valueOf(i37));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_BIZ_ACCT_RANGE_INT_SYNC, java.lang.Integer.valueOf(dw6Var.U));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_MINI_PROGRAM_RANGE_INT_SYNC, java.lang.Integer.valueOf(dw6Var.V));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_EMOTICON_RANGE_INT_SYNC, java.lang.Integer.valueOf(dw6Var.F1));
        ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "ApnsBannerDisplayContentSetting: %d", java.lang.Integer.valueOf(dw6Var.I1));
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_NOTIFICATION_BANNER_TYPE_NEW_INT_SYNC;
        c17.x(u3Var2, java.lang.Integer.valueOf(dw6Var.I1));
        bn0.g.f104312a.g("USERINFO_SETTING_NOTIFICATION_BANNER_TYPE_NEW_INT_SYNC", dw6Var.I1);
        w14.d dVar = w14.d.f523767d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            w14.b bVar = w14.c.f523759e;
            java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().m(u3Var2, null);
            w14.c a18 = bVar.a(num == null ? 0 : num.intValue());
            if (a18 != w14.d.f523768e) {
                w14.d.f523768e = a18;
                w14.d.f523771h = a18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationHelper", "update banner type: " + a18);
            }
            long i38 = c01.z1.i();
            if (i38 != w14.d.f523769f) {
                w14.d.f523769f = i38;
                w14.d.f523770g = i38;
                r26.a.a(2);
                java.lang.String l17 = java.lang.Long.toString(i38, 2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "toString(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationHelper", "update extStatus: ".concat(l17));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsNotificationHelper", "updateBannerType not main process");
        }
        boolean z19 = (dw6Var.f454321J & 18014398509481984L) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isCareMode:%s, local:%s, value:%s, ExtStatus:%s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(j65.e.b()), java.lang.Long.valueOf(dw6Var.f454321J & 18014398509481984L), java.lang.Long.valueOf(dw6Var.f454321J));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_STATE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z19));
        j65.e.n(true);
        boolean z27 = (dw6Var.f454347y1 & 16) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isTTSOpen:%s, local:%s, ExtStatus2:%s", java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(j65.e.f()), java.lang.Long.valueOf(dw6Var.f454347y1));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_LISTEN_BOOLEAN, java.lang.Boolean.valueOf(z27));
        j65.e.o();
        boolean z28 = (dw6Var.f454347y1 & 16777216) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isMuteOpen:%s, local:%s, ExtStatus2:%s", java.lang.Boolean.valueOf(z28), java.lang.Boolean.valueOf(j65.e.g()), java.lang.Long.valueOf(dw6Var.f454347y1));
        j65.e.l(z28);
        boolean z29 = (dw6Var.f454347y1 & 33554432) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isBigFontClose:%s, local:%s, ExtStatus2:%s", java.lang.Boolean.valueOf(z29), java.lang.Boolean.valueOf(j65.e.e()), java.lang.Long.valueOf(dw6Var.f454347y1));
        j65.e.k(!z29);
        r45.zu zuVar = new r45.zu();
        try {
            zuVar.mo11468x92b714fd(dw6Var.J1.f453374f.f273689a);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("HearingAid_");
            long n17 = j62.e.g().n();
            if (n17 == 0) {
                str = "0";
            } else if (n17 > 0) {
                str = java.lang.Long.toString(n17, 10);
            } else {
                char[] cArr = new char[64];
                long j17 = (n17 >>> 1) / 5;
                long j18 = 10;
                char forDigit = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
                int i39 = 63;
                cArr[63] = forDigit;
                for (long j19 = 0; j17 > j19; j19 = 0) {
                    i39--;
                    cArr[i39] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                    j17 /= j18;
                }
                str = new java.lang.String(cArr, i39, 64 - i39);
            }
            sb6.append(str);
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "hearingAidMode:%s, uin is %s", java.lang.Long.valueOf(zuVar.f473904d), sb7);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(sb7).putInt("hearing_aid_mode_remote", (int) zuVar.f473904d);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BigBallOfMudSyncExtension", e18.getMessage());
        }
        r45.gx6 gx6Var = dw6Var.C1;
        if (gx6Var == null || (i18 = gx6Var.f457164d) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "verifyContentList is null", java.lang.Integer.valueOf(gx6Var.f457164d));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_COMMON_SAY_HI_STRING_SYNC, "");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "verifyContentList Count:%s", java.lang.Integer.valueOf(i18));
            java.util.LinkedList linkedList2 = gx6Var.f457165e;
            if (linkedList2 != null && linkedList2.size() > 0) {
                r45.fx6 fx6Var = (r45.fx6) gx6Var.f457165e.get(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "verifyContentList VerifyContent:%s", fx6Var.f456251d);
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_COMMON_SAY_HI_STRING_SYNC, fx6Var.f456251d);
                r45.dz3 dz3Var = fx6Var.f456252e;
                r45.v60 v60Var = (dz3Var == null || (linkedList = dz3Var.f454402e) == null) ? null : (r45.v60) kz5.n0.Z(linkedList);
                if (v60Var != null) {
                    java.lang.String str4 = v60Var.f469465d;
                    if (!(str4 == null || r26.n0.N(str4))) {
                        java.lang.String str5 = v60Var.f469466e;
                        if (!(str5 == null || r26.n0.N(str5))) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUploader", "trySaveCommonSayHiPicture() called imgInfo.Url:" + v60Var.f469465d + " imgInfo.AESKey:" + v60Var.f469466e);
                            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_COMMON_SAY_HI_IMG_INFO_STRING_SYNC, android.util.Base64.encodeToString(dz3Var.mo14344x5f01b1f6(), 0));
                            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
                            if (c20976x6ba6452a != null) {
                                p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new hr3.zf(v60Var, null), 2, null);
                            }
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUploader", "trySaveCommonSayHiPicture() called USERINFO_COMMON_SAY_HI_STRING_SYNC set null");
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_COMMON_SAY_HI_IMG_INFO_STRING_SYNC, "");
            }
        }
        long j27 = dw6Var.f454347y1;
        boolean z37 = (4096 & j27) != 0;
        boolean z38 = (j27 & 32768) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isTXNewsMute:%s, isTXNewsMuteInit:%s, ExtStatus2:%s", java.lang.Boolean.valueOf(z37), java.lang.Boolean.valueOf(z38), java.lang.Long.valueOf(dw6Var.f454347y1));
        if (z38) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("newsapp", true);
            if (c01.e2.P(n18) != z37) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isTXNewsMute changed, current:%s", java.lang.Boolean.valueOf(z37));
                if (z37) {
                    c01.e2.p0(n18, false);
                } else {
                    c01.e2.z0(n18, false);
                }
            }
        }
        long j28 = dw6Var.f454347y1;
        boolean z39 = (8192 & j28) != 0;
        boolean z47 = (j28 & 65536) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isTXNewsTop:%s, isTXNewsTopInit:%s, ExtStatus2:%s", java.lang.Boolean.valueOf(z39), java.lang.Boolean.valueOf(z47), java.lang.Long.valueOf(dw6Var.f454347y1));
        if (z47 && ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("newsapp", true).w2() != z39) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isTXNewsTop changed, current:%s", java.lang.Boolean.valueOf(z39));
            if (z39) {
                c01.e2.t0("newsapp", true, false);
            } else {
                c01.e2.B0("newsapp", true, false);
            }
        }
        boolean z48 = (dw6Var.f454347y1 & 131072) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isQQMailMute:%s, ExtStatus2:%s", java.lang.Boolean.valueOf(z48), java.lang.Long.valueOf(dw6Var.f454347y1));
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("qqmail", true);
        if (c01.e2.P(n19) != z48) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isQQMailMute changed, current:%s", java.lang.Boolean.valueOf(z48));
            if (z48) {
                c01.e2.p0(n19, false);
            } else {
                c01.e2.z0(n19, false);
            }
        }
        boolean z49 = (dw6Var.f454347y1 & 262144) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isQQMailTop:%s, ExtStatus2:%s", java.lang.Boolean.valueOf(z49), java.lang.Long.valueOf(dw6Var.f454347y1));
        if (n19.w2() != z49) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isQQMailTop changed, current:%s", java.lang.Boolean.valueOf(z49));
            if (z49) {
                c01.e2.t0("qqmail", true, false);
            } else {
                c01.e2.B0("qqmail", true, false);
            }
        }
        boolean z57 = (dw6Var.f454321J & 67108864) != 0;
        if (z57) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_VOIP_CLOSE_SOUND_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z57));
        }
        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
        r0Var.f152070i = -1;
        r0Var.f152062a = str2;
        r0Var.f152066e = dw6Var.f454331o;
        r0Var.f152065d = dw6Var.f454332p;
        r0Var.f152067f = 1;
        r0Var.f152063b = 3;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
        java.lang.String str6 = dw6Var.f454341w;
        c01.d9.b().p().w(274433, dw6Var.f454342x);
        c01.d9.b().p().w(274434, str6);
        if (dw6Var.C != null) {
            c01.d9.b().p().w(286721, dw6Var.C.f453735e);
            c01.d9.b().p().w(286722, dw6Var.C.f453734d);
            c01.d9.b().p().w(286723, dw6Var.C.f453736f);
        }
        r45.q55 q55Var = dw6Var.E;
        if (q55Var != null && (cu5Var = q55Var.f465229e) != null && (i17 = cu5Var.f453372d) > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "tomgest PatternLockInfo %d", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6196xadf788bd c6196xadf788bd = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6196xadf788bd();
            c6196xadf788bd.f136452g.f90028a = dw6Var.E;
            c6196xadf788bd.e();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "handling xagreement configs");
        r45.kg7 kg7Var = dw6Var.W;
        if (kg7Var != null) {
            c01.je.l(kg7Var.f460222d, kg7Var.f460223e);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_VERSION_INT_SYNC;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "LQTVersion Old: %s New: %s", c18.m(u3Var3, 0), java.lang.Integer.valueOf(dw6Var.D1));
        gm0.j1.u().c().x(u3Var3, java.lang.Integer.valueOf(dw6Var.D1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "[+] synced yuanbao signed agreement infos.");
        vh0.d1 d1Var = (vh0.d1) i95.n0.c(vh0.d1.class);
        r45.l06 l06Var = dw6Var.H1;
        ((vh0.f2) d1Var).getClass();
        if (l06Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatBotAgreementService", "[-] saveSignedAgreementInfo: value is null.");
        } else {
            xh0.a.z0().J0(str2, l06Var.f460596e);
        }
        if ((dw6Var.K1 & 1) > 0) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATROOM_MUTE_DETAIL_CLIENT_GRAY_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATROOM_MUTE_DETAIL_CLIENT_GRAY_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        }
        if ((dw6Var.K1 & 2) > 0) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_OTHER_SEARCH_METHODS_VISIBLE_CLIENT_GRAY_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_OTHER_SEARCH_METHODS_VISIBLE_CLIENT_GRAY_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.ClientGrayFlag: %d", java.lang.Long.valueOf(dw6Var.K1));
    }
}
