package ai1;

/* loaded from: classes8.dex */
public final class j implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f5089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5090b;

    public j(java.util.List list, java.lang.String str) {
        this.f5089a = list;
        this.f5090b = str;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchMultiSelectOpenMaterialsByCgi#onCgiBack, errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + str);
        java.lang.String str2 = this.f5090b;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchMultiSelectOpenMaterialsByCgi#onCgiBack, cgi back not ok");
            pm0.v.X(new ai1.i(str2));
            return;
        }
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        if (!(fVar instanceof r45.qf)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchMultiSelectOpenMaterialsByCgi#onCgiBack, responseProtoBuf is not BatchGetMaterialRecommWxaResponse");
            pm0.v.X(new ai1.g(str2));
            return;
        }
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BatchGetMaterialRecommWxaResponse");
        r45.qf qfVar = (r45.qf) fVar;
        ai1.b bVar = ai1.b.f5081a;
        java.util.List list = this.f5089a;
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenMaterialDataCache", "materialModelList is null, set, not need");
        } else {
            java.lang.String a17 = bVar.a(list);
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenMaterialDataCache", "materialModelListKey is null, materialModelList:" + list.size() + " return");
            } else {
                java.lang.String concat = "OpenMaterialsMultiRsp###".concat(a17);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenMaterialDataCache", "set, cacheKey: " + concat);
                com.tencent.mm.plugin.appbrand.app.q0 q0Var = com.tencent.mm.plugin.appbrand.app.q0.f75227a;
                com.tencent.mm.sdk.platformtools.o4 a18 = q0Var.a();
                if (a18 != null) {
                    byte[] byteArray = qfVar.toByteArray();
                    kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
                    a18.putString(concat, new java.lang.String(byteArray, r26.c.f368867c));
                }
                java.lang.String concat2 = "OpenMaterialsMultiRspTime###_".concat(a17);
                com.tencent.mm.sdk.platformtools.o4 a19 = q0Var.a();
                if (a19 != null) {
                    a19.putLong(concat2, java.lang.System.currentTimeMillis());
                }
            }
        }
        pm0.v.X(new ai1.h(str2, qfVar));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchMultiSelectOpenMaterialsByCgi rsp:" + qfVar);
    }
}
