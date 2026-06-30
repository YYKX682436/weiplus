package bd1;

/* loaded from: classes7.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4202x366c91de = 273;

    /* renamed from: NAME */
    public static final java.lang.String f4203x24728b = "operateUploadTask";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        B(lVar, jSONObject, i17, lVar.getF229341e());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data is null"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateUploadTask", "data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("uploadTaskId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateUploadTask", "uploadTaskId is null");
            lVar.a(i17, o("fail:uploadTaskId is null or nil"));
            return;
        }
        java.lang.String optString2 = jSONObject.optString("operationType");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateUploadTask", "operationType is null");
            lVar.a(i17, o("fail:operationType is null or nil"));
            return;
        }
        if (!optString2.equals("abort")) {
            lVar.a(i17, o("fail:unknown operationType"));
            return;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.h0.f509329b;
        uh1.e0 a17 = uh1.g0.f509327a.a(lVar.mo48798x74292566());
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateUploadTask", "upload is null");
            lVar.a(i17, o("fail:no task"));
            return;
        }
        wh1.e eVar = null;
        if (optString != null) {
            synchronized (a17.f509312g) {
                java.util.Iterator it = a17.f509312g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    wh1.e eVar2 = (wh1.e) it.next();
                    if (optString.equals(eVar2.f527474w)) {
                        eVar = eVar2;
                        break;
                    }
                }
            }
        }
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateUploadTask", "uploadWorker is null %s", optString);
            lVar.a(i17, o("fail:no task"));
            return;
        }
        a17.f509313h.add(eVar.f527474w);
        a17.b(eVar.f527474w);
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0
    public boolean m() {
        return true;
    }
}
