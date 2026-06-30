package s74;

/* loaded from: classes4.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public static final s74.y2 f486142a = new s74.y2();

    public static final java.lang.String c(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONObject jSONObject2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("mergeAttr", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
        if (jSONObject != null) {
            if (!(str == null || str.length() == 0)) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                try {
                    jSONObject2 = new org.json.JSONObject(str);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicInfoMerger", "parse json exp=" + e17);
                    jSONObject2 = null;
                }
                if (jSONObject2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicInfoMerger", "dynamicInfoJson==null");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mergeAttr", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
                    return str;
                }
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("layout");
                org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("animations");
                if (optJSONArray == null && optJSONArray2 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mergeAttr", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
                    return str;
                }
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                java.util.HashMap hashMap = new java.util.HashMap();
                s74.y2 y2Var = f486142a;
                y2Var.b(jSONObject2, hashMap);
                long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                y2Var.a(hashMap, optJSONArray, dm.i4.f66865x76d1ec5a);
                y2Var.a(hashMap, optJSONArray2, "animationId");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicInfoMerger", "mergeAttr, parseJSON cost=" + (currentTimeMillis2 - currentTimeMillis) + ", flattenJson cost=" + (currentTimeMillis3 - currentTimeMillis2) + ", totalCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                java.lang.String jSONObject3 = jSONObject2.toString();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mergeAttr", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
                return jSONObject3;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicInfoMerger", "param null");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mergeAttr", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
        return str;
    }

    public final void a(java.util.HashMap hashMap, org.json.JSONArray jSONArray, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doMerge", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
        if (jSONArray == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doMerge", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj = jSONArray.get(i17);
            if (obj instanceof org.json.JSONObject) {
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                java.lang.String optString = jSONObject.optString(str);
                if (optString == null || optString.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DynamicInfoMerger", "id empty in attrJSON, idx=" + i17);
                } else {
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) hashMap.get(optString);
                    if (jSONObject2 != null) {
                        f486142a.d(jSONObject2, jSONObject);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DynamicInfoMerger", "find no targetJSON, id=" + optString);
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DynamicInfoMerger", "doMerge, key=" + str + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doMerge", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
    }

    public final void b(org.json.JSONObject jSONObject, java.util.HashMap hashMap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("flattenJSONData", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
        if (jSONObject == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("flattenJSONData", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIdValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
        java.lang.String optString = jSONObject.optString(dm.i4.f66865x76d1ec5a);
        boolean z17 = true;
        if (optString == null || optString.length() == 0) {
            optString = jSONObject.optString("animationId");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIdValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
        if (optString != null && optString.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            hashMap.put(optString, jSONObject);
        }
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.Object opt = jSONObject.opt(keys.next());
            if (opt instanceof org.json.JSONObject) {
                b((org.json.JSONObject) opt, hashMap);
            } else if (opt instanceof org.json.JSONArray) {
                org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.lang.Object obj = jSONArray.get(i17);
                    if (obj instanceof org.json.JSONObject) {
                        b((org.json.JSONObject) obj, hashMap);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("flattenJSONData", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
    }

    public final void d(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("mergeJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
        if (jSONObject == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mergeJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
            return;
        }
        if (jSONObject2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mergeJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
            return;
        }
        java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next, dm.i4.f66865x76d1ec5a) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next, "animationId")) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mergeJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
    }
}
