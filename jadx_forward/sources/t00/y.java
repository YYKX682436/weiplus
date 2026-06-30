package t00;

/* loaded from: classes8.dex */
public final class y {
    public y(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final bw5.z7 a(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        org.json.JSONArray optJSONArray = data.optJSONArray("sectionList");
        if (optJSONArray == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetEcsSectionDataActionHandler", "invalid keys");
            return null;
        }
        bw5.z7 z7Var = new bw5.z7();
        z7Var.f117378e = data.optInt("fetchScene");
        z7Var.f117381h[2] = true;
        int length = optJSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
            if (optJSONObject != null) {
                bw5.a8 a8Var = new bw5.a8();
                int optInt = optJSONObject.optInt("section");
                bw5.k9 k9Var = new bw5.k9();
                k9Var.f110833h = optInt;
                k9Var.f110834i.put(100, java.lang.Boolean.TRUE);
                a8Var.f106592e = k9Var;
                boolean[] zArr = a8Var.f106600p;
                zArr[2] = true;
                a8Var.f106596i = optJSONObject.optString("byPass");
                zArr[6] = true;
                a8Var.f106597m = optJSONObject.optString("redDotId");
                zArr[7] = true;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("section:");
                sb6.append(optInt);
                sb6.append(",redDotId:");
                sb6.append(zArr[7] ? a8Var.f106597m : "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetEcsSectionDataActionHandler", sb6.toString());
                z7Var.f117379f.add(a8Var);
            }
        }
        return z7Var;
    }

    public final org.json.JSONObject b(bw5.i9 resp, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.LinkedList<bw5.h9> linkedList = resp.f110034d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getEcsRespList(...)");
        for (bw5.h9 h9Var : linkedList) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("section", h9Var.f109661m);
            java.lang.String str = "";
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, h9Var.m12054x6e095e9(2) ? h9Var.f109656e : "");
            if (h9Var.m12054x6e095e9(101)) {
                str = h9Var.f109662n;
            }
            jSONObject.put("rid", str);
            jSONArray.put(jSONObject);
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("kvData", jSONArray);
        jSONObject2.put("hitCache", resp.f110035e);
        jSONObject2.put("reqTime", j17);
        jSONObject2.put("respTime", c01.id.c());
        return jSONObject2;
    }
}
