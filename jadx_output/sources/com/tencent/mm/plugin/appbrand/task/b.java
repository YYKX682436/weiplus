package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes11.dex */
class b implements com.tencent.mm.ipcinvoker.j {
    private b() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.service.b6 b6Var = (com.tencent.mm.plugin.appbrand.service.b6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.b6.class);
        if (b6Var == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult getOnLineInfoInfoResult = new com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult();
        com.tencent.mm.modelsimple.t tVar = (com.tencent.mm.modelsimple.t) b6Var;
        java.util.ArrayList arrayList = (java.util.ArrayList) tVar.wi();
        if (arrayList.contains(1)) {
            getOnLineInfoInfoResult.f77351d = 1;
        } else if (arrayList.contains(2)) {
            getOnLineInfoInfoResult.f77351d = 2;
        } else {
            getOnLineInfoInfoResult.f77351d = -1;
        }
        getOnLineInfoInfoResult.f77352e = ug3.i.f427543q;
        getOnLineInfoInfoResult.f77353f = c01.d9.b().F();
        getOnLineInfoInfoResult.f77354g = tVar.Bi();
        getOnLineInfoInfoResult.f77355h = tVar.Di();
        rVar.a(getOnLineInfoInfoResult);
    }
}
