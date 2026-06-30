package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes4.dex */
public final class f implements ct1.x {
    @Override // ct1.x
    public void pi(java.util.LinkedList linkedList, boolean z17) {
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.tr trVar = (r45.tr) it.next();
                if (trVar.f468253e == 1) {
                    r45.w3 w3Var = new r45.w3();
                    w3Var.mo11468x92b714fd(trVar.f468254f.f273689a);
                    r45.j4 j4Var = w3Var.f470359d;
                    if (j4Var.f459093g != 10002) {
                        continue;
                    } else {
                        java.lang.String g17 = x51.j1.g(j4Var.f459094h);
                        if (g17 == null) {
                            return;
                        }
                        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
                        java.lang.String str = (java.lang.String) d17.get(".sysmsg");
                        if (str == null || ((java.lang.String) d17.get(".sysmsg.$type")) == null) {
                            return;
                        }
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onReceive] lite app by byp content ");
                        sb6.append(g17);
                        sb6.append(',');
                        sb6.append(w3Var.f470359d.f459098o);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppBypMsgSyncHandler", sb6.toString());
                        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                        java.lang.String optString = jSONObject.optString("appId");
                        jSONObject.optString("minVersion");
                        java.lang.String optString2 = jSONObject.optString("liteappMsgType");
                        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("liteappMsgContent");
                        if ("dispatchStore".equals(optString2)) {
                            int optInt = optJSONObject.optInt("interval", 12);
                            int optInt2 = optJSONObject.optInt("repeat", 0);
                            org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("action");
                            if (optJSONObject2 == null) {
                                optJSONObject2 = new org.json.JSONObject();
                            }
                            java.lang.String optString3 = optJSONObject2.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "");
                            org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject("payload");
                            if (optJSONObject3 == null) {
                                optJSONObject3 = new org.json.JSONObject();
                            }
                            java.lang.String jSONObject2 = optJSONObject3.toString();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().Q(optString, optInt, optInt2, optString3, jSONObject2, optJSONObject.optBoolean("forceDispatch", false), optJSONObject.optInt("aliveDurationSeconds", 600));
                        }
                    }
                }
            }
        }
    }
}
