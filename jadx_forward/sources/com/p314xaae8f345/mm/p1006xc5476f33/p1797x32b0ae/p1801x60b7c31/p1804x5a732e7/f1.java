package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/f1;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class f1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String md52 = jSONObject != null ? jSONObject.optString("md5") : null;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("packThumbExtBuf") : null;
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("pid") : null;
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString("emojiInfoBuf") : null;
        int optInt = jSONObject != null ? jSONObject.optInt("emoticonScene") : 26;
        int optInt2 = jSONObject != null ? jSONObject.optInt("addEmoticonScene") : 8;
        java.lang.String optString4 = jSONObject != null ? jSONObject.optString("requestID") : null;
        java.lang.String str2 = optString4 == null ? "" : optString4;
        java.lang.String optString5 = jSONObject != null ? jSONObject.optString("reportInfo") : null;
        int optInt3 = jSONObject != null ? jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811) : 0;
        int optInt4 = jSONObject != null ? jSONObject.optInt("showEntry") : 0;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (!(optString5 == null || optString5.length() == 0)) {
            linkedHashMap.put("reportInfo30474", optString5);
        }
        if (md52 == null || md52.length() == 0) {
            this.f224976f.a("emoticonOpenHalfScreenSendView:fail_missing arguments");
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 o6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class);
        android.content.Context c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getContext(...)");
        boolean z18 = optInt4 == 1;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 c4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) o6Var;
        c4Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
        c21053xdbf1e5f4.f68671x4b6e68b9 = md52;
        if (optString3 == null || optString3.length() == 0) {
            if (!(optString == null || optString.length() == 0)) {
                r45.m35 m35Var = new r45.m35();
                byte[] decode = android.util.Base64.decode(optString, 2);
                if (decode != null) {
                    try {
                        m35Var.mo11468x92b714fd(decode);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                }
                c21053xdbf1e5f4.f68663x861009b5 = optString2;
                c21053xdbf1e5f4.f68654xf47770e7 = m35Var.f461652h;
                c21053xdbf1e5f4.f68686x7b284d5e = m35Var.f461653i;
                c21053xdbf1e5f4.f68642xf11e6e15 = m35Var.f461651g;
                c21053xdbf1e5f4.f68659x5efe714f = m35Var.f461654m;
                c21053xdbf1e5f4.f68661x765114aa = m35Var.f461655n;
                c21053xdbf1e5f4.f68660x7650f4b9 = m35Var.f461656o;
                c21053xdbf1e5f4.f68641x3342accf = m35Var.f461657p;
                c21053xdbf1e5f4.f68658xff1c8bcd = m35Var.f461658q;
            }
        } else {
            byte[] nj6 = c4Var.nj(optString3);
            r45.ri0 ri0Var = new r45.ri0();
            if (nj6 != null) {
                try {
                    ri0Var.mo11468x92b714fd(nj6);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
                }
            }
            n22.m.a(ri0Var, c21053xdbf1e5f4);
        }
        j22.a.d(c21053xdbf1e5f4, 0, optInt3, 0L, optInt);
        java.lang.Object obj = linkedHashMap.get("reportInfo30474");
        java.lang.String str3 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (!(str3 == null || str3.length() == 0)) {
            try {
                org.json.JSONObject optJSONObject = new org.json.JSONObject(str3).optJSONObject("halfExpose");
                if (optJSONObject != null) {
                    java.lang.String optString6 = optJSONObject.optString("actionType");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString6, "optString(...)");
                    java.lang.String optString7 = optJSONObject.optString("eleId");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString7, "optString(...)");
                    java.lang.String optString8 = optJSONObject.optString("eleInfo");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString8, "optString(...)");
                    java.lang.String optString9 = optJSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14352x3a8c965e);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString9, "optString(...)");
                    java.lang.String optString10 = optJSONObject.optString("pageId");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString10, "optString(...)");
                    j22.a.c(optString6, optString7, optString8, optString9, optString10);
                }
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c4Var.f147740d, "showEmojiHalfDialog parse reportInfo30474 error: " + e19);
            }
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t3(c17, c21053xdbf1e5f4, z18, optInt, optInt2, str2, str3));
        this.f224976f.d(false);
    }
}
