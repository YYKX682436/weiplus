package com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper */
/* loaded from: classes15.dex */
public class C11311xd1d40b07 {

    /* renamed from: MAX_STORE_KEY */
    private static final int f33288x92676886 = 100;

    /* renamed from: MAX_STORE_VALUE */
    private static final int f33289x96c869d8 = 2048;

    /* renamed from: SECURITY_KEY_TIMESTAMP_SECOND */
    private static final java.lang.String f33290xf7d5fd7c = "security_key_timestamp_second";

    /* renamed from: STORE_VALUE_DATA */
    private static final java.lang.String f33291xa3e33416 = "security_key_resp";
    private static final java.lang.String TAG = "MicroMsg.SDK.WXAPiSecurityHelper";

    /* renamed from: context */
    private final android.content.Context f33292x38b735af;

    /* renamed from: overtimeSyncReqSet */
    private final java.util.concurrent.CopyOnWriteArraySet<java.lang.String> f33293x8e8dd1e0 = new java.util.concurrent.CopyOnWriteArraySet<>();

    /* renamed from: sp, reason: collision with root package name */
    private final android.content.SharedPreferences f153891sp;

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$CheckRuleResult */
    /* loaded from: classes6.dex */
    public static class CheckRuleResult {

        /* renamed from: NoPass */
        public static final int f33310x8b5c0992 = 2;

        /* renamed from: Pass */
        public static final int f33311x25d831 = 1;

        /* renamed from: Unknown */
        public static final int f33312x523e442a = 0;

        private CheckRuleResult() {
        }
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$ExtraSecurityCheckRes */
    /* loaded from: classes6.dex */
    public static class ExtraSecurityCheckRes {

        /* renamed from: Directly_NoPass */
        public static final int f33313xda80829b = 1;

        /* renamed from: Directly_Pass */
        public static final int f33314xbef6ff7a = 0;

        /* renamed from: Need_Deep_Check */
        public static final int f33315x25f3b1e = 2;
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$IHttpCheckCallback */
    /* loaded from: classes15.dex */
    public interface IHttpCheckCallback {
        /* renamed from: onHttpCheckFinish */
        void mo48572x700f4234(com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PromiseShareRule promiseShareRule);
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$ISecurityCheck */
    /* loaded from: classes6.dex */
    public interface ISecurityCheck {
        /* renamed from: onCheckFinish */
        void mo48541x3393005c(boolean z17);
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$ISecuritySyncCheck */
    /* loaded from: classes6.dex */
    public interface ISecuritySyncCheck {
        /* renamed from: onSyncCheckFinish */
        void mo48571xbaba3641(boolean z17);
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$PassContext */
    /* loaded from: classes15.dex */
    public static class PassContext {

        /* renamed from: appid */
        java.lang.String f33316x58b82fc;

        /* renamed from: inputUrl */
        java.lang.String f33317x1c0e6945;

        /* renamed from: localRule */
        com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PromiseShareRule f33318xb8293d07;

        /* renamed from: reqSessionId */
        java.lang.String f33319x9b6d7753;

        /* renamed from: version */
        java.lang.String f33320x14f51cd8;

        private PassContext() {
            this.f33319x9b6d7753 = "";
            this.f33316x58b82fc = "";
            this.f33317x1c0e6945 = "";
            this.f33320x14f51cd8 = "";
            this.f33318xb8293d07 = new com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PromiseShareRule();
        }
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$PromiseShareRule */
    /* loaded from: classes15.dex */
    public static class PromiseShareRule {

        /* renamed from: appidInRule */
        java.lang.String f33321xf0cb3fdd;

        /* renamed from: buffer */
        java.lang.String f33322xaddb9440;

        /* renamed from: nextRequestIntervalSecond */
        public long f33323x5f3f70d5;

        /* renamed from: orgJsonData */
        java.lang.String f33324x8d828bb6;

        /* renamed from: reqAppid */
        java.lang.String f33325xe5b78cfe;

        /* renamed from: state */
        int f33326x68ac491;

        /* renamed from: urlRuleList */
        java.util.List<com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.UrlRule> f33327x93712849;

        /* renamed from: userWaitTimeMs */
        long f33328x120a7553;

        private PromiseShareRule() {
            this.f33324x8d828bb6 = "";
            this.f33325xe5b78cfe = "";
            this.f33321xf0cb3fdd = "";
            this.f33327x93712849 = new java.util.ArrayList();
            this.f33322xaddb9440 = "";
        }

        /* renamed from: getLegalReqInterval */
        public long m48573x6e107280() {
            long j17 = this.f33323x5f3f70d5;
            if (j17 <= 0 || j17 >= 86400) {
                j17 = 3600;
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.TAG, "getLegalReqInterval = ".concat(java.lang.String.valueOf(j17)));
            return j17;
        }

        /* renamed from: getLegalUserWaitTime */
        public long m48574x9fa7db70() {
            long j17 = this.f33328x120a7553;
            if (j17 <= 100 || j17 >= 60000) {
                j17 = 5000;
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.TAG, "getLegalUserWaitTime = ".concat(java.lang.String.valueOf(j17)));
            return j17;
        }
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$RuleState */
    /* loaded from: classes6.dex */
    public static class RuleState {

        /* renamed from: InRule */
        public static final int f33329x82c6e9e1 = 1;

        /* renamed from: None */
        public static final int f33330x252358 = 0;

        /* renamed from: NotInRule */
        public static final int f33331xb2960a54 = 2;

        private RuleState() {
        }
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$UrlRule */
    /* loaded from: classes15.dex */
    public static class UrlRule {

        /* renamed from: host */
        java.lang.String f33332x30f5a8;

        /* renamed from: mustQueryKey */
        java.util.List<java.lang.String> f33333xfd7995a0;

        private UrlRule() {
            this.f33332x30f5a8 = "";
            this.f33333xfd7995a0 = new java.util.ArrayList();
        }
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$WXSecurityData */
    /* loaded from: classes15.dex */
    public static class WXSecurityData {

        /* renamed from: appid */
        java.lang.String f33334x58b82fc;

        /* renamed from: lastStoreTimeStampSecond */
        long f33335xd020b99f;

        /* renamed from: respDataJson */
        java.lang.String f33336x34bd5ba2;

        private WXSecurityData() {
            this.f33334x58b82fc = "";
            this.f33336x34bd5ba2 = "";
        }

        /* renamed from: isBasicParamsAllowed */
        public boolean m48575x744ca67e() {
            long j17 = this.f33335xd020b99f;
            return ((j17 > 0L ? 1 : (j17 == 0L ? 0 : -1)) > 0 && (j17 > (java.lang.System.currentTimeMillis() / 1000) ? 1 : (j17 == (java.lang.System.currentTimeMillis() / 1000) ? 0 : -1)) < 0) && (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33334x58b82fc) ^ true) && (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33336x34bd5ba2) ^ true);
        }
    }

    public C11311xd1d40b07(android.content.Context context) {
        this.f33292x38b735af = context;
        this.f153891sp = context.getSharedPreferences("__wx_opensdk_sp__", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkRuleCanPass */
    public int m48553xb07b2b3d(java.lang.String str, com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PromiseShareRule promiseShareRule) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "checkRuleCanPass, start check!");
        if (promiseShareRule.f33324x8d828bb6.length() > 2048) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.w(TAG, "response json is too long!");
            return 0;
        }
        int i17 = promiseShareRule.f33326x68ac491;
        if (i17 == 2) {
            str2 = "checkRuleCanPass, not in rule";
        } else {
            if (i17 != 1 || !promiseShareRule.f33321xf0cb3fdd.equals(promiseShareRule.f33325xe5b78cfe)) {
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "checkRuleCanPass, unknown");
                return 0;
            }
            if (promiseShareRule.f33327x93712849.size() == 0) {
                str2 = "checkRuleCanPass, urlRuleList empty!";
            } else {
                boolean m48554x45de48a8 = m48554x45de48a8(str, promiseShareRule);
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "checkRuleCanPass, urlCheckResult = ".concat(java.lang.String.valueOf(m48554x45de48a8)));
                if (!m48554x45de48a8) {
                    com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "checkRuleCanPass, no pass");
                    return 2;
                }
                str2 = "checkRuleCanPass, pass";
            }
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, str2);
        return 1;
    }

    /* renamed from: checkUrlParametersLegal */
    private boolean m48554x45de48a8(java.lang.String str, com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PromiseShareRule promiseShareRule) {
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String host = parse.getHost();
        if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(host)) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "checkUrlParameters, host empty!");
            return false;
        }
        for (int i17 = 0; i17 < promiseShareRule.f33327x93712849.size(); i17++) {
            com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.UrlRule urlRule = promiseShareRule.f33327x93712849.get(i17);
            if (host.equals(urlRule.f33332x30f5a8)) {
                int i18 = 0;
                for (int i19 = 0; i19 < urlRule.f33333xfd7995a0.size(); i19++) {
                    try {
                        java.lang.String str2 = urlRule.f33333xfd7995a0.get(i19);
                        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "checkRuleCanPass, key = ".concat(java.lang.String.valueOf(str2)));
                        if (!com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(parse.getQueryParameter(str2))) {
                            i18++;
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "checkRuleCanPass, parse fail, e = %s" + e17.getMessage());
                    }
                }
                boolean z17 = i18 == urlRule.f33333xfd7995a0.size();
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "checkRuleCanPass, rule.host = " + urlRule.f33332x30f5a8 + ", queryOk = " + z17);
                return z17;
            }
        }
        return false;
    }

    /* renamed from: doRequest */
    private void m48555x99e55b84(final com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PassContext passContext, final com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.IHttpCheckCallback iHttpCheckCallback) {
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b().submit(new java.lang.Runnable() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.6
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07 c11311xd1d40b07 = com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.this;
                com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PassContext passContext2 = passContext;
                iHttpCheckCallback.mo48572x700f4234(com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.this.m48563x865e655c(passContext.f33316x58b82fc, c11311xd1d40b07.m48570xb82ac427(passContext2.f33316x58b82fc, passContext2.f33320x14f51cd8, passContext2.f33318xb8293d07.f33322xaddb9440).toString()));
            }
        });
    }

    /* renamed from: doRequestAsync */
    private void m48556xfb454958(com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PassContext passContext) {
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "doRequestAsync");
        m48555x99e55b84(passContext, new com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.IHttpCheckCallback() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.3
            @Override // com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.IHttpCheckCallback
            /* renamed from: onHttpCheckFinish */
            public void mo48572x700f4234(com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PromiseShareRule promiseShareRule) {
                com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.this.m48561x55a3a311(promiseShareRule);
            }
        });
    }

    /* renamed from: doRequestSync */
    private void m48557x292b883f(final com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PassContext passContext, final com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.ISecuritySyncCheck iSecuritySyncCheck) {
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "requestId = " + passContext.f33319x9b6d7753);
        final java.util.Timer timer = new java.util.Timer(passContext.f33319x9b6d7753);
        timer.schedule(new java.util.TimerTask() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.4
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.TAG, "sync request overtime, requestId = " + passContext.f33319x9b6d7753);
                com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.this.f33293x8e8dd1e0.add(passContext.f33319x9b6d7753);
                com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.ISecuritySyncCheck iSecuritySyncCheck2 = iSecuritySyncCheck;
                if (iSecuritySyncCheck2 != null) {
                    iSecuritySyncCheck2.mo48571xbaba3641(true);
                }
            }
        }, passContext.f33318xb8293d07.m48574x9fa7db70());
        m48555x99e55b84(passContext, new com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.IHttpCheckCallback() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.5
            @Override // com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.IHttpCheckCallback
            /* renamed from: onHttpCheckFinish */
            public void mo48572x700f4234(com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PromiseShareRule promiseShareRule) {
                com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.ISecuritySyncCheck iSecuritySyncCheck2;
                timer.cancel();
                if (com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.this.f33293x8e8dd1e0.contains(passContext.f33319x9b6d7753)) {
                    com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.this.f33293x8e8dd1e0.remove(passContext.f33319x9b6d7753);
                } else if (iSecuritySyncCheck != null) {
                    int m48553xb07b2b3d = com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.this.m48553xb07b2b3d(passContext.f33317x1c0e6945, promiseShareRule);
                    boolean z17 = true;
                    if (m48553xb07b2b3d == 1) {
                        iSecuritySyncCheck2 = iSecuritySyncCheck;
                    } else {
                        if (m48553xb07b2b3d == 2) {
                            iSecuritySyncCheck2 = iSecuritySyncCheck;
                        } else {
                            int m48553xb07b2b3d2 = com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.this.m48553xb07b2b3d(passContext.f33317x1c0e6945, com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.this.m48563x865e655c(passContext.f33316x58b82fc, com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.this.m48569x2564b5e3(passContext.f33316x58b82fc).f33336x34bd5ba2));
                            com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.ISecuritySyncCheck iSecuritySyncCheck3 = iSecuritySyncCheck;
                            if (m48553xb07b2b3d2 != 2) {
                                iSecuritySyncCheck2 = iSecuritySyncCheck3;
                            } else {
                                iSecuritySyncCheck2 = iSecuritySyncCheck3;
                            }
                        }
                        z17 = false;
                    }
                    iSecuritySyncCheck2.mo48571xbaba3641(z17);
                }
                com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.this.m48561x55a3a311(promiseShareRule);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: extraSecurityCheckDoCallback */
    public void m48558xae67788(final com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.ISecurityCheck iSecurityCheck, final boolean z17) {
        if (iSecurityCheck != null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.2
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.TAG, "has got result, callback on Main Thread.");
                    iSecurityCheck.mo48541x3393005c(z17);
                }
            });
        }
    }

    /* renamed from: getStoreKey */
    private java.lang.String m48559xe233b334(java.lang.String str) {
        return "security_key_appid_".concat(java.lang.String.valueOf(str));
    }

    /* renamed from: storeCheckResp */
    private void m48560x1e0b8517(java.lang.String str, com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PromiseShareRule promiseShareRule) {
        java.lang.String m48564x18d52301 = m48564x18d52301(str, promiseShareRule);
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "cookStoreJson = ".concat(java.lang.String.valueOf(m48564x18d52301)));
        if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(m48564x18d52301)) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.w(TAG, "cookStoreJson get null!");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(f33290xf7d5fd7c, java.lang.System.currentTimeMillis() / 1000);
            jSONObject.put(f33291xa3e33416, m48564x18d52301);
            m48562xdc19c1f4(str, jSONObject.toString());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "storeCheckResp fail, ex = " + e17.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: storeIfNecessary */
    public void m48561x55a3a311(com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PromiseShareRule promiseShareRule) {
        java.lang.String str;
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "storeIfNecessary");
        if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(promiseShareRule.f33325xe5b78cfe) || promiseShareRule.f33325xe5b78cfe.length() > 100) {
            str = "store fail! reqAppid illegal!";
        } else {
            if (!com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(promiseShareRule.f33324x8d828bb6) && promiseShareRule.f33324x8d828bb6.length() <= 2048) {
                if (promiseShareRule.f33326x68ac491 == 1 && promiseShareRule.f33325xe5b78cfe.equals(promiseShareRule.f33321xf0cb3fdd)) {
                    com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "storeIfNecessary, in rule");
                    m48560x1e0b8517(promiseShareRule.f33325xe5b78cfe, promiseShareRule);
                }
                if (promiseShareRule.f33326x68ac491 == 2) {
                    com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "storeIfNecessary, not rule");
                    m48560x1e0b8517(promiseShareRule.f33325xe5b78cfe, promiseShareRule);
                    return;
                }
                return;
            }
            str = "store fail! response json illegal!";
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, str);
    }

    /* renamed from: commitSp */
    public void m48562xdc19c1f4(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences.Editor edit = this.f153891sp.edit();
        edit.putString(m48559xe233b334(str), str2);
        edit.commit();
    }

    /* renamed from: convert2ShareRule */
    public com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PromiseShareRule m48563x865e655c(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PromiseShareRule promiseShareRule = new com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PromiseShareRule();
        promiseShareRule.f33325xe5b78cfe = str;
        promiseShareRule.f33324x8d828bb6 = str2;
        if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(str2)) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "convert2ShareRule: jsonRespData is empty");
            return promiseShareRule;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            promiseShareRule.f33326x68ac491 = jSONObject.optInt("state", 0);
            promiseShareRule.f33321xf0cb3fdd = jSONObject.optString("appid_rule", "");
            promiseShareRule.f33328x120a7553 = jSONObject.optLong("wait_time", 0L);
            promiseShareRule.f33323x5f3f70d5 = jSONObject.optLong("interval", 0L);
            promiseShareRule.f33322xaddb9440 = jSONObject.optString("buffer", "");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("rules");
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                    com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.UrlRule urlRule = new com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.UrlRule();
                    urlRule.f33332x30f5a8 = jSONObject2.optString("host");
                    org.json.JSONArray optJSONArray2 = jSONObject2.optJSONArray("querys");
                    if (optJSONArray2 != null) {
                        for (int i18 = 0; i18 < optJSONArray2.length(); i18++) {
                            if (!com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(optJSONArray2.optString(i18, ""))) {
                                urlRule.f33333xfd7995a0.add(optJSONArray2.optString(i18, ""));
                            }
                        }
                    }
                    promiseShareRule.f33327x93712849.add(urlRule);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "coverJson2ShareRule fail, ex = " + e17.getMessage());
        }
        return promiseShareRule;
    }

    /* renamed from: cookStoreJson */
    public java.lang.String m48564x18d52301(java.lang.String str, com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PromiseShareRule promiseShareRule) {
        if (promiseShareRule != null && !com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(str)) {
            try {
                int i17 = promiseShareRule.f33326x68ac491;
                if (i17 != 2) {
                    return i17 == 1 ? m48565xa91729c(promiseShareRule) : "";
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("state", promiseShareRule.f33326x68ac491);
                jSONObject.put("interval", promiseShareRule.m48573x6e107280());
                jSONObject.put("buffer", promiseShareRule.f33322xaddb9440.length() > 64 ? "" : promiseShareRule.f33322xaddb9440);
                return jSONObject.toString();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "storeCheckResp fail, ex = " + e17.getMessage());
            }
        }
        return "";
    }

    /* renamed from: covertShareRule2Json */
    public java.lang.String m48565xa91729c(com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PromiseShareRule promiseShareRule) {
        if (promiseShareRule == null) {
            return "";
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("state", promiseShareRule.f33326x68ac491);
            jSONObject.put("appid_rule", promiseShareRule.f33321xf0cb3fdd);
            jSONObject.put("wait_time", promiseShareRule.f33328x120a7553);
            jSONObject.put("interval", promiseShareRule.f33323x5f3f70d5);
            jSONObject.put("buffer", promiseShareRule.f33322xaddb9440.length() > 64 ? "" : promiseShareRule.f33322xaddb9440);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.UrlRule urlRule : promiseShareRule.f33327x93712849) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("host", urlRule.f33332x30f5a8);
                jSONObject2.put("querys", new org.json.JSONArray((java.util.Collection) urlRule.f33333xfd7995a0));
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("rules", jSONArray);
            return jSONObject.toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "covertShareRule2Json fail, ex = " + e17.getMessage());
            return "";
        }
    }

    /* renamed from: doExtraSecurityCheck */
    public int m48566x45f79763(java.lang.String str, java.lang.String str2, java.lang.String str3, final com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.ISecurityCheck iSecurityCheck) {
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "doExtraSecurityCheck: start!");
        if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(str) || com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(str3)) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "doExtraSecurityCheck: appid or inputurl is empty!");
            return 0;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PassContext passContext = new com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PassContext();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(currentTimeMillis);
        sb6.append(new java.util.Random().nextInt(9999));
        passContext.f33319x9b6d7753 = java.lang.String.format("%s", sb6.toString());
        passContext.f33316x58b82fc = str;
        passContext.f33317x1c0e6945 = str3;
        passContext.f33320x14f51cd8 = str2;
        com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.WXSecurityData m48569x2564b5e3 = m48569x2564b5e3(str);
        if (this.f33292x38b735af.getPackageManager().checkPermission("android.permission.INTERNET", this.f33292x38b735af.getPackageName()) != 0) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.w(TAG, "doExtraSecurityCheck: No Internet permission!");
            return 0;
        }
        if (!m48569x2564b5e3.m48575x744ca67e()) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "doExtraSecurityCheck: local data illegal!");
            m48556xfb454958(passContext);
            return 0;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.PromiseShareRule m48563x865e655c = m48563x865e655c(passContext.f33316x58b82fc, m48569x2564b5e3.f33336x34bd5ba2);
        passContext.f33318xb8293d07 = m48563x865e655c;
        boolean z17 = (m48569x2564b5e3.f33335xd020b99f + m48563x865e655c.m48573x6e107280()) * 1000 < java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "doExtraSecurityCheck: needDoNextReq: " + z17 + ", last req time stamp:" + m48569x2564b5e3.f33335xd020b99f);
        if (!z17) {
            int m48553xb07b2b3d = m48553xb07b2b3d(passContext.f33317x1c0e6945, passContext.f33318xb8293d07);
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "doExtraSecurityCheck: no needDoNextReq, read local rule: ".concat(java.lang.String.valueOf(m48553xb07b2b3d)));
            return m48553xb07b2b3d == 2 ? 1 : 0;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "doExtraSecurityCheck: needDoNextReq, state: " + passContext.f33318xb8293d07.f33326x68ac491);
        if (passContext.f33318xb8293d07.f33326x68ac491 != 1) {
            m48556xfb454958(passContext);
            return 0;
        }
        m48557x292b883f(passContext, new com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.ISecuritySyncCheck() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.1
            @Override // com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.ISecuritySyncCheck
            /* renamed from: onSyncCheckFinish */
            public void mo48571xbaba3641(boolean z18) {
                com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.this.m48558xae67788(iSecurityCheck, z18);
            }
        });
        return 2;
    }

    /* renamed from: extractMayNeedDoSecurityCheckUrl */
    public java.lang.String m48567x3ff6dacc(java.lang.String str, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() != 2) {
            return "";
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req) abstractC11229x4f6513ed;
        if (req.f33049x38eb0007.m48467xfb85f7b0() != 5) {
            return "";
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1 c11300x89dbd7a1 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1) req.f33049x38eb0007.f33122xe4128443;
        if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(c11300x89dbd7a1.f33249xa1713a8c)) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "webpageUrl empty, don't need check.");
            return "";
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "need check.");
        return c11300x89dbd7a1.f33249xa1713a8c;
    }

    /* renamed from: getLocalStoredJson */
    public java.lang.String m48568x618c7ec0(java.lang.String str) {
        return m48569x2564b5e3(str).f33336x34bd5ba2;
    }

    /* renamed from: getStoredData */
    public com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.WXSecurityData m48569x2564b5e3(java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.WXSecurityData wXSecurityData = new com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.WXSecurityData();
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "getStoredData, appid = ".concat(java.lang.String.valueOf(str)));
        try {
            if (this.f153891sp.contains(m48559xe233b334(str))) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.f153891sp.getString(m48559xe233b334(str), ""));
                long optLong = jSONObject.optLong(f33290xf7d5fd7c);
                java.lang.String optString = jSONObject.optString(f33291xa3e33416);
                wXSecurityData.f33334x58b82fc = str;
                wXSecurityData.f33335xd020b99f = optLong;
                wXSecurityData.f33336x34bd5ba2 = optString;
                str2 = "getStoredData, Ok, appid = " + str + "timeStampSecond: " + wXSecurityData.f33335xd020b99f;
            } else {
                str2 = "getStoredData, fail, not exist!";
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, str2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "getStoredData fail, ex = " + e17.getMessage());
        }
        return wXSecurityData;
    }

    /* renamed from: postHttpRequest */
    public java.lang.StringBuffer m48570xb82ac427(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            java.lang.String encode = java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            java.lang.String encode2 = java.net.URLEncoder.encode(str3, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            java.lang.String format = java.lang.String.format("https://mp.weixin.qq.com/publicpoc/opensdkconf?action=GetShareConf&appid=%s&sdkVersion=%s&buffer=%s", encode, str2, encode2);
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "request http, url = " + format + ", appid = " + encode + ", version = " + str2 + ", buffer = " + encode2);
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(format).openConnection();
            httpURLConnection.setConnectTimeout(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8);
            httpURLConnection.setReadTimeout(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "http respCode = ".concat(java.lang.String.valueOf(responseCode)));
            if (responseCode == 200) {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuffer.append(readLine);
                }
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "http response = ".concat(java.lang.String.valueOf(stringBuffer)));
                bufferedReader.close();
            }
            httpURLConnection.disconnect();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "http request fail, ex = " + e17.getMessage());
        }
        return stringBuffer;
    }
}
