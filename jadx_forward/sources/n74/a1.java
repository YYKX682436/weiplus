package n74;

/* loaded from: classes4.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n74.b1 f416834f;

    public a1(n74.b1 b1Var, java.lang.String str, java.lang.String str2) {
        this.f416834f = b1Var;
        this.f416832d = str;
        this.f416833e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2 = this.f416832d;
        n74.b1 b1Var = this.f416834f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback$2");
        try {
            n74.b1.b(b1Var, str2);
        } catch (java.lang.Throwable th6) {
            th = th6;
            str = "run";
        }
        if (n74.b1.a(b1Var) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicDataReqHelper", "adInfo is null, can not update AdInfo, snsId = " + str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback$2");
            return;
        }
        ca4.b bVar = new ca4.b();
        java.util.LinkedList linkedList = bVar.f121355d;
        str = "run";
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.f416833e);
            if (jSONObject.has("WordingComplexString")) {
                bVar.f121358g = jSONObject.optString("WordingComplexString");
            }
            if (jSONObject.has("WordingComplexExchangeValue")) {
                bVar.f121359h = jSONObject.optInt("WordingComplexExchangeValue");
            }
            if (jSONObject.has("WordingLink")) {
                bVar.f121354c = jSONObject.optString("WordingLink");
            } else {
                bVar.f121354c = null;
            }
            if (jSONObject.has("WordingType")) {
                int optInt = jSONObject.optInt("WordingType");
                bVar.f121352a = optInt;
                if (optInt == com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771.f38039x1568bf40) {
                    if (jSONObject.has("UserNameList")) {
                        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("UserNameList");
                        linkedList.clear();
                        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                            linkedList.add(optJSONArray.optString(i17));
                        }
                    } else {
                        linkedList.clear();
                    }
                    if (jSONObject.has("WordingRepAndroid")) {
                        java.lang.String optString = jSONObject.optString("WordingRepAndroid");
                        boolean z17 = optString.indexOf("%s") >= 0;
                        int indexOf = optString.indexOf("%");
                        int lastIndexOf = optString.lastIndexOf("%");
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && z17 && indexOf == lastIndexOf) {
                            bVar.f121353b = optString;
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f121353b)) {
                            java.lang.String str3 = "";
                            java.util.Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                java.lang.String str4 = (java.lang.String) it.next();
                                com.p314xaae8f345.mm.p2621x8fb0427b.z3 f07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.pj()).f0(str4);
                                if (f07 != null) {
                                    java.lang.String g27 = f07.g2();
                                    str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g27) ? str3 + str4 : str3 + g27;
                                } else {
                                    str3 = str3 + str4;
                                }
                                if (linkedList.getLast() != str4) {
                                    str3 = str3 + ",";
                                }
                            }
                            bVar.f121356e = str3;
                            bVar.f121357f = java.lang.String.format(bVar.f121353b, str3);
                        }
                    } else {
                        n74.b1.c(b1Var, bVar);
                    }
                } else if (optInt == com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771.f38038xeaf0f4df && jSONObject.has("Wording")) {
                    bVar.f121353b = jSONObject.optString("Wording");
                } else {
                    n74.b1.c(b1Var, bVar);
                }
            } else {
                n74.b1.c(b1Var, bVar);
            }
            n74.b1.d(b1Var, bVar);
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicDataReqHelper", th.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback$2");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback$2");
    }
}
