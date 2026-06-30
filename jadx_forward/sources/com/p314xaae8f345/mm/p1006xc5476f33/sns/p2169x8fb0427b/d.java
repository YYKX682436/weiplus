package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f247488a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f247489b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f247490c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f247491d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f247492e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f247493f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f247494g;

    public d() {
        this.f247488a = 0;
        this.f247489b = new java.util.ArrayList();
        this.f247490c = new java.util.HashMap();
        this.f247491d = "";
        this.f247492e = "";
        this.f247493f = "";
        this.f247494g = false;
    }

    public java.util.List a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReasonList", "com.tencent.mm.plugin.sns.storage.ADInfo$AdUnlikeInfo");
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (!"zh_CN".equals(f17) && !"zh_TW".equals(f17) && !"zh_HK".equals(f17)) {
            f17 = "en";
        }
        java.util.Map map = this.f247490c;
        if (!((java.util.HashMap) map).containsKey(f17)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) this.f247489b).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c) it.next();
                if ("zh_CN".equals(f17) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f247475a)) {
                    arrayList.add(cVar);
                } else if (("zh_TW".equals(f17) || "zh_HK".equals(f17)) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f247476b)) {
                    arrayList.add(cVar);
                } else if ("en".equals(f17) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f247477c)) {
                    arrayList.add(cVar);
                }
            }
            ((java.util.HashMap) map).put(f17, arrayList);
        }
        java.util.List list = (java.util.List) ((java.util.HashMap) map).get(f17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReasonList", "com.tencent.mm.plugin.sns.storage.ADInfo$AdUnlikeInfo");
        return list;
    }

    public d(java.util.Map map, java.lang.String str) {
        this.f247488a = 0;
        this.f247489b = new java.util.ArrayList();
        this.f247490c = new java.util.HashMap();
        this.f247491d = "";
        this.f247492e = "";
        this.f247493f = "";
        this.f247494g = false;
        java.lang.String str2 = str + ".dislikeInfo.ReasonList";
        int i17 = 0;
        while (true) {
            java.lang.String str3 = str2 + ".Reason";
            if (i17 > 0) {
                str3 = str3 + i17;
            }
            if (map.get(str3 + ".ReasonId") == null) {
                break;
            }
            java.util.List list = this.f247489b;
            java.lang.String str4 = (java.lang.String) map.get(str3 + ".Wording.zh");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            str4 = str4 == null ? "" : str4;
            java.lang.String str5 = (java.lang.String) map.get(str3 + ".Wording.tw");
            str5 = str5 == null ? "" : str5;
            java.lang.String str6 = (java.lang.String) map.get(str3 + ".Wording.en");
            if (str6 == null) {
                str6 = "";
            }
            list.add(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c(str4, str5, str6, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str3 + ".ReasonId"), 0)));
            i17++;
        }
        this.f247488a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".dislikeInfo.unReceiveAdInterval"), 0);
        java.lang.String str7 = (java.lang.String) map.get(str + ".dislikeInfo.forbidClickReason.zh");
        this.f247491d = str7 == null ? "" : str7;
        java.lang.String str8 = (java.lang.String) map.get(str + ".dislikeInfo.forbidClickReason.tw");
        this.f247492e = str8 == null ? "" : str8;
        java.lang.String str9 = (java.lang.String) map.get(str + ".dislikeInfo.forbidClickReason.en");
        this.f247493f = str9 != null ? str9 : "";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(".dislikeInfo.useNewStyle");
        this.f247494g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(sb6.toString()), 0) == 1;
    }
}
