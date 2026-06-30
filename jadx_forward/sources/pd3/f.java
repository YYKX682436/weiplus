package pd3;

/* loaded from: classes7.dex */
public final class f extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f435092f = "MBJsApiOperateDownloadTask";

    @Override // lc3.c0
    public java.lang.String f() {
        return zc1.f.f77562x24728b;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("downloadTaskId");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString);
        java.lang.String str = this.f435092f;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "downloadTaskId is null or nil");
            s().mo146xb9724478(h(300005, "downloadTaskId is null or nil"));
            return;
        }
        java.lang.String optString2 = data.optString("operationType");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "operationType is null");
            s().mo146xb9724478(h(300005, "operationType is null"));
            return;
        }
        java.lang.String instanceName = e().f425864a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        java.lang.String s07 = r26.n0.s0(instanceName, "-", instanceName);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString2, "abort")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "unknown operationType");
            s().mo146xb9724478(h(300005, "unknown operationType"));
            return;
        }
        jc3.v wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.l6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h4.class))).wi(s07, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.EnumC16420x48ed1900.f37481x58f52ca8);
        if (wi6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "get download task error");
            s().mo146xb9724478(h(300004, "get download task error"));
            return;
        }
        jc3.w a17 = wi6.a(optString);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "downloadWorker is null %s", optString);
            s().mo146xb9724478(h(300004, "get download worker error"));
            return;
        }
        wi6.b(a17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("downloadTaskId", optString);
        s().mo146xb9724478(l(hashMap));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("downloadTaskId", optString);
        jSONObject.put("state", "fail");
        jSONObject.put("errno", 303305);
        jSONObject.put("errMsg", "fail:abort download");
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1842x6de15a2e.p1843x551ac888.C16445x71489a39 c16445x71489a39 = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1842x6de15a2e.p1843x551ac888.C16445x71489a39();
        c16445x71489a39.f229415e = jSONObject2;
        lc3.h0 h0Var = (lc3.h0) this.f399423a;
        if (h0Var != null) {
            h0Var.C0(c16445x71489a39);
        }
    }
}
