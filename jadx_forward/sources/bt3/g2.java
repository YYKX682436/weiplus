package bt3;

/* loaded from: classes9.dex */
public abstract class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.j f105811a = new jt0.j(32);

    public static r45.ul5 A(java.lang.String str) {
        int i17;
        java.lang.String str2;
        java.lang.String str3;
        org.w3c.dom.NodeList childNodes;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgLogic", "xml is null");
            return null;
        }
        int hashCode = str.hashCode();
        kk.j jVar = f105811a;
        r45.ul5 ul5Var = (r45.ul5) ((lt0.f) jVar).get(java.lang.Integer.valueOf(hashCode));
        if (ul5Var != null) {
            return ul5Var;
        }
        java.util.Map d17 = str.trim().contains("<recordinfo>") ? com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "recordinfo", null) : com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d("<recordinfo>" + str + "</recordinfo>", "recordinfo", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgLogic", "values is null: %s", str);
            return null;
        }
        r45.ul5 ul5Var2 = new r45.ul5();
        ul5Var2.f468996d = (java.lang.String) d17.get(".recordinfo.title");
        ul5Var2.f468997e = (java.lang.String) d17.get(".recordinfo.desc");
        ul5Var2.f468999g = (java.lang.String) d17.get(".recordinfo.favusername");
        if (d17.get(".recordinfo.noteinfo") != null) {
            r45.sp0 sp0Var = new r45.sp0();
            sp0Var.f467425e = (java.lang.String) d17.get(".recordinfo.noteinfo.noteeditor");
            sp0Var.f467424d = (java.lang.String) d17.get(".recordinfo.noteinfo.noteauthor");
            ul5Var2.f469000h = sp0Var;
            ul5Var2.f469001i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".recordinfo.edittime"), 0L);
        }
        java.util.LinkedList linkedList = ul5Var2.f468998f;
        linkedList.clear();
        try {
            org.w3c.dom.Document parse = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new org.xml.sax.InputSource(new java.io.ByteArrayInputStream(str.getBytes())));
            parse.normalize();
            org.w3c.dom.NodeList elementsByTagName = parse.getDocumentElement().getElementsByTagName("datalist");
            if (elementsByTagName != null) {
                int i18 = 0;
                org.w3c.dom.NodeList childNodes2 = elementsByTagName.item(0).getChildNodes();
                if (childNodes2 != null && childNodes2.getLength() > 0) {
                    int length = childNodes2.getLength();
                    int i19 = 0;
                    while (i19 < length) {
                        org.w3c.dom.Node item = childNodes2.item(i19);
                        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.c(item);
                        if (item instanceof org.w3c.dom.Element) {
                            org.w3c.dom.NodeList elementsByTagName2 = ((org.w3c.dom.Element) item).getElementsByTagName("recordxml");
                            if (elementsByTagName2 != null && elementsByTagName2.getLength() > 0 && (childNodes = elementsByTagName2.item(i18).getChildNodes()) != null && childNodes.getLength() > 0) {
                                int length2 = childNodes.getLength();
                                for (int i27 = i18; i27 < length2; i27++) {
                                    org.w3c.dom.Node item2 = childNodes.item(i27);
                                    if (item2 instanceof org.w3c.dom.Element) {
                                        str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.c(item2);
                                        break;
                                    }
                                }
                            }
                            str2 = null;
                            try {
                                r45.gp0 c18 = bt3.h2.c(c17.trim().startsWith("<dataitem") ? com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(c17, "dataitem", null) : null, str2, i19);
                                if (c18.I == 1 && (str3 = c18.f456941f) != null) {
                                    c18.m0(str3.replaceAll("\u202e", ""));
                                }
                                linkedList.add(c18);
                                i17 = 0;
                            } catch (java.lang.Exception e17) {
                                i17 = 0;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgLogic", "get record msg data from xml error: %s", e17.getMessage());
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RecordMsgLogic", e17, "", new java.lang.Object[0]);
                                linkedList.clear();
                            }
                        } else {
                            i17 = i18;
                        }
                        i19++;
                        i18 = i17;
                    }
                }
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgLogic", "[parser] parseXML exception:%s", e18.toString());
        }
        ((lt0.f) jVar).put(java.lang.Integer.valueOf(hashCode), ul5Var2);
        return ul5Var2;
    }

    public static java.lang.String B() {
        return com.p314xaae8f345.mm.vfs.q7.c("record") + "/";
    }

    public static java.lang.String C(java.lang.String str, long j17) {
        java.lang.String B = B();
        java.lang.String D = D(str, j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(B() + "record2/");
        sb6.append(D);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(java.lang.String.format("%s/%d/", sb7, java.lang.Long.valueOf(j17)));
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
            return sb7;
        }
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(java.lang.String.format("%s/%d/", B, java.lang.Long.valueOf(j17)));
        java.lang.String str3 = a18.f294812f;
        if (str3 != null) {
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l18)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a18, null);
        return m18.a() ? m18.f294799a.F(m18.f294800b) : false ? B : sb7;
    }

    public static java.lang.String D(java.lang.String str, long j17) {
        return "sub" + (j17 / 50000);
    }

    public static void E(q45.c cVar, r45.gp0 gp0Var, int i17) {
        java.lang.String str = gp0Var.X;
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            cVar.f441664f = str;
        } else {
            cVar.f441665g = i17;
        }
    }

    public static java.lang.String F(java.lang.String str) {
        return str + "_t";
    }

    public static java.lang.String G(java.lang.String str, java.lang.String str2, long j17, long j18, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        java.lang.String w17 = w(F(str), i17);
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(q(str2, j17, true), w17).o();
        java.lang.String pj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).pj(bm5.y.b(str2, j17, j18, 0L, "", bm5.v.f104280m, bm5.f0.f104097i), w17, o17);
        com.p314xaae8f345.mm.vfs.q7.g(pj6, -1L, 3, false);
        return pj6;
    }

    public static java.lang.String H(r45.gp0 gp0Var, java.lang.String str, long j17, int i17) {
        return gp0Var == null ? "" : G(gp0Var.T, str, j17, 0L, i17);
    }

    public static boolean I(java.lang.String str, long j17, boolean z17, java.lang.String str2) {
        if (!c01.e2.O(str)) {
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5887xfade37b c5887xfade37b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5887xfade37b();
        am.dq dqVar = c5887xfade37b.f136195g;
        dqVar.f88021a = j17;
        dqVar.f88022b = z17;
        if (str2 == null) {
            str2 = "";
        }
        dqVar.f88023c = str2;
        c5887xfade37b.e();
        return true;
    }

    public static boolean J(java.util.List list, boolean z17) {
        java.util.Iterator it = list.iterator();
        boolean z18 = false;
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            int i17 = gp0Var.I;
            if (z17 && i17 == 17) {
                r45.ul5 A = A(gp0Var.Z1);
                if (A != null && (z18 = J(A.f468998f, z17))) {
                    return z18;
                }
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456967s) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456945h) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456944g2) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456938d2)) {
                return true;
            }
        }
        return z18;
    }

    public static boolean K(r45.gp0 gp0Var, java.lang.String str, long j17) {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(t(gp0Var, str, j17, 1));
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            return m17.f294799a.F(m17.f294800b);
        }
        return false;
    }

    public static java.util.List L(long j17, java.lang.String str, r45.bq0 bq0Var) {
        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
        if (bq0Var != null) {
            java.util.Iterator it = bq0Var.f452497f.iterator();
            while (it.hasNext()) {
                r45.gp0 gp0Var = (r45.gp0) it.next();
                if (gp0Var.R > 26214400) {
                    wy.g gVar = new wy.g();
                    java.lang.String str2 = gp0Var.V;
                    java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str2);
                    gVar.f532132f = str2;
                    gVar.f532133g = str;
                    gVar.f532131e = gp0Var.R;
                    gVar.f532130d = gp0Var.K;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.M)) {
                        p17 = gp0Var.M;
                    }
                    gVar.f532127a = p17;
                    gVar.f532128b = gp0Var.f456971u;
                    gVar.f532129c = gp0Var.f456937d;
                    synchronizedList.add(gVar);
                }
            }
        }
        return synchronizedList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    public static int M(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        java.lang.String str3;
        java.lang.String str4;
        int i17 = -1;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "send record msg error, touser is null");
            return -1;
        }
        if (f9Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.j())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "send record msg error, msginfo error");
            return -1;
        }
        ?? r132 = 1;
        if (1 == f9Var.P0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "send record msg error, msginfo is sending");
            return -1;
        }
        java.util.Iterator it = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str.split(",")).iterator();
        while (it.hasNext()) {
            java.lang.String str5 = (java.lang.String) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgLogic", "send recordMsg, toUser[%s] msgId[%d], msgType[%d]", str5, java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Integer.valueOf(f9Var.P0()));
            java.lang.String g17 = bt3.x2.g(3, str5, r132, c01.w9.u(f9Var.j()));
            ot0.q v17 = ot0.q.v(g17);
            if (v17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "send record msg error, parse appmsg error");
                return i17;
            }
            r45.ul5 A = A(v17.f430196h0);
            if (A == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "send record msg error, parse record data error");
                return i17;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            java.lang.String mj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), r132);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mj6) && com.p314xaae8f345.mm.vfs.w6.j(mj6)) {
                byte[] x17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(mj6);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.h(x17)) {
                    x17 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).bj(x17, r132);
                }
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                java.lang.String J0 = m11.b1.Di().J0(f9Var2, x17);
                fp.k.c();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J0)) {
                    f9Var2.i1(J0);
                }
            }
            f9Var2.d1(g17);
            f9Var2.u3(c01.ia.o(c01.ia.v(f9Var.G)));
            f9Var2.r1(r132);
            f9Var2.u1(str5);
            f9Var2.e1(c01.w9.o(str5));
            f9Var2.j1(r132);
            f9Var2.m124850x7650bebc(49);
            c01.h7 h7Var = new c01.h7();
            h7Var.f118760b = f9Var.m124847x74d37ac6();
            h7Var.f118762d = f9Var.Q0();
            ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).Di(f9Var2, h7Var);
            long M9 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var2);
            fp.k.c();
            if (M9 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgLogic", fp.k.c() + "insert msg failed :" + M9);
                return 0 - fp.k.a();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgLogic", fp.k.a() + " new msg inserted to db , local id = " + M9);
            f9Var2.m124849x5361953a(M9);
            j(str5, java.lang.Long.valueOf(M9));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6192x4fa59aa4 c6192x4fa59aa4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6192x4fa59aa4();
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            am.vz vzVar = c6192x4fa59aa4.f136449g;
            vzVar.f89761a = m124847x74d37ac6;
            vzVar.f89763c = f9Var.Q0();
            vzVar.f89762b = M9;
            vzVar.f89764d = str5;
            c6192x4fa59aa4.e();
            ot0.t tVar = new ot0.t();
            tVar.f67771x4b6e9352 = f9Var2.j();
            tVar.f67769x29dd02d3 = v17.f430187f;
            tVar.f67770x2262335f = v17.f430199i;
            tVar.f67764x4f4dc37 = v17.f430191g;
            tVar.f67765x297eb4f7 = M9;
            tVar.f67763x28d45f97 = v17.f430179d;
            tVar.f67767x436b2035 = f9Var2.Q0();
            tVar.f67766xd09be28e = f9Var2.I0();
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).D0(tVar);
            java.util.LinkedList linkedList = A.f468998f;
            if (J(linkedList, z17)) {
                r45.bq0 bq0Var = new r45.bq0();
                bq0Var.f452497f.addAll(linkedList);
                java.util.List L = L(M9, str5, bq0Var);
                if (L.size() <= 0 || !((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).bj()) {
                    str4 = str5;
                    e(M9, f9Var.Q0(), f9Var.m124847x74d37ac6(), str4, v17, A, bq0Var, z17);
                } else {
                    com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
                    wy.e eVar = (wy.e) i95.n0.c(wy.e.class);
                    str4 = str5;
                    bt3.e2 e2Var = new bt3.e2(M9, f9Var, str5, v17, A, bq0Var, z17, f9Var2);
                    ((vy.a) eVar).getClass();
                    d17.g(new g35.a(L, e2Var));
                }
                str3 = str4;
            } else {
                ((bt3.x1) ((zs3.v) i95.n0.c(zs3.v.class))).getClass();
                str3 = str5;
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ni().b(str3, M9);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                ((dk5.s5) tg3.t1.a()).fj(str3, str2, c01.e2.C(str3), 0);
            }
            i17 = -1;
            r132 = 1;
        }
        return 0;
    }

    public static java.lang.String N(java.lang.String str, java.lang.String str2, java.lang.String str3, r45.bq0 bq0Var, java.util.List list) {
        s15.w wVar = new s15.w();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        int i17 = wVar.f384956d;
        wVar.set(i17 + 0, str);
        if (str2 == null) {
            str2 = "";
        }
        wVar.set(i17 + 1, str2);
        wVar.p(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        boolean z18 = false;
        if (list.size() > 0 && com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.f((r45.gp0) list.get(0))) {
            z18 = true;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            if (gp0Var.I != 3 || z18) {
                wVar.j().add(bt3.x2.e(gp0Var));
            } else {
                s15.h e17 = bt3.x2.e(gp0Var);
                int i18 = e17.f384955d;
                e17.set(i18 + 2, 1);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
                long j17 = gp0Var.f456981y;
                ((bv.p0) h1Var).getClass();
                e17.set(i18 + 1, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.huk, java.lang.Integer.valueOf((int) w21.x0.m(j17))));
                e17.set(i18 + 0, "");
                wVar.j().add(e17);
            }
        }
        if (bq0Var.G != null) {
            wVar.n(bq0Var.A);
            java.lang.String str4 = bq0Var.G.f467425e;
            if (str4 == null) {
                str4 = "";
            }
            wVar.o(str4);
            s15.a0 a0Var = new s15.a0();
            java.lang.String str5 = bq0Var.G.f467424d;
            if (str5 == null) {
                str5 = "";
            }
            a0Var.j(str5);
            java.lang.String str6 = bq0Var.G.f467425e;
            a0Var.k(str6 != null ? str6 : "");
            wVar.q(a0Var);
        }
        return wVar.m126747x696739c();
    }

    public static boolean O(r45.gp0 gp0Var, java.lang.String str, long j17, boolean z17) {
        if (gp0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "try download data fail, dataitem is null");
            return false;
        }
        java.lang.String str2 = gp0Var.T;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgLogic", "tryDownloadData dataId:".concat(str2));
        java.lang.String y17 = y(gp0Var.T, str, j17, true);
        com.p314xaae8f345.mm.p947xba6de98f.d1 d1Var = new com.p314xaae8f345.mm.p947xba6de98f.d1();
        d1Var.f152438a = gp0Var.f456971u;
        d1Var.f152439b = gp0Var.f456967s;
        d1Var.f152440c = gp0Var.T;
        d1Var.f152441d = y17;
        d1Var.f152443f = gp0Var.R;
        d1Var.f152444g = new java.util.Random().nextInt(2147483645) + 1;
        d1Var.f152445h = t(gp0Var, str, j17, 1);
        d1Var.f152446i = r(gp0Var.I, gp0Var.R);
        d1Var.f152447j = false;
        d1Var.f152448k = gp0Var.f456940e2;
        d1Var.f152449l = gp0Var.f456942f2;
        d1Var.f152450m = gp0Var.f456944g2;
        d1Var.f152451n = gp0Var.M;
        d1Var.f152452o = j17;
        if (gp0Var.R > 1073741824) {
            d1Var.f152453p = 3000000L;
        }
        ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).Ai(d1Var);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6278x2b7b667d c6278x2b7b667d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6278x2b7b667d();
        am.v20 v20Var = c6278x2b7b667d.f136527g;
        v20Var.f89700a = j17;
        v20Var.f89701b = str;
        c6278x2b7b667d.e();
        return true;
    }

    public static boolean P(r45.gp0 gp0Var, java.lang.String str, long j17, boolean z17) {
        if (gp0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "try download thumb error, dataitem is null");
            return false;
        }
        java.lang.String F = F(gp0Var.T);
        java.lang.String y17 = y(F, str, j17, true);
        com.p314xaae8f345.mm.p947xba6de98f.d1 d1Var = new com.p314xaae8f345.mm.p947xba6de98f.d1();
        d1Var.f152440c = F;
        d1Var.f152441d = y17;
        d1Var.f152438a = gp0Var.f456953m;
        d1Var.f152439b = gp0Var.f456945h;
        d1Var.f152443f = gp0Var.f456951l1;
        d1Var.f152451n = gp0Var.Z;
        d1Var.f152444g = new java.util.Random().nextInt(2147483645) + 1;
        d1Var.f152445h = H(gp0Var, str, j17, 1);
        d1Var.f152446i = 1;
        d1Var.f152447j = true;
        d1Var.f152448k = gp0Var.f456940e2;
        d1Var.f152449l = gp0Var.f456942f2;
        d1Var.f152450m = gp0Var.f456944g2;
        d1Var.f152452o = j17;
        ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).Ai(d1Var);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6278x2b7b667d c6278x2b7b667d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6278x2b7b667d();
        am.v20 v20Var = c6278x2b7b667d.f136527g;
        v20Var.f89700a = j17;
        v20Var.f89701b = str;
        c6278x2b7b667d.e();
        return true;
    }

    public static void a(long j17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String str;
        r45.bq0 bq0Var;
        ot0.q v17 = ot0.q.v(f9Var.j());
        bt3.b0 x17 = x(v17);
        if (x17 != null) {
            str = x17.f105738a;
            bq0Var = x17.f105740c;
        } else {
            str = "";
            bq0Var = null;
        }
        if (bq0Var == null) {
            f9Var.r1(5);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, f9Var, true);
        } else {
            f9Var.d1(g(v17.f430187f, str, bq0Var));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, f9Var, true);
        }
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.e1(c01.w9.o(str));
        f9Var.u1(str);
        f9Var.d1(str2);
        f9Var.m124850x7650bebc(10000);
        f9Var.r1(6);
        f9Var.j1(0);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
    }

    public static void c(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, r45.bq0 bq0Var) {
        zs3.b0 b0Var = new zs3.b0();
        b0Var.f68498x297eb4f7 = j17;
        b0Var.f68502x29dd02d3 = str;
        b0Var.f68495x225aa2b6 = str2;
        b0Var.f68503x1209e7cb = str3;
        b0Var.f68494x84214f59 = bq0Var;
        b0Var.f68504x2262335f = 3;
        b0Var.f68497x88be67a1 = new java.util.Random().nextInt(2147483645) + 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgLogic", "summerrecord Download RecordMsgStorage insert ret:%b, id:%d, localid:%d", java.lang.Boolean.valueOf(((bt3.c2) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).fj()).mo880xb970c2b9(b0Var)), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(b0Var.f68497x88be67a1));
        ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).cj().f(b0Var, false);
    }

    public static void d(int i17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, r45.bq0 bq0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgLogic", "buildFavRecordMsgAndSend, favScene: " + i17 + ", msgId: " + j17);
        zs3.b0 b0Var = new zs3.b0();
        b0Var.f68498x297eb4f7 = j17;
        b0Var.f68502x29dd02d3 = str;
        b0Var.f68495x225aa2b6 = str2;
        b0Var.f68503x1209e7cb = str3;
        b0Var.f68494x84214f59 = bq0Var;
        if (i17 != 10) {
            b0Var.f68504x2262335f = 1;
        } else {
            b0Var.f68504x2262335f = 2;
        }
        b0Var.f68497x88be67a1 = new java.util.Random().nextInt(2147483645) + 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgLogic", "summerrecord Fav RecordMsgStorage insert ret:%b, id:%d, localid:%d", java.lang.Boolean.valueOf(((bt3.c2) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).fj()).mo880xb970c2b9(b0Var)), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(b0Var.f68497x88be67a1));
        ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).cj().f(b0Var, false);
    }

    public static void e(long j17, java.lang.String str, long j18, java.lang.String str2, ot0.q qVar, r45.ul5 ul5Var, r45.bq0 bq0Var, boolean z17) {
        zs3.b0 b0Var = new zs3.b0();
        b0Var.f68498x297eb4f7 = j17;
        b0Var.f68499x6e8b9edb = j18;
        b0Var.f68500x2687819 = str;
        b0Var.f68503x1209e7cb = str2;
        b0Var.f68502x29dd02d3 = qVar.f430187f;
        java.lang.String str3 = ul5Var.f468997e;
        java.lang.String str4 = qVar.f430191g;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str3 == null) {
            str3 = str4;
        }
        b0Var.f68495x225aa2b6 = str3;
        b0Var.f68494x84214f59 = bq0Var;
        b0Var.f68504x2262335f = 0;
        b0Var.f68496x3474bf20 = ul5Var.f468999g;
        b0Var.f68497x88be67a1 = new java.util.Random().nextInt(2147483645) + 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgLogic", "summerrecord Normal RecordMsgStorage insert ret:%b, id:%d, oriMsgId:%d localid:%d", java.lang.Boolean.valueOf(((bt3.c2) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).fj()).mo880xb970c2b9(b0Var)), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(b0Var.f68497x88be67a1));
        ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).cj().f(b0Var, z17);
    }

    public static ot0.q f(java.lang.String str, java.lang.String str2, r45.bq0 bq0Var) {
        java.util.LinkedList linkedList = bq0Var.f452497f;
        ot0.q qVar = new ot0.q();
        qVar.f430187f = str;
        if (str2 != null && str2.length() > 200) {
            str2 = str2.substring(0, 200);
        }
        qVar.f430191g = str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList) || !com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.f((r45.gp0) linkedList.get(0))) {
            qVar.f430199i = 19;
            qVar.f430207k = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/favorite_record__w_unsupport&from=singlemessage&isappinstalled=0";
        } else {
            qVar.f430199i = 24;
            qVar.f430207k = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/common_page__upgrade&btn_text=btn_text_0&text=text008";
        }
        qVar.f430195h = "view";
        qVar.f430196h0 = N(str, str2, c01.z1.r(), bq0Var, linkedList);
        return qVar;
    }

    public static java.lang.String g(java.lang.String str, java.lang.String str2, r45.bq0 bq0Var) {
        return h(str, str2, bq0Var, "", 0L, "");
    }

    public static java.lang.String h(java.lang.String str, java.lang.String str2, r45.bq0 bq0Var, java.lang.String str3, long j17, java.lang.String str4) {
        java.util.LinkedList linkedList;
        if (bq0Var == null || (linkedList = bq0Var.f452497f) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgLogic", "buildRecordAppMsgXML error: protoItem or datalist is null");
            return "";
        }
        ot0.q qVar = new ot0.q();
        qVar.f430187f = str;
        if (str2 != null && str2.length() > 200) {
            str2 = str2.substring(0, 200);
        }
        qVar.f430191g = str2;
        if (linkedList.size() <= 0 || !com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.f((r45.gp0) linkedList.get(0))) {
            qVar.f430199i = 19;
            qVar.f430207k = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/favorite_record__w_unsupport&from=singlemessage&isappinstalled=0";
        } else {
            qVar.f430199i = 24;
            qVar.f430207k = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/common_page__upgrade&btn_text=btn_text_0&text=text008";
        }
        qVar.f430195h = "view";
        qVar.f430196h0 = N(str, str2, str3, bq0Var, linkedList);
        ot0.t y07 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).y0(str4, j17);
        if (y07 != null) {
            qVar.f430179d = y07.f67763x28d45f97;
        }
        return bt3.x2.f(qVar).m126747x696739c();
    }

    public static java.lang.String i(r45.ul5 ul5Var, java.lang.String str) {
        java.util.LinkedList linkedList;
        if (ul5Var == null || (linkedList = ul5Var.f468998f) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgLogic", "buildRecordInfoXML error: msgData or msgData.items is null");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            return str == null ? "" : str;
        }
        r45.bq0 bq0Var = new r45.bq0();
        bq0Var.l(ul5Var.f469000h);
        bq0Var.g(ul5Var.f469001i);
        return N(ul5Var.f468996d, ul5Var.f468997e, ul5Var.f468999g, bq0Var, linkedList);
    }

    public static void j(java.lang.String str, java.lang.Long l17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a c6194x6522023a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a();
        long longValue = l17.longValue();
        am.xz xzVar = c6194x6522023a.f136451g;
        xzVar.f89942a = longValue;
        xzVar.f89943b = 0;
        xzVar.f89944c = str;
        c6194x6522023a.e();
    }

    public static boolean k(r45.gp0 gp0Var, java.lang.String str, long j17) {
        if (gp0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "checkDataOutOfDate fail, dataitem is null");
            return true;
        }
        zs3.y D0 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(y(gp0Var.T, str, j17, true));
        if (D0 == null || 4 != D0.f68328x10a0fed7) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "checkDataOutOfDate ok, status err, code %d", java.lang.Integer.valueOf(D0.f68320x1c571ead));
        return true;
    }

    public static com.p314xaae8f345.mm.vfs.r6 l(java.lang.String str, long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f27 = pt0.f0.f2(str, j17);
        long I0 = f27 != null ? f27.I0() : 0L;
        long mo78012x3fdd41df = f27 != null ? f27.mo78012x3fdd41df() : 0L;
        bm5.v vVar = bm5.v.f104280m;
        bm5.f0 f0Var = bm5.f0.f104107v;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(bm5.z.e(bm5.y.b(str, j17, I0, mo78012x3fdd41df, "", vVar, f0Var)));
        if (r6Var.m()) {
            return r6Var;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(bm5.z.a(bm5.y.b(str, j17, f27 != null ? f27.I0() : 0L, f27 != null ? f27.mo78012x3fdd41df() : 0L, "", vVar, f0Var), false, false));
        return r6Var2.m() ? r6Var2 : q(str, j17, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.g(r1.u(), true) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(java.lang.String r1, long r2) {
        /*
            com.tencent.mm.vfs.r6 r1 = l(r1, r2)
            boolean r2 = r1.m()
            if (r2 == 0) goto L16
            java.lang.String r3 = r1.u()
            r0 = 1
            boolean r3 = com.p314xaae8f345.mm.vfs.w6.g(r3, r0)
            if (r3 == 0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            java.lang.String r1 = r1.o()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3, r2}
            java.lang.String r2 = "MicroMsg.RecordMsgLogic"
            java.lang.String r3 = "do clear resource new, path %s, result %B, exists:%B"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.g2.m(java.lang.String, long):void");
    }

    public static r45.gp0 n(java.lang.String str, java.lang.String str2) {
        r45.gp0 n17;
        r45.ul5 A = A(str);
        if (A == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "get record msg data error, empty");
            return null;
        }
        java.util.Iterator it = A.f468998f.iterator();
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            if (gp0Var.T.equals(str2)) {
                return gp0Var;
            }
            if (gp0Var.I == 17 && (n17 = n(gp0Var.Z1, str2)) != null) {
                return n17;
            }
        }
        return null;
    }

    public static r45.ul5 o(java.lang.String str, java.lang.String str2) {
        r45.ul5 o17;
        r45.ul5 A = A(str);
        if (A == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "get record msg data error, empty");
            return null;
        }
        java.util.Iterator it = A.f468998f.iterator();
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            if (gp0Var.T.equals(str2)) {
                return A;
            }
            if (gp0Var.I == 17 && (o17 = o(gp0Var.Z1, str2)) != null) {
                return o17;
            }
        }
        return null;
    }

    public static java.lang.String p(java.lang.String str, int i17) {
        return kk.k.g((str + i17 + java.lang.System.currentTimeMillis()).getBytes());
    }

    public static com.p314xaae8f345.mm.vfs.r6 q(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(java.lang.String.format("%s/%d/", C(str, j17), java.lang.Long.valueOf(j17)));
        if (!z17) {
            return r6Var;
        }
        if (!r6Var.m() || !r6Var.y()) {
            r6Var.J();
        }
        return r6Var;
    }

    public static int r(int i17, long j17) {
        if (2 == i17) {
            return 1;
        }
        if (4 == i17) {
            return 4;
        }
        return j17 > 26214400 ? 7 : 5;
    }

    public static java.lang.String s(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, long j18, int i18) {
        boolean z17;
        java.lang.String absolutePath;
        java.lang.String w17 = w(str, i18);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w17) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || !gm0.j1.a()) {
            return "";
        }
        com.p314xaae8f345.mm.vfs.r6 q17 = q(str4, j17, true);
        if ((i17 == 8 || i17 == 10130) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            q17 = new com.p314xaae8f345.mm.vfs.r6(java.lang.String.format("%s/%d/%d/", C(str4, j17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(str.hashCode() & 255)));
            if (!q17.m() || !q17.y()) {
                q17.J();
            }
            w17 = str2;
            z17 = true;
        } else {
            z17 = false;
        }
        if (str3 != null && !str3.trim().isEmpty() && !z17) {
            w17 = w17 + "." + str3;
        }
        java.io.File file = new java.io.File(w17);
        try {
            absolutePath = file.getCanonicalPath();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RecordMsgLogic", th6, "[-] Fail to get canonical file name.", new java.lang.Object[0]);
            absolutePath = file.getAbsolutePath();
        }
        int lastIndexOf = absolutePath.lastIndexOf(47);
        if (lastIndexOf >= 0) {
            absolutePath = absolutePath.substring(lastIndexOf + 1);
        }
        java.lang.String pj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).pj(bm5.y.b(str4, j17, j18, 0L, "", bm5.v.f104280m, bm5.f0.f104107v), absolutePath, new com.p314xaae8f345.mm.vfs.r6(q17, absolutePath).o());
        com.p314xaae8f345.mm.vfs.q7.g(pj6, -1L, 3, false);
        return pj6;
    }

    public static java.lang.String t(r45.gp0 gp0Var, java.lang.String str, long j17, int i17) {
        return gp0Var == null ? "" : s(gp0Var.T, gp0Var.I, gp0Var.f456937d, gp0Var.K, str, j17, 0L, i17);
    }

    public static q45.c u(android.content.Context context, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73, java.lang.String str) {
        r45.ev2 ev2Var;
        int i17;
        q45.c cVar = new q45.c();
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
        if (r01.z.g(str)) {
            cVar.f441662d = c5303xc75d2f73.f135623g.f87848a.f452505q;
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            cVar.f441662d = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hsy);
        } else {
            java.lang.String l17 = c01.z1.l();
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String b17 = c01.a2.b(str);
            if (l17.equals(b17)) {
                cVar.f441662d = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cc6, l17);
            } else {
                cVar.f441662d = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572741cc5, l17, b17);
            }
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.bq0 bq0Var = c5303xc75d2f73.f135623g.f87848a;
        java.util.Iterator it = (bq0Var != null ? bq0Var.f452497f : new java.util.LinkedList()).iterator();
        boolean z17 = false;
        while (true) {
            java.lang.String str2 = "";
            if (!it.hasNext()) {
                cVar.f441663e = "";
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    str2 = str2 + ((java.lang.String) it6.next());
                }
                java.lang.String trim = str2.trim();
                if (linkedList.size() >= 5) {
                    trim = trim + "...";
                }
                cVar.f441663e = trim;
                return cVar;
            }
            r45.gp0 gp0Var = (r45.gp0) it.next();
            sparseIntArray.put(gp0Var.I, sparseIntArray.get(gp0Var.I) + 1);
            int i18 = gp0Var.I;
            switch (i18) {
                case 1:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + gp0Var.f456941f + "\n");
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572050xd) + "\n");
                    }
                    if (!z17) {
                        E(cVar, gp0Var, ((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).mj());
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (linkedList.size() >= 5) {
                        continue;
                    } else if (gp0Var.f456981y <= 0) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572133zm));
                        break;
                    } else {
                        java.lang.String str3 = gp0Var.K1;
                        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572133zm);
                        cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
                        long j17 = gp0Var.f456981y;
                        ((bv.p0) h1Var).getClass();
                        linkedList.add(java.lang.String.format("%s: %s %s\"\n", str3, string, java.lang.Integer.valueOf((int) w21.x0.m(j17))));
                        break;
                    }
                case 4:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572129zi) + "\n");
                    }
                    if (!z17) {
                        E(cVar, gp0Var, com.p314xaae8f345.mm.R.raw.f78433xb28fb9bc);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572122za) + " " + gp0Var.f456937d + "\n");
                    }
                    if (!z17) {
                        E(cVar, gp0Var, com.p314xaae8f345.mm.R.raw.f78435x7b83bce4);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (linkedList.size() < 5) {
                        r45.pp0 pp0Var = gp0Var.J1.f457887e;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(gp0Var.K1);
                        sb6.append(": ");
                        sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572003vz));
                        sb6.append(" ");
                        sb6.append((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pp0Var.f464807o) || pp0Var.f464807o.equals(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572003vz))) ? pp0Var.f464805m : pp0Var.f464807o);
                        sb6.append("\n");
                        linkedList.add(sb6.toString());
                    }
                    if (!z17) {
                        cVar.f441665g = com.p314xaae8f345.mm.R.raw.f78424x902f66d4;
                        break;
                    } else {
                        break;
                    }
                    break;
                case 7:
                case 29:
                case 32:
                    if (linkedList.size() < 5) {
                        r45.hp0 hp0Var = gp0Var.J1;
                        r45.xs4 xs4Var = hp0Var != null ? hp0Var.C : null;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(gp0Var.K1);
                        sb7.append(": ");
                        sb7.append(il4.l.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, xs4Var != null ? xs4Var.m75939xb282bd08(18) : 0));
                        sb7.append(gp0Var.f456937d);
                        sb7.append("\n");
                        linkedList.add(sb7.toString());
                    }
                    if (!z17) {
                        E(cVar, gp0Var, com.p314xaae8f345.mm.R.raw.f80683x65f07627);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571963uv) + " " + gp0Var.f456937d + "\n");
                    }
                    if (!z17) {
                        E(cVar, gp0Var, ((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).bj());
                        break;
                    } else {
                        break;
                    }
                case 9:
                case 12:
                case 13:
                case 18:
                case 20:
                case 24:
                case 25:
                case 37:
                case 38:
                default:
                    if (i18 <= 10000) {
                        continue;
                    } else if (i18 == 10132 && linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(((ox.g) ((tk.o) i95.n0.c(tk.o.class))).wi() ? com.p314xaae8f345.mm.R.C30867xcad56011.n8y : com.p314xaae8f345.mm.R.C30867xcad56011.v_) + " " + gp0Var.f456941f + "\n");
                        break;
                    }
                    break;
                case 10:
                case 11:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572056xj) + " " + gp0Var.J1.f457889g.f451721d + "\n");
                    }
                    if (!z17) {
                        E(cVar, gp0Var, ((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).bj());
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571542ic) + "\n");
                    }
                    if (!z17) {
                        E(cVar, gp0Var, ((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).bj());
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572129zi) + "\n");
                    }
                    if (!z17) {
                        E(cVar, gp0Var, com.p314xaae8f345.mm.R.raw.f78433xb28fb9bc);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (linkedList.size() < 5) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.y8 D3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D3(gp0Var.f456941f);
                        int i19 = D3.f277907q;
                        java.util.Set set = c01.e2.f118650a;
                        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(i19)) {
                            int i27 = D3.f277910t;
                            if (i27 == 0) {
                                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.v_;
                            } else if (i27 == 1) {
                                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.mxk;
                            }
                            linkedList.add(gp0Var.K1 + ": " + context.getString(i17) + " " + D3.c() + "\n");
                        }
                        i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f571978v9;
                        linkedList.add(gp0Var.K1 + ": " + context.getString(i17) + " " + D3.c() + "\n");
                    }
                    if (!z17) {
                        cVar.f441666h = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D3(gp0Var.f456941f).f277891a;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572068xv) + "\n");
                        break;
                    } else {
                        continue;
                    }
                case 19:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571543id) + " " + gp0Var.f456937d + "\n");
                        break;
                    } else {
                        continue;
                    }
                case 21:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572039x0) + " " + gp0Var.f456941f + "\n");
                        break;
                    } else {
                        continue;
                    }
                case 22:
                case 23:
                case 26:
                case 27:
                case 28:
                case 30:
                case 40:
                case 41:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572122za) + " " + gp0Var.f456937d + "\n");
                        break;
                    } else {
                        continue;
                    }
                case 31:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571979va) + "\n");
                        break;
                    } else {
                        continue;
                    }
                case 33:
                    if (linkedList.size() < 5) {
                        r45.hp0 hp0Var2 = gp0Var.J1;
                        linkedList.add(gp0Var.K1 + ": " + il4.d.p(context, hp0Var2 != null ? hp0Var2.G : null) + gp0Var.f456937d + "\n");
                    }
                    if (!z17) {
                        E(cVar, gp0Var, com.p314xaae8f345.mm.R.raw.f80683x65f07627);
                        break;
                    } else {
                        break;
                    }
                case 34:
                case 39:
                    if (!o72.x1.j0()) {
                        if (linkedList.size() >= 5) {
                            break;
                        } else {
                            linkedList.add(gp0Var.K1 + ": " + gp0Var.f456937d + "\n");
                            break;
                        }
                    } else {
                        continue;
                    }
                case 35:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + gp0Var.f456941f + "\n");
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + gp0Var.f456941f + "\n");
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    if (linkedList.size() < 5) {
                        r45.hp0 hp0Var3 = gp0Var.J1;
                        if (hp0Var3 != null && (ev2Var = hp0Var3.f457885J) != null) {
                            if (ev2Var.m75939xb282bd08(6) != 0) {
                                str2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573509mr5) + ": ";
                            } else if (ev2Var.m75939xb282bd08(5) != 0) {
                                str2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.njj) + ": ";
                            }
                        }
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571965ux) + " " + str2 + gp0Var.f456937d + "\n");
                        break;
                    } else {
                        continue;
                    }
                    break;
            }
            z17 = true;
        }
    }

    public static java.lang.String v(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "get contact null, username %s", str);
            return "";
        }
        java.lang.String g27 = n17.g2();
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(g27)) {
            return g27;
        }
        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
        java.util.List m17 = c01.v1.m(str);
        java.lang.String r17 = c01.z1.r();
        if (m17 == null || m17.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "get members from username error, content empty");
            return g27;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) m17;
        linkedList.remove(r17);
        linkedList.add(0, r17);
        return c01.v1.i(m17, 3, g27);
    }

    public static java.lang.String w(java.lang.String str, int i17) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (i17 == 1) {
            return str;
        }
        return i17 + "_" + str;
    }

    public static final bt3.b0 x(ot0.q qVar) {
        if (qVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "fixMsgContent error, parse appmsg error");
            return null;
        }
        r45.ul5 A = A(qVar.f430196h0);
        if (A == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "fixMsgContent error, parse record data error");
            return null;
        }
        r45.bq0 bq0Var = new r45.bq0();
        bq0Var.f452497f = new java.util.LinkedList();
        bq0Var.l(A.f469000h);
        bq0Var.g(A.f469001i);
        bq0Var.p(A.f468996d);
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571546ih);
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571963uv);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = A.f468998f.iterator();
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            int i17 = gp0Var.I;
            if ((i17 == 8 || i17 == 10130) && gp0Var.R > 26214400) {
                gp0Var.h0(1);
                gp0Var.m0(string);
                arrayList.add(string2 + " " + gp0Var.f456937d);
                gp0Var.O0(null);
                gp0Var.i0(null);
                gp0Var.a0(null);
                gp0Var.b0(null);
                gp0Var.f456975w = 0;
                gp0Var.f456977x = true;
                gp0Var.q0(string.length());
            }
            bq0Var.f452497f.add(gp0Var);
        }
        java.lang.String[] split = A.f468997e.split("\n");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (java.lang.String str : split) {
            java.lang.String[] split2 = str.split(":");
            if (split2.length != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgLogic", "parse str(%s) of desc(%s) fail", str, A.f468997e);
            } else {
                if (arrayList.contains(split2[1])) {
                    stringBuffer.append(split2[0] + ":" + string);
                } else {
                    stringBuffer.append(str);
                }
                stringBuffer.append('\n');
            }
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        java.lang.String substring = stringBuffer2.substring(0, stringBuffer2.length() - 1);
        bq0Var.e(substring);
        return new bt3.b0(substring, A.f468999g, bq0Var);
    }

    public static java.lang.String y(java.lang.String str, java.lang.String str2, long j17, boolean z17) {
        if (z17) {
            return str + "@record_download@" + j17;
        }
        return str + "@record_upload@" + j17;
    }

    public static zs3.y z(com.p314xaae8f345.mm.p947xba6de98f.d1 d1Var) {
        zs3.y yVar = new zs3.y();
        yVar.f68324xaca5bdda = d1Var.f152441d;
        yVar.f68323x88be67a1 = d1Var.f152444g;
        yVar.f68317xf47749d7 = d1Var.f152438a;
        yVar.f68318xf47770e7 = d1Var.f152439b;
        yVar.f68319xf604e54a = d1Var.f152440c;
        yVar.f68330xeb1a61d6 = d1Var.f152443f;
        yVar.f68325x90a9378 = d1Var.f152442e;
        yVar.f68326x2260084a = d1Var.f152445h;
        yVar.f68334x2262335f = 1;
        yVar.f68321xf1ebe47b = d1Var.f152446i;
        yVar.f68322xf00f0c87 = d1Var.f152447j;
        yVar.f68331xffd08a51 = d1Var.f152448k;
        yVar.f68332x159b18b6 = d1Var.f152449l;
        yVar.f68333x9229d684 = d1Var.f152450m;
        return yVar;
    }
}
