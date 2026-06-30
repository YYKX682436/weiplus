package um4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum4/p;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-topstory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class p extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String str2;
        ot0.l1 l1Var;
        ot0.s0 s0Var;
        boolean z18;
        android.content.Intent intent;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startSearchItemDetailPage : ");
        sb6.append(jSONObject != null ? jSONObject.toString() : null);
        java.lang.String str3 = "MicroMsg.LiteAppJsApiStartSearchItemDetailPage";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiStartSearchItemDetailPage", sb6.toString());
        if (jSONObject == null) {
            return;
        }
        try {
            java.lang.String optString = jSONObject.optString("jumpUrl", "");
            java.lang.String optString2 = jSONObject.optString("publishId", "");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("KPublisherId", optString2);
            intent2.putExtra("srcUsername", jSONObject.optString("srcUserName"));
            intent2.putExtra("geta8key_scene", 64);
            int optInt = jSONObject.optInt("openScene", 10000);
            int optInt2 = jSONObject.optInt("subScene", -1);
            int optInt3 = jSONObject.optInt("itemType", -1);
            intent2.putExtra(com.p314xaae8f345.mm.ui.w2.f292730j, optInt3);
            intent2.putExtra("KWebPrefetcherId", jSONObject.optString("prefetchId", ""));
            zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
            int currentTimeMillis = ((int) java.lang.System.currentTimeMillis()) / 1000;
            ((yq1.z) a0Var).getClass();
            java.lang.String a17 = ot0.g0.a(optString, optInt, optInt2, currentTimeMillis);
            intent2.putExtra("rawUrl", a17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiStartSearchItemDetailPage", "jump url = %s, publishId = %s", a17, optString2);
            if (optInt3 == 5) {
                try {
                    android.os.Bundle bundle = new android.os.Bundle();
                    try {
                        ((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).getClass();
                        l1Var = new ot0.l1();
                        l1Var.f430135m = jSONObject.optString("srcUserName");
                        l1Var.f430136n = jSONObject.optString("srcDisplayName");
                        ot0.s0 s0Var2 = l1Var.f430139q;
                        s0Var2.f430295e = a17;
                        s0Var2.f430294d = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                        l1Var.f430139q.f430302n = jSONObject.optString("digest");
                        l1Var.f430139q.f430299i = jSONObject.optString("cover");
                        s0Var = l1Var.f430139q;
                        s0Var.f430303o = optInt3;
                        str2 = "MicroMsg.LiteAppJsApiStartSearchItemDetailPage";
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        str2 = "MicroMsg.LiteAppJsApiStartSearchItemDetailPage";
                        str3 = str2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str3, e, "reportSearchRealTimeReport", new java.lang.Object[0]);
                        this.f224976f.a("Error");
                        return;
                    }
                    try {
                        s0Var.f430298h = jSONObject.optInt("pubTime");
                        l1Var.f430139q.f430307q = jSONObject.optInt("duration");
                        l1Var.f430139q.E = jSONObject.optInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15530xe0ce1e4b);
                        l1Var.f430139q.F = jSONObject.optInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15529x1f26b122);
                        l1Var.f430139q.G = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54503x6397ab9d);
                        l1Var.b(bundle);
                        intent2.putExtras(bundle);
                        z18 = true;
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        str3 = str2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str3, e, "reportSearchRealTimeReport", new java.lang.Object[0]);
                        this.f224976f.a("Error");
                        return;
                    }
                } catch (java.lang.Exception e19) {
                    e = e19;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str3, e, "reportSearchRealTimeReport", new java.lang.Object[0]);
                    this.f224976f.a("Error");
                    return;
                }
            } else {
                str2 = "MicroMsg.LiteAppJsApiStartSearchItemDetailPage";
                z18 = false;
            }
            str3 = str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "openScene:%s, subScene:%s, itemType:%s", java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(optInt2), java.lang.Integer.valueOf(optInt3));
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(7)) {
                boolean z19 = z18;
                intent = intent2;
                if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(c(), a17, optInt3, z19, optInt, optInt2, intent)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "startSearchItemDetailPage jump to TmplWebview");
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("retCode", 0);
                    this.f224976f.c(jSONObject2, false);
                }
            } else {
                intent = intent2;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "startSearchItemDetailPage jump to WebViewUI");
            j45.l.j(c(), "webview", ".ui.tools.WebViewUI", intent, null);
            org.json.JSONObject jSONObject22 = new org.json.JSONObject();
            jSONObject22.put("retCode", 0);
            this.f224976f.c(jSONObject22, false);
        } catch (java.lang.Exception e27) {
            e = e27;
        }
    }
}
