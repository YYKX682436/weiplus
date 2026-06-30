package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* loaded from: classes7.dex */
public class a0 extends zc1.c {
    @Override // zc1.c
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, uh1.a aVar, boolean z17, org.json.JSONObject jSONObject, int i17, java.util.Map map, uh1.d dVar, java.lang.String str) {
        boolean z18;
        java.lang.Boolean valueOf;
        uh1.x0 x0Var;
        java.lang.String optString = jSONObject.optString("url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCreateDownloadTaskGame", "url is null");
            e(lVar, str, "url is null or nil", 600005);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.i e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.i.e(lVar);
        if (e17 != null) {
            synchronized (e17.f159750g) {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = e17.f159750g;
                boolean z19 = false;
                z18 = true;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.contains(optString)) {
                    uh1.x0 x0Var2 = e17.f159745b;
                    if (x0Var2 != null) {
                        synchronized (x0Var2.f509461i) {
                            valueOf = java.lang.Boolean.valueOf(((java.util.HashMap) x0Var2.f509461i).containsKey(optString));
                        }
                        if (valueOf.booleanValue()) {
                            z19 = true;
                        }
                    }
                    z18 = z19;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGamePreloadManager", "predownloadingList has url:%s,size:%d", optString, java.lang.Integer.valueOf(e17.f159750g.size()));
                    e17.f159755l.addAndGet(1);
                }
            }
            if (z18 && (x0Var = e17.f159745b) != null) {
                x0Var.b(jSONObject, i17, map, z17 ? aVar.f509285s : null, aVar.f509291y, dVar, str, "createDownloadTask");
                return;
            }
        }
        super.c(lVar, aVar, z17, jSONObject, i17, map, dVar, str);
    }
}
