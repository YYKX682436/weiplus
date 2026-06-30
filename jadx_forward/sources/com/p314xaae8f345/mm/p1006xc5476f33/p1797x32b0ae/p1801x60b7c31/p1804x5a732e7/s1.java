package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/s1;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class s1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        org.json.JSONObject jSONObject2 = null;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("chatId") : null;
        if (optString == null || optString.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiEmoticonSetSearchTagResult", "chatUserName is null or empty");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiEmoticonSetSearchTagResult", "onSetSearchTagResult data: " + jSONObject);
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("content") : null;
        if (!(optString2 == null || optString2.length() == 0)) {
            try {
                org.json.JSONArray optJSONArray = new org.json.JSONObject(optString2).optJSONArray("items");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(0);
                    if (optJSONObject != null) {
                        jSONObject2 = optJSONObject;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiEmoticonSetSearchTagResult", "Error parsing content JSON", e17);
            }
        }
        if (jSONObject2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiEmoticonSetSearchTagResult", "setSearchTagResult failed, emojiContent is null or empty");
            this.f224976f.a(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
            return;
        }
        jSONObject2.put("sendFromScene", "chatSearch");
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 o6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class);
        android.content.Context c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r1 r1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r1(this);
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 c4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) o6Var;
        c4Var.getClass();
        java.lang.String optString3 = jSONObject2.optString("md5");
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(optString3);
        if (u17 == null) {
            u17 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
        }
        u17.f68671x4b6e68b9 = optString3;
        u17.f68689x2262335f = jSONObject2.optInt("type");
        u17.f68686x7b284d5e = jSONObject2.optString("thumb");
        java.lang.String optString4 = jSONObject2.optString("aesKey");
        u17.f68642xf11e6e15 = optString4;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString4)) {
            u17.f68654xf47770e7 = jSONObject2.optString("encryptUrl");
        } else {
            u17.f68659x5efe714f = jSONObject2.optString("encryptUrl");
        }
        u17.f68657xb76d85ab = jSONObject2.optString("designerId", "");
        u17.F2 = jSONObject2.optInt("pay", 0);
        u17.E2 = jSONObject2.optString("productName", "");
        u17.f68663x861009b5 = jSONObject2.optString("productId", "");
        java.lang.String str2 = "upload emoji, to username: " + optString + ", md5: " + u17.mo42933xb5885648();
        java.lang.String str3 = c4Var.f147740d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
        java.lang.String optString5 = jSONObject2.optString("sendFromScene", "");
        if (!android.text.TextUtils.isEmpty(optString5) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString5, "chatSearch")) {
            u17.K2 = qk.z6.SEND_FROM_SCENE_SEARCH;
        }
        if (u17.F2 == 1) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17.f68663x861009b5)) {
                if (((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).S(u17.f68663x861009b5)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "buy and resend emoji");
                }
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar.f293242a = "";
            aVar.f293262s = c17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j5f);
            aVar.A = true;
            aVar.f293265v = of5.b.a(c17).getString(com.p314xaae8f345.mm.R.C30867xcad56011.bup);
            aVar.E = new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k3(u17, c4Var, c17, r1Var);
            aVar.f293266w = of5.b.a(c17).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
            aVar.F = new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.l3(r1Var);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(c17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            android.view.Window window = j0Var.getWindow();
            if (window != null) {
                window.setSoftInputMode(48);
                window.setFlags(131072, 131072);
            }
            j0Var.show();
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(u17.mo42933xb5885648()) == null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().mo880xb970c2b9(u17);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.z2 z2Var = new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.z2(c4Var, r1Var, u17);
        zq.h hVar = zq.h.f556505a;
        new dr.k(u17, z2Var).f(false);
    }
}
