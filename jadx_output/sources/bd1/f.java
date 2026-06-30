package bd1;

/* loaded from: classes7.dex */
public class f extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 273;
    public static final java.lang.String NAME = "operateUploadTask";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        B(lVar, jSONObject, i17, lVar.getF147808e());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void B(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data is null"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateUploadTask", "data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("uploadTaskId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateUploadTask", "uploadTaskId is null");
            lVar.a(i17, o("fail:uploadTaskId is null or nil"));
            return;
        }
        java.lang.String optString2 = jSONObject.optString("operationType");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateUploadTask", "operationType is null");
            lVar.a(i17, o("fail:operationType is null or nil"));
            return;
        }
        if (!optString2.equals("abort")) {
            lVar.a(i17, o("fail:unknown operationType"));
            return;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.h0.f427796b;
        uh1.e0 a17 = uh1.g0.f427794a.a(lVar.getAppId());
        if (a17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateUploadTask", "upload is null");
            lVar.a(i17, o("fail:no task"));
            return;
        }
        wh1.e eVar = null;
        if (optString != null) {
            synchronized (a17.f427779g) {
                java.util.Iterator it = a17.f427779g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    wh1.e eVar2 = (wh1.e) it.next();
                    if (optString.equals(eVar2.f445941w)) {
                        eVar = eVar2;
                        break;
                    }
                }
            }
        }
        if (eVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateUploadTask", "uploadWorker is null %s", optString);
            lVar.a(i17, o("fail:no task"));
            return;
        }
        a17.f427780h.add(eVar.f445941w);
        a17.b(eVar.f445941w);
        eVar.a();
        lVar.a(i17, o("ok"));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("uploadTaskId", optString + "");
        hashMap.put("state", "fail");
        hashMap.put("errMsg", "abort");
        java.lang.String jSONObject2 = new org.json.JSONObject(hashMap).toString();
        bd1.b bVar = new bd1.b();
        bVar.p(lVar);
        bVar.r(jSONObject2);
        bVar.n(c0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.k0
    public boolean m() {
        return true;
    }
}
