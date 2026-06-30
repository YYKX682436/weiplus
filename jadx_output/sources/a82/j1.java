package a82;

/* loaded from: classes12.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a82.j1 f2045a = new a82.j1();

    /* renamed from: b, reason: collision with root package name */
    public static final r45.fb4 f2046b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    static {
        /*
            a82.j1 r0 = new a82.j1
            r0.<init>()
            a82.j1.f2045a = r0
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r1 = com.tencent.mm.storage.u3.USERINFO_FAV_POST_REPORT_LIST_STRING_SYNC
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
            byte[] r5 = com.tencent.mm.sdk.platformtools.t8.h(r0)     // Catch: java.lang.Exception -> L38
            r4.parseFrom(r5)     // Catch: java.lang.Exception -> L38
            a82.j1.f2046b = r4     // Catch: java.lang.Exception -> L38
            goto L54
        L38:
            r4 = move-exception
            java.lang.String r5 = "parse pb fail, pbEncodeStr="
            java.lang.String r0 = r5.concat(r0)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r4, r0, r5)
            r45.fb4 r0 = new r45.fb4
            r0.<init>()
            a82.j1.f2046b = r0
            goto L54
        L4d:
            r45.fb4 r0 = new r45.fb4
            r0.<init>()
            a82.j1.f2046b = r0
        L54:
            r45.fb4 r0 = a82.j1.f2046b
            java.util.LinkedList r4 = r0.f374169d
            int r4 = r4.size()
            r5 = 100
            if (r4 <= r5) goto Lba
            java.util.LinkedList r4 = r0.f374169d
            java.lang.String r6 = "list"
            kotlin.jvm.internal.o.f(r4, r6)
            int r6 = r4.size()
            if (r6 <= r2) goto L76
            a82.i1 r2 = new a82.i1
            r2.<init>()
            kz5.g0.t(r4, r2)
        L76:
            java.util.LinkedList r2 = r0.f374169d
            int r2 = r2.size()
            int r2 = r2 - r5
            if (r2 <= 0) goto L99
            java.util.LinkedList r0 = r0.f374169d
            int r0 = r0.size()
            if (r0 <= 0) goto L99
            r0 = r3
        L88:
            if (r0 >= r2) goto L94
            r45.fb4 r4 = a82.j1.f2046b
            java.util.LinkedList r4 = r4.f374169d
            r4.remove(r3)
            int r0 = r0 + 1
            goto L88
        L94:
            a82.j1 r0 = a82.j1.f2045a
            r0.j()
        L99:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "init: removeCount="
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r2 = ", localFavPostReportList.size="
            r0.append(r2)
            r45.fb4 r2 = a82.j1.f2046b
            java.util.LinkedList r2 = r2.f374169d
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r1, r0)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a82.j1.<clinit>():void");
    }

    public final void a(o72.r2 favItem, int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(favItem, "favItem");
        com.tencent.mars.xlog.Log.i("FavPostReporter", "checkCDNResult: localId=" + favItem.field_localId + ", favId=" + favItem.field_id + ", checkResCnt=" + i17 + ", checkResSuccessTotalCnt=" + i18 + ", checkResFailTotalCnt=" + i19 + ", checkResSvrUploadedCnt=" + i27 + ", checkResSvrUploadingCnt=" + i28 + ", checkResSvrNotExistCnt=" + i29 + ", checkResCgiFailCnt=" + i37);
        r45.fb4 fb4Var = f2046b;
        java.util.LinkedList list = fb4Var.f374169d;
        kotlin.jvm.internal.o.f(list, "list");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.eb4) obj).f373216d == favItem.field_localId) {
                    break;
                }
            }
        }
        r45.eb4 eb4Var = (r45.eb4) obj;
        if (eb4Var == null) {
            eb4Var = new r45.eb4();
            eb4Var.f373216d = favItem.field_localId;
            eb4Var.K = c01.id.c();
            eb4Var.f373217e = favItem.field_id;
            eb4Var.f373218f = favItem.field_type;
            eb4Var.f373220h = favItem.field_sourceType;
            i(eb4Var, favItem.field_sourceCreateTime);
            eb4Var.f373215J = eb4Var.f373217e != 0 ? 2 : 1;
            fb4Var.f374169d.add(eb4Var);
        }
        eb4Var.f373221i = 2;
        eb4Var.f373227r = i17;
        eb4Var.f373228s = i18;
        eb4Var.f373229t = i19;
        eb4Var.f373230u = i27;
        eb4Var.f373231v = i28;
        eb4Var.f373232w = i29;
        eb4Var.f373233x = i37;
        pm0.v.X(a82.e1.f1987d);
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
        if (eb4Var.f373218f == 18 && (F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(eb4Var.f373216d)) != null && (bq0Var = F.field_favProto) != null && (linkedList = bq0Var.f370964f) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((r45.gp0) obj).P1, "WeNoteHtmlFile")) {
                        break;
                    }
                }
            }
            r45.gp0 gp0Var = (r45.gp0) obj;
            if (gp0Var != null) {
                java.lang.String str = gp0Var.K;
                if (kotlin.jvm.internal.o.b(str, ".htm")) {
                    i17 = 1;
                } else if (kotlin.jvm.internal.o.b(str, ".md")) {
                    i17 = 2;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("enableFlutterNote", ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).wi());
                o72.d3 d3Var = o72.d3.f343321a;
                jSONObject.put("enableMarkdownNote", d3Var.b());
                jSONObject.put("enableMarkdownNotePublish", d3Var.c());
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
                com.tencent.mm.autogen.mmdata.rpt.FavFlowFailedReportStruct favFlowFailedReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FavFlowFailedReportStruct();
                favFlowFailedReportStruct.f56278k = 2;
                long j17 = eb4Var.f373216d;
                favFlowFailedReportStruct.f56274g = j17;
                favFlowFailedReportStruct.f56270J = j17;
                favFlowFailedReportStruct.f56279l = eb4Var.f373217e;
                favFlowFailedReportStruct.f56271d = eb4Var.f373218f;
                favFlowFailedReportStruct.f56272e = eb4Var.f373219g;
                favFlowFailedReportStruct.f56273f = eb4Var.f373220h;
                favFlowFailedReportStruct.f56282o = eb4Var.f373225p;
                favFlowFailedReportStruct.f56283p = eb4Var.f373226q;
                favFlowFailedReportStruct.f56275h = c01.id.c() / 1000;
                favFlowFailedReportStruct.f56276i = eb4Var.f373221i;
                favFlowFailedReportStruct.I = eb4Var.f373215J;
                favFlowFailedReportStruct.f56280m = eb4Var.f373223n;
                favFlowFailedReportStruct.f56281n = eb4Var.f373224o;
                favFlowFailedReportStruct.f56277j = favFlowFailedReportStruct.b("errDataList", eb4Var.f373222m, true);
                favFlowFailedReportStruct.f56284q = eb4Var.f373227r;
                favFlowFailedReportStruct.f56285r = eb4Var.f373228s;
                favFlowFailedReportStruct.f56286s = eb4Var.f373229t;
                favFlowFailedReportStruct.f56287t = eb4Var.f373230u;
                favFlowFailedReportStruct.f56288u = eb4Var.f373231v;
                favFlowFailedReportStruct.f56289v = eb4Var.f373232w;
                favFlowFailedReportStruct.f56290w = eb4Var.f373233x;
                favFlowFailedReportStruct.f56292y = eb4Var.f373235z;
                favFlowFailedReportStruct.f56291x = favFlowFailedReportStruct.b("downloadFailDataId", eb4Var.f373234y, true);
                favFlowFailedReportStruct.f56293z = favFlowFailedReportStruct.b("downloadFailDataJson", eb4Var.A, true);
                favFlowFailedReportStruct.A = favFlowFailedReportStruct.b("downloadFailThumbJson", eb4Var.B, true);
                favFlowFailedReportStruct.B = eb4Var.C;
                favFlowFailedReportStruct.C = eb4Var.D;
                favFlowFailedReportStruct.D = favFlowFailedReportStruct.b("clientUploadResFailItemJson", eb4Var.E, true);
                favFlowFailedReportStruct.E = eb4Var.F;
                favFlowFailedReportStruct.F = eb4Var.G;
                favFlowFailedReportStruct.G = eb4Var.H;
                favFlowFailedReportStruct.H = favFlowFailedReportStruct.b("errExtraMsg", eb4Var.I, true);
                favFlowFailedReportStruct.K = i17;
                favFlowFailedReportStruct.L = favFlowFailedReportStruct.b("exptMsg", t17, true);
                favFlowFailedReportStruct.k();
                java.lang.String n17 = favFlowFailedReportStruct.n();
                kotlin.jvm.internal.o.f(n17, "toShowString(...)");
                com.tencent.mars.xlog.Log.i("FavPostReporter", "report36784 ".concat(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false)));
                pm0.v.X(new a82.g1(eb4Var));
            }
        }
        i17 = 0;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("enableFlutterNote", ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).wi());
        o72.d3 d3Var2 = o72.d3.f343321a;
        jSONObject3.put("enableMarkdownNote", d3Var2.b());
        jSONObject3.put("enableMarkdownNotePublish", d3Var2.c());
        java.lang.String jSONObject22 = jSONObject3.toString();
        kotlin.jvm.internal.o.f(jSONObject22, "toString(...)");
        java.lang.String t172 = r26.i0.t(jSONObject22, ",", ";", false);
        com.tencent.mm.autogen.mmdata.rpt.FavFlowFailedReportStruct favFlowFailedReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.FavFlowFailedReportStruct();
        favFlowFailedReportStruct2.f56278k = 2;
        long j172 = eb4Var.f373216d;
        favFlowFailedReportStruct2.f56274g = j172;
        favFlowFailedReportStruct2.f56270J = j172;
        favFlowFailedReportStruct2.f56279l = eb4Var.f373217e;
        favFlowFailedReportStruct2.f56271d = eb4Var.f373218f;
        favFlowFailedReportStruct2.f56272e = eb4Var.f373219g;
        favFlowFailedReportStruct2.f56273f = eb4Var.f373220h;
        favFlowFailedReportStruct2.f56282o = eb4Var.f373225p;
        favFlowFailedReportStruct2.f56283p = eb4Var.f373226q;
        favFlowFailedReportStruct2.f56275h = c01.id.c() / 1000;
        favFlowFailedReportStruct2.f56276i = eb4Var.f373221i;
        favFlowFailedReportStruct2.I = eb4Var.f373215J;
        favFlowFailedReportStruct2.f56280m = eb4Var.f373223n;
        favFlowFailedReportStruct2.f56281n = eb4Var.f373224o;
        favFlowFailedReportStruct2.f56277j = favFlowFailedReportStruct2.b("errDataList", eb4Var.f373222m, true);
        favFlowFailedReportStruct2.f56284q = eb4Var.f373227r;
        favFlowFailedReportStruct2.f56285r = eb4Var.f373228s;
        favFlowFailedReportStruct2.f56286s = eb4Var.f373229t;
        favFlowFailedReportStruct2.f56287t = eb4Var.f373230u;
        favFlowFailedReportStruct2.f56288u = eb4Var.f373231v;
        favFlowFailedReportStruct2.f56289v = eb4Var.f373232w;
        favFlowFailedReportStruct2.f56290w = eb4Var.f373233x;
        favFlowFailedReportStruct2.f56292y = eb4Var.f373235z;
        favFlowFailedReportStruct2.f56291x = favFlowFailedReportStruct2.b("downloadFailDataId", eb4Var.f373234y, true);
        favFlowFailedReportStruct2.f56293z = favFlowFailedReportStruct2.b("downloadFailDataJson", eb4Var.A, true);
        favFlowFailedReportStruct2.A = favFlowFailedReportStruct2.b("downloadFailThumbJson", eb4Var.B, true);
        favFlowFailedReportStruct2.B = eb4Var.C;
        favFlowFailedReportStruct2.C = eb4Var.D;
        favFlowFailedReportStruct2.D = favFlowFailedReportStruct2.b("clientUploadResFailItemJson", eb4Var.E, true);
        favFlowFailedReportStruct2.E = eb4Var.F;
        favFlowFailedReportStruct2.F = eb4Var.G;
        favFlowFailedReportStruct2.G = eb4Var.H;
        favFlowFailedReportStruct2.H = favFlowFailedReportStruct2.b("errExtraMsg", eb4Var.I, true);
        favFlowFailedReportStruct2.K = i17;
        favFlowFailedReportStruct2.L = favFlowFailedReportStruct2.b("exptMsg", t172, true);
        favFlowFailedReportStruct2.k();
        java.lang.String n172 = favFlowFailedReportStruct2.n();
        kotlin.jvm.internal.o.f(n172, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("FavPostReporter", "report36784 ".concat(r26.i0.t(n172, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false)));
        pm0.v.X(new a82.g1(eb4Var));
    }

    public final void d(o72.r2 favItem, boolean z17, int i17, int i18, java.lang.String str) {
        boolean z18;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(favItem, "favItem");
        r45.fb4 fb4Var = f2046b;
        java.util.LinkedList list = fb4Var.f374169d;
        kotlin.jvm.internal.o.f(list, "list");
        java.util.Iterator it = list.iterator();
        while (true) {
            z18 = true;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.eb4) obj).f373216d == favItem.field_localId) {
                    break;
                }
            }
        }
        r45.eb4 eb4Var = (r45.eb4) obj;
        if (eb4Var == null) {
            eb4Var = new r45.eb4();
            eb4Var.f373216d = favItem.field_localId;
            eb4Var.K = c01.id.c();
            eb4Var.f373217e = favItem.field_id;
            eb4Var.f373218f = favItem.field_type;
            eb4Var.f373220h = favItem.field_sourceType;
            i(eb4Var, favItem.field_sourceCreateTime);
            eb4Var.f373215J = z17 ? 2 : 1;
            fb4Var.f374169d.add(eb4Var);
        }
        eb4Var.f373221i = z17 ? 5 : 4;
        eb4Var.f373223n = 4;
        eb4Var.f373224o = i18;
        if (str != null && str.length() != 0) {
            z18 = false;
        }
        if (!z18) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("cgiErrType", i17);
            jSONObject.put("cgiErrMsg", str);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            eb4Var.I = r26.i0.t(jSONObject2, ",", ";", false);
        }
        c(eb4Var);
    }

    public final void e(o72.r2 favItem, boolean z17, int i17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(favItem, "favItem");
        r45.fb4 fb4Var = f2046b;
        java.util.LinkedList list = fb4Var.f374169d;
        kotlin.jvm.internal.o.f(list, "list");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.eb4) obj).f373216d == favItem.field_localId) {
                    break;
                }
            }
        }
        r45.eb4 eb4Var = (r45.eb4) obj;
        if (eb4Var == null) {
            eb4Var = new r45.eb4();
            eb4Var.f373216d = favItem.field_localId;
            eb4Var.K = c01.id.c();
            eb4Var.f373217e = favItem.field_id;
            eb4Var.f373218f = favItem.field_type;
            eb4Var.f373220h = favItem.field_sourceType;
            i(eb4Var, favItem.field_sourceCreateTime);
            eb4Var.f373215J = z17 ? 2 : 1;
            fb4Var.f374169d.add(eb4Var);
        }
        if (!z17) {
            eb4Var.f373217e = i17;
        }
        eb4Var.f373221i = z17 ? 5 : 4;
        eb4Var.f373223n = 1;
        int i18 = eb4Var.f373224o;
        if (i18 < 20000 || i18 >= 30000) {
            eb4Var.f373224o = 0;
        }
        c(eb4Var);
    }

    public final void f(o72.r2 favItem, int i17, java.lang.String str, int i18) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(favItem, "favItem");
        r45.fb4 fb4Var = f2046b;
        java.util.LinkedList list = fb4Var.f374169d;
        kotlin.jvm.internal.o.f(list, "list");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.eb4) obj).f373216d == favItem.field_localId) {
                    break;
                }
            }
        }
        r45.eb4 eb4Var = (r45.eb4) obj;
        if (eb4Var == null) {
            eb4Var = new r45.eb4();
            eb4Var.f373216d = favItem.field_localId;
            eb4Var.K = c01.id.c();
            eb4Var.f373217e = favItem.field_id;
            eb4Var.f373218f = favItem.field_type;
            eb4Var.f373220h = favItem.field_sourceType;
            eb4Var.f373227r = i18;
            i(eb4Var, favItem.field_sourceCreateTime);
            eb4Var.f373215J = eb4Var.f373217e != 0 ? 2 : 1;
            fb4Var.f374169d.add(eb4Var);
        }
        eb4Var.f373221i = 2;
        eb4Var.f373224o = i17;
        eb4Var.f373223n = 3;
        eb4Var.I = str;
        c(eb4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(o72.r2 favItem, int i17, boolean z17, r45.gp0 dataItem, java.util.List errDataList) {
        boolean z18;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(favItem, "favItem");
        kotlin.jvm.internal.o.g(dataItem, "dataItem");
        kotlin.jvm.internal.o.g(errDataList, "errDataList");
        r45.fb4 fb4Var = f2046b;
        java.util.LinkedList list = fb4Var.f374169d;
        kotlin.jvm.internal.o.f(list, "list");
        java.util.Iterator it = list.iterator();
        while (true) {
            z18 = true;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if ((((r45.eb4) obj).f373216d == favItem.field_localId) != false) {
                    break;
                }
            }
        }
        r45.eb4 eb4Var = (r45.eb4) obj;
        if (eb4Var == null) {
            eb4Var = new r45.eb4();
            eb4Var.f373216d = favItem.field_localId;
            eb4Var.K = c01.id.c();
            eb4Var.f373217e = favItem.field_id;
            eb4Var.f373218f = favItem.field_type;
            eb4Var.f373220h = favItem.field_sourceType;
            i(eb4Var, favItem.field_sourceCreateTime);
            eb4Var.f373215J = eb4Var.f373217e != 0 ? 2 : 1;
            fb4Var.f374169d.add(eb4Var);
        }
        eb4Var.f373221i = 2;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it6 = errDataList.iterator();
        while (it6.hasNext()) {
            jSONArray.put(a82.y0.f2235a.c((a82.x0) it6.next()));
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
        eb4Var.f373222m = r26.i0.t(jSONArray2, ",", ";", false);
        eb4Var.f373235z = z17 ? 2 : 1;
        eb4Var.f373234y = dataItem.T;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String x17 = o72.x1.x(dataItem);
        jSONObject.put("dataExist", com.tencent.mm.vfs.w6.j(x17) ? 1 : 0);
        jSONObject.put("dataPath", x17);
        java.lang.String str = dataItem.f375434s;
        jSONObject.put("dataUrl", (str == null || str.length() == 0) == false ? dataItem.f375434s : dataItem.f375411g2);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        eb4Var.A = r26.i0.t(jSONObject2, ",", ";", false);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        java.lang.String X = o72.x1.X(dataItem);
        jSONObject3.put("thumbExist", com.tencent.mm.vfs.w6.j(X) ? 1 : 0);
        jSONObject3.put("thumbPath", X);
        java.lang.String str2 = dataItem.f375412h;
        if (str2 != null && str2.length() != 0) {
            z18 = false;
        }
        jSONObject3.put("thumbUrl", !z18 ? dataItem.f375412h : dataItem.f375405d2);
        java.lang.String jSONObject4 = jSONObject3.toString();
        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
        eb4Var.B = r26.i0.t(jSONObject4, ",", ";", false);
        eb4Var.f373223n = 3;
        eb4Var.f373224o = i17;
        c(eb4Var);
    }

    public final void h(o72.r2 favItem, boolean z17, boolean z18, int i17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(favItem, "favItem");
        com.tencent.mars.xlog.Log.i("FavPostReporter", "startPost, localErrType=" + i17 + ", localId=" + favItem.field_localId + ", isMod=" + z17 + ", favId=" + favItem.field_id + ", favType=" + favItem.field_type + ", sourceType=" + favItem.field_sourceType + ',');
        r45.fb4 fb4Var = f2046b;
        java.util.LinkedList list = fb4Var.f374169d;
        kotlin.jvm.internal.o.f(list, "list");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.eb4) obj).f373216d == favItem.field_localId) {
                    break;
                }
            }
        }
        r45.eb4 eb4Var = (r45.eb4) obj;
        if (eb4Var == null) {
            eb4Var = new r45.eb4();
            eb4Var.f373216d = favItem.field_localId;
            eb4Var.K = c01.id.c();
            fb4Var.f374169d.add(eb4Var);
        }
        eb4Var.f373219g = z18 ? 1 : 0;
        eb4Var.f373217e = favItem.field_id;
        eb4Var.f373218f = favItem.field_type;
        eb4Var.f373220h = favItem.field_sourceType;
        i(eb4Var, favItem.field_sourceCreateTime);
        eb4Var.f373221i = 1;
        eb4Var.f373215J = z17 ? 2 : 1;
        eb4Var.f373224o = b(i17);
        j();
    }

    public final void i(r45.eb4 eb4Var, long j17) {
        if (j17 > 1000000000000L) {
            j17 /= 1000;
        }
        eb4Var.f373225p = j17;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        eb4Var.f373226q = valueOf != null ? (java.lang.System.currentTimeMillis() / 1000) - valueOf.longValue() : 0L;
    }

    public final void j() {
        r45.fb4 fb4Var = f2046b;
        if (fb4Var.f374169d.isEmpty()) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FAV_POST_REPORT_LIST_STRING_SYNC, "");
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FAV_POST_REPORT_LIST_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(fb4Var.toByteArray()));
        }
    }
}
