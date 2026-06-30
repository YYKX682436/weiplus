package q74;

/* loaded from: classes4.dex */
public class b0 extends a84.s0 {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f441942b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f441943c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f441944d;

    /* renamed from: e, reason: collision with root package name */
    public final int f441945e;

    /* renamed from: f, reason: collision with root package name */
    public int f441946f;

    /* renamed from: g, reason: collision with root package name */
    public int f441947g;

    /* renamed from: h, reason: collision with root package name */
    public int f441948h;

    /* renamed from: i, reason: collision with root package name */
    public int f441949i;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f441941a = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public int f441950j = -1;

    public b0(int i17) {
        this.f441945e = i17;
    }

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        try {
            jSONObject.putOpt("snsid", this.f441942b);
            jSONObject.putOpt("uxinfo", this.f441943c);
            jSONObject.putOpt("adExtInfo", this.f441944d);
            jSONObject.putOpt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f441945e));
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONObject.putOpt("reportItemList", jSONArray);
            c(jSONArray);
            jSONObject.put("sliderCardStyle", this.f441947g);
            jSONObject.put("slideJumpCount", this.f441948h);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    public final void c(org.json.JSONArray jSONArray) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillExtJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        java.util.List list = this.f441941a;
        if (a84.b0.b(list)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            q74.a0 a0Var = (q74.a0) it.next();
            if (a0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData$ItemData");
                try {
                    jSONObject = new org.json.JSONObject();
                    jSONObject.putOpt(ya.b.f77479x42930b2, java.lang.Integer.valueOf(a0Var.f441921a));
                    jSONObject.putOpt("mediaType", java.lang.Integer.valueOf(a0Var.f441922b));
                    jSONObject.putOpt("hasBorder", java.lang.Integer.valueOf(a0Var.f441933m));
                    jSONObject.putOpt(dm.n.f67499xab3e7a9, java.lang.Integer.valueOf(a0Var.f441923c));
                    jSONObject.putOpt("autoSlideInCount", java.lang.Integer.valueOf(a0Var.f441924d));
                    jSONObject.putOpt("clickCount", java.lang.Integer.valueOf(a0Var.f441925e));
                    jSONObject.putOpt("btnClickCount", java.lang.Integer.valueOf(a0Var.f441926f));
                    jSONObject.putOpt("productClickCount", java.lang.Integer.valueOf(a0Var.f441934n));
                    jSONObject.putOpt("playCount", java.lang.Integer.valueOf(a0Var.f441927g));
                    jSONObject.putOpt("finishPlayCount", java.lang.Integer.valueOf(a0Var.f441928h));
                    jSONObject.putOpt("playTotalTime", java.lang.Integer.valueOf(a0Var.f441929i + a0Var.f441932l));
                    jSONObject.putOpt("maxPlayTime", java.lang.Integer.valueOf(a0Var.f441928h > 0 ? a0Var.f441931k : a0Var.f441930j));
                    jSONObject.putOpt("videoTotalTime", java.lang.Integer.valueOf(a0Var.f441931k));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData$ItemData");
                } catch (java.lang.Throwable unused) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData$ItemData");
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    public q74.a0 d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        int i18 = this.f441946f;
        if (i18 <= 4) {
            i17 %= i18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isIdxValid", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        java.util.List list = this.f441941a;
        boolean z17 = i17 >= 0 && i17 < ((java.util.ArrayList) list).size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isIdxValid", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            return null;
        }
        q74.a0 a0Var = (q74.a0) ((java.util.ArrayList) list).get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        return a0Var;
    }

    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSlideJumpSuccess", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        this.f441948h++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardAdChannelData", "onSlideJumpSuccess, total=" + this.f441948h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSlideJumpSuccess", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    public void f(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, s34.a1 a1Var) {
        java.util.List<s34.x0> list;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardAdChannelData", "the sns info is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            return;
        }
        java.lang.String T = ca4.z0.T(c17933xe8d1b226);
        if (!android.text.TextUtils.isEmpty(this.f441942b) && this.f441942b.equals(T)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardAdChannelData", "the new sns id is same as the old one!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsId", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (T == null) {
            T = "";
        }
        this.f441942b = T;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsId", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        if (c17933xe8d1b226.m70347x10413e67(i17) != null) {
            java.lang.String m70375x338a8cc7 = c17933xe8d1b226.m70375x338a8cc7();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            if (m70375x338a8cc7 == null) {
                m70375x338a8cc7 = "";
            }
            this.f441943c = m70375x338a8cc7;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        }
        java.lang.String str = c17933xe8d1b226.m70354x74235b3e().f38172xd73c98cc;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdExtInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        this.f441944d = str != null ? str : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdExtInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        java.util.List list2 = this.f441941a;
        ((java.util.ArrayList) list2).clear();
        if (a1Var != null && (list = a1Var.f76695x5800ff2c) != null) {
            int size = list.size();
            this.f441946f = a1Var.f484097a;
            for (int i18 = 0; i18 < size; i18++) {
                int i19 = this.f441946f;
                if (i19 <= 4 && i18 == i19) {
                    break;
                }
                s34.x0 x0Var = a1Var.f76695x5800ff2c.get(i18);
                q74.a0 a0Var = new q74.a0();
                a0Var.f441921a = i18;
                ((java.util.ArrayList) list2).add(a0Var);
                if (x0Var != null) {
                    a0Var.f441922b = x0Var.a() ? 2 : 1;
                    a0Var.f441933m = 0;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x0Var.f76731x5a9c86a6) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x0Var.f76728xfdc65d28)) {
                        a0Var.f441933m = 1;
                    }
                }
            }
        }
        if (a1Var == null || a1Var.f76694x80bfd259 == null || !c17933xe8d1b226.m70410x5869fcda()) {
            this.f441947g = 0;
        } else {
            this.f441947g = 1;
        }
        this.f441949i = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    public void g(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemDataClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        q74.a0 d17 = d(i17);
        if (d17 != null) {
            d17.f441925e++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemDataClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    @Override // a84.r0
    /* renamed from: getChannel */
    public java.lang.String mo650x69d8b8cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        return "sns_ad_slider_card_report";
    }

    public void h(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemDataExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        if (i17 == this.f441950j) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemDataExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            return;
        }
        this.f441950j = i17;
        q74.a0 d17 = d(i17);
        if (d17 != null) {
            d17.f441923c++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemDataExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    public void i(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemDataFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        q74.a0 d17 = d(i17);
        if (d17 != null) {
            d17.f441928h++;
            d17.f441929i += d17.f441931k;
            d17.f441932l = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemDataFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    @Override // a84.s0, a84.r0
    public java.lang.String j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        java.lang.String j17 = super.j();
        java.util.List list = this.f441941a;
        if (list != null) {
            ((java.util.ArrayList) list).clear();
        }
        this.f441942b = "";
        this.f441948h = 0;
        this.f441947g = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        return j17;
    }

    public void k(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        q74.a0 d17 = d(i17);
        if (d17 != null) {
            if (i18 >= d17.f441932l) {
                d17.f441932l = i18;
            }
            if (d17.f441930j < i18) {
                d17.f441930j = i18;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    public void l(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemDataVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        q74.a0 d17 = d(i17);
        if (d17 != null) {
            d17.f441931k = i18;
            d17.f441929i += d17.f441932l;
            d17.f441932l = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemDataVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }
}
