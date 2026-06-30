package pn1;

/* loaded from: classes12.dex */
public class c implements on1.i {
    @Override // on1.i
    public boolean a(r45.ed edVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var.z2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemAppMsg", "complementMediaFile, msg.isClean");
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = tn1.f.f().e().a().J0(f9Var.m124847x74d37ac6(), f9Var.Q0());
        if (J0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemAppMsg", "appAttachInfo == null");
            return false;
        }
        java.lang.String w17 = kn1.k.w(edVar, 7, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemAppMsg", "mediaId == null");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemAppMsg", "recoverComplementMediaFile, mediaId = " + w17 + ", fullPath = " + J0.f68099xfeae815);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(kn1.k.n(w17));
        sb6.append(w17);
        java.lang.String sb7 = sb6.toString();
        if (J0.f68112x10a0fed7 != 199 || com.p314xaae8f345.mm.vfs.w6.k(J0.f68099xfeae815) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemAppMsg", "complementMediaFile, appAttachPath = " + sb7);
            return false;
        }
        com.p314xaae8f345.mm.vfs.w6.w(sb7, J0.f68099xfeae815);
        ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(J0.f68099xfeae815, 6, null, null);
        return true;
    }

    @Override // on1.i
    public int b(java.lang.String str, r45.ed edVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, on1.a aVar) {
        int b17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = edVar.f454814f.f454289d;
        java.lang.String str3 = edVar.f454816h.f454289d;
        if (str3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemAppMsg", "recover xml == null");
            return 0;
        }
        f9Var.d1(str3);
        if (f9Var.A0() != 1 && tn1.e.h(str2) && (b17 = tn1.e.b(edVar.f454816h.f454289d)) != -1) {
            str3 = (edVar.f454816h.f454289d + " ").substring(b17 + 2).trim();
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        ot0.q v17 = ot0.q.v(str3);
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FastBackupItemAppMsg", "parse app message failed, insert failed");
            return 0;
        }
        int i17 = v17.f430199i;
        if (i17 == 2000 || i17 == 2011) {
            f9Var.m124850x7650bebc(419430449);
            return 1;
        }
        if (i17 == 2001) {
            f9Var.m124850x7650bebc(436207665);
            return 1;
        }
        if (i17 == 115) {
            f9Var.m124850x7650bebc(-2130706383);
            return 1;
        }
        if (i17 == 19 || i17 == 24) {
            f9Var.m124850x7650bebc(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.p(v17));
            f9Var.m124849x5361953a(((com.p314xaae8f345.mm.p2621x8fb0427b.g9) tn1.f.f().e().g()).B8(f9Var));
            aVar.f428332j = true;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5864x3562e4e0 c5864x3562e4e0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5864x3562e4e0();
            java.lang.String str4 = v17.f430196h0;
            am.fp fpVar = c5864x3562e4e0.f136171g;
            fpVar.f88222a = str4;
            fpVar.f88223b = f9Var.m124847x74d37ac6();
            fpVar.f88224c = f9Var.Q0();
            c5864x3562e4e0.e();
            java.lang.String[] split = c5864x3562e4e0.f136172h.f88318a.split(":");
            for (int i18 = 0; i18 < split.length; i18++) {
                java.lang.String w17 = kn1.k.w(edVar, 7, "." + i18);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w17)) {
                    com.p314xaae8f345.mm.vfs.w6.w(kn1.k.n(w17) + w17, split[i18]);
                    sb6.append(split[i18]);
                    sb6.append(";");
                    on1.c.a(f9Var.I0(), sb6.toString());
                    ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(split[i18], 19, null, null);
                    java.lang.String str5 = split[i18];
                }
            }
            return 1;
        }
        if (i17 == 87) {
            f9Var.m124850x7650bebc(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.p(v17));
            f9Var.p1(f9Var.S1());
            f9Var.u3(edVar.f454819n);
            f9Var.m124849x5361953a(((com.p314xaae8f345.mm.p2621x8fb0427b.g9) tn1.f.f().e().g()).B8(f9Var));
            aVar.f428332j = true;
            e81.e.b(f9Var);
            java.lang.String[] Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.x) ((d81.e) i95.n0.c(d81.e.class))).Ai(f9Var, ((rt0.d) v17.y(rt0.d.class)).f480909c);
            for (int i19 = 0; i19 < Ai.length; i19++) {
                java.lang.String w18 = kn1.k.w(edVar, 7, "_fav." + i19);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w18)) {
                    com.p314xaae8f345.mm.vfs.w6.w(kn1.k.n(w18) + w18, Ai[i19]);
                    sb6.append(Ai[i19]);
                    sb6.append(";");
                    on1.c.a(f9Var.I0(), sb6.toString());
                }
            }
            return 1;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m();
        mVar.f67370x28d45f97 = v17.f430179d;
        tn1.d e17 = tn1.f.f().e();
        if (e17.f502345o == 0) {
            throw new c01.c();
        }
        if (e17.f502341k.get(mVar, new java.lang.String[0]) && mVar.f67379x119cf7dc < v17.G) {
            tn1.c d17 = tn1.f.f().d();
            d17.f502329a.add(new tn1.b(d17, 1, v17.f430179d));
        }
        f9Var.m124850x7650bebc(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.p(v17));
        byte[] y17 = kn1.k.y(edVar, 6);
        if (y17 != null && f9Var.m124847x74d37ac6() == 0) {
            java.lang.String J0 = tn1.f.f().e().f().J0(f9Var, y17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J0)) {
                f9Var.i1(J0);
            }
        }
        java.lang.String w19 = kn1.k.w(edVar, 8, null);
        int x17 = kn1.k.x(edVar, 8);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w19)) {
            w19 = kn1.k.w(edVar, 7, null);
            x17 = kn1.k.x(edVar, 7);
        }
        java.lang.String str6 = kn1.k.n(w19) + w19;
        ot0.t tVar = new ot0.t();
        v17.j(tVar);
        tVar.f67765x297eb4f7 = f9Var.m124847x74d37ac6();
        tVar.f67766xd09be28e = f9Var.I0();
        tVar.f67767x436b2035 = f9Var.Q0();
        aVar.f428331i = tVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemAppMsg", "recover AppAttachInfo mediaId = " + w19);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w19)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) tn1.f.f().e().g()).o2(str.equals(edVar.f454814f.f454289d) ? edVar.f454815g.f454289d : edVar.f454814f.f454289d, edVar.f454827v);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d D0 = tn1.f.f().e().a().D0(v17.f430227p);
            if (D0 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemAppMsg", "recover AppAttachInfo is null.");
                D0 = tn1.e.e(o27.m124847x74d37ac6(), o27.Q0(), str3);
                if (D0 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FastBackupItemAppMsg", "getAppAttachInfoStg().getByMediaId is null! attachid[%s]", v17.f430227p);
                    return 0;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemAppMsg", "amc.attachlen = " + v17.f430215m + ", len = " + x17);
                long j17 = v17.f430215m;
                if (j17 != 0 && x17 != 0) {
                    if (x17 >= j17) {
                        D0.f68112x10a0fed7 = 199L;
                    } else if (f9Var.A0() == 1) {
                        D0.f68112x10a0fed7 = 105L;
                    } else {
                        D0.f68112x10a0fed7 = 102L;
                    }
                }
            } else {
                aVar.f428333k = D0.f72763xa3c65b86;
            }
            long j18 = x17;
            D0.f68109x90a9378 = j18;
            D0.f68113xeb1a61d6 = j18;
            com.p314xaae8f345.mm.vfs.w6.w(str6, D0.f68099xfeae815);
            sb6.append(D0.f68099xfeae815);
            sb6.append(";");
            on1.c.a(f9Var.I0(), sb6.toString());
            aVar.f428334l = D0;
            ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(D0.f68099xfeae815, 6, null, null);
        }
        return 1;
    }

    @Override // on1.i
    public int c(r45.ed edVar, boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.util.LinkedList linkedList, boolean z18) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i17;
        java.lang.String str5;
        java.lang.String stringBuffer;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        ot0.m0 m0Var;
        java.lang.String str11;
        ot0.q qVar;
        java.lang.String str12;
        int i18;
        int i19;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d D0;
        int b17;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String[] strArr;
        java.lang.String str15;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0;
        int indexOf;
        int mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0();
        if (mo78013xfb85f7b0 == 1048625) {
            int length = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.j()) ? 0 : f9Var.j().getBytes().length;
            if (f9Var.j() == null) {
                return -1;
            }
            java.lang.String j17 = f9Var.j();
            if (!kn1.k.f(j17)) {
                j17 = f9Var.j();
                if (!kn1.k.f(j17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FastBackupItemAppMsg", "get xml error " + j17);
                    return 0;
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17)) {
                r45.du5 du5Var = new r45.du5();
                du5Var.c(j17 == null ? "" : j17);
                edVar.f454816h = du5Var;
            }
            return length;
        }
        if (mo78013xfb85f7b0 != 285212721) {
            java.lang.String J02 = f9Var.mo78013xfb85f7b0() == 1107296305 ? f9Var.J0() : f9Var.j();
            int length2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J02) ? 0 : J02.getBytes().length;
            java.lang.String substring = (f9Var.A0() == 1 || !tn1.e.h(f9Var.Q0()) || (indexOf = J02.indexOf(58)) == -1) ? J02 : J02.substring(indexOf + 1);
            ot0.q v17 = substring != null ? ot0.q.v(substring) : null;
            if (v17 == null) {
                return 0;
            }
            java.lang.String mj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), true);
            if (com.p314xaae8f345.mm.vfs.w6.j(mj6)) {
                qVar = v17;
                str12 = "";
                i18 = 1;
                length2 += on1.e.b(new on1.d(mj6, edVar, linkedList, 6, z17, "_thumb", false, null));
                i19 = 2;
            } else {
                qVar = v17;
                str12 = "";
                i18 = 1;
                i19 = 2;
                if (qVar.f430199i == 2) {
                    return -1;
                }
            }
            int i27 = qVar.f430199i;
            if (i27 != i19) {
                java.lang.String str16 = "_fav.";
                java.lang.String str17 = "record file exit:%s, index:%d";
                if (i27 == 19 || i27 == 24) {
                    java.lang.String str18 = "record file exit:%s, index:%d";
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5864x3562e4e0 c5864x3562e4e0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5864x3562e4e0();
                    java.lang.String str19 = qVar.f430196h0;
                    am.fp fpVar = c5864x3562e4e0.f136171g;
                    fpVar.f88222a = str19;
                    fpVar.f88223b = f9Var.m124847x74d37ac6();
                    fpVar.f88224c = f9Var.Q0();
                    c5864x3562e4e0.e();
                    am.gp gpVar = c5864x3562e4e0.f136172h;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemAppMsg", "pathList:%s", gpVar.f88318a);
                    java.lang.String[] split = gpVar.f88318a.split(":");
                    int i28 = 0;
                    while (i28 < split.length) {
                        if (com.p314xaae8f345.mm.vfs.w6.j(split[i28])) {
                            str13 = str18;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemAppMsg", str13, split[i28], java.lang.Integer.valueOf(i28));
                            length2 += on1.e.b(new on1.d(split[i28], edVar, linkedList, 7, z17, "_fav." + i28, z18, null));
                        } else {
                            str13 = str18;
                        }
                        i28++;
                        str18 = str13;
                    }
                } else if (i27 == 87) {
                    r45.du5 du5Var2 = new r45.du5();
                    du5Var2.c(J02 == null ? str12 : J02);
                    edVar.f454816h = du5Var2;
                    edVar.f454819n = f9Var.G;
                    java.lang.String[] Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.x) ((d81.e) i95.n0.c(d81.e.class))).Ai(f9Var, ((rt0.d) qVar.y(rt0.d.class)).f480909c);
                    int i29 = 0;
                    while (i29 < Ai.length) {
                        if (com.p314xaae8f345.mm.vfs.w6.j(Ai[i29])) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FastBackupItemAppMsg", str17, Ai[i29], java.lang.Integer.valueOf(i29));
                            java.lang.String str20 = Ai[i29];
                            str14 = str17;
                            strArr = Ai;
                            str15 = str16;
                            length2 += on1.e.b(new on1.d(str20, edVar, linkedList, 7, z17, str16 + i29, z18, null));
                        } else {
                            str14 = str17;
                            strArr = Ai;
                            str15 = str16;
                        }
                        i29++;
                        str16 = str15;
                        str17 = str14;
                        Ai = strArr;
                    }
                } else if ((i27 == 130 || i27 == 6 || i27 == 7) && ((((J0 = tn1.f.f().e().a().J0(f9Var.m124847x74d37ac6(), f9Var.Q0())) != null && J0.t0()) || (f9Var.A0() == i18 && J0 != null && J0.f68101x13f40970)) && com.p314xaae8f345.mm.vfs.w6.j(J0.f68099xfeae815))) {
                    b17 = on1.e.b(new on1.d(J0.f68099xfeae815, edVar, linkedList, 7, z17, z18, null));
                    length2 += b17;
                }
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430227p) && (((D0 = tn1.f.f().e().a().D0(qVar.f430227p)) != null && D0.t0()) || (f9Var.A0() == i18 && D0 != null && D0.f68101x13f40970))) {
                java.lang.String str21 = D0.f68099xfeae815;
                if (com.p314xaae8f345.mm.vfs.w6.j(str21)) {
                    b17 = on1.e.b(new on1.d(str21, edVar, linkedList, 7, z17, z18, null));
                    length2 += b17;
                }
            }
            return length2;
        }
        int length3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.j()) ? 0 : f9Var.j().getBytes().length;
        if (z17) {
            i17 = length3;
        } else {
            java.lang.String j18 = f9Var.j();
            ot0.m0 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(0L, j18);
            pn1.a aVar = new pn1.a(j18);
            if (aVar.f438496b) {
                pn1.b bVar = new pn1.b();
                java.util.LinkedList linkedList2 = Di.f430114i;
                java.util.HashMap hashMap = new java.util.HashMap();
                bVar.c("msg");
                java.util.HashMap hashMap2 = (java.util.HashMap) aVar.f438495a;
                hashMap.put("appid", (java.lang.String) hashMap2.get(".msg.appmsg.$appid"));
                hashMap.put("sdkver", (java.lang.String) hashMap2.get(".msg.appmsg.$sdkver"));
                java.lang.String str22 = "appmsg";
                bVar.d("appmsg", hashMap);
                if (linkedList2 == null) {
                    linkedList2 = new java.util.LinkedList();
                }
                if (linkedList2.size() == 0) {
                    str2 = "";
                    str3 = str2;
                    str4 = str3;
                } else {
                    str2 = ((ot0.s0) linkedList2.get(0)).f430294d;
                    str3 = ((ot0.s0) linkedList2.get(0)).f430295e;
                    java.lang.String str23 = ((ot0.s0) linkedList2.get(0)).f430299i;
                    str4 = ((ot0.s0) linkedList2.get(0)).f430302n;
                }
                bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str2);
                bVar.a("des", (java.lang.String) hashMap2.get(".msg.appmsg.des"));
                bVar.a("action", (java.lang.String) hashMap2.get(".msg.appmsg.action"));
                int a17 = aVar.a(".msg.appmsg.type");
                bVar.c("type");
                java.lang.StringBuffer stringBuffer2 = bVar.f438497a;
                stringBuffer2.append(a17);
                bVar.b("type");
                int a18 = aVar.a(".msg.appmsg.showtype");
                i17 = length3;
                bVar.c("showtype");
                stringBuffer2.append(a18);
                bVar.b("showtype");
                bVar.a("content", (java.lang.String) hashMap2.get(".msg.appmsg.content"));
                bVar.a("url", str3);
                bVar.a("lowurl", (java.lang.String) hashMap2.get(".msg.appmsg.lowurl"));
                bVar.c("appattach");
                int a19 = aVar.a(".msg.appmsg.appattach.totallen");
                bVar.c("totallen");
                stringBuffer2.append(a19);
                bVar.b("totallen");
                bVar.a("attachid", (java.lang.String) hashMap2.get(".msg.appmsg.appattach.attachid"));
                bVar.a("fileext", (java.lang.String) hashMap2.get(".msg.appmsg.appattach.fileext"));
                bVar.b("appattach");
                java.lang.String str24 = "mmreader";
                bVar.c("mmreader");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(Di.f430109d);
                str5 = "";
                sb6.append(str5);
                hashMap.put("type", sb6.toString());
                hashMap.put("convMsgCount", linkedList2.size() + str5);
                java.lang.String str25 = "category";
                bVar.d("category", hashMap);
                java.lang.String str26 = Di.f430112g;
                java.lang.String str27 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
                bVar.a(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str26);
                bVar.c("topnew");
                bVar.a("cover", (java.lang.String) hashMap2.get(".msg.appmsg.mmreader.category.topnew.cover"));
                bVar.a("width", (java.lang.String) hashMap2.get(".msg.appmsg.mmreader.category.topnew.width"));
                bVar.a("height", (java.lang.String) hashMap2.get(".msg.appmsg.mmreader.category.topnew.height"));
                java.lang.String str28 = "digest";
                bVar.a("digest", str4);
                bVar.b("topnew");
                int i37 = 0;
                while (i37 < linkedList2.size()) {
                    bVar.c("item");
                    if (linkedList2.get(i37) == null) {
                        m0Var = Di;
                        str9 = str28;
                        str6 = str22;
                        str7 = str24;
                        str8 = str25;
                        str11 = str27;
                    } else {
                        java.lang.String str29 = ((ot0.s0) linkedList2.get(i37)).f430294d;
                        str6 = str22;
                        java.lang.String str30 = ((ot0.s0) linkedList2.get(i37)).f430295e;
                        str7 = str24;
                        java.lang.String str31 = ((ot0.s0) linkedList2.get(i37)).f430296f;
                        str8 = str25;
                        java.lang.String str32 = ((ot0.s0) linkedList2.get(i37)).f430297g;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        java.lang.String str33 = str27;
                        ot0.m0 m0Var2 = Di;
                        java.lang.String str34 = str28;
                        sb7.append(((ot0.s0) linkedList2.get(i37)).f430298h);
                        sb7.append(str5);
                        java.lang.String sb8 = sb7.toString();
                        java.lang.String str35 = ((ot0.s0) linkedList2.get(i37)).f430299i;
                        java.lang.String str36 = ((ot0.s0) linkedList2.get(i37)).f430301m;
                        java.lang.String str37 = ((ot0.s0) linkedList2.get(i37)).f430302n;
                        bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str29);
                        bVar.a("url", str30);
                        bVar.a("shorturl", str31);
                        bVar.a("longurl", str32);
                        bVar.a("pub_time", sb8);
                        bVar.a("cover", str35);
                        bVar.a("tweetid", str36);
                        str9 = str34;
                        bVar.a(str9, str37);
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(".msg.appmsg.mmreader.category.item");
                        if (i37 == 0) {
                            str10 = str5;
                        } else {
                            str10 = str5 + i37;
                        }
                        sb9.append(str10);
                        bVar.a("fileid", (java.lang.String) hashMap2.get(sb9.toString() + ".fileid"));
                        bVar.c(ya.b.f77502x92235c1b);
                        bVar.c(ya.b.f77502x92235c1b);
                        m0Var = m0Var2;
                        str11 = str33;
                        bVar.a(str11, m0Var.f430112g);
                        bVar.b(ya.b.f77502x92235c1b);
                        bVar.b(ya.b.f77502x92235c1b);
                        bVar.b("item");
                    }
                    i37++;
                    str22 = str6;
                    str28 = str9;
                    Di = m0Var;
                    str27 = str11;
                    str24 = str7;
                    str25 = str8;
                }
                ot0.m0 m0Var3 = Di;
                bVar.b(str25);
                bVar.c(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37657xc6f7cacc);
                bVar.a("convName", m0Var3.f430111f);
                bVar.a("nickname", m0Var3.f430112g);
                bVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37657xc6f7cacc);
                bVar.b(str24);
                bVar.b(str22);
                bVar.a("fromusername", m0Var3.f430111f);
                int a27 = aVar.a(".msg.scene");
                bVar.c(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
                stringBuffer2.append(a27);
                bVar.b(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
                bVar.c("appinfo");
                bVar.a("version", (java.lang.String) hashMap2.get(".msg.appinfo.appname"));
                bVar.a("appname", (java.lang.String) hashMap2.get(".msg.appinfo.version"));
                bVar.b("appinfo");
                bVar.a("commenturl", m0Var3.f430113h);
                bVar.b("msg");
                stringBuffer2.toString();
                stringBuffer = stringBuffer2.toString();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppmsgConvert", "buffer error");
                i17 = length3;
                stringBuffer = "";
                str5 = stringBuffer;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringBuffer)) {
                return 0;
            }
            r45.du5 du5Var3 = new r45.du5();
            du5Var3.c(stringBuffer == null ? str5 : stringBuffer);
            edVar.f454816h = du5Var3;
        }
        return i17;
    }
}
