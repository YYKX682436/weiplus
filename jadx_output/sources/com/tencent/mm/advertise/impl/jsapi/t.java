package com.tencent.mm.advertise.impl.jsapi;

/* loaded from: classes.dex */
public final class t extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return com.tencent.mm.plugin.appbrand.ad.jsapi.r.NAME;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("slotid");
        java.lang.String instanceName = e().f344331a;
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        java.lang.String s07 = r26.n0.s0(instanceName, "-", instanceName);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            s().invoke(i(lc3.x.f317937d));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(s07)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiGetAdPushMsg", "bizName null");
        }
        wj.m mVar = (wj.m) i95.n0.c(wj.m.class);
        kotlin.jvm.internal.o.d(optString);
        ((wj.g1) mVar).getClass();
        java.util.List<hk.a> a17 = hk.n.f281683a.a(s07, optString);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (hk.a info : a17) {
            kotlin.jvm.internal.o.g(info, "info");
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
        s17.invoke(a0Var);
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$RequestType(optString, s07), com.tencent.mm.advertise.impl.jsapi.q.class, new com.tencent.mm.advertise.impl.jsapi.s(this));
    }
}
