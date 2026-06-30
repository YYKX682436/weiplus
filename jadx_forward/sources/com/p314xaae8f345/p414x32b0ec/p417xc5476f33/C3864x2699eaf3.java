package com.p314xaae8f345.p414x32b0ec.p417xc5476f33;

/* renamed from: com.tencent.live.plugin.V2TXLivePremierPlugin */
/* loaded from: classes16.dex */
public class C3864x2699eaf3 implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {
    private static final java.lang.String TAG = "V2TXLivePremierPlugin";

    /* renamed from: mChannel */
    private io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f15215xca242fd6;

    /* renamed from: mContext */
    private android.content.Context f15216xd6cfe882;

    /* renamed from: mHandler */
    private android.os.Handler f15217xc7640a1d;

    /* renamed from: mMessenger */
    private io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f15218x251e0526;

    /* renamed from: com.tencent.live.plugin.V2TXLivePremierPlugin$UIHandler */
    /* loaded from: classes11.dex */
    public static class UIHandler extends android.os.Handler {

        /* renamed from: pluginReference */
        java.lang.ref.WeakReference<com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3864x2699eaf3> f15219xfd945958;

        public UIHandler(com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3864x2699eaf3 c3864x2699eaf3) {
            super(android.os.Looper.getMainLooper());
            this.f15219xfd945958 = new java.lang.ref.WeakReference<>(c3864x2699eaf3);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
        }
    }

    /* renamed from: com.tencent.live.plugin.V2TXLivePremierPlugin$V2TXLivePremierObserverImpl */
    /* loaded from: classes16.dex */
    public class V2TXLivePremierObserverImpl extends com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.V2TXLivePremierObserver {
        public V2TXLivePremierObserverImpl() {
        }

        /* renamed from: invokeListener */
        public void m31695x2919754c(final com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePremierObserverType v2TXLivePremierObserverType, final java.util.Map map) {
            com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3864x2699eaf3.this.f15217xc7640a1d.post(new java.lang.Runnable() { // from class: com.tencent.live.plugin.V2TXLivePremierPlugin.V2TXLivePremierObserverImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("type", v2TXLivePremierObserverType.m31616xfb82e301());
                    java.util.Map map2 = map;
                    if (map2 != null) {
                        hashMap.put("params", map2);
                    }
                    if (com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3864x2699eaf3.this.f15215xca242fd6 != null) {
                        com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3864x2699eaf3.this.f15215xca242fd6.m138438xd8c5c779("onPremierListener", hashMap);
                    }
                }
            });
        }

        @Override // com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.V2TXLivePremierObserver
        /* renamed from: onLicenceLoaded */
        public void mo31696x37e8c217(int i17, java.lang.String str) {
            com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31840x6f02d9a1(2, "V2TXLivePremierPlugin, onLicenceLoaded result:" + i17 + ",reason:" + str);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("result", java.lang.Integer.valueOf(i17));
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, str);
            m31695x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePremierObserverType.m31613x13201a78("onLicenceLoaded"), hashMap);
        }

        @Override // com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.V2TXLivePremierObserver
        /* renamed from: onLog */
        public void mo31697x64f5ce5(int i17, java.lang.String str) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(ya.b.f77487x44fa364, java.lang.Integer.valueOf(i17));
            hashMap.put("log", str);
            m31695x2919754c(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.V2TXLivePremierObserverType.m31613x13201a78("onLog"), hashMap);
        }
    }

    public C3864x2699eaf3(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, android.content.Context context) {
        this.f15218x251e0526 = interfaceC28679x1b8c77f2;
        this.f15216xd6cfe882 = context;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(interfaceC28679x1b8c77f2, "live_cloud_premier");
        this.f15215xca242fd6 = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(this);
        this.f15217xc7640a1d = new com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3864x2699eaf3.UIHandler(this);
    }

    /* renamed from: setSocks5Proxy */
    public static void m31689x22df1366(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        java.lang.String str = (java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "host");
        int intValue = ((java.lang.Integer) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "port")).intValue();
        java.lang.String str2 = (java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, dm.i4.f66875xa013b0d5);
        java.lang.String str3 = (java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "password");
        java.util.Map map = (java.util.Map) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "config");
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveSocks5ProxyConfig v2TXLiveSocks5ProxyConfig = new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveSocks5ProxyConfig();
        if (map != null && map.containsKey("supportHttps")) {
            v2TXLiveSocks5ProxyConfig.f15388xa2ad225c = ((java.lang.Boolean) map.get("supportHttps")).booleanValue();
        }
        if (map != null && map.containsKey("supportTcp")) {
            v2TXLiveSocks5ProxyConfig.f15389xdb688192 = ((java.lang.Boolean) map.get("supportTcp")).booleanValue();
        }
        if (map != null && map.containsKey("supportUdp")) {
            v2TXLiveSocks5ProxyConfig.f15390xdb688572 = ((java.lang.Boolean) map.get("supportUdp")).booleanValue();
        }
        com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.m31907x22df1366(str, intValue, str2, str3, v2TXLiveSocks5ProxyConfig);
        result.mo65720x90b54003(0);
    }

    /* renamed from: setUserId */
    public static void m31690x26778548(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.m31908x26778548((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "userId"));
        result.mo65720x90b54003(0);
    }

    /* renamed from: getSDKVersionStr */
    public void m31691xdb46aa5d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        result.mo65720x90b54003(com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.m31902xdb46aa5d());
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31840x6f02d9a1(2, "V2TXLivePremierPlugin, onMethodCall -> method:" + c28687x4bb242ff.f71610xbfc5d0e1 + ", arguments:" + c28687x4bb242ff.f71609x86ac7956);
        try {
            com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3864x2699eaf3.class.getDeclaredMethod(c28687x4bb242ff.f71610xbfc5d0e1, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff.class, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result.class).invoke(this, c28687x4bb242ff, result);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31840x6f02d9a1(4, "V2TXLivePremierPlugin, method=" + c28687x4bb242ff.f71610xbfc5d0e1 + "|arguments=" + c28687x4bb242ff.f71609x86ac7956 + "|error=" + e17);
        }
    }

    /* renamed from: setEnvironment */
    public void m31692x6b1cec51(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.m31903x6b1cec51((java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "env"));
        result.mo65720x90b54003(0);
    }

    /* renamed from: setLicence */
    public void m31693xbb2f0b8f(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.m31904xbb2f0b8f(this.f15216xd6cfe882, (java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "url"), (java.lang.String) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "key"));
        com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.m31906x8b59f158(new com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3864x2699eaf3.V2TXLivePremierObserverImpl());
        result.mo65720x90b54003(0);
    }

    /* renamed from: setLogConfig */
    public void m31694xb488c164(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveLogConfig v2TXLiveLogConfig = new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveLogConfig();
        java.util.Map map = (java.util.Map) com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(c28687x4bb242ff, result, "config");
        if (map != null && map.containsKey("logLevel")) {
            v2TXLiveLogConfig.f15325x76f472a0 = ((java.lang.Integer) map.get("logLevel")).intValue();
        }
        if (map != null && map.containsKey("enableObserver")) {
            v2TXLiveLogConfig.f15324x2946a979 = ((java.lang.Boolean) map.get("enableObserver")).booleanValue();
        }
        if (map != null && map.containsKey("enableConsole")) {
            v2TXLiveLogConfig.f15322x7b70ae54 = ((java.lang.Boolean) map.get("enableConsole")).booleanValue();
        }
        if (map != null && map.containsKey("enableLogFile")) {
            v2TXLiveLogConfig.f15323x571193dd = ((java.lang.Boolean) map.get("enableLogFile")).booleanValue();
        }
        if (map != null && map.containsKey("logPath")) {
            v2TXLiveLogConfig.f15326x145c3989 = (java.lang.String) map.get("logPath");
        }
        com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.m31905xb488c164(v2TXLiveLogConfig);
        result.mo65720x90b54003(0);
    }
}
