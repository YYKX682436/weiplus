package com.p314xaae8f345.map.p511x696c9db.net;

/* renamed from: com.tencent.map.tools.net.NetManager */
/* loaded from: classes13.dex */
public class C4327x946a3f70 {

    /* renamed from: sInstance */
    private static com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70 f16941xbfaed628;

    /* renamed from: mAdapter */
    private com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312 f16942x59855622;

    /* renamed from: mGlobalSecretKey */
    private java.lang.String f16946x6258ccff;

    /* renamed from: thisLocationRegion */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329 f16948x6f198547;

    /* renamed from: thisNetStatusObserverOwner */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lp f16949x9281660c;

    /* renamed from: mInited */
    private boolean f16947x8d8947c = false;

    /* renamed from: mGlobalForceHttps */
    private boolean f16943x460d6350 = true;

    /* renamed from: mGlobalNetFlowRuleList */
    private final java.util.HashMap<java.lang.String, java.lang.String> f16945x290b0eb5 = new java.util.HashMap<>();

    /* renamed from: mGlobalNetFlowProcessorClzList */
    private final java.util.HashSet<java.lang.Class<? extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.md>> f16944xfdfd0e78 = new java.util.HashSet<>();

    /* renamed from: thisRegionChangedListener */
    private final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.LocationRegionChangedListener f16950x50d0d1f6 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.LocationRegionChangedListener() { // from class: com.tencent.map.tools.net.NetManager.1
        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.LocationRegionChangedListener
        /* renamed from: onLocationRegionChanged */
        public final void mo35945x43d64acc(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329 c26051xb5982329, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329 c26051xb59823292) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131758z, "onLocationRegionChanged prev:" + c26051xb5982329 + " cur:" + c26051xb59823292);
            com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.this.f16948x6f198547 = c26051xb59823292;
        }
    };

    /* renamed from: com.tencent.map.tools.net.NetManager$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f130220a;

        static {
            int[] iArr = new int[com.p314xaae8f345.map.p511x696c9db.net.EnumC4323x864e0f09.m35892xcee59d22().length];
            f130220a = iArr;
            try {
                iArr[com.p314xaae8f345.map.p511x696c9db.net.EnumC4323x864e0f09.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f130220a[com.p314xaae8f345.map.p511x696c9db.net.EnumC4323x864e0f09.URL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f130220a[com.p314xaae8f345.map.p511x696c9db.net.EnumC4323x864e0f09.Halley.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private C4327x946a3f70() {
    }

    /* renamed from: createAdapter */
    public static com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312 m35927x4153c6b3(android.content.Context context, com.p314xaae8f345.map.p511x696c9db.net.C4326x99a7cf1f c4326x99a7cf1f) {
        if (c4326x99a7cf1f == null) {
            c4326x99a7cf1f = com.p314xaae8f345.map.p511x696c9db.net.C4326x99a7cf1f.m35906xaf65a0fc().m35918x2329aec2(true).m35916x93202167(com.p314xaae8f345.map.p511x696c9db.net.EnumC4323x864e0f09.URL);
        }
        int[] iArr = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.AnonymousClass2.f130220a;
        c4326x99a7cf1f.m35907xfcbaadf3().ordinal();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lr lrVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lr();
        lrVar.mo35902x7420f26d(context, c4326x99a7cf1f);
        return lrVar;
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70 m35928x9cf0d20b() {
        com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70 c4327x946a3f70;
        synchronized (com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.class) {
            if (f16941xbfaed628 == null) {
                f16941xbfaed628 = new com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70();
            }
            c4327x946a3f70 = f16941xbfaed628;
        }
        return c4327x946a3f70;
    }

    /* renamed from: init */
    public static void m35930x316510(android.content.Context context, com.p314xaae8f345.map.p511x696c9db.net.C4326x99a7cf1f c4326x99a7cf1f) {
        m35928x9cf0d20b().m35941xa1b041f(context, m35927x4153c6b3(context, c4326x99a7cf1f));
    }

    /* renamed from: addNetStatusListener */
    public void m35931x7234c322(com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4331x8e5805a3 interfaceC4331x8e5805a3) {
        if (interfaceC4331x8e5805a3 == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lp lpVar = this.f16949x9281660c;
        if (lpVar.f131871a.containsKey(interfaceC4331x8e5805a3)) {
            return;
        }
        lpVar.f131871a.put(interfaceC4331x8e5805a3, java.lang.Boolean.TRUE);
        if (lpVar.f131871a.size() == 1) {
            lpVar.a();
        }
    }

    /* renamed from: appendNetFlowRules */
    public void m35932x66b2786(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312 interfaceC4325x1e0dd312 = this.f16942x59855622;
        if (interfaceC4325x1e0dd312 != null) {
            interfaceC4325x1e0dd312.mo35898xa497810f().putAll(hashMap);
        }
    }

    /* renamed from: available */
    public boolean m35933xd4418ac9() {
        return this.f16942x59855622 != null && this.f16947x8d8947c;
    }

    /* renamed from: builder */
    public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m35934xdc3ef9b() {
        return m35935xdc3ef9b("");
    }

    /* renamed from: doGet */
    public com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35936x5b4bacb(java.lang.String str, java.lang.String str2, int i17, int i18, java.util.HashMap<java.lang.String, java.lang.String> hashMap, com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4342x2d523d6f c4342x2d523d6f) {
        return m35934xdc3ef9b().url(str).m36010xed8c2fbe(i17).m36005xb734e28d(hashMap).m36016x12900dfa(str2).m36012xb1aed541(i18).m35994xf8a884a7(c4342x2d523d6f).m35995x5b4bacb();
    }

    /* renamed from: doPost */
    public com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35937xb0e6dbcb(java.lang.String str, java.lang.String str2, byte[] bArr, int i17, int i18, java.util.HashMap<java.lang.String, java.lang.String> hashMap, com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4342x2d523d6f c4342x2d523d6f) {
        return m35934xdc3ef9b().url(str).m36016x12900dfa(str2).m36007x2d17ac6a(bArr).m36010xed8c2fbe(i17).m36005xb734e28d(hashMap).m36012xb1aed541(i18).m35994xf8a884a7(c4342x2d523d6f).m35996xb0e6dbcb();
    }

    /* renamed from: doRequest */
    public com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35938x99e55b84(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252) {
        return m35926xdc3ef9b(c4329xa3f02252).m35997x99e55b84();
    }

    /* renamed from: doStream */
    public com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35939x180373eb(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252) {
        return m35926xdc3ef9b(c4329xa3f02252).m35998x180373eb();
    }

    /* renamed from: getRegionChangedListener */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.LocationRegionChangedListener m35940xccabb43e() {
        return this.f16950x50d0d1f6;
    }

    /* renamed from: initAdapter */
    public void m35941xa1b041f(android.content.Context context, com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312 interfaceC4325x1e0dd312) {
        if (interfaceC4325x1e0dd312 == null) {
            return;
        }
        com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312 interfaceC4325x1e0dd3122 = this.f16942x59855622;
        if (interfaceC4325x1e0dd3122 != interfaceC4325x1e0dd312) {
            this.f16947x8d8947c = false;
            if (interfaceC4325x1e0dd3122 != null) {
                interfaceC4325x1e0dd312.mo35898xa497810f().putAll(this.f16942x59855622.mo35898xa497810f());
            }
            this.f16942x59855622 = interfaceC4325x1e0dd312;
            m35929x316510();
        }
        if (this.f16949x9281660c == null) {
            this.f16949x9281660c = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lp(context);
        }
    }

    /* renamed from: removeNetStatusListener */
    public void m35942xd194a59f(com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4331x8e5805a3 interfaceC4331x8e5805a3) {
        if (interfaceC4331x8e5805a3 == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lp lpVar = this.f16949x9281660c;
        if (java.lang.Boolean.TRUE.equals(lpVar.f131871a.remove(interfaceC4331x8e5805a3)) && lpVar.f131871a.isEmpty()) {
            try {
                android.net.ConnectivityManager connectivityManager = lpVar.f131872b.get();
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(lpVar);
                }
            } catch (java.lang.Exception unused) {
            } catch (java.lang.Throwable th6) {
                lpVar.f131874d.removeCallbacks(lpVar.f131873c);
                throw th6;
            }
            lpVar.f131874d.removeCallbacks(lpVar.f131873c);
        }
    }

    /* renamed from: requestNetworkStatusAsync */
    public void m35943xf858f78b() {
        this.f16949x9281660c.a();
    }

    /* renamed from: setAdapter */
    public void m35944x6cab2c8d(android.content.Context context, com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312 interfaceC4325x1e0dd312) {
        if (interfaceC4325x1e0dd312 instanceof com.p314xaae8f345.map.p511x696c9db.net.p514xbb6ca34f.C4333x422c710e) {
            ((com.p314xaae8f345.map.p511x696c9db.net.p514xbb6ca34f.C4333x422c710e) interfaceC4325x1e0dd312).m36043xe6cb0683(m35927x4153c6b3(context, com.p314xaae8f345.map.p511x696c9db.net.C4326x99a7cf1f.m35906xaf65a0fc()));
        }
        m35941xa1b041f(context, interfaceC4325x1e0dd312);
    }

    /* renamed from: builder */
    public com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m35935xdc3ef9b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = this.f16946x6258ccff;
        }
        com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder netRequestBuilder = new com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder(this.f16942x59855622, str, this.f16948x6f198547);
        netRequestBuilder.m36001x6c4a8c0(this.f16943x460d6350);
        return netRequestBuilder;
    }

    /* renamed from: init */
    private void m35929x316510() {
        com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312 interfaceC4325x1e0dd312;
        if (this.f16947x8d8947c || (interfaceC4325x1e0dd312 = this.f16942x59855622) == null) {
            return;
        }
        this.f16947x8d8947c = true;
        this.f16948x6f198547 = null;
        this.f16943x460d6350 = interfaceC4325x1e0dd312.mo35903x882fa58a();
        this.f16946x6258ccff = this.f16942x59855622.mo35901xd3588ad9();
        this.f16945x290b0eb5.putAll(this.f16942x59855622.mo35898xa497810f());
        this.f16944xfdfd0e78.addAll(this.f16942x59855622.mo35897x2ada13dd());
    }

    /* renamed from: builder */
    private com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder m35926xdc3ef9b(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252) {
        return new com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder(this.f16942x59855622, this.f16946x6258ccff, this.f16948x6f198547, c4329xa3f02252);
    }
}
