package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/f2;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class f2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        int i17;
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("pids") : null;
        if (str == null || optJSONArray == null) {
            this.f224976f.a("emoticonStoreStatus:fail_missing arguments");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiEmoticonStoreStatus", "invoke emoticonStoreStatus: " + c() + ", " + this.f224975e.f380557a + ", " + str);
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 o6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        long j17 = this.f224975e.f380557a;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) o6Var).getClass();
        if (j17 != 0) {
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10572xfeac2836.f147537h.a(j17).f147539d = j17;
        }
        int length = optJSONArray.length();
        for (int i18 = 0; i18 < length; i18++) {
            java.lang.String string = optJSONArray.getString(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c(), "getContext(...)");
            long j18 = this.f224975e.f380557a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            boolean S = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).S(string);
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10572xfeac2836.f147537h.a(j18).f147540e.add(string);
            float f17 = 0.0f;
            if (S) {
                i17 = 3;
            } else {
                int b17 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ri().b(string);
                if (b17 >= 0 && b17 < 101) {
                    f17 = b17 / 100.0f;
                    i17 = 2;
                } else {
                    i17 = 1;
                }
            }
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("status", i17);
            if (i17 == 2) {
                jSONObject4.put("progress", java.lang.Float.valueOf(f17));
            }
            jSONObject3.put(string, jSONObject4);
        }
        jSONObject2.put("result", jSONObject3);
        this.f224976f.c(jSONObject2, false);
    }
}
