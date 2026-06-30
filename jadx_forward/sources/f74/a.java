package f74;

/* loaded from: classes4.dex */
public class a implements e74.h, e74.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f341590a;

    public a(android.app.Activity activity) {
        this.f341590a = new java.lang.ref.WeakReference(activity);
    }

    @Override // e74.j
    public void a(int i17, java.lang.String str, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
        if (i17 == 0) {
            if (!android.text.TextUtils.isEmpty(str) && !a84.b0.b(list)) {
                c(str, list);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.TopicCardRequestAction", "the data is empty, or request failed!!! Do nothing!!");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
    }

    public void b(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
        if (c17933xe8d1b226 != null && c17933xe8d1b226.m70354x74235b3e() != null) {
            try {
                java.lang.String t07 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70347x10413e67 = c17933xe8d1b226.m70347x10413e67(i17);
                java.lang.String m70375x338a8cc7 = (m70347x10413e67 == null || !android.text.TextUtils.isEmpty(m70347x10413e67.f38104xce64ddf1)) ? c17933xe8d1b226.m70375x338a8cc7() : m70347x10413e67.f38104xce64ddf1;
                c17933xe8d1b226.m70354x74235b3e();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeRequestParam", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                r45.a3 a3Var = new r45.a3();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("acquireActionType", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("acquireActionType", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                a3Var.f451223d = 3;
                a3Var.f451224e = "";
                r45.a3[] a3VarArr = {a3Var};
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeRequestParam", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                if (android.text.TextUtils.isEmpty(t07) || android.text.TextUtils.isEmpty(m70375x338a8cc7)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.TopicCardRequestAction", "are you sure input param is valid???");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                } else {
                    new k64.r(t07, m70375x338a8cc7, a3VarArr).K(this);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
    }

    public final void c(java.lang.String str, java.util.List list) {
        h74.c cVar;
        java.lang.ref.WeakReference weakReference;
        g74.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResponseSuccess", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
        r45.a3 a3Var = (r45.a3) list.get(0);
        if (a3Var != null) {
            int i17 = a3Var.f451223d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("acquireActionType", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("acquireActionType", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
            if (i17 == 3 && !android.text.TextUtils.isEmpty(a3Var.f451224e)) {
                java.lang.String str2 = a3Var.f451224e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseResult", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                try {
                    java.lang.System.currentTimeMillis();
                    cVar = new h74.c();
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                    if (jSONObject.has("relationText")) {
                        cVar.f361040a = jSONObject.getString("relationText");
                    }
                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray("finderTopicResList");
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i18 = 0; i18 < length; i18++) {
                            h74.b bVar = new h74.b();
                            org.json.JSONObject jSONObject2 = (org.json.JSONObject) optJSONArray.get(i18);
                            bVar.f361033a = jSONObject2.optString("avatar");
                            bVar.f361034b = jSONObject2.optString("nickname");
                            bVar.f361035c = jSONObject2.optString("tag");
                            bVar.f361036d = jSONObject2.optString("desc");
                            bVar.f361037e = jSONObject2.optString("barBgColor");
                            bVar.f361038f = jSONObject2.optString("duration");
                            org.json.JSONObject optJSONObject = jSONObject2.optJSONObject("imageInfo");
                            if (optJSONObject != null) {
                                h74.a aVar2 = new h74.a();
                                bVar.f361039g = aVar2;
                                aVar2.f361027a = optJSONObject.optString("mid", "");
                                bVar.f361039g.f361028b = optJSONObject.optString("url", "");
                                bVar.f361039g.f361029c = optJSONObject.optString("thumb");
                                bVar.f361039g.f361030d = optJSONObject.optInt("width", 0);
                                bVar.f361039g.f361031e = optJSONObject.optInt("height", 0);
                                bVar.f361039g.f361032f = optJSONObject.optInt("totalSize", 0);
                            }
                            ((java.util.ArrayList) cVar.f361041b).add(bVar);
                        }
                    }
                    java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseResult", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                } catch (org.json.JSONException unused) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseResult", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                    cVar = null;
                }
                if (cVar != null && (weakReference = this.f341590a) != null) {
                    cVar.m133005x9616526c();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2117x7ea5603f.p2118x503cc4b4.C17752x4af911ea a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2117x7ea5603f.p2118x503cc4b4.C17752x4af911ea.a((android.app.Activity) weakReference.get());
                    if (a17 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notify", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
                        g74.b bVar2 = a17.f244722d;
                        if (bVar2 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notify", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                            if (android.text.TextUtils.isEmpty(str)) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notify", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                            } else {
                                java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) ((java.util.HashMap) bVar2.f350878a).get(str);
                                if (weakReference2 != null && (aVar = (g74.a) weakReference2.get()) != null) {
                                    w74.c cVar2 = (w74.c) aVar;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
                                    try {
                                        cVar2.c(str, cVar);
                                    } catch (java.lang.Throwable unused2) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.TopicCardDynamic", "the on result failed!");
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notify", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notify", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResponseSuccess", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
    }
}
