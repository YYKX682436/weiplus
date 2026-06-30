package ov2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ov2.b f430701a = new ov2.b();

    public final void a(java.lang.StringBuilder sb6, java.lang.String str, int i17) {
        java.lang.String format = java.lang.String.format("<value%d>", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        sb6.append(format);
        java.lang.String format2 = java.lang.String.format("<![CDATA[%s]]>", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        sb6.append(format2);
        java.lang.String format3 = java.lang.String.format("</value%d>", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format3, "format(...)");
        sb6.append(format3);
    }

    public final void b(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56) {
        java.util.LinkedList<java.lang.String> m76689x9090b058;
        if (c19793xceab7f56 == null) {
            return;
        }
        c19793xceab7f56.m76995x84825357(null);
        c19793xceab7f56.m76986x908b3056(null);
        c19793xceab7f56.m76962x74cd162e().clear();
        c19793xceab7f56.m77002xdb5612fc(0);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19789x14fa372 m76963x60743a82 = c19793xceab7f56.m76963x60743a82();
        if (m76963x60743a82 == null || (m76689x9090b058 = m76963x60743a82.m76689x9090b058()) == null) {
            return;
        }
        m76689x9090b058.clear();
    }

    public final void c(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56, r45.e21 e21Var) {
        if (c19793xceab7f56 == null) {
            return;
        }
        if (c19793xceab7f56.m76943xbb439a28() == null) {
            c19793xceab7f56.m76981x8b564c9c(new r45.zw0());
        }
        r45.zw0 m76943xbb439a28 = c19793xceab7f56.m76943xbb439a28();
        if (m76943xbb439a28 == null) {
            return;
        }
        m76943xbb439a28.set(1, e21Var);
    }

    public final void d(java.util.LinkedList jumpInfoList, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 fakeSvrObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfoList, "jumpInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fakeSvrObj, "fakeSvrObj");
        if (jumpInfoList.isEmpty()) {
            fakeSvrObj.m76845x3750d31(0);
            return;
        }
        java.util.Iterator it = jumpInfoList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) it.next();
            if (c19786x6a1e2862.m76520x2fa78b11() == 0) {
                c19786x6a1e2862.m76567x22dcbf1d(1);
            }
        }
        fakeSvrObj.m76845x3750d31(4);
    }

    public final void e(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 fakeSvrObj, java.util.LinkedList jumpInfoList) {
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fakeSvrObj, "fakeSvrObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfoList, "jumpInfoList");
        r45.lu0 m76754xe4c0157 = fakeSvrObj.m76754xe4c0157();
        if (m76754xe4c0157 != null && (m75941xfb8219142 = m76754xe4c0157.m75941xfb821914(0)) != null) {
            pm0.v.d0(m75941xfb8219142, ov2.a.f430700d);
        }
        java.util.Iterator it = jumpInfoList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) it.next();
            if (fakeSvrObj.m76754xe4c0157() == null) {
                r45.lu0 lu0Var = new r45.lu0();
                lu0Var.set(0, new java.util.LinkedList());
                fakeSvrObj.m76847xd6426963(lu0Var);
            }
            r45.lu0 m76754xe4c01572 = fakeSvrObj.m76754xe4c0157();
            if (m76754xe4c01572 != null && (m75941xfb821914 = m76754xe4c01572.m75941xfb821914(0)) != null) {
                r45.ku0 ku0Var = new r45.ku0();
                ku0Var.set(0, 3);
                r45.rc1 rc1Var = new r45.rc1();
                rc1Var.set(0, c19786x6a1e2862);
                ku0Var.set(3, rc1Var);
                m75941xfb821914.add(ku0Var);
            }
        }
    }

    public final void f(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56, long j17, r45.s01 s01Var, java.util.LinkedList linkedList, int i17) {
        if (c19793xceab7f56 == null) {
            return;
        }
        if (c19793xceab7f56.m76943xbb439a28() == null) {
            c19793xceab7f56.m76981x8b564c9c(new r45.zw0());
        }
        r45.zw0 m76943xbb439a28 = c19793xceab7f56.m76943xbb439a28();
        if (m76943xbb439a28 != null) {
            m76943xbb439a28.set(2, java.lang.Float.valueOf((float) j17));
        }
        r45.zw0 m76943xbb439a282 = c19793xceab7f56.m76943xbb439a28();
        if (m76943xbb439a282 != null) {
            m76943xbb439a282.set(3, s01Var);
        }
        r45.zw0 m76943xbb439a283 = c19793xceab7f56.m76943xbb439a28();
        if (m76943xbb439a283 != null) {
            m76943xbb439a283.set(4, linkedList);
        }
        r45.zw0 m76943xbb439a284 = c19793xceab7f56.m76943xbb439a28();
        if (m76943xbb439a284 == null) {
            return;
        }
        m76943xbb439a284.set(17, java.lang.Integer.valueOf(i17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(java.lang.String username, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, int i17, java.util.ArrayList arrayList, int i18, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, java.util.LinkedList linkedList, long j17) {
        ya2.b2 b17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        c19792x256d2725.m76898x5bfbf51b(i17);
        c19792x256d2725.m76877x684351d(0L);
        c19792x256d2725.m76929x66bc2758(username);
        if (i17 == 6) {
            ya2.g gVar = ya2.h.f542017a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            b17 = new ya2.b2();
            b17.f69347xdec927b = username;
            b17.f69328x21f9b213 = c01.z1.l();
        } else {
            b17 = ya2.h.f542017a.b(username);
        }
        if (b17 == null || (str = b17.f69328x21f9b213) == null) {
            str = "";
        }
        c19792x256d2725.m76894x7ac946f0(str);
        c19792x256d2725.m76855x6e101bcb((int) (c01.id.a() / 1000));
        if (b17 != null) {
            c19782x23db1cfa = ya2.d.i(b17);
        } else {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
            c19782x23db1cfa2.m76240x66bc2758(username);
            if (b17 == null || (str2 = b17.f69328x21f9b213) == null) {
                str2 = "";
            }
            c19782x23db1cfa2.m76227x7ac946f0(str2);
            if (b17 == null || (str3 = b17.f69301x81118c51) == null) {
                str3 = "";
            }
            c19782x23db1cfa2.m76218xe0a5bcad(str3);
            if (b17 == null || (str4 = b17.f69341xda9bc3b3) == null) {
                str4 = "";
            }
            c19782x23db1cfa2.m76235x9bbeca76(str4);
            java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MY_FINDER_LOCAL_COVER_IMG_STRING_SYNC, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            c19782x23db1cfa2.m76207x552f0f81((java.lang.String) m17);
            c19782x23db1cfa = c19782x23db1cfa2;
        }
        c19792x256d2725.m76853xe9f5ad5e(c19782x23db1cfa);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725.m76760x76845fea();
        if (m76760x76845fea != null) {
            m76760x76845fea.m76228x70ffa1c3(m76760x76845fea.m76185xde293b4f() | 1);
        }
        c19792x256d2725.m76890x1d64118e(new java.util.LinkedList<>());
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.e() && arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r45.gb4 gb4Var = (r45.gb4) it.next();
                if (gb4Var.m75939xb282bd08(5) != 5) {
                    c19792x256d2725.m76797xa310e282().add(hc2.s.h(gb4Var));
                }
            }
        }
        if (hc2.s.f(b17)) {
            c19792x256d2725.m76903x60cfeedd(131);
        }
        c19792x256d2725.m76859x67d224e2("");
        c19792x256d2725.m76911x94207d5e("");
        c19792x256d2725.m76920xcdb23d5b(1);
        c19792x256d2725.m76902x16a43a5f(i18);
        c19792x256d2725.m76923xb6a60970((j17 & 1) == 1);
        if (((j17 & 2) > 0) != false) {
            if (c19792x256d2725.m76806xdef68064() == null) {
                c19792x256d2725.m76899x71cce6d8(new r45.dm2());
            }
            r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
            if (m76806xdef68064 != null) {
                r45.dm2 m76806xdef680642 = c19792x256d2725.m76806xdef68064();
                m76806xdef68064.set(2, java.lang.Integer.valueOf((m76806xdef680642 != null ? m76806xdef680642.m75939xb282bd08(2) : 0) | 4));
            }
        }
        d(linkedList, c19792x256d2725);
        r45.qp2 qp2Var = new r45.qp2();
        qp2Var.set(4, java.lang.Integer.valueOf(z17 ? 1 : 0));
        jz5.l P6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).P6();
        qp2Var.set(0, java.lang.Float.valueOf(((java.lang.Number) P6.f384366d).floatValue()));
        qp2Var.set(1, java.lang.Float.valueOf(((java.lang.Number) P6.f384367e).floatValue()));
        c14994x9b99c079.f66944x24f8e095 = qp2Var;
    }

    public final void h(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 objectDesc, r45.kb4 kb4Var, r45.qp2 postExtra) {
        java.util.LinkedList linkedList;
        r45.ho6 ho6Var;
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectDesc, "objectDesc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postExtra, "postExtra");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.G8).mo141623x754a37bb()).r()).intValue() == 0) {
            return;
        }
        java.lang.String str = null;
        r45.mb4 mb4Var = (kb4Var == null || (m75941xfb821914 = kb4Var.m75941xfb821914(0)) == null) ? null : (r45.mb4) m75941xfb821914.getFirst();
        if (mb4Var == null) {
            return;
        }
        if (mb4Var.m75939xb282bd08(2) == 2 || mb4Var.m75939xb282bd08(2) == 4) {
            r45.h70 h70Var = (r45.h70) mb4Var.m75936x14adae67(21);
            if (h70Var != null && (linkedList = h70Var.f457430d) != null && (ho6Var = (r45.ho6) linkedList.getFirst()) != null) {
                str = ho6Var.f457866d;
            }
            java.lang.String m75945x2fec8307 = kb4Var.m75945x2fec8307(10);
            boolean z17 = true;
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                m75945x2fec8307 = str == null || str.length() == 0 ? mb4Var.m75945x2fec8307(0) : str;
            }
            if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                jz5.l c17 = mb4Var.m75939xb282bd08(2) == 2 ? hc2.l.c(m75945x2fec8307) : hc2.l.f(m75945x2fec8307);
                if (c17 != null) {
                    float doubleValue = (float) ((java.lang.Number) c17.f384366d).doubleValue();
                    float doubleValue2 = (float) ((java.lang.Number) c17.f384367e).doubleValue();
                    postExtra.set(3, java.lang.Float.valueOf(doubleValue));
                    postExtra.set(2, java.lang.Float.valueOf(doubleValue2));
                    r45.zw0 m76943xbb439a28 = objectDesc.m76943xbb439a28();
                    if (m76943xbb439a28 == null) {
                        m76943xbb439a28 = new r45.zw0();
                    }
                    m76943xbb439a28.set(13, java.lang.Float.valueOf(doubleValue));
                    m76943xbb439a28.set(12, java.lang.Float.valueOf(doubleValue2));
                    objectDesc.m76981x8b564c9c(m76943xbb439a28);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostDataLogic", "[fillGPSInfo] feedLatitude:" + postExtra.m75938x746dc8a6(3) + " feedLongitude:" + postExtra.m75938x746dc8a6(2) + " mediaPath:" + m75945x2fec8307 + " originFilePath:" + kb4Var.m75945x2fec8307(10) + " trackPath:" + str + " url:" + mb4Var.m75945x2fec8307(0));
        }
    }

    public final void i(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56, r45.n41 n41Var, mv2.u0 u0Var) {
        if (c19793xceab7f56 != null) {
            if (n41Var == null) {
                n41Var = new r45.n41();
            }
            ov2.b bVar = f430701a;
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
                int m76275xbcc8608a = c19783xd9a946b7 != null ? c19783xd9a946b7.m76275xbcc8608a() : 0;
                r45.q23 q23Var = u0Var.f413188s;
                int v17 = bVar.v(q23Var != null ? q23Var.f465118d : null, m76275xbcc8608a, java.lang.Integer.valueOf(u0Var.f413170a));
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("enterscene", m76275xbcc8608a);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
                jSONObject.put("videosource", c19783xd9a946b72 != null ? java.lang.Integer.valueOf(c19783xd9a946b72.m76350x17bb2740()) : null);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b73 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
                jSONObject.put("child_enterscene", c19783xd9a946b73 != null ? java.lang.Integer.valueOf(c19783xd9a946b73.m76254xe7b4989a()) : null);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b74 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
                jSONObject.put("commentScene", c19783xd9a946b74 != null ? java.lang.Integer.valueOf(c19783xd9a946b74.m76260x8fadefe3()) : null);
                jSONObject.put("annotation_exemption_reason", v17);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                java.nio.charset.Charset charset = r26.c.f450398a;
                byte[] bytes = jSONObject2.getBytes(charset);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                byte[] encode = android.util.Base64.encode(bytes, 2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode, "encode(...)");
                java.lang.String str = new java.lang.String(encode, charset);
                n41Var.set(1, str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostDataLogic", "[fillGeneralReportInfo] client_info:" + jSONObject2 + " clientInfoBase64Str:" + str);
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            c19793xceab7f56.m76991x3586eac8(n41Var);
        }
    }

    public final void j(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        if (c19792x256d2725.m76806xdef68064() == null) {
            c19792x256d2725.m76899x71cce6d8(new r45.dm2());
        }
        r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
        if (m76806xdef68064 == null) {
            return;
        }
        m76806xdef68064.set(34, str);
    }

    public final void k(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        if (c19792x256d2725.m76806xdef68064() == null) {
            c19792x256d2725.m76899x71cce6d8(new r45.dm2());
        }
        r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
        if (m76806xdef68064 == null) {
            return;
        }
        r45.dm2 m76806xdef680642 = c19792x256d2725.m76806xdef68064();
        m76806xdef68064.set(2, java.lang.Integer.valueOf((m76806xdef680642 != null ? m76806xdef680642.m75939xb282bd08(2) : 0) | 1));
    }

    public final void l(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56, r45.df2 df2Var) {
        if (c19793xceab7f56 == null) {
            return;
        }
        if (c19793xceab7f56.m76943xbb439a28() == null) {
            c19793xceab7f56.m76981x8b564c9c(new r45.zw0());
        }
        r45.zw0 m76943xbb439a28 = c19793xceab7f56.m76943xbb439a28();
        if (m76943xbb439a28 == null) {
            return;
        }
        m76943xbb439a28.set(9, df2Var);
    }

    public final void m(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56, r45.zf2 zf2Var) {
        if (c19793xceab7f56 == null) {
            return;
        }
        if (c19793xceab7f56.m76943xbb439a28() == null) {
            c19793xceab7f56.m76981x8b564c9c(new r45.zw0());
        }
        r45.zw0 m76943xbb439a28 = c19793xceab7f56.m76943xbb439a28();
        if (m76943xbb439a28 == null) {
            return;
        }
        m76943xbb439a28.set(7, zf2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 r17, r45.kb4 r18, mv2.u0 r19, r45.xl2 r20, r45.qp2 r21, java.lang.String r22, int r23, r45.ze2 r24, r45.o21 r25, java.util.ArrayList r26, r45.q23 r27, r45.b01 r28, r45.b01 r29) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ov2.b.n(com.tencent.mm.protocal.protobuf.FinderObjectDesc, r45.kb4, mv2.u0, r45.xl2, r45.qp2, java.lang.String, int, r45.ze2, r45.o21, java.util.ArrayList, r45.q23, r45.b01, r45.b01):void");
    }

    public final void o(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56, r45.xl2 xl2Var, java.lang.String str, int i17, r45.ze2 ze2Var, r45.o21 o21Var, java.util.ArrayList arrayList, r45.q23 q23Var, r45.b01 b01Var, mv2.u0 u0Var) {
        c19793xceab7f56.m76984x52f23358(xl2Var);
        c19793xceab7f56.m77018xe15630f2(q23Var);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19789x14fa372 m76963x60743a82 = c19793xceab7f56.m76963x60743a82();
        if (m76963x60743a82 != null) {
            m76963x60743a82.m76693x58871864(b01Var != null ? b01Var.m75941xfb821914(0) : null);
            m76963x60743a82.m76694x157325ee(u0Var.S);
        }
        c19793xceab7f56.m76982x9713e3a(str);
        c19793xceab7f56.m77002xdb5612fc(i17);
        if (ze2Var == null) {
            ze2Var = new r45.ze2();
        }
        c19793xceab7f56.m76998xe7e23e37(ze2Var);
        if (o21Var == null) {
            o21Var = new r45.o21();
        }
        c19793xceab7f56.m76985xb3196b2d(o21Var);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.e() && arrayList != null) {
            java.util.LinkedList<r45.zg2> linkedList = new java.util.LinkedList<>();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r45.gb4 gb4Var = (r45.gb4) it.next();
                if (gb4Var.m75939xb282bd08(5) != 5) {
                    r45.zg2 zg2Var = new r45.zg2();
                    zg2Var.set(0, gb4Var.m75945x2fec8307(0));
                    zg2Var.set(1, java.lang.Integer.valueOf(gb4Var.m75939xb282bd08(5)));
                    zg2Var.set(2, gb4Var.m75945x2fec8307(2));
                    linkedList.add(zg2Var);
                    java.lang.String m75945x2fec8307 = gb4Var.m75945x2fec8307(2);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    hashMap.put(m75945x2fec8307, gb4Var);
                }
            }
            c19793xceab7f56.m77006xda46ae32(linkedList);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (t70Var.G2() || t70Var.e()) {
            r45.n03 n03Var = new r45.n03();
            n03Var.set(0, f430701a.u(str, hashMap));
            c19793xceab7f56.m77017x53c28ded(n03Var);
        }
        java.util.ArrayList arrayList2 = u0Var.H;
        if (arrayList2 != null) {
            c19793xceab7f56.m76976x275e039f().clear();
            c19793xceab7f56.m76976x275e039f().addAll(arrayList2);
        }
        r45.xn2 xn2Var = u0Var.I;
        if (xn2Var != null) {
            c19793xceab7f56.m77010x493c2696(xn2Var);
        }
        c19793xceab7f56.m76996xda84d2ff(u0Var.f413195z);
        c19793xceab7f56.m77013x38568509(u0Var.A);
    }

    public final void p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, java.util.ArrayList arrayList, mv2.u0 u0Var) {
        java.lang.String str;
        r45.qb4 qb4Var = c14994x9b99c079.f66945x4aebb6f3;
        if (qb4Var == null) {
            qb4Var = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).Vi();
        }
        qb4Var.set(6, java.lang.Long.valueOf(c01.id.a()));
        if (arrayList != null) {
            qb4Var.m75941xfb821914(11).clear();
            qb4Var.m75941xfb821914(11).addAll(arrayList);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u0Var.f413182m)) {
            r45.qo5 qo5Var = new r45.qo5();
            r45.z31 z31Var = u0Var.f413181l;
            if (z31Var == null || (str = z31Var.m75945x2fec8307(0)) == null) {
                str = "";
            }
            qo5Var.set(0, str);
            qo5Var.set(1, u0Var.f413183n);
            qo5Var.set(2, u0Var.f413182m);
            qb4Var.set(12, qo5Var);
        }
        qb4Var.set(19, u0Var.M);
        qb4Var.set(20, u0Var.N);
        qb4Var.set(18, u0Var.f413169J);
        qb4Var.set(22, java.lang.Integer.valueOf(u0Var.P));
        qb4Var.set(23, u0Var.Q);
        qb4Var.set(24, null);
        qb4Var.set(25, u0Var.T);
        qb4Var.set(27, u0Var.U);
        qb4Var.set(28, u0Var.V);
        qb4Var.set(30, java.lang.Boolean.valueOf(u0Var.X));
        qb4Var.set(31, u0Var.Y);
        c14994x9b99c079.m59408xa3acbff0(qb4Var);
    }

    public final void q(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56, r45.kc4 kc4Var, long j17) {
        if (c19793xceab7f56 == null) {
            return;
        }
        boolean z17 = false;
        if (kc4Var != null) {
            if (c19793xceab7f56.m76954xfa50cdcc() == null) {
                c19793xceab7f56.m76992xaa1d96d8(new r45.q31());
            }
            r45.q31 m76954xfa50cdcc = c19793xceab7f56.m76954xfa50cdcc();
            if (m76954xfa50cdcc != null) {
                m76954xfa50cdcc.set(0, java.lang.Long.valueOf(kc4Var.m75942xfb822ef2(0)));
            }
            int m75939xb282bd08 = kc4Var.m75939xb282bd08(4);
            int i17 = m75939xb282bd08 != 1 ? m75939xb282bd08 != 2 ? m75939xb282bd08 != 3 ? 0 : 2 : 3 : 1;
            r45.q31 m76954xfa50cdcc2 = c19793xceab7f56.m76954xfa50cdcc();
            if (m76954xfa50cdcc2 != null) {
                m76954xfa50cdcc2.set(1, java.lang.Integer.valueOf(i17));
            }
            r45.q31 m76954xfa50cdcc3 = c19793xceab7f56.m76954xfa50cdcc();
            if (m76954xfa50cdcc3 != null) {
                m76954xfa50cdcc3.set(2, java.lang.Boolean.valueOf(kc4Var.m75939xb282bd08(5) == 0));
            }
            boolean z18 = i17 != 0;
            if (c19793xceab7f56.m76943xbb439a28() == null) {
                c19793xceab7f56.m76981x8b564c9c(new r45.zw0());
            }
            if (kc4Var.m75939xb282bd08(4) == 1) {
                r45.zw0 m76943xbb439a28 = c19793xceab7f56.m76943xbb439a28();
                if (m76943xbb439a28 != null) {
                    m76943xbb439a28.set(5, pm0.v.u(kc4Var.m75942xfb822ef2(0)));
                }
                r45.zw0 m76943xbb439a282 = c19793xceab7f56.m76943xbb439a28();
                if (m76943xbb439a282 != null) {
                    m76943xbb439a282.set(8, kc4Var.m75945x2fec8307(6));
                }
            }
            r45.zw0 m76943xbb439a283 = c19793xceab7f56.m76943xbb439a28();
            if (m76943xbb439a283 != null) {
                m76943xbb439a283.set(6, java.lang.Integer.valueOf(kc4Var.m75939xb282bd08(5)));
            }
            z17 = z18;
        }
        if (z17 || j17 == 0) {
            return;
        }
        if (c19793xceab7f56.m76954xfa50cdcc() == null) {
            c19793xceab7f56.m76992xaa1d96d8(new r45.q31());
        }
        r45.q31 m76954xfa50cdcc4 = c19793xceab7f56.m76954xfa50cdcc();
        if (m76954xfa50cdcc4 != null) {
            m76954xfa50cdcc4.set(1, 4);
        }
        r45.q31 m76954xfa50cdcc5 = c19793xceab7f56.m76954xfa50cdcc();
        if (m76954xfa50cdcc5 == null) {
            return;
        }
        m76954xfa50cdcc5.set(3, java.lang.Long.valueOf(j17));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 r5, int r6, java.lang.String r7, mv2.u0 r8, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 r9, r45.o21 r10, int r11) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ov2.b.r(com.tencent.mm.plugin.finder.storage.FinderItem, int, java.lang.String, mv2.u0, com.tencent.mm.protocal.protobuf.FinderObjectDesc, r45.o21, int):void");
    }

    public final void s(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56, r45.ab4 ab4Var) {
        if (c19793xceab7f56 == null || ab4Var == null) {
            return;
        }
        if (c19793xceab7f56.m76943xbb439a28() == null) {
            c19793xceab7f56.m76981x8b564c9c(new r45.zw0());
        }
        r45.zw0 m76943xbb439a28 = c19793xceab7f56.m76943xbb439a28();
        if (m76943xbb439a28 == null) {
            return;
        }
        r45.nz2 nz2Var = new r45.nz2();
        nz2Var.set(0, ab4Var.m75945x2fec8307(4));
        nz2Var.set(1, ab4Var.m75945x2fec8307(1));
        nz2Var.set(2, ab4Var.m75945x2fec8307(2));
        nz2Var.set(3, java.lang.Integer.valueOf(ab4Var.m75939xb282bd08(0)));
        nz2Var.set(4, ab4Var.m75945x2fec8307(5));
        nz2Var.set(7, java.lang.Integer.valueOf(ab4Var.m75939xb282bd08(6)));
        nz2Var.set(8, ab4Var.m75945x2fec8307(7));
        nz2Var.set(5, ab4Var.m75945x2fec8307(8));
        m76943xbb439a28.set(19, nz2Var);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 t(mv2.u0 data, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079;
        r45.b01 b01Var;
        r45.df2 df2Var;
        r45.n41 n41Var;
        int i17;
        ov2.b bVar;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int i18 = data.f413170a;
        java.lang.String str = data.f413171b;
        r45.kb4 kb4Var = data.f413172c;
        r45.ze2 ze2Var = data.f413173d;
        r45.o21 o21Var = data.f413174e;
        int i19 = data.f413175f;
        boolean z18 = data.f413176g;
        java.lang.String str2 = data.f413177h;
        java.util.ArrayList arrayList = data.f413178i;
        int i27 = data.f413180k;
        r45.xl2 xl2Var = data.f413185p;
        r45.e21 e21Var = data.C;
        java.util.LinkedList linkedList = data.f413187r;
        r45.q23 q23Var = data.f413188s;
        long j17 = data.f413191v;
        r45.b01 b01Var2 = data.F;
        r45.b01 b01Var3 = data.G;
        r45.df2 df2Var2 = data.f413189t;
        boolean z19 = data.f413179j;
        r45.n41 n41Var2 = data.f413190u;
        int i28 = data.f413192w;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = data.f413186q;
        if (c14994x9b99c0792 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0793 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
            c19792x256d2725.m76928x358e7903(Integer.MAX_VALUE);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56();
            c19792x256d2725.m76895x5bf46472(c19793xceab7f56);
            g(data.B, c19792x256d2725, i27, arrayList, i19, z18, c14994x9b99c0793, linkedList, j17);
            r45.qp2 field_postExtraData = c14994x9b99c0793.f66944x24f8e095;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_postExtraData, "field_postExtraData");
            n(c19793xceab7f56, kb4Var, data, xl2Var, field_postExtraData, str, i18, ze2Var, o21Var, arrayList, q23Var, b01Var2, b01Var3);
            if (z19) {
                k(c19792x256d2725);
            }
            r(c14994x9b99c0793, i18, str2, data, c19793xceab7f56, o21Var, 0);
            c14994x9b99c0793.m59434xe1b97a6e(c19792x256d2725);
            i(c19793xceab7f56, n41Var2, data);
            c(c19793xceab7f56, e21Var);
            long j18 = data.D;
            r45.s01 s01Var = data.E;
            r45.b01 b01Var4 = data.F;
            f(c19793xceab7f56, j18, s01Var, b01Var4 != null ? b01Var4.m75941xfb821914(1) : null, data.R);
            q(c19793xceab7f56, data.f413169J, data.Z);
            m(c19793xceab7f56, data.K);
            l(c19793xceab7f56, df2Var2);
            s(c19793xceab7f56, data.Y);
            e(c19792x256d2725, linkedList);
            p(c14994x9b99c0793, arrayList, data);
            j(c19792x256d2725, data.O);
            r45.qp2 field_postExtraData2 = c14994x9b99c0793.f66944x24f8e095;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_postExtraData2, "field_postExtraData");
            h(c19793xceab7f56, kb4Var, field_postExtraData2);
            java.util.LinkedList<r45.mb4> m75941xfb821914 = kb4Var != null ? kb4Var.m75941xfb821914(0) : null;
            if (m75941xfb821914 == null) {
                m75941xfb821914 = new java.util.LinkedList<>();
            }
            c14994x9b99c0793.m59394x4a87835d(m75941xfb821914);
            c14994x9b99c0793.f66950x30403f6b = i28;
            c14994x9b99c0793.m59409xd2aa5bcb();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostDataLogic", "finder send post " + pm0.b0.g(c19792x256d2725));
            return c14994x9b99c0793;
        }
        java.lang.String str3 = data.B;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 field_finderObject = c14994x9b99c0792.f66937x27cd822a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_finderObject, "field_finderObject");
        g(str3, field_finderObject, i27, arrayList, i19, z18, c14994x9b99c0792, linkedList, j17);
        if (c14994x9b99c0792.f66937x27cd822a.m76802x2dd01666() == null) {
            c14994x9b99c0792.f66937x27cd822a.m76895x5bf46472(new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56());
        }
        if (kb4Var != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = c14994x9b99c0792.f66937x27cd822a.m76802x2dd01666();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m76802x2dd016662);
            r45.qp2 field_postExtraData3 = c14994x9b99c0792.f66944x24f8e095;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_postExtraData3, "field_postExtraData");
            df2Var = df2Var2;
            n41Var = n41Var2;
            i17 = i28;
            c14994x9b99c079 = c14994x9b99c0792;
            n(m76802x2dd016662, kb4Var, data, xl2Var, field_postExtraData3, str, i18, ze2Var, o21Var, arrayList, q23Var, b01Var2, b01Var3);
            if (z19) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 field_finderObject2 = c14994x9b99c079.f66937x27cd822a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_finderObject2, "field_finderObject");
                bVar = this;
                b01Var = b01Var2;
                bVar.k(field_finderObject2);
            } else {
                bVar = this;
                b01Var = b01Var2;
            }
            java.util.LinkedList<r45.mb4> m75941xfb8219142 = kb4Var.m75941xfb821914(0);
            if (m75941xfb8219142 == null) {
                m75941xfb8219142 = new java.util.LinkedList<>();
            }
            c14994x9b99c079.m59394x4a87835d(m75941xfb8219142);
        } else {
            c14994x9b99c079 = c14994x9b99c0792;
            b01Var = b01Var2;
            df2Var = df2Var2;
            n41Var = n41Var2;
            i17 = i28;
            bVar = this;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663 = c14994x9b99c079.f66937x27cd822a.m76802x2dd01666();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m76802x2dd016663);
            o(m76802x2dd016663, xl2Var, str, i18, ze2Var, o21Var, arrayList, q23Var, b01Var, data);
        }
        bVar.i(c14994x9b99c079.f66937x27cd822a.m76802x2dd01666(), n41Var, data);
        bVar.c(c14994x9b99c079.f66937x27cd822a.m76802x2dd01666(), e21Var);
        f(c14994x9b99c079.f66937x27cd822a.m76802x2dd01666(), data.D, data.E, b01Var != null ? b01Var.m75941xfb821914(1) : null, data.R);
        bVar.q(c14994x9b99c079.f66937x27cd822a.m76802x2dd01666(), data.f413169J, data.Z);
        bVar.m(c14994x9b99c079.f66937x27cd822a.m76802x2dd01666(), data.K);
        bVar.l(c14994x9b99c079.f66937x27cd822a.m76802x2dd01666(), df2Var);
        bVar.s(c14994x9b99c079.f66937x27cd822a.m76802x2dd01666(), data.Y);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 field_finderObject3 = c14994x9b99c079.f66937x27cd822a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_finderObject3, "field_finderObject");
        bVar.e(field_finderObject3, linkedList);
        bVar.p(c14994x9b99c079, arrayList, data);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 field_finderObject4 = c14994x9b99c079.f66937x27cd822a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_finderObject4, "field_finderObject");
        bVar.j(field_finderObject4, data.O);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = c14994x9b99c079.f66937x27cd822a;
        if (c19792x256d27252 != null && (m76802x2dd01666 = c19792x256d27252.m76802x2dd01666()) != null) {
            r45.zw0 m76943xbb439a28 = m76802x2dd01666.m76943xbb439a28();
            float m75938x746dc8a6 = m76943xbb439a28 != null ? m76943xbb439a28.m75938x746dc8a6(13) : 0.0f;
            r45.zw0 m76943xbb439a282 = m76802x2dd01666.m76943xbb439a28();
            float m75938x746dc8a62 = m76943xbb439a282 != null ? m76943xbb439a282.m75938x746dc8a6(12) : 0.0f;
            r45.qp2 qp2Var = c14994x9b99c079.f66944x24f8e095;
            if (qp2Var != null) {
                qp2Var.set(3, java.lang.Float.valueOf(m75938x746dc8a6));
            }
            r45.qp2 qp2Var2 = c14994x9b99c079.f66944x24f8e095;
            if (qp2Var2 != null) {
                qp2Var2.set(2, java.lang.Float.valueOf(m75938x746dc8a62));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostDataLogic", "[fillDraftGPSToPostExtra] feedLatitude:" + m75938x746dc8a6 + " feedLongitude:" + m75938x746dc8a62);
        }
        if (!z17) {
            r(c14994x9b99c079, i18, str2, data, c14994x9b99c079.f66937x27cd822a.m76802x2dd01666(), o21Var, 1);
        }
        c14994x9b99c079.m59409xd2aa5bcb();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 field_finderObject5 = c14994x9b99c079.f66937x27cd822a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_finderObject5, "field_finderObject");
        c14994x9b99c079.m59375x22d34c7f(field_finderObject5);
        c14994x9b99c079.f66950x30403f6b = i17;
        return c14994x9b99c079;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
    
        r14 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String u(java.lang.String r21, java.util.HashMap r22) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ov2.b.u(java.lang.String, java.util.HashMap):java.lang.String");
    }

    public final int v(java.lang.String str, int i17, java.lang.Integer num) {
        xy2.g gVar = (xy2.g) pf5.u.f435469a.e(zy2.b6.class).c(xy2.g.class);
        if (!(str == null || str.length() == 0)) {
            r45.yp2 yp2Var = ((ey2.c0) gVar).f338863f;
            if (yp2Var != null && yp2Var.m75939xb282bd08(0) == 1) {
                return 1;
            }
        }
        r45.yp2 yp2Var2 = ((ey2.c0) gVar).f338863f;
        java.util.LinkedList m75941xfb821914 = yp2Var2 != null ? yp2Var2.m75941xfb821914(1) : null;
        if (m75941xfb821914 != null && m75941xfb821914.contains(java.lang.Integer.valueOf(i17))) {
            return 2;
        }
        return (num != null && num.intValue() == 2) ? 3 : 0;
    }
}
