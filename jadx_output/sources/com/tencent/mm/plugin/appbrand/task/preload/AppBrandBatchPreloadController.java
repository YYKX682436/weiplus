package com.tencent.mm.plugin.appbrand.task.preload;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class, com.tencent.mm.plugin.appbrand.app.r9.class})
/* loaded from: classes7.dex */
public class AppBrandBatchPreloadController extends i95.w implements com.tencent.mm.plugin.appbrand.preload.IAppBrandBatchPreloadController {
    private static final java.lang.String TAG = "MicroMsg.Predownload.AppBrandBatchPreloadController";
    private int mBusinessScene = 0;
    private boolean mIsGameEnv = false;

    /* loaded from: classes7.dex */
    public static class a implements com.tencent.mm.ipcinvoker.j {
        private a() {
        }

        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController.TAG, "IPC_PreloadNextGame.invoke()");
            com.tencent.mm.plugin.appbrand.task.u0.C().P(com.tencent.luggage.sdk.processes.LuggageServiceType.f47627f, com.tencent.mm.plugin.appbrand.service.x6.f88827r);
        }
    }

    /* loaded from: classes7.dex */
    public static class b implements com.tencent.mm.ipcinvoker.j {
        private b() {
        }

        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController.TaskParamsCallPredownload taskParamsCallPredownload = (com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController.TaskParamsCallPredownload) obj;
            if (taskParamsCallPredownload == null) {
                com.tencent.mars.xlog.Log.e(com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController.TAG, "invoke in mm, NULL data");
            } else {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.task.preload.e(this, taskParamsCallPredownload));
                rVar.a(null);
            }
        }
    }

    private void dealPreload(com.tencent.mm.plugin.appbrand.task.preload.k kVar, com.tencent.mm.plugin.appbrand.task.preload.PreloadAppInfo preloadAppInfo) {
        int ordinal = kVar.ordinal();
        if (ordinal == 0) {
            preloadMiniProgramEnv(preloadAppInfo.appType, com.tencent.mm.plugin.appbrand.task.preload.PRELOAD_ENV_LEVEL.LOW_LEVEL, true);
            return;
        }
        if (ordinal == 1) {
            preloadMiniProgramEnv(preloadAppInfo.appType, com.tencent.mm.plugin.appbrand.task.preload.PRELOAD_ENV_LEVEL.MIDDLE_LEVEL, true);
            predownloadPlugins(preloadAppInfo);
        } else {
            if (ordinal != 2) {
                return;
            }
            preloadMiniProgramEnv(preloadAppInfo.appType, com.tencent.mm.plugin.appbrand.task.preload.PRELOAD_ENV_LEVEL.HIGH_LEVEL, true);
            predownloadAllPackages(preloadAppInfo);
        }
    }

    private void predownloadAllPackages(com.tencent.mm.plugin.appbrand.task.preload.PreloadAppInfo preloadAppInfo) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController.TaskParamsCallPredownload(preloadAppInfo.appId, preloadAppInfo.appType, preloadAppInfo.path, this.mBusinessScene, false, ""), com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController.b.class, new com.tencent.mm.plugin.appbrand.task.preload.d(this));
    }

    private void predownloadPlugins(com.tencent.mm.plugin.appbrand.task.preload.PreloadAppInfo preloadAppInfo) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController.TaskParamsCallPredownload(preloadAppInfo.appId, preloadAppInfo.appType, preloadAppInfo.path, this.mBusinessScene, true, ""), com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController.b.class, new com.tencent.mm.plugin.appbrand.task.preload.c(this));
    }

    private void preloadMiniProgramEnv(int i17, com.tencent.mm.plugin.appbrand.task.preload.PRELOAD_ENV_LEVEL preload_env_level, boolean z17) {
        com.tencent.mm.plugin.appbrand.task.x0 x0Var;
        com.tencent.mm.plugin.appbrand.task.x0 x0Var2 = com.tencent.mm.plugin.appbrand.task.x0.NIL;
        com.tencent.mm.plugin.appbrand.task.x0 x0Var3 = com.tencent.mm.plugin.appbrand.task.x0.WAGAME;
        if (i17 == 1004) {
            x0Var = x0Var3;
        } else {
            if (i17 == 1000) {
                x0Var2 = com.tencent.mm.plugin.appbrand.task.x0.WASERVICE;
            }
            x0Var = x0Var2;
        }
        if (!ha1.m.a() && this.mIsGameEnv && x0Var == x0Var3) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController.a.class, null);
            return;
        }
        if (!com.tencent.mm.plugin.appbrand.task.r.b(x0Var)) {
            if (com.tencent.mm.plugin.appbrand.task.r.m(x0Var)) {
                com.tencent.mars.xlog.Log.i(TAG, "preloadMiniProgramEnv alreadyExist");
                return;
            } else {
                com.tencent.mars.xlog.Log.i(TAG, "preloadMiniProgramEnv fail internal error");
                return;
            }
        }
        boolean z18 = x0Var == x0Var3;
        com.tencent.mm.plugin.appbrand.task.preload.w wVar = com.tencent.mm.plugin.appbrand.task.preload.x.f89149a;
        int i18 = z18 ? 1539 : 1144;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.appbrand.service.x6 x6Var = com.tencent.mm.plugin.appbrand.service.x6.f88832w;
        g0Var.A(i18, 49);
        com.tencent.mm.plugin.appbrand.task.r.j(x0Var, new com.tencent.mm.plugin.appbrand.task.preload.b(this, i18), z17, null, x6Var, 2);
    }

    @Override // com.tencent.mm.plugin.appbrand.preload.IAppBrandBatchPreloadController
    public java.lang.String preload(org.json.JSONObject jSONObject, boolean z17) {
        int i17;
        float floatValue;
        float floatValue2;
        float floatValue3;
        this.mIsGameEnv = z17;
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.optString("openParams"));
            int optInt = jSONObject2.optInt("visitScene");
            this.mBusinessScene = jSONObject2.optInt("businessScene");
            int optInt2 = jSONObject2.optInt("innerScene");
            if (this.mBusinessScene == 0) {
                return "fail:mBusinessScene illegal";
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("preloadList"));
            if (jSONArray.length() <= 0) {
                com.tencent.mars.xlog.Log.w(TAG, "preloadList is empty");
                return "fail:preloadList is empty";
            }
            if (com.tencent.mm.plugin.appbrand.task.preload.j.f89132a == null) {
                synchronized (com.tencent.mm.plugin.appbrand.task.preload.j.class) {
                    if (com.tencent.mm.plugin.appbrand.task.preload.j.f89132a == null) {
                        com.tencent.mm.plugin.appbrand.task.preload.j.f89132a = new com.tencent.mm.plugin.appbrand.task.preload.j();
                    }
                }
            }
            java.util.Map a17 = com.tencent.mm.plugin.appbrand.task.preload.j.f89132a.a(this.mBusinessScene, optInt2);
            if ((a17 == null || a17.size() <= 0) && (i17 = this.mBusinessScene) != 1) {
                com.tencent.mars.xlog.Log.e(TAG, "predictRate null businessScene:%d,innerScene:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(optInt2));
                return "fail:mBusinessScene predictRate error!";
            }
            if (this.mBusinessScene == 1) {
                floatValue = 0.0f;
                if (a17 != null && a17.size() > 0) {
                    floatValue2 = ((java.lang.Float) a17.get(1)).floatValue();
                    floatValue3 = ((java.lang.Float) a17.get(2)).floatValue();
                }
                com.tencent.mars.xlog.Log.e(TAG, "inner predictRate null businessScene:%d,innerScene:%d", java.lang.Integer.valueOf(this.mBusinessScene), java.lang.Integer.valueOf(optInt2));
                floatValue2 = 1.0f;
                floatValue3 = 1.0f;
            } else {
                floatValue = ((java.lang.Float) a17.get(0)).floatValue();
                floatValue2 = ((java.lang.Float) a17.get(1)).floatValue();
                floatValue3 = ((java.lang.Float) a17.get(2)).floatValue();
            }
            com.tencent.mars.xlog.Log.i(TAG, "mVisitScene:%d,mBusinessScene:%d,mInnerScene:%d,mLowLevelRate:%f,middleLevelRate:%f,highLevelRate:%f", java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(this.mBusinessScene), java.lang.Integer.valueOf(optInt2), java.lang.Float.valueOf(floatValue), java.lang.Float.valueOf(floatValue2), java.lang.Float.valueOf(floatValue3));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i18);
                com.tencent.mm.plugin.appbrand.task.preload.PreloadAppInfo preloadAppInfo = new com.tencent.mm.plugin.appbrand.task.preload.PreloadAppInfo();
                preloadAppInfo.openRate = (float) optJSONObject.optDouble("openRate");
                preloadAppInfo.appId = optJSONObject.optString("appId");
                preloadAppInfo.appType = optJSONObject.optInt("appType");
                preloadAppInfo.path = optJSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPreloadOpenRateStatisStruct weAppQualityPreloadOpenRateStatisStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPreloadOpenRateStatisStruct();
                weAppQualityPreloadOpenRateStatisStruct.f62639d = optInt;
                weAppQualityPreloadOpenRateStatisStruct.f62640e = this.mBusinessScene;
                weAppQualityPreloadOpenRateStatisStruct.f62641f = optInt2;
                weAppQualityPreloadOpenRateStatisStruct.f62642g = weAppQualityPreloadOpenRateStatisStruct.b("AppId", preloadAppInfo.appId, true);
                weAppQualityPreloadOpenRateStatisStruct.f62643h = preloadAppInfo.appType;
                weAppQualityPreloadOpenRateStatisStruct.f62645j = weAppQualityPreloadOpenRateStatisStruct.b("openRate", java.lang.String.valueOf(preloadAppInfo.openRate), true);
                weAppQualityPreloadOpenRateStatisStruct.f62644i = weAppQualityPreloadOpenRateStatisStruct.b(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, preloadAppInfo.path, true);
                weAppQualityPreloadOpenRateStatisStruct.k();
                float f17 = preloadAppInfo.openRate;
                if (f17 < floatValue) {
                    com.tencent.mars.xlog.Log.i(TAG, "preloadAppInfo.openRate:%f < mLowLevelRate:%f", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(floatValue));
                } else {
                    arrayList.add(preloadAppInfo);
                }
            }
            if (arrayList.size() <= 0) {
                return "ok";
            }
            java.util.Collections.sort(arrayList, new com.tencent.mm.plugin.appbrand.task.preload.a(this));
            com.tencent.mm.plugin.appbrand.task.preload.PreloadAppInfo preloadAppInfo2 = (com.tencent.mm.plugin.appbrand.task.preload.PreloadAppInfo) arrayList.get(0);
            com.tencent.mars.xlog.Log.i(TAG, "high preloadAppInfo openRate:%f,appid:%s", java.lang.Float.valueOf(preloadAppInfo2.openRate), preloadAppInfo2.appId);
            float f18 = preloadAppInfo2.openRate;
            if (f18 >= floatValue3) {
                dealPreload(com.tencent.mm.plugin.appbrand.task.preload.k.HIGH_LEVEL, preloadAppInfo2);
                return "ok";
            }
            if (f18 >= floatValue2) {
                dealPreload(com.tencent.mm.plugin.appbrand.task.preload.k.MIDDLE_LEVEL, preloadAppInfo2);
                return "ok";
            }
            dealPreload(com.tencent.mm.plugin.appbrand.task.preload.k.LOW_LEVEL, preloadAppInfo2);
            return "ok";
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e(TAG, "parse data error:%s", e17);
            return "fail:params error!";
        }
    }

    /* loaded from: classes7.dex */
    public static class TaskParamsCallPredownload implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController.TaskParamsCallPredownload> CREATOR = new com.tencent.mm.plugin.appbrand.task.preload.f();

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f89116d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f89117e;

        /* renamed from: f, reason: collision with root package name */
        public final int f89118f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f89119g;

        /* renamed from: h, reason: collision with root package name */
        public final int f89120h;

        /* renamed from: i, reason: collision with root package name */
        public final java.lang.String f89121i;

        public TaskParamsCallPredownload(java.lang.String str, int i17, java.lang.String str2, int i18, boolean z17, java.lang.String str3) {
            this.f89116d = str;
            this.f89120h = i17;
            this.f89117e = str2;
            this.f89118f = i18;
            this.f89119g = z17;
            this.f89121i = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f89116d);
            parcel.writeInt(this.f89120h);
            parcel.writeString(this.f89117e);
            parcel.writeInt(this.f89118f);
            parcel.writeInt(this.f89119g ? 1 : 0);
            parcel.writeString(this.f89121i);
        }

        public TaskParamsCallPredownload(android.os.Parcel parcel) {
            this.f89116d = parcel.readString();
            this.f89120h = parcel.readInt();
            this.f89117e = parcel.readString();
            this.f89118f = parcel.readInt();
            this.f89119g = parcel.readInt() == 1;
            this.f89121i = parcel.readString();
        }
    }
}
