package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/k2;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class k2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (str != null ? r26.i0.n(str, "@pay", false) : false) {
            this.f224976f.a("this jsapi is not allowed in pay liteapp");
            return;
        }
        if (jSONObject == null) {
            this.f224976f.a("data is null");
            return;
        }
        java.lang.String uj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).uj(str);
        if (uj6 != null) {
            boolean z18 = true;
            if (!(uj6.length() == 0)) {
                java.lang.String j17 = j62.e.g().j("clicfg_liteapp_transfer_android", "0", false, true);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getMulitExpt(...)");
                boolean p17 = r26.i0.p(j17, "1", true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2();
                c12965xc9712d2.f175446d = p17 ? 5 : 1;
                c12965xc9712d2.f175448f = jSONObject.optString("scope");
                c12965xc9712d2.f175447e = uj6;
                if (!p17) {
                    str = "";
                }
                c12965xc9712d2.f175454o = str;
                r45.y24 y24Var = new r45.y24();
                y24Var.f472258d = jSONObject.optString("reqUrl");
                y24Var.f472260f = jSONObject.optInt("cgiCmdId");
                y24Var.f472259e = jSONObject.optString("reqBody");
                y24Var.f472262h = jSONObject.optInt(ya.b.f77491x8758c4e1);
                c12965xc9712d2.f175450h = y24Var;
                c12965xc9712d2.f175451i = jSONObject.optBoolean("is_security_check", false);
                java.lang.String optString = jSONObject.optString("debug_env", "");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                c12965xc9712d2.f175457r = optString.length() > 0 ? ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).b(optString) : "";
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("debug_cookies");
                if (optJSONObject != null) {
                    c12965xc9712d2.f175458s = optJSONObject.optString("route_tag", "");
                }
                try {
                    java.lang.String optString2 = jSONObject.optString("header");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                    if (optString2.length() <= 0) {
                        z18 = false;
                    }
                    if (z18) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString2);
                        java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(keys);
                        while (keys.hasNext()) {
                            java.lang.String next = keys.next();
                            java.lang.String optString3 = jSONObject2.optString(next);
                            java.util.LinkedList linkedList = c12965xc9712d2.f175450h.f472261g;
                            r45.cw3 cw3Var = new r45.cw3();
                            cw3Var.f453393d = next;
                            cw3Var.f453394e = optString3;
                            linkedList.push(cw3Var);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiExtTransfer", e17, "parseTransferRequestInfo exception", new java.lang.Object[0]);
                }
                ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).c(c12965xc9712d2, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.j2(this));
                return;
            }
        }
        this.f224976f.a("get auth url fail");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
