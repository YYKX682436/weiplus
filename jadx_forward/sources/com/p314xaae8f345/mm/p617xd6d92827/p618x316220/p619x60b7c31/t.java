package com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31;

/* loaded from: classes.dex */
public final class t extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.r.f33392x24728b;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("slotid");
        java.lang.String instanceName = e().f425864a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        java.lang.String s07 = r26.n0.s0(instanceName, "-", instanceName);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            s().mo146xb9724478(i(lc3.x.f399470d));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s07)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiGetAdPushMsg", "bizName null");
        }
        wj.m mVar = (wj.m) i95.n0.c(wj.m.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        ((wj.g1) mVar).getClass();
        java.util.List<hk.a> a17 = hk.n.f363216a.a(s07, optString);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (hk.a info : a17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("opcode", info.y0());
            jSONObject.put("aid", info.t0());
            jSONObject.put("slotid", info.v0());
            jSONObject.put("op_time", info.u0());
            jSONObject.put("traceid", info.w0());
            jSONArray.put(jSONObject);
        }
        yz5.l s17 = s();
        lc3.a0 a0Var = new lc3.a0();
        a0Var.put("msgData", jSONArray);
        m(a0Var);
        s17.mo146xb9724478(a0Var);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4982x236cabef(optString, s07), com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.q.class, new com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.s(this));
    }
}
