package yw;

/* loaded from: classes11.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final yw.h1 f547865a;

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f547866b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f547867c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f547868d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f547869e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f547870f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f547871g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f547872h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f547873i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f547874j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f547875k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f547876l;

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.Integer f547877m;

    static {
        yw.h1 h1Var = new yw.h1();
        f547865a = h1Var;
        f547866b = jz5.h.b(yw.e1.f547841d);
        f547867c = jz5.h.b(yw.g1.f547858d);
        jz5.g b17 = jz5.h.b(yw.z0.f548051d);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 m17 = h1Var.m();
        eq1.n0 n0Var = eq1.n0.f337370a;
        boolean z17 = true;
        f547868d = m17.o("BizTimeLineOpenFlutter", !n0Var.a() ? -1 : 1);
        f547869e = h1Var.m().o("BizTimeLineUserAff", !n0Var.a() ? -1 : 1);
        f547870f = h1Var.m().o("BizTimeLineOpenDynamicCardToast", !n0Var.a() ? -1 : 1);
        f547871g = h1Var.m().o("BizTimeLineOpenDynamicCard", n0Var.a() ? 1 : -1);
        if (h1Var.m().o("bizForceDisableNewMsgDirect", 0) != 1 && !((java.lang.Boolean) ((jz5.n) b17).mo141623x754a37bb()).booleanValue()) {
            z17 = false;
        }
        f547872h = z17;
        f547873i = h1Var.m().h("BizTimeLineShowRedPacketCover");
        f547874j = h1Var.m().o("BizHoldSecAfterUserLeaveForReport", 0);
        f547875k = h1Var.m().o("BizTimeLineFinderInfo", 0);
        f547876l = h1Var.m().o("BizTimeLineReportArticleJumpPathDepth", 0);
    }

    public final void a() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.h(0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizFlutterHelper", "fts h5 template not avail");
            return;
        }
        boolean wi6 = ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).wi(11, 2);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573707fh4));
        a17.putExtra("searchbar_tips", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573707fh4));
        a17.putExtra("KRightBtn", true);
        a17.putExtra("ftsneedkeyboard", !wi6);
        a17.putExtra("publishIdPrefix", "bs");
        a17.putExtra("ftsType", 2);
        a17.putExtra("ftsbizscene", 11);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map b17 = su4.r2.b(11, true, 2);
        tg0.o1 o1Var = (tg0.o1) i95.n0.c(tg0.o1.class);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), 0);
        ((sg0.y3) o1Var).getClass();
        java.lang.String f17 = su4.r2.f(D1);
        hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f17);
        a17.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f17);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        a17.putExtra("rawUrl", su4.r2.e(b17, 0));
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("key_preload_biz", 4);
        a17.addFlags(67108864);
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        java.lang.String optString = su4.o2.d("entranceWording").optString("bizAccountTopSearch");
        if (!android.text.TextUtils.isEmpty(optString)) {
            a17.putExtra("key_search_input_hint", optString);
        }
        a17.putExtra("KOpenArticleSceneFromScene", 90);
        j45.l.z(context, a17, null);
        su4.k2.a(11, f17, f17, false, "", 2, "", false, "");
    }

    public final boolean b() {
        if (!p()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "display breathing light switch is off");
            return false;
        }
        int o17 = m().o("biz_time_line_finder_get_live_info_interval", -1);
        int o18 = m().o("KeyBizLastGetLiveInfoTimeStamp", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "live info interval: " + o17 + ", last update timestamp: " + o18);
        if (o17 <= 0) {
            return false;
        }
        if (o17 < 10) {
            o17 = 10;
        }
        return c01.id.f((long) o18) > ((long) o17);
    }

    public final void c(boolean z17, int i17) {
        boolean n27;
        if (!(((long) (m().o("key_biz_fetch_contact_create_time_fetch_last_time", 0) + m().o("key_biz_fetch_contact_create_time_interval_in_second", 86400))) < com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()) && !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "fetchContactCreateTimeIfNeed time not reach");
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor x17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().x("@biz.contact", null, kz5.n0.S0(c01.e2.i()));
        if (x17 == null) {
            return;
        }
        while (x17.moveToNext()) {
            try {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                z3Var.mo9015xbf5d97fd(x17);
                if (i17 == 1) {
                    n27 = z3Var.n2();
                } else if (i17 != 2) {
                    n27 = z3Var.k2();
                } else {
                    if (!z3Var.l2() && !z3Var.m2()) {
                        n27 = false;
                    }
                    n27 = true;
                }
                if (n27) {
                    g95.d dVar = g95.e.f351334a;
                    java.lang.String d17 = z3Var.d1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                    if (dVar.c(d17) <= 0) {
                        linkedList.add(z3Var.d1());
                    }
                }
            } finally {
            }
        }
        vz5.b.a(x17, null);
        if (!linkedList.isEmpty()) {
            e(linkedList);
        } else {
            m().B("key_biz_fetch_contact_create_time_fetch_last_time", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "fetchContactCreateTimeIfNeed usernameList is empty");
        }
    }

    public final void d(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "start fetch contact msg digest");
        r45.nb3 nb3Var = new r45.nb3();
        nb3Var.f462761d = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 29891;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/bizattr/getbizlatestitemlist";
        lVar.f152197a = nb3Var;
        lVar.f152198b = new r45.ob3();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
        iVar.p(a17);
        iVar.l().K(yw.a1.f547795a);
    }

    public final void e(java.util.LinkedList usernameList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernameList, "usernameList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "fetchContactSvrImpl usernameList:" + usernameList);
        r45.jq3 jq3Var = new r45.jq3();
        jq3Var.f459587d = usernameList;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 29189;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/bizattr/getusercontactlist";
        lVar.f152197a = jq3Var;
        lVar.f152198b = new r45.kq3();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
        iVar.p(a17);
        iVar.l().K(yw.b1.f547813a);
    }

    public final void f(com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23511xda8ad752 info, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ns.k kVar = (ns.k) i95.n0.c(ns.k.class);
        yw.c1 c1Var = new yw.c1(lVar);
        ((ms.a) kVar).getClass();
        r35.a aVar = new r35.a(context, c1Var);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(261);
        r45.hy6 hy6Var = new r45.hy6();
        java.lang.String m86743xf8158c8f = info.m86743xf8158c8f();
        hy6Var.f458091e = m86743xf8158c8f;
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(info.m86743xf8158c8f())) {
            try {
                hy6Var.f458092f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(android.net.Uri.parse(m86743xf8158c8f).getQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), 10000);
            } catch (java.lang.Exception unused) {
            }
        }
        aVar.F = hy6Var;
        aVar.b(info.m86745x6c03c64c(), linkedList, false, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10298, info.m86745x6c03c64c(), java.lang.Long.valueOf(info.m86744x7520bed6()));
    }

    public final com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42 g() {
        int f17 = r01.q3.oj().f();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42 c23471xe5621e42 = new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42(null, null, null, null, null, null, bool, 63, null);
        if (f17 > 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = null;
            android.database.Cursor B = r01.q3.oj().f276526d.B("SELECT * FROM BizTimeLineSingleMsgInfo where status != 4 order by createTime DESC limit 1", null);
            if (B.moveToFirst()) {
                s1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s1();
                s1Var.mo9015xbf5d97fd(B);
            }
            B.close();
            if (s1Var != null) {
                com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42 c23471xe5621e422 = new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42(null, java.lang.Long.valueOf(s1Var.f67292x297eb4f7), null, null, null, null, null, 125, null);
                boolean z17 = true;
                if (s1Var.z0()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(s1Var.f67306x114ef53e, true);
                    if (n17 != null && n17.r2()) {
                        c23471xe5621e422 = com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42.m86585x75149012(c23471xe5621e422, java.lang.Long.valueOf(f17), null, s1Var.f67306x114ef53e, null, bool, null, null, 106, null);
                    } else if (s1Var.t0() != null) {
                        c23471xe5621e422 = com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42.m86585x75149012(c23471xe5621e422, java.lang.Long.valueOf(f17), null, null, null, bool, s1Var.t0().f275333d, null, 78, null);
                    }
                } else if (com.p314xaae8f345.mm.p2621x8fb0427b.s2.a(s1Var, 0)) {
                    java.lang.String k17 = com.p314xaae8f345.mm.p2621x8fb0427b.s2.k(s1Var, 0);
                    java.lang.String c17 = com.p314xaae8f345.mm.p2621x8fb0427b.s2.c(s1Var);
                    if (!r26.n0.N(c17)) {
                        c23471xe5621e422 = com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42.m86585x75149012(c23471xe5621e422, java.lang.Long.valueOf(f17), null, null, null, bool, c17, null, 78, null);
                    } else if (!r26.n0.N(k17)) {
                        c23471xe5621e422 = com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42.m86585x75149012(c23471xe5621e422, java.lang.Long.valueOf(f17), null, k17, null, java.lang.Boolean.valueOf(c01.e2.G(k17)), null, null, 106, null);
                    }
                } else {
                    java.lang.String str = s1Var.f67306x114ef53e;
                    boolean G = c01.e2.G(str);
                    if (str != null && !r26.n0.N(str)) {
                        z17 = false;
                    }
                    if (!z17) {
                        c23471xe5621e422 = com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42.m86585x75149012(c23471xe5621e422, java.lang.Long.valueOf(f17), null, str, null, java.lang.Boolean.valueOf(G), null, null, 106, null);
                    }
                }
                com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42 c23471xe5621e423 = c23471xe5621e422;
                java.lang.String m86600x6bf53a6c = c23471xe5621e423.m86600x6bf53a6c();
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (m86600x6bf53a6c == null) {
                    m86600x6bf53a6c = "";
                }
                c23471xe5621e42 = com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42.m86585x75149012(c23471xe5621e423, null, null, null, null, null, null, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.s2.p(m86600x6bf53a6c, s1Var, 0)), 63, null);
            }
        }
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42 c23471xe5621e424 = c23471xe5621e42;
        java.lang.String m86600x6bf53a6c2 = c23471xe5621e424.m86600x6bf53a6c();
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42.m86585x75149012(c23471xe5621e424, null, null, m86600x6bf53a6c2 == null ? "" : m86600x6bf53a6c2, null, null, null, null, 123, null);
    }

    public final com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23516x65d494ce h(java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
        if (n17 != null) {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            return new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23516x65d494ce(userName, c01.a2.e(userName), java.lang.Boolean.valueOf(n17.r2()), java.lang.Boolean.valueOf(n17.w2()), java.lang.Boolean.valueOf(c01.e2.P(n17)));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        return new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23516x65d494ce(userName, null, bool, bool, java.lang.Boolean.TRUE, 2, null);
    }

    public final void i(java.lang.String username, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        if (n17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.P0())) {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            callback.mo146xb9724478(new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23516x65d494ce(username, c01.a2.e(username), java.lang.Boolean.valueOf(n17.r2()), java.lang.Boolean.valueOf(n17.w2()), java.lang.Boolean.valueOf(c01.e2.P(n17))));
        } else {
            ((c01.k7) c01.n8.a()).b(username, 5, new yw.d1(username, callback));
        }
    }

    public final int j() {
        if (f547877m == null) {
            f547877m = java.lang.Integer.valueOf(m().o("BizResortV2ControlFlag", 3));
        }
        java.lang.Integer num = f547877m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        return num.intValue();
    }

    public final java.lang.String k() {
        java.lang.String u17 = m().u("history_box_wording", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "decodeString(...)");
        return u17;
    }

    public final java.util.List l(long j17, boolean z17, boolean z18) {
        java.util.Iterator it;
        java.util.LinkedList linkedList;
        java.lang.String str;
        java.util.LinkedList linkedList2;
        java.lang.String str2;
        boolean z19;
        boolean z27;
        long j18;
        long j19;
        long j27;
        long j28;
        boolean z28;
        boolean z29;
        java.util.LinkedList linkedList3;
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23523xaa6b11f5 c23523xaa6b11f5;
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        java.util.Iterator it6 = (z17 ? r01.q3.nj().P0(10, 285212721) : z18 ? r01.q3.nj().W0(j17, 285212721) : r01.q3.nj().f1(10, j17, 285212721)).iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = (com.p314xaae8f345.mm.p2621x8fb0427b.s1) it6.next();
            if (s1Var.v0()) {
                if (s1Var.v0()) {
                    java.lang.String str3 = s1Var.f67306x114ef53e;
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str3, true);
                    ot0.r0 r0Var = (ot0.r0) ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(s1Var.f67292x297eb4f7, s1Var.f67281xad49e234);
                    long j29 = s1Var.f67296x8340ced5;
                    long j37 = s1Var.f67292x297eb4f7;
                    long j38 = s1Var.f67293xd09be28e;
                    boolean z37 = s1Var.f67285xf918da09;
                    long j39 = s1Var.f67282xac3be4e;
                    if (n17 != null) {
                        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                        str = c01.a2.e(str3);
                    } else {
                        str = null;
                    }
                    java.lang.Boolean valueOf = n17 != null ? java.lang.Boolean.valueOf(n17.w2()) : null;
                    boolean z38 = s1Var.f67286xff7b64c5 == 1;
                    boolean z39 = s1Var.f67287x15a25b3;
                    boolean z47 = (s1Var.f67279x6e664fd4 & 1) != 0;
                    java.util.LinkedList linkedList5 = r0Var.f430114i;
                    if (linkedList5 != null) {
                        it = it6;
                        linkedList2 = linkedList4;
                        str2 = str3;
                        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList5, 10));
                        java.util.Iterator it7 = linkedList5.iterator();
                        while (it7.hasNext()) {
                            ot0.s0 s0Var = (ot0.s0) it7.next();
                            java.lang.String str4 = s0Var.f430294d;
                            java.util.Iterator it8 = it7;
                            java.lang.String str5 = s0Var.f430295e;
                            boolean z48 = z47;
                            long j47 = j39;
                            java.lang.String m17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).m(s0Var.f430295e);
                            java.lang.String str6 = s0Var.f430299i;
                            java.lang.String str7 = s0Var.D;
                            java.lang.String str8 = s0Var.f430302n;
                            boolean z49 = z37;
                            boolean z57 = z39;
                            boolean z58 = z38;
                            long j48 = s0Var.f430303o;
                            long j49 = j38;
                            boolean z59 = s0Var.I == 1;
                            arrayList.add(new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23524x7a19fea8(str4, str5, m17, java.lang.Long.valueOf(s0Var.f430298h), str6, str7, str8, java.lang.Long.valueOf(j48), java.lang.Long.valueOf(s0Var.f430307q), s0Var.f430318z, s0Var.A, s0Var.G, java.lang.Long.valueOf(s0Var.C), java.lang.Long.valueOf(s0Var.E), java.lang.Long.valueOf(s0Var.F), java.lang.Boolean.valueOf(z59)));
                            it7 = it8;
                            z47 = z48;
                            z37 = z49;
                            j39 = j47;
                            z38 = z58;
                            z39 = z57;
                            j38 = j49;
                            j37 = j37;
                            j29 = j29;
                        }
                        z19 = z39;
                        z27 = z38;
                        j18 = j39;
                        j19 = j29;
                        j27 = j37;
                        j28 = j38;
                        z28 = z37;
                        z29 = z47;
                        linkedList3 = new java.util.LinkedList(arrayList);
                    } else {
                        it = it6;
                        linkedList2 = linkedList4;
                        str2 = str3;
                        z19 = z39;
                        z27 = z38;
                        j18 = j39;
                        j19 = j29;
                        j27 = j37;
                        j28 = j38;
                        z28 = z37;
                        z29 = z47;
                        linkedList3 = null;
                    }
                    c23523xaa6b11f5 = new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23523xaa6b11f5(str2, str, java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z28), valueOf, java.lang.Long.valueOf(j18), null, java.lang.Boolean.valueOf(z29), linkedList3, 1024, null);
                    linkedList = linkedList2;
                } else {
                    c23523xaa6b11f5 = new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23523xaa6b11f5(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                    it = it6;
                    linkedList = linkedList4;
                }
                linkedList.add(c23523xaa6b11f5);
            } else {
                it = it6;
                linkedList = linkedList4;
            }
            linkedList4 = linkedList;
            it6 = it;
        }
        return linkedList4;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 m() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) f547866b.mo141623x754a37bb();
    }

    public final boolean n() {
        return ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).aj();
    }

    public final r45.zw6 o() {
        r45.zw6 zw6Var = new r45.zw6();
        zw6Var.f473978d = m().o("biz_time_line_valid_expose_area_ratio", 0);
        zw6Var.f473979e = m().o("biz_time_line_valid_expose_time_ms", 0);
        zw6Var.f473980f = m().o("biz_time_line_extra_calc_expose_time_ms", 0);
        zw6Var.f473981g = m().o("biz_time_line_new_valid_expose_time_ms", 0);
        return zw6Var;
    }

    public final boolean p() {
        return m().i("biz_time_line_finder_display_breathing_light", false);
    }

    public final boolean q() {
        return m().n("key_biz_pic_text_scroll_list_enable") == 1;
    }

    public final void r() {
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).u(90);
        if (!yw.l0.f547923b) {
            jx3.f.INSTANCE.w(1971L, 4L, 1L);
        }
        yw.q3 q3Var = yw.q3.f547970a;
        if (yw.q3.f547974e) {
            return;
        }
        jx3.f.INSTANCE.w(1971L, 6L, 1L);
    }

    public final void s(com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23335x4dbe57d1 info, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        t(new lx.a(info.m86190x74d37ac6(), info.m86198x75298e34(), info.m86194xb588631e(), info.m86195x2e2ce293(), info.m86193x5ae7d1ac(), info.m86197xff358fa2(), info.m86200xb5887639(), info.m86188x7235c680(), info.m86201x6bf53a6c(), info.m86192x80025a04(), info.m86199x7531c8a2(), info.m86186x66e287ae(), info.m86184xca0b430(), info.m86196x8eabbfcf(), info.m86191xcf411f1b(), info.m86185x6b6d78f4(), info.m86189x27681aaa(), info.m86187x6de99b06()), context);
    }

    public final void t(lx.a info, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "onWebViewClick = %d", java.lang.Long.valueOf(currentTimeMillis));
        android.content.Intent intent = new android.content.Intent();
        java.lang.Long l17 = info.f403200e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
        int longValue = (int) l17.longValue();
        java.lang.Long l18 = info.f403201f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l18);
        int longValue2 = (int) l18.longValue();
        java.lang.Long l19 = info.f403196a;
        intent.putExtra("message_id", l19);
        java.lang.String str = info.f403204i;
        intent.putExtra("srcUsername", str);
        intent.putExtra("srcDisplayname", info.f403205j);
        intent.putExtra("geta8key_username", str);
        intent.putExtra("geta8key_scene", 56);
        intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292730j, info.f403203h);
        intent.putExtra("start_activity_time", currentTimeMillis);
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        bundle.putInt("snsWebSource", (n17 == null || !n17.k2()) ? 0 : 4);
        intent.putExtra("msg_id", l19);
        intent.putExtra("msg_talker", str);
        intent.putExtra("KPublisherId", "msg_" + l19);
        intent.putExtra("pre_username", str);
        java.lang.Long l27 = info.f403211p;
        intent.putExtra("kBizSessionId", l27 != null ? java.lang.Integer.valueOf((int) l27.longValue()) : null);
        intent.putExtra("prePublishId", "msg_" + info.f403197b);
        intent.putExtra("preUsername", str);
        intent.putExtra("preChatName", str);
        intent.putExtra("preChatTYPE", 7);
        java.lang.Long l28 = info.f403199d;
        intent.putExtra("preMsgIndex", l28);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("share_report_pre_msg_url", info.f403202g);
        java.lang.String str2 = info.f403206k;
        bundle2.putString("share_report_pre_msg_title", str2);
        java.lang.String str3 = info.f403207l;
        bundle2.putString("share_report_pre_msg_icon_url", str3);
        bundle2.putString("share_report_pre_msg_appid", "");
        bundle2.putInt("share_report_from_scene", 5);
        bundle2.putString("share_report_biz_username", str);
        intent.putExtras(bundle2);
        intent.putExtra("jsapiargs", bundle);
        intent.putExtra("message_index", l28);
        intent.putExtra("from_scence", 1);
        intent.putExtra("mode", 1);
        java.lang.String str4 = info.f403209n;
        java.lang.String str5 = info.f403202g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
        int i17 = (int) (currentTimeMillis / 1000);
        java.lang.Long l29 = info.f403198c;
        int longValue3 = l29 != null ? (int) l29.longValue() : -1;
        java.lang.Long l37 = info.f403208m;
        java.lang.String c17 = ot0.g0.c(str5, longValue, longValue2, i17, null, "", longValue3, l37 != null ? (int) l37.longValue() : -1, str4, info.f403212q, f547876l);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "openUrl:%s", c17);
        intent.putExtra("rawUrl", c17);
        intent.putExtra("webpageTitle", str2);
        intent.putExtra("thumbUrl", str3);
        intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        java.lang.Long l38 = info.f403203h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l38);
        if (((yq1.z) a0Var).E(context, c17, (int) l38.longValue(), true, longValue, longValue2, intent)) {
            return;
        }
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void u() {
        ((ku5.t0) ku5.t0.f394148d).h(yw.f1.f547850d, "FlutterBizThread");
    }
}
