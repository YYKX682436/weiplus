package bt3;

/* loaded from: classes9.dex */
public abstract class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.j f24278a = new jt0.j(32);

    public static r45.ul5 A(java.lang.String str) {
        int i17;
        java.lang.String str2;
        java.lang.String str3;
        org.w3c.dom.NodeList childNodes;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgLogic", "xml is null");
            return null;
        }
        int hashCode = str.hashCode();
        kk.j jVar = f24278a;
        r45.ul5 ul5Var = (r45.ul5) ((lt0.f) jVar).get(java.lang.Integer.valueOf(hashCode));
        if (ul5Var != null) {
            return ul5Var;
        }
        java.util.Map d17 = str.trim().contains("<recordinfo>") ? com.tencent.mm.sdk.platformtools.aa.d(str, "recordinfo", null) : com.tencent.mm.sdk.platformtools.aa.d("<recordinfo>" + str + "</recordinfo>", "recordinfo", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgLogic", "values is null: %s", str);
            return null;
        }
        r45.ul5 ul5Var2 = new r45.ul5();
        ul5Var2.f387463d = (java.lang.String) d17.get(".recordinfo.title");
        ul5Var2.f387464e = (java.lang.String) d17.get(".recordinfo.desc");
        ul5Var2.f387466g = (java.lang.String) d17.get(".recordinfo.favusername");
        if (d17.get(".recordinfo.noteinfo") != null) {
            r45.sp0 sp0Var = new r45.sp0();
            sp0Var.f385892e = (java.lang.String) d17.get(".recordinfo.noteinfo.noteeditor");
            sp0Var.f385891d = (java.lang.String) d17.get(".recordinfo.noteinfo.noteauthor");
            ul5Var2.f387467h = sp0Var;
            ul5Var2.f387468i = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".recordinfo.edittime"), 0L);
        }
        java.util.LinkedList linkedList = ul5Var2.f387465f;
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
                        java.lang.String c17 = com.tencent.mm.sdk.platformtools.aa.c(item);
                        if (item instanceof org.w3c.dom.Element) {
                            org.w3c.dom.NodeList elementsByTagName2 = ((org.w3c.dom.Element) item).getElementsByTagName("recordxml");
                            if (elementsByTagName2 != null && elementsByTagName2.getLength() > 0 && (childNodes = elementsByTagName2.item(i18).getChildNodes()) != null && childNodes.getLength() > 0) {
                                int length2 = childNodes.getLength();
                                for (int i27 = i18; i27 < length2; i27++) {
                                    org.w3c.dom.Node item2 = childNodes.item(i27);
                                    if (item2 instanceof org.w3c.dom.Element) {
                                        str2 = com.tencent.mm.sdk.platformtools.aa.c(item2);
                                        break;
                                    }
                                }
                            }
                            str2 = null;
                            try {
                                r45.gp0 c18 = bt3.h2.c(c17.trim().startsWith("<dataitem") ? com.tencent.mm.sdk.platformtools.aa.d(c17, "dataitem", null) : null, str2, i19);
                                if (c18.I == 1 && (str3 = c18.f375408f) != null) {
                                    c18.m0(str3.replaceAll("\u202e", ""));
                                }
                                linkedList.add(c18);
                                i17 = 0;
                            } catch (java.lang.Exception e17) {
                                i17 = 0;
                                com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgLogic", "get record msg data from xml error: %s", e17.getMessage());
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RecordMsgLogic", e17, "", new java.lang.Object[0]);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgLogic", "[parser] parseXML exception:%s", e18.toString());
        }
        ((lt0.f) jVar).put(java.lang.Integer.valueOf(hashCode), ul5Var2);
        return ul5Var2;
    }

    public static java.lang.String B() {
        return com.tencent.mm.vfs.q7.c("record") + "/";
    }

    public static java.lang.String C(java.lang.String str, long j17) {
        java.lang.String B = B();
        java.lang.String D = D(str, j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(B() + "record2/");
        sb6.append(D);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(java.lang.String.format("%s/%d/", sb7, java.lang.Long.valueOf(j17)));
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
            return sb7;
        }
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(java.lang.String.format("%s/%d/", B, java.lang.Long.valueOf(j17)));
        java.lang.String str3 = a18.f213279f;
        if (str3 != null) {
            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l18)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m18 = b3Var.m(a18, null);
        return m18.a() ? m18.f213266a.F(m18.f213267b) : false ? B : sb7;
    }

    public static java.lang.String D(java.lang.String str, long j17) {
        return "sub" + (j17 / 50000);
    }

    public static void E(q45.c cVar, r45.gp0 gp0Var, int i17) {
        java.lang.String str = gp0Var.X;
        if (com.tencent.mm.vfs.w6.j(str)) {
            cVar.f360131f = str;
        } else {
            cVar.f360132g = i17;
        }
    }

    public static java.lang.String F(java.lang.String str) {
        return str + "_t";
    }

    public static java.lang.String G(java.lang.String str, java.lang.String str2, long j17, long j18, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        java.lang.String w17 = w(F(str), i17);
        java.lang.String o17 = new com.tencent.mm.vfs.r6(q(str2, j17, true), w17).o();
        java.lang.String pj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).pj(bm5.y.b(str2, j17, j18, 0L, "", bm5.v.f22747m, bm5.f0.f22564i), w17, o17);
        com.tencent.mm.vfs.q7.g(pj6, -1L, 3, false);
        return pj6;
    }

    public static java.lang.String H(r45.gp0 gp0Var, java.lang.String str, long j17, int i17) {
        return gp0Var == null ? "" : G(gp0Var.T, str, j17, 0L, i17);
    }

    public static boolean I(java.lang.String str, long j17, boolean z17, java.lang.String str2) {
        if (!c01.e2.O(str)) {
            return false;
        }
        com.tencent.mm.autogen.events.RecordMsgNetSceneEvent recordMsgNetSceneEvent = new com.tencent.mm.autogen.events.RecordMsgNetSceneEvent();
        am.dq dqVar = recordMsgNetSceneEvent.f54662g;
        dqVar.f6488a = j17;
        dqVar.f6489b = z17;
        if (str2 == null) {
            str2 = "";
        }
        dqVar.f6490c = str2;
        recordMsgNetSceneEvent.e();
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
                if (A != null && (z18 = J(A.f387465f, z17))) {
                    return z18;
                }
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375434s) || !com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375412h) || !com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375411g2) || !com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375405d2)) {
                return true;
            }
        }
        return z18;
    }

    public static boolean K(r45.gp0 gp0Var, java.lang.String str, long j17) {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(t(gp0Var, str, j17, 1));
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            return m17.f213266a.F(m17.f213267b);
        }
        return false;
    }

    public static java.util.List L(long j17, java.lang.String str, r45.bq0 bq0Var) {
        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
        if (bq0Var != null) {
            java.util.Iterator it = bq0Var.f370964f.iterator();
            while (it.hasNext()) {
                r45.gp0 gp0Var = (r45.gp0) it.next();
                if (gp0Var.R > 26214400) {
                    wy.g gVar = new wy.g();
                    java.lang.String str2 = gp0Var.V;
                    java.lang.String p17 = com.tencent.mm.vfs.w6.p(str2);
                    gVar.f450599f = str2;
                    gVar.f450600g = str;
                    gVar.f450598e = gp0Var.R;
                    gVar.f450597d = gp0Var.K;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.M)) {
                        p17 = gp0Var.M;
                    }
                    gVar.f450594a = p17;
                    gVar.f450595b = gp0Var.f375438u;
                    gVar.f450596c = gp0Var.f375404d;
                    synchronizedList.add(gVar);
                }
            }
        }
        return synchronizedList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v2 */
    public static int M(java.lang.String str, java.lang.String str2, com.tencent.mm.storage.f9 f9Var, boolean z17) {
        java.lang.String str3;
        java.lang.String str4;
        int i17 = -1;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "send record msg error, touser is null");
            return -1;
        }
        if (f9Var == null || com.tencent.mm.sdk.platformtools.t8.K0(f9Var.j())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "send record msg error, msginfo error");
            return -1;
        }
        ?? r132 = 1;
        if (1 == f9Var.P0()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "send record msg error, msginfo is sending");
            return -1;
        }
        java.util.Iterator it = com.tencent.mm.sdk.platformtools.t8.P1(str.split(",")).iterator();
        while (it.hasNext()) {
            java.lang.String str5 = (java.lang.String) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgLogic", "send recordMsg, toUser[%s] msgId[%d], msgType[%d]", str5, java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Integer.valueOf(f9Var.P0()));
            java.lang.String g17 = bt3.x2.g(3, str5, r132, c01.w9.u(f9Var.j()));
            ot0.q v17 = ot0.q.v(g17);
            if (v17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "send record msg error, parse appmsg error");
                return i17;
            }
            r45.ul5 A = A(v17.f348663h0);
            if (A == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "send record msg error, parse record data error");
                return i17;
            }
            com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
            java.lang.String mj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), r132);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mj6) && com.tencent.mm.vfs.w6.j(mj6)) {
                byte[] x17 = com.tencent.mm.sdk.platformtools.t8.x1(mj6);
                if (com.tencent.mm.sdk.platformtools.y1.h(x17)) {
                    x17 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).bj(x17, r132);
                }
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                java.lang.String J0 = m11.b1.Di().J0(f9Var2, x17);
                fp.k.c();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(J0)) {
                    f9Var2.i1(J0);
                }
            }
            f9Var2.d1(g17);
            f9Var2.u3(c01.ia.o(c01.ia.v(f9Var.G)));
            f9Var2.r1(r132);
            f9Var2.u1(str5);
            f9Var2.e1(c01.w9.o(str5));
            f9Var2.j1(r132);
            f9Var2.setType(49);
            c01.h7 h7Var = new c01.h7();
            h7Var.f37227b = f9Var.getMsgId();
            h7Var.f37229d = f9Var.Q0();
            ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).Di(f9Var2, h7Var);
            long M9 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var2);
            fp.k.c();
            if (M9 < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgLogic", fp.k.c() + "insert msg failed :" + M9);
                return 0 - fp.k.a();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgLogic", fp.k.a() + " new msg inserted to db , local id = " + M9);
            f9Var2.setMsgId(M9);
            j(str5, java.lang.Long.valueOf(M9));
            com.tencent.mm.autogen.events.UpdateFailedMsgIdEvent updateFailedMsgIdEvent = new com.tencent.mm.autogen.events.UpdateFailedMsgIdEvent();
            long msgId = f9Var.getMsgId();
            am.vz vzVar = updateFailedMsgIdEvent.f54916g;
            vzVar.f8228a = msgId;
            vzVar.f8230c = f9Var.Q0();
            vzVar.f8229b = M9;
            vzVar.f8231d = str5;
            updateFailedMsgIdEvent.e();
            ot0.t tVar = new ot0.t();
            tVar.field_xml = f9Var2.j();
            tVar.field_title = v17.f348654f;
            tVar.field_type = v17.f348666i;
            tVar.field_description = v17.f348658g;
            tVar.field_msgId = M9;
            tVar.field_appId = v17.f348646d;
            tVar.field_msgTalker = f9Var2.Q0();
            tVar.field_msgSvrId = f9Var2.I0();
            ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).D0(tVar);
            java.util.LinkedList linkedList = A.f387465f;
            if (J(linkedList, z17)) {
                r45.bq0 bq0Var = new r45.bq0();
                bq0Var.f370964f.addAll(linkedList);
                java.util.List L = L(M9, str5, bq0Var);
                if (L.size() <= 0 || !((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).bj()) {
                    str4 = str5;
                    e(M9, f9Var.Q0(), f9Var.getMsgId(), str4, v17, A, bq0Var, z17);
                } else {
                    com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
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
                com.tencent.mm.pluginsdk.model.app.u5.Ni().b(str3, M9);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                ((dk5.s5) tg3.t1.a()).fj(str3, str2, c01.e2.C(str3), 0);
            }
            i17 = -1;
            r132 = 1;
        }
        return 0;
    }

    public static java.lang.String N(java.lang.String str, java.lang.String str2, java.lang.String str3, r45.bq0 bq0Var, java.util.List list) {
        s15.w wVar = new s15.w();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        int i17 = wVar.f303423d;
        wVar.set(i17 + 0, str);
        if (str2 == null) {
            str2 = "";
        }
        wVar.set(i17 + 1, str2);
        wVar.p(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        boolean z18 = false;
        if (list.size() > 0 && com.tencent.mm.plugin.fav.ui.x5.f((r45.gp0) list.get(0))) {
            z18 = true;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            if (gp0Var.I != 3 || z18) {
                wVar.j().add(bt3.x2.e(gp0Var));
            } else {
                s15.h e17 = bt3.x2.e(gp0Var);
                int i18 = e17.f303422d;
                e17.set(i18 + 2, 1);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
                long j17 = gp0Var.f375448y;
                ((bv.p0) h1Var).getClass();
                e17.set(i18 + 1, context.getString(com.tencent.mm.R.string.huk, java.lang.Integer.valueOf((int) w21.x0.m(j17))));
                e17.set(i18 + 0, "");
                wVar.j().add(e17);
            }
        }
        if (bq0Var.G != null) {
            wVar.n(bq0Var.A);
            java.lang.String str4 = bq0Var.G.f385892e;
            if (str4 == null) {
                str4 = "";
            }
            wVar.o(str4);
            s15.a0 a0Var = new s15.a0();
            java.lang.String str5 = bq0Var.G.f385891d;
            if (str5 == null) {
                str5 = "";
            }
            a0Var.j(str5);
            java.lang.String str6 = bq0Var.G.f385892e;
            a0Var.k(str6 != null ? str6 : "");
            wVar.q(a0Var);
        }
        return wVar.toXml();
    }

    public static boolean O(r45.gp0 gp0Var, java.lang.String str, long j17, boolean z17) {
        if (gp0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "try download data fail, dataitem is null");
            return false;
        }
        java.lang.String str2 = gp0Var.T;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgLogic", "tryDownloadData dataId:".concat(str2));
        java.lang.String y17 = y(gp0Var.T, str, j17, true);
        com.tencent.mm.modelcdntran.d1 d1Var = new com.tencent.mm.modelcdntran.d1();
        d1Var.f70905a = gp0Var.f375438u;
        d1Var.f70906b = gp0Var.f375434s;
        d1Var.f70907c = gp0Var.T;
        d1Var.f70908d = y17;
        d1Var.f70910f = gp0Var.R;
        d1Var.f70911g = new java.util.Random().nextInt(2147483645) + 1;
        d1Var.f70912h = t(gp0Var, str, j17, 1);
        d1Var.f70913i = r(gp0Var.I, gp0Var.R);
        d1Var.f70914j = false;
        d1Var.f70915k = gp0Var.f375407e2;
        d1Var.f70916l = gp0Var.f375409f2;
        d1Var.f70917m = gp0Var.f375411g2;
        d1Var.f70918n = gp0Var.M;
        d1Var.f70919o = j17;
        if (gp0Var.R > 1073741824) {
            d1Var.f70920p = 3000000L;
        }
        ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).Ai(d1Var);
        com.tencent.mm.autogen.events.WxFileIndexDirtyEvent wxFileIndexDirtyEvent = new com.tencent.mm.autogen.events.WxFileIndexDirtyEvent();
        am.v20 v20Var = wxFileIndexDirtyEvent.f54994g;
        v20Var.f8167a = j17;
        v20Var.f8168b = str;
        wxFileIndexDirtyEvent.e();
        return true;
    }

    public static boolean P(r45.gp0 gp0Var, java.lang.String str, long j17, boolean z17) {
        if (gp0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "try download thumb error, dataitem is null");
            return false;
        }
        java.lang.String F = F(gp0Var.T);
        java.lang.String y17 = y(F, str, j17, true);
        com.tencent.mm.modelcdntran.d1 d1Var = new com.tencent.mm.modelcdntran.d1();
        d1Var.f70907c = F;
        d1Var.f70908d = y17;
        d1Var.f70905a = gp0Var.f375420m;
        d1Var.f70906b = gp0Var.f375412h;
        d1Var.f70910f = gp0Var.f375418l1;
        d1Var.f70918n = gp0Var.Z;
        d1Var.f70911g = new java.util.Random().nextInt(2147483645) + 1;
        d1Var.f70912h = H(gp0Var, str, j17, 1);
        d1Var.f70913i = 1;
        d1Var.f70914j = true;
        d1Var.f70915k = gp0Var.f375407e2;
        d1Var.f70916l = gp0Var.f375409f2;
        d1Var.f70917m = gp0Var.f375411g2;
        d1Var.f70919o = j17;
        ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).Ai(d1Var);
        com.tencent.mm.autogen.events.WxFileIndexDirtyEvent wxFileIndexDirtyEvent = new com.tencent.mm.autogen.events.WxFileIndexDirtyEvent();
        am.v20 v20Var = wxFileIndexDirtyEvent.f54994g;
        v20Var.f8167a = j17;
        v20Var.f8168b = str;
        wxFileIndexDirtyEvent.e();
        return true;
    }

    public static void a(long j17, com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str;
        r45.bq0 bq0Var;
        ot0.q v17 = ot0.q.v(f9Var.j());
        bt3.b0 x17 = x(v17);
        if (x17 != null) {
            str = x17.f24205a;
            bq0Var = x17.f24207c;
        } else {
            str = "";
            bq0Var = null;
        }
        if (bq0Var == null) {
            f9Var.r1(5);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, f9Var, true);
        } else {
            f9Var.d1(g(v17.f348654f, str, bq0Var));
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, f9Var, true);
        }
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.e1(c01.w9.o(str));
        f9Var.u1(str);
        f9Var.d1(str2);
        f9Var.setType(10000);
        f9Var.r1(6);
        f9Var.j1(0);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
    }

    public static void c(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, r45.bq0 bq0Var) {
        zs3.b0 b0Var = new zs3.b0();
        b0Var.field_msgId = j17;
        b0Var.field_title = str;
        b0Var.field_desc = str2;
        b0Var.field_toUser = str3;
        b0Var.field_dataProto = bq0Var;
        b0Var.field_type = 3;
        b0Var.field_localId = new java.util.Random().nextInt(2147483645) + 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgLogic", "summerrecord Download RecordMsgStorage insert ret:%b, id:%d, localid:%d", java.lang.Boolean.valueOf(((bt3.c2) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).fj()).insert(b0Var)), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(b0Var.field_localId));
        ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).cj().f(b0Var, false);
    }

    public static void d(int i17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, r45.bq0 bq0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgLogic", "buildFavRecordMsgAndSend, favScene: " + i17 + ", msgId: " + j17);
        zs3.b0 b0Var = new zs3.b0();
        b0Var.field_msgId = j17;
        b0Var.field_title = str;
        b0Var.field_desc = str2;
        b0Var.field_toUser = str3;
        b0Var.field_dataProto = bq0Var;
        if (i17 != 10) {
            b0Var.field_type = 1;
        } else {
            b0Var.field_type = 2;
        }
        b0Var.field_localId = new java.util.Random().nextInt(2147483645) + 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgLogic", "summerrecord Fav RecordMsgStorage insert ret:%b, id:%d, localid:%d", java.lang.Boolean.valueOf(((bt3.c2) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).fj()).insert(b0Var)), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(b0Var.field_localId));
        ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).cj().f(b0Var, false);
    }

    public static void e(long j17, java.lang.String str, long j18, java.lang.String str2, ot0.q qVar, r45.ul5 ul5Var, r45.bq0 bq0Var, boolean z17) {
        zs3.b0 b0Var = new zs3.b0();
        b0Var.field_msgId = j17;
        b0Var.field_oriMsgId = j18;
        b0Var.field_oriMsgTalker = str;
        b0Var.field_toUser = str2;
        b0Var.field_title = qVar.f348654f;
        java.lang.String str3 = ul5Var.f387464e;
        java.lang.String str4 = qVar.f348658g;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str3 == null) {
            str3 = str4;
        }
        b0Var.field_desc = str3;
        b0Var.field_dataProto = bq0Var;
        b0Var.field_type = 0;
        b0Var.field_favFrom = ul5Var.f387466g;
        b0Var.field_localId = new java.util.Random().nextInt(2147483645) + 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgLogic", "summerrecord Normal RecordMsgStorage insert ret:%b, id:%d, oriMsgId:%d localid:%d", java.lang.Boolean.valueOf(((bt3.c2) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).fj()).insert(b0Var)), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(b0Var.field_localId));
        ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).cj().f(b0Var, z17);
    }

    public static ot0.q f(java.lang.String str, java.lang.String str2, r45.bq0 bq0Var) {
        java.util.LinkedList linkedList = bq0Var.f370964f;
        ot0.q qVar = new ot0.q();
        qVar.f348654f = str;
        if (str2 != null && str2.length() > 200) {
            str2 = str2.substring(0, 200);
        }
        qVar.f348658g = str2;
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList) || !com.tencent.mm.plugin.fav.ui.x5.f((r45.gp0) linkedList.get(0))) {
            qVar.f348666i = 19;
            qVar.f348674k = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/favorite_record__w_unsupport&from=singlemessage&isappinstalled=0";
        } else {
            qVar.f348666i = 24;
            qVar.f348674k = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/common_page__upgrade&btn_text=btn_text_0&text=text008";
        }
        qVar.f348662h = "view";
        qVar.f348663h0 = N(str, str2, c01.z1.r(), bq0Var, linkedList);
        return qVar;
    }

    public static java.lang.String g(java.lang.String str, java.lang.String str2, r45.bq0 bq0Var) {
        return h(str, str2, bq0Var, "", 0L, "");
    }

    public static java.lang.String h(java.lang.String str, java.lang.String str2, r45.bq0 bq0Var, java.lang.String str3, long j17, java.lang.String str4) {
        java.util.LinkedList linkedList;
        if (bq0Var == null || (linkedList = bq0Var.f370964f) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgLogic", "buildRecordAppMsgXML error: protoItem or datalist is null");
            return "";
        }
        ot0.q qVar = new ot0.q();
        qVar.f348654f = str;
        if (str2 != null && str2.length() > 200) {
            str2 = str2.substring(0, 200);
        }
        qVar.f348658g = str2;
        if (linkedList.size() <= 0 || !com.tencent.mm.plugin.fav.ui.x5.f((r45.gp0) linkedList.get(0))) {
            qVar.f348666i = 19;
            qVar.f348674k = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/favorite_record__w_unsupport&from=singlemessage&isappinstalled=0";
        } else {
            qVar.f348666i = 24;
            qVar.f348674k = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/common_page__upgrade&btn_text=btn_text_0&text=text008";
        }
        qVar.f348662h = "view";
        qVar.f348663h0 = N(str, str2, str3, bq0Var, linkedList);
        ot0.t y07 = ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).y0(str4, j17);
        if (y07 != null) {
            qVar.f348646d = y07.field_appId;
        }
        return bt3.x2.f(qVar).toXml();
    }

    public static java.lang.String i(r45.ul5 ul5Var, java.lang.String str) {
        java.util.LinkedList linkedList;
        if (ul5Var == null || (linkedList = ul5Var.f387465f) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgLogic", "buildRecordInfoXML error: msgData or msgData.items is null");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            return str == null ? "" : str;
        }
        r45.bq0 bq0Var = new r45.bq0();
        bq0Var.l(ul5Var.f387467h);
        bq0Var.g(ul5Var.f387468i);
        return N(ul5Var.f387463d, ul5Var.f387464e, ul5Var.f387466g, bq0Var, linkedList);
    }

    public static void j(java.lang.String str, java.lang.Long l17) {
        com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent updateForwardMsgIdEvent = new com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent();
        long longValue = l17.longValue();
        am.xz xzVar = updateForwardMsgIdEvent.f54918g;
        xzVar.f8409a = longValue;
        xzVar.f8410b = 0;
        xzVar.f8411c = str;
        updateForwardMsgIdEvent.e();
    }

    public static boolean k(r45.gp0 gp0Var, java.lang.String str, long j17) {
        if (gp0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "checkDataOutOfDate fail, dataitem is null");
            return true;
        }
        zs3.y D0 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(y(gp0Var.T, str, j17, true));
        if (D0 == null || 4 != D0.field_status) {
            return false;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "checkDataOutOfDate ok, status err, code %d", java.lang.Integer.valueOf(D0.field_errCode));
        return true;
    }

    public static com.tencent.mm.vfs.r6 l(java.lang.String str, long j17) {
        com.tencent.mm.storage.f9 f27 = pt0.f0.f2(str, j17);
        long I0 = f27 != null ? f27.I0() : 0L;
        long createTime = f27 != null ? f27.getCreateTime() : 0L;
        bm5.v vVar = bm5.v.f22747m;
        bm5.f0 f0Var = bm5.f0.f22574v;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(bm5.z.e(bm5.y.b(str, j17, I0, createTime, "", vVar, f0Var)));
        if (r6Var.m()) {
            return r6Var;
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(bm5.z.a(bm5.y.b(str, j17, f27 != null ? f27.I0() : 0L, f27 != null ? f27.getCreateTime() : 0L, "", vVar, f0Var), false, false));
        return r6Var2.m() ? r6Var2 : q(str, j17, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (com.tencent.mm.vfs.w6.g(r1.u(), true) != false) goto L8;
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
            boolean r3 = com.tencent.mm.vfs.w6.g(r3, r0)
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
            com.tencent.mars.xlog.Log.i(r2, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.g2.m(java.lang.String, long):void");
    }

    public static r45.gp0 n(java.lang.String str, java.lang.String str2) {
        r45.gp0 n17;
        r45.ul5 A = A(str);
        if (A == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "get record msg data error, empty");
            return null;
        }
        java.util.Iterator it = A.f387465f.iterator();
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
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "get record msg data error, empty");
            return null;
        }
        java.util.Iterator it = A.f387465f.iterator();
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

    public static com.tencent.mm.vfs.r6 q(java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(java.lang.String.format("%s/%d/", C(str, j17), java.lang.Long.valueOf(j17)));
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
        if (com.tencent.mm.sdk.platformtools.t8.K0(w17) || !com.tencent.mm.sdk.platformtools.x2.n() || !gm0.j1.a()) {
            return "";
        }
        com.tencent.mm.vfs.r6 q17 = q(str4, j17, true);
        if ((i17 == 8 || i17 == 10130) && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            q17 = new com.tencent.mm.vfs.r6(java.lang.String.format("%s/%d/%d/", C(str4, j17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(str.hashCode() & 255)));
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
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RecordMsgLogic", th6, "[-] Fail to get canonical file name.", new java.lang.Object[0]);
            absolutePath = file.getAbsolutePath();
        }
        int lastIndexOf = absolutePath.lastIndexOf(47);
        if (lastIndexOf >= 0) {
            absolutePath = absolutePath.substring(lastIndexOf + 1);
        }
        java.lang.String pj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).pj(bm5.y.b(str4, j17, j18, 0L, "", bm5.v.f22747m, bm5.f0.f22574v), absolutePath, new com.tencent.mm.vfs.r6(q17, absolutePath).o());
        com.tencent.mm.vfs.q7.g(pj6, -1L, 3, false);
        return pj6;
    }

    public static java.lang.String t(r45.gp0 gp0Var, java.lang.String str, long j17, int i17) {
        return gp0Var == null ? "" : s(gp0Var.T, gp0Var.I, gp0Var.f375404d, gp0Var.K, str, j17, 0L, i17);
    }

    public static q45.c u(android.content.Context context, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, java.lang.String str) {
        r45.ev2 ev2Var;
        int i17;
        q45.c cVar = new q45.c();
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
        if (r01.z.g(str)) {
            cVar.f360129d = doFavoriteEvent.f54090g.f6315a.f370972q;
        } else if (com.tencent.mm.storage.z3.R4(str)) {
            cVar.f360129d = context.getString(com.tencent.mm.R.string.hsy);
        } else {
            java.lang.String l17 = c01.z1.l();
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String b17 = c01.a2.b(str);
            if (l17.equals(b17)) {
                cVar.f360129d = context.getString(com.tencent.mm.R.string.cc6, l17);
            } else {
                cVar.f360129d = context.getString(com.tencent.mm.R.string.f491208cc5, l17, b17);
            }
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.bq0 bq0Var = doFavoriteEvent.f54090g.f6315a;
        java.util.Iterator it = (bq0Var != null ? bq0Var.f370964f : new java.util.LinkedList()).iterator();
        boolean z17 = false;
        while (true) {
            java.lang.String str2 = "";
            if (!it.hasNext()) {
                cVar.f360130e = "";
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    str2 = str2 + ((java.lang.String) it6.next());
                }
                java.lang.String trim = str2.trim();
                if (linkedList.size() >= 5) {
                    trim = trim + "...";
                }
                cVar.f360130e = trim;
                return cVar;
            }
            r45.gp0 gp0Var = (r45.gp0) it.next();
            sparseIntArray.put(gp0Var.I, sparseIntArray.get(gp0Var.I) + 1);
            int i18 = gp0Var.I;
            switch (i18) {
                case 1:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + gp0Var.f375408f + "\n");
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.tencent.mm.R.string.f490517xd) + "\n");
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
                    } else if (gp0Var.f375448y <= 0) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.tencent.mm.R.string.f490600zm));
                        break;
                    } else {
                        java.lang.String str3 = gp0Var.K1;
                        java.lang.String string = context.getString(com.tencent.mm.R.string.f490600zm);
                        cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
                        long j17 = gp0Var.f375448y;
                        ((bv.p0) h1Var).getClass();
                        linkedList.add(java.lang.String.format("%s: %s %s\"\n", str3, string, java.lang.Integer.valueOf((int) w21.x0.m(j17))));
                        break;
                    }
                case 4:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.tencent.mm.R.string.f490596zi) + "\n");
                    }
                    if (!z17) {
                        E(cVar, gp0Var, com.tencent.mm.R.raw.app_attach_file_icon_video);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.tencent.mm.R.string.f490589za) + " " + gp0Var.f375404d + "\n");
                    }
                    if (!z17) {
                        E(cVar, gp0Var, com.tencent.mm.R.raw.app_attach_file_icon_webpage);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (linkedList.size() < 5) {
                        r45.pp0 pp0Var = gp0Var.J1.f376354e;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(gp0Var.K1);
                        sb6.append(": ");
                        sb6.append(context.getString(com.tencent.mm.R.string.f490470vz));
                        sb6.append(" ");
                        sb6.append((com.tencent.mm.sdk.platformtools.t8.K0(pp0Var.f383274o) || pp0Var.f383274o.equals(context.getString(com.tencent.mm.R.string.f490470vz))) ? pp0Var.f383272m : pp0Var.f383274o);
                        sb6.append("\n");
                        linkedList.add(sb6.toString());
                    }
                    if (!z17) {
                        cVar.f360132g = com.tencent.mm.R.raw.app_attach_file_icon_location;
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
                        sb7.append(il4.l.e(com.tencent.mm.sdk.platformtools.x2.f193071a, xs4Var != null ? xs4Var.getInteger(18) : 0));
                        sb7.append(gp0Var.f375404d);
                        sb7.append("\n");
                        linkedList.add(sb7.toString());
                    }
                    if (!z17) {
                        E(cVar, gp0Var, com.tencent.mm.R.raw.music_default);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.tencent.mm.R.string.f490430uv) + " " + gp0Var.f375404d + "\n");
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
                        linkedList.add(gp0Var.K1 + ": " + context.getString(((ox.g) ((tk.o) i95.n0.c(tk.o.class))).wi() ? com.tencent.mm.R.string.n8y : com.tencent.mm.R.string.v_) + " " + gp0Var.f375408f + "\n");
                        break;
                    }
                    break;
                case 10:
                case 11:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.tencent.mm.R.string.f490523xj) + " " + gp0Var.J1.f376356g.f370188d + "\n");
                    }
                    if (!z17) {
                        E(cVar, gp0Var, ((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).bj());
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.tencent.mm.R.string.f490009ic) + "\n");
                    }
                    if (!z17) {
                        E(cVar, gp0Var, ((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).bj());
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.tencent.mm.R.string.f490596zi) + "\n");
                    }
                    if (!z17) {
                        E(cVar, gp0Var, com.tencent.mm.R.raw.app_attach_file_icon_video);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (linkedList.size() < 5) {
                        com.tencent.mm.storage.y8 D3 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D3(gp0Var.f375408f);
                        int i19 = D3.f196374q;
                        java.util.Set set = c01.e2.f37117a;
                        if (com.tencent.mm.storage.z3.D3(i19)) {
                            int i27 = D3.f196377t;
                            if (i27 == 0) {
                                i17 = com.tencent.mm.R.string.v_;
                            } else if (i27 == 1) {
                                i17 = com.tencent.mm.R.string.mxk;
                            }
                            linkedList.add(gp0Var.K1 + ": " + context.getString(i17) + " " + D3.c() + "\n");
                        }
                        i17 = com.tencent.mm.R.string.f490445v9;
                        linkedList.add(gp0Var.K1 + ": " + context.getString(i17) + " " + D3.c() + "\n");
                    }
                    if (!z17) {
                        cVar.f360133h = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D3(gp0Var.f375408f).f196358a;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.tencent.mm.R.string.f490535xv) + "\n");
                        break;
                    } else {
                        continue;
                    }
                case 19:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.tencent.mm.R.string.f490010id) + " " + gp0Var.f375404d + "\n");
                        break;
                    } else {
                        continue;
                    }
                case 21:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.tencent.mm.R.string.f490506x0) + " " + gp0Var.f375408f + "\n");
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
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.tencent.mm.R.string.f490589za) + " " + gp0Var.f375404d + "\n");
                        break;
                    } else {
                        continue;
                    }
                case 31:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.tencent.mm.R.string.f490446va) + "\n");
                        break;
                    } else {
                        continue;
                    }
                case 33:
                    if (linkedList.size() < 5) {
                        r45.hp0 hp0Var2 = gp0Var.J1;
                        linkedList.add(gp0Var.K1 + ": " + il4.d.p(context, hp0Var2 != null ? hp0Var2.G : null) + gp0Var.f375404d + "\n");
                    }
                    if (!z17) {
                        E(cVar, gp0Var, com.tencent.mm.R.raw.music_default);
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
                            linkedList.add(gp0Var.K1 + ": " + gp0Var.f375404d + "\n");
                            break;
                        }
                    } else {
                        continue;
                    }
                case 35:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + gp0Var.f375408f + "\n");
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    if (linkedList.size() < 5) {
                        linkedList.add(gp0Var.K1 + ": " + gp0Var.f375408f + "\n");
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    if (linkedList.size() < 5) {
                        r45.hp0 hp0Var3 = gp0Var.J1;
                        if (hp0Var3 != null && (ev2Var = hp0Var3.f376352J) != null) {
                            if (ev2Var.getInteger(6) != 0) {
                                str2 = context.getString(com.tencent.mm.R.string.f491976mr5) + ": ";
                            } else if (ev2Var.getInteger(5) != 0) {
                                str2 = context.getString(com.tencent.mm.R.string.njj) + ": ";
                            }
                        }
                        linkedList.add(gp0Var.K1 + ": " + context.getString(com.tencent.mm.R.string.f490432ux) + " " + str2 + gp0Var.f375404d + "\n");
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
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "get contact null, username %s", str);
            return "";
        }
        java.lang.String g27 = n17.g2();
        if (!com.tencent.mm.storage.z3.R4(g27)) {
            return g27;
        }
        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
        java.util.List m17 = c01.v1.m(str);
        java.lang.String r17 = c01.z1.r();
        if (m17 == null || m17.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "get members from username error, content empty");
            return g27;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) m17;
        linkedList.remove(r17);
        linkedList.add(0, r17);
        return c01.v1.i(m17, 3, g27);
    }

    public static java.lang.String w(java.lang.String str, int i17) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i17 == 1) {
            return str;
        }
        return i17 + "_" + str;
    }

    public static final bt3.b0 x(ot0.q qVar) {
        if (qVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "fixMsgContent error, parse appmsg error");
            return null;
        }
        r45.ul5 A = A(qVar.f348663h0);
        if (A == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "fixMsgContent error, parse record data error");
            return null;
        }
        r45.bq0 bq0Var = new r45.bq0();
        bq0Var.f370964f = new java.util.LinkedList();
        bq0Var.l(A.f387467h);
        bq0Var.g(A.f387468i);
        bq0Var.p(A.f387463d);
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490013ih);
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490430uv);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = A.f387465f.iterator();
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            int i17 = gp0Var.I;
            if ((i17 == 8 || i17 == 10130) && gp0Var.R > 26214400) {
                gp0Var.h0(1);
                gp0Var.m0(string);
                arrayList.add(string2 + " " + gp0Var.f375404d);
                gp0Var.O0(null);
                gp0Var.i0(null);
                gp0Var.a0(null);
                gp0Var.b0(null);
                gp0Var.f375442w = 0;
                gp0Var.f375444x = true;
                gp0Var.q0(string.length());
            }
            bq0Var.f370964f.add(gp0Var);
        }
        java.lang.String[] split = A.f387464e.split("\n");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (java.lang.String str : split) {
            java.lang.String[] split2 = str.split(":");
            if (split2.length != 2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgLogic", "parse str(%s) of desc(%s) fail", str, A.f387464e);
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
        return new bt3.b0(substring, A.f387466g, bq0Var);
    }

    public static java.lang.String y(java.lang.String str, java.lang.String str2, long j17, boolean z17) {
        if (z17) {
            return str + "@record_download@" + j17;
        }
        return str + "@record_upload@" + j17;
    }

    public static zs3.y z(com.tencent.mm.modelcdntran.d1 d1Var) {
        zs3.y yVar = new zs3.y();
        yVar.field_mediaId = d1Var.f70908d;
        yVar.field_localId = d1Var.f70911g;
        yVar.field_cdnKey = d1Var.f70905a;
        yVar.field_cdnUrl = d1Var.f70906b;
        yVar.field_dataId = d1Var.f70907c;
        yVar.field_totalLen = d1Var.f70910f;
        yVar.field_offset = d1Var.f70909e;
        yVar.field_path = d1Var.f70912h;
        yVar.field_type = 1;
        yVar.field_fileType = d1Var.f70913i;
        yVar.field_isThumb = d1Var.f70914j;
        yVar.field_tpaeskey = d1Var.f70915k;
        yVar.field_tpauthkey = d1Var.f70916l;
        yVar.field_tpdataurl = d1Var.f70917m;
        return yVar;
    }
}
