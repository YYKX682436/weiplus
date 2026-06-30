package org.p3343x72743996.net;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "net")
/* renamed from: org.chromium.net.ProxyChangeListener */
/* loaded from: classes13.dex */
public class C29542x701272 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f74216x7118e671 = false;
    private static final java.lang.String TAG = "ProxyChangeListener";

    /* renamed from: sEnabled */
    private static boolean f74217xad6f4b4e = true;

    /* renamed from: mDelegate */
    private org.p3343x72743996.net.C29542x701272.Delegate f74218x55d38512;

    /* renamed from: mHandler */
    private final android.os.Handler f74219xc7640a1d;

    /* renamed from: mLooper */
    private final android.os.Looper f74220xe07e11e;

    /* renamed from: mNativePtr */
    private long f74221x3e9ea96a;

    /* renamed from: mProxyReceiver */
    private org.p3343x72743996.net.C29542x701272.ProxyReceiver f74222x1b11d310;

    /* renamed from: mRealProxyReceiver */
    private android.content.BroadcastReceiver f74223xcc6a3892;

    /* renamed from: org.chromium.net.ProxyChangeListener$Delegate */
    /* loaded from: classes13.dex */
    public interface Delegate {
        /* renamed from: proxySettingsChanged */
        void m153462x4e51e4c3();
    }

    /* renamed from: org.chromium.net.ProxyChangeListener$Natives */
    /* loaded from: classes13.dex */
    public interface Natives {
        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "ProxyConfigServiceAndroid::JNIDelegate")
        /* renamed from: proxySettingsChanged */
        void mo153463x4e51e4c3(long j17, org.p3343x72743996.net.C29542x701272 c29542x701272);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "ProxyConfigServiceAndroid::JNIDelegate")
        /* renamed from: proxySettingsChangedTo */
        void mo153464x16bca9e(long j17, org.p3343x72743996.net.C29542x701272 c29542x701272, java.lang.String str, int i17, java.lang.String str2, java.lang.String[] strArr);
    }

    /* renamed from: org.chromium.net.ProxyChangeListener$ProxyConfig */
    /* loaded from: classes13.dex */
    public static class ProxyConfig {

        /* renamed from: DIRECT */
        public static final org.p3343x72743996.net.C29542x701272.ProxyConfig f74224x78348fe9 = new org.p3343x72743996.net.C29542x701272.ProxyConfig("", 0, "", new java.lang.String[0]);

        /* renamed from: mExclusionList */
        public final java.lang.String[] f74225x96ea541f;

        /* renamed from: mHost */
        public final java.lang.String f74226x6226bb5;

        /* renamed from: mPacUrl */
        public final java.lang.String f74227x1410224a;

        /* renamed from: mPort */
        public final int f74228x6260e8e;

        public ProxyConfig(java.lang.String str, int i17, java.lang.String str2, java.lang.String[] strArr) {
            this.f74226x6226bb5 = str;
            this.f74228x6260e8e = i17;
            this.f74227x1410224a = str2;
            this.f74225x96ea541f = strArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: fromProxyInfo */
        public static org.p3343x72743996.net.C29542x701272.ProxyConfig m153466x62ccc3b2(android.net.ProxyInfo proxyInfo) {
            if (proxyInfo == null) {
                return null;
            }
            java.lang.String host = proxyInfo.getHost();
            android.net.Uri pacFileUrl = proxyInfo.getPacFileUrl();
            if (host == null) {
                host = "";
            }
            return new org.p3343x72743996.net.C29542x701272.ProxyConfig(host, proxyInfo.getPort(), android.net.Uri.EMPTY.equals(pacFileUrl) ? null : pacFileUrl.toString(), proxyInfo.getExclusionList());
        }

        /* renamed from: toString */
        public java.lang.String m153467x9616526c() {
            java.lang.String str = (this.f74226x6226bb5.equals("localhost") || this.f74226x6226bb5.isEmpty()) ? this.f74226x6226bb5 : "<redacted>";
            java.util.Locale locale = java.util.Locale.US;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str;
            objArr[1] = java.lang.Integer.valueOf(this.f74228x6260e8e);
            objArr[2] = this.f74227x1410224a == null ? "null" : "\"<redacted>\"";
            return java.lang.String.format(locale, "ProxyConfig [mHost=\"%s\", mPort=%d, mPacUrl=%s]", objArr);
        }
    }

    /* renamed from: org.chromium.net.ProxyChangeListener$ProxyReceiver */
    /* loaded from: classes13.dex */
    public class ProxyReceiver extends android.content.BroadcastReceiver {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onReceive$0 */
        public /* synthetic */ void m153468xc621aa33(android.content.Intent intent) {
            org.p3343x72743996.net.C29542x701272.this.m153453x4e51e4c3(org.p3343x72743996.net.C29542x701272.m153447x3b31644f(intent));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, final android.content.Intent intent) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                org.p3343x72743996.net.C29542x701272.this.m153455x7804874(new java.lang.Runnable() { // from class: org.chromium.net.ProxyChangeListener$ProxyReceiver$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        org.p3343x72743996.net.C29542x701272.ProxyReceiver.this.m153468xc621aa33(intent);
                    }
                });
            }
        }

        private ProxyReceiver() {
        }
    }

    private C29542x701272() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        this.f74220xe07e11e = myLooper;
        this.f74219xc7640a1d = new android.os.Handler(myLooper);
    }

    /* renamed from: assertOnThread */
    private void m153445x4354162f() {
        if (org.p3343x72743996.p3353x59bc66e.C29454xce2ad330.f73669xed5d0f11 && !m153452x5ad5e4c9()) {
            throw new java.lang.IllegalStateException("Must be called on ProxyChangeListener thread.");
        }
    }

    /* renamed from: create */
    public static org.p3343x72743996.net.C29542x701272 m153446xaf65a0fc() {
        return new org.p3343x72743996.net.C29542x701272();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: extractNewProxy */
    public static org.p3343x72743996.net.C29542x701272.ProxyConfig m153447x3b31644f(android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        return org.p3343x72743996.net.C29542x701272.ProxyConfig.m153466x62ccc3b2((android.net.ProxyInfo) extras.get("android.intent.extra.PROXY_INFO"));
    }

    /* renamed from: getProperty */
    public static java.lang.String m153448x40a81b4b(java.lang.String str) {
        return java.lang.System.getProperty(str);
    }

    /* renamed from: getProxyConfig */
    private org.p3343x72743996.net.C29542x701272.ProxyConfig m153449x3b48761a(android.content.Intent intent) {
        org.p3343x72743996.net.C29542x701272.ProxyConfig m153466x62ccc3b2 = org.p3343x72743996.net.C29542x701272.ProxyConfig.m153466x62ccc3b2(((android.net.ConnectivityManager) org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getSystemService("connectivity")).getDefaultProxy());
        if (m153466x62ccc3b2 == null) {
            return org.p3343x72743996.net.C29542x701272.ProxyConfig.f74224x78348fe9;
        }
        if (android.os.Build.VERSION.SDK_INT < 29 || !m153466x62ccc3b2.f74226x6226bb5.equals("localhost") || m153466x62ccc3b2.f74228x6260e8e != -1) {
            return m153466x62ccc3b2;
        }
        org.p3343x72743996.net.C29542x701272.ProxyConfig m153447x3b31644f = m153447x3b31644f(intent);
        org.p3343x72743996.p3344x2e06d1.Log.i(TAG, "configFromConnectivityManager = %s, configFromIntent = %s", m153466x62ccc3b2, m153447x3b31644f);
        if (m153447x3b31644f == null) {
            return null;
        }
        return new org.p3343x72743996.net.C29542x701272.ProxyConfig(m153447x3b31644f.f74226x6226bb5, m153447x3b31644f.f74228x6260e8e, m153466x62ccc3b2.f74227x1410224a, m153466x62ccc3b2.f74225x96ea541f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setDelegateForTesting$0 */
    public /* synthetic */ void m153450x15ca1b9d(org.p3343x72743996.net.C29542x701272.Delegate delegate) {
        this.f74218x55d38512 = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateProxyConfigFromConnectivityManager$1 */
    public /* synthetic */ void m153451xd5da76f(android.content.Intent intent) {
        m153453x4e51e4c3(m153449x3b48761a(intent));
    }

    /* renamed from: onThread */
    private boolean m153452x5ad5e4c9() {
        return this.f74220xe07e11e == android.os.Looper.myLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: proxySettingsChanged */
    public void m153453x4e51e4c3(org.p3343x72743996.net.C29542x701272.ProxyConfig proxyConfig) {
        m153445x4354162f();
        if (f74217xad6f4b4e) {
            org.p3343x72743996.net.C29542x701272.Delegate delegate = this.f74218x55d38512;
            if (delegate != null) {
                delegate.m153462x4e51e4c3();
            }
            if (this.f74221x3e9ea96a == 0) {
                return;
            }
            if (proxyConfig != null) {
                org.p3343x72743996.net.C29546xf1f3a3d3.get().mo153464x16bca9e(this.f74221x3e9ea96a, this, proxyConfig.f74226x6226bb5, proxyConfig.f74228x6260e8e, proxyConfig.f74227x1410224a, proxyConfig.f74225x96ea541f);
            } else {
                org.p3343x72743996.net.C29546xf1f3a3d3.get().mo153463x4e51e4c3(this.f74221x3e9ea96a, this);
            }
        }
    }

    /* renamed from: registerBroadcastReceiver */
    private void m153454xb544b16d() {
        m153445x4354162f();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
        this.f74222x1b11d310 = new org.p3343x72743996.net.C29542x701272.ProxyReceiver();
        if (!org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152356x5d82a078()) {
            org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152359x63418b3(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035(), this.f74222x1b11d310, new android.content.IntentFilter());
        }
        this.f74223xcc6a3892 = new org.p3343x72743996.net.C29541x7f017122(this);
        org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152361xd9ec0c5(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035(), this.f74223xcc6a3892, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: runOnThread */
    public void m153455x7804874(java.lang.Runnable runnable) {
        if (m153452x5ad5e4c9()) {
            runnable.run();
        } else {
            this.f74219xc7640a1d.post(runnable);
        }
    }

    /* renamed from: setEnabled */
    public static void m153456x514e147f(boolean z17) {
        f74217xad6f4b4e = z17;
    }

    /* renamed from: unregisterBroadcastReceiver */
    private void m153457xb2b310f4() {
        m153445x4354162f();
        org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().unregisterReceiver(this.f74222x1b11d310);
        if (this.f74223xcc6a3892 != null) {
            org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().unregisterReceiver(this.f74223xcc6a3892);
        }
        this.f74222x1b11d310 = null;
        this.f74223xcc6a3892 = null;
    }

    /* renamed from: setDelegateForTesting */
    public void m153458xc4b5346e(org.p3343x72743996.net.C29542x701272.Delegate delegate) {
        final org.p3343x72743996.net.C29542x701272.Delegate delegate2 = this.f74218x55d38512;
        this.f74218x55d38512 = delegate;
        org.p3343x72743996.p3344x2e06d1.C29364x88e8a208.m152639xd6dc2ea3(new java.lang.Runnable() { // from class: org.chromium.net.ProxyChangeListener$$b
            @Override // java.lang.Runnable
            public final void run() {
                org.p3343x72743996.net.C29542x701272.this.m153450x15ca1b9d(delegate2);
            }
        });
    }

    /* renamed from: start */
    public void m153459x68ac462(long j17) {
        org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90("ProxyChangeListener.start");
        try {
            m153445x4354162f();
            this.f74221x3e9ea96a = j17;
            m153454xb544b16d();
            if (m152702xc9e48c90 != null) {
                m152702xc9e48c90.close();
            }
        } catch (java.lang.Throwable th6) {
            if (m152702xc9e48c90 != null) {
                try {
                    m152702xc9e48c90.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: stop */
    public void m153460x360802() {
        m153445x4354162f();
        this.f74221x3e9ea96a = 0L;
        m153457xb2b310f4();
    }

    /* renamed from: updateProxyConfigFromConnectivityManager */
    public void m153461xa0968f25(final android.content.Intent intent) {
        m153455x7804874(new java.lang.Runnable() { // from class: org.chromium.net.ProxyChangeListener$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.p3343x72743996.net.C29542x701272.this.m153451xd5da76f(intent);
            }
        });
    }
}
