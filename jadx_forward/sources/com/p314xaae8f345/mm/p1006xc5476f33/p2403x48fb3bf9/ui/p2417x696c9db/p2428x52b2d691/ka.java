package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes15.dex */
public final class ka implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267852e;

    public ka(nw4.k kVar, nw4.y2 y2Var) {
        this.f267851d = kVar;
        this.f267852e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p2845xc516c4b6.biz.C23123x3000e282 m84935xe58ed802;
        com.p314xaae8f345.p2845xc516c4b6.biz.C23122xb15aa5c0 m84934xad8b6040;
        com.p314xaae8f345.p2845xc516c4b6.biz.C23125xcdbbe59f m84937x760b601f;
        com.p314xaae8f345.p2845xc516c4b6.biz.C23121x65a553b4 m84933x73c2ae34;
        java.lang.String m84936xfb84c446;
        java.lang.String m84932x1046a12c;
        java.util.List<? extends java.lang.Object> list = (java.util.List) obj;
        nw4.k kVar = this.f267851d;
        nw4.y2 y2Var = this.f267852e;
        if (list == null) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
            return;
        }
        try {
            com.p314xaae8f345.p2845xc516c4b6.biz.C23124x3ab2f093 m84997xb5cc5768 = com.p314xaae8f345.p2845xc516c4b6.biz.C23124x3ab2f093.INSTANCE.m84997xb5cc5768(list);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.Long m84992x178b2d42 = m84997xb5cc5768.m84992x178b2d42();
            if (m84992x178b2d42 != null) {
                hashMap.put("curIdentityType", java.lang.Long.valueOf(m84992x178b2d42.longValue()));
            }
            java.lang.String m84991x17881893 = m84997xb5cc5768.m84991x17881893();
            if (m84991x17881893 != null) {
                hashMap.put("curIdentityName", m84991x17881893);
            }
            java.util.List<com.p314xaae8f345.p2845xc516c4b6.biz.C23120x8ba1b4d6> m84990xf88d84c7 = m84997xb5cc5768.m84990xf88d84c7();
            if (m84990xf88d84c7 != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (com.p314xaae8f345.p2845xc516c4b6.biz.C23120x8ba1b4d6 c23120x8ba1b4d6 : m84990xf88d84c7) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    if (c23120x8ba1b4d6 != null && (m84932x1046a12c = c23120x8ba1b4d6.m84932x1046a12c()) != null) {
                        jSONObject.put("action", m84932x1046a12c);
                    }
                    if (c23120x8ba1b4d6 != null && (m84936xfb84c446 = c23120x8ba1b4d6.m84936xfb84c446()) != null) {
                        jSONObject.put("resp", m84936xfb84c446);
                    }
                    if (c23120x8ba1b4d6 != null && (m84933x73c2ae34 = c23120x8ba1b4d6.m84933x73c2ae34()) != null) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("head_img", m84933x73c2ae34.m84950x6d34418d());
                        jSONObject2.put("nickname", m84933x73c2ae34.m84953x80025a04());
                        jSONObject2.put("identity_type", m84933x73c2ae34.m84952x59c0778e());
                        jSONObject2.put("identity_name", m84933x73c2ae34.m84951x59bd62df());
                        jSONObject.put("identity", jSONObject2);
                    }
                    if (c23120x8ba1b4d6 != null && (m84937x760b601f = c23120x8ba1b4d6.m84937x760b601f()) != null) {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("type", m84937x760b601f.m85007xfb85f7b0());
                        jSONObject3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54511x88207fba, m84937x760b601f.m85005xe72974be());
                        jSONObject3.put("replyid", m84937x760b601f.m85006x7f0a456f());
                        jSONObject.put("targetCmt", jSONObject3);
                    }
                    if (c23120x8ba1b4d6 != null && (m84934xad8b6040 = c23120x8ba1b4d6.m84934xad8b6040()) != null) {
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                        jSONObject4.put("praise_status", m84934xad8b6040.m84963x89972f04());
                        jSONObject.put("praiseInfo", jSONObject4);
                    }
                    if (c23120x8ba1b4d6 != null && (m84935xe58ed802 = c23120x8ba1b4d6.m84935xe58ed802()) != null) {
                        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                        jSONObject5.put("content", m84935xe58ed802.m84975x76847043());
                        jSONObject5.put("time", m84935xe58ed802.m84977xfb85bb43());
                        jSONObject5.put("pictures", m84935xe58ed802.m84976xbd2ae900());
                        jSONObject.put("replyInfo", jSONObject5);
                    }
                    jSONArray.put(jSONObject);
                }
                hashMap.put("actions", jSONArray);
            }
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPreviewAppMsgCommentImage", "parse preview ret info error: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H(e17, true));
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
        }
    }
}
