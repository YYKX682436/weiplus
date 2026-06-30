package w74;

/* loaded from: classes4.dex */
public class b extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f525050a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f525051b;

    /* renamed from: c, reason: collision with root package name */
    public final int f525052c;

    /* renamed from: d, reason: collision with root package name */
    public int f525053d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f525054e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f525055f = -1;

    public b(int i17) {
        this.f525052c = i17;
    }

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        try {
            jSONObject.putOpt("snsid", this.f525050a);
            jSONObject.putOpt("uxinfo", this.f525051b);
            jSONObject.putOpt("adExtInfo", null);
            jSONObject.putOpt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f525052c));
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        try {
            jSONObject.putOpt("infoBarClickCount", java.lang.Integer.valueOf(this.f525053d));
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONObject.putOpt("reportItemList", jSONArray);
            c(jSONArray);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
    }

    public final void c(org.json.JSONArray jSONArray) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillExtJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        java.util.List list = this.f525054e;
        if (a84.b0.b(list)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            w74.a aVar = (w74.a) it.next();
            if (aVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData$ItemData");
                try {
                    jSONObject = new org.json.JSONObject();
                    jSONObject.putOpt(ya.b.f77479x42930b2, java.lang.Integer.valueOf(aVar.f525039a));
                    jSONObject.putOpt("mediaType", java.lang.Integer.valueOf(aVar.f525040b));
                    java.lang.String str = aVar.f525048j;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.putOpt("finderType", str);
                    jSONObject.putOpt(dm.n.f67499xab3e7a9, java.lang.Integer.valueOf(aVar.f525041c));
                    jSONObject.putOpt("clickCount", java.lang.Integer.valueOf(aVar.f525042d));
                    jSONObject.putOpt("playCount", java.lang.Integer.valueOf(aVar.f525043e));
                    jSONObject.putOpt("finishPlayCount", java.lang.Integer.valueOf(aVar.f525044f));
                    jSONObject.putOpt("playTotalTime", java.lang.Integer.valueOf(aVar.f525045g + aVar.f525049k));
                    jSONObject.putOpt("maxPlayTime", java.lang.Integer.valueOf(aVar.f525044f > 0 ? aVar.f525047i : aVar.f525046h));
                    jSONObject.putOpt("videoTotalTime", java.lang.Integer.valueOf(aVar.f525047i));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData$ItemData");
                } catch (java.lang.Throwable unused) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData$ItemData");
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
    }

    public w74.a d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isIdxValid", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        java.util.List list = this.f525054e;
        boolean z17 = i17 >= 0 && i17 < ((java.util.ArrayList) list).size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isIdxValid", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            return null;
        }
        w74.a aVar = (w74.a) ((java.util.ArrayList) list).get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        return aVar;
    }

    public void e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, s34.h0 h0Var) {
        java.util.List list;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdChannelData", "the sns info is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            return;
        }
        java.lang.String T = ca4.z0.T(c17933xe8d1b226);
        if (!android.text.TextUtils.isEmpty(this.f525050a) && this.f525050a.equals(T)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdChannelData", "the new sns id is same as the old one!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsId", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (T == null) {
            T = "";
        }
        this.f525050a = T;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsId", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        if (c17933xe8d1b226.m70347x10413e67(i17) != null) {
            java.lang.String m70375x338a8cc7 = c17933xe8d1b226.m70375x338a8cc7();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            if (m70375x338a8cc7 == null) {
                m70375x338a8cc7 = "";
            }
            this.f525051b = m70375x338a8cc7;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        }
        java.util.List list2 = this.f525054e;
        ((java.util.ArrayList) list2).clear();
        if (h0Var != null && (list = h0Var.f484189f) != null) {
            int size = ((java.util.ArrayList) list).size();
            for (int i18 = 0; i18 < size; i18++) {
                s34.i0 i0Var = (s34.i0) ((java.util.ArrayList) h0Var.f484189f).get(i18);
                w74.a aVar = new w74.a();
                aVar.f525039a = i18;
                ((java.util.ArrayList) list2).add(aVar);
                if (i0Var != null) {
                    aVar.f525040b = i0Var.a() ? 2 : 1;
                    java.lang.String str = i0Var.f484201j;
                    if (str == null) {
                        str = "";
                    }
                    aVar.f525048j = str;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
    }

    public void f(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemDataVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        w74.a d17 = d(i17);
        if (d17 != null) {
            d17.f525047i = i18;
            d17.f525045g += d17.f525049k;
            d17.f525049k = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemDataVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
    }

    @Override // a84.r0
    /* renamed from: getChannel */
    public java.lang.String mo650x69d8b8cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        return "sns_ad_finder_topic_report";
    }

    @Override // a84.s0, a84.r0
    public java.lang.String j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContent", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        java.lang.String j17 = super.j();
        java.util.List list = this.f525054e;
        if (list != null) {
            ((java.util.ArrayList) list).clear();
        }
        this.f525050a = "";
        this.f525053d = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        return j17;
    }
}
