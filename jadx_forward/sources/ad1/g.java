package ad1;

/* loaded from: classes7.dex */
public class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f29x366c91de = 243;

    /* renamed from: NAME */
    public static final java.lang.String f30x24728b = "operateRequestTask";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        B(lVar, jSONObject, i17, lVar.getF229341e());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data is null"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateRequestTask", "data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("requestTaskId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateRequestTask", "requestTaskId is null");
            lVar.a(i17, o("fail:requestTaskId is null or nil"));
            return;
        }
        java.lang.String optString2 = jSONObject.optString("operationType");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateRequestTask", "operationType is null");
            lVar.a(i17, o("fail:operationType is null or nil"));
            return;
        }
        if (!optString2.equals("abort")) {
            lVar.a(i17, o("fail:unknown operationType"));
            return;
        }
        uh1.q a17 = uh1.s.f509433a.a(lVar);
        if (a17 == null) {
            lVar.a(i17, o("fail:no task"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateRequestTask", "request is null");
            return;
        }
        uh1.r rVar = null;
        if (optString != null) {
            synchronized (a17.f509388b) {
                java.util.Iterator it = a17.f509388b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    uh1.r rVar2 = (uh1.r) it.next();
                    if (optString.equals(rVar2.f509414j)) {
                        rVar = rVar2;
                        break;
                    }
                }
            }
        }
        boolean z17 = true;
        if (rVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkRequest", "lm:try to abortTask taskId:%s, appId:%s", rVar.f509414j, a17.f509395i);
            ((java.util.concurrent.ConcurrentSkipListSet) a17.f509389c).add(rVar.f509414j);
            a17.f(rVar.f509414j, rVar.f509415k);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f509416l)) {
                com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(rVar.f509416l);
            }
        } else if (((java.util.concurrent.ConcurrentSkipListSet) a17.f509390d).contains(optString)) {
            ((java.util.concurrent.ConcurrentSkipListSet) a17.f509389c).add(optString);
        } else {
            z17 = false;
        }
        if (!z17) {
            lVar.a(i17, o("fail:no task"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateRequestTask", "requestInfo is null requestTaskId:%s, appId:%s", optString, lVar.mo48798x74292566());
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateRequestTask", "abortTask finish requestId:%s, appId:%s", optString, lVar.mo48798x74292566());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0
    public boolean m() {
        return true;
    }
}
