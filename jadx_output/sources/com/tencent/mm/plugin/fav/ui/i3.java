package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes9.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.fav.ui.i3 f101160a = new com.tencent.mm.plugin.fav.ui.i3();

    public final co.a a(o72.r2 r2Var) {
        return b(r2Var, 301);
    }

    public final co.a b(o72.r2 r2Var, int i17) {
        if (r2Var == null) {
            return null;
        }
        int i18 = r2Var.field_type;
        if (i18 == 1) {
            ne5.a aVar = new ne5.a();
            java.lang.String str = r2Var.field_favProto.f370974s;
            aVar.n(str != null ? str : "");
            return aVar;
        }
        if (i18 != 2) {
            if (i18 != 4) {
                if (i18 == 5) {
                    java.util.LinkedList linkedList = r2Var.field_favProto.f370964f;
                    kotlin.jvm.internal.o.f(linkedList, "getDataList(...)");
                    r45.gp0 gp0Var = (r45.gp0) kz5.n0.Z(linkedList);
                    if (gp0Var != null) {
                        v05.b bVar = new v05.b();
                        int i19 = bVar.f368365d;
                        bVar.set(i19 + 6, 5);
                        java.lang.String str2 = gp0Var.f375404d;
                        if (str2 == null) {
                            str2 = "";
                        }
                        bVar.set(i19 + 2, str2);
                        java.lang.String str3 = gp0Var.f375408f;
                        if (str3 == null) {
                            str3 = "";
                        }
                        bVar.set(i19 + 3, str3);
                        java.lang.String str4 = gp0Var.A;
                        bVar.set(i19 + 9, str4 != null ? str4 : "");
                        se5.a aVar2 = new se5.a();
                        l15.c cVar = new l15.c();
                        cVar.q(bVar);
                        aVar2.l(cVar);
                        aVar2.k(o72.x1.X(gp0Var));
                        return aVar2;
                    }
                } else if (i18 == 6) {
                    r45.pp0 pp0Var = r2Var.field_favProto.f370966h;
                    if (pp0Var != null) {
                        o15.b bVar2 = new o15.b();
                        o15.a aVar3 = new o15.a();
                        aVar3.E(pp0Var.f383268f);
                        aVar3.F(pp0Var.f383266d);
                        aVar3.C(pp0Var.f383270h);
                        java.lang.String str5 = pp0Var.f383272m;
                        if (str5 == null) {
                            str5 = "";
                        }
                        aVar3.y(str5);
                        java.lang.String str6 = pp0Var.f383274o;
                        if (str6 == null) {
                            str6 = "";
                        }
                        aVar3.B(str6);
                        java.lang.String str7 = pp0Var.f383276q;
                        aVar3.A(str7 != null ? str7 : "");
                        aVar3.z("0");
                        bVar2.k(aVar3);
                        id5.a aVar4 = new id5.a();
                        aVar4.k(bVar2);
                        return aVar4;
                    }
                } else if (i18 == 8) {
                    r45.gp0 J2 = o72.x1.J(r2Var);
                    if (J2 != null) {
                        e40.x xVar = (e40.x) i95.n0.c(e40.x.class);
                        java.lang.String str8 = J2.f375404d;
                        ((e35.e) xVar).getClass();
                        e35.g.f247590a.a(str8, i17);
                        ec5.a aVar5 = new ec5.a();
                        aVar5.k(n13.v.f334140a.b(J2.f375404d, J2.K, J2.R));
                        java.lang.String x17 = o72.x1.x(J2);
                        aVar5.l(x17 != null ? x17 : "");
                        return aVar5;
                    }
                } else {
                    if (i18 == 14) {
                        com.tencent.mm.plugin.fav.ui.e6 a17 = com.tencent.mm.plugin.fav.ui.e6.a(com.tencent.mm.sdk.platformtools.x2.f193071a, r2Var);
                        mc0.k kVar = (mc0.k) i95.n0.c(mc0.k.class);
                        java.lang.String str9 = a17.f100831a;
                        java.lang.String str10 = a17.f100832b;
                        r45.bq0 field_favProto = r2Var.field_favProto;
                        kotlin.jvm.internal.o.f(field_favProto, "field_favProto");
                        java.lang.String Zi = ((zs3.z) kVar).Zi(str9, str10, field_favProto);
                        xd5.a aVar6 = new xd5.a();
                        l15.c cVar2 = new l15.c();
                        cVar2.fromXml(Zi);
                        aVar6.n(cVar2);
                        l15.c k17 = aVar6.k();
                        v05.b k18 = k17 != null ? k17.k() : null;
                        if (k18 != null) {
                            k18.set(k18.f368365d + 6, 19);
                        }
                        aVar6.l(r2Var.field_localId);
                        return aVar6;
                    }
                    if (i18 != 16) {
                        if (i18 != 32) {
                            if (i18 != 33) {
                                switch (i18) {
                                    case 18:
                                        com.tencent.mm.plugin.fav.ui.e6 a18 = com.tencent.mm.plugin.fav.ui.e6.a(com.tencent.mm.sdk.platformtools.x2.f193071a, r2Var);
                                        mc0.k kVar2 = (mc0.k) i95.n0.c(mc0.k.class);
                                        java.lang.String str11 = a18.f100831a;
                                        java.lang.String str12 = a18.f100832b;
                                        r45.bq0 field_favProto2 = r2Var.field_favProto;
                                        kotlin.jvm.internal.o.f(field_favProto2, "field_favProto");
                                        java.lang.String Zi2 = ((zs3.z) kVar2).Zi(str11, str12, field_favProto2);
                                        dc5.a aVar7 = new dc5.a();
                                        l15.c cVar3 = new l15.c();
                                        cVar3.fromXml(Zi2);
                                        aVar7.n(cVar3);
                                        l15.c k19 = aVar7.k();
                                        v05.b k27 = k19 != null ? k19.k() : null;
                                        if (k27 != null) {
                                            k27.set(k27.f368365d + 6, 24);
                                        }
                                        aVar7.l(r2Var.field_localId);
                                        aVar7.o(1);
                                        return aVar7;
                                    case 19:
                                        r45.dp0 dp0Var = r2Var.field_favProto.I;
                                        k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(dp0Var.f372634d);
                                        java.lang.String string = Bi != null ? Bi.field_nickname : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490614a00);
                                        s05.d dVar = new s05.d();
                                        java.lang.String str13 = dp0Var.f372634d;
                                        if (str13 == null) {
                                            str13 = "";
                                        }
                                        dVar.R(str13);
                                        java.lang.String str14 = dp0Var.f372635e;
                                        if (str14 == null) {
                                            str14 = "";
                                        }
                                        dVar.E(str14);
                                        dVar.Q(2);
                                        dVar.S(dp0Var.f372641n);
                                        java.lang.String str15 = dp0Var.f372637g;
                                        if (str15 == null) {
                                            str15 = "";
                                        }
                                        dVar.T(str15);
                                        dVar.O(dp0Var.f372645r);
                                        dVar.P(dp0Var.f372643p);
                                        java.lang.String str16 = dp0Var.f372644q;
                                        if (str16 == null) {
                                            str16 = "";
                                        }
                                        dVar.H(str16);
                                        dVar.J(dp0Var.f372639i);
                                        s05.e eVar = new s05.e();
                                        eVar.k(dp0Var.f372636f);
                                        dVar.K(eVar);
                                        v05.b bVar3 = new v05.b();
                                        java.lang.String str17 = r2Var.field_favProto.f370972q;
                                        if (str17 == null) {
                                            str17 = "";
                                        }
                                        int i27 = bVar3.f368365d;
                                        bVar3.set(i27 + 2, str17);
                                        java.lang.String str18 = r2Var.field_favProto.f370972q;
                                        if (str18 == null) {
                                            str18 = "";
                                        }
                                        bVar3.set(i27 + 3, str18);
                                        java.lang.String l27 = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).l2(dp0Var.f372635e);
                                        if (l27 == null) {
                                            l27 = "";
                                        }
                                        bVar3.set(i27 + 9, l27);
                                        java.lang.String str19 = dp0Var.f372634d;
                                        if (str19 == null) {
                                            str19 = "";
                                        }
                                        int i28 = bVar3.f432315e;
                                        bVar3.set(i28 + 11, str19);
                                        bVar3.set(i28 + 12, string != null ? string : "");
                                        bVar3.set(i27 + 6, 33);
                                        bVar3.set(i28 + 39, dVar);
                                        nb5.b bVar4 = new nb5.b();
                                        bVar4.l(bVar3);
                                        r45.gp0 J3 = o72.x1.J(r2Var);
                                        if (J3 != null) {
                                            java.lang.String X = o72.x1.X(J3);
                                            kotlin.jvm.internal.o.f(X, "getThumbPath(...)");
                                            bVar4.n(X);
                                        }
                                        return bVar4;
                                    case 20:
                                        x05.j jVar = new x05.j();
                                        java.lang.String field_xml = r2Var.field_xml;
                                        kotlin.jvm.internal.o.f(field_xml, "field_xml");
                                        jVar.fromXml(field_xml);
                                        fc5.i iVar = new fc5.i();
                                        l15.c cVar4 = new l15.c();
                                        v05.b bVar5 = new v05.b();
                                        bVar5.set(bVar5.f432315e + 36, jVar);
                                        cVar4.q(bVar5);
                                        iVar.k(cVar4);
                                        return iVar;
                                }
                            }
                            r45.gp0 J4 = o72.x1.J(r2Var);
                            if (J4 != null) {
                                oe5.b bVar6 = new oe5.b();
                                r45.jq0 jq0Var = r2Var.field_favProto.f370962d;
                                java.lang.String str20 = jq0Var != null ? jq0Var.f378050w : null;
                                r45.hp0 hp0Var = J4.J1;
                                r45.km6 km6Var = hp0Var != null ? hp0Var.G : null;
                                v05.b bVar7 = new v05.b();
                                java.lang.String str21 = J4.f375404d;
                                if (str21 == null) {
                                    str21 = "";
                                }
                                int i29 = bVar7.f368365d;
                                bVar7.set(i29 + 2, str21);
                                java.lang.String str22 = J4.f375408f;
                                if (str22 == null) {
                                    str22 = "";
                                }
                                bVar7.set(i29 + 3, str22);
                                java.lang.String str23 = J4.A;
                                if (str23 == null) {
                                    str23 = "";
                                }
                                bVar7.set(i29 + 9, str23);
                                if (str20 == null) {
                                    str20 = "";
                                }
                                bVar7.set(i29 + 0, str20);
                                java.lang.String str24 = J4.G;
                                if (str24 == null) {
                                    str24 = "";
                                }
                                int i37 = bVar7.f432315e;
                                bVar7.set(i37 + 14, str24);
                                bVar7.set(i29 + 6, 93);
                                bVar7.set(i37 + 10, 3);
                                if (km6Var != null) {
                                    int i38 = i37 + 45;
                                    bVar7.set(i38, new e15.h());
                                    e15.h hVar = (e15.h) bVar7.getCustom(i38);
                                    if (hVar != null) {
                                        java.lang.String str25 = km6Var.f378839e;
                                        if (str25 == null) {
                                            str25 = "";
                                        }
                                        hVar.n(str25);
                                    }
                                    e15.h hVar2 = (e15.h) bVar7.getCustom(i38);
                                    if (hVar2 != null) {
                                        hVar2.o(km6Var.f378838d);
                                    }
                                    e15.h hVar3 = (e15.h) bVar7.getCustom(i38);
                                    if (hVar3 != null) {
                                        java.lang.String str26 = km6Var.f378840f;
                                        hVar3.l(str26 != null ? str26 : "");
                                    }
                                }
                                l15.c cVar5 = new l15.c();
                                cVar5.q(bVar7);
                                bVar6.l(cVar5);
                                bVar6.k(o72.x1.X(J4));
                                return bVar6;
                            }
                        }
                        r45.gp0 J5 = o72.x1.J(r2Var);
                        if (J5 != null) {
                            oe5.c cVar6 = new oe5.c();
                            v05.b bVar8 = new v05.b();
                            java.lang.String str27 = J5.A;
                            if (str27 == null) {
                                str27 = "";
                            }
                            int i39 = bVar8.f368365d;
                            bVar8.set(i39 + 9, str27);
                            java.lang.String str28 = J5.C;
                            if (str28 == null) {
                                str28 = "";
                            }
                            int i47 = bVar8.f432315e;
                            bVar8.set(i47 + 2, str28);
                            java.lang.String str29 = J5.E;
                            if (str29 == null) {
                                str29 = "";
                            }
                            bVar8.set(i47 + 0, str29);
                            java.lang.String str30 = J5.E;
                            if (str30 == null) {
                                str30 = "";
                            }
                            bVar8.set(i47 + 3, str30);
                            java.lang.String str31 = J5.f375421m2;
                            if (str31 == null) {
                                str31 = "";
                            }
                            bVar8.set(i47 + 46, str31);
                            java.lang.String str32 = J5.f375425o2;
                            if (str32 == null) {
                                str32 = "";
                            }
                            bVar8.set(i47 + 47, str32);
                            java.lang.String str33 = J5.f375404d;
                            if (str33 == null) {
                                str33 = "";
                            }
                            bVar8.set(i39 + 2, str33);
                            java.lang.String str34 = J5.f375408f;
                            if (str34 == null) {
                                str34 = "";
                            }
                            bVar8.set(i39 + 3, str34);
                            bVar8.set(i47 + 10, 3);
                            java.lang.String str35 = J5.G;
                            if (str35 == null) {
                                str35 = "";
                            }
                            bVar8.set(i47 + 14, str35);
                            java.lang.String str36 = r2Var.field_favProto.f370962d.f378050w;
                            bVar8.set(i39 + 0, str36 != null ? str36 : "");
                            int i48 = r2Var.field_type;
                            if (i48 == 32) {
                                bVar8.set(i39 + 6, 92);
                            } else if (i48 == 21) {
                                bVar8.set(i39 + 6, 76);
                            }
                            l15.c cVar7 = new l15.c();
                            cVar7.q(bVar8);
                            cVar6.l(cVar7);
                            cVar6.k(o72.x1.X(J5));
                            return cVar6;
                        }
                    }
                }
            }
            java.util.LinkedList linkedList2 = r2Var.field_favProto.f370964f;
            kotlin.jvm.internal.o.f(linkedList2, "getDataList(...)");
            r45.gp0 gp0Var2 = (r45.gp0) kz5.n0.Z(linkedList2);
            if (gp0Var2 != null) {
                jd5.c cVar8 = new jd5.c();
                java.lang.String e17 = com.tencent.mm.plugin.fav.ui.x5.e(gp0Var2);
                if (e17 == null) {
                    e17 = "";
                }
                cVar8.o(e17);
                cVar8.q(gp0Var2.f375448y);
                java.lang.String x18 = o72.x1.x(gp0Var2);
                cVar8.r(x18 != null ? x18 : "");
                return cVar8;
            }
        } else {
            java.util.LinkedList linkedList3 = r2Var.field_favProto.f370964f;
            kotlin.jvm.internal.o.f(linkedList3, "getDataList(...)");
            r45.gp0 gp0Var3 = (r45.gp0) kz5.n0.Z(linkedList3);
            if (gp0Var3 != null) {
                java.lang.String x19 = o72.x1.x(gp0Var3);
                java.lang.String str37 = com.tencent.mm.vfs.w6.j(x19) ? x19 : null;
                if (str37 == null) {
                    str37 = o72.x1.X(gp0Var3);
                }
                jd5.a aVar8 = new jd5.a();
                kotlin.jvm.internal.o.d(str37);
                aVar8.p(str37);
                return aVar8;
            }
        }
        return null;
    }

    public final boolean c(o72.r2 r2Var) {
        if (r2Var == null) {
            return false;
        }
        if (kz5.z.D0(new java.lang.Integer[]{20, 17}).contains(java.lang.Integer.valueOf(r2Var.field_type))) {
            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
            return true;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        return true;
    }
}
