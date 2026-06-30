package a82;

/* loaded from: classes12.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a82.j1 f83578a = new a82.j1();

    /* renamed from: b, reason: collision with root package name */
    public static final r45.fb4 f83579b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    static {
        /*
            a82.j1 r0 = new a82.j1
            r0.<init>()
            a82.j1.f83578a = r0
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r1 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FAV_POST_REPORT_LIST_STRING_SYNC
            java.lang.String r2 = ""
            java.lang.String r0 = r0.v(r1, r2)
            java.lang.String r1 = "FavPostReporter"
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4d
            int r4 = r0.length()
            if (r4 != 0) goto L25
            r4 = r2
            goto L26
        L25:
            r4 = r3
        L26:
            if (r4 == 0) goto L29
            goto L4d
        L29:
            r45.fb4 r4 = new r45.fb4     // Catch: java.lang.Exception -> L38
            r4.<init>()     // Catch: java.lang.Exception -> L38
            byte[] r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(r0)     // Catch: java.lang.Exception -> L38
            r4.mo11468x92b714fd(r5)     // Catch: java.lang.Exception -> L38
            a82.j1.f83579b = r4     // Catch: java.lang.Exception -> L38
            goto L54
        L38:
            r4 = move-exception
            java.lang.String r5 = "parse pb fail, pbEncodeStr="
            java.lang.String r0 = r5.concat(r0)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r4, r0, r5)
            r45.fb4 r0 = new r45.fb4
            r0.<init>()
            a82.j1.f83579b = r0
            goto L54
        L4d:
            r45.fb4 r0 = new r45.fb4
            r0.<init>()
            a82.j1.f83579b = r0
        L54:
            r45.fb4 r0 = a82.j1.f83579b
            java.util.LinkedList r4 = r0.f455702d
            int r4 = r4.size()
            r5 = 100
            if (r4 <= r5) goto Lba
            java.util.LinkedList r4 = r0.f455702d
            java.lang.String r6 = "list"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r6)
            int r6 = r4.size()
            if (r6 <= r2) goto L76
            a82.i1 r2 = new a82.i1
            r2.<init>()
            kz5.g0.t(r4, r2)
        L76:
            java.util.LinkedList r2 = r0.f455702d
            int r2 = r2.size()
            int r2 = r2 - r5
            if (r2 <= 0) goto L99
            java.util.LinkedList r0 = r0.f455702d
            int r0 = r0.size()
            if (r0 <= 0) goto L99
            r0 = r3
        L88:
            if (r0 >= r2) goto L94
            r45.fb4 r4 = a82.j1.f83579b
            java.util.LinkedList r4 = r4.f455702d
            r4.remove(r3)
            int r0 = r0 + 1
            goto L88
        L94:
            a82.j1 r0 = a82.j1.f83578a
            r0.j()
        L99:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "init: removeCount="
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r2 = ", localFavPostReportList.size="
            r0.append(r2)
            r45.fb4 r2 = a82.j1.f83579b
            java.util.LinkedList r2 = r2.f455702d
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a82.j1.m821x8c160ea9():void");
    }

    public final void a(o72.r2 favItem, int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favItem, "favItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FavPostReporter", "checkCDNResult: localId=" + favItem.f67645x88be67a1 + ", favId=" + favItem.f67643xc8a07680 + ", checkResCnt=" + i17 + ", checkResSuccessTotalCnt=" + i18 + ", checkResFailTotalCnt=" + i19 + ", checkResSvrUploadedCnt=" + i27 + ", checkResSvrUploadingCnt=" + i28 + ", checkResSvrNotExistCnt=" + i29 + ", checkResCgiFailCnt=" + i37);
        r45.fb4 fb4Var = f83579b;
        java.util.LinkedList list = fb4Var.f455702d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.eb4) obj).f454749d == favItem.f67645x88be67a1) {
                    break;
                }
            }
        }
        r45.eb4 eb4Var = (r45.eb4) obj;
        if (eb4Var == null) {
            eb4Var = new r45.eb4();
            eb4Var.f454749d = favItem.f67645x88be67a1;
            eb4Var.K = c01.id.c();
            eb4Var.f454750e = favItem.f67643xc8a07680;
            eb4Var.f454751f = favItem.f67657x2262335f;
            eb4Var.f454753h = favItem.f67651x76e81a5a;
            i(eb4Var, favItem.f67649xde813d09);
            eb4Var.f454748J = eb4Var.f454750e != 0 ? 2 : 1;
            fb4Var.f455702d.add(eb4Var);
        }
        eb4Var.f454754i = 2;
        eb4Var.f454760r = i17;
        eb4Var.f454761s = i18;
        eb4Var.f454762t = i19;
        eb4Var.f454763u = i27;
        eb4Var.f454764v = i28;
        eb4Var.f454765w = i29;
        eb4Var.f454766x = i37;
        pm0.v.X(a82.e1.f83520d);
    }

    public final int b(int i17) {
        if (i17 == -10) {
            return 20005;
        }
        if (i17 == -2) {
            return 20001;
        }
        if (i17 == -8) {
            return 20013;
        }
        if (i17 != -7) {
            if (i17 != -6) {
                if (i17 != -5) {
                    if (i17 != -4) {
                        return i17;
                    }
                }
            }
            return 20002;
        }
        return 20003;
    }

    public final void c(r45.eb4 eb4Var) {
        int i17;
        o72.r2 F;
        r45.bq0 bq0Var;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        if (eb4Var.f454751f == 18 && (F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(eb4Var.f454749d)) != null && (bq0Var = F.f67640x5ab01132) != null && (linkedList = bq0Var.f452497f) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.gp0) obj).P1, "WeNoteHtmlFile")) {
                        break;
                    }
                }
            }
            r45.gp0 gp0Var = (r45.gp0) obj;
            if (gp0Var != null) {
                java.lang.String str = gp0Var.K;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ".htm")) {
                    i17 = 1;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ".md")) {
                    i17 = 2;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("enableFlutterNote", ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).wi());
                o72.d3 d3Var = o72.d3.f424854a;
                jSONObject.put("enableMarkdownNote", d3Var.b());
                jSONObject.put("enableMarkdownNotePublish", d3Var.c());
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6441x2a3819af c6441x2a3819af = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6441x2a3819af();
                c6441x2a3819af.f137811k = 2;
                long j17 = eb4Var.f454749d;
                c6441x2a3819af.f137807g = j17;
                c6441x2a3819af.f137803J = j17;
                c6441x2a3819af.f137812l = eb4Var.f454750e;
                c6441x2a3819af.f137804d = eb4Var.f454751f;
                c6441x2a3819af.f137805e = eb4Var.f454752g;
                c6441x2a3819af.f137806f = eb4Var.f454753h;
                c6441x2a3819af.f137815o = eb4Var.f454758p;
                c6441x2a3819af.f137816p = eb4Var.f454759q;
                c6441x2a3819af.f137808h = c01.id.c() / 1000;
                c6441x2a3819af.f137809i = eb4Var.f454754i;
                c6441x2a3819af.I = eb4Var.f454748J;
                c6441x2a3819af.f137813m = eb4Var.f454756n;
                c6441x2a3819af.f137814n = eb4Var.f454757o;
                c6441x2a3819af.f137810j = c6441x2a3819af.b("errDataList", eb4Var.f454755m, true);
                c6441x2a3819af.f137817q = eb4Var.f454760r;
                c6441x2a3819af.f137818r = eb4Var.f454761s;
                c6441x2a3819af.f137819s = eb4Var.f454762t;
                c6441x2a3819af.f137820t = eb4Var.f454763u;
                c6441x2a3819af.f137821u = eb4Var.f454764v;
                c6441x2a3819af.f137822v = eb4Var.f454765w;
                c6441x2a3819af.f137823w = eb4Var.f454766x;
                c6441x2a3819af.f137825y = eb4Var.f454768z;
                c6441x2a3819af.f137824x = c6441x2a3819af.b("downloadFailDataId", eb4Var.f454767y, true);
                c6441x2a3819af.f137826z = c6441x2a3819af.b("downloadFailDataJson", eb4Var.A, true);
                c6441x2a3819af.A = c6441x2a3819af.b("downloadFailThumbJson", eb4Var.B, true);
                c6441x2a3819af.B = eb4Var.C;
                c6441x2a3819af.C = eb4Var.D;
                c6441x2a3819af.D = c6441x2a3819af.b("clientUploadResFailItemJson", eb4Var.E, true);
                c6441x2a3819af.E = eb4Var.F;
                c6441x2a3819af.F = eb4Var.G;
                c6441x2a3819af.G = eb4Var.H;
                c6441x2a3819af.H = c6441x2a3819af.b("errExtraMsg", eb4Var.I, true);
                c6441x2a3819af.K = i17;
                c6441x2a3819af.L = c6441x2a3819af.b("exptMsg", t17, true);
                c6441x2a3819af.k();
                java.lang.String n17 = c6441x2a3819af.n();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FavPostReporter", "report36784 ".concat(r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false)));
                pm0.v.X(new a82.g1(eb4Var));
            }
        }
        i17 = 0;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("enableFlutterNote", ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).wi());
        o72.d3 d3Var2 = o72.d3.f424854a;
        jSONObject3.put("enableMarkdownNote", d3Var2.b());
        jSONObject3.put("enableMarkdownNotePublish", d3Var2.c());
        java.lang.String jSONObject22 = jSONObject3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject22, "toString(...)");
        java.lang.String t172 = r26.i0.t(jSONObject22, ",", ";", false);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6441x2a3819af c6441x2a3819af2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6441x2a3819af();
        c6441x2a3819af2.f137811k = 2;
        long j172 = eb4Var.f454749d;
        c6441x2a3819af2.f137807g = j172;
        c6441x2a3819af2.f137803J = j172;
        c6441x2a3819af2.f137812l = eb4Var.f454750e;
        c6441x2a3819af2.f137804d = eb4Var.f454751f;
        c6441x2a3819af2.f137805e = eb4Var.f454752g;
        c6441x2a3819af2.f137806f = eb4Var.f454753h;
        c6441x2a3819af2.f137815o = eb4Var.f454758p;
        c6441x2a3819af2.f137816p = eb4Var.f454759q;
        c6441x2a3819af2.f137808h = c01.id.c() / 1000;
        c6441x2a3819af2.f137809i = eb4Var.f454754i;
        c6441x2a3819af2.I = eb4Var.f454748J;
        c6441x2a3819af2.f137813m = eb4Var.f454756n;
        c6441x2a3819af2.f137814n = eb4Var.f454757o;
        c6441x2a3819af2.f137810j = c6441x2a3819af2.b("errDataList", eb4Var.f454755m, true);
        c6441x2a3819af2.f137817q = eb4Var.f454760r;
        c6441x2a3819af2.f137818r = eb4Var.f454761s;
        c6441x2a3819af2.f137819s = eb4Var.f454762t;
        c6441x2a3819af2.f137820t = eb4Var.f454763u;
        c6441x2a3819af2.f137821u = eb4Var.f454764v;
        c6441x2a3819af2.f137822v = eb4Var.f454765w;
        c6441x2a3819af2.f137823w = eb4Var.f454766x;
        c6441x2a3819af2.f137825y = eb4Var.f454768z;
        c6441x2a3819af2.f137824x = c6441x2a3819af2.b("downloadFailDataId", eb4Var.f454767y, true);
        c6441x2a3819af2.f137826z = c6441x2a3819af2.b("downloadFailDataJson", eb4Var.A, true);
        c6441x2a3819af2.A = c6441x2a3819af2.b("downloadFailThumbJson", eb4Var.B, true);
        c6441x2a3819af2.B = eb4Var.C;
        c6441x2a3819af2.C = eb4Var.D;
        c6441x2a3819af2.D = c6441x2a3819af2.b("clientUploadResFailItemJson", eb4Var.E, true);
        c6441x2a3819af2.E = eb4Var.F;
        c6441x2a3819af2.F = eb4Var.G;
        c6441x2a3819af2.G = eb4Var.H;
        c6441x2a3819af2.H = c6441x2a3819af2.b("errExtraMsg", eb4Var.I, true);
        c6441x2a3819af2.K = i17;
        c6441x2a3819af2.L = c6441x2a3819af2.b("exptMsg", t172, true);
        c6441x2a3819af2.k();
        java.lang.String n172 = c6441x2a3819af2.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n172, "toShowString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FavPostReporter", "report36784 ".concat(r26.i0.t(n172, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false)));
        pm0.v.X(new a82.g1(eb4Var));
    }

    public final void d(o72.r2 favItem, boolean z17, int i17, int i18, java.lang.String str) {
        boolean z18;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favItem, "favItem");
        r45.fb4 fb4Var = f83579b;
        java.util.LinkedList list = fb4Var.f455702d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
        java.util.Iterator it = list.iterator();
        while (true) {
            z18 = true;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.eb4) obj).f454749d == favItem.f67645x88be67a1) {
                    break;
                }
            }
        }
        r45.eb4 eb4Var = (r45.eb4) obj;
        if (eb4Var == null) {
            eb4Var = new r45.eb4();
            eb4Var.f454749d = favItem.f67645x88be67a1;
            eb4Var.K = c01.id.c();
            eb4Var.f454750e = favItem.f67643xc8a07680;
            eb4Var.f454751f = favItem.f67657x2262335f;
            eb4Var.f454753h = favItem.f67651x76e81a5a;
            i(eb4Var, favItem.f67649xde813d09);
            eb4Var.f454748J = z17 ? 2 : 1;
            fb4Var.f455702d.add(eb4Var);
        }
        eb4Var.f454754i = z17 ? 5 : 4;
        eb4Var.f454756n = 4;
        eb4Var.f454757o = i18;
        if (str != null && str.length() != 0) {
            z18 = false;
        }
        if (!z18) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("cgiErrType", i17);
            jSONObject.put("cgiErrMsg", str);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            eb4Var.I = r26.i0.t(jSONObject2, ",", ";", false);
        }
        c(eb4Var);
    }

    public final void e(o72.r2 favItem, boolean z17, int i17) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favItem, "favItem");
        r45.fb4 fb4Var = f83579b;
        java.util.LinkedList list = fb4Var.f455702d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.eb4) obj).f454749d == favItem.f67645x88be67a1) {
                    break;
                }
            }
        }
        r45.eb4 eb4Var = (r45.eb4) obj;
        if (eb4Var == null) {
            eb4Var = new r45.eb4();
            eb4Var.f454749d = favItem.f67645x88be67a1;
            eb4Var.K = c01.id.c();
            eb4Var.f454750e = favItem.f67643xc8a07680;
            eb4Var.f454751f = favItem.f67657x2262335f;
            eb4Var.f454753h = favItem.f67651x76e81a5a;
            i(eb4Var, favItem.f67649xde813d09);
            eb4Var.f454748J = z17 ? 2 : 1;
            fb4Var.f455702d.add(eb4Var);
        }
        if (!z17) {
            eb4Var.f454750e = i17;
        }
        eb4Var.f454754i = z17 ? 5 : 4;
        eb4Var.f454756n = 1;
        int i18 = eb4Var.f454757o;
        if (i18 < 20000 || i18 >= 30000) {
            eb4Var.f454757o = 0;
        }
        c(eb4Var);
    }

    public final void f(o72.r2 favItem, int i17, java.lang.String str, int i18) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favItem, "favItem");
        r45.fb4 fb4Var = f83579b;
        java.util.LinkedList list = fb4Var.f455702d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.eb4) obj).f454749d == favItem.f67645x88be67a1) {
                    break;
                }
            }
        }
        r45.eb4 eb4Var = (r45.eb4) obj;
        if (eb4Var == null) {
            eb4Var = new r45.eb4();
            eb4Var.f454749d = favItem.f67645x88be67a1;
            eb4Var.K = c01.id.c();
            eb4Var.f454750e = favItem.f67643xc8a07680;
            eb4Var.f454751f = favItem.f67657x2262335f;
            eb4Var.f454753h = favItem.f67651x76e81a5a;
            eb4Var.f454760r = i18;
            i(eb4Var, favItem.f67649xde813d09);
            eb4Var.f454748J = eb4Var.f454750e != 0 ? 2 : 1;
            fb4Var.f455702d.add(eb4Var);
        }
        eb4Var.f454754i = 2;
        eb4Var.f454757o = i17;
        eb4Var.f454756n = 3;
        eb4Var.I = str;
        c(eb4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(o72.r2 favItem, int i17, boolean z17, r45.gp0 dataItem, java.util.List errDataList) {
        boolean z18;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favItem, "favItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errDataList, "errDataList");
        r45.fb4 fb4Var = f83579b;
        java.util.LinkedList list = fb4Var.f455702d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
        java.util.Iterator it = list.iterator();
        while (true) {
            z18 = true;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if ((((r45.eb4) obj).f454749d == favItem.f67645x88be67a1) != false) {
                    break;
                }
            }
        }
        r45.eb4 eb4Var = (r45.eb4) obj;
        if (eb4Var == null) {
            eb4Var = new r45.eb4();
            eb4Var.f454749d = favItem.f67645x88be67a1;
            eb4Var.K = c01.id.c();
            eb4Var.f454750e = favItem.f67643xc8a07680;
            eb4Var.f454751f = favItem.f67657x2262335f;
            eb4Var.f454753h = favItem.f67651x76e81a5a;
            i(eb4Var, favItem.f67649xde813d09);
            eb4Var.f454748J = eb4Var.f454750e != 0 ? 2 : 1;
            fb4Var.f455702d.add(eb4Var);
        }
        eb4Var.f454754i = 2;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it6 = errDataList.iterator();
        while (it6.hasNext()) {
            jSONArray.put(a82.y0.f83768a.c((a82.x0) it6.next()));
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
        eb4Var.f454755m = r26.i0.t(jSONArray2, ",", ";", false);
        eb4Var.f454768z = z17 ? 2 : 1;
        eb4Var.f454767y = dataItem.T;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String x17 = o72.x1.x(dataItem);
        jSONObject.put("dataExist", com.p314xaae8f345.mm.vfs.w6.j(x17) ? 1 : 0);
        jSONObject.put("dataPath", x17);
        java.lang.String str = dataItem.f456967s;
        jSONObject.put("dataUrl", (str == null || str.length() == 0) == false ? dataItem.f456967s : dataItem.f456944g2);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        eb4Var.A = r26.i0.t(jSONObject2, ",", ";", false);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        java.lang.String X = o72.x1.X(dataItem);
        jSONObject3.put("thumbExist", com.p314xaae8f345.mm.vfs.w6.j(X) ? 1 : 0);
        jSONObject3.put("thumbPath", X);
        java.lang.String str2 = dataItem.f456945h;
        if (str2 != null && str2.length() != 0) {
            z18 = false;
        }
        jSONObject3.put("thumbUrl", !z18 ? dataItem.f456945h : dataItem.f456938d2);
        java.lang.String jSONObject4 = jSONObject3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
        eb4Var.B = r26.i0.t(jSONObject4, ",", ";", false);
        eb4Var.f454756n = 3;
        eb4Var.f454757o = i17;
        c(eb4Var);
    }

    public final void h(o72.r2 favItem, boolean z17, boolean z18, int i17) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favItem, "favItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FavPostReporter", "startPost, localErrType=" + i17 + ", localId=" + favItem.f67645x88be67a1 + ", isMod=" + z17 + ", favId=" + favItem.f67643xc8a07680 + ", favType=" + favItem.f67657x2262335f + ", sourceType=" + favItem.f67651x76e81a5a + ',');
        r45.fb4 fb4Var = f83579b;
        java.util.LinkedList list = fb4Var.f455702d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.eb4) obj).f454749d == favItem.f67645x88be67a1) {
                    break;
                }
            }
        }
        r45.eb4 eb4Var = (r45.eb4) obj;
        if (eb4Var == null) {
            eb4Var = new r45.eb4();
            eb4Var.f454749d = favItem.f67645x88be67a1;
            eb4Var.K = c01.id.c();
            fb4Var.f455702d.add(eb4Var);
        }
        eb4Var.f454752g = z18 ? 1 : 0;
        eb4Var.f454750e = favItem.f67643xc8a07680;
        eb4Var.f454751f = favItem.f67657x2262335f;
        eb4Var.f454753h = favItem.f67651x76e81a5a;
        i(eb4Var, favItem.f67649xde813d09);
        eb4Var.f454754i = 1;
        eb4Var.f454748J = z17 ? 2 : 1;
        eb4Var.f454757o = b(i17);
        j();
    }

    public final void i(r45.eb4 eb4Var, long j17) {
        if (j17 > 1000000000000L) {
            j17 /= 1000;
        }
        eb4Var.f454758p = j17;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        eb4Var.f454759q = valueOf != null ? (java.lang.System.currentTimeMillis() / 1000) - valueOf.longValue() : 0L;
    }

    public final void j() {
        r45.fb4 fb4Var = f83579b;
        if (fb4Var.f455702d.isEmpty()) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FAV_POST_REPORT_LIST_STRING_SYNC, "");
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FAV_POST_REPORT_LIST_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(fb4Var.mo14344x5f01b1f6()));
        }
    }
}
