package com.tencent.mm.plugin.appbrand.app;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.r9.class})
/* loaded from: classes7.dex */
public class r extends i95.w implements com.tencent.mm.plugin.appbrand.service.f5 {
    @Override // com.tencent.mm.plugin.appbrand.service.f5
    public void Aa(java.util.List list) {
        com.tencent.mm.plugin.appbrand.j0.f78443d.a(list);
    }

    @Override // com.tencent.mm.plugin.appbrand.service.f5
    public void K7(java.lang.String str, android.os.Parcelable parcelable) {
        com.tencent.mm.plugin.appbrand.ipc.m0.b(str, parcelable);
    }

    @Override // com.tencent.mm.plugin.appbrand.service.f5
    public void K9() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent.f74857g.a(false);
        com.tencent.mm.plugin.appbrand.app.g2.Ui(com.tencent.mm.plugin.appbrand.app.t1.f75283g);
    }

    @Override // com.tencent.mm.plugin.appbrand.service.f5
    public void Rh(com.tencent.mm.plugin.appbrand.service.x6 x6Var) {
        com.tencent.mm.plugin.appbrand.task.u0.C().P(com.tencent.luggage.sdk.processes.LuggageServiceType.f47626e, x6Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.service.f5
    public java.util.List Sa() {
        return com.tencent.mm.plugin.appbrand.j0.Ai();
    }

    @Override // com.tencent.mm.plugin.appbrand.service.f5
    public com.tencent.mm.plugin.appbrand.jsapi.k0 Vc(int i17) {
        return com.tencent.mm.plugin.appbrand.app.o.a(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.service.f5
    public void Yf(com.tencent.mm.plugin.appbrand.service.x6 x6Var) {
        com.tencent.mm.plugin.appbrand.task.u0.C().P(com.tencent.luggage.sdk.processes.LuggageServiceType.f47626e, x6Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.service.f5
    public void c8(com.tencent.mm.plugin.appbrand.service.x6 x6Var) {
        com.tencent.mm.plugin.appbrand.task.u0.C().P(com.tencent.luggage.sdk.processes.LuggageServiceType.f47627f, x6Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.service.f5
    public void f8() {
        int i17;
        java.util.List list;
        java.util.List list2;
        if (ek1.a.c() && ek1.a.b()) {
            Yf(com.tencent.mm.plugin.appbrand.service.x6.f88834y);
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.app.p(this));
        int i18 = 0;
        int i19 = com.tencent.mm.plugin.appbrand.appusage.r0.a(false) ? 1 : 2;
        if (com.tencent.mm.plugin.appbrand.appusage.s0.f76559f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEntranceReportLogic", "reportEntranceExposed");
            com.tencent.mm.plugin.appbrand.appusage.s0.a(2, i19, false);
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        android.util.Pair c17 = rn3.i.Di().c(new vn3.c(43));
        java.lang.Object obj = c17.first;
        if (!((obj == null || (list2 = ((com.tencent.mm.plugin.newtips.model.r) obj).f152397f) == null || list2.size() <= 0 || c17.second == null) ? false : true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNewTipsUpdate", "checkUpdateNewTips has none redDot data");
            return;
        }
        java.lang.Object obj2 = c17.second;
        if (obj2 != null) {
            i17 = ((r45.pm6) obj2).f383200u;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNewTipsUpdate", "newTipsInfo.second is null");
            i17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNewTipsUpdate", "redDotTipsId:%d", java.lang.Integer.valueOf(i17));
        java.lang.Object obj3 = c17.first;
        if (obj3 != null && (list = ((com.tencent.mm.plugin.newtips.model.r) obj3).f152397f) != null && list.size() > 0) {
            for (com.tencent.mm.plugin.newtips.model.k kVar : ((com.tencent.mm.plugin.newtips.model.r) c17.first).f152397f) {
                if (kVar.field_tipId == i17 && i17 != 0) {
                    break;
                }
            }
        }
        kVar = null;
        if (kVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNewTipsUpdate", "checkUpdateNewTips newTipsInfo is null");
            return;
        }
        java.lang.String str = kVar.field_extInfo;
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                i18 = new org.json.JSONObject(str).optInt("msg_type", 0);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNewTipsUpdate", e17, "", new java.lang.Object[0]);
            }
        }
        r45.i77 i77Var = new r45.i77();
        i77Var.f376803g = str;
        i77Var.f376801e = kVar.field_uniqueId;
        i77Var.f376800d = kVar.field_tipId;
        r45.h77 h77Var = new r45.h77();
        h77Var.f375927f = kVar.field_icon_url;
        h77Var.f375926e = kVar.field_title;
        h77Var.f375925d = kVar.field_showType;
        i77Var.f376802f = h77Var;
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().getClass();
        boolean c18 = com.tencent.mm.plugin.newtips.model.e.c(kVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNewTipsUpdate", "checkUpdateNewTips extInfo:%s, canShowRedDot:%b, unique_id:%s，tips_id:%d, title:%s, icon_url:%s, show_type:%d", str, java.lang.Boolean.valueOf(c18), i77Var.f376801e, java.lang.Integer.valueOf(i77Var.f376800d), kVar.field_title, kVar.field_icon_url, java.lang.Integer.valueOf(kVar.field_showType));
        if (android.text.TextUtils.isEmpty(i77Var.f376801e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNewTipsUpdate", "checkUpdateNewTips unique_id is empty");
            return;
        }
        if (c18 && i18 == 1) {
            long j17 = currentTimeMillis - com.tencent.mm.plugin.appbrand.appusage.h2.f76454a;
            long j18 = com.tencent.mm.plugin.appbrand.appusage.h2.f76456c;
            if (j18 <= 0) {
                j18 = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_NEW_TIPS_UPDATE_INTERVAL_TIME_LONG, 60000L)).longValue();
                com.tencent.mm.plugin.appbrand.appusage.h2.f76456c = j18;
            }
            if (j17 < j18 && kVar.field_uniqueId.equals(com.tencent.mm.plugin.appbrand.appusage.h2.f76455b)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNewTipsUpdate", "checkUpdateNewTips interval:%d, lastUpdateUniqueId:%s, field_uniqueId:%s", java.lang.Long.valueOf(currentTimeMillis - com.tencent.mm.plugin.appbrand.appusage.h2.f76454a), com.tencent.mm.plugin.appbrand.appusage.h2.f76455b, kVar.field_uniqueId);
                return;
            }
            com.tencent.mm.plugin.appbrand.appusage.h2.f76454a = currentTimeMillis;
            com.tencent.mm.plugin.appbrand.appusage.h2.f76455b = kVar.field_uniqueId;
            new com.tencent.mm.plugin.appbrand.appusage.g2(i77Var, kVar).l();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.service.f5
    public java.lang.String fc(java.lang.String str, int i17, int i18, int i19) {
        if (u46.l.e(str)) {
            return "";
        }
        java.lang.String d17 = com.tencent.mm.plugin.appbrand.jsapi.media.p7.d(str, i17, i18, i19);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return d17 == null ? "" : d17;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.f5
    public java.lang.String j9() {
        return k91.n0.a();
    }

    @Override // com.tencent.mm.plugin.appbrand.service.f5
    public android.util.Pair kj(int i17) {
        return new android.util.Pair(com.tencent.mm.plugin.appbrand.appcache.p.a(i17), java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f480817dc));
    }

    @Override // com.tencent.mm.plugin.appbrand.service.f5
    public java.lang.String l2(java.lang.String str) {
        return com.tencent.mm.plugin.appbrand.v9.b(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.service.f5
    public android.util.Pair ne(android.content.Context context, com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage.Req req, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage;
        java.lang.String str5;
        java.lang.String str6;
        android.net.Uri parse = android.net.Uri.parse(str2);
        java.lang.String queryParameter = parse.getQueryParameter("host_appid");
        boolean z17 = true;
        int P = com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter("wxa_scene"), 1);
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f77322d = 7;
        appBrandLaunchReferrer.f77323e = queryParameter;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new org.json.JSONObject(str3).optString("invokeData"));
            str4 = jSONObject.getString("miniprogramAppID");
            str5 = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "__wx__/open-api-redirecting-page");
            jSONObject.put("invokeTicket", req.invokeTicket);
            jSONObject.put("wxa_scene", P);
            jSONObject.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, str);
            jSONObject.put("callbackActivity", req.callbackActivity);
            wechatNativeExtraDataInvokeFunctionalPage = new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage(null, null, null, null, false, 0, null, null, null, null, null, 0, null, null, 16383, null);
            wechatNativeExtraDataInvokeFunctionalPage.b(jSONObject);
            str6 = wechatNativeExtraDataInvokeFunctionalPage.f85559e;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMixExportLogicService", "openWeappFunctionalPageByDeepLink, get JSONException %s", e17);
            str4 = "";
            wechatNativeExtraDataInvokeFunctionalPage = null;
            str5 = "__wx__/open-api-redirecting-page";
            str6 = "";
        }
        if (android.text.TextUtils.isEmpty(str6) || android.text.TextUtils.isEmpty(str4) || wechatNativeExtraDataInvokeFunctionalPage == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMixExportLogicService", "openWeappFunctionalPageByDeepLink invalid apiName(%s) miniprogramAppID(%s) transferBuffer(%s)", str6, str4, str3);
            return android.util.Pair.create(-1, "Invalid transferJson");
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = str4;
        b1Var.f317022f = str5;
        b1Var.f317032k = 1111;
        b1Var.f317034l = queryParameter + ":" + str6;
        b1Var.f317041s = appBrandLaunchReferrer;
        b1Var.f317028i = wechatNativeExtraDataInvokeFunctionalPage;
        b1Var.f317016c = wechatNativeExtraDataInvokeFunctionalPage.f85569r;
        java.util.HashMap hashMap = com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.c.f85600a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.b bVar = (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.b) com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.c.f85600a.get(wechatNativeExtraDataInvokeFunctionalPage.f85559e);
        if (bVar == null) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FunctionalDirectApiInterceptor", "intercept by directApi[" + bVar.b() + ']');
            bVar.c(wechatNativeExtraDataInvokeFunctionalPage, b1Var);
        }
        if (z17) {
            return android.util.Pair.create(0, "OK");
        }
        java.util.Objects.requireNonNull(str6);
        if (str6.endsWith("openUrl")) {
            ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).getClass();
            com.tencent.mm.xwebutil.s0.b("com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
        return android.util.Pair.create(0, "OK");
    }

    @Override // com.tencent.mm.plugin.appbrand.service.f5
    public void v7(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.lang.String str4) {
        com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest openFileRequest = new com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest();
        openFileRequest.f81019d = str;
        openFileRequest.f81020e = str2;
        openFileRequest.f81021f = str3;
        openFileRequest.f81022g = z17;
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        java.lang.Class<com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI> cls = (java.lang.Class) com.tencent.mm.plugin.appbrand.ipc.d.f78400a.get(str4.replaceFirst(com.tencent.mm.sdk.platformtools.x2.f193072b, ""));
        if (cls == null) {
            cls = com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class;
        }
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, cls, openFileRequest, null, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.service.f5
    public java.util.List yc() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("commLib/" + com.tencent.mm.plugin.appbrand.j0.f78444e);
        arrayList.add("commLib/" + com.tencent.mm.plugin.appbrand.j0.f78445f);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.appbrand.service.o6.class);
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
        for (com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1 c1Var : ((com.tencent.mm.plugin.appbrand.appcache.predownload.export.f1) c17).wi()) {
            if (c1Var != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("firstParty/");
                sb6.append("_" + c1Var.f75780d.hashCode() + '_');
                arrayList.add(sb6.toString());
            }
        }
        return arrayList;
    }
}
