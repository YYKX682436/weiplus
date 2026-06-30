package com.tencent.live2.impl;

/* loaded from: classes16.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.live2.impl.a.C0015a f47194a = new com.tencent.live2.impl.a.C0015a();

    /* renamed from: b, reason: collision with root package name */
    private static com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver f47195b;

    /* renamed from: com.tencent.live2.impl.a$a, reason: collision with other inner class name */
    /* loaded from: classes16.dex */
    public static final class C0015a implements com.tencent.liteav.base.util.LiteavLog.a {

        /* renamed from: a, reason: collision with root package name */
        com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver f47196a;

        @Override // com.tencent.liteav.base.util.LiteavLog.a
        public final void a(int i17, java.lang.String str, java.lang.String str2) {
            com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = this.f47196a;
            if (v2TXLivePremierObserver != null) {
                v2TXLivePremierObserver.onLog(i17, str2);
            }
        }
    }

    public static java.lang.String a() {
        return com.tencent.liteav.base.util.CommonUtil.getSDKVersionStr();
    }

    public static int c(java.lang.String str) {
        return com.tencent.liteav.live.V2TXLivePremierJni.callExperimentalAPI(str);
    }

    public static void a(com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver) {
        f47195b = v2TXLivePremierObserver;
        f47194a.f47196a = v2TXLivePremierObserver;
        com.tencent.liteav.live.V2TXLivePremierJni.setObserver(v2TXLivePremierObserver);
    }

    public static void b(boolean z17, com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        com.tencent.liteav.live.V2TXLivePremierJni.enableAudioPlayoutObserver(z17, v2TXLiveAudioFrameObserverFormat);
    }

    public static void b(java.lang.String str) {
        com.tencent.liteav.LiveSettingJni.setUserId(str);
    }

    public static void a(com.tencent.live2.V2TXLiveDef.V2TXLiveLogConfig v2TXLiveLogConfig) {
        com.tencent.liteav.base.util.LiteavLog.b bVar;
        if (v2TXLiveLogConfig != null) {
            com.tencent.liteav.base.util.LiteavLog.nativeSetConsoleLogEnabled(v2TXLiveLogConfig.enableConsole);
            com.tencent.liteav.base.util.LiteavLog.nativeSetLogToFileEnabled(v2TXLiveLogConfig.enableLogFile);
            java.lang.String str = v2TXLiveLogConfig.logPath;
            if (str != null) {
                com.tencent.liteav.base.util.LiteavLog.nativeSetLogFilePath(str);
            }
            int i17 = v2TXLiveLogConfig.logLevel;
            if (i17 == 2) {
                bVar = com.tencent.liteav.base.util.LiteavLog.b.kInfo;
            } else if (i17 == 3) {
                bVar = com.tencent.liteav.base.util.LiteavLog.b.kWarning;
            } else if (i17 == 4) {
                bVar = com.tencent.liteav.base.util.LiteavLog.b.kError;
            } else if (i17 == 5) {
                bVar = com.tencent.liteav.base.util.LiteavLog.b.kFatal;
            } else if (i17 != 6) {
                bVar = com.tencent.liteav.base.util.LiteavLog.b.kAll;
            } else {
                bVar = com.tencent.liteav.base.util.LiteavLog.b.kNone;
            }
            com.tencent.liteav.base.util.LiteavLog.nativeSetLogLevel(bVar.mNativeValue);
            com.tencent.live2.impl.a.C0015a c0015a = f47194a;
            boolean z17 = v2TXLiveLogConfig.enableObserver;
            if (!z17) {
                c0015a = null;
            }
            com.tencent.liteav.base.util.LiteavLog.setCallback(c0015a);
            com.tencent.liteav.base.util.LiteavLog.nativeSetLogCallbackEnabled(z17);
        }
    }

    public static void a(java.lang.String str) {
        com.tencent.liteav.base.util.CommonUtil.setGlobalEnv(str);
    }

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.tencent.liteav.base.ContextUtils.initApplicationContext(context.getApplicationContext());
        com.tencent.liteav.base.ContextUtils.setDataDirectorySuffix("liteav");
        com.tencent.liteav.sdk.common.LicenseChecker.getInstance().setListener(new com.tencent.liteav.sdk.common.LicenseChecker.b() { // from class: com.tencent.live2.impl.a.1
            @Override // com.tencent.liteav.sdk.common.LicenseChecker.b
            public final void a(int i17, java.lang.String str3) {
                com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = com.tencent.live2.impl.a.f47195b;
                if (v2TXLivePremierObserver != null) {
                    v2TXLivePremierObserver.onLicenceLoaded(i17, str3);
                }
            }
        });
        com.tencent.liteav.sdk.common.LicenseChecker.getInstance().setLicense(com.tencent.liteav.sdk.common.LicenseChecker.c.LIVE, str, str2);
    }

    public static void a(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, com.tencent.live2.V2TXLiveDef.V2TXLiveSocks5ProxyConfig v2TXLiveSocks5ProxyConfig) {
        com.tencent.liteav.base.util.CommonUtil.setSocks5Proxy(str, i17, str2, str3, v2TXLiveSocks5ProxyConfig.supportHttps, v2TXLiveSocks5ProxyConfig.supportTcp, v2TXLiveSocks5ProxyConfig.supportUdp);
    }

    public static void a(boolean z17, com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        com.tencent.liteav.live.V2TXLivePremierJni.enableAudioCaptureObserver(z17, v2TXLiveAudioFrameObserverFormat);
    }

    public static void a(boolean z17) {
        com.tencent.liteav.live.V2TXLivePremierJni.enableVoiceEarMonitorObserver(z17);
    }
}
