package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class l1 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.m1 f86844b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.o1 f86845c;

    public l1(com.tencent.mm.plugin.appbrand.page.o1 o1Var, java.lang.String str, com.tencent.mm.plugin.appbrand.page.m1 m1Var) {
        this.f86845c = o1Var;
        this.f86843a = str;
        this.f86844b = m1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        java.lang.String str2;
        com.tencent.mm.protocal.protobuf.AppCommentModule appCommentModule;
        r45.rd5 rd5Var;
        java.lang.String str3;
        r45.z1 z1Var;
        r45.fe0 fe0Var;
        com.tencent.mm.protobuf.f fVar;
        java.lang.String string;
        java.lang.String str4 = null;
        if (i17 == 0 && i18 == 0 && oVar != null && (fVar = oVar.f70711b.f70700a) != null && (fVar instanceof com.tencent.mm.protocal.protobuf.GetProfileInfoResponse)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "queryProfile, request success");
            com.tencent.mm.protocal.protobuf.GetProfileInfoResponse getProfileInfoResponse = (com.tencent.mm.protocal.protobuf.GetProfileInfoResponse) oVar.f70711b.f70700a;
            try {
                com.tencent.mm.sdk.platformtools.o4.M("appbrand_profile_info_mmkv_name" + this.f86843a).H("appbrand_profile_info_key", getProfileInfoResponse.toByteArray());
            } catch (java.io.IOException unused) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "queryProfile, encode error");
            }
            com.tencent.mm.protocal.protobuf.AppCommentModule appCommentModule2 = getProfileInfoResponse.comment_info;
            if (appCommentModule2 == null || appCommentModule2.show_menu != 1) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f86845c.f86941b)) {
                    com.tencent.mm.protocal.protobuf.WxaEvaluateBasicInfo wxaEvaluateBasicInfo = getProfileInfoResponse.evaluate_basic_info;
                    if (wxaEvaluateBasicInfo != null) {
                        double d17 = wxaEvaluateBasicInfo.average_score;
                        if (d17 != -1.0d) {
                            string = d17 == 0.0d ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490257pt) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.a4k, java.lang.String.valueOf(d17));
                        }
                    }
                    appCommentModule2 = null;
                } else {
                    string = this.f86845c.f86941b;
                }
                str4 = string;
                appCommentModule2 = null;
            }
            r45.rd5 rd5Var2 = getProfileInfoResponse.page_info;
            java.lang.String str5 = getProfileInfoResponse.relate_brand_list.brand_register_title;
            r45.z1 z1Var2 = getProfileInfoResponse.activity_info;
            fe0Var = getProfileInfoResponse.developer_service;
            appCommentModule = appCommentModule2;
            rd5Var = rd5Var2;
            str3 = str5;
            str2 = str4;
            z1Var = z1Var2;
        } else {
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490651a34);
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMenuHeaderDataHelper", "queryProfile, request fail");
            str2 = string2;
            appCommentModule = null;
            rd5Var = null;
            str3 = null;
            z1Var = null;
            fe0Var = null;
        }
        com.tencent.mm.plugin.appbrand.page.o1 o1Var = this.f86845c;
        o1Var.f86943d = rd5Var != null && rd5Var.f384749o;
        java.lang.String str6 = o1Var.f86940a.f74803n;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "updateDeveloperServiceInfo appId:%s", str6);
        java.util.HashMap hashMap = com.tencent.mm.plugin.appbrand.page.o1.f86938g;
        synchronized (hashMap) {
            if (fe0Var != null) {
                hashMap.put(str6, fe0Var);
            } else {
                hashMap.remove(str6);
            }
        }
        java.lang.String str7 = "";
        if (fe0Var != null) {
            try {
                str7 = new java.lang.String(n56.a.b(fe0Var.toByteArray(), false));
            } catch (java.io.IOException unused2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "updateDeveloperServiceInfo, encode error");
            }
        }
        com.tencent.mm.sdk.platformtools.o4.M("appbrand_profile_info_mmkv_name" + str6).D("appbrand_developer_service_info_key", str7);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.page.k1(this, appCommentModule, str2, rd5Var, str3, z1Var, fe0Var));
    }
}
