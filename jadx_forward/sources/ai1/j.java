package ai1;

/* loaded from: classes8.dex */
public final class j implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f86622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86623b;

    public j(java.util.List list, java.lang.String str) {
        this.f86622a = list;
        this.f86623b = str;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchMultiSelectOpenMaterialsByCgi#onCgiBack, errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + str);
        java.lang.String str2 = this.f86623b;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchMultiSelectOpenMaterialsByCgi#onCgiBack, cgi back not ok");
            pm0.v.X(new ai1.i(str2));
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        if (!(fVar instanceof r45.qf)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchMultiSelectOpenMaterialsByCgi#onCgiBack, responseProtoBuf is not BatchGetMaterialRecommWxaResponse");
            pm0.v.X(new ai1.g(str2));
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BatchGetMaterialRecommWxaResponse");
        r45.qf qfVar = (r45.qf) fVar;
        ai1.b bVar = ai1.b.f86614a;
        java.util.List list = this.f86622a;
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenMaterialDataCache", "materialModelList is null, set, not need");
        } else {
            java.lang.String a17 = bVar.a(list);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.OpenMaterialDataCache", "materialModelListKey is null, materialModelList:" + list.size() + " return");
            } else {
                java.lang.String concat = "OpenMaterialsMultiRsp###".concat(a17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenMaterialDataCache", "set, cacheKey: " + concat);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0 q0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = q0Var.a();
                if (a18 != null) {
                    byte[] mo14344x5f01b1f6 = qfVar.mo14344x5f01b1f6();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
                    a18.putString(concat, new java.lang.String(mo14344x5f01b1f6, r26.c.f450400c));
                }
                java.lang.String concat2 = "OpenMaterialsMultiRspTime###_".concat(a17);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a19 = q0Var.a();
                if (a19 != null) {
                    a19.putLong(concat2, java.lang.System.currentTimeMillis());
                }
            }
        }
        pm0.v.X(new ai1.h(str2, qfVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchMultiSelectOpenMaterialsByCgi rsp:" + qfVar);
    }
}
