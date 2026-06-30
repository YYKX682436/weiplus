package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

@j95.b
/* loaded from: classes10.dex */
public final class o3 extends i95.w implements zy2.qa {

    /* renamed from: s */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j3 f206740s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j3(null);

    /* renamed from: d */
    public java.lang.String f206741d = "";

    /* renamed from: e */
    public java.lang.String f206742e = "";

    /* renamed from: f */
    public final android.util.LongSparseArray f206743f = new android.util.LongSparseArray();

    /* renamed from: g */
    public final java.util.HashMap f206744g = new java.util.HashMap();

    /* renamed from: h */
    public final java.util.concurrent.ConcurrentHashMap f206745h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i */
    public java.util.LinkedList f206746i;

    /* renamed from: m */
    public final android.util.LongSparseArray f206747m;

    /* renamed from: n */
    public final android.util.SparseArray f206748n;

    /* renamed from: o */
    public final java.math.BigInteger f206749o;

    /* renamed from: p */
    public boolean f206750p;

    /* renamed from: q */
    public boolean f206751q;

    /* renamed from: r */
    public cl0.g f206752r;

    public o3() {
        new android.util.ArrayMap();
        this.f206747m = new android.util.LongSparseArray();
        this.f206748n = new android.util.SparseArray();
        this.f206749o = java.math.BigInteger.ONE.shiftLeft(64);
    }

    public static void Ij(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, int i19, int i27, int i28, java.lang.String str4, int i29, int i37, r45.qt2 qt2Var, java.lang.String str5, int i38, int i39, java.lang.Object obj) {
        r45.qt2 qt2Var2 = (i39 & 2048) != 0 ? null : qt2Var;
        java.lang.String str6 = (i39 & 4096) != 0 ? "" : str5;
        int i47 = (i39 & 8192) != 0 ? 0 : i38;
        o3Var.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6582x41c46d0e c6582x41c46d0e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6582x41c46d0e();
        c6582x41c46d0e.f139329d = c6582x41c46d0e.b("RequestId", str == null ? "" : str, true);
        c6582x41c46d0e.f139330e = c6582x41c46d0e.b("Query", str2 == null ? "" : str2, true);
        c6582x41c46d0e.f139331f = i17;
        c6582x41c46d0e.f139332g = i18;
        c6582x41c46d0e.f139333h = c6582x41c46d0e.b("ItemId", str3, true);
        c6582x41c46d0e.f139334i = i19;
        c6582x41c46d0e.f139335j = i27;
        c6582x41c46d0e.f139336k = i28;
        if (qt2Var2 != null) {
            c6582x41c46d0e.f139337l = c6582x41c46d0e.b("SessionId", qt2Var2.m75945x2fec8307(0), true);
            c6582x41c46d0e.f139339n = qt2Var2.m75939xb282bd08(5);
            c6582x41c46d0e.f139338m = c6582x41c46d0e.b("ClicktabcontextId", qt2Var2.m75945x2fec8307(2), true);
        }
        c6582x41c46d0e.f139340o = c6582x41c46d0e.b("SearchSessionid", str4, true);
        c6582x41c46d0e.f139341p = i29;
        c6582x41c46d0e.f139342q = i37;
        c6582x41c46d0e.f139344s = c6582x41c46d0e.b("hotWordId", str6 != null ? str6 : "", true);
        c6582x41c46d0e.f139345t = i47;
        c6582x41c46d0e.k();
        o3Var.Zk(c6582x41c46d0e);
    }

    public static /* synthetic */ void Kj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var, android.content.Context context, long j17, boolean z17, long j18, long j19, boolean z18, long j27, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        o3Var.Jj(context, j17, z17, j18, j19, (i17 & 32) != 0 ? false : z18, (i17 & 64) != 0 ? 0L : j27, (i17 & 128) != 0 ? "" : str, (i17 & 256) != 0 ? "" : str2);
    }

    public static void Mj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var, android.content.Context context, long j17, long j18, boolean z17, int i17, int i18, java.lang.String udfKv, int i19, java.lang.Object obj) {
        if ((i19 & 8) != 0) {
            z17 = false;
        }
        if ((i19 & 16) != 0) {
            i17 = 1;
        }
        if ((i19 & 32) != 0) {
            i18 = 1;
        }
        if ((i19 & 64) != 0) {
            udfKv = "";
        }
        o3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(udfKv, "udfKv");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6584x10c99503 c6584x10c99503 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6584x10c99503();
        c6584x10c99503.f139348d = j17;
        c6584x10c99503.f139349e = j18;
        c6584x10c99503.f139350f = z17 ? 1L : 0L;
        c6584x10c99503.f139351g = i17;
        c6584x10c99503.f139352h = i18;
        c6584x10c99503.f139353i = c6584x10c99503.b("udf_kv", udfKv, true);
        c6584x10c99503.k();
        o3Var.Zk(c6584x10c99503);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Nk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var, android.content.Context context, long j17, java.lang.String str, int i17, int i18, java.lang.String contextId, boolean z17, boolean z18, cl0.g data, int i19, int i27, int i28, int i29, int i37, java.lang.String str2, long j18, long j19, int i38, int i39, int i47, int i48, int i49, java.lang.String str3, boolean z19, int i57, boolean z27, int i58, boolean z28, int i59, int i66, qc2.a aVar, r45.cl2 cl2Var, float f17, so2.e1 e1Var, int i67, int i68, java.lang.Object obj) {
        java.lang.String str4;
        int i69;
        java.lang.Object obj2;
        int i76;
        long j27;
        int i77;
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        qc2.a aVar2;
        java.util.HashMap hashMap3;
        boolean z29;
        int i78;
        int i79;
        r45.cl2 cl2Var2;
        int i86;
        long j28;
        java.lang.String gVar;
        android.content.Context context2;
        int i87 = (i67 & 2048) != 0 ? 0 : i28;
        int i88 = (i67 & 4096) != 0 ? 0 : i29;
        int i89 = (i67 & 8192) != 0 ? 0 : i37;
        java.lang.Object adPosId = (i67 & 16384) != 0 ? "" : str2;
        long j29 = (32768 & i67) != 0 ? 0L : j18;
        int i96 = (131072 & i67) != 0 ? 0 : i38;
        int i97 = (i67 & 262144) != 0 ? 0 : i39;
        int i98 = (i67 & 524288) != 0 ? 0 : i47;
        int i99 = (i67 & 1048576) != 0 ? 0 : i48;
        int i100 = (i67 & 2097152) != 0 ? 0 : i49;
        java.lang.String playSequence = (i67 & 4194304) != 0 ? "" : str3;
        boolean z37 = (i67 & 8388608) != 0 ? false : z19;
        int i101 = (16777216 & i67) != 0 ? 0 : i57;
        boolean z38 = (i67 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432) != 0 ? false : z27;
        int i102 = (i67 & 67108864) != 0 ? 0 : i58;
        boolean z39 = (i67 & 134217728) != 0 ? false : z28;
        int i103 = (i67 & 268435456) != 0 ? 0 : i59;
        int i104 = (i67 & com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965) != 0 ? -1 : i66;
        int i105 = i101;
        qc2.a aVar3 = (i67 & 1073741824) != 0 ? null : aVar;
        r45.cl2 cl2Var3 = (i67 & Integer.MIN_VALUE) != 0 ? null : cl2Var;
        float f18 = (i68 & 1) != 0 ? 0.0f : f17;
        so2.e1 e1Var2 = (i68 & 2) != 0 ? null : e1Var;
        o3Var.getClass();
        r45.cl2 cl2Var4 = cl2Var3;
        boolean z47 = z37;
        int i106 = i97;
        qc2.b bVar = qc2.b.f443042a;
        int i107 = i87;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adPosId, "adPosId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playSequence, "playSequence");
        try {
            cl0.g gVar2 = new cl0.g();
            java.lang.Object obj3 = adPosId;
            if (z18) {
                i76 = 2;
                obj2 = "";
            } else {
                obj2 = "";
                i76 = 1;
            }
            long c17 = c01.id.c();
            gVar2.o("report_type", i76);
            gVar2.h("advert_group_id", data.mo15082x48bce8a4(ya.b.f77478x4cd4defb));
            gVar2.h("trace_id", data.mo15082x48bce8a4("traceid"));
            java.lang.Object mo15082x48bce8a4 = data.mo15082x48bce8a4("apurl");
            java.lang.Object mo15082x48bce8a42 = data.mo15082x48bce8a4("rl");
            if (!z18) {
                mo15082x48bce8a42 = mo15082x48bce8a4;
            }
            gVar2.h("report_link", mo15082x48bce8a42);
            gVar2.o("pos_type", data.optInt("pos_type"));
            gVar2.o("click_pos", 0);
            gVar2.o("ad_w", i19);
            gVar2.o("ad_h", i27);
            int i108 = i96;
            long j37 = j29;
            try {
                gVar2.p("aid", j37);
                gVar2.h("pt", data.opt("pt"));
                gVar2.r("viewable", z17);
                gVar2.o("screen_cnt", 1);
                gVar2.o("from_h5", 0);
                gVar2.o("from_game", 0);
                gVar2.o("exposure_type", z17 ? 1 : 0);
                cl0.g gVar3 = new cl0.g();
                gVar3.o("page_x", i88);
                gVar3.o("page_y", i89);
                gVar3.o("screen_x", i88);
                gVar3.o("screen_y", i89);
                gVar3.o("ad_number", 1);
                gVar3.o("ad_unit_number", 1);
                gVar3.o("ad_index", 0);
                gVar3.p("page_enter_time", j19);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8 e8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8.f183664a;
                gVar3.o("phone_screen_width", e8Var.c(null));
                gVar3.o("phone_screen_height", e8Var.a());
                gVar2.h("wxa_report_detail", gVar3);
                cl0.g gVar4 = new cl0.g();
                gVar4.h("oaid", ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).k9());
                ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Bi();
                gVar4.h("imei", obj2);
                gVar4.h("common_device_id", ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).wi());
                gVar2.h("ext_click_comm", gVar4.toString());
                gVar2.h("pos_id", obj3);
                cl0.g gVar5 = new cl0.g();
                gVar5.h("context_id", contextId);
                gVar5.o("pos", i108);
                gVar2.h("channels_extra_data", gVar5.toString());
                gVar2.o("click_pos", i107);
                i69 = i106;
                try {
                    gVar2.o("outer_duration", i69);
                    gVar2.o("play_count", i98);
                    int i109 = i99;
                    gVar2.o("play_total_time", i109);
                    gVar2.o("video_total_time", i100);
                    gVar2.h("play_sequence", playSequence);
                    gVar2.h("report_extra_data", data.opt("report_extra_data"));
                    gVar2.r("card_show_flag", z47);
                    gVar2.o("card_delay_sec", i105);
                    boolean z48 = z38;
                    gVar2.r("card_expand_flag", z48);
                    int i110 = i102;
                    gVar2.o("card_expand_sec", i110);
                    boolean z49 = z39;
                    gVar2.r("hit_landpage_preload", z49);
                    j29 = j37;
                    int i111 = i103;
                    try {
                        gVar2.o("landpage_preload_sec", i111);
                        gVar2.p("report_ts", c17);
                        int i112 = i104;
                        if (i112 >= 0) {
                            j27 = c17;
                            gVar2.o("expose_report_mode", i112);
                        } else {
                            j27 = c17;
                        }
                        qc2.a aVar4 = aVar3;
                        if (aVar4 == null) {
                            i77 = i112;
                        } else if (z18) {
                            i77 = i112;
                            gVar2.o("carousel_index", aVar4.f443037a);
                        } else {
                            i77 = i112;
                            gVar2.h("carousel_show_sequence", aVar4.f443040d);
                            gVar2.h("carousel_auto_sequence", aVar4.f443038b);
                            gVar2.h("carousel_man_sequence", aVar4.f443039c);
                            gVar2.h("carousel_click_sequence", aVar4.f443041e);
                        }
                        if (z18) {
                            gVar2.h("current_play_sec", java.lang.Float.valueOf(f18));
                        }
                        so2.e1 e1Var3 = e1Var2;
                        if (e1Var3 != null) {
                            try {
                                hashMap = e1Var3.f491859c;
                                hashMap2 = e1Var3.f491858b;
                                aVar2 = aVar4;
                                hashMap3 = e1Var3.f491857a;
                                z29 = z49;
                                i78 = i110;
                                gVar2.h("carousel_pic_show_sequence", e1Var3.a(hashMap3));
                                gVar2.h("carousel_pic_auto_sequence", e1Var3.a(hashMap2));
                                gVar2.h("carousel_pic_man_sequence", e1Var3.a(hashMap));
                                str4 = "Finder.FinderReportLogic";
                            } catch (java.lang.Exception e17) {
                                e = e17;
                                str4 = "Finder.FinderReportLogic";
                                qc2.b.a(bVar, 4, j17, i17, j29, z17, "e=" + e, i18, i69, false, null, 768, null);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str4, e, "reportExpose", new java.lang.Object[0]);
                            }
                            try {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "reportHardAdvertisement image, carousel_pic_show_sequence: " + e1Var3.a(hashMap3) + ", carousel_pic_auto_sequence: " + e1Var3.a(hashMap2) + ", carousel_pic_man_sequence: " + e1Var3.a(hashMap));
                            } catch (java.lang.Exception e18) {
                                e = e18;
                                qc2.b.a(bVar, 4, j17, i17, j29, z17, "e=" + e, i18, i69, false, null, 768, null);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str4, e, "reportExpose", new java.lang.Object[0]);
                            }
                        } else {
                            str4 = "Finder.FinderReportLogic";
                            i78 = i110;
                            aVar2 = aVar4;
                            z29 = z49;
                        }
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportHardAdvertisement actionType=");
                        try {
                            sb6.append(i18);
                            sb6.append(", reportType=");
                            sb6.append(i76);
                            sb6.append(", clickPos=");
                            sb6.append(i107);
                            sb6.append(", exposureType=");
                            sb6.append(z17 ? 1 : 0);
                            sb6.append(" outerDuration=");
                            sb6.append(i69);
                            sb6.append(", playTotalTime=");
                            sb6.append(i109);
                            sb6.append(", playSequence=");
                            sb6.append(playSequence);
                            sb6.append(", isCardShown=");
                            sb6.append(z47);
                            sb6.append(", cardDelaySec=");
                            sb6.append(i105);
                            sb6.append(", isCardExpand=");
                            sb6.append(z48);
                            sb6.append(", cardExpandSec=");
                            sb6.append(i78);
                            sb6.append(", hitPreload=");
                            sb6.append(z29);
                            sb6.append(", preloadSec=");
                            sb6.append(i111);
                            sb6.append(", reportTs=");
                            sb6.append(j27);
                            sb6.append(", exposeReportMode=");
                            i79 = i77;
                            sb6.append(i79);
                            sb6.append(", carouselData=");
                            sb6.append(aVar2);
                            sb6.append(", advertisementInfoAid=");
                            if (cl2Var4 != null) {
                                cl2Var2 = cl2Var4;
                                i86 = 1;
                                j28 = cl2Var2.m75942xfb822ef2(1);
                            } else {
                                cl2Var2 = cl2Var4;
                                i86 = 1;
                                j28 = 0;
                            }
                            sb6.append(pm0.v.u(j28));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, sb6.toString());
                            gVar = gVar2.toString();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
                        } catch (java.lang.Exception e19) {
                            e = e19;
                            qc2.b.a(bVar, 4, j17, i17, j29, z17, "e=" + e, i18, i69, false, null, 768, null);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str4, e, "reportExpose", new java.lang.Object[0]);
                        }
                        try {
                            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.K().r()).booleanValue()) {
                                pf5.z zVar = pf5.z.f435481a;
                                context2 = context;
                                if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                                    throw new java.lang.IllegalStateException("Check failed.".toString());
                                }
                                new db2.p(j17, str, i18, gVar, "", cl2Var2, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6()).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l3(j17, i76, z17 ? 1 : 0));
                            } else {
                                context2 = context;
                                db2.l5 l5Var = new db2.l5(j17, str, i17, i18, gVar, cl2Var2);
                                l5Var.f309597m = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m3(j17, i76, z17 ? 1 : 0);
                                gm0.j1.d().g(l5Var);
                            }
                            boolean z57 = i79 == i86 ? i86 : 0;
                            qc2.b.a(bVar, z18 ? 1 : 0, j17, i17, j29, z17, gVar, i18, i69, z57, null, 512, null);
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("isViewable", z17);
                            jSONObject.put("isVideoExpose", z57);
                            jSONObject.put("isClick", z18);
                            java.lang.String str5 = z18 ? "click" : z17 ? "viewable" : z57 != 0 ? "original-video" : "original-component";
                            pf5.z zVar2 = pf5.z.f435481a;
                            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                                throw new java.lang.IllegalStateException("Check failed.".toString());
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1 p1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1.class);
                            if (p1Var != null) {
                                p1Var.O6(j17, "reportFinderAdHard-".concat(str5), jSONObject, j29);
                            }
                            if (z18) {
                                return;
                            }
                            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                                throw new java.lang.IllegalStateException("Check failed.".toString());
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1 p1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1.class);
                            if (p1Var2 != null) {
                                p1Var2.f217032e.put(java.lang.Long.valueOf(j17), java.lang.Boolean.TRUE);
                            }
                        } catch (java.lang.Exception e27) {
                            e = e27;
                            qc2.b.a(bVar, 4, j17, i17, j29, z17, "e=" + e, i18, i69, false, null, 768, null);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str4, e, "reportExpose", new java.lang.Object[0]);
                        }
                    } catch (java.lang.Exception e28) {
                        e = e28;
                        str4 = "Finder.FinderReportLogic";
                    }
                } catch (java.lang.Exception e29) {
                    e = e29;
                    str4 = "Finder.FinderReportLogic";
                    j29 = j37;
                }
            } catch (java.lang.Exception e37) {
                e = e37;
                str4 = "Finder.FinderReportLogic";
                j29 = j37;
                i69 = i106;
            }
        } catch (java.lang.Exception e38) {
            e = e38;
            str4 = "Finder.FinderReportLogic";
            i69 = i106;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r4v1, types: [cl0.g] */
    public static void Rk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var, android.content.Context context, boolean z17, long j17, boolean z18, int i17, java.lang.Object obj) {
        boolean z19 = (i17 & 2) != 0 ? false : z17;
        ?? r37 = (i17 & 8) != 0 ? 0 : z18;
        o3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ?? gVar = new cl0.g();
        gVar.h("feedid", pm0.v.u(j17));
        gVar.o("is_spam", r37);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        java.lang.String t17 = r26.i0.t(gVar2, ",", ";", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        ij(o3Var, z19 ? 1 : 0, "new_fav_add", t17, nyVar != null ? nyVar.V6() : null, null, 16, null);
    }

    public static void Uk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k3 k3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i3 i3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.h3 h3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f3 f3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g3 g3Var, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i3 i3Var2 = (i17 & 4) != 0 ? null : i3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.h3 h3Var2 = (i17 & 8) != 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.h3.f206595e : h3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f3 f3Var2 = (i17 & 16) != 0 ? null : f3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g3 g3Var2 = (i17 & 32) != 0 ? null : g3Var;
        o3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (k3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderReportLogic", "reportPreMovieAd: reportInfo is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        try {
            cl0.g gVar = new cl0.g();
            long c17 = c01.id.c() / 1000;
            gVar.h("report_type", i3Var2 != null ? java.lang.Integer.valueOf(i3Var2.f206608d) : null);
            gVar.h("exposure_type", h3Var2 != null ? java.lang.Integer.valueOf(h3Var2.f206598d) : null);
            gVar.h("click_pos", f3Var2 != null ? java.lang.Integer.valueOf(f3Var2.f206552d) : null);
            if (h3Var2 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.h3.f206596f) {
                gVar.p("outer_duration", k3Var.f206631c);
                gVar.o("play_count", 1);
                gVar.p("play_total_time", k3Var.f206632d);
                gVar.p("video_total_time", k3Var.f206633e);
            }
            gVar.h("report_extra_data", k3Var.f206634f);
            gVar.p("report_ts", c17);
            gVar.h("ad_finish_type", g3Var2 != null ? java.lang.Integer.valueOf(g3Var2.f206583d) : null);
            java.lang.String gVar2 = gVar.toString();
            java.lang.String str = gVar2 == null ? "" : gVar2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderReportLogic", "reportPreMovieAd: feedId=" + k3Var.f206629a + ", JSON data: " + str);
            long j17 = k3Var.f206629a;
            java.lang.String str2 = k3Var.f206630b;
            java.lang.String str3 = k3Var.f206635g;
            new db2.p(j17, str2, 0, str, str3 == null ? "" : str3, null, V6).l().f(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderReportLogic", e17, "reportFinderAdCgi", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        if (r7 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Vi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 r2, long r3, int r5, int r6, java.lang.String r7, java.lang.String r8, int r9, java.lang.Object r10) {
        /*
            r10 = r9 & 8
            r0 = 0
            if (r10 == 0) goto L6
            r7 = r0
        L6:
            r9 = r9 & 16
            if (r9 == 0) goto Lb
            r8 = r0
        Lb:
            java.lang.String r9 = ""
            if (r7 == 0) goto L1a
            r2.getClass()
            java.lang.String r10 = "_"
            java.lang.String r7 = r10.concat(r7)
            if (r7 != 0) goto L1b
        L1a:
            r7 = r9
        L1b:
            java.util.HashMap r2 = r2.f206744g
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            r0 = 95
            r10.append(r0)
            if (r8 != 0) goto L2e
            r1 = r9
            goto L2f
        L2e:
            r1 = r8
        L2f:
            r10.append(r1)
            r10.append(r0)
            r10.append(r6)
            r10.append(r7)
            java.lang.String r6 = r10.toString()
            java.lang.Object r6 = r2.get(r6)
            com.tencent.mm.plugin.finder.report.e6 r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6) r6
            if (r6 == 0) goto L68
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            r10.append(r0)
            if (r8 != 0) goto L55
            r8 = r9
        L55:
            r10.append(r8)
            r10.append(r0)
            r10.append(r5)
            r10.append(r7)
            java.lang.String r3 = r10.toString()
            r2.put(r3, r6)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Vi(com.tencent.mm.plugin.finder.report.o3, long, int, int, java.lang.String, java.lang.String, int, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Vj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 r33, long r34, java.lang.String r36, int r37, long r38, java.lang.String r40, r45.qt2 r41, long r42, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 r44, java.lang.Boolean r45, int r46, java.lang.Object r47) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Vj(com.tencent.mm.plugin.finder.report.o3, long, java.lang.String, int, long, java.lang.String, r45.qt2, long, com.tencent.mm.plugin.finder.storage.FinderItem, java.lang.Boolean, int, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r8 == null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String fk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 r2, long r3, java.lang.String r5, int r6, int r7, java.lang.String r8, int r9, java.lang.Object r10) {
        /*
            r9 = r9 & 16
            if (r9 == 0) goto L5
            r8 = 0
        L5:
            java.lang.String r9 = ""
            if (r8 == 0) goto L14
            r2.getClass()
            java.lang.String r10 = "_"
            java.lang.String r8 = r10.concat(r8)
            if (r8 != 0) goto L15
        L14:
            r8 = r9
        L15:
            java.util.HashMap r2 = r2.f206744g
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            r0 = 95
            r10.append(r0)
            if (r5 != 0) goto L28
            r1 = r9
            goto L29
        L28:
            r1 = r5
        L29:
            r10.append(r1)
            r10.append(r0)
            r10.append(r6)
            r10.append(r8)
            java.lang.String r6 = r10.toString()
            java.lang.Object r6 = r2.get(r6)
            com.tencent.mm.plugin.finder.report.e6 r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6) r6
            r10 = 1
            if (r6 == 0) goto L4f
            r45.fl2 r6 = r6.f206545a
            if (r6 == 0) goto L4f
            java.lang.String r6 = r6.m75945x2fec8307(r10)
            if (r6 != 0) goto L4d
            goto L4f
        L4d:
            r9 = r6
            goto L81
        L4f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r0)
            if (r5 != 0) goto L5d
            r5 = r9
        L5d:
            r6.append(r5)
            r6.append(r0)
            r6.append(r7)
            r6.append(r8)
            java.lang.String r3 = r6.toString()
            java.lang.Object r2 = r2.get(r3)
            com.tencent.mm.plugin.finder.report.e6 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6) r2
            if (r2 == 0) goto L81
            r45.fl2 r2 = r2.f206545a
            if (r2 == 0) goto L81
            java.lang.String r2 = r2.m75945x2fec8307(r10)
            if (r2 != 0) goto L80
            goto L81
        L80:
            r9 = r2
        L81:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.fk(com.tencent.mm.plugin.finder.report.o3, long, java.lang.String, int, int, java.lang.String, int, java.lang.Object):java.lang.String");
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6 hk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var, long j17, java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.Object obj) {
        if ((i18 & 8) != 0) {
            str2 = null;
        }
        return o3Var.gk(j17, str, i17, str2);
    }

    public static /* synthetic */ void ij(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var, int i17, java.lang.String str, java.lang.String str2, r45.qt2 qt2Var, java.lang.String str3, int i18, java.lang.Object obj) {
        if ((i18 & 16) != 0) {
            str3 = null;
        }
        o3Var.hj(i17, str, str2, qt2Var, str3);
    }

    public static void pj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var, r45.qt2 qt2Var, java.lang.String requestId, int i17, int i18, java.lang.String tagText, java.lang.String queryText, int i19, long j17, int i27, int i28, java.lang.Object obj) {
        if ((i28 & 64) != 0) {
            i19 = 0;
        }
        if ((i28 & 128) != 0) {
            j17 = 0;
        }
        if ((i28 & 256) != 0) {
            i27 = 0;
        }
        o3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagText, "tagText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(queryText, "queryText");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6504xa92e9ba9 c6504xa92e9ba9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6504xa92e9ba9();
        c6504xa92e9ba9.f138481f = c6504xa92e9ba9.b("SearchSessionId", o3Var.f206742e, true);
        c6504xa92e9ba9.f138482g = c6504xa92e9ba9.b("RequestId", requestId, true);
        c6504xa92e9ba9.f138483h = i17;
        c6504xa92e9ba9.f138484i = i18;
        c6504xa92e9ba9.f138486k = 0;
        c6504xa92e9ba9.f138487l = c6504xa92e9ba9.b("TagText", tagText, true);
        c6504xa92e9ba9.f138488m = c6504xa92e9ba9.b("QueryText", queryText, true);
        c6504xa92e9ba9.f138489n = i19;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        c6504xa92e9ba9.f138490o = c6504xa92e9ba9.b("ItemId", b52.b.q(j17), true);
        c6504xa92e9ba9.f138491p = i27;
        if (qt2Var != null) {
            c6504xa92e9ba9.f138479d = c6504xa92e9ba9.b("SessionId", qt2Var.m75945x2fec8307(0), true);
            c6504xa92e9ba9.f138485j = qt2Var.m75939xb282bd08(5);
            c6504xa92e9ba9.f138480e = c6504xa92e9ba9.b("ClicktabcontextId", qt2Var.m75945x2fec8307(2), true);
            c6504xa92e9ba9.f138492q = c6504xa92e9ba9.b("ContextID", qt2Var.m75945x2fec8307(1), true);
        }
        c6504xa92e9ba9.k();
        o3Var.Zk(c6504xa92e9ba9);
    }

    public static void uj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var, java.lang.String currUI, int i17, int i18, int i19, int i27, int i28, java.lang.String str, java.lang.String str2, long j17, r45.qt2 qt2Var, int i29, int i37, int i38, java.lang.Object obj) {
        int i39 = (i38 & 16) != 0 ? 0 : i27;
        int i47 = (i38 & 32) != 0 ? 0 : i28;
        java.lang.String str3 = (i38 & 64) != 0 ? "" : str;
        java.lang.String redDotWording = (i38 & 128) != 0 ? "" : str2;
        long j18 = (i38 & 256) != 0 ? 0L : j17;
        r45.qt2 qt2Var2 = (i38 & 512) != 0 ? null : qt2Var;
        int i48 = (i38 & 1024) != 0 ? 0 : i29;
        int i49 = (i38 & 2048) != 0 ? 0 : i37;
        o3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currUI, "currUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotWording, "redDotWording");
        o3Var.sj(currUI, i17, i18, i19, i39, i47, str3, redDotWording, j18, qt2Var2, i48, i49, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static void wj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var, r45.qt2 contextObj, long j17, java.lang.String str, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, java.lang.String str2, long j18, java.lang.String str3, int i18, java.lang.Object obj) {
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String t17;
        ?? r57;
        long j19;
        r45.el2 m76948xfa25bce2;
        r45.zi2 zi2Var;
        r45.el2 m76948xfa25bce22;
        r45.el2 m76948xfa25bce23;
        java.lang.String m75945x2fec8307;
        r45.xl2 m76946x746418e4;
        long j27;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = (i18 & 8) != 0 ? null : c1163xf1deaba4;
        int i19 = (i18 & 16) != 0 ? 0 : i17;
        java.lang.String udfKv = (i18 & 32) != 0 ? "" : str2;
        long j28 = (i18 & 64) != 0 ? 0L : j18;
        java.lang.String allFeedInfo = (i18 & 128) != 0 ? "" : str3;
        o3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(udfKv, "udfKv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(allFeedInfo, "allFeedInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 dk6 = o3Var.dk(j17);
        if (dk6 != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6497x6ec53449 c6497x6ec53449 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6497x6ec53449();
            c6497x6ec53449.f138378d = contextObj.m75939xb282bd08(5);
            c6497x6ec53449.f138379e = c6497x6ec53449.b("SessionId", contextObj.m75945x2fec8307(0), true);
            c6497x6ec53449.f138380f = c6497x6ec53449.b("ContextId", contextObj.m75945x2fec8307(1), true);
            c6497x6ec53449.f138381g = c6497x6ec53449.b("ClickTabContextId", contextObj.m75945x2fec8307(2), true);
            c6497x6ec53449.f138382h = c6497x6ec53449.b("ClickFeedid", pm0.v.u(j17), true);
            c6497x6ec53449.f138385k = c01.id.c();
            java.lang.String m75945x2fec83072 = contextObj.m75945x2fec8307(9);
            if (m75945x2fec83072 != null) {
                str4 = "";
                str5 = r26.i0.t(m75945x2fec83072, ",", ";", false);
            } else {
                str4 = "";
                str5 = str4;
            }
            long j29 = j28;
            c6497x6ec53449.f138386l = c6497x6ec53449.b("PageTag", str5, true);
            c6497x6ec53449.f138388n = dk6.getMediaType();
            java.lang.String gVar = o3Var.kk().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
            c6497x6ec53449.f138389o = c6497x6ec53449.b("ScreenInfo", r26.i0.t(gVar, ",", ";", false), true);
            if (c1163xf1deaba42 != null) {
                java.lang.String jSONArray = o3Var.ck(c1163xf1deaba42).toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray, "toString(...)");
                t17 = r26.i0.t(jSONArray, ",", ";", false);
            } else {
                t17 = r26.i0.t(allFeedInfo, ",", ";", false);
            }
            c6497x6ec53449.f138383i = c6497x6ec53449.b("AllFeedInfo", t17, true);
            c6497x6ec53449.f138384j = az2.j.f97666r.b(contextObj.m75939xb282bd08(5));
            c6497x6ec53449.f138387m = c6497x6ec53449.b("SessionBuffer", o3Var.ek(j17, str, contextObj.m75939xb282bd08(5)), true);
            if (contextObj.m75939xb282bd08(5) == 15) {
                int m76819x1ca9e244 = dk6.getFeedObject().m76819x1ca9e244();
                if (m76819x1ca9e244 != 1) {
                    switch (m76819x1ca9e244) {
                        case 9:
                            j27 = 6;
                            break;
                        case 10:
                            j27 = 2;
                            break;
                        case 11:
                            j27 = 3;
                            break;
                        case 12:
                            j27 = 5;
                            break;
                        case 13:
                            j27 = 4;
                            break;
                        default:
                            j27 = 0;
                            break;
                    }
                } else {
                    j27 = 1;
                }
                c6497x6ec53449.f138390p = j27;
                java.lang.String m76818x5d49e3ea = dk6.getFeedObject().m76818x5d49e3ea();
                if (m76818x5d49e3ea == null) {
                    m76818x5d49e3ea = str4;
                }
                c6497x6ec53449.f138391q = c6497x6ec53449.b("RecommendWording", m76818x5d49e3ea, true);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = dk6.getFeedObject().m76802x2dd01666();
            if (m76802x2dd01666 == null || (m76946x746418e4 = m76802x2dd01666.m76946x746418e4()) == null) {
                r57 = 1;
            } else {
                r57 = 1;
                c6497x6ec53449.f138394t = c6497x6ec53449.b("ActivityID", pm0.v.u(m76946x746418e4.m75942xfb822ef2(0)), true);
                c6497x6ec53449.f138395u = i19;
                java.lang.String m75945x2fec83073 = contextObj.m75945x2fec8307(15);
                if (m75945x2fec83073 == null) {
                    m75945x2fec83073 = str4;
                }
                c6497x6ec53449.f138396v = c6497x6ec53449.b("ActivityInfo", m75945x2fec83073, true);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = dk6.getFeedObject().m76802x2dd01666();
            c6497x6ec53449.f138392r = c6497x6ec53449.b("GroupID", (m76802x2dd016662 == null || (m76948xfa25bce23 = m76802x2dd016662.m76948xfa25bce2()) == 0 || (m75945x2fec8307 = m76948xfa25bce23.m75945x2fec8307(r57)) == null) ? str4 : m75945x2fec8307, r57);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663 = dk6.getFeedObject().m76802x2dd01666();
            if (((m76802x2dd016663 == null || (m76948xfa25bce22 = m76802x2dd016663.m76948xfa25bce2()) == null) ? null : (r45.zi2) m76948xfa25bce22.m75936x14adae67(0)) != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016664 = dk6.getFeedObject().m76802x2dd01666();
                java.lang.String m75945x2fec83074 = (m76802x2dd016664 == null || (m76948xfa25bce2 = m76802x2dd016664.m76948xfa25bce2()) == null || (zi2Var = (r45.zi2) m76948xfa25bce2.m75936x14adae67(0)) == null) ? null : zi2Var.m75945x2fec8307(0);
                if (!(m75945x2fec83074 == null || m75945x2fec83074.length() == 0)) {
                    j19 = 2;
                    c6497x6ec53449.f138393s = j19;
                    c6497x6ec53449.f138397w = c6497x6ec53449.b("jump_id", contextObj.m75945x2fec8307(16), true);
                    c6497x6ec53449.f138398x = c6497x6ec53449.b("udf_kv", r26.i0.t(udfKv, ",", ";", false), true);
                    c6497x6ec53449.f138399y = j29;
                    c6497x6ec53449.k();
                    o3Var.Zk(c6497x6ec53449);
                }
            }
            j19 = 1;
            c6497x6ec53449.f138393s = j19;
            c6497x6ec53449.f138397w = c6497x6ec53449.b("jump_id", contextObj.m75945x2fec8307(16), true);
            c6497x6ec53449.f138398x = c6497x6ec53449.b("udf_kv", r26.i0.t(udfKv, ",", ";", false), true);
            c6497x6ec53449.f138399y = j29;
            c6497x6ec53449.k();
            o3Var.Zk(c6497x6ec53449);
        }
    }

    public final void Ai(android.content.Context context, long j17, java.lang.String str, java.lang.String key, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6 hk6 = hk(this, j17, str, nyVar != null ? nyVar.V6().m75939xb282bd08(5) : 0, null, 8, null);
        r45.fl2 fl2Var = hk6 != null ? hk6.f206545a : null;
        if (fl2Var != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("jumpinfoType", c19786x6a1e2862.m76503x92bc3c07());
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0 = c19786x6a1e2862.m76506x42318aa0();
                jSONObject.put("nativeType", m76506x42318aa0 != null ? java.lang.Integer.valueOf(m76506x42318aa0.m77224x4236b52c()) : null);
                jSONObject.put("wording", c19786x6a1e2862.m76523x98b23862());
                java.lang.String m75945x2fec8307 = fl2Var.m75945x2fec8307(5);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                org.json.JSONObject jSONObject2 = m75945x2fec8307.length() == 0 ? new org.json.JSONObject() : new org.json.JSONObject(m75945x2fec8307);
                org.json.JSONObject optJSONObject = jSONObject2.optJSONObject("jumpicon_info");
                if (optJSONObject == null) {
                    optJSONObject = new org.json.JSONObject();
                }
                optJSONObject.put("jumpicon_info", jSONObject);
                jSONObject2.put(key, optJSONObject);
                fl2Var.set(5, jSONObject2.toString());
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderReportLogic", e17.getMessage());
            }
        }
    }

    public final void Ak(int i17, java.lang.String userName, java.lang.String profileBizUin, java.lang.String str, r45.qt2 contextObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(profileBizUin, "profileBizUin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6565x701858c0 c6565x701858c0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6565x701858c0();
        c6565x701858c0.f139174d = i17;
        c6565x701858c0.f139176f = c6565x701858c0.b("ProfileUsername", userName, true);
        c6565x701858c0.f139177g = c6565x701858c0.b("ProfileBizUin", profileBizUin, true);
        c6565x701858c0.f139178h = c6565x701858c0.b("ExtInfo", str, true);
        c6565x701858c0.f139179i = c6565x701858c0.b("Contextid", contextObj.m75945x2fec8307(1), true);
        java.lang.String m75945x2fec8307 = contextObj.m75945x2fec8307(11);
        c6565x701858c0.f139180j = c6565x701858c0.b("ExtraInfo", m75945x2fec8307 != null ? r26.i0.t(m75945x2fec8307, ",", ";", false) : "", true);
        java.lang.String m75945x2fec83072 = contextObj.m75945x2fec8307(12);
        c6565x701858c0.f139181k = c6565x701858c0.b("EnterSourceInfo", m75945x2fec83072 != null ? r26.i0.t(m75945x2fec83072, ",", ";", false) : "", true);
        c6565x701858c0.k();
        Zk(c6565x701858c0);
    }

    public final void Bi(int i17, long j17, java.lang.String str, float f17, long j18, int i18, java.lang.String traceId, java.lang.String sourceFeedId, int i19, int i27, long j19, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traceId, "traceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceFeedId, "sourceFeedId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6 hk6 = hk(this, j17, str, i17, null, 8, null);
        r45.fl2 fl2Var = hk6 != null ? hk6.f206545a : null;
        if (fl2Var != null) {
            java.lang.String m75945x2fec8307 = fl2Var.m75945x2fec8307(5);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            fl2Var.set(5, ak(f17, j18, i18, traceId, sourceFeedId, i19, m75945x2fec8307, i17, i27, j19, i28));
        }
    }

    public final void Bj(int i17, int i18, int i19, int i27, long j17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6543x326b638f c6543x326b638f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6543x326b638f();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6543x326b638f.f138954d = c6543x326b638f.b("SessionId", Ri, true);
        c6543x326b638f.f138955e = i17;
        c6543x326b638f.f138959i = i18;
        c6543x326b638f.f138956f = i19;
        c6543x326b638f.f138957g = i27;
        if (j17 == 0) {
            str = "0";
        } else if (j17 > 0) {
            str = java.lang.Long.toString(j17, 10);
        } else {
            char[] cArr = new char[64];
            long j18 = (j17 >>> 1) / 5;
            long j19 = 10;
            int i28 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (j17 - (j18 * j19)), 10);
            while (j18 > 0) {
                i28--;
                cArr[i28] = java.lang.Character.forDigit((int) (j18 % j19), 10);
                j18 /= j19;
            }
            str = new java.lang.String(cArr, i28, 64 - i28);
        }
        c6543x326b638f.f138958h = c6543x326b638f.b("feedid", str, true);
        c6543x326b638f.k();
        Zk(c6543x326b638f);
    }

    public void Bk(int i17, long j17, long j18, int i18, int i19, long j19, long j27, long j28, long j29, int i27, int i28, java.lang.String statistics, int i29, int i37, java.lang.String cgiErrmsg, int i38, int i39, java.lang.String liveEventMsg, java.lang.String extra, java.lang.String snn, long j37, long j38, java.lang.String session) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statistics, "statistics");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiErrmsg, "cgiErrmsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveEventMsg, "liveEventMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snn, "snn");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6534xda11b7de c6534xda11b7de = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6534xda11b7de();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        c6534xda11b7de.f138885d = 7L;
        c6534xda11b7de.f138886e = i17;
        c6534xda11b7de.f138887f = i18;
        c6534xda11b7de.f138888g = i19;
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        st2.f2 f2Var = st2.f2.f493820a;
        c6534xda11b7de.f138889h = ((java.lang.Number) ((jz5.n) st2.f2.f493824e).mo141623x754a37bb()).intValue();
        c6534xda11b7de.f138890i = j19;
        c6534xda11b7de.f138891j = j27;
        c6534xda11b7de.f138892k = j28;
        c6534xda11b7de.f138893l = j29;
        c6534xda11b7de.f138894m = i27;
        c6534xda11b7de.f138895n = i28;
        c6534xda11b7de.f138896o = c6534xda11b7de.b("statistics", r26.i0.t(statistics, ",", ";", false), true);
        c6534xda11b7de.f138897p = i29;
        c6534xda11b7de.f138898q = i37;
        c6534xda11b7de.f138899r = c6534xda11b7de.b("cgiErrmsg", cgiErrmsg, true);
        c6534xda11b7de.f138900s = i38;
        c6534xda11b7de.f138901t = i39;
        c6534xda11b7de.f138902u = c6534xda11b7de.b("liveEventMsg", liveEventMsg, true);
        c6534xda11b7de.f138903v = c6534xda11b7de.b("extra", extra, true);
        c6534xda11b7de.f138904w = c6534xda11b7de.b("snn", snn, true);
        c6534xda11b7de.f138905x = j37;
        c6534xda11b7de.f138906y = j38;
        c6534xda11b7de.f138907z = c6534xda11b7de.b("localsession", session, true);
        c6534xda11b7de.A = j17;
        c6534xda11b7de.B = j18;
        if (i17 == 2) {
            cl0.g gVar = new cl0.g();
            ae2.in inVar = ae2.in.f85221a;
            gVar.o("enableClickRedDotPreloadPlayer", ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85273f1).mo141623x754a37bb()).r()).intValue());
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            c6534xda11b7de.C = c6534xda11b7de.b("exptJson", r26.i0.t(gVar2, ",", ";", false), true);
        }
        c6534xda11b7de.k();
        Zk(c6534xda11b7de);
    }

    public final void Cj(int i17, int i18, int i19, long j17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6543x326b638f c6543x326b638f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6543x326b638f();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6543x326b638f.f138954d = c6543x326b638f.b("SessionId", Ri, true);
        c6543x326b638f.f138955e = i17;
        c6543x326b638f.f138959i = 0L;
        c6543x326b638f.f138956f = i18;
        c6543x326b638f.f138957g = i19;
        if (j17 == 0) {
            str = "0";
        } else if (j17 > 0) {
            str = java.lang.Long.toString(j17, 10);
        } else {
            char[] cArr = new char[64];
            long j18 = (j17 >>> 1) / 5;
            long j19 = 10;
            char forDigit = java.lang.Character.forDigit((int) (j17 - (j18 * j19)), 10);
            int i27 = 63;
            cArr[63] = forDigit;
            while (j18 > 0) {
                i27--;
                cArr[i27] = java.lang.Character.forDigit((int) (j18 % j19), 10);
                j18 /= j19;
            }
            str = new java.lang.String(cArr, i27, 64 - i27);
        }
        c6543x326b638f.f138958h = c6543x326b638f.b("feedid", str, true);
        c6543x326b638f.k();
        Zk(c6543x326b638f);
    }

    public void Ck(long j17, java.lang.String appId, java.lang.String clickId, long j18, java.lang.String sessionid, java.lang.String setting, java.lang.String requestId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickId, "clickId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionid, "sessionid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setting, "setting");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6805x9ae601cf c6805x9ae601cf = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6805x9ae601cf();
        c6805x9ae601cf.f141339d = java.lang.System.currentTimeMillis();
        c6805x9ae601cf.f141340e = j17;
        c6805x9ae601cf.f141343h = c6805x9ae601cf.b("appid", appId, true);
        c6805x9ae601cf.f141346k = c6805x9ae601cf.b("clickid", clickId, true);
        c6805x9ae601cf.f141341f = j18;
        c6805x9ae601cf.f141345j = c6805x9ae601cf.b("finderid", g92.b.f351302e.U(), true);
        c6805x9ae601cf.f141344i = c6805x9ae601cf.b("session_id", sessionid, true);
        c6805x9ae601cf.f141342g = c6805x9ae601cf.b("setting", setting, true);
        c6805x9ae601cf.f141347l = c6805x9ae601cf.b("requestID", requestId, true);
        c6805x9ae601cf.k();
        Zk(c6805x9ae601cf);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Di(android.content.Context r22, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 r23) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Di(android.content.Context, com.tencent.mm.plugin.finder.storage.FinderItem):void");
    }

    public final void Dj(int i17, java.lang.String str, java.lang.String str2, long j17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 dk6 = dk(j17);
        if (dk6 != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6477x8acf2a84 c6477x8acf2a84 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6477x8acf2a84();
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            c6477x8acf2a84.f138205d = c6477x8acf2a84.b("SessionId", Ri, true);
            c6477x8acf2a84.f138206e = c6477x8acf2a84.b("ClickUI", "", true);
            c6477x8acf2a84.f138207f = c6477x8acf2a84.b("FeedId", Ui(j17), true);
            c6477x8acf2a84.f138208g = c6477x8acf2a84.b("FeedUsr", dk6.m59299x6bf53a6c(), true);
            c6477x8acf2a84.f138209h = dk6.m59254xf4204902();
            c6477x8acf2a84.f138210i = dk6.m59216x8ed22866();
            c6477x8acf2a84.f138211j = dk6.m59247xf67fd084();
            c6477x8acf2a84.f138212k = i18;
            c6477x8acf2a84.f138213l = i17;
            c6477x8acf2a84.f138214m = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.r().r()).intValue() == 1 ? 1L : 0L;
            c6477x8acf2a84.f138215n = c6477x8acf2a84.b("ContextId", str, true);
            c6477x8acf2a84.f138216o = c6477x8acf2a84.b("ClickTabContextId", str2, true);
            c6477x8acf2a84.k();
            Zk(c6477x8acf2a84);
        }
    }

    public final void Dk(long j17, long j18, long j19, r45.qt2 qt2Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6294xce9aab24 c6294xce9aab24 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6294xce9aab24();
        c6294xce9aab24.f136556h = j17;
        c6294xce9aab24.f136557i = c6294xce9aab24.b("EventTime", java.lang.String.valueOf(c01.id.c()), true);
        c6294xce9aab24.f136558j = j18;
        c6294xce9aab24.f136559k = c6294xce9aab24.b("ActivityId", pm0.v.u(j19), true);
        c6294xce9aab24.f136555g = qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0L;
        c6294xce9aab24.f136552d = c6294xce9aab24.b("SessionId", qt2Var != null ? qt2Var.m75945x2fec8307(0) : null, true);
        c6294xce9aab24.f136553e = c6294xce9aab24.b("ClickTabContextid", qt2Var != null ? qt2Var.m75945x2fec8307(2) : null, true);
        c6294xce9aab24.f136554f = c6294xce9aab24.b("FinderContexId", qt2Var != null ? qt2Var.m75945x2fec8307(1) : null, true);
        c6294xce9aab24.k();
        Zk(c6294xce9aab24);
    }

    public final void Ej(int i17, long j17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6592xf7203db0 c6592xf7203db0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6592xf7203db0();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6592xf7203db0.f139425d = c6592xf7203db0.b("SessionId", Ri, true);
        c6592xf7203db0.f139426e = i17;
        c6592xf7203db0.f139427f = j17;
        c6592xf7203db0.k();
        Zk(c6592xf7203db0);
    }

    public final void Ek(java.lang.String appId, int i17, r45.qt2 qt2Var, java.lang.String resId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resId, "resId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7068xb2c0a94b c7068xb2c0a94b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7068xb2c0a94b();
        c7068xb2c0a94b.f143751d = c7068xb2c0a94b.b("AppID", appId, true);
        c7068xb2c0a94b.f143752e = i17;
        c7068xb2c0a94b.f143757j = c7068xb2c0a94b.b("pageResrouceID", resId, true);
        if (qt2Var != null) {
            c7068xb2c0a94b.f143754g = c7068xb2c0a94b.b("ContextId", qt2Var.m75945x2fec8307(1), true);
            c7068xb2c0a94b.f143756i = qt2Var.m75939xb282bd08(5);
            c7068xb2c0a94b.f143755h = c7068xb2c0a94b.b("click_tab_context_id", qt2Var.m75945x2fec8307(2), true);
            c7068xb2c0a94b.f143753f = c7068xb2c0a94b.b("sessionID", qt2Var.m75945x2fec8307(0), true);
        }
        c7068xb2c0a94b.k();
        Zk(c7068xb2c0a94b);
    }

    public final void Fj(int i17, int i18, r45.qt2 contextObj, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6494x7b04f8ba c6494x7b04f8ba = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6494x7b04f8ba();
        c6494x7b04f8ba.f138366d = i17 > 0 ? i17 : 0L;
        c6494x7b04f8ba.f138367e = i18 > 0 ? i18 : 0L;
        c6494x7b04f8ba.f138368f = c01.id.c();
        c6494x7b04f8ba.f138369g = c6494x7b04f8ba.b("Sessionid", contextObj.m75945x2fec8307(0), true);
        c6494x7b04f8ba.f138373k = c6494x7b04f8ba.b("ContextID", contextObj.m75945x2fec8307(1), true);
        c6494x7b04f8ba.f138370h = c6494x7b04f8ba.b("ClickContextid", contextObj.m75945x2fec8307(2), true);
        c6494x7b04f8ba.f138372j = i19;
        if (i18 != 1) {
            if (i18 != 2) {
                if (i18 != 3) {
                    if (i18 != 4) {
                        if (i18 == 35 && ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("finder_tl_city_tab") != null) {
                            c6494x7b04f8ba.f138371i = 1L;
                        }
                    } else if (((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("finder_tl_hot_tab") != null) {
                        c6494x7b04f8ba.f138371i = 1L;
                    }
                } else if (((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLFollow") != null) {
                    c6494x7b04f8ba.f138371i = 1L;
                }
            } else if (((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("finder_tl_nearby_tab") != null) {
                c6494x7b04f8ba.f138371i = 1L;
            }
        } else if (((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLRecommendTab") != null) {
            c6494x7b04f8ba.f138371i = 1L;
        }
        c6494x7b04f8ba.k();
        Zk(c6494x7b04f8ba);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_ALL_CLICK_TAB_CONTEXT_ID_STRING, c6494x7b04f8ba.f138370h);
        if (i18 != 2) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TAB_CLICK_TAB_CONTEXT_ID_STRING, c6494x7b04f8ba.f138370h);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderReportLogic", "finderReportTabChange clickTabContextId [%s] toTab[%d]", c6494x7b04f8ba.f138370h, java.lang.Integer.valueOf(i18));
    }

    public final void Fk(long j17, java.lang.String str, int i17, int i18, int i19, int i27, java.lang.String mutualAdInfo, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mutualAdInfo, "mutualAdInfo");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6457xf0512241 c6457xf0512241 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6457xf0512241();
        c6457xf0512241.f138000d = c6457xf0512241.b("feedid", Ui(j17), true);
        c6457xf0512241.f138002f = i17;
        c6457xf0512241.f138003g = i18;
        if (i18 == 2) {
            cl0.g gVar = new cl0.g();
            gVar.o("duration", i27);
            gVar.o("playpercent", (int) (((i19 * 1.0f) / i27) * 100));
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            c6457xf0512241.f138004h = c6457xf0512241.b("feedplayinfo", r26.i0.t(gVar2, ",", ";", false), true);
        }
        c6457xf0512241.f138005i = c6457xf0512241.b("MutualAdInfo", r26.i0.t(mutualAdInfo, ",", ";", false), true);
        if (qt2Var != null) {
            java.lang.String m75945x2fec8307 = qt2Var.m75945x2fec8307(11);
            c6457xf0512241.f138008l = c6457xf0512241.b("ExtraInfo", m75945x2fec8307 != null ? r26.i0.t(m75945x2fec8307, ",", ";", false) : "", true);
            java.lang.String m75945x2fec83072 = qt2Var.m75945x2fec8307(12);
            c6457xf0512241.f138009m = c6457xf0512241.b("enterSourceInfo", m75945x2fec83072 != null ? r26.i0.t(m75945x2fec83072, ",", ";", false) : "", true);
            c6457xf0512241.f138006j = c6457xf0512241.b("sessionbuffer", r26.i0.t(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(j17, str, qt2Var.m75939xb282bd08(5)), ",", ";", false), true);
            c6457xf0512241.f138007k = c6457xf0512241.b("Contextid", qt2Var.m75945x2fec8307(1), true);
            c6457xf0512241.f138001e = qt2Var.m75939xb282bd08(5);
        }
        c6457xf0512241.k();
        Zk(c6457xf0512241);
    }

    public final void Gj(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, int i19, int i27, int i28, int i29, r45.qt2 qt2Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6580xb6ce5ad c6580xb6ce5ad = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6580xb6ce5ad();
        c6580xb6ce5ad.f139305f = i17;
        c6580xb6ce5ad.f139306g = c6580xb6ce5ad.b("searchSessionId", str, true);
        c6580xb6ce5ad.f139307h = c6580xb6ce5ad.b("requestId", str2, true);
        c6580xb6ce5ad.f139308i = c6580xb6ce5ad.b("query", str3, true);
        c6580xb6ce5ad.f139309j = i18;
        c6580xb6ce5ad.f139310k = i19;
        c6580xb6ce5ad.f139312m = i27;
        c6580xb6ce5ad.f139313n = i28;
        c6580xb6ce5ad.f139314o = i29;
        if (qt2Var != null) {
            c6580xb6ce5ad.f139303d = c6580xb6ce5ad.b(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, qt2Var.m75945x2fec8307(0), true);
            c6580xb6ce5ad.f139311l = qt2Var.m75939xb282bd08(5);
            c6580xb6ce5ad.f139304e = c6580xb6ce5ad.b("ClickTabContextId", qt2Var.m75945x2fec8307(2), true);
        }
        c6580xb6ce5ad.k();
        Zk(c6580xb6ce5ad);
    }

    public final void Gk(android.content.Context context, long j17, boolean z17, boolean z18, int i17, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        cl0.g gVar = new cl0.g();
        gVar.o("is_logo", z18 ? 1 : 0);
        gVar.o("finder_type", i17);
        if (z17) {
            gVar.o("click_type", z19 ? 1 : 2);
            gVar.h("feed_id", pm0.v.u(j17));
        }
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        java.lang.String t17 = r26.i0.t(gVar2, ",", ";", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        ij(this, z17 ? 1 : 0, "comment_avatar", t17, nyVar != null ? nyVar.V6() : null, null, 16, null);
    }

    public final void Hj(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, int i19, int i27, int i28, java.lang.String str4, int i29, int i37, r45.qt2 qt2Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6581xdf58d10f c6581xdf58d10f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6581xdf58d10f();
        c6581xdf58d10f.f139315d = c6581xdf58d10f.b("RequestId", str, true);
        c6581xdf58d10f.f139316e = c6581xdf58d10f.b("Query", str2, true);
        c6581xdf58d10f.f139317f = i17;
        c6581xdf58d10f.f139318g = i18;
        c6581xdf58d10f.f139319h = c6581xdf58d10f.b("ItemId", str3, true);
        c6581xdf58d10f.f139320i = i19;
        c6581xdf58d10f.f139321j = i27;
        c6581xdf58d10f.f139322k = i28;
        if (qt2Var != null) {
            c6581xdf58d10f.f139323l = c6581xdf58d10f.b("sessionid", qt2Var.m75945x2fec8307(0), true);
            c6581xdf58d10f.f139325n = qt2Var.m75939xb282bd08(5);
            c6581xdf58d10f.f139324m = c6581xdf58d10f.b("clicktabcontextid", qt2Var.m75945x2fec8307(2), true);
        }
        c6581xdf58d10f.f139326o = c6581xdf58d10f.b("searchSessionid", str4, true);
        c6581xdf58d10f.f139327p = i29;
        c6581xdf58d10f.f139328q = i37;
        c6581xdf58d10f.k();
        Zk(c6581xdf58d10f);
    }

    public final void Ik(android.view.View view, long j17, long j18, int i17, java.lang.String commentContent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentContent, "commentContent");
        hc2.v0.e(view, "help_author_together", 0, 0, false, false, kz5.c1.k(new jz5.l("feed_id", pm0.v.u(j17)), new jz5.l("comment_id", pm0.v.u(j18)), new jz5.l("comment_content_type", java.lang.Integer.valueOf(i17)), new jz5.l("comment_content", commentContent)), null, 94, null);
    }

    public final void Jj(android.content.Context context, long j17, boolean z17, long j18, long j19, boolean z18, long j27, java.lang.String redDotCountDetail, java.lang.String finderUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotCountDetail, "redDotCountDetail");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6552x4d6eeb74 c6552x4d6eeb74 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6552x4d6eeb74();
        c6552x4d6eeb74.f139014d = c6552x4d6eeb74.b("sessionid", V6 != null ? V6.m75945x2fec8307(0) : null, true);
        c6552x4d6eeb74.f139015e = j17;
        c6552x4d6eeb74.f139016f = z17 ? 1L : 0L;
        c6552x4d6eeb74.f139017g = j18;
        c6552x4d6eeb74.f139018h = j19;
        c6552x4d6eeb74.f139019i = java.lang.System.currentTimeMillis();
        c6552x4d6eeb74.f139020j = z18 ? 1L : 0L;
        c6552x4d6eeb74.f139021k = j27;
        c6552x4d6eeb74.f139022l = c6552x4d6eeb74.b("RedDotCountDetail", redDotCountDetail, true);
        if (finderUsername.length() > 0) {
            c6552x4d6eeb74.f139023m = c6552x4d6eeb74.b("finderusername", finderUsername, true);
        }
        c6552x4d6eeb74.k();
    }

    public final void Jk(r45.qt2 qt2Var, boolean z17, int i17, java.lang.String wordText, java.lang.String referer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wordText, "wordText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(referer, "referer");
        int i18 = z17 ? 1 : 0;
        try {
            cl0.g gVar = new cl0.g();
            gVar.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 4);
            byte[] decode = android.util.Base64.decode(referer, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
            gVar.h("referer", new cl0.g(new java.lang.String(decode, r26.c.f450398a)));
            cl0.g gVar2 = new cl0.g();
            gVar2.h("jump_info", gVar);
            gVar2.o("position", i17 - 1);
            gVar2.h("word_text", wordText);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a, qt2Var, "feed_jumpicon", i18, gVar2, true, null, 32, null);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderReportLogic", e17.getMessage());
        }
    }

    public final void Kk(long j17, java.lang.String str, long j18, long j19, java.lang.String paperWording, long j27, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paperWording, "paperWording");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6385xcd4de298 c6385xcd4de298 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6385xcd4de298();
        c6385xcd4de298.f137301d = c6385xcd4de298.b("Feedid", Ui(j17), true);
        c6385xcd4de298.f137303f = j18;
        c6385xcd4de298.f137304g = c6385xcd4de298.b("DailyPaperId", Ui(j19), true);
        c6385xcd4de298.f137305h = c6385xcd4de298.b("DailyPaperWording", paperWording, true);
        c6385xcd4de298.f137307j = j27;
        c6385xcd4de298.f137302e = c01.id.c();
        c6385xcd4de298.f137306i = c6385xcd4de298.b("SessionBuffer", ek(j17, str, i17), true);
        c6385xcd4de298.k();
        Zk(c6385xcd4de298);
    }

    public final void Lj(int i17, int i18) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6583x4e81d973 c6583x4e81d973 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6583x4e81d973();
        c6583x4e81d973.f139346d = i17;
        c6583x4e81d973.f139347e = i18;
        c6583x4e81d973.k();
        Zk(c6583x4e81d973);
    }

    public final void Lk(android.content.Context context, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (this.f206750p) {
            cl0.g gVar = new cl0.g();
            gVar.o("hasfeed", z18 ? 1 : 0);
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            java.lang.String t17 = r26.i0.t(gVar2, ",", ";", false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            ij(this, z17 ? 1 : 0, "post_moment", t17, nyVar != null ? nyVar.V6() : null, null, 16, null);
        }
    }

    public final void Mk(java.lang.String exposeFeedId, int i17, r45.qt2 contextObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposeFeedId, "exposeFeedId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        jx3.f.INSTANCE.d(20585, exposeFeedId, java.lang.Long.valueOf(c01.id.c()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(contextObj.m75939xb282bd08(5)), contextObj.m75945x2fec8307(2), contextObj.m75945x2fec8307(0));
    }

    public final void Ni(in5.s0 holder, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject) {
        int i17;
        int intValue;
        r45.vx0 vx0Var;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) holder.p(com.p314xaae8f345.mm.R.id.e_k);
        long j18 = 0;
        float m61469xb7aadf97 = ((float) (c15196x85976f5f != null ? c15196x85976f5f.m61469xb7aadf97() : 0L)) / 1000;
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        int m75939xb282bd08 = nyVar != null ? nyVar.V6().m75939xb282bd08(5) : 0;
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(feedObject.m59264x7efe73ec());
        int m75939xb282bd082 = mb4Var != null ? mb4Var.m75939xb282bd08(3) : 0;
        int O6 = ((ey2.v2) pf5.u.f435469a.e(c61.l7.class).a(ey2.v2.class)).O6(j17) + 1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar2 != null ? nyVar2.V6() : null;
        int m8183xf806b362 = holder.m8183xf806b362() - (V6 != null ? V6.m75939xb282bd08(4) : 0);
        java.lang.String str = "";
        java.lang.String u17 = V6 != null ? pm0.v.u(V6.m75942xfb822ef2(6)) : "";
        if (V6 != null && (m75945x2fec8307 = V6.m75945x2fec8307(19)) != null) {
            str = m75945x2fec8307;
        }
        int m75939xb282bd083 = V6 != null ? V6.m75939xb282bd08(7) : 0;
        r45.dm2 m76806xdef68064 = feedObject.getFeedObject().m76806xdef68064();
        if (m76806xdef68064 != null && (vx0Var = (r45.vx0) m76806xdef68064.m75936x14adae67(0)) != null) {
            j18 = vx0Var.m75942xfb822ef2(0);
        }
        long j19 = j18;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(feedObject.getColumnId());
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            intValue = valueOf.intValue();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4 l4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207294a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207297d.get(java.lang.Long.valueOf(j17));
            java.lang.Integer valueOf2 = c14994x9b99c079 != null ? java.lang.Integer.valueOf(c14994x9b99c079.getColumnId()) : null;
            if (valueOf2 == null) {
                i17 = 0;
                Bi(m75939xb282bd08, j17, feedObject.m59229xb5af1dd5(), m61469xb7aadf97, m75939xb282bd082, O6, str, u17, m8183xf806b362, m75939xb282bd083, j19, i17);
            }
            intValue = valueOf2.intValue();
        }
        i17 = intValue;
        Bi(m75939xb282bd08, j17, feedObject.m59229xb5af1dd5(), m61469xb7aadf97, m75939xb282bd082, O6, str, u17, m8183xf806b362, m75939xb282bd083, j19, i17);
    }

    public final void Nj(int i17, boolean z17, java.lang.String receiver, long j17, java.lang.String str, r45.qt2 qt2Var) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        java.lang.String m75945x2fec83073;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "receiver");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6500xc2ec9054 c6500xc2ec9054 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6500xc2ec9054();
        c6500xc2ec9054.f138445r = qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0L;
        c6500xc2ec9054.f138432e = i17;
        c6500xc2ec9054.f138433f = z17 ? 1L : 2L;
        c6500xc2ec9054.f138449v = j17;
        c6500xc2ec9054.u(receiver);
        java.lang.String str5 = "";
        if (qt2Var == null || (str2 = qt2Var.m75945x2fec8307(0)) == null) {
            str2 = "";
        }
        c6500xc2ec9054.v(str2);
        if (qt2Var == null || (str3 = qt2Var.m75945x2fec8307(2)) == null) {
            str3 = "";
        }
        c6500xc2ec9054.p(str3);
        if (qt2Var == null || (str4 = qt2Var.m75945x2fec8307(1)) == null) {
            str4 = "";
        }
        c6500xc2ec9054.r(str4);
        c6500xc2ec9054.t((qt2Var == null || (m75945x2fec83073 = qt2Var.m75945x2fec8307(11)) == null) ? "" : r26.i0.t(m75945x2fec83073, ",", ";", false));
        c6500xc2ec9054.s((qt2Var == null || (m75945x2fec83072 = qt2Var.m75945x2fec8307(12)) == null) ? "" : r26.i0.t(m75945x2fec83072, ",", ";", false));
        if (str == null) {
            str = "";
        }
        c6500xc2ec9054.C = c6500xc2ec9054.b("ActivityID", str, true);
        if (qt2Var != null && (m75945x2fec8307 = qt2Var.m75945x2fec8307(16)) != null) {
            str5 = m75945x2fec8307;
        }
        c6500xc2ec9054.E = c6500xc2ec9054.b("jump_id", str5, true);
        cl0.g gVar = new cl0.g();
        gVar.p("menu_exp_time", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206966b);
        gVar.h("feed_columnid", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(20)) : null);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        c6500xc2ec9054.q(r26.i0.t(gVar2, ",", ";", false));
        c6500xc2ec9054.k();
        Zk(c6500xc2ec9054);
    }

    public final void Oj(long j17, int i17, long j18, java.lang.String receiver, long j19, r45.qt2 qt2Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        java.lang.String m75945x2fec83073;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "receiver");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6500xc2ec9054 c6500xc2ec9054 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6500xc2ec9054();
        c6500xc2ec9054.f138445r = qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0L;
        c6500xc2ec9054.f138432e = i17;
        c6500xc2ec9054.f138433f = j18;
        c6500xc2ec9054.f138449v = j19;
        c6500xc2ec9054.u(receiver);
        java.lang.String str4 = "";
        if (qt2Var == null || (str = qt2Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        c6500xc2ec9054.v(str);
        c6500xc2ec9054.f138448u = c6500xc2ec9054.b("SessionBuffer", ek(j17, null, qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0), true);
        if (qt2Var == null || (str2 = qt2Var.m75945x2fec8307(2)) == null) {
            str2 = "";
        }
        c6500xc2ec9054.p(str2);
        if (qt2Var == null || (str3 = qt2Var.m75945x2fec8307(1)) == null) {
            str3 = "";
        }
        c6500xc2ec9054.r(str3);
        c6500xc2ec9054.t((qt2Var == null || (m75945x2fec83073 = qt2Var.m75945x2fec8307(11)) == null) ? "" : r26.i0.t(m75945x2fec83073, ",", ";", false));
        c6500xc2ec9054.s((qt2Var == null || (m75945x2fec83072 = qt2Var.m75945x2fec8307(12)) == null) ? "" : r26.i0.t(m75945x2fec83072, ",", ";", false));
        c6500xc2ec9054.B = c6500xc2ec9054.b("ColumnId", pm0.v.u(j17), true);
        if (qt2Var != null && (m75945x2fec8307 = qt2Var.m75945x2fec8307(16)) != null) {
            str4 = m75945x2fec8307;
        }
        c6500xc2ec9054.E = c6500xc2ec9054.b("jump_id", str4, true);
        cl0.g gVar = new cl0.g();
        gVar.p("menu_exp_time", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206966b);
        gVar.h("feed_columnid", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(20)) : null);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        c6500xc2ec9054.q(r26.i0.t(gVar2, ",", ";", false));
        c6500xc2ec9054.k();
        Zk(c6500xc2ec9054);
    }

    public final void Ok(java.lang.String contextId, boolean z17, boolean z18, cl0.g data, int i17, int i18, int i19, int i27, int i28, java.lang.String adPosId, long j17, long j18, int i29, float f17, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adPosId, "adPosId");
        try {
            cl0.g gVar = new cl0.g();
            gVar.o("report_type", z18 ? 2 : 1);
            gVar.h("advert_group_id", data.mo15082x48bce8a4(ya.b.f77478x4cd4defb));
            gVar.h("trace_id", data.mo15082x48bce8a4("traceid"));
            java.lang.String mo15082x48bce8a4 = data.mo15082x48bce8a4("apurl");
            java.lang.String mo15082x48bce8a42 = data.mo15082x48bce8a4("rl");
            if (z18) {
                mo15082x48bce8a4 = mo15082x48bce8a42;
            }
            gVar.h("report_link", mo15082x48bce8a4);
            gVar.o("pos_type", data.optInt("pos_type"));
            gVar.o("click_pos", i19);
            gVar.o("ad_w", i17);
            gVar.o("ad_h", i18);
            gVar.h("pt", data.opt("pt"));
            gVar.r("viewable", z17);
            gVar.o("screen_cnt", 1);
            gVar.o("from_h5", 0);
            gVar.o("from_game", 0);
            gVar.o("exposure_type", z17 ? 1 : 0);
            cl0.g gVar2 = new cl0.g();
            gVar2.o("screen_x", i27);
            gVar2.o("screen_y", i28);
            gVar2.o("ad_unit_number", 1);
            gVar2.o("ad_number", 1);
            gVar2.o("ad_index", 0);
            gVar2.p("page_enter_time", j18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8 e8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8.f183664a;
            gVar2.o("phone_screen_width", e8Var.c(null));
            gVar2.o("phone_screen_height", e8Var.a());
            gVar.h("wxa_report_detail", gVar2);
            cl0.g gVar3 = new cl0.g();
            gVar3.h("oaid", ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).k9());
            ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Bi();
            gVar3.h("imei", "");
            gVar3.h("common_device_id", ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).wi());
            gVar.h("ext_click_comm", gVar3.toString());
            gVar.h("pos_id", adPosId);
            gVar.p("aid", j17);
            cl0.g gVar4 = new cl0.g();
            gVar4.h("context_id", contextId);
            gVar4.o("pos", i29);
            gVar.h("channels_extra_data", gVar4.toString());
            if (z18) {
                gVar.h("current_play_sec", java.lang.Float.valueOf(f17));
            }
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.K().r()).booleanValue()) {
                java.lang.String gVar5 = gVar.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar5, "toString(...)");
                new db2.m2(1, gVar5, qt2Var).l();
            } else {
                java.lang.String gVar6 = gVar.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar6, "toString(...)");
                gm0.j1.d().g(new db2.w5(1, gVar6));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderReportLogic", e17, "reportExpose", new java.lang.Object[0]);
        }
    }

    public final void Pj(r45.ev2 collection, long j17, java.lang.String receiver, long j18, r45.qt2 qt2Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        cl0.g gVar;
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collection, "collection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "receiver");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6500xc2ec9054 c6500xc2ec9054 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6500xc2ec9054();
        c6500xc2ec9054.f138445r = qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0L;
        if (collection.m75939xb282bd08(13) > 0) {
            c6500xc2ec9054.f138445r = collection.m75939xb282bd08(13);
        }
        c6500xc2ec9054.f138433f = j17;
        c6500xc2ec9054.f138449v = j18;
        c6500xc2ec9054.u(receiver);
        java.lang.String str4 = "";
        if (qt2Var == null || (str = qt2Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        c6500xc2ec9054.v(str);
        if (qt2Var == null || (str2 = qt2Var.m75945x2fec8307(2)) == null) {
            str2 = "";
        }
        c6500xc2ec9054.p(str2);
        if (qt2Var == null || (str3 = qt2Var.m75945x2fec8307(1)) == null) {
            str3 = "";
        }
        c6500xc2ec9054.r(str3);
        c6500xc2ec9054.s((qt2Var == null || (m75945x2fec83072 = qt2Var.m75945x2fec8307(12)) == null) ? "" : r26.i0.t(m75945x2fec83072, ",", ";", false));
        cl0.g gVar2 = new cl0.g();
        gVar2.p("menu_exp_time", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206966b);
        gVar2.h("feed_columnid", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(20)) : null);
        java.lang.String gVar3 = gVar2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar3, "toString(...)");
        c6500xc2ec9054.q(r26.i0.t(gVar3, ",", ";", false));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qt2Var != null ? qt2Var.m75945x2fec8307(11) : null)) {
            gVar = new cl0.g();
        } else {
            try {
                if (qt2Var != null && (m75945x2fec8307 = qt2Var.m75945x2fec8307(11)) != null) {
                    str4 = m75945x2fec8307;
                }
                gVar = new cl0.g(str4);
            } catch (org.json.JSONException unused) {
                gVar = new cl0.g();
            }
        }
        gVar.h("collection_id", pm0.v.u(collection.m75942xfb822ef2(0)));
        gVar.o("collection_feed_num", collection.m75939xb282bd08(4));
        java.lang.String gVar4 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
        c6500xc2ec9054.t(r26.i0.t(gVar4, ",", ";", false));
        c6500xc2ec9054.k();
        Zk(c6500xc2ec9054);
    }

    public final void Qj(long j17, int i17, long j18, java.lang.String fromUser, int i18, int i19, java.lang.String str, java.lang.String str2, int i27, long j19, java.lang.String str3) {
        long j27;
        r45.el2 m76948xfa25bce2;
        r45.zi2 zi2Var;
        r45.el2 m76948xfa25bce22;
        r45.el2 m76948xfa25bce23;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUser, "fromUser");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6482xaec7839c c6482xaec7839c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6482xaec7839c();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6482xaec7839c.f138238d = c6482xaec7839c.b("SessionId", Ri, true);
        c6482xaec7839c.f138239e = i17;
        c6482xaec7839c.f138240f = j18;
        c6482xaec7839c.f138241g = c6482xaec7839c.b("SourceUsr", fromUser, true);
        c6482xaec7839c.f138242h = c6482xaec7839c.b("FeedId", Ui(j17), true);
        c6482xaec7839c.f138247m = i18;
        c6482xaec7839c.f138248n = i19;
        if (str2 != null) {
            c6482xaec7839c.f138253s = c6482xaec7839c.b("contextid", str2, true);
        }
        if (str != null) {
            c6482xaec7839c.f138252r = c6482xaec7839c.b("ActivityID", str, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 dk6 = dk(j17);
        if (dk6 != null) {
            c6482xaec7839c.f138243i = c6482xaec7839c.b("FeedUsr", dk6.getFeedObject().m76836x6c03c64c(), true);
            c6482xaec7839c.f138244j = c6482xaec7839c.b("Tag", r26.i0.t(f206740s.a(dk6), ",", ";", false), true);
            java.util.LinkedList<r45.mb4> m59264x7efe73ec = dk6.m59264x7efe73ec();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m59264x7efe73ec, 10));
            java.util.Iterator<T> it = m59264x7efe73ec.iterator();
            while (true) {
                j27 = 1;
                if (!it.hasNext()) {
                    break;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.mb4) it.next()).m75945x2fec8307(16))) {
                    j27 = 0;
                }
                c6482xaec7839c.f138246l = j27;
                arrayList.add(jz5.f0.f384359a);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = dk6.m59240x7c94657b().m76802x2dd01666();
            java.lang.String str4 = null;
            c6482xaec7839c.f138249o = c6482xaec7839c.b("GroupID", (m76802x2dd01666 == null || (m76948xfa25bce23 = m76802x2dd01666.m76948xfa25bce2()) == null) ? null : m76948xfa25bce23.m75945x2fec8307(1), true);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = dk6.getFeedObject().m76802x2dd01666();
            if (((m76802x2dd016662 == null || (m76948xfa25bce22 = m76802x2dd016662.m76948xfa25bce2()) == null) ? null : (r45.zi2) m76948xfa25bce22.m75936x14adae67(0)) != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663 = dk6.getFeedObject().m76802x2dd01666();
                if (m76802x2dd016663 != null && (m76948xfa25bce2 = m76802x2dd016663.m76948xfa25bce2()) != null && (zi2Var = (r45.zi2) m76948xfa25bce2.m75936x14adae67(0)) != null) {
                    str4 = zi2Var.m75945x2fec8307(0);
                }
                if (!(str4 == null || str4.length() == 0)) {
                    j27 = 2;
                }
            }
            c6482xaec7839c.f138250p = j27;
        }
        c6482xaec7839c.f138254t = i27;
        c6482xaec7839c.f138256v = j19;
        c6482xaec7839c.f138257w = c6482xaec7839c.b("messageid", str3, true);
        c6482xaec7839c.k();
        Zk(c6482xaec7839c);
    }

    public void Qk(long j17, java.lang.String str, int i17, long j18, boolean z17, boolean z18, int i18, cl0.g data, java.lang.String bypassData, int i19, int i27, int i28, int i29, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bypassData, "bypassData");
        int i37 = z18 ? 2 : 1;
        int i38 = z17 ? 1 : 0;
        try {
            cl0.g gVar = new cl0.g();
            gVar.o("report_type", i37);
            java.lang.String mo15082x48bce8a4 = data.mo15082x48bce8a4("apurl");
            java.lang.String mo15082x48bce8a42 = data.mo15082x48bce8a4("rl");
            if (z18) {
                mo15082x48bce8a4 = mo15082x48bce8a42;
            }
            gVar.h("report_link", mo15082x48bce8a4);
            gVar.o("exposure_type", i38);
            gVar.h("pos_id", data.mo15082x48bce8a4("ad_posid"));
            gVar.o("click_pos", i18);
            gVar.o("outer_duration", i19);
            gVar.o("play_count", i27);
            gVar.o("play_total_time", i28);
            gVar.o("video_total_time", i29);
            gVar.h("report_extra_data", data.opt("report_extra_data"));
            gVar.p("report_ts", c01.id.c());
            gVar.r("is_first_screen_exposed", z19);
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.K().r()).booleanValue()) {
                java.lang.String gVar2 = gVar.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                new db2.l(j17, str, i17, gVar2, bypassData).l();
            } else {
                java.lang.String gVar3 = gVar.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar3, "toString(...)");
                gm0.j1.d().g(new db2.h5(j17, str, i17, gVar3, bypassData));
            }
        } catch (java.lang.Exception unused) {
            pm0.z.b(xy2.b.f539688b, "finderCommentAdReport", false, null, null, false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n3(j18), 60, null);
        }
    }

    public final void Ri(android.content.Context context, long j17, java.lang.String str, java.lang.String key, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6 hk6 = hk(this, j17, str, nyVar != null ? nyVar.V6().m75939xb282bd08(5) : 0, null, 8, null);
        r45.fl2 fl2Var = hk6 != null ? hk6.f206545a : null;
        if (fl2Var != null) {
            try {
                java.lang.String m75945x2fec8307 = fl2Var.m75945x2fec8307(5);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                org.json.JSONObject jSONObject = m75945x2fec8307.length() == 0 ? new org.json.JSONObject() : new org.json.JSONObject(m75945x2fec8307);
                jSONObject.put(key, obj);
                fl2Var.set(5, jSONObject.toString());
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderReportLogic", e17.getMessage());
            }
        }
    }

    public final void Rj(long j17, int i17, java.lang.String fromUser, int i18, int i19, java.lang.String str, int i27, long j18, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUser, "fromUser");
        Qj(j17, i17, 1L, fromUser, i18, i19, null, str, i27, j18, str2);
    }

    public final void Sk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("finderusername", item.getFeedObject().m59299x6bf53a6c());
        jSONObject.put("ref_commentscene", qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0);
        wi(qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null, jSONObject, item.mo2128x1ed62e84(), item.w());
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        ij(this, 1, "link_avatar_profile", r26.i0.t(jSONObject2, ",", ";", false), qt2Var, null, 16, null);
    }

    public final void Tk(r45.qt2 contextObj, java.lang.String poiText, java.lang.String filterTextItems, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiText, "poiText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterTextItems, "filterTextItems");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6597x727bea07 c6597x727bea07 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6597x727bea07();
        c6597x727bea07.f139456e = c6597x727bea07.b("Sessionid", contextObj.m75945x2fec8307(0), true);
        c6597x727bea07.f139457f = c6597x727bea07.b("Contextid", contextObj.m75945x2fec8307(1), true);
        c6597x727bea07.f139458g = c6597x727bea07.b("ClickTabContextid", contextObj.m75945x2fec8307(2), true);
        c6597x727bea07.f139455d = contextObj.m75939xb282bd08(7);
        c6597x727bea07.f139459h = c6597x727bea07.b("PoiText", poiText, true);
        c6597x727bea07.f139460i = c6597x727bea07.b("FilterTextItems", filterTextItems, true);
        c6597x727bea07.f139461j = i17;
        c6597x727bea07.f139462k = i18;
        int m75939xb282bd08 = contextObj.m75939xb282bd08(5);
        if (m75939xb282bd08 == 22) {
            c6597x727bea07.f139463l = 1L;
        } else if (m75939xb282bd08 == 26) {
            c6597x727bea07.f139463l = 2L;
        }
        c6597x727bea07.f139464m = contextObj.m75939xb282bd08(5);
        c6597x727bea07.k();
        Zk(c6597x727bea07);
    }

    public final java.lang.String Ui(long j17) {
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(j17);
        if (valueOf.signum() < 0) {
            valueOf = valueOf.add(this.f206749o);
        }
        java.lang.String bigInteger = valueOf.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bigInteger, "toString(...)");
        return bigInteger;
    }

    public void Uj(r45.kv2 shareObj, int i17, long j17, java.lang.String receiver, r45.qt2 qt2Var, long j18) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String m75945x2fec8307;
        cl0.g gVar;
        java.lang.String m75945x2fec83072;
        java.lang.String m75945x2fec83073;
        java.lang.String m75945x2fec83074;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObj, "shareObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "receiver");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6500xc2ec9054 c6500xc2ec9054 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6500xc2ec9054();
        java.lang.String str4 = "";
        if (qt2Var == null || (str = qt2Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        c6500xc2ec9054.v(str);
        c6500xc2ec9054.f138432e = i17;
        c6500xc2ec9054.f138433f = j17;
        c6500xc2ec9054.f138435h = c6500xc2ec9054.b("FeedId", shareObj.m75945x2fec8307(0), true);
        c6500xc2ec9054.f138436i = c6500xc2ec9054.b("FeedUsr", shareObj.m75945x2fec8307(1), true);
        c6500xc2ec9054.u(receiver);
        c6500xc2ec9054.f138438k = 0L;
        c6500xc2ec9054.f138439l = 0L;
        c6500xc2ec9054.f138440m = 0L;
        c6500xc2ec9054.f138441n = c6500xc2ec9054.b("CurrentPageName", "", true);
        c6500xc2ec9054.f138442o = shareObj.m75939xb282bd08(5);
        c6500xc2ec9054.f138443p = c6500xc2ec9054.b("Tag", "", true);
        c6500xc2ec9054.f138444q = c6500xc2ec9054.b("TagId", "", true);
        c6500xc2ec9054.f138445r = qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0L;
        if (qt2Var == null || (str2 = qt2Var.m75945x2fec8307(2)) == null) {
            str2 = "";
        }
        c6500xc2ec9054.p(str2);
        if (qt2Var == null || (str3 = qt2Var.m75945x2fec8307(1)) == null) {
            str3 = "";
        }
        c6500xc2ec9054.r(str3);
        c6500xc2ec9054.f138449v = j18;
        c6500xc2ec9054.D = ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).f270255e > 0 ? 1L : 0L;
        c6500xc2ec9054.t((qt2Var == null || (m75945x2fec83074 = qt2Var.m75945x2fec8307(11)) == null) ? "" : r26.i0.t(m75945x2fec83074, ",", ";", false));
        c6500xc2ec9054.s((qt2Var == null || (m75945x2fec83073 = qt2Var.m75945x2fec8307(12)) == null) ? "" : r26.i0.t(m75945x2fec83073, ",", ";", false));
        c6500xc2ec9054.f138453z = c6500xc2ec9054.b("GroupID", "", true);
        c6500xc2ec9054.A = 1L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6 hk6 = hk(this, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(shareObj.m75945x2fec8307(0), 0L), null, qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0, null, 8, null);
        r45.fl2 fl2Var = hk6 != null ? hk6.f206545a : null;
        c6500xc2ec9054.f138448u = c6500xc2ec9054.b("SessionBuffer", fl2Var != null ? fl2Var.m75945x2fec8307(1) : null, true);
        if (fl2Var == null || (m75945x2fec8307 = fl2Var.m75945x2fec8307(5)) == null) {
            m75945x2fec8307 = qt2Var != null ? qt2Var.m75945x2fec8307(11) : null;
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
        }
        cl0.g gVar2 = new cl0.g();
        try {
            gVar = new cl0.g(m75945x2fec8307);
            try {
                gVar.p("menu_exp_time", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206966b);
                gVar.h("feed_columnid", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(20)) : null);
            } catch (java.lang.Throwable unused) {
                gVar2 = gVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderReportLogic", "finderShareFeedReport json error");
                gVar = gVar2;
                java.lang.String gVar3 = gVar.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar3, "toString(...)");
                c6500xc2ec9054.q(r26.i0.t(gVar3, ",", ";", false));
                if (qt2Var != null) {
                    str4 = m75945x2fec83072;
                }
                c6500xc2ec9054.E = c6500xc2ec9054.b("jump_id", str4, true);
                c6500xc2ec9054.k();
                Zk(c6500xc2ec9054);
            }
        } catch (java.lang.Throwable unused2) {
        }
        java.lang.String gVar32 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar32, "toString(...)");
        c6500xc2ec9054.q(r26.i0.t(gVar32, ",", ";", false));
        if (qt2Var != null && (m75945x2fec83072 = qt2Var.m75945x2fec8307(16)) != null) {
            str4 = m75945x2fec83072;
        }
        c6500xc2ec9054.E = c6500xc2ec9054.b("jump_id", str4, true);
        c6500xc2ec9054.k();
        Zk(c6500xc2ec9054);
    }

    public final void Vk(android.content.Context context, boolean z17, long j17, int i17, java.lang.String error, int i18, int i19, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        cl0.g gVar = new cl0.g();
        gVar.h("feedid", pm0.v.u(j17));
        gVar.o("click_result", i17);
        gVar.h("fail_reason", error);
        gVar.o("destination_type", i19);
        if (z17) {
            gVar.o("from_action", i18);
        }
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        java.lang.String t17 = r26.i0.t(gVar2, ",", ";", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        hj(z17 ? 1 : 0, "launch_promotion", t17, nyVar != null ? nyVar.V6() : null, str);
    }

    public final void Wj(int i17, java.lang.String fromUser, java.lang.String topic, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUser, "fromUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topic, "topic");
        jx3.f.INSTANCE.mo68478xbd3cda5f(18944, ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ',' + i17 + ",3," + fromUser + ",0,," + r26.i0.t(jk(topic, i18, 0L), ",", ";", false).concat(",,,"));
    }

    public final void Xj(int i17, boolean z17, java.lang.String topic, int i18, long j17, java.lang.String receiver, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topic, "topic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "receiver");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6594x530899e6 c6594x530899e6 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6594x530899e6();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6594x530899e6.f139438d = c6594x530899e6.b("SessionId", Ri, true);
        c6594x530899e6.f139439e = i17;
        c6594x530899e6.f139440f = z17 ? 1L : 2L;
        c6594x530899e6.f139441g = c6594x530899e6.b("Tag", r26.i0.t(jk(topic, i18, j17), ",", ";", false), true);
        c6594x530899e6.f139442h = c6594x530899e6.b("TagId", "", true);
        c6594x530899e6.f139443i = j17;
        c6594x530899e6.f139444j = c6594x530899e6.b("ForwardToUsr", receiver, true);
        c6594x530899e6.k();
        Zk(c6594x530899e6);
    }

    public final void Xk(java.lang.String contextId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21875, ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri(), contextId, 118, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(c01.id.c()), "finder_team_msg", "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if ((r41.f492236d.z0() & 2) > 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Yj(android.content.Context r40, so2.y0 r41, int r42) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Yj(android.content.Context, so2.y0, int):void");
    }

    public final void Yk(android.content.Context context, xc2.p0 finderJumpInfoEx, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderJumpInfoEx, "finderJumpInfoEx");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = finderJumpInfoEx.f534767a;
        if (3 == c19786x6a1e2862.m76503x92bc3c07()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0 = c19786x6a1e2862.m76506x42318aa0();
            java.lang.Integer valueOf = m76506x42318aa0 != null ? java.lang.Integer.valueOf(m76506x42318aa0.m77224x4236b52c()) : null;
            if ((valueOf != null && valueOf.intValue() == 4) || (valueOf != null && valueOf.intValue() == 8)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("msgId", j17);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                ij(this, z17 ? 1 : 0, "link_msg_topic", t17, nyVar != null ? nyVar.V6() : null, null, 16, null);
            }
        }
    }

    public final void Zi(int i17, long j17, r45.qt2 qt2Var, int i18, java.lang.String str) {
        java.lang.String Ri;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6490xf3ddb9c0 c6490xf3ddb9c0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6490xf3ddb9c0();
        boolean z17 = false;
        if ((qt2Var == null || (Ri = qt2Var.m75945x2fec8307(0)) == null) && (Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri()) == null) {
            Ri = "";
        }
        c6490xf3ddb9c0.f138298d = c6490xf3ddb9c0.b("SessionId", Ri, true);
        c6490xf3ddb9c0.f138305k = c6490xf3ddb9c0.b("FeedId", Ui(j17), true);
        c6490xf3ddb9c0.f138307m = i17;
        c6490xf3ddb9c0.f138306l = qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0L;
        java.lang.Integer valueOf = qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null;
        if ((valueOf != null && valueOf.intValue() == 8) || (valueOf != null && valueOf.intValue() == 7)) {
            z17 = true;
        }
        if (z17) {
            c6490xf3ddb9c0.f138302h = 1L;
        } else {
            c6490xf3ddb9c0.f138302h = 2L;
        }
        c6490xf3ddb9c0.f138300f = i18;
        if (str == null) {
            str = "";
        }
        c6490xf3ddb9c0.f138299e = c6490xf3ddb9c0.b("FinderUsername", str, true);
        c6490xf3ddb9c0.f138301g = c6490xf3ddb9c0.b("Username", xy2.c.f(qt2Var), true);
        if (dk(j17) != null) {
            c6490xf3ddb9c0.f138303i = r9.m59254xf4204902();
            c6490xf3ddb9c0.f138304j = r9.m59216x8ed22866();
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        c6490xf3ddb9c0.f138308n = 1L;
        c6490xf3ddb9c0.k();
        Zk(c6490xf3ddb9c0);
    }

    public final void Zj(java.lang.String contextId, java.lang.String action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6598xd584abea c6598xd584abea = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6598xd584abea();
        c6598xd584abea.f139467f = c6598xd584abea.b("ContextId", contextId, true);
        c6598xd584abea.f139465d = c6598xd584abea.b("Action", action, true);
        c6598xd584abea.f139466e = c01.id.c();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6598xd584abea.f139468g = c6598xd584abea.b("SessionId", Ri, true);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        c6598xd584abea.f139469h = 1L;
        c6598xd584abea.k();
        Zk(c6598xd584abea);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Zk(jx3.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "report18054 "
            java.lang.String r1 = "struct"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r1)
            boolean r1 = r11 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6491x7e209243
            java.lang.String r2 = " "
            java.lang.String r3 = "\r\n"
            java.lang.String r4 = "toShowString(...)"
            java.lang.String r5 = "Finder.FinderReportLogic"
            r6 = 0
            if (r1 == 0) goto L56
            r1 = r11
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct r1 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6491x7e209243) r1
            java.lang.String r7 = r1.f138316k
            r8 = r11
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct r8 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6491x7e209243) r8     // Catch: java.lang.Throwable -> L51
            r9 = r11
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct r9 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6491x7e209243) r9     // Catch: java.lang.Throwable -> L51
            java.lang.String r9 = r9.f138316k     // Catch: java.lang.Throwable -> L51
            if (r9 == 0) goto L2e
            int r9 = r9.length()     // Catch: java.lang.Throwable -> L51
            if (r9 != 0) goto L2c
            goto L2e
        L2c:
            r9 = r6
            goto L2f
        L2e:
            r9 = 1
        L2f:
            if (r9 != 0) goto L34
            java.lang.String r9 = "..."
            goto L35
        L34:
            r9 = r7
        L35:
            r8.p(r9)     // Catch: java.lang.Throwable -> L51
            r8 = r11
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct r8 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6491x7e209243) r8     // Catch: java.lang.Throwable -> L51
            java.lang.String r11 = r11.n()     // Catch: java.lang.Throwable -> L51
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r11, r4)     // Catch: java.lang.Throwable -> L51
            java.lang.String r11 = r26.i0.t(r11, r3, r2, r6)     // Catch: java.lang.Throwable -> L51
            java.lang.String r11 = r0.concat(r11)     // Catch: java.lang.Throwable -> L51
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r11)     // Catch: java.lang.Throwable -> L51
            r1.p(r7)
            goto L7e
        L51:
            r11 = move-exception
            r1.p(r7)
            throw r11
        L56:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "report"
            r0.<init>(r1)
            int r1 = r11.g()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r11 = r11.n()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r11, r4)
            java.lang.String r11 = r26.i0.t(r11, r3, r2, r6)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r11)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Zk(jx3.a):void");
    }

    public final void aj(r45.qt2 contextObj, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6462xe26a84e2 c6462xe26a84e2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6462xe26a84e2();
        c6462xe26a84e2.f138052g = contextObj.m75939xb282bd08(5);
        boolean z17 = false;
        c6462xe26a84e2.f138049d = c6462xe26a84e2.b("Sessionid", contextObj.m75945x2fec8307(0), true);
        c6462xe26a84e2.f138050e = c6462xe26a84e2.b("Contextid", contextObj.m75945x2fec8307(1), true);
        c6462xe26a84e2.f138051f = c6462xe26a84e2.b("ClickTabContextId", contextObj.m75945x2fec8307(2), true);
        c6462xe26a84e2.f138053h = i17;
        if (i18 != 0) {
            ey2.t0 t0Var = (ey2.t0) pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class);
            if (t0Var.f339045r) {
                if (gm0.j1.u().c().r(t0Var.O6(i18), 0) < 3) {
                    z17 = true;
                } else {
                    t0Var.f339045r = false;
                }
            }
            c6462xe26a84e2.f138054i = z17 ? 1L : 0L;
        }
        c6462xe26a84e2.k();
        Zk(c6462xe26a84e2);
    }

    public final java.lang.String ak(float f17, long j17, int i17, java.lang.String traceId, java.lang.String sourceFeedId, int i18, java.lang.String clientUdfKv, int i19, int i27, long j18, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traceId, "traceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceFeedId, "sourceFeedId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientUdfKv, "clientUdfKv");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("video_duration", j17);
            jSONObject.put("current_play_sec", (int) f17);
            int i29 = 1;
            org.json.JSONObject jSONObject2 = clientUdfKv.length() == 0 ? new org.json.JSONObject() : new org.json.JSONObject(clientUdfKv);
            jSONObject2.put("video_play_info", jSONObject);
            jSONObject2.put("watch_cnt", i17);
            jSONObject2.put("feed_progress_duration", java.lang.Float.valueOf(f17));
            jSONObject2.put("entrance_feed_index", i18);
            jSONObject2.put("entrance_feed_traceid", traceId);
            jSONObject2.put("source_feedid", sourceFeedId);
            if (i19 == 172 || i19 == 196) {
                jSONObject2.put("ref_commentscene", i27);
            }
            if (i19 == 172) {
                jSONObject2.put("collection_id", pm0.v.u(j18));
            } else if (i19 == 355) {
                jSONObject2.put("feed_columnid", i28);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8 e8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8.f183664a;
            if (e8Var.c(null) <= e8Var.b(null)) {
                i29 = 0;
            }
            jSONObject2.put("is_landscape", i29);
            java.lang.String jSONObject3 = jSONObject2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderReportLogic", e17.getMessage());
            return "";
        }
    }

    public final int al(int i17) {
        if (i17 == 15) {
            return 2;
        }
        if (i17 == 20) {
            return 4;
        }
        if (i17 == 353) {
            return 35;
        }
        if (i17 != 17) {
            return i17 != 18 ? 0 : 1;
        }
        return 3;
    }

    public final void bj(long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 dk6 = dk(j17);
        if (dk6 != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6450xa1b8c84 c6450xa1b8c84 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6450xa1b8c84();
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            c6450xa1b8c84.f137899d = c6450xa1b8c84.b("SessionId", Ri, true);
            c6450xa1b8c84.f137900e = c6450xa1b8c84.b("FeedId", pm0.v.u(dk6.m59251x5db1b11()), true);
            long j18 = i17;
            c6450xa1b8c84.f137907l = j18;
            c6450xa1b8c84.f137901f = dk6.m59254xf4204902();
            c6450xa1b8c84.f137902g = dk6.m59216x8ed22866();
            c6450xa1b8c84.f137903h = dk6.m59247xf67fd084();
            c6450xa1b8c84.f137906k = dk6.getMediaType();
            c6450xa1b8c84.f137904i = c6450xa1b8c84.b("CurrentPageName", "", true);
            c6450xa1b8c84.f137905j = j18;
            c6450xa1b8c84.k();
            Zk(c6450xa1b8c84);
        }
    }

    public int bl(int i17) {
        if (i17 == 1) {
            return 18;
        }
        if (i17 == 2) {
            return 15;
        }
        if (i17 == 3) {
            return ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.y0().r()).intValue() == 1 ? 155 : 17;
        }
        if (i17 != 4) {
            return i17 != 35 ? i17 != 39 ? 3 : 397 : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.t.f34564x366c91de;
        }
        return 20;
    }

    public final void cj(long j17, java.lang.String topic, int i17, long j18, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topic, "topic");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 dk6 = dk(j17);
        if (dk6 != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6593xf4c53969 c6593xf4c53969 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6593xf4c53969();
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            c6593xf4c53969.f139428d = c6593xf4c53969.b("SessionId", Ri, true);
            c6593xf4c53969.f139429e = c6593xf4c53969.b("CurrentPageName", "", true);
            c6593xf4c53969.f139430f = i18;
            c6593xf4c53969.f139431g = c6593xf4c53969.b("feedid", Ui(dk6.m59251x5db1b11()), true);
            c6593xf4c53969.f139432h = dk6.getMediaType();
            c6593xf4c53969.f139433i = c6593xf4c53969.b("Tag", r26.i0.t(jk(topic, i17, j18), ",", ";", false), true);
            c6593xf4c53969.f139434j = c6593xf4c53969.b("TagId", "", true);
            c6593xf4c53969.f139435k = dk6.getFeedObject().m76791xf4204902();
            c6593xf4c53969.f139436l = dk6.getFeedObject().m76758x8ed22866();
            c6593xf4c53969.f139437m = dk6.getFeedObject().m76779xf67fd084();
            c6593xf4c53969.k();
            Zk(c6593xf4c53969);
        }
    }

    public final org.json.JSONArray ck(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        jz5.l s17 = hc2.f1.s(recyclerView, false);
        java.util.List<fc2.r> m17 = hc2.f1.m(recyclerView, ((java.lang.Number) s17.f384366d).intValue(), ((java.lang.Number) s17.f384367e).intValue());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (fc2.r rVar : m17) {
            cl0.g gVar = new cl0.g();
            gVar.h("feedid", pm0.v.u(rVar.f342510a.mo2128x1ed62e84()));
            gVar.o("feedindex", rVar.f342511b);
            in5.v0 v0Var = rVar.f342512c;
            if (v0Var != null) {
                gVar.o("x", v0Var.f374676a + 1);
                gVar.o("width", v0Var.f374677b);
                gVar.o("height", v0Var.f374678c);
            }
            jSONArray.put(gVar);
        }
        return jSONArray;
    }

    public final void cl(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        if (qt2Var != null) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(finderObject, qt2Var.m75939xb282bd08(5), null);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 dk(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(j17);
        if (h17 != null) {
            return h17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4 l4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207294a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207297d.get(java.lang.Long.valueOf(j17));
        if (c14994x9b99c079 != null) {
            return c14994x9b99c079;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b.I;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b.I.get(java.lang.Long.valueOf(j17));
        if (c14994x9b99c0792 != null) {
            return c14994x9b99c0792;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14088x5e57da07.f191070y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0793 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14088x5e57da07.f191070y.get(java.lang.Long.valueOf(j17));
        if (c14994x9b99c0793 != null) {
            return c14994x9b99c0793;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14136x8f9c3d6a.I;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0794 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14136x8f9c3d6a.I.get(java.lang.Long.valueOf(j17));
        if (c14994x9b99c0794 != null) {
            return c14994x9b99c0794;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca.L;
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca.L.get(java.lang.Long.valueOf(j17));
    }

    public final java.lang.String ek(long j17, java.lang.String str, int i17) {
        r45.fl2 fl2Var;
        java.lang.String m75945x2fec8307;
        java.util.HashMap hashMap = this.f206744g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append('_');
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append('_');
        sb6.append(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6 e6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6) hashMap.get(sb6.toString());
        return (e6Var == null || (fl2Var = e6Var.f206545a) == null || (m75945x2fec8307 = fl2Var.m75945x2fec8307(1)) == null) ? "" : m75945x2fec8307;
    }

    public final void fj(long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 dk6 = dk(j17);
        if (dk6 != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6566x6a6529fc c6566x6a6529fc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6566x6a6529fc();
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            c6566x6a6529fc.f139182d = c6566x6a6529fc.b("SessionId", Ri, true);
            c6566x6a6529fc.f139183e = i17;
            c6566x6a6529fc.f139184f = c6566x6a6529fc.b("Tag", r26.i0.t(f206740s.a(dk6), ",", ";", false), true);
            c6566x6a6529fc.f139185g = c6566x6a6529fc.b("TagId", "", true);
            c6566x6a6529fc.f139186h = c6566x6a6529fc.b("feedid", Ui(dk6.m59251x5db1b11()), true);
            c6566x6a6529fc.f139187i = dk6.getFeedObject().m76791xf4204902();
            c6566x6a6529fc.k();
            Zk(c6566x6a6529fc);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6 gk(long j17, java.lang.String str, int i17, java.lang.String str2) {
        java.lang.String str3;
        if (str2 == null || (str3 = "_".concat(str2)) == null) {
            str3 = "";
        }
        java.util.HashMap hashMap = this.f206744g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append('_');
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append('_');
        sb6.append(i17);
        sb6.append(str3);
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6) hashMap.get(sb6.toString());
    }

    public final void hj(int i17, java.lang.String eid, java.lang.String udfKv, r45.qt2 qt2Var, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eid, "eid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(udfKv, "udfKv");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 c6586xa056ef95 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95();
        c6586xa056ef95.f139362g = i17;
        c6586xa056ef95.r(java.lang.String.valueOf(c01.id.c()));
        c6586xa056ef95.q(eid);
        c6586xa056ef95.t(udfKv);
        c6586xa056ef95.f139369n = c6586xa056ef95.b("session_buffer", str, true);
        if (qt2Var != null) {
            java.lang.String m75945x2fec8307 = qt2Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            c6586xa056ef95.s(m75945x2fec8307);
            java.lang.String m75945x2fec83072 = qt2Var.m75945x2fec8307(1);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            c6586xa056ef95.f139360e = c6586xa056ef95.b("findercontextid", m75945x2fec83072, true);
            c6586xa056ef95.p(java.lang.String.valueOf(qt2Var.m75939xb282bd08(5)));
            java.lang.String m75945x2fec83073 = qt2Var.m75945x2fec8307(2);
            c6586xa056ef95.f139366k = c6586xa056ef95.b("clicktabcontextid", m75945x2fec83073 != null ? m75945x2fec83073 : "", true);
            c6586xa056ef95.f139367l = c6586xa056ef95.b("ref_commentscene", java.lang.String.valueOf(qt2Var.m75939xb282bd08(7)), true);
        }
        c6586xa056ef95.k();
        Zk(c6586xa056ef95);
    }

    public final int ik() {
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return 1;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return 2;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return 3;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return 4;
        }
        return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40078x31715c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 5 : 0;
    }

    public final java.lang.String jk(java.lang.String str, int i17, long j17) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (i17 == 2) {
                java.lang.String str2 = (java.lang.String) kz5.n0.Z(r26.n0.f0(str, new java.lang.String[]{"·"}, false, 0, 6, null));
                if (str2 != null) {
                    jSONObject.put("topic", str2);
                }
            } else {
                jSONObject.put("topic", str);
            }
            jSONObject.put("type", i17);
            jSONObject.put("count", j17);
            jSONArray.put(jSONObject);
        } catch (java.lang.Exception unused) {
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    public final cl0.g kk() {
        if (this.f206752r == null) {
            cl0.g gVar = new cl0.g();
            gVar.o("screenwidth", i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
            gVar.o("screenheight", i65.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
            this.f206752r = gVar;
        }
        cl0.g gVar2 = this.f206752r;
        return gVar2 == null ? new cl0.g() : gVar2;
    }

    public final java.lang.String lk(java.util.List list, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            sb6.append((java.lang.String) it.next());
            sb6.append(str);
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return r26.n0.Z(sb7, str);
    }

    public final void mj(int i17, int i18, int i19, boolean z17, int i27, int i28, int i29, boolean z18, boolean z19, r45.qt2 qt2Var) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(Ri);
        sb6.append(',');
        sb6.append(i17);
        sb6.append(',');
        sb6.append(i18);
        sb6.append(',');
        sb6.append(i19);
        sb6.append(',');
        sb6.append(z17 ? 1 : 0);
        sb6.append(',');
        sb6.append(i27);
        sb6.append(',');
        sb6.append(i28);
        sb6.append(',');
        sb6.append(i29);
        sb6.append(',');
        sb6.append(z18 ? 1 : 0);
        sb6.append(',');
        sb6.append(!z19 ? 1 : 0);
        sb6.append(',');
        java.lang.String str2 = "";
        if (qt2Var == null || (str = qt2Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(',');
        if (qt2Var != null && (m75945x2fec8307 = qt2Var.m75945x2fec8307(2)) != null) {
            str2 = m75945x2fec8307;
        }
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderReportLogic", "18947 " + sb7);
        jx3.f.INSTANCE.mo68478xbd3cda5f(18947, sb7);
    }

    public final java.lang.String mk(android.content.Context context, long j17, java.lang.String str) {
        r45.fl2 fl2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6 hk6 = hk(this, j17, str, nyVar != null ? nyVar.V6().m75939xb282bd08(5) : 0, null, 8, null);
        if (hk6 == null || (fl2Var = hk6.f206545a) == null) {
            return null;
        }
        return fl2Var.m75945x2fec8307(5);
    }

    public final void nj(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 dk6 = dk(j17);
        if (dk6 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = dk6.getFeedObject();
            java.lang.String str = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ',' + Ui(feedObject.m76784x5db1b11()) + ',' + feedObject.m76836x6c03c64c() + ',' + feedObject.m76820x794f1260() + ',' + dk6.getMediaType();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderReportLogic", "18974 " + str);
            jx3.f.INSTANCE.mo68478xbd3cda5f(18974, str);
        }
    }

    public final java.lang.String nk() {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        return uuid;
    }

    public final void oj(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, r45.qt2 qt2Var, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6502xe775894e c6502xe775894e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6502xe775894e();
        if (qt2Var != null) {
            c6502xe775894e.f138459d = c6502xe775894e.b("sessionid", qt2Var.m75945x2fec8307(0), true);
            c6502xe775894e.f138460e = c6502xe775894e.b("clickTabContextid", qt2Var.m75945x2fec8307(2), true);
            c6502xe775894e.f138461f = qt2Var.m75939xb282bd08(5);
        }
        c6502xe775894e.f138467l = c6502xe775894e.b("reasonId", str2 != null ? r26.i0.t(str2, ",", ";", false) : "", true);
        c6502xe775894e.f138462g = c6502xe775894e.b("ItemId", str, true);
        c6502xe775894e.f138463h = i17;
        c6502xe775894e.f138464i = i18;
        c6502xe775894e.f138465j = i19;
        c6502xe775894e.f138466k = i27;
        c6502xe775894e.f138468m = c6502xe775894e.b("hotWordId", str3, true);
        c6502xe775894e.f138469n = c6502xe775894e.b("requestId", str4, true);
        c6502xe775894e.k();
        Zk(c6502xe775894e);
    }

    public final void ok(boolean z17, long j17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5460x2aa780cd c5460x2aa780cd = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5460x2aa780cd();
        int i17 = z17 ? 2 : 3;
        am.wa waVar = c5460x2aa780cd.f135799g;
        waVar.f89806a = i17;
        waVar.f89807b = j17;
        c5460x2aa780cd.e();
    }

    public final void pk() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5460x2aa780cd c5460x2aa780cd = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5460x2aa780cd();
        am.wa waVar = c5460x2aa780cd.f135799g;
        waVar.f89806a = 1;
        waVar.f89807b = 0L;
        c5460x2aa780cd.e();
    }

    public final void qj(android.content.Context context, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6539xa20af4e9 c6539xa20af4e9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6539xa20af4e9();
        if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        } else {
            nyVar = null;
        }
        if (nyVar != null) {
            c6539xa20af4e9.f138945e = c6539xa20af4e9.b("SessionId", nyVar.f216918q, true);
        } else {
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            c6539xa20af4e9.f138945e = c6539xa20af4e9.b("SessionId", Ri, true);
        }
        c6539xa20af4e9.f138944d = i17;
        c6539xa20af4e9.k();
        Zk(c6539xa20af4e9);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:125:0x031f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qk(long r15, java.lang.String r17, int r18, java.lang.String r19, long r20, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 1924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.qk(long, java.lang.String, int, java.lang.String, long, java.lang.String):void");
    }

    public final void rj(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6540x22e73e33 c6540x22e73e33 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6540x22e73e33();
        c6540x22e73e33.f138946d = i17;
        c6540x22e73e33.f138947e = i18;
        c6540x22e73e33.f138948f = i19;
        c6540x22e73e33.k();
        Zk(c6540x22e73e33);
    }

    public final void rk(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        uk(finderObject);
        long m76784x5db1b11 = finderObject.m76784x5db1b11();
        r45.dm2 m76806xdef68064 = finderObject.m76806xdef68064();
        java.lang.String m75945x2fec8307 = m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null;
        java.lang.String m76829x97edf6c0 = finderObject.m76829x97edf6c0();
        r45.hl2 m76756xf0f8a852 = finderObject.m76756xf0f8a852();
        qk(m76784x5db1b11, m75945x2fec8307, i17, m76829x97edf6c0, m76756xf0f8a852 != null ? m76756xf0f8a852.m75942xfb822ef2(0) : 0L, str);
        ((cq.k) i95.n0.c(cq.k.class)).Ri(finderObject, i17);
    }

    public final void sj(java.lang.String currUI, int i17, int i18, int i19, int i27, int i28, java.lang.String str, java.lang.String redDotWording, long j17, r45.qt2 qt2Var, int i29, int i37, java.lang.String report_ext_info) {
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currUI, "currUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotWording, "redDotWording");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(report_ext_info, "report_ext_info");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6578xc9fb1c53 c6578xc9fb1c53 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6578xc9fb1c53();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        java.lang.String str3 = "";
        if (Ri == null) {
            Ri = "";
        }
        c6578xc9fb1c53.f139277d = c6578xc9fb1c53.b("SessionId", Ri, true);
        c6578xc9fb1c53.f139278e = c6578xc9fb1c53.b("CurrUI", currUI, true);
        c6578xc9fb1c53.f139279f = i17;
        c6578xc9fb1c53.f139280g = i18;
        c6578xc9fb1c53.f139282i = i19;
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        c6578xc9fb1c53.f139283j = 2L;
        c6578xc9fb1c53.f139281h = i27;
        c6578xc9fb1c53.f139285l = c6578xc9fb1c53.b("RedDotId", str == null ? "" : str, true);
        c6578xc9fb1c53.f139284k = i28;
        c6578xc9fb1c53.f139286m = c6578xc9fb1c53.b("RedDotWording", redDotWording, true);
        c6578xc9fb1c53.f139287n = c6578xc9fb1c53.b("FeedId", Ui(j17), true);
        if (qt2Var == null || (str2 = qt2Var.m75945x2fec8307(1)) == null) {
            str2 = "";
        }
        c6578xc9fb1c53.f139288o = c6578xc9fb1c53.b("ContextId", str2, true);
        if (qt2Var != null && (m75945x2fec8307 = qt2Var.m75945x2fec8307(2)) != null) {
            str3 = m75945x2fec8307;
        }
        c6578xc9fb1c53.f139289p = c6578xc9fb1c53.b("ClickTabContextId", str3, true);
        c6578xc9fb1c53.f139290q = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Q0().r()).intValue() == 1 ? 2L : 1L;
        c6578xc9fb1c53.f139291r = ((c61.l7) i95.n0.c(c61.l7.class)).nk().f0() ? 1L : 2L;
        c6578xc9fb1c53.f139292s = i29;
        c6578xc9fb1c53.f139293t = i37;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(report_ext_info)) {
            c6578xc9fb1c53.f139294u = c6578xc9fb1c53.b("ExtInfo", report_ext_info, true);
        }
        c6578xc9fb1c53.k();
        Zk(c6578xc9fb1c53);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x0085. Please report as an issue. */
    public final void tj(java.lang.String currUI, int i17, int i18, int i19, java.lang.String redDotId, java.lang.String redDotWording, long j17, java.lang.String contextId, int i27, java.lang.String report_ext_info, int i28) {
        int i29;
        int i37;
        int i38;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currUI, "currUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotId, "redDotId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotWording, "redDotWording");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(report_ext_info, "report_ext_info");
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Q0().r()).intValue() != 1) {
            if (i17 != -1) {
                if (i17 != 29) {
                    if (i17 != 1002) {
                        if (i17 == 1) {
                            i38 = 1;
                            i37 = 1;
                            i29 = 3;
                        } else if (i17 != 2) {
                            if (i17 == 3) {
                                i29 = 4;
                                i37 = 1;
                            } else if (i17 == 4) {
                                i29 = 4;
                                i37 = 2;
                            } else if (i17 == 5) {
                                i38 = 1;
                                i29 = 1;
                                i37 = 2;
                            } else if (i17 == 7) {
                                i38 = 8;
                                i37 = 0;
                                i29 = 3;
                            } else {
                                if (i17 != 8) {
                                    return;
                                }
                                i29 = 4;
                                i38 = 7;
                                i37 = 0;
                            }
                            i38 = 3;
                        }
                    }
                }
                i38 = 1;
                i37 = 2;
                i29 = 3;
            }
            i37 = 1;
            i38 = 2;
            i29 = 6;
        } else {
            if (i17 != -1) {
                if (i17 != 5) {
                    if (i17 != 29) {
                        if (i17 == 1) {
                            i38 = 5;
                            i37 = 0;
                            i29 = 3;
                        } else if (i17 != 2) {
                            if (i17 == 7) {
                                i29 = i27;
                                i38 = 8;
                            } else if (i17 != 8) {
                                switch (i17) {
                                    case 1001:
                                        i29 = 1;
                                        i37 = 0;
                                        i38 = 6;
                                        break;
                                    case 1002:
                                        break;
                                    case 1003:
                                        i37 = 1;
                                        i38 = 3;
                                        i29 = 3;
                                        break;
                                    case 1004:
                                        i37 = 2;
                                        i38 = 3;
                                        i29 = 3;
                                        break;
                                    case 1005:
                                        i38 = 9;
                                        i29 = 100;
                                        break;
                                    default:
                                        return;
                                }
                            } else {
                                i29 = i27;
                                i38 = 7;
                            }
                        }
                    }
                    i38 = 1;
                    i37 = 0;
                    i29 = 3;
                } else {
                    i38 = 1;
                    i29 = 1;
                }
                i37 = 0;
            }
            i29 = i27;
            i37 = 1;
            i38 = 2;
        }
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(1, contextId);
        qt2Var.set(2, "");
        sj(currUI, i38, i18, i29, i37, i19, redDotId, redDotWording, j17, qt2Var, 0, i28, report_ext_info);
    }

    public final int tk(int i17) {
        if (i17 == 4) {
            return 1;
        }
        if (i17 == 5) {
            return 2;
        }
        if (i17 != 10001) {
            return i17 != 10002 ? 0 : 4;
        }
        return 3;
    }

    public final void uk(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        if (finderObject.m76756xf0f8a852() == null) {
            finderObject.m76849x3f3d67c6(new r45.hl2());
            r45.hl2 m76756xf0f8a852 = finderObject.m76756xf0f8a852();
            if (m76756xf0f8a852 == null) {
                return;
            }
            m76756xf0f8a852.set(0, java.lang.Long.valueOf(c01.id.c()));
        }
    }

    public final void vj(int i17, java.lang.String tipsId, java.lang.String revokeId, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsId, "tipsId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(revokeId, "revokeId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6572x6d9d1ced c6572x6d9d1ced = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6572x6d9d1ced();
        c6572x6d9d1ced.f139223d = i17;
        c6572x6d9d1ced.f139225f = c01.id.e();
        c6572x6d9d1ced.f139224e = c6572x6d9d1ced.b("TipsId", tipsId, true);
        c6572x6d9d1ced.f139227h = c6572x6d9d1ced.b("RevokeId", revokeId, true);
        c6572x6d9d1ced.f139226g = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Q0().r()).intValue() == 1 ? 2L : 1L;
        c6572x6d9d1ced.f139228i = i18;
        c6572x6d9d1ced.k();
        Zk(c6572x6d9d1ced);
    }

    public final void vk(android.content.Context context, boolean z17, int i17, boolean z18, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6600x3cd911e5 c6600x3cd911e5 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6600x3cd911e5();
        c6600x3cd911e5.f139485d = V6 != null ? V6.m75939xb282bd08(5) : 0L;
        c6600x3cd911e5.f139486e = c6600x3cd911e5.b("Sessionid", V6 != null ? V6.m75945x2fec8307(0) : null, true);
        c6600x3cd911e5.f139487f = c6600x3cd911e5.b("Contextid", V6 != null ? V6.m75945x2fec8307(1) : null, true);
        c6600x3cd911e5.f139488g = c6600x3cd911e5.b("ClickTabContextid", V6 != null ? V6.m75945x2fec8307(2) : null, true);
        c6600x3cd911e5.f139489h = c6600x3cd911e5.b("feedid", pm0.v.u(V6 != null ? V6.m75942xfb822ef2(6) : 0L), true);
        c6600x3cd911e5.f139490i = z17 ? 1L : 2L;
        c6600x3cd911e5.f139491j = i17;
        c6600x3cd911e5.f139492k = z18 ? 2L : 1L;
        c6600x3cd911e5.f139493l = z19 ? 2L : 1L;
        c6600x3cd911e5.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[Catch: JSONException -> 0x0044, TryCatch #0 {JSONException -> 0x0044, blocks: (B:29:0x003b, B:16:0x0049, B:17:0x0057, B:19:0x005d, B:21:0x006b), top: B:28:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wi(java.lang.Integer r11, org.json.JSONObject r12, long r13, java.lang.String r15) {
        /*
            r10 = this;
            if (r12 != 0) goto L3
            return
        L3:
            if (r11 != 0) goto L7
            goto L7e
        L7:
            int r0 = r11.intValue()
            r1 = 356(0x164, float:4.99E-43)
            if (r0 != r1) goto L7e
            java.lang.Class<com.tencent.mm.plugin.finder.report.o3> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class
            i95.m r0 = i95.n0.c(r0)
            java.lang.String r1 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            r2 = r0
            com.tencent.mm.plugin.finder.report.o3 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) r2
            int r6 = r11.intValue()
            r7 = 0
            r8 = 8
            r9 = 0
            r3 = r13
            r5 = r15
            com.tencent.mm.plugin.finder.report.e6 r11 = hk(r2, r3, r5, r6, r7, r8, r9)
            if (r11 == 0) goto L37
            r45.fl2 r11 = r11.f206545a
            if (r11 == 0) goto L37
            r15 = 5
            java.lang.String r11 = r11.m75945x2fec8307(r15)
            goto L38
        L37:
            r11 = 0
        L38:
            r15 = 0
            if (r11 == 0) goto L46
            int r0 = r11.length()     // Catch: org.json.JSONException -> L44
            if (r0 != 0) goto L42
            goto L46
        L42:
            r0 = r15
            goto L47
        L44:
            r11 = move-exception
            goto L75
        L46:
            r0 = 1
        L47:
            if (r0 != 0) goto L6b
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L44
            r0.<init>(r11)     // Catch: org.json.JSONException -> L44
            java.util.Iterator r11 = r0.keys()     // Catch: org.json.JSONException -> L44
            java.lang.String r1 = "keys(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r11, r1)     // Catch: org.json.JSONException -> L44
        L57:
            boolean r1 = r11.hasNext()     // Catch: org.json.JSONException -> L44
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r11.next()     // Catch: org.json.JSONException -> L44
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> L44
            java.lang.Object r2 = r0.get(r1)     // Catch: org.json.JSONException -> L44
            r12.put(r1, r2)     // Catch: org.json.JSONException -> L44
            goto L57
        L6b:
            java.lang.String r11 = "feedid"
            java.lang.String r13 = pm0.v.u(r13)     // Catch: org.json.JSONException -> L44
            r12.put(r11, r13)     // Catch: org.json.JSONException -> L44
            goto L7e
        L75:
            java.lang.String r12 = "addDramaInfo"
            java.lang.Object[] r13 = new java.lang.Object[r15]
            java.lang.String r14 = "Finder.FinderReportLogic"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r14, r11, r12, r13)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.wi(java.lang.Integer, org.json.JSONObject, long, java.lang.String):void");
    }

    public final void wk(java.lang.String profileUsername, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(profileUsername, "profileUsername");
        jx3.f.INSTANCE.mo68478xbd3cda5f(20698, profileUsername + ',' + i17 + ',' + i18 + ',' + i19 + ',' + i27);
    }

    public final void xj(r45.qt2 contextObj, long j17, java.lang.String str, java.lang.String finderUsername, int i17) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6476xa46ff357 c6476xa46ff357 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6476xa46ff357();
        c6476xa46ff357.f138182d = c6476xa46ff357.b("SessionId", contextObj.m75945x2fec8307(0), true);
        c6476xa46ff357.f138183e = c6476xa46ff357.b("ClickUI", "", true);
        c6476xa46ff357.f138197s = contextObj.m75939xb282bd08(5);
        c6476xa46ff357.f138185g = c6476xa46ff357.b("FeedUsr", finderUsername, true);
        c6476xa46ff357.f138186h = 3L;
        c6476xa46ff357.f138187i = i17;
        c6476xa46ff357.f138189k = c6476xa46ff357.b("ReplyUsr", "", true);
        c6476xa46ff357.f138190l = 2L;
        c6476xa46ff357.f138200v = c6476xa46ff357.b("ContextId", contextObj.m75945x2fec8307(1), true);
        c6476xa46ff357.f138201w = c6476xa46ff357.b("ClickTabContextId", contextObj.m75945x2fec8307(2), true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 dk6 = dk(j17);
        if (dk6 != null) {
            c6476xa46ff357.f138184f = c6476xa46ff357.b("FeedId", Ui(j17), true);
            c6476xa46ff357.f138191m = dk6.getFeedObject().m76791xf4204902();
            c6476xa46ff357.f138192n = dk6.getFeedObject().m76758x8ed22866();
            c6476xa46ff357.f138193o = dk6.getFeedObject().m76779xf67fd084();
            c6476xa46ff357.f138194p = dk6.getMediaType();
            c6476xa46ff357.f138195q = c6476xa46ff357.b("Tag", r26.i0.t(f206740s.a(dk6), ",", ";", false), true);
            c6476xa46ff357.f138196r = c6476xa46ff357.b("TagId", "", true);
            c6476xa46ff357.f138202x = c6476xa46ff357.b("SessionBuffer", ek(j17, str, contextObj.m75939xb282bd08(7)), true);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            c6476xa46ff357.f138184f = c6476xa46ff357.b("FeedId", "0", true);
            c6476xa46ff357.f138195q = c6476xa46ff357.b("Tag", "", true);
            c6476xa46ff357.f138196r = c6476xa46ff357.b("TagId", "", true);
        }
        java.lang.String m75945x2fec8307 = contextObj.m75945x2fec8307(11);
        c6476xa46ff357.f138204z = c6476xa46ff357.b("ExtraInfo", m75945x2fec8307 != null ? r26.i0.t(m75945x2fec8307, ",", ";", false) : "", true);
        java.lang.String m75945x2fec83072 = contextObj.m75945x2fec8307(12);
        c6476xa46ff357.A = c6476xa46ff357.b("enterSourceInfo", m75945x2fec83072 != null ? r26.i0.t(m75945x2fec83072, ",", ";", false) : "", true);
        c6476xa46ff357.k();
        Zk(c6476xa46ff357);
    }

    public final void xk(java.lang.String fromUsername, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUsername, "fromUsername");
        jx3.f.INSTANCE.mo68478xbd3cda5f(20699, fromUsername + ',' + i17 + ',' + i18);
    }

    public final void yj(int i17, int i18, int i19, r45.qt2 contextObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6503x9b937a8f c6503x9b937a8f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6503x9b937a8f();
        c6503x9b937a8f.f138470d = contextObj.m75939xb282bd08(5);
        c6503x9b937a8f.f138471e = c6503x9b937a8f.b("Sessionid", contextObj.m75945x2fec8307(0), true);
        c6503x9b937a8f.f138472f = c6503x9b937a8f.b("Contextid", contextObj.m75945x2fec8307(1), true);
        c6503x9b937a8f.f138473g = c6503x9b937a8f.b("ClickTabContextid", contextObj.m75945x2fec8307(2), true);
        c6503x9b937a8f.f138471e = c6503x9b937a8f.b("Sessionid", contextObj.m75945x2fec8307(0), true);
        c6503x9b937a8f.f138475i = c01.id.c();
        c6503x9b937a8f.f138474h = i17;
        c6503x9b937a8f.f138476j = i18;
        c6503x9b937a8f.f138477k = i19;
        c6503x9b937a8f.f138478l = 1L;
        c6503x9b937a8f.k();
        Zk(c6503x9b937a8f);
    }

    public final void yk(int i17, int i18, java.lang.String msgId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgId, "msgId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6591x10d87825 c6591x10d87825 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6591x10d87825();
        c6591x10d87825.f139422d = i17;
        c6591x10d87825.f139423e = i18;
        c6591x10d87825.f139424f = c6591x10d87825.b("msgId", msgId, true);
        c6591x10d87825.k();
        Zk(c6591x10d87825);
    }

    public final void zj(r45.qt2 contextObj, long j17, java.lang.String str, int i17, int i18, int i19, java.lang.String replyUsername, int i27, boolean z17, boolean z18, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(replyUsername, "replyUsername");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 dk6 = dk(j17);
        if (dk6 != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6476xa46ff357 c6476xa46ff357 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6476xa46ff357();
            c6476xa46ff357.f138182d = c6476xa46ff357.b("SessionId", contextObj.m75945x2fec8307(0), true);
            c6476xa46ff357.f138183e = c6476xa46ff357.b("ClickUI", "", true);
            c6476xa46ff357.f138184f = c6476xa46ff357.b("FeedId", Ui(j17), true);
            c6476xa46ff357.f138185g = c6476xa46ff357.b("FeedUsr", dk6.m59299x6bf53a6c(), true);
            c6476xa46ff357.f138186h = i17;
            c6476xa46ff357.f138187i = i18;
            c6476xa46ff357.f138188j = i19;
            c6476xa46ff357.f138189k = c6476xa46ff357.b("ReplyUsr", replyUsername, true);
            c6476xa46ff357.f138190l = i27;
            c6476xa46ff357.f138191m = dk6.m59254xf4204902();
            c6476xa46ff357.f138192n = dk6.m59216x8ed22866();
            c6476xa46ff357.f138193o = dk6.m59247xf67fd084();
            c6476xa46ff357.f138194p = dk6.getMediaType();
            c6476xa46ff357.f138195q = c6476xa46ff357.b("Tag", r26.i0.t(f206740s.a(dk6), ",", ";", false), true);
            c6476xa46ff357.f138196r = c6476xa46ff357.b("TagId", "", true);
            c6476xa46ff357.f138197s = contextObj.m75939xb282bd08(5);
            c6476xa46ff357.f138198t = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dk6.m59299x6bf53a6c(), xy2.c.f(contextObj)) ? 1L : 0L;
            c6476xa46ff357.f138199u = z17 ? 1L : 0L;
            java.lang.String m75945x2fec8307 = contextObj.m75945x2fec8307(1);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            c6476xa46ff357.f138200v = c6476xa46ff357.b("ContextId", m75945x2fec8307, true);
            java.lang.String m75945x2fec83072 = contextObj.m75945x2fec8307(2);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            c6476xa46ff357.f138201w = c6476xa46ff357.b("ClickTabContextId", m75945x2fec83072, true);
            c6476xa46ff357.f138202x = c6476xa46ff357.b("SessionBuffer", ek(j17, str, contextObj.m75939xb282bd08(5)), true);
            c6476xa46ff357.f138203y = z18 ? 1L : 0L;
            java.lang.String m75945x2fec83073 = contextObj.m75945x2fec8307(11);
            c6476xa46ff357.f138204z = c6476xa46ff357.b("ExtraInfo", m75945x2fec83073 != null ? r26.i0.t(m75945x2fec83073, ",", ";", false) : "", true);
            java.lang.String m75945x2fec83074 = contextObj.m75945x2fec8307(12);
            c6476xa46ff357.A = c6476xa46ff357.b("enterSourceInfo", m75945x2fec83074 != null ? r26.i0.t(m75945x2fec83074, ",", ";", false) : "", true);
            c6476xa46ff357.B = i28;
            c6476xa46ff357.k();
            Zk(c6476xa46ff357);
        }
    }

    public final void zk(android.content.Context context, int i17, int i18, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6475x5ac25712 c6475x5ac25712 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6475x5ac25712();
        c6475x5ac25712.f138177d = java.lang.System.currentTimeMillis();
        c6475x5ac25712.f138178e = i17;
        c6475x5ac25712.f138179f = i18;
        c6475x5ac25712.f138180g = V6 != null ? V6.m75939xb282bd08(5) : 0L;
        c6475x5ac25712.f138181h = num != null ? num.intValue() : 0L;
        c6475x5ac25712.k();
    }
}
