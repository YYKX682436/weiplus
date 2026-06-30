package j74;

/* loaded from: classes4.dex */
public class b implements a84.r0 {

    /* renamed from: a, reason: collision with root package name */
    public long f379588a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f379589b;

    /* renamed from: c, reason: collision with root package name */
    public int f379590c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379591d;

    /* renamed from: e, reason: collision with root package name */
    public int f379592e;

    /* renamed from: f, reason: collision with root package name */
    public int f379593f;

    /* renamed from: g, reason: collision with root package name */
    public int f379594g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Long f379595h;

    /* renamed from: i, reason: collision with root package name */
    public int f379596i;

    public static a84.r0 b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4, boolean z17, boolean z18, android.view.View view, i64.b1 b1Var) {
        android.view.View e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        if (c17933xe8d1b226 == null || c17902x72cc1771 == null || c17903x3b438f4 == null || view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return null;
        }
        if (!c17933xe8d1b226.m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return null;
        }
        j74.b bVar = new j74.b();
        bVar.f379588a = c17933xe8d1b226.f68891x29d1292e;
        bVar.f379589b = ca4.c0.a(c17902x72cc1771.f38104xce64ddf1);
        bVar.f379590c = z17 ? 2 : 1;
        bVar.f379591d = c17903x3b438f4.f38172xd73c98cc;
        bVar.f379596i = z18 ? 2 : 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("computeAdOffsetScreenTop", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findCommentDetailAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            e17 = bVar.e(view, com.p314xaae8f345.mm.R.id.f564366p7);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findCommentDetailAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findTimelineAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            e17 = bVar.e(view, com.p314xaae8f345.mm.R.id.n9g);
            if (e17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17936xdec9f2b4) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findTimelineAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findTimelineAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
                e17 = view;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        }
        if (e17 != null) {
            int[] iArr = new int[2];
            e17.getLocationOnScreen(iArr);
            bVar.f379592e = iArr[1];
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("computeAdOffsetScreenTop", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("computeClickPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int width = view.getWidth();
        int height = view.getHeight();
        bVar.f379593f = iArr2[0] + (width / 2);
        bVar.f379594g = iArr2[1] + (height / 2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("computeClickPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        if (b1Var != null && c17933xe8d1b226.m70371x485d7() != null && c17933xe8d1b226.m70371x485d7().f39014x86965dde != null && c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 15) {
            bVar.f379595h = java.lang.Long.valueOf(b1Var.g(bVar.f379588a));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        return bVar;
    }

    public static a84.r0 c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, boolean z17, android.view.View view, i64.b1 b1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        if (c17933xe8d1b226 == null || view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return null;
        }
        try {
            if (!c17933xe8d1b226.m70377x3172ed()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
                return null;
            }
            a84.r0 b17 = b(c17933xe8d1b226, c17933xe8d1b226.m70346x10413e67(), c17933xe8d1b226.m70354x74235b3e(), (b1Var == null || b1Var.f370628j == 0) ? false : true, z17, view, b1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return b17;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return null;
        }
    }

    public final org.json.JSONObject a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("baseInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("snsid", java.lang.String.valueOf(this.f379588a));
            java.lang.String str = this.f379589b;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("uxinfo", str);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f379590c);
            java.lang.String str3 = this.f379591d;
            if (str3 != null) {
                str2 = str3;
            }
            jSONObject.put("adExtInfo", str2);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("baseInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        return jSONObject;
    }

    public final org.json.JSONObject d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("extInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("adOffSetTop", this.f379592e);
            jSONObject.put("clickPosX", this.f379593f);
            jSONObject.put("clickPosY", this.f379594g);
            java.lang.Long l17 = this.f379595h;
            if (l17 != null) {
                jSONObject.put("videoPlayTime", l17.longValue());
            }
            jSONObject.put("buttonType", this.f379596i);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("extInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findTargetUpperLevelView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0007, code lost:
    
        if (r5 != null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
    
        r2 = r5.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if ((r2 instanceof android.view.View) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r5 = (android.view.View) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r5.getId() != r6) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View e(android.view.View r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "findTargetUpperLevelView"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            if (r5 == 0) goto L1a
        L9:
            android.view.ViewParent r2 = r5.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L1a
            r5 = r2
            android.view.View r5 = (android.view.View) r5
            int r2 = r5.getId()
            if (r2 != r6) goto L9
        L1a:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j74.b.e(android.view.View, int):android.view.View");
    }

    @Override // a84.r0
    /* renamed from: getChannel */
    public java.lang.String mo650x69d8b8cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        return "timeline_ad_feedback_and_sns_button_click";
    }

    @Override // a84.r0
    public java.lang.String j() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            try {
                org.json.JSONObject a17 = a();
                a17.put("extInfo", d());
                str = a17.toString();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
                str = "{}";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return str;
        } catch (java.lang.Throwable unused2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return "";
        }
    }
}
