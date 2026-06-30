package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes7.dex */
public class a0 extends zc1.c {
    @Override // zc1.c
    public void c(com.tencent.mm.plugin.appbrand.jsapi.l lVar, uh1.a aVar, boolean z17, org.json.JSONObject jSONObject, int i17, java.util.Map map, uh1.d dVar, java.lang.String str) {
        boolean z18;
        java.lang.Boolean valueOf;
        uh1.x0 x0Var;
        java.lang.String optString = jSONObject.optString("url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateDownloadTaskGame", "url is null");
            e(lVar, str, "url is null or nil", 600005);
            return;
        }
        com.tencent.mm.plugin.appbrand.game.preload.i e17 = com.tencent.mm.plugin.appbrand.game.preload.i.e(lVar);
        if (e17 != null) {
            synchronized (e17.f78217g) {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = e17.f78217g;
                boolean z19 = false;
                z18 = true;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.contains(optString)) {
                    uh1.x0 x0Var2 = e17.f78212b;
                    if (x0Var2 != null) {
                        synchronized (x0Var2.f427928i) {
                            valueOf = java.lang.Boolean.valueOf(((java.util.HashMap) x0Var2.f427928i).containsKey(optString));
                        }
                        if (valueOf.booleanValue()) {
                            z19 = true;
                        }
                    }
                    z18 = z19;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WAGamePreloadManager", "predownloadingList has url:%s,size:%d", optString, java.lang.Integer.valueOf(e17.f78217g.size()));
                    e17.f78222l.addAndGet(1);
                }
            }
            if (z18 && (x0Var = e17.f78212b) != null) {
                x0Var.b(jSONObject, i17, map, z17 ? aVar.f427752s : null, aVar.f427758y, dVar, str, "createDownloadTask");
                return;
            }
        }
        super.c(lVar, aVar, z17, jSONObject, i17, map, dVar, str);
    }
}
