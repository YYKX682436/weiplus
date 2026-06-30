package com.tencent.cloud.huiyan.api;

/* loaded from: classes14.dex */
public class HuiYanSdkV2 {
    private byte _hellAccFlag_;

    private HuiYanSdkV2() {
    }

    public static void closeAuthView() {
        int i17 = ic.d.f290281k;
        com.tencent.cloud.huiyan.entity.AuthUiConfig e17 = ic.c.f290280a.e();
        if (e17 == null || !e17.isKeepAuthView()) {
            return;
        }
        mc.q qVar = mc.p.f325531a;
        qVar.b("HuiYanBaseApi", "call close.");
        try {
            lc.i a17 = mc.a.f325494a.a();
            if (a17 == null || a17.getActivity() == null || a17.getActivity().isFinishing()) {
                return;
            }
            qVar.b("HuiYanBaseApi", "call finish.");
            a17.getActivity().finish();
        } catch (java.lang.Exception e18) {
            mc.p.f325531a.e("HuiYanBaseApi", "close method error: " + e18.getMessage());
        }
    }

    public static java.lang.String getVersion() {
        int i17 = ic.d.f290281k;
        ic.c.f290280a.getClass();
        return com.tencent.cloud.huiyan.api.HuiYanNativeApi.getVersion();
    }

    public static void init(android.content.Context context) {
        java.lang.String str;
        int i17 = ic.d.f290281k;
        ic.d dVar = ic.c.f290280a;
        if (context == null) {
            dVar.getClass();
            return;
        }
        dVar.f290285d = true;
        dVar.f290282a = new java.lang.ref.WeakReference(context.getApplicationContext());
        pc.j jVar = pc.i.f353208a;
        if (!jVar.f353209a) {
            jVar.f353209a = true;
            java.io.File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(externalFilesDir);
                java.lang.String str2 = java.io.File.separator;
                sb6.append(str2);
                sb6.append("cloud-huiyan");
                sb6.append(str2);
                sb6.append("log");
                str = sb6.toString();
            } else {
                str = "";
            }
            if (android.text.TextUtils.isEmpty(str)) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(context.getFilesDir());
                java.lang.String str3 = java.io.File.separator;
                sb7.append(str3);
                sb7.append("cloud-huiyan");
                sb7.append(str3);
                sb7.append("log");
                str = sb7.toString();
            }
            com.tencent.cloud.component.common.ai.log.AiLog.init(new com.tencent.cloud.component.common.ai.log.AiLogger(context, new com.tencent.cloud.component.common.ai.log.AiLogConfig.AiLogConfigBuilder().setDirLog(str).setLogCat(true).setLogName("huiyan-log").setMinLevel(3).setDefaultTag("[hy-sdk-log]").setOpen(true).setFileOutTime(259200000L).create()));
        }
        oc.h hVar = oc.g.f344101a;
        try {
            hVar.f344104c = new kc.c();
            hVar.c();
            hVar.f344102a = false;
            hVar.f344105d.getClass();
            mc.p.f325531a.b("TuringSdkHelper", "call turing interface init finish");
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException e17) {
            mc.p.f325531a.e("TuringSdkHelper", "create and init turing help error " + e17.getLocalizedMessage());
            hVar.f344105d = null;
            hVar.f344107f = false;
        }
        com.tencent.cloud.component.common.ai.utils.CloudCrashHandler.instance().init(context, "huiyan", true, "com.tencent.cloud.huiyan", false);
        com.tencent.cloud.component.common.ai.utils.CloudCrashHandler.instance().addCrashListener(new ic.a());
        mc.p.f325531a.b("HuiYanBaseApi", "call huiyan init");
    }

    public static void release() {
        int i17 = ic.d.f290281k;
        ic.c.f290280a.f();
    }

    public static void setHuiYanSdkEventCallback(com.tencent.cloud.huiyan.callback.HuiYanSdkEventCallBack huiYanSdkEventCallBack) {
        int i17 = ic.d.f290281k;
        ic.c.f290280a.f290287f = huiYanSdkEventCallBack;
    }

    public static void setHuiYanSdkExtraCallBack(jc.c cVar) {
        int i17 = ic.d.f290281k;
        ic.c.f290280a.getClass();
    }

    public static void setLoggerCallback(java.lang.String str, com.tencent.cloud.huiyan.callback.LoggerInfoCallBack loggerInfoCallBack) {
        int i17 = ic.d.f290281k;
        ic.c.f290280a.getClass();
        mc.q qVar = mc.p.f325531a;
        synchronized (qVar.f325533b) {
            qVar.f325534c = str;
            qVar.f325535d = loggerInfoCallBack;
            if (qVar.f325536e == null) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("logger-thread");
                qVar.f325536e = handlerThread;
                handlerThread.start();
                qVar.f325537f = new mc.n(qVar, qVar.f325536e.getLooper());
            }
        }
    }

    public static void startAuthByLightData(java.lang.String str) {
        int initYtLiveness;
        int i17 = ic.d.f290281k;
        ic.d dVar = ic.c.f290280a;
        dVar.getClass();
        dVar.c(com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.START_AUTH);
        mc.q qVar = mc.p.f325531a;
        qVar.b("HuiYanBaseApi", "thread: " + java.lang.Thread.currentThread().getName());
        com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig = dVar.f290290i;
        if (huiYanSdkConfig == null) {
            qVar.e("HuiYanNativeUtils", "huiYanSdkConfig is null");
            initYtLiveness = -111;
        } else {
            com.tencent.cloud.huiyan.api.HuiYanNativeApi.releaseYtLiveness();
            com.tencent.cloud.huiyan.entity.YTLivenessConfig yTLivenessConfig = new com.tencent.cloud.huiyan.entity.YTLivenessConfig();
            yTLivenessConfig.setYtLightData(str);
            yTLivenessConfig.setActionTimeout(huiYanSdkConfig.getAuthTimeOutMs());
            yTLivenessConfig.setPrepareTimeout(huiYanSdkConfig.getPrepareFaceTimeOutMs());
            yTLivenessConfig.setNeedEncrypt(!huiYanSdkConfig.isCloseEncrypt());
            yTLivenessConfig.setEnhanceEncryptMethod(huiYanSdkConfig.getEncryptMode());
            yTLivenessConfig.setLandscape(huiYanSdkConfig.isLandMode());
            yTLivenessConfig.setLivenessMode(dVar.f290289h ? 3 : 4);
            yTLivenessConfig.setResourceDownloadPath(huiYanSdkConfig.getUseCustomerModelPath());
            java.lang.String json = new com.tencent.cloud.component.common.ai.json.WeJson().toJson(yTLivenessConfig, 1);
            qVar.b("HuiYanNativeUtils", "start initYtLivenessSdk!");
            initYtLiveness = com.tencent.cloud.huiyan.api.HuiYanNativeApi.initYtLiveness(json);
        }
        if (initYtLiveness == 0) {
            mc.d.f325515a.a(com.tencent.cloud.huiyan.enums.AuthState.START_CAMERA_PREVIEW, null);
            return;
        }
        dVar.b(228, "initYtLivenessSdk  code : " + initYtLiveness);
        qVar.e("HuiYanBaseApi", "initYtLivenessSdk return code : " + initYtLiveness);
    }

    public static void startHuiYanCheck(com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig, com.tencent.cloud.huiyan.callback.HuiYanSdkCallBack huiYanSdkCallBack) {
        android.content.Context startActivityContext;
        int i17 = ic.d.f290281k;
        ic.d dVar = ic.c.f290280a;
        boolean z17 = true;
        dVar.f290289h = true;
        dVar.f290288g = huiYanSdkCallBack;
        dVar.f290290i = huiYanSdkConfig;
        dVar.f290286e = com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NONE;
        dVar.f290284c = false;
        dVar.f290285d = false;
        mc.q qVar = mc.p.f325531a;
        qVar.e("HuiYanBaseApi", "realStartCheckWithConfig!");
        com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig2 = dVar.f290290i;
        if (huiYanSdkConfig2 == null) {
            dVar.b(211, "start huiYanSdkConfig is null");
            return;
        }
        int initAuthByFileOrString = com.tencent.cloud.huiyan.api.HuiYanNativeApi.initAuthByFileOrString(huiYanSdkConfig2.getAuthLicense(), "", "", com.tencent.cloud.huiyan.api.HuiYanNativeApi.getAssetManager());
        if (initAuthByFileOrString != 0) {
            dVar.b(211, "init youtu init auth return code : " + initAuthByFileOrString);
            return;
        }
        qVar.b("HuiYanBaseApi", "license check success!");
        java.lang.ref.WeakReference weakReference = dVar.f290283b;
        android.content.Context context = weakReference == null ? null : (android.content.Context) weakReference.get();
        if (context == null) {
            context = dVar.a();
        }
        if (context == null) {
            dVar.b(216, "please call init() function first!");
            return;
        }
        com.tencent.cloud.huiyan.entity.AuthUiConfig e17 = dVar.e();
        if (e17 != null && (startActivityContext = e17.getStartActivityContext()) != null) {
            z17 = false;
            context = startActivityContext;
        }
        com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig3 = dVar.f290290i;
        android.content.Intent intent = (huiYanSdkConfig3 == null || !huiYanSdkConfig3.isLandMode()) ? new android.content.Intent(context, (java.lang.Class<?>) com.tencent.cloud.huiyan.activities.MainAuthActivity.class) : new android.content.Intent(context, (java.lang.Class<?>) com.tencent.cloud.huiyan.activities.LandMainAuthActivity.class);
        qVar.b("HuiYanBaseApi", "useAppContext: " + z17);
        if (z17) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/cloud/huiyan/api/HuiYanSdkV2", "startHuiYanCheck", "(Lcom/tencent/cloud/huiyan/entity/HuiYanSdkConfig;Lcom/tencent/cloud/huiyan/callback/HuiYanSdkCallBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/cloud/huiyan/api/HuiYanSdkV2", "startHuiYanCheck", "(Lcom/tencent/cloud/huiyan/entity/HuiYanSdkConfig;Lcom/tencent/cloud/huiyan/callback/HuiYanSdkCallBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.cloud.component.common.ai.utils.ThreadPoolUtil.getInstance().addWork(new ic.b(dVar));
    }

    public static void stopAuthAction(final int i17, final java.lang.String str) {
        int i18 = ic.d.f290281k;
        ic.c.f290280a.getClass();
        lc.i a17 = mc.a.f325494a.a();
        if (!(a17 instanceof lc.g)) {
            mc.p.f325531a.e("HuiYanBaseApi", "current fragment is null!");
            pc.f.c(i17, str);
        } else {
            final lc.g gVar = (lc.g) a17;
            gVar.getClass();
            mc.p.f325531a.b("AuthingFragment", ">>>local auth fail");
            gVar.a(new java.lang.Runnable() { // from class: lc.g$$c
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.cloud.huiyan.view.LoadingFrontAnimatorView loadingFrontAnimatorView = lc.g.this.f317814o;
                    if (loadingFrontAnimatorView != null) {
                        loadingFrontAnimatorView.c(true);
                    }
                    int i19 = i17;
                    java.lang.String str2 = str;
                    pc.f.c(i19, str2);
                    mc.p.f325531a.e("AuthingFragment", "local auth fail! code: " + i19 + " msg: " + str2);
                }
            });
        }
    }
}
