package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public class h2 implements dn.f, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: v, reason: collision with root package name */
    public static final long[] f152513v = {0, 2, 5, 7, 10, 15, 20, 30, 50, 70, 100, 200, 400, 600, 800, 1000, 3000, 5000, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, 20000, 30000, 40000, 50000, 60000, u04.d.f505010c};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f152514w = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34};

    /* renamed from: x, reason: collision with root package name */
    public static int f152515x = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f152516d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f152517e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f152518f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f152519g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.s2 f152520h;

    /* renamed from: i, reason: collision with root package name */
    public wu5.c f152521i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Thread f152522m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f152523n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f152524o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f152525p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Queue f152526q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f152527r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f152528s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.Map f152529t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashSet f152530u;

    public h2() {
        new java.util.concurrent.ConcurrentHashMap();
        this.f152518f = new java.util.concurrent.ConcurrentHashMap();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p947xba6de98f.w1(this), true);
        this.f152519g = b4Var;
        com.p314xaae8f345.mm.p947xba6de98f.y1 y1Var = new com.p314xaae8f345.mm.p947xba6de98f.y1(this);
        this.f152520h = y1Var;
        this.f152521i = null;
        this.f152522m = null;
        this.f152523n = new com.p314xaae8f345.mm.p947xba6de98f.z1(this);
        this.f152524o = new java.util.concurrent.ConcurrentHashMap();
        this.f152525p = e11.b.f327890a;
        this.f152526q = new java.util.LinkedList();
        this.f152527r = new java.util.HashMap();
        this.f152528s = new java.util.concurrent.ConcurrentHashMap();
        this.f152529t = new java.util.HashMap();
        this.f152530u = new java.util.HashSet();
        gm0.j1.d().a(379, this);
        if (e()) {
            y1Var.m43071x58998cd();
            b4Var.c(60000L, 60000L);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "summersafecdn CdnTransportService init[%s] stack[%s]", java.lang.Integer.valueOf(hashCode()), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    public static void c(com.p314xaae8f345.mm.p947xba6de98f.h2 h2Var) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.util.Iterator it;
        int i17;
        h2Var.getClass();
        if (e()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = h2Var.f152517e;
            java.util.Iterator it6 = concurrentHashMap2.entrySet().iterator();
            while (it6.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
                com.p314xaae8f345.mm.p947xba6de98f.g2 g2Var = (com.p314xaae8f345.mm.p947xba6de98f.g2) entry.getValue();
                long j17 = g2Var.f152484e;
                java.lang.String str = g2Var.f152480a;
                java.lang.String str2 = g2Var.f152481b;
                long j18 = g2Var.f152485f;
                java.lang.String str3 = str;
                long j19 = g2Var.f152483d;
                if (j17 > 0) {
                    long j27 = j17 - j19;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    it = it6;
                    arrayList2.add(g(5, j27));
                    int i18 = 24;
                    while (true) {
                        if (i18 < 0) {
                            i17 = 10;
                            break;
                        } else {
                            if (j27 >= f152513v[i18]) {
                                i17 = f152514w[i18];
                                break;
                            }
                            i18--;
                        }
                    }
                    concurrentHashMap = concurrentHashMap2;
                    arrayList2.add(g(i17, 1L));
                    arrayList2.add(g(0, 1L));
                    jx3.f.INSTANCE.b(arrayList2, false);
                    java.lang.Object[] objArr = new java.lang.Object[7];
                    objArr[0] = java.lang.Long.valueOf(j18);
                    objArr[1] = str2;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str3 == null) {
                        str3 = "";
                    }
                    objArr[2] = str3;
                    java.lang.String str4 = g2Var.f32560xaca5bdda;
                    if (str4 == null) {
                        str4 = "";
                    }
                    objArr[3] = str4;
                    objArr[4] = java.lang.Long.valueOf(j27);
                    objArr[5] = java.lang.Long.valueOf(j19);
                    objArr[6] = java.lang.Long.valueOf(g2Var.f152484e);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "reportCDNCallbackTime(%s) taskName:%s cdnCallbackReportId:%s mediaId:%s duration:%s(%s-%s)", objArr);
                    if (i17 == 34) {
                        h2Var.h(str2);
                    }
                    arrayList.add((java.lang.String) entry.getKey());
                } else {
                    concurrentHashMap = concurrentHashMap2;
                    it = it6;
                    if (java.lang.System.currentTimeMillis() - j19 > u04.d.f505010c) {
                        java.lang.Object[] objArr2 = new java.lang.Object[4];
                        objArr2[0] = java.lang.Long.valueOf(j18);
                        objArr2[1] = str2;
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        objArr2[2] = str3 == null ? "" : str3;
                        java.lang.String str5 = g2Var.f32560xaca5bdda;
                        objArr2[3] = str5 == null ? "" : str5;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "reportCDNCallbackTime(%s) taskName:%s cdnCallbackReportId:%s id:%s", objArr2);
                        jx3.f.INSTANCE.mo68477x336bdfd8(1452L, 34L, 1L, false);
                        h2Var.h("no_end_" + str2);
                        arrayList.add((java.lang.String) entry.getKey());
                    }
                }
                it6 = it;
                concurrentHashMap2 = concurrentHashMap;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                concurrentHashMap3.remove((java.lang.String) it7.next());
            }
        }
    }

    public static boolean e() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(j62.e.g().a("clicfg_cdn_callback_consume_time_statistics_switch", "1", false, true), "1");
    }

    public static com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 g(int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c344.m40330x4c144dd(1452);
        c4582x424c344.m40331x936762bd(i17);
        c4582x424c344.m40332x57b2b64f(j17);
        return c4582x424c344;
    }

    @Override // dn.f
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        dn.m mVar;
        dn.k kVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mediaId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnTransportService", "cdn callback getauthbuf mediaid is null");
            return;
        }
        com.p314xaae8f345.mm.p947xba6de98f.z aj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.aj();
        if (aj6 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
            com.p314xaae8f345.mm.p947xba6de98f.e eVar = (com.p314xaae8f345.mm.p947xba6de98f.e) aj6.Z6().get(mediaId);
            if (eVar != null && (mVar = eVar.f152460a) != null && (kVar = mVar.f323320f) != null) {
                kVar.O(mediaId, buff);
            }
            if (buff.size() > 0) {
                return;
            }
        }
        dn.m mVar2 = (dn.m) ((java.util.concurrent.ConcurrentHashMap) this.f152528s).get(mediaId);
        if (mVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnTransportService", " getauthbuf task in jni get info failed mediaid:%s", mediaId);
            return;
        }
        dn.k kVar2 = mVar2.f323320f;
        if (kVar2 != null) {
            kVar2.O(mediaId, buff);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnTransportService", "getCdnAuthInfo fail, null taskcallback.");
        }
    }

    @Override // dn.f
    public int a(java.lang.String str, dn.g gVar, dn.h hVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnTransportService", "cdn callback mediaid is null");
            return -1;
        }
        if (gVar == null && hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnTransportService", "cdn callback info all null");
            return -2;
        }
        java.lang.System.currentTimeMillis();
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p947xba6de98f.d2(this, str, gVar, hVar), f((dn.m) ((java.util.concurrent.ConcurrentHashMap) this.f152528s).get(str)));
        return 0;
    }

    public void b() {
        java.lang.String str;
        if (!gm0.j1.b().n()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.Config config = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.Config();
        try {
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("EnableSnsStreamDownload");
            java.lang.String d18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("EnableSnsImageDownload");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                config.f18040x8507dc5d = java.lang.Integer.valueOf(d17).intValue();
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d18)) {
                config.f18039xf73e102e = java.lang.Integer.valueOf(d18).intValue();
            }
            config.f18038xe117f63d = 1;
            config.f18037xdfa9647 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_approved_videohosts, "weixinf.tc.qq.com,szwbwxsns.video.qq.com,szxzwxsns.video.qq.com,szzjwxsns.video.qq.com,shwbwxsns.video.qq.com,shxzwxsns.video.qq.com,shzjwxsns.video.qq.com,wxsnsdy.wxs.qq.com,vweixinthumb.tc.qq.com,wxsnsdythumb.wxs.qq.com,wxappthumb.tc.qq.com,wxapp.tc.qq.com,wxsnsdysvp.wxs.qq.com,finder.video.qq.com,findermp.video.qq.com,weixinf.tc.qq.com.cn,szwbwxsns.video.qq.com.cn,szxzwxsns.video.qq.com.cn,szzjwxsns.video.qq.com.cn,shwbwxsns.video.qq.com.cn,shxzwxsns.video.qq.com.cn,shzjwxsns.video.qq.com.cn,wxsnsdy.wxs.qq.com.cn,vweixinthumb.tc.qq.com.cn,wxsnsdythumb.wxs.qq.com.cn,wxappthumb.tc.qq.com.cn,wxapp.tc.qq.com.cn,wxsnsdysvp.wxs.qq.com.cn,finder.video.qq.com.cn,findermp.video.qq.com.cn,snsvideo.c2c.qq.com.cn,wxsnsdy.video.qq.com.cn,snsvideo.hk.wechat.com,snsvideo.c2c.wechat.com,findera4.video.qq.com", true);
            config.f18041x3148f467 = "clicfg_bigfile_hutong_download=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_bigfile_hutong_download, "0", true) + ";clicfg_finder_mars_base_reversal_2023q2=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_mars_base_reversal_2023q2, "0", true) + ";clicfg_finder_cdn_redirect_slowspeed_threshold=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_redirect_slowspeed_threshold, "300", true) + ";clicfg_enable_snsimage_route=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_enable_snsimage_route, "0", true) + ";clicfg_finder_cdn_reserve_safetime_ms=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_reserve_safetime_ms, "2000", true) + ";clicfg_finder_cdn_cacheforpcdn_ms=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_cacheforpcdn_ms, "6000", true) + ";clicfg_finder_cdn_redirect_connect_timeout_ms=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_redirect_connect_timeout_ms, "2000", true) + ";clicfg_finder_cdn_ugc_blocksize_kbytes=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_ugc_blocksize_kbytes, "256", true) + ";clicfg_finder_cdn_use_fastredirect=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_use_fastredirect, "1", true) + ";clicfg_finder_cdn_use_fastpcdn=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_use_fastpcdn, "1", true) + ";clicfg_finder_cdn_redirect_rwtimeoutms=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_redirect_rwtimeoutms, "2000", true) + ";clicfg_finder_cdn_pcdn_rwtimeoutms=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_pcdn_rwtimeoutms, "2000", true) + ";clicfg_finder_cdn_ugc_rwtimeoutms=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_ugc_rwtimeoutms, "2000", true) + ";clicfg_finder_cdn_ugc_slowspeed_threshold=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_ugc_slowspeed_threshold, "75", true) + ";clicfg_android_channelvideo_quic=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_channelvideo_quic, "324", true) + ";clicfg_android_snsimage_quic=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_snsimage_quic, "111", true) + ";clicfg_hutong_approved_hostlist=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_hutong_approved_hostlist, "wwfile.work.weixin.qq.com,", true) + ";clicfg_android_snsimage_maxretry=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_snsimage_maxretry, "9", true) + ";clicfg_android_snsimage_maxtimeout_seconds=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_snsimage_maxtimeout_seconds, "20", true) + ";clicfg_enable_snsimage_tls_over_newdns=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_enable_snsimage_tls_over_newdns, "1", true) + ";clicfg_approved_friendsimage_hosts=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_approved_friendsimage_hosts, "", true) + ";clicfg_approved_headimage_hosts=cwx.qlogo.cn,wx.qlogo.cn,thirdwx.qlogo.cn,cwxlive.qlogo.cn,mmhead.c2c.wechat.com,mmhead.hk.wechat.com,;clicfg_cdn_open_quic_certverify=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_cdn_open_quic_certverify, "0", true) + ";clicfg_cdn_open_c2cvoice_quic=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_cdn_open_c2cvoice_quic, "0", true) + ";clicfg_cdn_friends_sni_hostname=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_cdn_friends_sni_hostname, "cmmsns.qpic.cn", true) + ";clicfg_cdn_c2c_sni_hostname=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_cdn_c2c_sni_hostname, "wxapp.tc.qq.com", true) + ";";
            str = "MicroMsg.CdnTransportService";
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[miscell.config] expt %s", config.f18041x3148f467);
                try {
                    int i17 = this.f152516d;
                    if (i17 != -1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "cmd set snsimage flag: %d", java.lang.Integer.valueOf(i17));
                        config.f18039xf73e102e = this.f152516d;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "summersafecdn streamcdn config[SVR]:%s", config);
                    ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37770x78bda44(config);
                } catch (java.lang.NumberFormatException e17) {
                    e = e17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, e.toString());
                }
            } catch (java.lang.NumberFormatException e18) {
                e = e18;
            }
        } catch (java.lang.NumberFormatException e19) {
            e = e19;
            str = "MicroMsg.CdnTransportService";
        }
    }

    public boolean d(dn.m mVar) {
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnTransportService", "summersafecdn addSendTask task info is null");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f69601xaca5bdda)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnTransportService", "summersafecdn addSendTask mediaId is null");
            return false;
        }
        if (mVar.f69591xf9dbbe9c == null) {
            mVar.f69591xf9dbbe9c = "";
        }
        if (mVar.f69575xf11df5f5 == null) {
            mVar.f69575xf11df5f5 = "";
        }
        mVar.f323319e = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "addSendTask id:%s appType:%s fileType:%s", mVar.f69601xaca5bdda, java.lang.Integer.valueOf(mVar.f69580x454032b6), java.lang.Integer.valueOf(mVar.f69580x454032b6));
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p947xba6de98f.c2(this, mVar), "MicroMsg.Cdn.ThreadName");
        return true;
    }

    public java.lang.String f(dn.m mVar) {
        if (mVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f323318d)) {
            return "MicroMsg.CdnTransportService";
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f152524o;
        if (concurrentHashMap.containsKey(mVar.f323318d)) {
            return (java.lang.String) concurrentHashMap.get(mVar.f323318d);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.CdnTransportService_");
        int size = concurrentHashMap.size() + 1;
        if (f152515x == -1) {
            f152515x = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_cdn_callback_tag_max_num", "1", false, true), 1);
        }
        sb6.append(size % f152515x);
        java.lang.String sb7 = sb6.toString();
        concurrentHashMap.put(mVar.f323318d, sb7);
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = mVar.f323318d;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = sb7 != null ? sb7 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "taskName:%s tag:%s", objArr);
        return sb7;
    }

    public final void h(java.lang.String str) {
        java.lang.String str2;
        if (this.f152522m != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (java.lang.StackTraceElement stackTraceElement : this.f152522m.getStackTrace()) {
                sb6.append(stackTraceElement.toString());
                sb6.append("\n");
            }
            str2 = sb6.toString().replace(",", ";");
        } else {
            str2 = "";
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c c6423x452b9f7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c();
        c6423x452b9f7c.f137646e = 1041L;
        c6423x452b9f7c.p(str);
        c6423x452b9f7c.q(str2);
        c6423x452b9f7c.o();
        c6423x452b9f7c.k();
    }

    public void i(int i17) {
        this.f152516d = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x046b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x044b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(boolean r30) {
        /*
            Method dump skipped, instructions count: 1217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p947xba6de98f.h2.j(boolean):void");
    }

    public boolean k(int i17) {
        if (!gm0.j1.b().n()) {
            return true;
        }
        int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) gm0.j1.u().c().l(144385, null), 0);
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("CDNGrayscaleBitMask", 0);
        int b18 = i17 & ((j17 & (~b17)) | (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("CDNGrayscaleBitVal", 0) & b17));
        boolean z17 = x51.o1.f533575a;
        int i18 = x51.o1.f533592l;
        if (i18 == 1) {
            return true;
        }
        return i18 != 2 && b18 > 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() != 379) {
            return;
        }
        m1Var.mo808xfb85f7b0();
        if (gm0.j1.b().m()) {
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p947xba6de98f.a2(this), "MicroMsg.Cdn.ThreadName");
        }
    }

    @Override // dn.f
    public byte[] w(java.lang.String str, byte[] bArr) {
        dn.m mVar;
        dn.k kVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnTransportService", "cdn callback decodePrepareResponse mediaid is null");
            return null;
        }
        com.p314xaae8f345.mm.p947xba6de98f.z aj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.aj();
        if (aj6 != null) {
            com.p314xaae8f345.mm.p947xba6de98f.e eVar = (com.p314xaae8f345.mm.p947xba6de98f.e) aj6.Z6().get(str);
            byte[] w17 = (eVar == null || (mVar = eVar.f152460a) == null || (kVar = mVar.f323320f) == null) ? null : kVar.w(str, bArr);
            if (w17 != null) {
                return w17;
            }
        }
        dn.m mVar2 = (dn.m) ((java.util.concurrent.ConcurrentHashMap) this.f152528s).get(str);
        if (mVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnTransportService", " decodePrepareResponse task in jni get info failed mediaid:%s", str);
            return null;
        }
        dn.k kVar2 = mVar2.f323320f;
        if (kVar2 != null) {
            return kVar2.w(str, bArr);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnTransportService", "decodePrepareResponse fail, null taskcallback.");
        return null;
    }

    @Override // dn.f
    public int x(java.lang.String str, dn.h hVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p947xba6de98f.e2(this, str, hVar), f((dn.m) ((java.util.concurrent.ConcurrentHashMap) this.f152528s).get(str)));
        return 0;
    }
}
