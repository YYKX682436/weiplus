package i64;

/* loaded from: classes4.dex */
public class l0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f370750d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f370751e;

    /* renamed from: f, reason: collision with root package name */
    public final i64.a f370752f;

    /* renamed from: g, reason: collision with root package name */
    public i64.j0 f370753g;

    /* renamed from: h, reason: collision with root package name */
    public long f370754h;

    public l0(long j17, java.lang.String str, int i17, int i18, int i19, java.lang.String str2, int i27, java.lang.String str3, int i28, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, long j18, java.lang.String str4, java.lang.String str5, i64.a aVar, r45.r2 r2Var) {
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.s2();
        lVar.f152198b = new r45.t2();
        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2) p94.w0.e()).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdRecSrc", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(j17);
        int m70350x13c652ad = W0 == null ? 0 : W0.m70350x13c652ad();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdRecSrc", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (m70350x13c652ad != 2) {
            lVar.f152199c = "/cgi-bin/mmoc-bin/ad/click";
            lVar.f152200d = 1232;
        } else {
            lVar.f152199c = "/cgi-bin/mmux-bin/adclick";
            lVar.f152200d = 1817;
        }
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f370750d = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAdClick", "source %d, uri %s", java.lang.Integer.valueOf(m70350x13c652ad), a17.f152245c);
        r45.s2 s2Var = (r45.s2) a17.f152243a.f152217a;
        s2Var.f466939e = i17;
        s2Var.f466938d = str;
        s2Var.f466941g = i19;
        s2Var.f466940f = str2;
        s2Var.f466944m = java.lang.System.currentTimeMillis();
        s2Var.f466946o = i27;
        s2Var.f466947p = i18;
        s2Var.f466948q = m70350x13c652ad;
        s2Var.f466949r = str3;
        s2Var.f466950s = i28;
        s2Var.f466953v = j18;
        s2Var.f466954w = aVar.f370581f;
        s2Var.C = aVar.f370582g;
        s2Var.f466956y = str4;
        s2Var.f466955x = str5;
        if (gVar2 != null) {
            s2Var.f466952u = gVar2;
        }
        if (gVar != null) {
            s2Var.f466951t = gVar;
        }
        this.f370752f = aVar;
        s2Var.f466957z = aVar.f370578c;
        s2Var.A = aVar.f370577b;
        s2Var.B = aVar.f370576a;
        s2Var.G = aVar.f370584i;
        s2Var.F = aVar.f370583h;
        s2Var.H = aVar.f370579d;
        s2Var.I = j65.e.b() ? 1 : 0;
        s2Var.f466937J = i65.a.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        s2Var.K = aVar.f370580e;
        java.lang.String str9 = aVar.f370591p;
        s2Var.M = str9 == null ? "" : str9;
        java.lang.String str10 = aVar.f370586k;
        s2Var.L = str10 == null ? "" : str10;
        s2Var.N = aVar.f370592q;
        s2Var.P = aVar.f370593r;
        r45.q2 q2Var = new r45.q2();
        q2Var.f465113d = aVar.f370594s;
        s2Var.R = q2Var;
        java.lang.String str11 = "pass_through_data=" + q2Var.f465113d;
        if (r2Var != null) {
            s2Var.Q = r2Var;
            str6 = str11;
            str7 = "click_feed_x=" + r2Var.f465984d + ", click_feed_y=" + r2Var.f465985e + ", click_screen_x=" + r2Var.f465986f + ", click_screen_y=" + r2Var.f465987g + ", feed_width=" + r2Var.f465988h + ", feed_height=" + r2Var.f465989i + ", screen_width=" + r2Var.f465990m + ", screen_height=" + r2Var.f465991n;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAdClick", "adClickQualityInfoString = " + str7);
        } else {
            str6 = str11;
            str7 = "";
        }
        try {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2044, 11);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("##snsId:");
                java.lang.String str12 = str7;
                sb6.append(new java.math.BigInteger(java.lang.Long.toBinaryString(j17), 2).toString());
                sb6.append(", minishop_uuid:");
                sb6.append(s2Var.M);
                sb6.append(", clickPos:");
                sb6.append(i17);
                sb6.append(", clickAction:");
                sb6.append(i18);
                sb6.append(", sceneType:");
                sb6.append(i19);
                sb6.append(", descXml:");
                sb6.append(str2);
                sb6.append(", adtype:");
                sb6.append(i27);
                sb6.append(", snsStatStr:");
                sb6.append(str3);
                sb6.append(", flipStatus:");
                sb6.append(i28);
                sb6.append(", remind_source_info.length:");
                sb6.append(gVar == null ? 0 : gVar.f273689a.length);
                sb6.append(", remind_self_info.length:");
                sb6.append(gVar2 == null ? 0 : gVar2.f273689a.length);
                sb6.append(", exposure_start_time:");
                sb6.append(j18);
                sb6.append(", followStatus:");
                sb6.append(s2Var.A);
                sb6.append(", installStatus:");
                sb6.append(s2Var.B);
                sb6.append(", videoCurTime:");
                sb6.append(s2Var.f466957z);
                sb6.append(", oaid:");
                sb6.append(s2Var.f466954w);
                sb6.append(", imei:");
                sb6.append(s2Var.C);
                sb6.append(", waidPkg:");
                sb6.append(str4);
                sb6.append(", waid:");
                sb6.append(str5);
                sb6.append(", ua:");
                sb6.append(s2Var.F);
                sb6.append(", relieved_buy_show:");
                sb6.append(s2Var.K);
                sb6.append(", common_device_id:");
                sb6.append(s2Var.G);
                sb6.append(", sub_clickpos:");
                sb6.append(s2Var.H);
                sb6.append(", elder_mode:");
                sb6.append("" + s2Var.I);
                sb6.append(", font_level:");
                sb6.append("" + s2Var.f466937J);
                sb6.append(", uxInfo:");
                sb6.append(s2Var.L);
                sb6.append(", forbidAutoPlay:");
                sb6.append(s2Var.N);
                sb6.append(", sessionId:");
                sb6.append(s2Var.P);
                sb6.append(", click_quality_info:");
                sb6.append(str12);
                sb6.append(", ad_ext_info:");
                sb6.append(str6);
                str8 = "MicroMsg.NetSceneAdClick";
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, sb6.toString());
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("viewId.length=");
                    sb7.append(str == null ? 0 : str.length());
                    sb7.append(", viewId=");
                    sb7.append(str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, sb7.toString());
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str8, th.toString());
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                str8 = "MicroMsg.NetSceneAdClick";
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            str8 = "MicroMsg.NetSceneAdClick";
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f370751e = u0Var;
        if (this.f370753g != null) {
            this.f370754h = java.lang.System.currentTimeMillis();
            ((he0.b5) this.f370753g).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAdClickCGI", "com.tencent.mm.feature.sns.listener.ReportAdClickListener$1");
            l44.z.t(this.f370752f, 4000001);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAdClickCGI", "com.tencent.mm.feature.sns.listener.ReportAdClickListener$1");
        }
        return mo9409x10f9447a(sVar, this.f370750d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1232;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAdClick", "netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - this.f370754h);
        if (i18 == 0 && i19 == 0) {
            z17 = true;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2044, 12);
            z17 = false;
        }
        i64.j0 j0Var = this.f370753g;
        if (j0Var != null) {
            ((he0.b5) j0Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adClickCGIFinish", "com.tencent.mm.feature.sns.listener.ReportAdClickListener$1");
            java.util.ArrayList arrayList = l44.z.f397961a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportTimelineAdClickCgiFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            i64.a aVar = this.f370752f;
            if (aVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportTimelineAdClickCgiFinish, params is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportTimelineAdClickCgiFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            } else {
                com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = aVar.f370585j;
                if (c11137xb05b06ad == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportTimelineAdClickCgiFinish, snsAdClick is null");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportTimelineAdClickCgiFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                } else {
                    int i27 = z17 ? 4000003 : 4000002;
                    try {
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportTimelineAdClickCgiFinish, eventId is " + i27 + ", exp is " + th6.toString());
                    }
                    if (l44.z.f397961a.contains(java.lang.Integer.valueOf(c11137xb05b06ad.f153002g))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", "reportTimelineAdClickCgiFinish, except current click pos, the pos is " + c11137xb05b06ad.f153002g);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportTimelineAdClickCgiFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    } else {
                        ca4.f fVar = new ca4.f();
                        fVar.m(i27);
                        fVar.o(aVar.f370586k);
                        fVar.c(aVar.f370587l);
                        fVar.g(currentTimeMillis);
                        fVar.p(aVar.f370588m);
                        fVar.n(aVar.f370589n);
                        fVar.q(aVar.f370590o);
                        a84.t0.a(fVar.a());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportTimelineAdClickCgiFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adClickCGIFinish", "com.tencent.mm.feature.sns.listener.ReportAdClickListener$1");
        }
        try {
            r45.t2 t2Var = (r45.t2) this.f370750d.f152244b.f152233a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAdClick", "resp=" + t2Var.f467606d + ", msg=" + t2Var.f467607e);
        } catch (java.lang.Exception unused) {
        }
        this.f370751e.mo815x76e0bfae(i18, i19, str, this);
    }
}
