package ln0;

/* loaded from: classes16.dex */
public final class p {

    /* renamed from: l, reason: collision with root package name */
    public static ln0.p f401204l;

    /* renamed from: f, reason: collision with root package name */
    public long f401210f;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f401205a = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f401206b = "";

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f401207c = "live.p2p.com";

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f401208d = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* renamed from: e, reason: collision with root package name */
    public final int f401209e = 15;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f401211g = "MMXp2pWrapper-THREAD-POOL-TAG";

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f401212h = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f401213i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("MicroMsg.MMXp2pWrapper", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new ln0.h(this), true);

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f401214j = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("MicroMsg.MMXp2pWrapper", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new ln0.e(this), true);

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.s0 f401215k = new ln0.d(this);

    public static final /* synthetic */ java.lang.String a(ln0.p pVar) {
        pVar.getClass();
        return "MicroMsg.MMXp2pWrapper";
    }

    public final void b(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMXp2pWrapper", "xp2p Wrapper destroyStream: streamId is null or empty, skip");
            return;
        }
        java.util.Map p2pParamsMap = this.f401205a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p2pParamsMap, "p2pParamsMap");
        synchronized (p2pParamsMap) {
            if (this.f401205a.containsKey(str)) {
                this.f401205a.remove(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper destroyStream: removed streamId=" + str + " from p2pParamsMap");
                if (this.f401205a.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper p2pParamsMap is empty, scheduling P2P SDK delay destroy");
                    ((ku5.t0) ku5.t0.f394148d).h(new ln0.m(this), this.f401211g);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMXp2pWrapper", "xp2p Wrapper destroyStream: streamId=" + str + " not found in p2pParamsMap, skip");
            }
        }
    }

    public final java.lang.String c(java.io.InputStream inputStream) {
        java.util.Scanner useDelimiter = new java.util.Scanner(inputStream, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c).useDelimiter("\\A");
        if (!useDelimiter.hasNext()) {
            return "";
        }
        java.lang.String next = useDelimiter.next();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
        return next;
    }

    public final ln0.q d(java.lang.String str) {
        ln0.q qVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        java.util.Map p2pParamsMap = this.f401205a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p2pParamsMap, "p2pParamsMap");
        synchronized (p2pParamsMap) {
            qVar = (ln0.q) this.f401205a.get(str);
        }
        return qVar;
    }

    public final void e(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4;
        long j17;
        long j18;
        long j19;
        long j27;
        long j28;
        long j29;
        long j37;
        long j38;
        long j39;
        long j47;
        long j48;
        long j49;
        long j57;
        long j58;
        long j59;
        long j66;
        long j67;
        long j68;
        long j69;
        long j76;
        long j77;
        ln0.q d17 = d(str2);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMXp2pWrapper", "xp2p Wrapper parseJsonAndReport: params not found for streamId=" + str2);
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str).getJSONObject("flow");
            long optLong = jSONObject.optLong("p2pBytes", 0L);
            long optLong2 = jSONObject.optLong("cdnBytes", 0L);
            java.lang.String optString = jSONObject.optString("nat_str", "");
            str4 = "MicroMsg.MMXp2pWrapper";
            try {
                long optLong3 = jSONObject.optLong("p2p_upload_switch", 0L);
                long optLong4 = jSONObject.optLong("p2p_download_switch", 0L);
                long optLong5 = jSONObject.optLong("connected", 0L);
                long optLong6 = jSONObject.optLong("standby_c", 0L);
                long optLong7 = jSONObject.optLong("load", 0L);
                java.lang.String optString2 = jSONObject.optString("isp", "");
                java.lang.String optString3 = jSONObject.optString("url", "");
                java.lang.String optString4 = jSONObject.optString("xs_full_url", "");
                long optLong8 = jSONObject.optLong("xs_4xx_status", 0L);
                long optLong9 = jSONObject.optLong("total_pieces", 0L);
                long optLong10 = jSONObject.optLong("verify_pieces", 0L);
                long optLong11 = jSONObject.optLong("invalid_pieces", 0L);
                long optLong12 = jSONObject.optLong("tag_missed_invalid_pieces", 0L);
                java.lang.String optString5 = jSONObject.optString("uuid", "");
                java.lang.String optString6 = jSONObject.optString("pieceid", "");
                java.lang.String optString7 = jSONObject.optString("send", "");
                java.lang.String optString8 = jSONObject.optString("recv", "");
                long optLong13 = jSONObject.optLong("abnormal_ts_count", 0L);
                long optLong14 = jSONObject.optLong("play_ori_by_no_sei", 0L);
                long optLong15 = jSONObject.optLong("buffer_length", 0L);
                long optLong16 = jSONObject.optLong("max_cdn_firstframe", 0L);
                long optLong17 = jSONObject.optLong("max_p2p_firstframe", 0L);
                long optLong18 = jSONObject.optLong("first_frame_t", 0L);
                long optLong19 = jSONObject.optLong("punch_total", 0L);
                long optLong20 = jSONObject.optLong("punch_succ", 0L);
                long optLong21 = jSONObject.optLong("passive_punch_total", 0L);
                long optLong22 = jSONObject.optLong("passive_punch_succ", 0L);
                long optLong23 = jSONObject.optLong("punch_hole", 0L);
                long optLong24 = jSONObject.optLong("played_bytes", 0L);
                long optLong25 = jSONObject.optLong("fullstream_bytes", 0L);
                long optLong26 = jSONObject.optLong("cdn_substream_bytes", 0L);
                long optLong27 = jSONObject.optLong("fillup_bytes", 0L);
                long optLong28 = jSONObject.optLong("xntp_bytes", 0L);
                long optLong29 = jSONObject.optLong("turn_bytes", 0L);
                long optLong30 = jSONObject.optLong("punch_bytes", 0L);
                long optLong31 = jSONObject.optLong("tlive_errmsg_early", 0L);
                long optLong32 = jSONObject.optLong("tlive_errmsg_miss", 0L);
                long optLong33 = jSONObject.optLong("tlive_errmsg_expire", 0L);
                long optLong34 = jSONObject.optLong("subscribe_failure_c", 0L);
                long optLong35 = jSONObject.optLong("subscribe_refused_c", 0L);
                long optLong36 = jSONObject.optLong("subscribe_request_c", 0L);
                long optLong37 = jSONObject.optLong("subscribe_success_c", 0L);
                long optLong38 = jSONObject.optLong("subscribe_timeout_c", 0L);
                long optLong39 = jSONObject.optLong("toofar_subscribe_c", 0L);
                long optLong40 = jSONObject.optLong("too_depth_subscribe_c", 0L);
                long optLong41 = jSONObject.optLong("checkout_subscribe_c", 0L);
                java.lang.String optString9 = jSONObject.optString("version", "");
                long optLong42 = jSONObject.optLong("inner_punch_total", 0L);
                long optLong43 = jSONObject.optLong("inner_punch_succ", 0L);
                long j78 = d17.f401232p;
                if (optLong >= j78) {
                    d17.f401232p = optLong;
                    j17 = optLong - j78;
                } else {
                    j17 = 0;
                }
                long j79 = j17;
                long j86 = d17.f401233q;
                if (optLong2 >= j86) {
                    d17.f401233q = optLong2;
                    j18 = optLong2 - j86;
                } else {
                    j18 = 0;
                }
                long j87 = j18;
                long j88 = d17.f401234r;
                if (optLong8 >= j88) {
                    j19 = optLong8 - j88;
                    d17.f401234r = optLong8;
                } else {
                    j19 = 0;
                }
                long j89 = d17.f401235s;
                if (optLong9 >= j89) {
                    d17.f401235s = optLong9;
                    j27 = optLong9 - j89;
                } else {
                    j27 = 0;
                }
                long j96 = j27;
                long j97 = d17.f401236t;
                if (optLong10 >= j97) {
                    d17.f401236t = optLong10;
                    j28 = optLong10 - j97;
                } else {
                    j28 = 0;
                }
                long j98 = j28;
                long j99 = d17.f401237u;
                if (optLong11 >= j99) {
                    long j100 = optLong11 - j99;
                    d17.f401237u = optLong11;
                    j29 = j100;
                } else {
                    j29 = 0;
                }
                str3 = "";
                try {
                    long j101 = d17.f401238v;
                    if (optLong12 >= j101) {
                        j37 = optLong12 - j101;
                        d17.f401238v = optLong12;
                    } else {
                        j37 = 0;
                    }
                    long j102 = d17.f401239w;
                    if (optLong19 >= j102) {
                        d17.f401239w = optLong19;
                        j38 = optLong19 - j102;
                    } else {
                        j38 = 0;
                    }
                    long j103 = j38;
                    long j104 = d17.f401240x;
                    if (optLong20 >= j104) {
                        d17.f401240x = optLong20;
                        j39 = optLong20 - j104;
                    } else {
                        j39 = 0;
                    }
                    long j105 = j39;
                    long j106 = d17.I;
                    if (optLong42 >= j106) {
                        j47 = optLong42 - j106;
                        d17.I = optLong42;
                    } else {
                        j47 = 0;
                    }
                    long j107 = d17.f401216J;
                    if (optLong43 >= j107) {
                        j48 = optLong43 - j107;
                        d17.f401216J = optLong43;
                    } else {
                        j48 = 0;
                    }
                    long j108 = d17.f401241y;
                    if (optLong21 >= j108) {
                        d17.f401241y = optLong21;
                        j49 = optLong21 - j108;
                    } else {
                        j49 = 0;
                    }
                    long j109 = j48;
                    long j110 = d17.f401242z;
                    if (optLong22 >= j110) {
                        d17.f401242z = optLong22;
                        j57 = optLong22 - j110;
                    } else {
                        j57 = 0;
                    }
                    long j111 = j47;
                    long j112 = d17.A;
                    if (optLong23 >= j112) {
                        d17.A = optLong23;
                        j58 = optLong23 - j112;
                    } else {
                        j58 = 0;
                    }
                    long j113 = j58;
                    long j114 = d17.B;
                    if (optLong24 >= j114) {
                        d17.B = optLong24;
                        j59 = optLong24 - j114;
                    } else {
                        j59 = 0;
                    }
                    long j115 = j59;
                    long j116 = d17.C;
                    if (optLong25 >= j116) {
                        d17.C = optLong25;
                        j66 = optLong25 - j116;
                    } else {
                        j66 = 0;
                    }
                    long j117 = j66;
                    long j118 = d17.D;
                    if (optLong26 >= j118) {
                        d17.D = optLong26;
                        j67 = optLong26 - j118;
                    } else {
                        j67 = 0;
                    }
                    long j119 = j67;
                    long j120 = d17.E;
                    if (optLong27 >= j120) {
                        d17.E = optLong27;
                        j68 = optLong27 - j120;
                    } else {
                        j68 = 0;
                    }
                    long j121 = j68;
                    long j122 = d17.F;
                    if (optLong28 >= j122) {
                        d17.F = optLong28;
                        j69 = optLong28 - j122;
                    } else {
                        j69 = 0;
                    }
                    long j123 = j69;
                    long j124 = d17.G;
                    if (optLong29 >= j124) {
                        d17.G = optLong29;
                        j76 = optLong29 - j124;
                    } else {
                        j76 = 0;
                    }
                    long j125 = j76;
                    long j126 = d17.H;
                    if (optLong30 >= j126) {
                        d17.H = optLong30;
                        j77 = optLong30 - j126;
                    } else {
                        j77 = 0;
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6525xd3eba1f9 c6525xd3eba1f9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6525xd3eba1f9();
                    c6525xd3eba1f9.f138764d = d17.L;
                    c6525xd3eba1f9.f138766e = c6525xd3eba1f9.b("finderNickname", d17.M, true);
                    c6525xd3eba1f9.f138768f = j79;
                    c6525xd3eba1f9.f138770g = j87;
                    c6525xd3eba1f9.f138772h = c6525xd3eba1f9.b("natType", optString, true);
                    c6525xd3eba1f9.f138773i = optLong3;
                    c6525xd3eba1f9.f138774j = optLong4;
                    c6525xd3eba1f9.f138775k = optLong5;
                    c6525xd3eba1f9.f138776l = optLong6;
                    c6525xd3eba1f9.f138777m = optLong7;
                    c6525xd3eba1f9.f138778n = c6525xd3eba1f9.b("isp", optString2, true);
                    c6525xd3eba1f9.f138779o = c6525xd3eba1f9.b("url", optString3, true);
                    c6525xd3eba1f9.f138780p = c6525xd3eba1f9.b("full_url", optString4, true);
                    c6525xd3eba1f9.f138781q = j19;
                    c6525xd3eba1f9.f138782r = j98;
                    c6525xd3eba1f9.f138783s = j29;
                    c6525xd3eba1f9.f138784t = j37;
                    c6525xd3eba1f9.f138785u = c6525xd3eba1f9.b("uuid", optString5, true);
                    c6525xd3eba1f9.f138786v = c6525xd3eba1f9.b("pieceid", optString6, true);
                    c6525xd3eba1f9.f138787w = c6525xd3eba1f9.b("send", optString7, true);
                    c6525xd3eba1f9.f138788x = c6525xd3eba1f9.b("recv", optString8, true);
                    c6525xd3eba1f9.f138789y = optLong13;
                    c6525xd3eba1f9.f138790z = j96;
                    c6525xd3eba1f9.A = optLong14;
                    c6525xd3eba1f9.B = optLong15;
                    c6525xd3eba1f9.C = optLong16;
                    c6525xd3eba1f9.D = optLong17;
                    c6525xd3eba1f9.E = optLong18;
                    c6525xd3eba1f9.F = j103;
                    c6525xd3eba1f9.G = j105;
                    c6525xd3eba1f9.H = j49;
                    c6525xd3eba1f9.I = j57;
                    c6525xd3eba1f9.f138760J = j113;
                    c6525xd3eba1f9.K = j115;
                    c6525xd3eba1f9.L = j117;
                    c6525xd3eba1f9.M = j119;
                    c6525xd3eba1f9.N = j121;
                    c6525xd3eba1f9.O = j123;
                    c6525xd3eba1f9.P = j125;
                    c6525xd3eba1f9.Q = j77;
                    c6525xd3eba1f9.R = optLong31;
                    c6525xd3eba1f9.S = optLong32;
                    c6525xd3eba1f9.T = optLong33;
                    c6525xd3eba1f9.U = optLong34;
                    c6525xd3eba1f9.V = optLong35;
                    c6525xd3eba1f9.W = optLong36;
                    c6525xd3eba1f9.X = optLong37;
                    c6525xd3eba1f9.Y = optLong38;
                    c6525xd3eba1f9.Z = optLong39;
                    c6525xd3eba1f9.f138761a0 = optLong40;
                    c6525xd3eba1f9.f138762b0 = optLong41;
                    c6525xd3eba1f9.f138763c0 = d17.K;
                    c6525xd3eba1f9.f138765d0 = c6525xd3eba1f9.b("version", optString9, true);
                    c6525xd3eba1f9.f138767e0 = j111;
                    c6525xd3eba1f9.f138769f0 = j109;
                    c6525xd3eba1f9.f138771g0 = c6525xd3eba1f9.b("trans_stream_name", str2, true);
                    c6525xd3eba1f9.k();
                } catch (org.json.JSONException e17) {
                    e = e17;
                    java.lang.String str5 = str4;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str5, e, str3, new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str5, "xp2p Wrapper parseJsonAndReport error!");
                }
            } catch (org.json.JSONException e18) {
                e = e18;
                str3 = "";
            }
        } catch (org.json.JSONException e19) {
            e = e19;
            str3 = "";
            str4 = "MicroMsg.MMXp2pWrapper";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.MMXp2pWrapper"
            java.lang.String r1 = "xp2p Wrapper getStat dataStr: "
            java.lang.String r2 = "xp2p Wrapper getStat error, statusCode: "
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L85
            r4.<init>()     // Catch: java.lang.Exception -> L85
            r4.append(r9)     // Catch: java.lang.Exception -> L85
            java.lang.String r5 = "&token="
            r4.append(r5)     // Catch: java.lang.Exception -> L85
            java.lang.String r5 = r8.f401206b     // Catch: java.lang.Exception -> L85
            r4.append(r5)     // Catch: java.lang.Exception -> L85
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L85
            com.tencent.mm.network.h2 r4 = com.p314xaae8f345.mm.p971x6de15a2e.n.d(r4, r3)     // Catch: java.lang.Exception -> L85
            r5 = 10000(0x2710, float:1.4013E-41)
            r4.g(r5)     // Catch: java.lang.Exception -> L82
            r4.k(r5)     // Catch: java.lang.Exception -> L82
            r4.a()     // Catch: java.lang.Exception -> L82
            int r5 = r4.f()     // Catch: java.lang.Exception -> L82
            r6 = 200(0xc8, float:2.8E-43)
            java.lang.String r7 = " url: "
            if (r5 != r6) goto L6c
            java.io.InputStream r2 = r4.mo48349xc7995ab4()     // Catch: java.lang.Exception -> L82
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = r8.c(r2)     // Catch: java.lang.Throwable -> L65
            vz5.b.a(r2, r3)     // Catch: java.lang.Exception -> L82
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L82
            r2.<init>(r1)     // Catch: java.lang.Exception -> L82
            r2.append(r5)     // Catch: java.lang.Exception -> L82
            r2.append(r7)     // Catch: java.lang.Exception -> L82
            r2.append(r9)     // Catch: java.lang.Exception -> L82
            java.lang.String r1 = " streamId: "
            r2.append(r1)     // Catch: java.lang.Exception -> L82
            r2.append(r10)     // Catch: java.lang.Exception -> L82
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L82
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Exception -> L82
            r8.e(r5, r10)     // Catch: java.lang.Exception -> L82
            goto La0
        L65:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> L67
        L67:
            r1 = move-exception
            vz5.b.a(r2, r10)     // Catch: java.lang.Exception -> L82
            throw r1     // Catch: java.lang.Exception -> L82
        L6c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L82
            r10.<init>(r2)     // Catch: java.lang.Exception -> L82
            r10.append(r5)     // Catch: java.lang.Exception -> L82
            r10.append(r7)     // Catch: java.lang.Exception -> L82
            r10.append(r9)     // Catch: java.lang.Exception -> L82
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L82
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r10)     // Catch: java.lang.Exception -> L82
            goto La0
        L82:
            r10 = move-exception
            r3 = r4
            goto L86
        L85:
            r10 = move-exception
        L86:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = ""
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r10, r2, r1)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "xp2p Wrapper getStat error!!! "
            r10.<init>(r1)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r9)
            r4 = r3
        La0:
            if (r4 == 0) goto La5
            r4.mo48348x1f9d589c()
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ln0.p.f(java.lang.String, java.lang.String):void");
    }

    public final void g(int i17) {
        if (i17 >= 0 && i17 < 4) {
            com.p307xc6797c64.qvb.C2852x293225.m21229xed871122(i17);
        } else {
            com.p307xc6797c64.qvb.C2852x293225.m21229xed871122(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper setLogLevel: " + i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ln0.p.h(java.lang.String):void");
    }
}
