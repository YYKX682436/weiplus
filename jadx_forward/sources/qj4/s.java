package qj4;

/* loaded from: classes11.dex */
public final class s {

    /* renamed from: a */
    public static final qj4.s f445491a = new qj4.s();

    public static void l(qj4.s sVar, long j17, java.lang.String str, java.lang.String str2, long j18, java.lang.String str3, long j19, int i17, java.lang.Object obj) {
        java.lang.String sessionId;
        java.lang.String actionResult = (i17 & 2) != 0 ? "" : str;
        if ((i17 & 4) != 0) {
            pj4.p0 d17 = sVar.d();
            sessionId = d17 != null ? d17.f436769d : null;
            if (sessionId == null) {
                sessionId = "";
            }
        } else {
            sessionId = str2;
        }
        long j27 = (i17 & 8) != 0 ? 0L : j18;
        java.lang.String str4 = (i17 & 16) == 0 ? str3 : "";
        long j28 = (i17 & 32) == 0 ? j19 : 0L;
        sVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionResult, "actionResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.TextStatus.tsReport", "report22208: action=" + j17 + ", actionResult=" + actionResult + ", btnStyle=" + j27 + ", redDotType=" + j28, new java.lang.Object[0]);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6967x6022b87e c6967x6022b87e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6967x6022b87e();
        c6967x6022b87e.f142758e = j17;
        c6967x6022b87e.f142759f = c6967x6022b87e.b("ActionResult", r26.i0.u(actionResult, ',', ';', false, 4, null), true);
        c6967x6022b87e.f142760g = c01.id.c();
        c6967x6022b87e.f142757d = c6967x6022b87e.b("SessionID", sessionId, true);
        c6967x6022b87e.f142765l = c6967x6022b87e.b("SceneSessionID", ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ai(), true);
        c6967x6022b87e.f142766m = c6967x6022b87e.b("PageID", ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).wi(), true);
        c6967x6022b87e.f142761h = j27;
        c6967x6022b87e.f142762i = c6967x6022b87e.b("ToStatusID", str4, true);
        c6967x6022b87e.f142763j = j28;
        c6967x6022b87e.k();
        f445491a.y(c6967x6022b87e);
    }

    public static void m(qj4.s sVar, android.content.Context context, long j17, java.lang.String str, mj4.h hVar, long j18, long j19, long j27, long j28, java.lang.Integer num, java.lang.String str2, long j29, int i17, java.lang.Object obj) {
        java.lang.String actionResult = (i17 & 4) != 0 ? "" : str;
        mj4.h hVar2 = (i17 & 8) != 0 ? null : hVar;
        long j37 = (i17 & 16) != 0 ? 0L : j18;
        long j38 = (i17 & 32) != 0 ? 0L : j19;
        long j39 = (i17 & 64) != 0 ? -1L : j27;
        long j47 = (i17 & 128) != 0 ? 0L : j28;
        java.lang.Integer num2 = (i17 & 256) != 0 ? 0 : num;
        java.lang.String statusOwnerUserName = (i17 & 512) == 0 ? str2 : "";
        long j48 = (i17 & 1024) != 0 ? 0L : j29;
        sVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionResult, "actionResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusOwnerUserName, "statusOwnerUserName");
        ((ku5.t0) ku5.t0.f394148d).g(new qj4.r(context, j17, actionResult, hVar2, j37, j38, j39, j47, num2, statusOwnerUserName, j48));
    }

    public static void n(qj4.s sVar, long j17, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, long j18, long j19, java.lang.String str5, java.lang.Integer num, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i19, java.lang.Object obj) {
        java.lang.String sessionId;
        java.lang.String str9;
        long j27;
        long j28;
        java.lang.String iconId = (i19 & 2) != 0 ? "" : str;
        int i27 = (i19 & 4) != 0 ? 0 : i17;
        java.lang.String toUserName = (i19 & 8) != 0 ? "" : str2;
        java.lang.String uvPerIcon = (i19 & 16) != 0 ? "" : str3;
        if ((i19 & 32) != 0) {
            pj4.p0 d17 = sVar.d();
            sessionId = d17 != null ? d17.f436769d : null;
            if (sessionId == null) {
                sessionId = "";
            }
        } else {
            sessionId = str4;
        }
        int i28 = (i19 & 64) != 0 ? 0 : i18;
        long j29 = (i19 & 128) != 0 ? 0L : j18;
        long j37 = (i19 & 256) != 0 ? 0L : j19;
        java.lang.String str10 = (i19 & 512) != 0 ? null : str5;
        java.lang.Integer num2 = (i19 & 1024) == 0 ? num : null;
        java.lang.String contentList = (i19 & 2048) != 0 ? "" : str6;
        java.lang.String actionResult = (i19 & 4096) != 0 ? "" : str7;
        java.lang.String myStatusList = (i19 & 8192) != 0 ? "" : str8;
        sVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconId, "iconId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUserName, "toUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uvPerIcon, "uvPerIcon");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentList, "contentList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionResult, "actionResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(myStatusList, "myStatusList");
        java.lang.String str11 = myStatusList;
        mj4.h M = ai4.m0.f86706a.M(en1.a.a());
        java.lang.String h17 = M != null ? ((mj4.k) M).h() : "";
        if (r26.n0.N(iconId) || r26.n0.N(h17) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iconId, h17)) {
            str9 = str10;
            j27 = j37;
            j28 = 0;
        } else {
            str9 = str10;
            j28 = 1;
            j27 = j37;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6958x60bb3140 c6958x60bb3140 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6958x60bb3140();
        java.lang.Integer num3 = num2;
        c6958x60bb3140.f142651e = j17;
        c6958x60bb3140.f142652f = c6958x60bb3140.b("IconID", iconId, true);
        c6958x60bb3140.f142654h = i27;
        c6958x60bb3140.f142653g = c6958x60bb3140.b("ToUsername", toUserName, true);
        c6958x60bb3140.f142655i = c6958x60bb3140.b("UvPerIcon", uvPerIcon, true);
        c6958x60bb3140.f142656j = i28;
        c6958x60bb3140.f142658l = j28;
        c6958x60bb3140.f142660n = j29;
        c6958x60bb3140.f142650d = c6958x60bb3140.b("SessionID", sessionId, true);
        c6958x60bb3140.f142659m = c6958x60bb3140.b("SceneSessionID", ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ai(), true);
        c6958x60bb3140.f142657k = j27;
        c6958x60bb3140.f142661o = sVar.b();
        c6958x60bb3140.f142663q = num3 != null ? num3.intValue() : -1L;
        c6958x60bb3140.f142662p = c6958x60bb3140.b("CustomTitle", str9, true);
        c6958x60bb3140.f142664r = c6958x60bb3140.b("ContentList", contentList, true);
        c6958x60bb3140.f142665s = c6958x60bb3140.b("ActionResult", r26.i0.u(actionResult, ',', ';', false, 4, null), true);
        c6958x60bb3140.f142666t = c6958x60bb3140.b("MyStatusList", r26.i0.t(str11, ",", ";", false), true);
        c6958x60bb3140.k();
        f445491a.y(c6958x60bb3140);
    }

    public static void o(qj4.s sVar, long j17, java.lang.String str, java.lang.String NotificationSessionID, int i17, java.lang.String str2, int i18, int i19, int i27, int i28, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i29, java.lang.Object obj) {
        java.lang.String SessionID;
        java.lang.String str8 = (i29 & 2) != 0 ? "" : str;
        int i37 = (i29 & 8) != 0 ? 0 : i17;
        if ((i29 & 16) != 0) {
            pj4.p0 d17 = sVar.d();
            SessionID = d17 != null ? d17.f436769d : null;
            if (SessionID == null) {
                SessionID = "";
            }
        } else {
            SessionID = str2;
        }
        int i38 = (i29 & 32) != 0 ? 0 : i18;
        int i39 = (i29 & 64) != 0 ? 0 : i19;
        int i47 = (i29 & 128) != 0 ? 0 : i27;
        int i48 = (i29 & 256) == 0 ? i28 : 0;
        java.lang.String ToUserSessionID = (i29 & 512) != 0 ? "" : str3;
        java.lang.String ToUserIconID = (i29 & 1024) != 0 ? "" : str4;
        java.lang.String ToUserSourceID = (i29 & 2048) != 0 ? "" : str5;
        java.lang.String ToUserHashTag = (i29 & 4096) != 0 ? "" : str6;
        java.lang.String ToUserStatusID = (i29 & 8192) != 0 ? "" : str7;
        sVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(NotificationSessionID, "NotificationSessionID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(SessionID, "SessionID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ToUserSessionID, "ToUserSessionID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ToUserIconID, "ToUserIconID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ToUserSourceID, "ToUserSourceID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ToUserHashTag, "ToUserHashTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ToUserStatusID, "ToUserStatusID");
        java.lang.String str9 = ToUserStatusID;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6966x661db9cc c6966x661db9cc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6966x661db9cc();
        c6966x661db9cc.f142743f = j17;
        c6966x661db9cc.f142745h = c01.id.c();
        c6966x661db9cc.f142744g = c6966x661db9cc.b("ActionResult", str8, true);
        c6966x661db9cc.f142742e = c6966x661db9cc.b("NotificationSessionID", NotificationSessionID, true);
        c6966x661db9cc.f142746i = i37;
        c6966x661db9cc.f142741d = c6966x661db9cc.b("SessionID", SessionID, true);
        c6966x661db9cc.f142747j = i38;
        c6966x661db9cc.f142748k = i39;
        c6966x661db9cc.f142749l = i47;
        c6966x661db9cc.f142750m = i48;
        c6966x661db9cc.f142751n = c6966x661db9cc.b("ToUserSessionID", ToUserSessionID, true);
        c6966x661db9cc.f142752o = c6966x661db9cc.b("ToUserIconID", ToUserIconID, true);
        c6966x661db9cc.f142753p = c6966x661db9cc.b("ToUserSourceID", ToUserSourceID, true);
        c6966x661db9cc.f142754q = c6966x661db9cc.b("ToUserHashTag", ToUserHashTag, true);
        c6966x661db9cc.f142755r = c6966x661db9cc.b("ToUserStatusID", str9, true);
        mj4.h M = ai4.m0.f86706a.M(en1.a.a());
        c6966x661db9cc.f142756s = c6966x661db9cc.b("MyCurrentStatusID", M != null ? ((mj4.k) M).l() : "", true);
        c6966x661db9cc.k();
        sVar.y(c6966x661db9cc);
    }

    public static void p(qj4.s sVar, long j17, long j18, java.lang.String SessionID, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            j18 = 0;
        }
        if ((i17 & 4) != 0) {
            pj4.p0 d17 = sVar.d();
            SessionID = d17 != null ? d17.f436769d : null;
            if (SessionID == null) {
                SessionID = "";
            }
        }
        sVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(SessionID, "SessionID");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6965xcd1181b5 c6965xcd1181b5 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6965xcd1181b5();
        c6965xcd1181b5.f142739f = j17;
        c6965xcd1181b5.f142740g = j18;
        c6965xcd1181b5.f142737d = c6965xcd1181b5.b("SessionID", SessionID, true);
        c6965xcd1181b5.f142738e = c6965xcd1181b5.b("SceneSessionID", ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ai(), true);
        c6965xcd1181b5.k();
        sVar.y(c6965xcd1181b5);
    }

    public static /* synthetic */ void s(qj4.s sVar, long j17, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, int i17, java.lang.Object obj) {
        sVar.r(j17, (i17 & 2) != 0 ? null : num, (i17 & 4) != 0 ? null : num2, (i17 & 8) != 0 ? null : str, (i17 & 16) != 0 ? null : l17, (i17 & 32) != 0 ? null : l18, (i17 & 64) != 0 ? null : l19);
    }

    public final void a(android.view.View view, qj4.l reportObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportObj, "reportObj");
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.tsReport", "configReportPublishEntranceViewExpose: err");
            return;
        }
        java.util.Map g17 = g(reportObj);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "status_publish_entrance");
        aVar.ik(view, 32, 33629);
        aVar.gk(view, g17);
    }

    public final long b() {
        if (bk4.i.a().K()) {
            return 4L;
        }
        if (bk4.i.a().y()) {
            return 5L;
        }
        if (bk4.i.a().G()) {
            return 3L;
        }
        return (bk4.i.a().I() || bk4.i.a().E() || bk4.i.a().F() || bk4.i.a().z() || bk4.i.a().x()) ? 2L : 1L;
    }

    public final long c(cj4.q1 profileOpenState, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(profileOpenState, "profileOpenState");
        if (profileOpenState == cj4.q1.f123553d) {
            if (z17) {
                return 24L;
            }
            return !z18 ? 3L : 23L;
        }
        if (z17) {
            return 6L;
        }
        return !z18 ? 3L : 4L;
    }

    public final pj4.p0 d() {
        try {
            return (pj4.p0) ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).wi(9, "TextStatusCardExposed");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final long e() {
        if (bk4.i.a().J()) {
            return 2L;
        }
        if (bk4.i.a().I()) {
            return 3L;
        }
        if (bk4.i.a().G()) {
            return 4L;
        }
        if (bk4.i.a().x()) {
            return 5L;
        }
        if (bk4.i.a().y()) {
            return 6L;
        }
        return bk4.i.a().z() ? 7L : 1L;
    }

    public final bw5.jn0 f(int i17, cj4.q1 profileOpenState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(profileOpenState, "profileOpenState");
        return i17 != 5 ? i17 != 8 ? i17 != 9 ? bw5.jn0.STATUS_UNKNOWN : bw5.jn0.STATUS_HISTORY_CARD : bw5.jn0.STATUS_SQUARE_CARD : profileOpenState == cj4.q1.f123554e ? bw5.jn0.STATUS_ME_PROFILE_PULL_DOWN : bw5.jn0.STATUS_ME_PROFILE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map g(qj4.l r13) {
        /*
            r12 = this;
            java.lang.String r0 = "reportObj"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            di4.i r0 = di4.i.f314315a
            qi4.p r0 = qi4.p.f445309a
            boolean r0 = r0.d()
            r1 = 2
            r2 = 0
            r3 = 1
            long r4 = r13.f445462c
            if (r0 == 0) goto L29
            r6 = 5
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L24
            r6 = 24
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L22
            goto L24
        L22:
            r0 = r2
            goto L25
        L24:
            r0 = r3
        L25:
            if (r0 != 0) goto L29
            r0 = r1
            goto L2a
        L29:
            r0 = r3
        L2a:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            jz5.l r5 = new jz5.l
            java.lang.String r6 = "publish_enterscene"
            r5.<init>(r6, r4)
            jz5.l r6 = new jz5.l
            java.lang.String r4 = "wx_username"
            java.lang.String r11 = r13.f445460a
            r6.<init>(r4, r11)
            jz5.l r7 = new jz5.l
            java.lang.String r4 = "textstatusid"
            java.lang.String r8 = r13.f445463d
            r7.<init>(r4, r8)
            jz5.l r8 = new jz5.l
            java.lang.String r4 = "status_sid"
            java.lang.String r9 = r13.f445464e
            r8.<init>(r4, r9)
            bw5.jn0 r4 = r13.f445465f
            int r4 = r4.f110589d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            jz5.l r9 = new jz5.l
            java.lang.String r10 = "status_2ndscene"
            r9.<init>(r10, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            jz5.l r10 = new jz5.l
            java.lang.String r4 = "publish_page_version"
            r10.<init>(r4, r0)
            jz5.l[] r0 = new jz5.l[]{r5, r6, r7, r8, r9, r10}
            java.util.Map r0 = kz5.c1.l(r0)
            boolean r4 = r13.f445461b
            java.lang.String r5 = "status_view_state"
            if (r4 == 0) goto L93
            java.lang.String r2 = en1.a.a()
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r11, r2)
            if (r2 == 0) goto L8a
            goto L8b
        L8a:
            r1 = r3
        L8b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r5, r1)
            goto L9a
        L93:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.put(r5, r1)
        L9a:
            java.util.Map r13 = r13.f445466g
            if (r13 == 0) goto La1
            r0.putAll(r13)
        La1:
            r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qj4.s.g(qj4.l):java.util.Map");
    }

    public final int h(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = context instanceof android.app.Activity ? ((android.app.Activity) context).getIntent() : null;
        int intExtra = intent != null ? intent.getIntExtra("CONTACT_INFO_UI_SOURCE", 0) : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.tsReport", "profileReferPath:" + intExtra);
        return intExtra;
    }

    public final jz5.l i(java.lang.String str, boolean z17) {
        java.lang.String str2 = "";
        if (str == null || r26.n0.N(str)) {
            return new jz5.l(0L, "");
        }
        java.util.List q17 = ai4.m0.f86706a.G().q(str);
        long size = q17.size();
        if (size > 0 && z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(q17, 10));
            java.util.Iterator it = q17.iterator();
            while (it.hasNext()) {
                arrayList.add(((mj4.k) ((mj4.h) it.next())).l());
            }
            str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.h2.a(arrayList, ";");
        }
        return new jz5.l(java.lang.Long.valueOf(size), str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r7.f535295d, en1.a.a()) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map j(xe0.o0 r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            r0 = 6
            jz5.l[] r0 = new jz5.l[r0]
            java.lang.String r1 = r7.f535295d
            jz5.l r2 = new jz5.l
            java.lang.String r3 = "wx_username"
            r2.<init>(r3, r1)
            r1 = 0
            r0[r1] = r2
            jz5.l r2 = new jz5.l
            java.lang.String r3 = "textstatusid"
            r2.<init>(r3, r8)
            r8 = 1
            r0[r8] = r2
            boolean r2 = di4.i.d()
            r3 = 2
            if (r2 == 0) goto L24
            r2 = r3
            goto L25
        L24:
            r2 = r8
        L25:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            jz5.l r4 = new jz5.l
            java.lang.String r5 = "icon_style"
            r4.<init>(r5, r2)
            r0[r3] = r4
            if (r9 != 0) goto L41
            java.lang.String r9 = en1.a.a()
            java.lang.String r2 = r7.f535295d
            boolean r9 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r9)
            if (r9 == 0) goto L42
        L41:
            r1 = r8
        L42:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            jz5.l r9 = new jz5.l
            java.lang.String r1 = "icon_read_type"
            r9.<init>(r1, r8)
            r8 = 3
            r0[r8] = r9
            jz5.l r8 = new jz5.l
            java.lang.String r9 = "sns_feed_id"
            java.lang.String r1 = r7.f535296e
            r8.<init>(r9, r1)
            r9 = 4
            r0[r9] = r8
            jz5.l r8 = new jz5.l
            java.lang.String r9 = "sessionid_sns"
            java.lang.String r7 = r7.f535297f
            r8.<init>(r9, r7)
            r7 = 5
            r0[r7] = r8
            java.util.Map r7 = kz5.c1.l(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qj4.s.j(xe0.o0, java.lang.String, boolean):java.util.Map");
    }

    public final void k(bi4.d1 d1Var, long j17) {
        jz5.f0 f0Var = null;
        if (d1Var != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6963xeb25d076 c6963xeb25d076 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6963xeb25d076();
            java.lang.String str = d1Var.f436474h;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            c6963xeb25d076.f142685d = c6963xeb25d076.b("SessionID", str, true);
            c6963xeb25d076.f142687e = c6963xeb25d076.b("CliPostID", java.lang.String.valueOf(d1Var.f436476m), true);
            c6963xeb25d076.f142689f = d1Var.f436475i;
            c6963xeb25d076.f142691g = d1Var.f436476m;
            c6963xeb25d076.f142695i = j17;
            c6963xeb25d076.f142697j = c01.id.c();
            c6963xeb25d076.P = d1Var.f436477n;
            c6963xeb25d076.Q = d1Var.f436478o;
            c6963xeb25d076.R = 0L;
            c6963xeb25d076.M = d1Var.f436479p;
            c6963xeb25d076.N = d1Var.f436480q;
            c6963xeb25d076.O = c6963xeb25d076.b("FinalCustomTitle", d1Var.f436481r, true);
            c6963xeb25d076.Z = d1Var.f436486w;
            c6963xeb25d076.f142696i0 = c6963xeb25d076.b("WeRunInfo", d1Var.f436487x, true);
            c6963xeb25d076.f142698j0 = c6963xeb25d076.b("PaymentInfo", d1Var.f436488y, true);
            c6963xeb25d076.f142702l0 = c6963xeb25d076.b("PostRecomIconID", bk4.i.a().f(), true);
            qj4.s sVar = f445491a;
            c6963xeb25d076.f142704m0 = sVar.e();
            c6963xeb25d076.f142714r0 = d1Var.f436470d.E;
            java.lang.String str2 = d1Var.D;
            c6963xeb25d076.f142718t0 = c6963xeb25d076.b("EnterSceneInfo", str2 != null ? r26.i0.u(str2, ',', ';', false, 4, null) : null, true);
            long j18 = d1Var.F;
            c6963xeb25d076.f142726x0 = j18;
            if (j17 == 1) {
                c6963xeb25d076.f142728y0 = j18 + 1;
            } else {
                c6963xeb25d076.f142728y0 = j18;
            }
            c6963xeb25d076.k();
            sVar.y(c6963xeb25d076);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.tsReport", "postReportByTextStatusDoWhatActivity: param is null");
        }
    }

    public final void q(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6964xd0ddd34b c6964xd0ddd34b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6964xd0ddd34b();
        c6964xd0ddd34b.f142731d = i17;
        c6964xd0ddd34b.f142732e = i18;
        c6964xd0ddd34b.f142733f = c6964xd0ddd34b.b("Chatname", str, true);
        c6964xd0ddd34b.f142734g = c6964xd0ddd34b.b("ToUsername", str2, true);
        c6964xd0ddd34b.f142735h = c6964xd0ddd34b.b("ToTextstatusID", str3, true);
        c6964xd0ddd34b.f142736i = i19;
        y(c6964xd0ddd34b);
    }

    public final void r(long j17, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, java.lang.Long l17, java.lang.Long l18, java.lang.Long l19) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6924x58774114 c6924x58774114 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6924x58774114();
        c6924x58774114.f142390d = j17;
        if (num != null) {
            num.intValue();
            c6924x58774114.f142391e = num.intValue();
        }
        if (num2 != null) {
            num2.intValue();
            c6924x58774114.f142392f = num2.intValue();
        }
        if (str != null) {
            c6924x58774114.f142393g = c6924x58774114.b("TaskId", str, true);
        }
        if (l17 != null) {
            l17.longValue();
            c6924x58774114.f142394h = l17.longValue();
        }
        if (l18 != null) {
            l18.longValue();
            c6924x58774114.f142395i = l18.longValue();
        }
        if (l19 != null) {
            l19.longValue();
            c6924x58774114.f142396j = l19.longValue();
        }
        c6924x58774114.k();
    }

    public final void t(android.content.Context context, java.lang.String textStatusId, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textStatusId, "textStatusId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("profile_status_card", "view_exp", kz5.c1.k(new jz5.l("textstatusid", textStatusId), new jz5.l("wx_username", userName), new jz5.l("referpath", java.lang.Integer.valueOf(h(context)))), 33629);
    }

    public final void u(qj4.l reportObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportObj, "reportObj");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("status_publish_entrance", "view_clk", g(reportObj), 33629);
    }

    public final void v(qj4.l reportObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportObj, "reportObj");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("status_publish_entrance", "view_exp", g(reportObj), 33629);
    }

    public final void w(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, cj4.q1 q1Var, int i17, java.util.Map map) {
        int h17 = h(context);
        jz5.l[] lVarArr = new jz5.l[6];
        jz5.l lVar = new jz5.l("textstatusid", str3);
        int i18 = 0;
        lVarArr[0] = lVar;
        jz5.l lVar2 = new jz5.l("wx_username", str4);
        int i19 = 1;
        lVarArr[1] = lVar2;
        lVarArr[2] = new jz5.l("referpath", java.lang.Integer.valueOf(h17));
        lVarArr[3] = new jz5.l("is_pull_status", java.lang.Integer.valueOf(q1Var == cj4.q1.f123554e ? 1 : 0));
        if (h17 != 1 && h17 != 6 && (h17 < 101 || h17 > 108)) {
            i19 = 0;
        }
        lVarArr[4] = new jz5.l("is_sns_enter_profile", java.lang.Integer.valueOf(i19));
        lVarArr[5] = new jz5.l("status_card_enterscene", java.lang.Integer.valueOf(i17));
        java.util.Map l17 = kz5.c1.l(lVarArr);
        l17.putAll(map);
        if (i17 == 4) {
            iy1.c cVar = iy1.c.MainUI;
            i18 = 1122;
        } else if (i17 == 16) {
            iy1.c cVar2 = iy1.c.MainUI;
            i18 = 50330;
        }
        if (i18 > 0) {
            l17.put("page_id", java.lang.Integer.valueOf(i18));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.tsReport", "reportTextStatusCardButtonClickEvent: param=" + l17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(str, str2, kz5.c1.s(l17), 33629);
    }

    public final void x(android.content.Context context, java.lang.String textStatusId, java.lang.String userName, boolean z17, cj4.q1 profileOpenState, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textStatusId, "textStatusId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(profileOpenState, "profileOpenState");
        w(context, "status_card_like", "view_clk", textStatusId, userName, profileOpenState, i17, kz5.b1.e(new jz5.l("statusliketype", java.lang.Integer.valueOf(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(userName, en1.a.a()) ? 3 : z17 ? 1 : 2))));
    }

    public final void y(jx3.a aVar) {
        java.lang.String n17 = aVar.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.tsReport", "report%s %s", java.lang.Integer.valueOf(aVar.g()), r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
    }
}
