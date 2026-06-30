package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class h2 implements dn.f, com.tencent.mm.modelbase.u0 {

    /* renamed from: v, reason: collision with root package name */
    public static final long[] f70980v = {0, 2, 5, 7, 10, 15, 20, 30, 50, 70, 100, 200, 400, 600, 800, 1000, 3000, 5000, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, 20000, 30000, 40000, 50000, 60000, u04.d.f423477c};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f70981w = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34};

    /* renamed from: x, reason: collision with root package name */
    public static int f70982x = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f70983d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f70984e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f70985f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f70986g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.app.s2 f70987h;

    /* renamed from: i, reason: collision with root package name */
    public wu5.c f70988i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Thread f70989m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f70990n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f70991o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f70992p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Queue f70993q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f70994r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f70995s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.Map f70996t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashSet f70997u;

    public h2() {
        new java.util.concurrent.ConcurrentHashMap();
        this.f70985f = new java.util.concurrent.ConcurrentHashMap();
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.modelcdntran.w1(this), true);
        this.f70986g = b4Var;
        com.tencent.mm.modelcdntran.y1 y1Var = new com.tencent.mm.modelcdntran.y1(this);
        this.f70987h = y1Var;
        this.f70988i = null;
        this.f70989m = null;
        this.f70990n = new com.tencent.mm.modelcdntran.z1(this);
        this.f70991o = new java.util.concurrent.ConcurrentHashMap();
        this.f70992p = e11.b.f246357a;
        this.f70993q = new java.util.LinkedList();
        this.f70994r = new java.util.HashMap();
        this.f70995s = new java.util.concurrent.ConcurrentHashMap();
        this.f70996t = new java.util.HashMap();
        this.f70997u = new java.util.HashSet();
        gm0.j1.d().a(379, this);
        if (e()) {
            y1Var.alive();
            b4Var.c(60000L, 60000L);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "summersafecdn CdnTransportService init[%s] stack[%s]", java.lang.Integer.valueOf(hashCode()), new com.tencent.mm.sdk.platformtools.z3());
    }

    public static void c(com.tencent.mm.modelcdntran.h2 h2Var) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.util.Iterator it;
        int i17;
        h2Var.getClass();
        if (e()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = h2Var.f70984e;
            java.util.Iterator it6 = concurrentHashMap2.entrySet().iterator();
            while (it6.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
                com.tencent.mm.modelcdntran.g2 g2Var = (com.tencent.mm.modelcdntran.g2) entry.getValue();
                long j17 = g2Var.f70951e;
                java.lang.String str = g2Var.f70947a;
                java.lang.String str2 = g2Var.f70948b;
                long j18 = g2Var.f70952f;
                java.lang.String str3 = str;
                long j19 = g2Var.f70950d;
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
                            if (j27 >= f70980v[i18]) {
                                i17 = f70981w[i18];
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
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str3 == null) {
                        str3 = "";
                    }
                    objArr[2] = str3;
                    java.lang.String str4 = g2Var.field_mediaId;
                    if (str4 == null) {
                        str4 = "";
                    }
                    objArr[3] = str4;
                    objArr[4] = java.lang.Long.valueOf(j27);
                    objArr[5] = java.lang.Long.valueOf(j19);
                    objArr[6] = java.lang.Long.valueOf(g2Var.f70951e);
                    com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "reportCDNCallbackTime(%s) taskName:%s cdnCallbackReportId:%s mediaId:%s duration:%s(%s-%s)", objArr);
                    if (i17 == 34) {
                        h2Var.h(str2);
                    }
                    arrayList.add((java.lang.String) entry.getKey());
                } else {
                    concurrentHashMap = concurrentHashMap2;
                    it = it6;
                    if (java.lang.System.currentTimeMillis() - j19 > u04.d.f423477c) {
                        java.lang.Object[] objArr2 = new java.lang.Object[4];
                        objArr2[0] = java.lang.Long.valueOf(j18);
                        objArr2[1] = str2;
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        objArr2[2] = str3 == null ? "" : str3;
                        java.lang.String str5 = g2Var.field_mediaId;
                        objArr2[3] = str5 == null ? "" : str5;
                        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "reportCDNCallbackTime(%s) taskName:%s cdnCallbackReportId:%s id:%s", objArr2);
                        jx3.f.INSTANCE.idkeyStat(1452L, 34L, 1L, false);
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
        return com.tencent.mm.sdk.platformtools.t8.D0(j62.e.g().a("clicfg_cdn_callback_consume_time_statistics_switch", "1", false, true), "1");
    }

    public static com.tencent.mars.smc.IDKey g(int i17, long j17) {
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(1452);
        iDKey.SetKey(i17);
        iDKey.SetValue(j17);
        return iDKey;
    }

    @Override // dn.f
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        dn.m mVar;
        dn.k kVar;
        if (com.tencent.mm.sdk.platformtools.t8.K0(mediaId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportService", "cdn callback getauthbuf mediaid is null");
            return;
        }
        com.tencent.mm.modelcdntran.z aj6 = com.tencent.mm.modelcdntran.s1.aj();
        if (aj6 != null) {
            kotlin.jvm.internal.o.g(mediaId, "mediaId");
            kotlin.jvm.internal.o.g(buff, "buff");
            com.tencent.mm.modelcdntran.e eVar = (com.tencent.mm.modelcdntran.e) aj6.Z6().get(mediaId);
            if (eVar != null && (mVar = eVar.f70927a) != null && (kVar = mVar.f241787f) != null) {
                kVar.O(mediaId, buff);
            }
            if (buff.size() > 0) {
                return;
            }
        }
        dn.m mVar2 = (dn.m) ((java.util.concurrent.ConcurrentHashMap) this.f70995s).get(mediaId);
        if (mVar2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportService", " getauthbuf task in jni get info failed mediaid:%s", mediaId);
            return;
        }
        dn.k kVar2 = mVar2.f241787f;
        if (kVar2 != null) {
            kVar2.O(mediaId, buff);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportService", "getCdnAuthInfo fail, null taskcallback.");
        }
    }

    @Override // dn.f
    public int a(java.lang.String str, dn.g gVar, dn.h hVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportService", "cdn callback mediaid is null");
            return -1;
        }
        if (gVar == null && hVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportService", "cdn callback info all null");
            return -2;
        }
        java.lang.System.currentTimeMillis();
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.modelcdntran.d2(this, str, gVar, hVar), f((dn.m) ((java.util.concurrent.ConcurrentHashMap) this.f70995s).get(str)));
        return 0;
    }

    public void b() {
        java.lang.String str;
        if (!gm0.j1.b().n()) {
            return;
        }
        com.tencent.mars.cdn.CdnManager.Config config = new com.tencent.mars.cdn.CdnManager.Config();
        try {
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("EnableSnsStreamDownload");
            java.lang.String d18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("EnableSnsImageDownload");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                config.EnableSnsStreamDownload = java.lang.Integer.valueOf(d17).intValue();
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(d18)) {
                config.EnableSnsImageDownload = java.lang.Integer.valueOf(d18).intValue();
            }
            config.EnableSafeCDN = 1;
            config.ApprovedVideoHosts = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_approved_videohosts, "weixinf.tc.qq.com,szwbwxsns.video.qq.com,szxzwxsns.video.qq.com,szzjwxsns.video.qq.com,shwbwxsns.video.qq.com,shxzwxsns.video.qq.com,shzjwxsns.video.qq.com,wxsnsdy.wxs.qq.com,vweixinthumb.tc.qq.com,wxsnsdythumb.wxs.qq.com,wxappthumb.tc.qq.com,wxapp.tc.qq.com,wxsnsdysvp.wxs.qq.com,finder.video.qq.com,findermp.video.qq.com,weixinf.tc.qq.com.cn,szwbwxsns.video.qq.com.cn,szxzwxsns.video.qq.com.cn,szzjwxsns.video.qq.com.cn,shwbwxsns.video.qq.com.cn,shxzwxsns.video.qq.com.cn,shzjwxsns.video.qq.com.cn,wxsnsdy.wxs.qq.com.cn,vweixinthumb.tc.qq.com.cn,wxsnsdythumb.wxs.qq.com.cn,wxappthumb.tc.qq.com.cn,wxapp.tc.qq.com.cn,wxsnsdysvp.wxs.qq.com.cn,finder.video.qq.com.cn,findermp.video.qq.com.cn,snsvideo.c2c.qq.com.cn,wxsnsdy.video.qq.com.cn,snsvideo.hk.wechat.com,snsvideo.c2c.wechat.com,findera4.video.qq.com", true);
            config.MiscellaneousExptValues = "clicfg_bigfile_hutong_download=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_bigfile_hutong_download, "0", true) + ";clicfg_finder_mars_base_reversal_2023q2=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_mars_base_reversal_2023q2, "0", true) + ";clicfg_finder_cdn_redirect_slowspeed_threshold=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_redirect_slowspeed_threshold, "300", true) + ";clicfg_enable_snsimage_route=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_enable_snsimage_route, "0", true) + ";clicfg_finder_cdn_reserve_safetime_ms=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_reserve_safetime_ms, "2000", true) + ";clicfg_finder_cdn_cacheforpcdn_ms=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_cacheforpcdn_ms, "6000", true) + ";clicfg_finder_cdn_redirect_connect_timeout_ms=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_redirect_connect_timeout_ms, "2000", true) + ";clicfg_finder_cdn_ugc_blocksize_kbytes=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_ugc_blocksize_kbytes, "256", true) + ";clicfg_finder_cdn_use_fastredirect=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_use_fastredirect, "1", true) + ";clicfg_finder_cdn_use_fastpcdn=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_use_fastpcdn, "1", true) + ";clicfg_finder_cdn_redirect_rwtimeoutms=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_redirect_rwtimeoutms, "2000", true) + ";clicfg_finder_cdn_pcdn_rwtimeoutms=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_pcdn_rwtimeoutms, "2000", true) + ";clicfg_finder_cdn_ugc_rwtimeoutms=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_ugc_rwtimeoutms, "2000", true) + ";clicfg_finder_cdn_ugc_slowspeed_threshold=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_cdn_ugc_slowspeed_threshold, "75", true) + ";clicfg_android_channelvideo_quic=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_channelvideo_quic, "324", true) + ";clicfg_android_snsimage_quic=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_snsimage_quic, "111", true) + ";clicfg_hutong_approved_hostlist=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_hutong_approved_hostlist, "wwfile.work.weixin.qq.com,", true) + ";clicfg_android_snsimage_maxretry=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_snsimage_maxretry, "9", true) + ";clicfg_android_snsimage_maxtimeout_seconds=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_snsimage_maxtimeout_seconds, "20", true) + ";clicfg_enable_snsimage_tls_over_newdns=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_enable_snsimage_tls_over_newdns, "1", true) + ";clicfg_approved_friendsimage_hosts=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_approved_friendsimage_hosts, "", true) + ";clicfg_approved_headimage_hosts=cwx.qlogo.cn,wx.qlogo.cn,thirdwx.qlogo.cn,cwxlive.qlogo.cn,mmhead.c2c.wechat.com,mmhead.hk.wechat.com,;clicfg_cdn_open_quic_certverify=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_cdn_open_quic_certverify, "0", true) + ";clicfg_cdn_open_c2cvoice_quic=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_cdn_open_c2cvoice_quic, "0", true) + ";clicfg_cdn_friends_sni_hostname=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_cdn_friends_sni_hostname, "cmmsns.qpic.cn", true) + ";clicfg_cdn_c2c_sni_hostname=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_cdn_c2c_sni_hostname, "wxapp.tc.qq.com", true) + ";";
            str = "MicroMsg.CdnTransportService";
            try {
                com.tencent.mars.xlog.Log.i(str, "[miscell.config] expt %s", config.MiscellaneousExptValues);
                try {
                    int i17 = this.f70983d;
                    if (i17 != -1) {
                        com.tencent.mars.xlog.Log.w(str, "cmd set snsimage flag: %d", java.lang.Integer.valueOf(i17));
                        config.EnableSnsImageDownload = this.f70983d;
                    }
                    com.tencent.mars.xlog.Log.i(str, "summersafecdn streamcdn config[SVR]:%s", config);
                    ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).setConfig(config);
                } catch (java.lang.NumberFormatException e17) {
                    e = e17;
                    com.tencent.mars.xlog.Log.e(str, e.toString());
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
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportService", "summersafecdn addSendTask task info is null");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_mediaId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportService", "summersafecdn addSendTask mediaId is null");
            return false;
        }
        if (mVar.field_fileId == null) {
            mVar.field_fileId = "";
        }
        if (mVar.field_aesKey == null) {
            mVar.field_aesKey = "";
        }
        mVar.f241786e = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "addSendTask id:%s appType:%s fileType:%s", mVar.field_mediaId, java.lang.Integer.valueOf(mVar.field_appType), java.lang.Integer.valueOf(mVar.field_appType));
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.modelcdntran.c2(this, mVar), "MicroMsg.Cdn.ThreadName");
        return true;
    }

    public java.lang.String f(dn.m mVar) {
        if (mVar == null || com.tencent.mm.sdk.platformtools.t8.K0(mVar.f241785d)) {
            return "MicroMsg.CdnTransportService";
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f70991o;
        if (concurrentHashMap.containsKey(mVar.f241785d)) {
            return (java.lang.String) concurrentHashMap.get(mVar.f241785d);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.CdnTransportService_");
        int size = concurrentHashMap.size() + 1;
        if (f70982x == -1) {
            f70982x = com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_cdn_callback_tag_max_num", "1", false, true), 1);
        }
        sb6.append(size % f70982x);
        java.lang.String sb7 = sb6.toString();
        concurrentHashMap.put(mVar.f241785d, sb7);
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = mVar.f241785d;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = sb7 != null ? sb7 : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "taskName:%s tag:%s", objArr);
        return sb7;
    }

    public final void h(java.lang.String str) {
        java.lang.String str2;
        if (this.f70989m != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (java.lang.StackTraceElement stackTraceElement : this.f70989m.getStackTrace()) {
                sb6.append(stackTraceElement.toString());
                sb6.append("\n");
            }
            str2 = sb6.toString().replace(",", ";");
        } else {
            str2 = "";
        }
        com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
        errorMsgInfoStruct.f56113e = 1041L;
        errorMsgInfoStruct.p(str);
        errorMsgInfoStruct.q(str2);
        errorMsgInfoStruct.o();
        errorMsgInfoStruct.k();
    }

    public void i(int i17) {
        this.f70983d = i17;
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelcdntran.h2.j(boolean):void");
    }

    public boolean k(int i17) {
        if (!gm0.j1.b().n()) {
            return true;
        }
        int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(144385, null), 0);
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("CDNGrayscaleBitMask", 0);
        int b18 = i17 & ((j17 & (~b17)) | (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("CDNGrayscaleBitVal", 0) & b17));
        boolean z17 = x51.o1.f452042a;
        int i18 = x51.o1.f452059l;
        if (i18 == 1) {
            return true;
        }
        return i18 != 2 && b18 > 0;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() != 379) {
            return;
        }
        m1Var.getType();
        if (gm0.j1.b().m()) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.modelcdntran.a2(this), "MicroMsg.Cdn.ThreadName");
        }
    }

    @Override // dn.f
    public byte[] w(java.lang.String str, byte[] bArr) {
        dn.m mVar;
        dn.k kVar;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportService", "cdn callback decodePrepareResponse mediaid is null");
            return null;
        }
        com.tencent.mm.modelcdntran.z aj6 = com.tencent.mm.modelcdntran.s1.aj();
        if (aj6 != null) {
            com.tencent.mm.modelcdntran.e eVar = (com.tencent.mm.modelcdntran.e) aj6.Z6().get(str);
            byte[] w17 = (eVar == null || (mVar = eVar.f70927a) == null || (kVar = mVar.f241787f) == null) ? null : kVar.w(str, bArr);
            if (w17 != null) {
                return w17;
            }
        }
        dn.m mVar2 = (dn.m) ((java.util.concurrent.ConcurrentHashMap) this.f70995s).get(str);
        if (mVar2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportService", " decodePrepareResponse task in jni get info failed mediaid:%s", str);
            return null;
        }
        dn.k kVar2 = mVar2.f241787f;
        if (kVar2 != null) {
            return kVar2.w(str, bArr);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportService", "decodePrepareResponse fail, null taskcallback.");
        return null;
    }

    @Override // dn.f
    public int x(java.lang.String str, dn.h hVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.modelcdntran.e2(this, str, hVar), f((dn.m) ((java.util.concurrent.ConcurrentHashMap) this.f70995s).get(str)));
        return 0;
    }
}
