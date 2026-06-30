package zc1;

/* loaded from: classes7.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77561x366c91de = 270;

    /* renamed from: NAME */
    public static final java.lang.String f77562x24728b = "operateDownloadTask";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        B(lVar, jSONObject, i17, lVar.mo50357xcd94f799());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data is null"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateDownloadTask", "data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("downloadTaskId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateDownloadTask", "downloadTaskId is null");
            lVar.a(i17, o("fail:downloadTaskId is null or nil"));
            return;
        }
        java.lang.String optString2 = jSONObject.optString("operationType");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateDownloadTask", "operationType is null");
            lVar.a(i17, o("fail:operationType is null or nil"));
            return;
        }
        if (!optString2.equals("abort")) {
            lVar.a(i17, o("fail:unknown operationType"));
            return;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.i.f509331b;
        uh1.f a17 = uh1.h.f509328a.a(lVar.mo48798x74292566());
        if (a17 == null) {
            lVar.a(i17, o("fail:no task"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateDownloadTask", "download is null");
            return;
        }
        vh1.f fVar = null;
        if (optString != null) {
            synchronized (a17.f509326j) {
                java.util.Iterator it = a17.f509326j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    vh1.f fVar2 = (vh1.f) it.next();
                    if (optString.equals(fVar2.f518566v)) {
                        fVar = fVar2;
                        break;
                    }
                }
            }
        }
        if (fVar == null) {
            lVar.a(i17, o("fail:no task"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateDownloadTask", "downloadWorker is null %s", optString);
            return;
        }
        a17.f509323g.add(fVar.f518566v);
        a17.a(fVar.f518566v);
        fVar.a();
        lVar.a(i17, o("ok"));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("downloadTaskId", optString + "");
        hashMap.put("state", "fail");
        hashMap.put("errMsg", "abort");
        java.lang.String jSONObject2 = new org.json.JSONObject(hashMap).toString();
        zc1.b bVar = new zc1.b();
        bVar.p(lVar);
        bVar.r(jSONObject2);
        bVar.n(c0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0
    public boolean m() {
        return true;
    }
}
