package zv;

/* loaded from: classes11.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final zv.q f557612a = new zv.q();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f557613b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f557614c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f557615d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Boolean f557616e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f557617f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Integer f557618g;

    static {
        jz5.g b17 = jz5.h.b(zv.o.f557596d);
        f557613b = b17;
        f557615d = jz5.h.b(zv.p.f557602d);
        f557617f = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) b17).mo141623x754a37bb()).h("BizTimeLineShowRedPacketCover");
    }

    public final void a() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.h(0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandEcsFlutterHelper", "fts h5 template not avail");
            return;
        }
        boolean wi6 = ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).wi(179, 0);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573707fh4));
        a17.putExtra("searchbar_tips", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573707fh4));
        a17.putExtra("KRightBtn", true);
        a17.putExtra("ftsneedkeyboard", !wi6);
        a17.putExtra("publishIdPrefix", "bs");
        a17.putExtra("ftsbizscene", 179);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map b17 = su4.r2.b(179, true, 0);
        tg0.o1 o1Var = (tg0.o1) i95.n0.c(tg0.o1.class);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), 0);
        ((sg0.y3) o1Var).getClass();
        java.lang.String f17 = su4.r2.f(D1);
        hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f17);
        a17.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        sb6.append(su4.r2.e(b17, 0));
        sb6.append("&openArticleScene=290");
        a17.putExtra("rawUrl", sb6.toString());
        a17.putExtra("ftsInitToSearch", true);
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("key_preload_biz", 4);
        a17.addFlags(67108864);
        a17.putExtra("KOpenArticleSceneFromScene", 90);
        j45.l.y(context, a17);
        su4.k2.a(179, f17, f17, true, "", 0, "", false, "");
    }

    public final boolean b() {
        y02.v0 a17;
        if (f557616e == null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f557613b).mo141623x754a37bb()).i(zv.m.f557561a, false));
            f557616e = valueOf;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE) && (a17 = y02.x0.f540167d.a()) != null) {
                a17.G(bw5.d5.EcsBrandEntryStatusCheck, 5);
            }
        }
        java.lang.Boolean bool = f557616e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        return bool.booleanValue();
    }

    public final com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42 c() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 c17;
        java.lang.String str;
        java.lang.String str2;
        ow.n nVar = ow.n.f430792a;
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.g0 c18 = yw.a3.f547799a.c();
        long e17 = c18 != null ? c18.e() : 0L;
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42 c23471xe5621e42 = new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42(null, null, null, null, null, null, null, 127, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsFlutterHelper", "getBrsNotifyTipsInfo newMsgCount:" + e17);
        if (e17 > 0 && (c17 = nVar.c()) != null) {
            com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42 m86585x75149012 = com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42.m86585x75149012(c23471xe5621e42, null, java.lang.Long.valueOf(c17.m124847x74d37ac6()), null, null, null, null, null, 125, null);
            boolean z17 = true;
            if (c17.mo78013xfb85f7b0() == 318767153) {
                uw.f fVar = uw.f.f513023a;
                java.util.Map a17 = fVar.a(uw.e.f513019d, c17);
                if (a17 == null || (str = (java.lang.String) a17.get(".msg.fromusername")) == null) {
                    str = "";
                }
                java.util.Map a18 = fVar.a(uw.e.f513021f, c17);
                if (a18 != null) {
                    str2 = (java.lang.String) a18.get(".avatar_url");
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str2 == null) {
                        str2 = "";
                    }
                } else {
                    str2 = null;
                }
                java.lang.String str3 = str2 == null ? "" : str2;
                if (!r26.n0.N(str3)) {
                    c23471xe5621e42 = com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42.m86585x75149012(m86585x75149012, java.lang.Long.valueOf(e17), null, null, null, java.lang.Boolean.FALSE, str3, null, 78, null);
                } else {
                    if (!r26.n0.N(str)) {
                        c23471xe5621e42 = com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42.m86585x75149012(m86585x75149012, java.lang.Long.valueOf(e17), null, str, dw.f.f325603a.b(str, c17), java.lang.Boolean.valueOf(c01.e2.G(str)), null, null, 98, null);
                    }
                    c23471xe5621e42 = m86585x75149012;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d().edit().putLong("brand_service_time_line_last_notify_msg_id", c17.m124847x74d37ac6()).apply();
            } else {
                java.lang.String Q0 = c17.Q0();
                boolean G = c01.e2.G(c17.Q0());
                if (Q0 != null && !r26.n0.N(Q0)) {
                    z17 = false;
                }
                if (!z17) {
                    dw.f fVar2 = dw.f.f325603a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q0);
                    c23471xe5621e42 = com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42.m86585x75149012(m86585x75149012, java.lang.Long.valueOf(e17), null, Q0, fVar2.b(Q0, c17), java.lang.Boolean.valueOf(G), null, null, 98, null);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d().edit().putLong("brand_service_time_line_last_notify_msg_id", c17.m124847x74d37ac6()).apply();
                }
                c23471xe5621e42 = m86585x75149012;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d().edit().putLong("brand_service_time_line_last_notify_msg_id", c17.m124847x74d37ac6()).apply();
            }
        }
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42 c23471xe5621e422 = c23471xe5621e42;
        java.lang.String m86600x6bf53a6c = c23471xe5621e422.m86600x6bf53a6c();
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23471xe5621e42.m86585x75149012(c23471xe5621e422, null, null, m86600x6bf53a6c == null ? "" : m86600x6bf53a6c, null, null, null, null, 123, null);
    }

    public final com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23516x65d494ce d(java.lang.String userName) {
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23516x65d494ce c23516x65d494ce;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
        if (n17 != null) {
            boolean r27 = n17.r2();
            boolean w27 = n17.w2();
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            c23516x65d494ce = new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23516x65d494ce(userName, c01.a2.e(userName), java.lang.Boolean.valueOf(r27), java.lang.Boolean.valueOf(w27), java.lang.Boolean.valueOf(c01.e2.P(n17)));
        } else {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            c23516x65d494ce = new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23516x65d494ce(userName, null, bool, bool, java.lang.Boolean.TRUE, 2, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsFlutterHelper", "[BRS] getContactInfo, userName -> " + userName + ", nickName -> " + c23516x65d494ce.m86813x80025a04());
        return c23516x65d494ce;
    }

    public final boolean e() {
        boolean z17 = f557614c;
        if (z17) {
            return z17;
        }
        boolean i17 = uw.k.f513028a.a().i("BrandServiceRecommendFeedsSvrOpen", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceRecFeedsDataUtil", "BrandServiceRecommendFeedsSvrOpen = " + i17);
        f557614c = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsFlutterHelper", "isBrandServiceRecFeedsOpen svrOpen " + i17);
        return f557614c;
    }

    public final boolean f() {
        if (!b()) {
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isEnableBrandServiceTimeline] brandServiceDataMigrateCrash:");
        sb6.append(b());
        sb6.append(" key:");
        java.lang.String str = zv.m.f557561a;
        sb6.append(zv.m.f557561a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsFlutterHelper", sb6.toString());
        return false;
    }

    public final boolean g() {
        return ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ui();
    }
}
