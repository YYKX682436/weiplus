package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class n2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f246015d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f246016e;

    /* renamed from: f, reason: collision with root package name */
    public final int f246017f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.l76 f246018g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f246019h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f246020i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f246021m;

    /* renamed from: n, reason: collision with root package name */
    public final int f246022n;

    /* renamed from: o, reason: collision with root package name */
    public final ta4.x0 f246023o;

    /* renamed from: p, reason: collision with root package name */
    public int f246024p;

    public n2(r45.l76 l76Var, java.lang.String str, int i17) {
        java.lang.String str2;
        int i18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.f86();
        lVar.f152198b = new r45.g86();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnscomment";
        lVar.f152200d = 213;
        lVar.f152201e = 100;
        lVar.f152202f = 1000000100;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f246015d = a17;
        r45.f86 f86Var = (r45.f86) a17.f152243a.f152217a;
        f86Var.f455633d = l76Var;
        r45.k76 k76Var = l76Var.f460738f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildClientCtxReportBuffer", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        try {
            cl0.g gVar = new cl0.g();
            gVar.o("comment_scene", i17 == 0 ? 1 : i17 == 1 ? 2 : 0);
            if (k76Var != null) {
                int i19 = k76Var.f459999o;
                if (i19 > 0) {
                    gVar.o("replytoCommentId", i19);
                } else {
                    long j17 = k76Var.f460002r;
                    if (j17 > 0) {
                        gVar.p("replytoCommentId", j17);
                    }
                }
            }
            str2 = gVar.toString().replace(",", ";");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildClientCtxReportBuffer", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        } catch (cl0.f unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildClientCtxReportBuffer", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
            str2 = "";
        }
        f86Var.f455638i = str2;
        java.util.HashMap hashMap = ya4.b.f542141a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentState", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
        java.util.HashMap hashMap2 = ya4.b.f542141a;
        ya4.a aVar = (ya4.a) hashMap2.get(2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentState", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
        if (aVar != null) {
            int i27 = aVar.f542139a;
            int i28 = i27 & 4;
            if (i28 == 0 && (i27 & 8) == 0) {
                int i29 = i27 & 16;
                if (i29 == 0 && (i27 & 32) == 0) {
                    i18 = 0;
                } else {
                    i18 = i29 != 0 ? 4 : 5;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsComment", "has paste similar change flag, %d", java.lang.Integer.valueOf(i18));
                }
            } else {
                i18 = i28 != 0 ? 2 : 3;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsComment", "has paste fully flag, %d", java.lang.Integer.valueOf(i18));
            }
            f86Var.f455636g = ca4.z0.i(i18, aVar.f542140b);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetStateByScene", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
            hashMap2.remove(2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetStateByScene", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
        }
        int i37 = l76Var.f460738f.f459995h;
        this.f246017f = i37;
        this.f246018g = l76Var;
        this.f246022n = i17;
        f86Var.f455634e = str;
        this.f246016e = str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.NetSceneSnsComment", "from:" + l76Var.f460738f.f459991d + " to:" + l76Var.f460738f.f459992e + " type:" + l76Var.f460738f.f459995h, new java.lang.Object[0]);
        this.f246023o = ta4.x0.f498384j.a();
        if (i37 == 1) {
            yc4.b0 b0Var = yc4.b0.f542372a;
            java.lang.String feedId = ca4.z0.t0(l76Var.f460736d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markFeedLike", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
            yc4.v vVar = yc4.b0.f542375d;
            if (vVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFeedLikeMap", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFeedLikeMap", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
                java.util.HashMap hashMap3 = vVar.f542410d;
                if (hashMap3 != null) {
                    java.lang.Integer num = (java.lang.Integer) hashMap3.get(feedId);
                    hashMap3.put(feedId, java.lang.Integer.valueOf((num == null ? 0 : num).intValue() + 1));
                    java.util.Objects.toString(hashMap3.get(feedId));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markFeedLike", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                    return;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markFeedLike", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            return;
        }
        if (i37 == 2) {
            yc4.b0 b0Var2 = yc4.b0.f542372a;
            java.lang.String feedId2 = ca4.z0.t0(l76Var.f460736d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markFeedComment", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId2, "feedId");
            yc4.v vVar2 = yc4.b0.f542375d;
            if (vVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFeedCommentMap", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFeedCommentMap", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
                java.util.HashMap hashMap4 = vVar2.f542411e;
                if (hashMap4 != null) {
                    java.lang.Integer num2 = (java.lang.Integer) hashMap4.get(feedId2);
                    hashMap4.put(feedId2, java.lang.Integer.valueOf((num2 == null ? 0 : num2).intValue() + 1));
                    java.util.Objects.toString(hashMap4.get(feedId2));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markFeedComment", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                    return;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markFeedComment", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        }
    }

    public final void H(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("mergeGroupData", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b72 = this.f246021m;
        if (c19806x4c372b72 != null) {
            c19806x4c372b7.f38973xc1b67df0 = c19806x4c372b72.f38973xc1b67df0;
            c19806x4c372b7.f38974x1f09e39d = c19806x4c372b72.f38974x1f09e39d;
            c19806x4c372b7.f38972xbc148b5d = c19806x4c372b72.f38972xbc148b5d;
            c19806x4c372b7.f38971xffe88d2 = c19806x4c372b72.f38971xffe88d2;
            c19806x4c372b7.f38961xa0d74df2 = c19806x4c372b72.f38961xa0d74df2;
            c19806x4c372b7.f38960xc6d7bd1d = c19806x4c372b72.f38960xc6d7bd1d;
            c19806x4c372b7.f38959xf984e1dd = c19806x4c372b72.f38959xf984e1dd;
            c19806x4c372b7.f38958xbe522252 = c19806x4c372b72.f38958xbe522252;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mergeGroupData", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
    }

    public final void I(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report27790", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        ta4.x0 x0Var = this.f246023o;
        if (x0Var != null) {
            java.lang.String valueOf = java.lang.String.valueOf(i17);
            x0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCommentId", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf, "<set-?>");
            x0Var.f498388c = valueOf;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCommentId", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
            x0Var.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report27790", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
        r45.l76 l76Var = this.f246018g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = Fj.W0(l76Var.f460736d);
        if (W0 == null && (y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(l76Var.f460736d)) != null) {
            W0 = y07.m70298xd15b2ed8();
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f246015d;
        if (W0 != null) {
            try {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(W0.f68881x4c58c87d);
                r45.cu5 cu5Var = c19806x4c372b7.f38991x89eed8ab;
                if (cu5Var != null && cu5Var.f453375g) {
                    r45.u96 u96Var = (r45.u96) new r45.u96().mo11468x92b714fd(c19806x4c372b7.f38991x89eed8ab.f453374f.f273689a);
                    r45.f86 f86Var = (r45.f86) oVar.f152243a.f152217a;
                    r45.xb5 xb5Var = u96Var.f468695h;
                    if (xb5Var != null) {
                        java.lang.String format = java.lang.String.format(java.util.Locale.US, "preloadLayerId=%d&preloadExpId=%d", java.lang.Integer.valueOf(xb5Var.f471478d), java.lang.Integer.valueOf(u96Var.f468695h.f471479e));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsComment", "doScene(sight_autodownload) snsStatExt:%s", format);
                        r45.du5 du5Var = new r45.du5();
                        du5Var.f454289d = format;
                        du5Var.f454290e = true;
                        f86Var.f455635f = du5Var;
                    }
                }
                this.f246021m = c19806x4c372b7;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsComment", e17, "", new java.lang.Object[0]);
            }
        }
        this.f246020i = W0;
        this.f246019h = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, oVar, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        return 213;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0240 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r17, int r18, int r19, java.lang.String r20, com.p314xaae8f345.mm.p971x6de15a2e.v0 r21, byte[] r22) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n2.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
