package i74;

/* loaded from: classes4.dex */
public class a implements i74.k {

    /* renamed from: a, reason: collision with root package name */
    public ca4.j f370988a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f370989b;

    /* renamed from: c, reason: collision with root package name */
    public int f370990c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370991d = "zh_CN";

    /* JADX WARN: Removed duplicated region for block: B:7:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a() {
        /*
            java.lang.String r0 = "FeedbackDataSupplier"
            java.lang.String r1 = "enableOpenPersonalizedAd called"
            java.lang.String r2 = "enableOpenPersonalizedAd"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            r4 = 0
            java.lang.Class<e42.e0> r5 = e42.e0.class
            i95.m r5 = i95.n0.c(r5)     // Catch: java.lang.Throwable -> L2e
            e42.e0 r5 = (e42.e0) r5     // Catch: java.lang.Throwable -> L2e
            e42.d0 r6 = e42.d0.clicfg_sns_ad_enable_open_personalize_in_feedback_android     // Catch: java.lang.Throwable -> L2e
            h62.d r5 = (h62.d) r5     // Catch: java.lang.Throwable -> L2e
            int r5 = r5.Ni(r6, r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            r6.append(r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L2c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L2c
            goto L41
        L2c:
            r1 = move-exception
            goto L30
        L2e:
            r1 = move-exception
            r5 = r4
        L30:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "enableOpenPersonalizedAd, exp="
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
        L41:
            if (r5 <= 0) goto L44
            r4 = 1
        L44:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i74.a.a():boolean");
    }

    public a84.r0 b(boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdActTypeData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f370989b;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdActTypeData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return null;
        }
        ca4.a aVar = new ca4.a(c17933xe8d1b226.m70375x338a8cc7(), z17 ? 2 : 1, i17, null, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdActTypeData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return aVar;
    }

    public final int c() {
        ca4.i iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdDelayDay", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        ca4.j jVar = this.f370988a;
        if (jVar == null || (iVar = jVar.f121485a) == null || (c17902x72cc1771 = iVar.f121473b) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FeedbackDataSupplier", "the data tag is null!");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d dVar = c17902x72cc1771.f38084x2725a301;
            if (dVar != null) {
                int i17 = dVar.f247488a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDelayDay", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                return i17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FeedbackDataSupplier", "the adUnlikeInfo is null in data tag!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDelayDay", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return 7;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        ca4.j jVar = this.f370988a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f370989b;
        if (jVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return null;
        }
        ca4.i iVar = jVar.f121485a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771 = iVar != null ? iVar.f121473b : null;
        if (c17933xe8d1b226 != null) {
            c17902x72cc1771 = c17933xe8d1b226.m70347x10413e67(this.f370990c);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return c17902x72cc1771;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 e() {
        ca4.i iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdXml", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        ca4.j jVar = this.f370988a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f370989b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4 = (jVar == null || (iVar = jVar.f121485a) == null) ? null : iVar.f121472a;
        if (c17903x3b438f4 == null && c17933xe8d1b226 != null) {
            c17903x3b438f4 = c17933xe8d1b226.m70354x74235b3e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdXml", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return c17903x3b438f4;
    }

    public android.content.Intent f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getComplaintIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        try {
            android.content.Intent h17 = h();
            if (h17 != null) {
                h17.putExtra("complaint_weapp", true);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                return h17;
            }
            android.content.Intent g17 = g();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return g17;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return null;
        }
    }

    public final android.content.Intent g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getComplaintNormalIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getComplaintUrl", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 e17 = e();
        java.lang.String str = "";
        if (e17 == null || (lVar = e17.f38173x6320bd96) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FeedbackDataSupplier", "there is no feedback info!!!");
        } else {
            java.util.List list = lVar.f247572a;
            if (a84.b0.b(list)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FeedbackDataSupplier", "there is no feedback item!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintUrl", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f370989b;
                if (!android.text.TextUtils.isEmpty(str) || c17933xe8d1b226 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintNormalIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                    return null;
                }
                try {
                    str = za4.z0.d(str, java.lang.String.format("snsid=%s", c17933xe8d1b226.m70371x485d7().Id), java.lang.String.format("aid=%s", c17933xe8d1b226.m70355xb5882a06()), java.lang.String.format("traceid=%s", c17933xe8d1b226.m70372xfe2dfcea()), java.lang.String.format("uin=%s", gm0.j1.b().j()));
                } catch (java.lang.Exception unused) {
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str);
                intent.putExtra("useJs", true);
                intent.putExtra("KPublisherId", "sns_" + ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
                intent.putExtra("pre_username", c17933xe8d1b226.f68896xdde069b);
                intent.putExtra("prePublishId", "sns_" + ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
                intent.putExtra("preUsername", c17933xe8d1b226.f68896xdde069b);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintNormalIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                return intent;
            }
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m mVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m) it.next();
                if (mVar != null && !android.text.TextUtils.isEmpty(mVar.f247593d)) {
                    str = mVar.f247593d;
                    break;
                }
            }
            if (android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FeedbackDataSupplier", "there is feedback item, but no url!!!");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintUrl", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f370989b;
        if (android.text.TextUtils.isEmpty(str)) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintNormalIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return null;
    }

    public final android.content.Intent h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getComplaintWeAppIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 e17 = e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 d17 = d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f370989b;
        if (e17 == null || android.text.TextUtils.isEmpty(e17.f38245x6d9e86e4) || android.text.TextUtils.isEmpty(e17.f38244x4b069933) || c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintWeAppIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return null;
        }
        java.lang.String T = ca4.z0.T(c17933xe8d1b226);
        java.lang.String m70355xb5882a06 = c17933xe8d1b226.m70355xb5882a06();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (m70355xb5882a06 == null) {
            m70355xb5882a06 = "";
        }
        java.lang.String m70372xfe2dfcea = c17933xe8d1b226.m70372xfe2dfcea();
        if (m70372xfe2dfcea == null) {
            m70372xfe2dfcea = "";
        }
        java.lang.String j17 = gm0.j1.b().j();
        if (j17 == null) {
            j17 = "";
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = e17.f38244x4b069933;
        java.lang.String str2 = d17 != null ? d17.f38104xce64ddf1 : "";
        intent.putExtra("appUserName", e17.f38245x6d9e86e4);
        za4.z0.c(str, "snsid=" + T, "aid=".concat(m70355xb5882a06), "traceid=".concat(m70372xfe2dfcea), "uin=".concat(j17));
        if (d17 != null) {
            str = ca4.m0.d(str, d17.f38087x22383189);
        }
        intent.putExtra("appPagePath", str);
        intent.putExtra("aId", m70355xb5882a06);
        intent.putExtra("sceneNote", T + ":" + str2 + ":" + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.sj() + ":" + java.lang.System.currentTimeMillis());
        intent.putExtra("uxInfo", str2);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f370990c == 0 ? 1045 : 1046);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintWeAppIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return intent;
    }

    public java.util.Map i(java.lang.String str) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        try {
            if ("ad_delay_interval_day".equals(str)) {
                arrayMap.put(str, java.lang.Integer.valueOf(c()));
            } else if ("reason_list".equals(str)) {
                arrayMap.put(str, m());
            } else if ("expand_title".equals(str)) {
                arrayMap.put(str, j());
            } else if ("special_prompt".equals(str)) {
                arrayMap.put(str, n());
            } else if ("is_special".equals(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 d17 = d();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                if (d17 != null) {
                    z17 = d17.f38094x6a99a254;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                    z17 = false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                arrayMap.put(str, java.lang.Boolean.valueOf(z17));
            } else if ("unlike_tag".equals(str)) {
                ca4.j jVar = this.f370988a;
                if (jVar != null) {
                    arrayMap.put(str, jVar);
                }
            } else if ("complaint_content".equals(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getComplaintContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 e17 = e();
                java.lang.String str2 = "";
                if (e17 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                } else if (android.text.TextUtils.isEmpty(e17.f38246x14159953)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                } else {
                    str2 = e17.f38246x14159953;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                }
                arrayMap.put(str, str2);
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FeedbackDataSupplier", "there is something wrong in getData. the key is " + str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return arrayMap;
    }

    public final java.lang.String j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExpandInsideTitle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 e17 = e();
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FeedbackDataSupplier", "the ad xml is null in data");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExpandInsideTitle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return "";
        }
        if ("zh_CN".equals(this.f370991d)) {
            java.lang.String str = e17.f38238x4c849d08;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExpandInsideTitle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return str;
        }
        if ("zh_TW".equals(this.f370991d) || "zh_HK".equals(this.f370991d)) {
            java.lang.String str2 = e17.f38240x4c849f20;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExpandInsideTitle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return str2;
        }
        java.lang.String str3 = e17.f38239x4c849d46;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExpandInsideTitle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return str3;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 k(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNetSceneSnsObjectOp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f370989b;
        ca4.j jVar = this.f370988a;
        if (c17933xe8d1b226 == null || jVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNetSceneSnsObjectOp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c();
        cVar.f247479e = 1;
        java.util.LinkedList linkedList = cVar.f247480f;
        if (i17 == 0) {
            linkedList.add(101);
        } else {
            linkedList.add(0);
        }
        cVar.f247481g = jVar.f121489e;
        if (i17 == 0) {
            cVar.f247482h = 0L;
        } else {
            cVar.f247482h = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(c17933xe8d1b226.f68891x29d1292e, 8, cVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNetSceneSnsObjectOp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return q2Var;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 l(java.util.Set set) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNoInterestingReasonNetSceneOp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 d17 = d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f370989b;
        ca4.j jVar = this.f370988a;
        if (jVar == null || c17933xe8d1b226 == null || d17 == null || d17.f38084x2725a301 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNoInterestingReasonNetSceneOp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c> a17 = d17.f38084x2725a301.a();
        if (a84.b0.e(a17)) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c cVar : a17) {
                if (cVar != null && set.contains(java.lang.Integer.valueOf(cVar.f247478d))) {
                    linkedList.add(java.lang.Integer.valueOf(cVar.f247478d));
                }
            }
        }
        if (a84.b0.b(linkedList)) {
            linkedList.add(10006);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c cVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c();
        cVar2.f247479e = linkedList.size();
        cVar2.f247480f.addAll(linkedList);
        cVar2.f247481g = jVar.f121489e;
        cVar2.f247482h = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(c17933xe8d1b226.f68891x29d1292e, 8, cVar2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNoInterestingReasonNetSceneOp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return q2Var;
    }

    public final java.util.List m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d dVar;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReasons", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 d17 = d();
        if (d17 != null && (dVar = d17.f38084x2725a301) != null) {
            java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c> a17 = dVar.a();
            if (a84.b0.e(a17)) {
                for (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c cVar : a17) {
                    int i17 = cVar.f247478d;
                    if (i17 != 10006) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLocalReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                        if ("zh_CN".equals(this.f370991d)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                            str = cVar.f247475a;
                        } else if ("zh_HK".equals(this.f370991d) || "zh_TW".equals(this.f370991d)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                            str = cVar.f247476b;
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                            str = cVar.f247477c;
                        }
                        arrayList.add(new j74.c(i17, str));
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReasons", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return arrayList;
    }

    public final java.lang.String n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSpecialData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 d17 = d();
        java.lang.String str = (d17 == null || d17.f38084x2725a301 == null) ? "" : "zh_CN".equals(this.f370991d) ? d17.f38084x2725a301.f247491d : ("zh_HK".equals(this.f370991d) || "zh_TW".equals(this.f370991d)) ? d17.f38084x2725a301.f247492e : d17.f38084x2725a301.f247493f;
        if (android.text.TextUtils.isEmpty(str)) {
            str = j();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSpecialData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return str;
    }

    public i74.j o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUIModel", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        i74.j jVar = new i74.j();
        jVar.f371035b = i74.e.a(d());
        jVar.f371034a = p() && a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f371035b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUIModel", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return jVar;
    }

    public boolean p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPersonalizedAdClose", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        boolean z17 = false;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 d17 = d();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPersonalizedAdClose", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            if (d17 != null) {
                boolean z18 = d17.f38096x9a2e5c1b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPersonalizedAdClose", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                z17 = z18;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPersonalizedAdClose", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPersonalizedAdClose", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return z17;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPersonalizedAdClose", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return false;
        }
    }

    public void q(ca4.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        try {
            this.f370988a = jVar;
            if (c17933xe8d1b226 != null) {
                this.f370989b = c17933xe8d1b226;
            } else if (jVar != null) {
                this.f370989b = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(jVar.f121487c);
            }
            this.f370991d = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FeedbackDataSupplier", "there is something wrong in updateData");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
    }
}
