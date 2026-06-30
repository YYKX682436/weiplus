package com.tencent.mm.opensdk.openapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class WXAPiSecurityHelper {
    private static final int MAX_STORE_KEY = 100;
    private static final int MAX_STORE_VALUE = 2048;
    private static final java.lang.String SECURITY_KEY_TIMESTAMP_SECOND = "security_key_timestamp_second";
    private static final java.lang.String STORE_VALUE_DATA = "security_key_resp";
    private static final java.lang.String TAG = "MicroMsg.SDK.WXAPiSecurityHelper";
    private final android.content.Context context;
    private final java.util.concurrent.CopyOnWriteArraySet<java.lang.String> overtimeSyncReqSet = new java.util.concurrent.CopyOnWriteArraySet<>();

    /* renamed from: sp, reason: collision with root package name */
    private final android.content.SharedPreferences f72358sp;

    /* loaded from: classes6.dex */
    public static class CheckRuleResult {
        public static final int NoPass = 2;
        public static final int Pass = 1;
        public static final int Unknown = 0;

        private CheckRuleResult() {
        }
    }

    /* loaded from: classes6.dex */
    public static class ExtraSecurityCheckRes {
        public static final int Directly_NoPass = 1;
        public static final int Directly_Pass = 0;
        public static final int Need_Deep_Check = 2;
    }

    /* loaded from: classes15.dex */
    public interface IHttpCheckCallback {
        void onHttpCheckFinish(com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PromiseShareRule promiseShareRule);
    }

    /* loaded from: classes6.dex */
    public interface ISecurityCheck {
        void onCheckFinish(boolean z17);
    }

    /* loaded from: classes6.dex */
    public interface ISecuritySyncCheck {
        void onSyncCheckFinish(boolean z17);
    }

    /* loaded from: classes15.dex */
    public static class PassContext {
        java.lang.String appid;
        java.lang.String inputUrl;
        com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PromiseShareRule localRule;
        java.lang.String reqSessionId;
        java.lang.String version;

        private PassContext() {
            this.reqSessionId = "";
            this.appid = "";
            this.inputUrl = "";
            this.version = "";
            this.localRule = new com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PromiseShareRule();
        }
    }

    /* loaded from: classes15.dex */
    public static class PromiseShareRule {
        java.lang.String appidInRule;
        java.lang.String buffer;
        public long nextRequestIntervalSecond;
        java.lang.String orgJsonData;
        java.lang.String reqAppid;
        int state;
        java.util.List<com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.UrlRule> urlRuleList;
        long userWaitTimeMs;

        private PromiseShareRule() {
            this.orgJsonData = "";
            this.reqAppid = "";
            this.appidInRule = "";
            this.urlRuleList = new java.util.ArrayList();
            this.buffer = "";
        }

        public long getLegalReqInterval() {
            long j17 = this.nextRequestIntervalSecond;
            if (j17 <= 0 || j17 >= 86400) {
                j17 = 3600;
            }
            com.tencent.mm.opensdk.utils.Log.d(com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.TAG, "getLegalReqInterval = ".concat(java.lang.String.valueOf(j17)));
            return j17;
        }

        public long getLegalUserWaitTime() {
            long j17 = this.userWaitTimeMs;
            if (j17 <= 100 || j17 >= 60000) {
                j17 = 5000;
            }
            com.tencent.mm.opensdk.utils.Log.d(com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.TAG, "getLegalUserWaitTime = ".concat(java.lang.String.valueOf(j17)));
            return j17;
        }
    }

    /* loaded from: classes6.dex */
    public static class RuleState {
        public static final int InRule = 1;
        public static final int None = 0;
        public static final int NotInRule = 2;

        private RuleState() {
        }
    }

    /* loaded from: classes15.dex */
    public static class UrlRule {
        java.lang.String host;
        java.util.List<java.lang.String> mustQueryKey;

        private UrlRule() {
            this.host = "";
            this.mustQueryKey = new java.util.ArrayList();
        }
    }

    /* loaded from: classes15.dex */
    public static class WXSecurityData {
        java.lang.String appid;
        long lastStoreTimeStampSecond;
        java.lang.String respDataJson;

        private WXSecurityData() {
            this.appid = "";
            this.respDataJson = "";
        }

        public boolean isBasicParamsAllowed() {
            long j17 = this.lastStoreTimeStampSecond;
            return ((j17 > 0L ? 1 : (j17 == 0L ? 0 : -1)) > 0 && (j17 > (java.lang.System.currentTimeMillis() / 1000) ? 1 : (j17 == (java.lang.System.currentTimeMillis() / 1000) ? 0 : -1)) < 0) && (com.tencent.mm.opensdk.utils.d.b(this.appid) ^ true) && (com.tencent.mm.opensdk.utils.d.b(this.respDataJson) ^ true);
        }
    }

    public WXAPiSecurityHelper(android.content.Context context) {
        this.context = context;
        this.f72358sp = context.getSharedPreferences("__wx_opensdk_sp__", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int checkRuleCanPass(java.lang.String str, com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PromiseShareRule promiseShareRule) {
        java.lang.String str2;
        com.tencent.mm.opensdk.utils.Log.d(TAG, "checkRuleCanPass, start check!");
        if (promiseShareRule.orgJsonData.length() > 2048) {
            com.tencent.mm.opensdk.utils.Log.w(TAG, "response json is too long!");
            return 0;
        }
        int i17 = promiseShareRule.state;
        if (i17 == 2) {
            str2 = "checkRuleCanPass, not in rule";
        } else {
            if (i17 != 1 || !promiseShareRule.appidInRule.equals(promiseShareRule.reqAppid)) {
                com.tencent.mm.opensdk.utils.Log.d(TAG, "checkRuleCanPass, unknown");
                return 0;
            }
            if (promiseShareRule.urlRuleList.size() == 0) {
                str2 = "checkRuleCanPass, urlRuleList empty!";
            } else {
                boolean checkUrlParametersLegal = checkUrlParametersLegal(str, promiseShareRule);
                com.tencent.mm.opensdk.utils.Log.d(TAG, "checkRuleCanPass, urlCheckResult = ".concat(java.lang.String.valueOf(checkUrlParametersLegal)));
                if (!checkUrlParametersLegal) {
                    com.tencent.mm.opensdk.utils.Log.d(TAG, "checkRuleCanPass, no pass");
                    return 2;
                }
                str2 = "checkRuleCanPass, pass";
            }
        }
        com.tencent.mm.opensdk.utils.Log.d(TAG, str2);
        return 1;
    }

    private boolean checkUrlParametersLegal(java.lang.String str, com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PromiseShareRule promiseShareRule) {
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String host = parse.getHost();
        if (com.tencent.mm.opensdk.utils.d.b(host)) {
            com.tencent.mm.opensdk.utils.Log.i(TAG, "checkUrlParameters, host empty!");
            return false;
        }
        for (int i17 = 0; i17 < promiseShareRule.urlRuleList.size(); i17++) {
            com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.UrlRule urlRule = promiseShareRule.urlRuleList.get(i17);
            if (host.equals(urlRule.host)) {
                int i18 = 0;
                for (int i19 = 0; i19 < urlRule.mustQueryKey.size(); i19++) {
                    try {
                        java.lang.String str2 = urlRule.mustQueryKey.get(i19);
                        com.tencent.mm.opensdk.utils.Log.d(TAG, "checkRuleCanPass, key = ".concat(java.lang.String.valueOf(str2)));
                        if (!com.tencent.mm.opensdk.utils.d.b(parse.getQueryParameter(str2))) {
                            i18++;
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.opensdk.utils.Log.e(TAG, "checkRuleCanPass, parse fail, e = %s" + e17.getMessage());
                    }
                }
                boolean z17 = i18 == urlRule.mustQueryKey.size();
                com.tencent.mm.opensdk.utils.Log.d(TAG, "checkRuleCanPass, rule.host = " + urlRule.host + ", queryOk = " + z17);
                return z17;
            }
        }
        return false;
    }

    private void doRequest(final com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PassContext passContext, final com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.IHttpCheckCallback iHttpCheckCallback) {
        com.tencent.mm.opensdk.utils.d.b().submit(new java.lang.Runnable() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.6
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper wXAPiSecurityHelper = com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.this;
                com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PassContext passContext2 = passContext;
                iHttpCheckCallback.onHttpCheckFinish(com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.this.convert2ShareRule(passContext.appid, wXAPiSecurityHelper.postHttpRequest(passContext2.appid, passContext2.version, passContext2.localRule.buffer).toString()));
            }
        });
    }

    private void doRequestAsync(com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PassContext passContext) {
        com.tencent.mm.opensdk.utils.Log.d(TAG, "doRequestAsync");
        doRequest(passContext, new com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.IHttpCheckCallback() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.3
            @Override // com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.IHttpCheckCallback
            public void onHttpCheckFinish(com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PromiseShareRule promiseShareRule) {
                com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.this.storeIfNecessary(promiseShareRule);
            }
        });
    }

    private void doRequestSync(final com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PassContext passContext, final com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.ISecuritySyncCheck iSecuritySyncCheck) {
        com.tencent.mm.opensdk.utils.Log.i(TAG, "requestId = " + passContext.reqSessionId);
        final java.util.Timer timer = new java.util.Timer(passContext.reqSessionId);
        timer.schedule(new java.util.TimerTask() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.4
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                com.tencent.mm.opensdk.utils.Log.i(com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.TAG, "sync request overtime, requestId = " + passContext.reqSessionId);
                com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.this.overtimeSyncReqSet.add(passContext.reqSessionId);
                com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.ISecuritySyncCheck iSecuritySyncCheck2 = iSecuritySyncCheck;
                if (iSecuritySyncCheck2 != null) {
                    iSecuritySyncCheck2.onSyncCheckFinish(true);
                }
            }
        }, passContext.localRule.getLegalUserWaitTime());
        doRequest(passContext, new com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.IHttpCheckCallback() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.5
            @Override // com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.IHttpCheckCallback
            public void onHttpCheckFinish(com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PromiseShareRule promiseShareRule) {
                com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.ISecuritySyncCheck iSecuritySyncCheck2;
                timer.cancel();
                if (com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.this.overtimeSyncReqSet.contains(passContext.reqSessionId)) {
                    com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.this.overtimeSyncReqSet.remove(passContext.reqSessionId);
                } else if (iSecuritySyncCheck != null) {
                    int checkRuleCanPass = com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.this.checkRuleCanPass(passContext.inputUrl, promiseShareRule);
                    boolean z17 = true;
                    if (checkRuleCanPass == 1) {
                        iSecuritySyncCheck2 = iSecuritySyncCheck;
                    } else {
                        if (checkRuleCanPass == 2) {
                            iSecuritySyncCheck2 = iSecuritySyncCheck;
                        } else {
                            int checkRuleCanPass2 = com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.this.checkRuleCanPass(passContext.inputUrl, com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.this.convert2ShareRule(passContext.appid, com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.this.getStoredData(passContext.appid).respDataJson));
                            com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.ISecuritySyncCheck iSecuritySyncCheck3 = iSecuritySyncCheck;
                            if (checkRuleCanPass2 != 2) {
                                iSecuritySyncCheck2 = iSecuritySyncCheck3;
                            } else {
                                iSecuritySyncCheck2 = iSecuritySyncCheck3;
                            }
                        }
                        z17 = false;
                    }
                    iSecuritySyncCheck2.onSyncCheckFinish(z17);
                }
                com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.this.storeIfNecessary(promiseShareRule);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void extraSecurityCheckDoCallback(final com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.ISecurityCheck iSecurityCheck, final boolean z17) {
        if (iSecurityCheck != null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.2
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.opensdk.utils.Log.d(com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.TAG, "has got result, callback on Main Thread.");
                    iSecurityCheck.onCheckFinish(z17);
                }
            });
        }
    }

    private java.lang.String getStoreKey(java.lang.String str) {
        return "security_key_appid_".concat(java.lang.String.valueOf(str));
    }

    private void storeCheckResp(java.lang.String str, com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PromiseShareRule promiseShareRule) {
        java.lang.String cookStoreJson = cookStoreJson(str, promiseShareRule);
        com.tencent.mm.opensdk.utils.Log.d(TAG, "cookStoreJson = ".concat(java.lang.String.valueOf(cookStoreJson)));
        if (com.tencent.mm.opensdk.utils.d.b(cookStoreJson)) {
            com.tencent.mm.opensdk.utils.Log.w(TAG, "cookStoreJson get null!");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(SECURITY_KEY_TIMESTAMP_SECOND, java.lang.System.currentTimeMillis() / 1000);
            jSONObject.put(STORE_VALUE_DATA, cookStoreJson);
            commitSp(str, jSONObject.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "storeCheckResp fail, ex = " + e17.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void storeIfNecessary(com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PromiseShareRule promiseShareRule) {
        java.lang.String str;
        com.tencent.mm.opensdk.utils.Log.d(TAG, "storeIfNecessary");
        if (com.tencent.mm.opensdk.utils.d.b(promiseShareRule.reqAppid) || promiseShareRule.reqAppid.length() > 100) {
            str = "store fail! reqAppid illegal!";
        } else {
            if (!com.tencent.mm.opensdk.utils.d.b(promiseShareRule.orgJsonData) && promiseShareRule.orgJsonData.length() <= 2048) {
                if (promiseShareRule.state == 1 && promiseShareRule.reqAppid.equals(promiseShareRule.appidInRule)) {
                    com.tencent.mm.opensdk.utils.Log.d(TAG, "storeIfNecessary, in rule");
                    storeCheckResp(promiseShareRule.reqAppid, promiseShareRule);
                }
                if (promiseShareRule.state == 2) {
                    com.tencent.mm.opensdk.utils.Log.d(TAG, "storeIfNecessary, not rule");
                    storeCheckResp(promiseShareRule.reqAppid, promiseShareRule);
                    return;
                }
                return;
            }
            str = "store fail! response json illegal!";
        }
        com.tencent.mm.opensdk.utils.Log.i(TAG, str);
    }

    public void commitSp(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences.Editor edit = this.f72358sp.edit();
        edit.putString(getStoreKey(str), str2);
        edit.commit();
    }

    public com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PromiseShareRule convert2ShareRule(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PromiseShareRule promiseShareRule = new com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PromiseShareRule();
        promiseShareRule.reqAppid = str;
        promiseShareRule.orgJsonData = str2;
        if (com.tencent.mm.opensdk.utils.d.b(str2)) {
            com.tencent.mm.opensdk.utils.Log.d(TAG, "convert2ShareRule: jsonRespData is empty");
            return promiseShareRule;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            promiseShareRule.state = jSONObject.optInt("state", 0);
            promiseShareRule.appidInRule = jSONObject.optString("appid_rule", "");
            promiseShareRule.userWaitTimeMs = jSONObject.optLong("wait_time", 0L);
            promiseShareRule.nextRequestIntervalSecond = jSONObject.optLong("interval", 0L);
            promiseShareRule.buffer = jSONObject.optString("buffer", "");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("rules");
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                    com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.UrlRule urlRule = new com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.UrlRule();
                    urlRule.host = jSONObject2.optString("host");
                    org.json.JSONArray optJSONArray2 = jSONObject2.optJSONArray("querys");
                    if (optJSONArray2 != null) {
                        for (int i18 = 0; i18 < optJSONArray2.length(); i18++) {
                            if (!com.tencent.mm.opensdk.utils.d.b(optJSONArray2.optString(i18, ""))) {
                                urlRule.mustQueryKey.add(optJSONArray2.optString(i18, ""));
                            }
                        }
                    }
                    promiseShareRule.urlRuleList.add(urlRule);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "coverJson2ShareRule fail, ex = " + e17.getMessage());
        }
        return promiseShareRule;
    }

    public java.lang.String cookStoreJson(java.lang.String str, com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PromiseShareRule promiseShareRule) {
        if (promiseShareRule != null && !com.tencent.mm.opensdk.utils.d.b(str)) {
            try {
                int i17 = promiseShareRule.state;
                if (i17 != 2) {
                    return i17 == 1 ? covertShareRule2Json(promiseShareRule) : "";
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("state", promiseShareRule.state);
                jSONObject.put("interval", promiseShareRule.getLegalReqInterval());
                jSONObject.put("buffer", promiseShareRule.buffer.length() > 64 ? "" : promiseShareRule.buffer);
                return jSONObject.toString();
            } catch (java.lang.Exception e17) {
                com.tencent.mm.opensdk.utils.Log.e(TAG, "storeCheckResp fail, ex = " + e17.getMessage());
            }
        }
        return "";
    }

    public java.lang.String covertShareRule2Json(com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PromiseShareRule promiseShareRule) {
        if (promiseShareRule == null) {
            return "";
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("state", promiseShareRule.state);
            jSONObject.put("appid_rule", promiseShareRule.appidInRule);
            jSONObject.put("wait_time", promiseShareRule.userWaitTimeMs);
            jSONObject.put("interval", promiseShareRule.nextRequestIntervalSecond);
            jSONObject.put("buffer", promiseShareRule.buffer.length() > 64 ? "" : promiseShareRule.buffer);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.UrlRule urlRule : promiseShareRule.urlRuleList) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("host", urlRule.host);
                jSONObject2.put("querys", new org.json.JSONArray((java.util.Collection) urlRule.mustQueryKey));
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("rules", jSONArray);
            return jSONObject.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "covertShareRule2Json fail, ex = " + e17.getMessage());
            return "";
        }
    }

    public int doExtraSecurityCheck(java.lang.String str, java.lang.String str2, java.lang.String str3, final com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.ISecurityCheck iSecurityCheck) {
        com.tencent.mm.opensdk.utils.Log.i(TAG, "doExtraSecurityCheck: start!");
        if (com.tencent.mm.opensdk.utils.d.b(str) || com.tencent.mm.opensdk.utils.d.b(str3)) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "doExtraSecurityCheck: appid or inputurl is empty!");
            return 0;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PassContext passContext = new com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PassContext();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(currentTimeMillis);
        sb6.append(new java.util.Random().nextInt(9999));
        passContext.reqSessionId = java.lang.String.format("%s", sb6.toString());
        passContext.appid = str;
        passContext.inputUrl = str3;
        passContext.version = str2;
        com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.WXSecurityData storedData = getStoredData(str);
        if (this.context.getPackageManager().checkPermission("android.permission.INTERNET", this.context.getPackageName()) != 0) {
            com.tencent.mm.opensdk.utils.Log.w(TAG, "doExtraSecurityCheck: No Internet permission!");
            return 0;
        }
        if (!storedData.isBasicParamsAllowed()) {
            com.tencent.mm.opensdk.utils.Log.d(TAG, "doExtraSecurityCheck: local data illegal!");
            doRequestAsync(passContext);
            return 0;
        }
        com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.PromiseShareRule convert2ShareRule = convert2ShareRule(passContext.appid, storedData.respDataJson);
        passContext.localRule = convert2ShareRule;
        boolean z17 = (storedData.lastStoreTimeStampSecond + convert2ShareRule.getLegalReqInterval()) * 1000 < java.lang.System.currentTimeMillis();
        com.tencent.mm.opensdk.utils.Log.d(TAG, "doExtraSecurityCheck: needDoNextReq: " + z17 + ", last req time stamp:" + storedData.lastStoreTimeStampSecond);
        if (!z17) {
            int checkRuleCanPass = checkRuleCanPass(passContext.inputUrl, passContext.localRule);
            com.tencent.mm.opensdk.utils.Log.d(TAG, "doExtraSecurityCheck: no needDoNextReq, read local rule: ".concat(java.lang.String.valueOf(checkRuleCanPass)));
            return checkRuleCanPass == 2 ? 1 : 0;
        }
        com.tencent.mm.opensdk.utils.Log.d(TAG, "doExtraSecurityCheck: needDoNextReq, state: " + passContext.localRule.state);
        if (passContext.localRule.state != 1) {
            doRequestAsync(passContext);
            return 0;
        }
        doRequestSync(passContext, new com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.ISecuritySyncCheck() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.1
            @Override // com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.ISecuritySyncCheck
            public void onSyncCheckFinish(boolean z18) {
                com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.this.extraSecurityCheckDoCallback(iSecurityCheck, z18);
            }
        });
        return 2;
    }

    public java.lang.String extractMayNeedDoSecurityCheckUrl(java.lang.String str, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        if (baseReq.getType() != 2) {
            return "";
        }
        com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = (com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req) baseReq;
        if (req.message.getType() != 5) {
            return "";
        }
        com.tencent.mm.opensdk.modelmsg.WXWebpageObject wXWebpageObject = (com.tencent.mm.opensdk.modelmsg.WXWebpageObject) req.message.mediaObject;
        if (com.tencent.mm.opensdk.utils.d.b(wXWebpageObject.webpageUrl)) {
            com.tencent.mm.opensdk.utils.Log.i(TAG, "webpageUrl empty, don't need check.");
            return "";
        }
        com.tencent.mm.opensdk.utils.Log.i(TAG, "need check.");
        return wXWebpageObject.webpageUrl;
    }

    public java.lang.String getLocalStoredJson(java.lang.String str) {
        return getStoredData(str).respDataJson;
    }

    public com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.WXSecurityData getStoredData(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.WXSecurityData wXSecurityData = new com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.WXSecurityData();
        com.tencent.mm.opensdk.utils.Log.d(TAG, "getStoredData, appid = ".concat(java.lang.String.valueOf(str)));
        try {
            if (this.f72358sp.contains(getStoreKey(str))) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.f72358sp.getString(getStoreKey(str), ""));
                long optLong = jSONObject.optLong(SECURITY_KEY_TIMESTAMP_SECOND);
                java.lang.String optString = jSONObject.optString(STORE_VALUE_DATA);
                wXSecurityData.appid = str;
                wXSecurityData.lastStoreTimeStampSecond = optLong;
                wXSecurityData.respDataJson = optString;
                str2 = "getStoredData, Ok, appid = " + str + "timeStampSecond: " + wXSecurityData.lastStoreTimeStampSecond;
            } else {
                str2 = "getStoredData, fail, not exist!";
            }
            com.tencent.mm.opensdk.utils.Log.d(TAG, str2);
        } catch (java.lang.Exception e17) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "getStoredData fail, ex = " + e17.getMessage());
        }
        return wXSecurityData;
    }

    public java.lang.StringBuffer postHttpRequest(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            java.lang.String encode = java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c);
            java.lang.String encode2 = java.net.URLEncoder.encode(str3, com.tencent.mapsdk.internal.rv.f51270c);
            java.lang.String format = java.lang.String.format("https://mp.weixin.qq.com/publicpoc/opensdkconf?action=GetShareConf&appid=%s&sdkVersion=%s&buffer=%s", encode, str2, encode2);
            com.tencent.mm.opensdk.utils.Log.d(TAG, "request http, url = " + format + ", appid = " + encode + ", version = " + str2 + ", buffer = " + encode2);
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(format).openConnection();
            httpURLConnection.setConnectTimeout(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
            httpURLConnection.setReadTimeout(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            com.tencent.mm.opensdk.utils.Log.i(TAG, "http respCode = ".concat(java.lang.String.valueOf(responseCode)));
            if (responseCode == 200) {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuffer.append(readLine);
                }
                com.tencent.mm.opensdk.utils.Log.d(TAG, "http response = ".concat(java.lang.String.valueOf(stringBuffer)));
                bufferedReader.close();
            }
            httpURLConnection.disconnect();
        } catch (java.lang.Exception e17) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "http request fail, ex = " + e17.getMessage());
        }
        return stringBuffer;
    }
}
