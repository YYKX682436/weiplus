package com.tencent.midas.data;

/* loaded from: classes13.dex */
public class APPluginReportManager {
    public static final java.lang.String MIDASPLUGIN_ENTER_ABILITY = "sdk.plugin.enter.ability";
    public static final java.lang.String MIDASPLUGIN_FORMAT_APKLOAD_ERROR = "sdk.loadapk_error";
    public static final java.lang.String MIDASPLUGIN_FORMAT_APKLOAD_FAIL = "sdk.loadapk_fail";
    public static final java.lang.String MIDASPLUGIN_FORMAT_TIME = "sdk.plugin.time";
    public static final java.lang.String MIDASPLUGIN_H5_INIT = "sdk.plugin.h5.init";
    public static final java.lang.String MIDASPLUGIN_H5_LOAD_JS = "sdk.plugin.h5.load.js";
    public static final java.lang.String MIDASPLUGIN_H5_PAY_HOOK = "sdk.plugin.h5.pay.hook";
    public static final java.lang.String MIDASPLUGIN_LAUNCH_PURE_H5_ERROR_REASON = "sdk.plugin.pureH5.error.reason";
    public static final java.lang.String MIDASPLUGIN_NAME_LAUNCH_ERROR = "sdk.plugin.launch.error";
    public static final java.lang.String MIDASPLUGIN_OAT_ERROR = "sdk.plugin.oat.error";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_GET_FILELIST_FROM_ASSETS = "sdk.plugin.init.getFileListFromAssets.time";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_INIT = "timename.init";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_INIT_KERNEL = "sdk.plugin.init.kernel.totaltime";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_INIT_TOTALTIME = "sdk.plugin.init.totaltime";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_INSTALL_FROM_ASSETS = "sdk.plugin.init.installFromAssets.time";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_INSTALL_FROM_LOCAL = "sdk.plugin.init.installFromLocal.time";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_IS_NEED_ASSETS_UPDATE = "sdk.plugin.init.isNeedAssetsUpdate.time";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_IS_NEED_LOCAL_UPDATE = "sdk.plugin.init.isNeedLocalUpdate.time";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_LAUNCHABILITY = "timename.launchability";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_LAUNCHINFO = "timename.launchinfo";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_LAUNCHNET = "timename.launchnet";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_LAUNCHPAY = "timename.launchpay";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_LAUNCHPAY_WAIT_INIT = "sdk.plugin.launchPay.wait.init.time";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_LAUNCHWEB = "timename.launchweb";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_LOAD_DEX = "sdk.plugin.init.loadDex.time";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_PLUGIN_VALID = "sdk.plugin.init.pluginvalid.time";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_READ_FILE_FROM_ASSETS = "sdk.plugin.init.readFileFromAssets.time";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_UNZIP_SO = "sdk.plugin.init.unzip.so.time";
    public static final java.lang.String MIDASPLUGIN_TIMENAME_WRITE_FILE_TO_DATA = "sdk.plugin.init.writeFileToData.time";
    public static final java.lang.String MIDASPLUGIN_WEBPAGE_BACK = "sdk.plugin.webpage.back";
    public static final java.lang.String MIDASPLUGIN_WEBPAGE_CLOSE = "sdk.plugin.webpage.close";
    public static final java.lang.String MIDASPLUGIN_WEBPAGE_HEAD_INIT = "sdk.plugin.webpage.head.init";
    public static final java.lang.String MIDASPLUGIN_WEBPAGE_INIT = "sdk.plugin.webpage.init";
    public static final java.lang.String MIDASPLUGIN_WEBPAGE_KEYBACK = "sdk.plugin.webpage.keyback";
    public static final java.lang.String MIDASPLUGIN_WEBPAGE_REFRESH = "sdk.plugin.webpage.refresh";
    public static final java.lang.String MIDASPLUGIN_WEBPAGE_SYSTEM = "sdk.plugin.webpage.system";
    public static final java.lang.String MIDASPLUGIN_WEBPAGE_WEBCLOSE = "sdk.plugin.webpage.webclose";
    public static final java.lang.String MIDASPLUGIN_WEBPAGE_X5 = "sdk.plugin.webpage.x5";
    public static final java.lang.String MIDASPLUGIN_WEBPAGE_X5_BACK = "sdk.plugin.webpage.x5.back";
    public static final java.lang.String MIDASPLUGIN_WEBPAGE_X5_CLOSE = "sdk.plugin.webpage.x5.close";
    public static final java.lang.String MIDASPLUGIN_WEBPAGE_X5_HEAD_INIT = "sdk.plugin.webpage.x5.head.init";
    public static final java.lang.String MIDASPLUGIN_WEBPAGE_X5_KEYBACK = "sdk.plugin.webpage.x5.keyback";
    public static final java.lang.String MIDASPLUGIN_WEBPAGE_X5_REFRESH = "sdk.plugin.webpage.x5.refresh";
    public static final java.lang.String MIDASPLUGIN_X5_INIT = "sdk.plugin.x5.init";
    public static final java.lang.String MIDASPLUGIN_X5_INIT_FAIL = "sdk.plugin.x5.init.fail";
    public static final java.lang.String MIDASPLUGIN_X5_INIT_SUCCESS = "sdk.plugin.x5.init.success";
    private static com.tencent.midas.data.APPluginReportManager gInstance;
    java.util.ArrayList<com.tencent.midas.data.APClickStreamParams> initDataReport;
    java.util.ArrayList<com.tencent.midas.data.APClickStreamParams> payDataReport;

    /* loaded from: classes13.dex */
    public static class SingletonHolder {
        private static com.tencent.midas.data.APPluginReportManager instance = new com.tencent.midas.data.APPluginReportManager();

        private SingletonHolder() {
        }
    }

    private java.lang.String constructTimeReport(java.lang.String str, long j17) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("name=");
        stringBuffer.append(str);
        stringBuffer.append("&times=");
        stringBuffer.append(j17);
        stringBuffer.append("&");
        return stringBuffer.toString();
    }

    private java.lang.String getAllReportRecord(java.util.ArrayList<com.tencent.midas.data.APClickStreamParams> arrayList) {
        int size = arrayList.size();
        if (size <= 0) {
            return null;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            i17++;
            stringBuffer.append("record" + i18 + "=");
            stringBuffer.append(reportParams2Str(arrayList.get(i18)));
            stringBuffer.append("&");
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("num=");
        stringBuffer2.append(i17);
        stringBuffer2.append("&");
        stringBuffer2.append(stringBuffer.toString());
        stringBuffer.setLength(0);
        return stringBuffer2.toString();
    }

    public static com.tencent.midas.data.APPluginReportManager getInstance() {
        return com.tencent.midas.data.APPluginReportManager.SingletonHolder.instance;
    }

    public static void initDataRelease() {
        try {
            if (getInstance() != null) {
                getInstance().initDataReport.clear();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    private void insertOneRecord(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.midas.data.APClickStreamParams aPClickStreamParams = new com.tencent.midas.data.APClickStreamParams();
        aPClickStreamParams.device = "android_v" + com.tencent.midas.api.APMidasPayAPI.getMidasPluginVersion();
        aPClickStreamParams.openid = com.tencent.midas.data.APPluginDataInterface.singleton().getOpenId();
        aPClickStreamParams.format = str2;
        aPClickStreamParams.from = str3;
        aPClickStreamParams.offerid = com.tencent.midas.data.APPluginDataInterface.singleton().getOfferId();
        aPClickStreamParams.f53141pf = com.tencent.midas.data.APPluginDataInterface.singleton().getPf();
        aPClickStreamParams.SessionId = com.tencent.midas.data.APPluginDataInterface.singleton().getSessionId();
        aPClickStreamParams.SessionType = com.tencent.midas.data.APPluginDataInterface.singleton().getSessionType();
        if (!android.text.TextUtils.isEmpty(str4)) {
            aPClickStreamParams.extend = ub.b.f(str4, 3);
        }
        int saveType = com.tencent.midas.data.APPluginDataInterface.singleton().getSaveType();
        if (saveType == 0) {
            aPClickStreamParams.savetype = "game";
        } else if (saveType == 1) {
            aPClickStreamParams.savetype = "goods";
        } else if (saveType == 2 || saveType == 3) {
            aPClickStreamParams.savetype = "acct";
        } else if (saveType == 4) {
            aPClickStreamParams.savetype = "month";
        } else if (saveType != 5) {
            aPClickStreamParams.savetype = "game";
        } else {
            aPClickStreamParams.savetype = "subscribe";
        }
        aPClickStreamParams.currentTimeMillis = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        if (str.equals(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT)) {
            com.tencent.midas.data.APInitData.singleton();
            aPClickStreamParams.dataId = com.tencent.midas.data.APInitData.getInitdataCount();
            aPClickStreamParams.VipFlags = com.tencent.midas.data.APInitData.singleton().getInitGUID();
            this.initDataReport.add(aPClickStreamParams);
            return;
        }
        aPClickStreamParams.dataId = com.tencent.midas.data.APDataId.getDataId();
        com.tencent.midas.data.APMultiProcessData processData = com.tencent.midas.data.APPluginDataInterface.singleton().getProcessData();
        if (processData != null) {
            aPClickStreamParams.VipFlags = processData.getGuid();
        }
        this.payDataReport.add(aPClickStreamParams);
    }

    private void invokeAPKReportManager(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.reflect.Method method;
        java.lang.Object obj;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.pay.data.report.APDataReportManager");
            java.lang.reflect.Method method2 = null;
            try {
                method = cls.getDeclaredMethod("getInstance", new java.lang.Class[0]);
            } catch (java.lang.NoSuchMethodException e17) {
                com.tencent.midas.comm.APLog.i("APPluginReportManager", "invokeAPKReportManager error:" + e17.toString());
                method = null;
            }
            try {
                obj = method.invoke(null, new java.lang.Object[0]);
            } catch (java.lang.Exception e18) {
                com.tencent.midas.comm.APLog.i("APPluginReportManager", "invokeAPKReportManager error:" + e18.toString());
                obj = null;
            }
            try {
                method2 = cls.getMethod("insertData", java.lang.String.class, java.lang.Integer.TYPE, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class);
            } catch (java.lang.NoSuchMethodException e19) {
                com.tencent.midas.comm.APLog.i("APPluginReportManager", "invokeAPKReportManager error:" + e19.toString());
            }
            try {
                method2.invoke(obj, str, java.lang.Integer.valueOf(i17), str2, str3, str4, str5);
            } catch (java.lang.Exception e27) {
                com.tencent.midas.comm.APLog.i("APPluginReportManager", "invokeAPKReportManager error:" + e27.toString());
            }
        } catch (java.lang.Exception e28) {
            com.tencent.midas.comm.APLog.i("APPluginReportManager", "invokeAPKReportManager error:" + e28.toString());
        }
    }

    public static void payDataRelease() {
        try {
            if (getInstance() != null) {
                getInstance().payDataReport.clear();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    private java.lang.StringBuffer reportParams2Str(com.tencent.midas.data.APClickStreamParams aPClickStreamParams) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (aPClickStreamParams == null) {
            return stringBuffer;
        }
        stringBuffer.append("3=" + aPClickStreamParams.openid);
        stringBuffer.append("|7=0");
        stringBuffer.append("|13=" + aPClickStreamParams.dataId);
        stringBuffer.append("|24=" + aPClickStreamParams.offerid);
        if (!android.text.TextUtils.isEmpty(aPClickStreamParams.payid)) {
            stringBuffer.append("|4=" + aPClickStreamParams.payid);
        }
        if (!android.text.TextUtils.isEmpty(aPClickStreamParams.isBindQQ)) {
            stringBuffer.append("|55=" + aPClickStreamParams.isBindQQ);
        }
        stringBuffer.append("|21=" + aPClickStreamParams.format);
        stringBuffer.append("|26=" + aPClickStreamParams.f53141pf);
        if (!android.text.TextUtils.isEmpty(aPClickStreamParams.token)) {
            stringBuffer.append("|56=" + aPClickStreamParams.token);
        }
        com.tencent.midas.comm.APLog.i("getLogRecord extend pre", aPClickStreamParams.extend);
        if (!android.text.TextUtils.isEmpty(aPClickStreamParams.extend)) {
            stringBuffer.append("|8=" + aPClickStreamParams.extend);
        }
        if (!android.text.TextUtils.isEmpty(aPClickStreamParams.from)) {
            stringBuffer.append("|20=" + aPClickStreamParams.from);
        }
        if (!android.text.TextUtils.isEmpty(aPClickStreamParams.savetype)) {
            stringBuffer.append("|47=" + aPClickStreamParams.savetype);
        }
        stringBuffer.append("|29=" + aPClickStreamParams.guid);
        stringBuffer.append("|31=" + aPClickStreamParams.device);
        stringBuffer.append("|38=" + aPClickStreamParams.currentTimeMillis);
        stringBuffer.append("|34=" + aPClickStreamParams.uinTypeFromSvr);
        stringBuffer.append("|35=" + aPClickStreamParams.uinFromSvr);
        stringBuffer.append("|37=" + aPClickStreamParams.SessionId);
        stringBuffer.append("|43=" + aPClickStreamParams.SessionType);
        if (!android.text.TextUtils.isEmpty(aPClickStreamParams.PayLevel)) {
            stringBuffer.append("|54=" + aPClickStreamParams.PayLevel);
        }
        if (!android.text.TextUtils.isEmpty(aPClickStreamParams.VipFlags)) {
            stringBuffer.append("|53=" + aPClickStreamParams.VipFlags);
        }
        return stringBuffer;
    }

    public synchronized void dataReport(java.lang.String str) {
        java.lang.String allReportRecord;
        if (str.equals(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT)) {
            allReportRecord = getAllReportRecord(this.initDataReport);
            initDataRelease();
        } else {
            allReportRecord = getAllReportRecord(this.payDataReport);
            payDataRelease();
        }
        if (android.text.TextUtils.isEmpty(allReportRecord)) {
            return;
        }
        if (sb.g.f405397b == null) {
            sb.g.f405397b = sb.f.f405396a;
        }
        sb.g.f405397b.a(allReportRecord, new sb.j() { // from class: com.tencent.midas.data.APPluginReportManager.2
            @Override // sb.j
            public void onError(sb.a aVar) {
            }

            @Override // sb.j
            public void onFinish(sb.a aVar) {
            }

            @Override // sb.j
            public void onStop(sb.a aVar) {
            }
        });
    }

    public void initInterfaceInit(java.lang.String str, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest) {
        java.lang.String str2;
        com.tencent.midas.data.APInitData.init();
        com.tencent.midas.data.APInitData singleton = com.tencent.midas.data.APInitData.singleton();
        try {
            str2 = java.util.UUID.randomUUID().toString();
        } catch (java.lang.Exception unused) {
            str2 = "";
        }
        singleton.setInitGUID(str2);
        com.tencent.midas.data.APInitData.singleton().setInitInterfaceTime(java.lang.System.currentTimeMillis());
        com.tencent.midas.data.APPluginDataInterface.init();
        com.tencent.midas.data.APPluginDataInterface.singleton().setLaunchInterface(str);
        com.tencent.midas.data.APMidasAnalyzeParams.getInstance().AnalyzeParams(aPMidasBaseRequest);
    }

    public void insertData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.midas.comm.APLog.i("insertTimeData interfaceName=", str + " format=" + str2 + " action=" + str3 + " extend=" + str4);
        insertOneRecord(str, str2, str3, str4);
    }

    public void insertTimeData(java.lang.String str, java.lang.String str2) {
        long j17;
        com.tencent.midas.comm.APLog.i("insertTimeData interfaceName=", str);
        com.tencent.midas.comm.APLog.i("insertTimeData timeName=", str2);
        if (android.text.TextUtils.isEmpty(com.tencent.midas.data.APPluginDataInterface.singleton().getOfferId())) {
            return;
        }
        if (str == com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - com.tencent.midas.data.APInitData.singleton().getInitInterfaceTime();
            com.tencent.midas.comm.APLog.i("时耗", "insertTimeData timeName=" + str2 + ",initTime:" + currentTimeMillis);
            insertOneRecord(str, MIDASPLUGIN_FORMAT_TIME, "", constructTimeReport(str2, currentTimeMillis));
            return;
        }
        if (com.tencent.midas.data.APPluginDataInterface.singleton().getProcessData() != null) {
            j17 = java.lang.System.currentTimeMillis() - com.tencent.midas.data.APPluginDataInterface.singleton().getProcessData().getPayInterfaceTime();
        } else {
            j17 = 0;
        }
        com.tencent.midas.comm.APLog.i("时耗", "insertTimeData timeName=" + str2 + ",payTime:" + j17);
        insertOneRecord(str, MIDASPLUGIN_FORMAT_TIME, "", constructTimeReport(str2, j17));
    }

    public void insertTimeDataEx(java.lang.String str, java.lang.String str2, long j17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        com.tencent.midas.comm.APLog.d("insertTimeDataEx", "timeName:" + str2 + ",time" + currentTimeMillis);
        insertTimeData(str, str2, currentTimeMillis);
    }

    public void payInterfaceInit(com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest, java.lang.String str) {
        java.lang.String str2;
        com.tencent.midas.data.APPluginDataInterface.init();
        com.tencent.midas.data.APPluginDataInterface.singleton().setLaunchInterface(str);
        com.tencent.midas.data.APMultiProcessData aPMultiProcessData = new com.tencent.midas.data.APMultiProcessData();
        try {
            str2 = java.util.UUID.randomUUID().toString();
        } catch (java.lang.Exception unused) {
            str2 = "";
        }
        aPMultiProcessData.setGuid(str2);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.midas.comm.APLog.i("showFirstPageInsertDB=====", "all:" + currentTimeMillis);
        aPMultiProcessData.setPayInterfaceTime(currentTimeMillis);
        if (com.tencent.midas.data.APInitData.singleton().getInitInterfaceTime() < 1) {
            aPMultiProcessData.setIntervalTime(0);
        } else {
            aPMultiProcessData.setIntervalTime((int) (java.lang.System.currentTimeMillis() - com.tencent.midas.data.APInitData.singleton().getInitInterfaceTime()));
        }
        com.tencent.midas.data.APPluginDataInterface.singleton().setProcessData(aPMultiProcessData);
        com.tencent.midas.data.APMidasAnalyzeParams.getInstance().setSaveType(aPMidasBaseRequest);
        com.tencent.midas.data.APMidasAnalyzeParams.getInstance().AnalyzeParams(aPMidasBaseRequest);
    }

    public void reportDirectRecord(com.tencent.midas.api.request.APMidasDirectRequest aPMidasDirectRequest, java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = "";
        try {
            com.tencent.midas.data.APMidasAnalyzeParams.getInstance().AnalyzeParams(aPMidasDirectRequest);
            com.tencent.midas.data.APClickStreamParams aPClickStreamParams = new com.tencent.midas.data.APClickStreamParams();
            aPClickStreamParams.device = "android_v" + com.tencent.midas.api.APMidasPayAPI.getMidasPluginVersion();
            aPClickStreamParams.openid = com.tencent.midas.data.APPluginDataInterface.singleton().getOpenId();
            aPClickStreamParams.format = str;
            aPClickStreamParams.from = "";
            aPClickStreamParams.offerid = com.tencent.midas.data.APPluginDataInterface.singleton().getOfferId();
            aPClickStreamParams.f53141pf = com.tencent.midas.data.APPluginDataInterface.singleton().getPf();
            aPClickStreamParams.SessionId = com.tencent.midas.data.APPluginDataInterface.singleton().getSessionId();
            aPClickStreamParams.SessionType = com.tencent.midas.data.APPluginDataInterface.singleton().getSessionType();
            if (!android.text.TextUtils.isEmpty(str2)) {
                aPClickStreamParams.extend = ub.b.f(str2, 3);
            }
            int saveType = com.tencent.midas.data.APPluginDataInterface.singleton().getSaveType();
            if (saveType == 0) {
                aPClickStreamParams.savetype = "game";
            } else if (saveType == 1) {
                aPClickStreamParams.savetype = "goods";
            } else if (saveType == 2 || saveType == 3) {
                aPClickStreamParams.savetype = "acct";
            } else if (saveType == 4) {
                aPClickStreamParams.savetype = "month";
            } else if (saveType != 5) {
                aPClickStreamParams.savetype = "game";
            } else {
                aPClickStreamParams.savetype = "subscribe";
            }
            aPClickStreamParams.currentTimeMillis = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            aPClickStreamParams.dataId = com.tencent.midas.data.APDataId.getDataId();
            try {
                str3 = java.util.UUID.randomUUID().toString();
            } catch (java.lang.Exception unused) {
            }
            aPClickStreamParams.VipFlags = str3;
            java.util.ArrayList<com.tencent.midas.data.APClickStreamParams> arrayList = new java.util.ArrayList<>();
            arrayList.add(aPClickStreamParams);
            java.lang.String allReportRecord = getAllReportRecord(arrayList);
            if (android.text.TextUtils.isEmpty(allReportRecord)) {
                return;
            }
            if (sb.g.f405397b == null) {
                sb.g.f405397b = sb.f.f405396a;
            }
            sb.g.f405397b.b(aPMidasDirectRequest, allReportRecord, new sb.j() { // from class: com.tencent.midas.data.APPluginReportManager.3
                @Override // sb.j
                public void onError(sb.a aVar) {
                }

                @Override // sb.j
                public void onFinish(sb.a aVar) {
                }

                @Override // sb.j
                public void onStop(sb.a aVar) {
                }
            });
        } catch (java.lang.Exception e17) {
            com.tencent.midas.comm.APLog.i("APPluginReportManager", "reportDirectRecord error:" + e17.toString());
        }
    }

    public void reportImmediatelyOneRecord(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.midas.data.APClickStreamParams aPClickStreamParams = new com.tencent.midas.data.APClickStreamParams();
        aPClickStreamParams.device = "android_v" + com.tencent.midas.api.APMidasPayAPI.getMidasPluginVersion();
        aPClickStreamParams.openid = com.tencent.midas.data.APPluginDataInterface.singleton().getOpenId();
        aPClickStreamParams.format = str2;
        aPClickStreamParams.from = "";
        aPClickStreamParams.offerid = com.tencent.midas.data.APPluginDataInterface.singleton().getOfferId();
        aPClickStreamParams.f53141pf = com.tencent.midas.data.APPluginDataInterface.singleton().getPf();
        aPClickStreamParams.SessionId = com.tencent.midas.data.APPluginDataInterface.singleton().getSessionId();
        aPClickStreamParams.SessionType = com.tencent.midas.data.APPluginDataInterface.singleton().getSessionType();
        if (!android.text.TextUtils.isEmpty(str3)) {
            aPClickStreamParams.extend = ub.b.f(str3, 3);
        }
        int saveType = com.tencent.midas.data.APPluginDataInterface.singleton().getSaveType();
        if (saveType == 0) {
            aPClickStreamParams.savetype = "game";
        } else if (saveType == 1) {
            aPClickStreamParams.savetype = "goods";
        } else if (saveType == 2 || saveType == 3) {
            aPClickStreamParams.savetype = "acct";
        } else if (saveType == 4) {
            aPClickStreamParams.savetype = "month";
        } else if (saveType != 5) {
            aPClickStreamParams.savetype = "game";
        } else {
            aPClickStreamParams.savetype = "subscribe";
        }
        aPClickStreamParams.currentTimeMillis = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        if (str.equals(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT)) {
            com.tencent.midas.data.APInitData.singleton();
            aPClickStreamParams.dataId = com.tencent.midas.data.APInitData.getInitdataCount();
            aPClickStreamParams.VipFlags = com.tencent.midas.data.APInitData.singleton().getInitGUID();
        } else {
            aPClickStreamParams.dataId = com.tencent.midas.data.APDataId.getDataId();
            com.tencent.midas.data.APMultiProcessData processData = com.tencent.midas.data.APPluginDataInterface.singleton().getProcessData();
            if (processData != null) {
                aPClickStreamParams.VipFlags = processData.getGuid();
            }
        }
        java.util.ArrayList<com.tencent.midas.data.APClickStreamParams> arrayList = new java.util.ArrayList<>();
        arrayList.add(aPClickStreamParams);
        java.lang.String allReportRecord = getAllReportRecord(arrayList);
        if (android.text.TextUtils.isEmpty(allReportRecord)) {
            return;
        }
        if (sb.g.f405397b == null) {
            sb.g.f405397b = sb.f.f405396a;
        }
        sb.g.f405397b.a(allReportRecord, new sb.j() { // from class: com.tencent.midas.data.APPluginReportManager.1
            @Override // sb.j
            public void onError(sb.a aVar) {
            }

            @Override // sb.j
            public void onFinish(sb.a aVar) {
            }

            @Override // sb.j
            public void onStop(sb.a aVar) {
            }
        });
    }

    private APPluginReportManager() {
        this.initDataReport = null;
        this.payDataReport = null;
        this.initDataReport = new java.util.ArrayList<>();
        this.payDataReport = new java.util.ArrayList<>();
    }

    public void insertTimeData(java.lang.String str, java.lang.String str2, long j17) {
        com.tencent.midas.comm.APLog.d("insertTimeData interfaceName=", str + " timeName=" + str2 + " time=" + java.lang.String.valueOf(j17));
        if (android.text.TextUtils.isEmpty(com.tencent.midas.data.APPluginDataInterface.singleton().getOfferId())) {
            return;
        }
        if (str == com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT) {
            insertOneRecord(str, MIDASPLUGIN_FORMAT_TIME, "", constructTimeReport(str2, j17));
        } else {
            insertOneRecord(str, MIDASPLUGIN_FORMAT_TIME, "", constructTimeReport(str2, j17));
        }
    }
}
