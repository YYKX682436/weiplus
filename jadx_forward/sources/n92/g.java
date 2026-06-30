package n92;

/* loaded from: classes8.dex */
public final class g extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f417449o;

    /* renamed from: p, reason: collision with root package name */
    public cz2.f f417450p;

    /* renamed from: q, reason: collision with root package name */
    public final org.json.JSONObject f417451q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String source) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        java.lang.String str = "Cgi.FinderInit2#" + source + '@' + hashCode();
        this.f417449o = str;
        this.f417450p = cz2.f.f306537f;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.wb1 wb1Var = new r45.wb1();
        wb1Var.set(2, db2.t4.f309704a.a(3930));
        g92.b bVar = g92.b.f351302e;
        r45.cu5 cu5Var = (r45.cu5) bVar.k2().d().m75936x14adae67(1);
        wb1Var.set(1, cu5Var == null ? new r45.cu5() : cu5Var);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = bVar.k2().d().m75934xbce7f2f(29);
        wb1Var.set(3, m75934xbce7f2f == null ? new com.p314xaae8f345.mm.p2495xc50a8b8b.g(new byte[0], 0, 0) : m75934xbce7f2f);
        wb1Var.set(5, java.lang.Integer.valueOf(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().W0()));
        jz5.l ck6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ck(true);
        wb1Var.set(6, java.lang.Float.valueOf(((java.lang.Number) ck6.f384366d).floatValue()));
        wb1Var.set(7, java.lang.Float.valueOf(((java.lang.Number) ck6.f384367e).floatValue()));
        lVar.f152197a = wb1Var;
        r45.xb1 xb1Var = new r45.xb1();
        xb1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) xb1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = xb1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderinit";
        lVar.f152200d = 3930;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[CgiFinderInit]");
        this.f417451q = new org.json.JSONObject();
    }

    @Override // bq.e, com.p314xaae8f345.mm.p944x882e457a.i
    public pq5.g l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f417449o, "[run]... ");
        return super.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v95 */
    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        boolean z17;
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i27;
        int i28;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        r45.id1 id1Var;
        r45.id1 id1Var2;
        r45.en enVar;
        r45.sl0 sl0Var;
        r45.sl0 sl0Var2;
        java.util.LinkedList<r45.gk> m75941xfb821914;
        r45.ng7 ng7Var;
        java.util.LinkedList<r45.f90> m75941xfb8219142;
        r45.l21 l21Var;
        java.lang.Object obj4;
        r45.xb1 resp = (r45.xb1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.String str2 = this.f417449o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
        if (i17 >= 4) {
            this.f417450p = cz2.f.f306535d;
        }
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = g92.b.f351302e.h6().f406519i;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (next instanceof l92.a) {
                arrayList3.add(next);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList3.iterator();
        while (true) {
            z17 = false;
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next2 = it6.next();
            if ((((l92.a) next2).b() != this.f152179f.f152246d ? 0 : 1) != 0) {
                arrayList4.add(next2);
            }
        }
        java.util.Iterator it7 = arrayList4.iterator();
        while (true) {
            boolean hasNext = it7.hasNext();
            jSONObject = this.f417451q;
            if (!hasNext) {
                break;
            }
            ((l92.a) it7.next()).a(i17, i18, str, resp, jSONObject);
            i19 = i19;
            arrayList4 = arrayList4;
            z17 = false;
        }
        int i29 = i19;
        java.util.ArrayList arrayList5 = arrayList4;
        if (i17 == 0 && i18 == 0) {
            g92.b bVar = g92.b.f351302e;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = bVar.k2().d().m75934xbce7f2f(30);
            m92.f fVar2 = new m92.f();
            fVar2.d().set(i29, (r45.cu5) resp.m75936x14adae67(2));
            fVar2.d().set(29, resp.m75934xbce7f2f(37));
            fVar2.set(0, resp.m75945x2fec8307(22));
            r45.lb4 lb4Var = new r45.lb4();
            lb4Var.mo11468x92b714fd(resp.mo14344x5f01b1f6());
            lb4Var.set(31, java.lang.Boolean.TRUE);
            fVar2.set(3, lb4Var);
            if (fVar2.d().m75934xbce7f2f(30) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "finder_shop_init_buffer null, don't replace");
                fVar2.d().set(30, m75934xbce7f2f);
            }
            fVar2.set(4, java.lang.Integer.valueOf(resp.m75939xb282bd08(11)));
            fVar2.set(5, java.lang.Long.valueOf(resp.m75942xfb822ef2(12)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[successful] current_alias_role_type:" + fVar2.m75939xb282bd08(4) + ", next_alias_mod_available_time:" + fVar2.m75942xfb822ef2(5));
            bVar.S1(fVar2, m92.j.f406527i);
            java.util.LinkedList<r45.qz0> m75941xfb8219143 = resp.m75941xfb821914(23);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getContacts(...)");
            for (r45.qz0 qz0Var : m75941xfb8219143) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qz0Var);
                g92.b.f351302e.C(m92.d.b(qz0Var), m92.j.f406527i);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) qz0Var.m75936x14adae67(0);
                if (c19782x23db1cfa != null) {
                    ya2.h.f542017a.j(c19782x23db1cfa);
                }
            }
            r45.l21 l21Var2 = null;
            if (resp.m75939xb282bd08(8) > 0) {
                g92.b.f351302e.m5(m92.j.f406527i);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1279L, 26L, 1L);
            } else {
                java.util.LinkedList m75941xfb8219144 = resp.m75941xfb821914(23);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getContacts(...)");
                if (((m75941xfb8219144.isEmpty() ? 1 : 0) ^ i29) != 0) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList(g92.a.K6(g92.b.f351302e, false, i29, null));
                    pm0.v.b0(arrayList6, new n92.f(resp));
                    java.util.Iterator it8 = arrayList6.iterator();
                    while (it8.hasNext()) {
                        m92.b bVar2 = (m92.b) it8.next();
                        g92.b bVar3 = g92.b.f351302e;
                        java.lang.String field_username = bVar2.f68723xdec927b;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
                        bVar3.V4(field_username, m92.j.f406527i);
                    }
                }
            }
            g92.b bVar4 = g92.b.f351302e;
            java.lang.String m75945x2fec8307 = resp.m75945x2fec8307(22);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            bVar4.A1(m75945x2fec8307);
            java.util.LinkedList m75941xfb8219145 = resp.m75941xfb821914(30);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219145, "getFinder_config_item(...)");
            java.util.Iterator it9 = m75941xfb8219145.iterator();
            while (true) {
                if (it9.hasNext()) {
                    obj = it9.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yy0) obj).m75945x2fec8307(0), "usefindergetcommentlist")) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            r45.yy0 yy0Var = (r45.yy0) obj;
            if (yy0Var != null) {
                g92.b bVar5 = g92.b.f351302e;
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = yy0Var.m75934xbce7f2f(i29);
                bVar5.p2(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75934xbce7f2f2 != null ? m75934xbce7f2f2.i() : null, "1"));
            }
            java.util.LinkedList m75941xfb8219146 = resp.m75941xfb821914(30);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219146, "getFinder_config_item(...)");
            java.util.Iterator it10 = m75941xfb8219146.iterator();
            while (true) {
                if (it10.hasNext()) {
                    obj2 = it10.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yy0) obj2).m75945x2fec8307(0), "use_new_notice_icon_style_in_feed")) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            r45.yy0 yy0Var2 = (r45.yy0) obj2;
            if (yy0Var2 != null) {
                c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f3 = yy0Var2.m75934xbce7f2f(i29);
                boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75934xbce7f2f3 != null ? m75934xbce7f2f3.i() : null, "1");
                b92.d1 d1Var = (b92.d1) zbVar;
                d1Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonLiveService", "set isLiveNoticeFeedJumperEnable " + b17);
                d1Var.f99945d = b17;
            }
            java.util.LinkedList m75941xfb8219147 = resp.m75941xfb821914(30);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219147, "getFinder_config_item(...)");
            java.util.Iterator it11 = m75941xfb8219147.iterator();
            while (true) {
                if (it11.hasNext()) {
                    obj3 = it11.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yy0) obj3).m75945x2fec8307(0), "finder_live_mention_reddot_switch")) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            r45.yy0 yy0Var3 = (r45.yy0) obj3;
            if (yy0Var3 != null) {
                ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).wj(yy0Var3.m75934xbce7f2f(i29));
            }
            r45.zy0 zy0Var = new r45.zy0();
            zy0Var.set(0, resp.m75941xfb821914(30));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_INIT_CONF_LIST_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(zy0Var.mo14344x5f01b1f6()));
            pf5.u uVar = pf5.u.f435469a;
            ((ey2.j) ((xy2.e) uVar.e(zy2.b6.class).c(xy2.e.class))).Q6(resp);
            ((ey2.g1) ((xy2.j) uVar.e(zy2.b6.class).c(xy2.j.class))).O6(resp);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i2.f183779a.a(resp);
            ((ey2.l1) ((xy2.l) uVar.e(zy2.b6.class).c(xy2.l.class))).N6(resp);
            ((ey2.c2) ((xy2.n) uVar.e(zy2.b6.class).c(xy2.n.class))).P6(resp);
            ((ey2.w) ((xy2.f) uVar.e(zy2.b6.class).c(xy2.f.class))).N6(resp);
            ((ey2.c0) ((xy2.g) uVar.e(zy2.b6.class).c(xy2.g.class))).N6(resp);
            ((ey2.u0) ((xy2.h) uVar.e(zy2.b6.class).c(xy2.h.class))).N6(resp);
            ((ey2.b2) ((xy2.m) uVar.e(zy2.b6.class).c(xy2.m.class))).N6(resp);
            ((ey2.v0) ((xy2.i) uVar.e(zy2.b6.class).c(xy2.i.class))).N6(resp);
            ((ey2.h1) ((xy2.k) uVar.e(zy2.b6.class).c(xy2.k.class))).N6(resp);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().u(resp);
            java.util.LinkedList m75941xfb8219148 = resp.m75941xfb821914(31);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219148, "getExpt_buffers(...)");
            java.util.Iterator it12 = m75941xfb8219148.iterator();
            while (true) {
                if (!it12.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) it12.next();
                try {
                    l21Var = new r45.l21();
                    l21Var.mo11468x92b714fd(gVar.g());
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, java.lang.String.valueOf(th6.getMessage()));
                    l21Var = l21Var2;
                }
                if (l21Var != null) {
                    int i37 = 0;
                    java.util.LinkedList m75941xfb8219149 = l21Var.m75941xfb821914(0);
                    if (m75941xfb8219149 != null) {
                        java.util.Iterator it13 = m75941xfb8219149.iterator();
                        while (true) {
                            if (!it13.hasNext()) {
                                obj4 = l21Var2;
                                break;
                            }
                            obj4 = it13.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.k21) obj4).m75945x2fec8307(i37), "finder_getrelatedlist_support_backup_scenes")) {
                                break;
                            } else {
                                i37 = 0;
                            }
                        }
                        r45.k21 k21Var = (r45.k21) obj4;
                        if (k21Var != null) {
                            java.lang.String m75945x2fec83072 = k21Var.m75945x2fec8307(i29);
                            if (m75945x2fec83072 != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "finderGetRelatedlistSupportBackupScenes:".concat(m75945x2fec83072));
                                java.util.ArrayList g47 = g92.b.f351302e.g4();
                                g47.clear();
                                for (java.lang.String str3 : (java.lang.String[]) r26.n0.f0(m75945x2fec83072, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0])) {
                                    try {
                                        g47.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str3)));
                                    } catch (java.lang.NumberFormatException unused) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "finderGetRelatedlistSupportBackupScenes 跳过非数字字符: " + str3);
                                    }
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
                l21Var2 = null;
                i29 = 1;
            }
            iz2.c cVar = (iz2.c) uVar.e(zy2.b6.class).c(iz2.c.class);
            r45.kz2 kz2Var = (r45.kz2) resp.m75936x14adae67(34);
            if (kz2Var == null) {
                kz2Var = new r45.kz2();
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f) cVar).W6(kz2Var, "FinderInit");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[successful] resp.teenager_info=" + ((r45.kz2) resp.m75936x14adae67(34)));
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_NEGATIVE_FEED_BACK_CONF_STRING_SYNC;
            r45.hk2 hk2Var = (r45.hk2) resp.m75936x14adae67(41);
            c17.x(u3Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(hk2Var != null ? hk2Var.mo14344x5f01b1f6() : null));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[successful] negative_feedback_conf=");
            r45.hk2 hk2Var2 = (r45.hk2) resp.m75936x14adae67(41);
            ?? r27 = hk2Var2 != null ? (r45.dt4) hk2Var2.m75936x14adae67(0) : null;
            sb6.append(pm0.b0.g(r27 != null ? r27 : ""));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_GET_MENTION_CONFIG_INT_SYNC;
            r45.sg2 sg2Var = (r45.sg2) resp.m75936x14adae67(39);
            if (sg2Var != null) {
                i27 = 0;
                i28 = sg2Var.m75939xb282bd08(0);
            } else {
                i27 = 0;
                i28 = 0;
            }
            c18.x(u3Var2, java.lang.Integer.valueOf(i28));
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[successful] mention_config=");
            r45.sg2 sg2Var2 = (r45.sg2) resp.m75936x14adae67(39);
            sb7.append(sg2Var2 != null ? java.lang.Integer.valueOf(sg2Var2.m75939xb282bd08(i27)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().U((r45.at2) resp.m75936x14adae67(40));
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[successful] finder_reddot_freq_config=");
            r45.at2 at2Var = (r45.at2) resp.m75936x14adae67(40);
            int i38 = 10;
            if (at2Var == null || (m75941xfb8219142 = at2Var.m75941xfb821914(0)) == null) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
                for (r45.f90 f90Var : m75941xfb8219142) {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                    sb9.append(f90Var.m75939xb282bd08(0));
                    sb9.append('_');
                    sb9.append(f90Var.m75939xb282bd08(1));
                    arrayList.add(sb9.toString());
                }
            }
            sb8.append(arrayList);
            sb8.append(",stay_entry_min_duration=");
            r45.at2 at2Var2 = (r45.at2) resp.m75936x14adae67(40);
            sb8.append(at2Var2 != null ? java.lang.Integer.valueOf(at2Var2.m75939xb282bd08(1)) : null);
            sb8.append(",simul_expose_max_count_limit=");
            r45.at2 at2Var3 = (r45.at2) resp.m75936x14adae67(40);
            sb8.append(at2Var3 != null ? java.lang.Integer.valueOf(at2Var3.m75939xb282bd08(2)) : null);
            sb8.append(",x_strategy=");
            r45.at2 at2Var4 = (r45.at2) resp.m75936x14adae67(40);
            sb8.append((at2Var4 == null || (ng7Var = (r45.ng7) at2Var4.m75936x14adae67(3)) == null) ? null : ng7Var.m75941xfb821914(1));
            sb8.append(",biz_control_items=");
            r45.at2 at2Var5 = (r45.at2) resp.m75936x14adae67(40);
            if (at2Var5 == null || (m75941xfb821914 = at2Var5.m75941xfb821914(4)) == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                for (r45.gk gkVar : m75941xfb821914) {
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                    sb10.append(gkVar.m75939xb282bd08(2));
                    sb10.append(",n_m=");
                    java.util.LinkedList<r45.f90> m75941xfb82191410 = gkVar.m75941xfb821914(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191410, "getControl_items(...)");
                    java.util.ArrayList arrayList7 = new java.util.ArrayList(kz5.d0.q(m75941xfb82191410, i38));
                    for (r45.f90 f90Var2 : m75941xfb82191410) {
                        java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                        sb11.append(f90Var2.m75939xb282bd08(0));
                        sb11.append('_');
                        sb11.append(f90Var2.m75939xb282bd08(1));
                        arrayList7.add(sb11.toString());
                    }
                    sb10.append(arrayList7);
                    arrayList2.add(sb10.toString());
                    i38 = 10;
                }
            }
            sb8.append(arrayList2);
            sb8.append(",exempt_strategy=");
            r45.at2 at2Var6 = (r45.at2) resp.m75936x14adae67(40);
            sb8.append((at2Var6 == null || (sl0Var2 = (r45.sl0) at2Var6.m75936x14adae67(5)) == null) ? null : sl0Var2.m75941xfb821914(0));
            sb8.append(",is_count_with_x=");
            r45.at2 at2Var7 = (r45.at2) resp.m75936x14adae67(40);
            sb8.append((at2Var7 == null || (sl0Var = (r45.sl0) at2Var7.m75936x14adae67(5)) == null) ? null : java.lang.Boolean.valueOf(sl0Var.m75933x41a8a7f2(1)));
            sb8.append(",biz_x_strategy=");
            r45.at2 at2Var8 = (r45.at2) resp.m75936x14adae67(40);
            sb8.append((at2Var8 == null || (enVar = (r45.en) at2Var8.m75936x14adae67(6)) == null) ? null : enVar.m75941xfb821914(0));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb8.toString());
            r45.ls2 ls2Var = (r45.ls2) resp.m75936x14adae67(32);
            java.lang.Integer valueOf = (ls2Var == null || (id1Var2 = (r45.id1) ls2Var.m75936x14adae67(3)) == null) ? null : java.lang.Integer.valueOf(id1Var2.m75939xb282bd08(0));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LBS_SAMECITY_SWITCH_CONFIG_INT_SYNC, java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : 0));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[successful] cityConfig=" + valueOf);
            r45.ls2 ls2Var2 = (r45.ls2) resp.m75936x14adae67(32);
            if (ls2Var2 != null && (id1Var = (r45.id1) ls2Var2.m75936x14adae67(3)) != null) {
                int m75939xb282bd08 = id1Var.m75939xb282bd08(1);
                i95.m c19 = i95.n0.c(cq.k.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                ((cq.k) c19).f302761i = java.lang.Integer.valueOf(m75939xb282bd08);
            }
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder("[successful] resp.my_finder_tab_show_info_list=");
            java.util.LinkedList<r45.ct4> m75941xfb82191411 = resp.m75941xfb821914(36);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191411, "getMy_finder_tab_show_info_list(...)");
            java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(m75941xfb82191411, 10));
            for (r45.ct4 ct4Var : m75941xfb82191411) {
                arrayList8.add(ct4Var.m75945x2fec8307(1) + '#' + ct4Var.m75939xb282bd08(3) + '#' + ct4Var.m75942xfb822ef2(2) + '#' + ct4Var.m75945x2fec8307(0));
            }
            sb12.append(arrayList8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb12.toString());
            jSONObject2 = jSONObject;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "[failure] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
            jSONObject2 = jSONObject;
            jSONObject2.put("failure", "errType=" + i17 + " errType=" + i17 + " errMsg=" + str);
        }
        java.util.Iterator it14 = arrayList5.iterator();
        while (it14.hasNext()) {
            ((l92.a) it14.next()).c(i17, i18, str, resp, jSONObject2);
        }
    }

    @Override // bq.e, cz2.j
    public cz2.f v() {
        return this.f417450p;
    }

    @Override // bq.e, cz2.j
    public org.json.JSONObject z() {
        return this.f417451q;
    }
}
