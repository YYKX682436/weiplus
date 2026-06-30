package ai1;

/* loaded from: classes8.dex */
public final class m implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel f5095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zh1.a1 f5096b;

    public m(com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel, zh1.a1 a1Var) {
        this.f5095a = materialModel;
        this.f5096b = a1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchOpenMaterialsByCgi#onCgiBack, errType: ");
        sb6.append(i17);
        sb6.append(", errCode: ");
        sb6.append(i18);
        sb6.append(", errMsg: ");
        sb6.append(str);
        sb6.append(", material_type: ");
        com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel = this.f5095a;
        sb6.append(materialModel.f86269d);
        sb6.append(", material_suffix: ");
        java.lang.String str2 = materialModel.f86270e;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", sb6.toString());
        zh1.a1 a1Var = this.f5096b;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchOpenMaterialsByCgi#onCgiBack, cgi back not ok");
            pm0.v.X(new ai1.l(a1Var, materialModel));
            return;
        }
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        if (!(fVar instanceof r45.ji3)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchOpenMaterialsByCgi#onCgiBack, responseProtoBuf is not GetMaterialRecommWxaCardResponse");
            pm0.v.X(new ai1.k(a1Var, materialModel));
            return;
        }
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetMaterialRecommWxaCardResponse");
        r45.ji3 ji3Var = (r45.ji3) fVar;
        java.lang.String str3 = ji3Var.f377837f;
        if (!(str3 == null || str3.length() == 0)) {
            materialModel.f86269d = ji3Var.f377837f;
        }
        if (a1Var != null) {
            ai1.p pVar = ai1.p.f5102b;
            pm0.v.X(new ai1.n(this.f5096b, ji3Var, java.lang.System.currentTimeMillis(), this.f5095a));
        }
        if (str2.length() == 0) {
            str2 = materialModel.f86269d;
        }
        kotlin.jvm.internal.o.f(str2, "ifEmpty(...)");
        if (str2.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenMaterialDataCache", "set, not need");
            return;
        }
        java.lang.String concat = "OpenMaterialsRsp###".concat(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenMaterialDataCache", "set, cacheKey: " + concat);
        com.tencent.mm.plugin.appbrand.app.q0 q0Var = com.tencent.mm.plugin.appbrand.app.q0.f75227a;
        com.tencent.mm.sdk.platformtools.o4 a17 = q0Var.a();
        if (a17 != null) {
            byte[] byteArray = ji3Var.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            a17.putString(concat, new java.lang.String(byteArray, r26.c.f368867c));
        }
        java.lang.String concat2 = "OpenMaterialsRspTime###_".concat(str2);
        com.tencent.mm.sdk.platformtools.o4 a18 = q0Var.a();
        if (a18 != null) {
            a18.putLong(concat2, java.lang.System.currentTimeMillis());
        }
    }
}
