package ad1;

/* loaded from: classes7.dex */
public class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 243;
    public static final java.lang.String NAME = "operateRequestTask";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        B(lVar, jSONObject, i17, lVar.getF147808e());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void B(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data is null"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateRequestTask", "data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("requestTaskId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateRequestTask", "requestTaskId is null");
            lVar.a(i17, o("fail:requestTaskId is null or nil"));
            return;
        }
        java.lang.String optString2 = jSONObject.optString("operationType");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateRequestTask", "operationType is null");
            lVar.a(i17, o("fail:operationType is null or nil"));
            return;
        }
        if (!optString2.equals("abort")) {
            lVar.a(i17, o("fail:unknown operationType"));
            return;
        }
        uh1.q a17 = uh1.s.f427900a.a(lVar);
        if (a17 == null) {
            lVar.a(i17, o("fail:no task"));
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateRequestTask", "request is null");
            return;
        }
        uh1.r rVar = null;
        if (optString != null) {
            synchronized (a17.f427855b) {
                java.util.Iterator it = a17.f427855b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    uh1.r rVar2 = (uh1.r) it.next();
                    if (optString.equals(rVar2.f427881j)) {
                        rVar = rVar2;
                        break;
                    }
                }
            }
        }
        boolean z17 = true;
        if (rVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkRequest", "lm:try to abortTask taskId:%s, appId:%s", rVar.f427881j, a17.f427862i);
            ((java.util.concurrent.ConcurrentSkipListSet) a17.f427856c).add(rVar.f427881j);
            a17.f(rVar.f427881j, rVar.f427882k);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(rVar.f427883l)) {
                com.tencent.mars.cdn.CronetLogic.cancelCronetTask(rVar.f427883l);
            }
        } else if (((java.util.concurrent.ConcurrentSkipListSet) a17.f427857d).contains(optString)) {
            ((java.util.concurrent.ConcurrentSkipListSet) a17.f427856c).add(optString);
        } else {
            z17 = false;
        }
        if (!z17) {
            lVar.a(i17, o("fail:no task"));
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateRequestTask", "requestInfo is null requestTaskId:%s, appId:%s", optString, lVar.getAppId());
            return;
        }
        lVar.a(i17, o("ok"));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("requestTaskId", optString);
        hashMap.put("state", "fail");
        hashMap.put("errMsg", "abort");
        java.lang.String jSONObject2 = new org.json.JSONObject(hashMap).toString();
        ad1.c cVar = new ad1.c();
        cVar.p(lVar);
        cVar.r(jSONObject2);
        cVar.n(c0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateRequestTask", "abortTask finish requestId:%s, appId:%s", optString, lVar.getAppId());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.k0
    public boolean m() {
        return true;
    }
}
