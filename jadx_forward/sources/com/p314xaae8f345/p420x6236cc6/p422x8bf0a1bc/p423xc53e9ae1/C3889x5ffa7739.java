package com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p423xc53e9ae1;

/* renamed from: com.tencent.live2.jsplugin.player.V2TXLivePlayerJSAdapter */
/* loaded from: classes16.dex */
public class C3889x5ffa7739 extends com.p314xaae8f345.p420x6236cc6.p421x316220.a.a {

    /* renamed from: FRAMEWORK_TYPE_LIVEV2_WXAPPLET */
    private static final int f15541x3262550e = 9;

    /* renamed from: FRAMEWORK_TYPE_WXROOM_WXAPPLET */
    private static final int f15542x8f311cda = 3;

    /* renamed from: ROOM_PROTOCOL_PREFIX */
    private static final java.lang.String f15543x8158c2b5 = "room";
    private static final java.lang.String TAG = "applet-player-api";

    /* renamed from: _hellAccFlag_ */
    private byte f15544x7f11beae;

    /* renamed from: mAudioVolumeListener */
    private com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioVolumeEvaluationListener f15545x194e5db7;

    /* renamed from: mConfig */
    private com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p423xc53e9ae1.C3890xc5128a18 f15546xfeabaa0f;

    /* renamed from: mIsInit */
    private boolean f15547x9106827;

    /* renamed from: mNeedCompressSnapshot */
    private boolean f15548x408a4009;

    /* renamed from: mNetworkQuality */
    private int f15549xc7f7d8be;

    /* renamed from: mPlayListener */
    private com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 f15550xbe0c5915;

    /* renamed from: mPlayMode */
    private com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMode f15551x94f62684;

    /* renamed from: mPlayer */
    private com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d f15552x14aac1ae;

    /* renamed from: mSnapshotListener */
    private com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXSnapshotListener f15554x65e9c525;

    /* renamed from: mPlayerId */
    private java.lang.String f15553x95011769 = "";

    /* renamed from: mTraceId */
    private java.lang.String f15555x5e797013 = "";

    static {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.q.a();
    }

    public C3889x5ffa7739(android.content.Context context) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29241x91f62b6f(context.getApplicationContext());
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29246xa5f59752("liteav");
        com.p314xaae8f345.p420x6236cc6.p421x316220.C3881xd0e3e0ed c3881xd0e3e0ed = new com.p314xaae8f345.p420x6236cc6.p421x316220.C3881xd0e3e0ed(context);
        this.f15552x14aac1ae = c3881xd0e3e0ed;
        c3881xd0e3e0ed.mo30016x8b59f158(this);
        this.f15549xc7f7d8be = 2;
        this.f15546xfeabaa0f = new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p423xc53e9ae1.C3890xc5128a18();
    }

    /* renamed from: apiOnlineError */
    private void m31946x93dde0fb(java.lang.String str, boolean z17) {
        if (str == null) {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(this.f15555x5e797013)) {
            this.f15555x5e797013 = java.lang.String.valueOf(hashCode()).substring(java.lang.String.valueOf(hashCode()).length() - 4);
        }
        if (!z17 || !m31949x6cdfba93(this.f15546xfeabaa0f.url)) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "[" + this.f15555x5e797013 + "][" + this.f15553x95011769 + "] " + str);
            return;
        }
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3885xb931d0cb.m31939x9cf0d20b().log("[applet-player-api][" + this.f15555x5e797013 + "][" + this.f15553x95011769 + "] " + str, true);
    }

    /* renamed from: apiOnlineLog */
    private void m31947xaee7d2f7(java.lang.String str, boolean z17) {
        if (str == null) {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(this.f15555x5e797013)) {
            this.f15555x5e797013 = java.lang.String.valueOf(hashCode()).substring(java.lang.String.valueOf(hashCode()).length() - 4);
        }
        if (!z17 || !m31949x6cdfba93(this.f15546xfeabaa0f.url)) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "[" + this.f15555x5e797013 + "][" + this.f15553x95011769 + "] " + str);
            return;
        }
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3885xb931d0cb.m31939x9cf0d20b().log("[applet-player-api][" + this.f15555x5e797013 + "][" + this.f15553x95011769 + "] " + str, true);
    }

    /* renamed from: callbackSDKVersion */
    private void m31948x2fdb5163() {
        com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1 = this.f15550xbe0c5915;
        if (interfaceC25479x1853e9c1 != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46285x5018f760, com.p314xaae8f345.p2926x359365.C25481x77f18081.m94461xdb46aa5d());
            bundle.putLong("EVT_TIME", java.lang.System.currentTimeMillis());
            m31947xaee7d2f7("OnPlayEvent: event[-9999999], msg[" + bundle.toString() + "]", false);
            interfaceC25479x1853e9c1.mo15376x8cd414a7(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15482x74a92e6b, bundle);
        }
    }

    /* renamed from: checkIsRoomProtocolByUrl */
    private boolean m31949x6cdfba93(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && str.startsWith(f15543x8158c2b5);
    }

    /* renamed from: getPlayerIdByURL */
    private java.lang.String m31950xbc6e2f66(java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return "";
            }
            if (!str.startsWith(com.p314xaae8f345.p420x6236cc6.p421x316220.C3884x280948e5.f15470x6f8f616f) && !str.startsWith(com.p314xaae8f345.p420x6236cc6.p421x316220.C3884x280948e5.f15471x6f8f6170)) {
                return com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3886xbc69c2c2.m31943xe699b631(str);
            }
            return com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3886xbc69c2c2.m31944x4b3e091f(str, "userid");
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "Get streamId failed, url:".concat(java.lang.String.valueOf(str)));
            return "";
        }
    }

    /* renamed from: initLivePlayerInner */
    private com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m31951xeb526439(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, android.os.Bundle bundle) {
        if (bundle == null) {
            m31946x93dde0fb("Init player failed, params is null", false);
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-1, "Init player failed, params is null");
        }
        if (this.f15547x9106827) {
            m31946x93dde0fb("Init player failed, player has been initialized", false);
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-1, "Init player failed, player has been initialized");
        }
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
            this.f15552x14aac1ae.mo30023x63923b5d(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
        }
        m31947xaee7d2f7("Init player success", false);
        this.f15547x9106827 = true;
        this.f15546xfeabaa0f.m31971x1726ba75(bundle);
        this.f15553x95011769 = m31950xbc6e2f66(this.f15546xfeabaa0f.url);
        m31953xe71ea6f7(this.f15546xfeabaa0f);
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: setDiffParams */
    private void m31952x5eaa1fed(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p423xc53e9ae1.C3890xc5128a18 c3890xc5128a18, com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p423xc53e9ae1.C3890xc5128a18 c3890xc5128a182) {
        java.lang.String m31969x2cd9a3a7 = c3890xc5128a182.m31969x2cd9a3a7(c3890xc5128a18);
        if (!android.text.TextUtils.isEmpty(m31969x2cd9a3a7)) {
            m31947xaee7d2f7("Set diff config:".concat(java.lang.String.valueOf(m31969x2cd9a3a7)), true);
        }
        boolean z17 = c3890xc5128a18.f15564x8ae37bd8;
        boolean z18 = c3890xc5128a182.f15564x8ae37bd8;
        if (z17 != z18) {
            if (z18) {
                this.f15552x14aac1ae.mo30012xfcac4825();
            } else {
                this.f15552x14aac1ae.mo30014xfac6704e();
            }
        }
        boolean z19 = c3890xc5128a18.f15563x89c10333;
        boolean z27 = c3890xc5128a182.f15563x89c10333;
        if (z19 != z27) {
            if (z27) {
                this.f15552x14aac1ae.mo30011xfb89cf80();
            } else {
                this.f15552x14aac1ae.mo30013xf9a3f7a9();
            }
        }
        boolean z28 = c3890xc5128a18.f15559x2eec3e99;
        boolean z29 = c3890xc5128a182.f15559x2eec3e99;
        if (z28 != z29) {
            this.f15552x14aac1ae.mo29985x8fd95bb0(z29, 5);
            this.f15552x14aac1ae.mo29985x8fd95bb0(c3890xc5128a182.f15559x2eec3e99, 100);
            this.f15552x14aac1ae.mo29985x8fd95bb0(c3890xc5128a182.f15559x2eec3e99, 242);
            this.f15552x14aac1ae.mo29985x8fd95bb0(c3890xc5128a182.f15559x2eec3e99, 243);
        }
        boolean z37 = c3890xc5128a18.f15558x6f9b6155;
        boolean z38 = c3890xc5128a182.f15558x6f9b6155;
        if (z37 != z38) {
            this.f15552x14aac1ae.mo30024xcdf6351b(z38);
        }
        float f17 = c3890xc5128a18.f15566xace13c50;
        float f18 = c3890xc5128a182.f15566xace13c50;
        if (f17 != f18 || c3890xc5128a18.f15565x16bfd87e != c3890xc5128a182.f15565x16bfd87e) {
            this.f15552x14aac1ae.mo30015x8b5725e6(java.lang.Math.min(f18, c3890xc5128a182.f15565x16bfd87e), java.lang.Math.max(c3890xc5128a182.f15566xace13c50, c3890xc5128a182.f15565x16bfd87e));
        }
        int i17 = c3890xc5128a18.f15569x199fd88b;
        int i18 = c3890xc5128a182.f15569x199fd88b;
        if (i17 != i18) {
            this.f15552x14aac1ae.mo29986x740a3599(i18);
        }
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveFillMode v2TXLiveFillMode = c3890xc5128a18.f15560xd48829c6;
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveFillMode v2TXLiveFillMode2 = c3890xc5128a182.f15560xd48829c6;
        if (v2TXLiveFillMode != v2TXLiveFillMode2) {
            this.f15552x14aac1ae.mo30019x1c840e7e(v2TXLiveFillMode2);
        }
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRotation v2TXLiveRotation = c3890xc5128a18.f15568x8f06bf34;
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRotation v2TXLiveRotation2 = c3890xc5128a182.f15568x8f06bf34;
        if (v2TXLiveRotation != v2TXLiveRotation2) {
            this.f15552x14aac1ae.mo30020x4594f436(v2TXLiveRotation2);
        }
        int i19 = c3890xc5128a18.f15557x5ba01c13;
        int i27 = c3890xc5128a182.f15557x5ba01c13;
        if (i19 != i27) {
            this.f15552x14aac1ae.mo30018x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15450x3ca3210e, java.lang.Integer.valueOf(i27));
        }
        if (!android.text.TextUtils.isEmpty(c3890xc5128a182.url) && !c3890xc5128a182.url.equals(c3890xc5128a18.url) && c3890xc5128a182.f15562xdf3b1de9 && c3890xc5128a182.f15561x267714cd) {
            if (this.f15552x14aac1ae.mo29989xc00617a4() == 1) {
                m31947xaee7d2f7("Set diff config:[auto play is true, url is changed, player is playing], need to stop play", false);
                this.f15552x14aac1ae.mo30029x66343656();
            }
            m31947xaee7d2f7("Set diff config:[auto play is true, url is changed, player is not playing], need to start auto play", false);
            m31954x79bfdd40(c3890xc5128a182.url, c3890xc5128a182.f15567x3339a3);
        }
        if (!c3890xc5128a182.f15561x267714cd || !c3890xc5128a182.f15562xdf3b1de9 || android.text.TextUtils.isEmpty(c3890xc5128a182.url) || this.f15552x14aac1ae.mo29989xc00617a4() == 1) {
            return;
        }
        m31947xaee7d2f7("Set diff config:[auto play is true, url is not empty, player is not playing], need to start auto play", false);
        m31954x79bfdd40(c3890xc5128a182.url, c3890xc5128a182.f15567x3339a3);
    }

    /* renamed from: setFullParams */
    private void m31953xe71ea6f7(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p423xc53e9ae1.C3890xc5128a18 c3890xc5128a18) {
        m31947xaee7d2f7("Set full config:".concat(java.lang.String.valueOf(c3890xc5128a18)), true);
        if (c3890xc5128a18.f15564x8ae37bd8) {
            this.f15552x14aac1ae.mo30012xfcac4825();
        } else {
            this.f15552x14aac1ae.mo30014xfac6704e();
        }
        if (c3890xc5128a18.f15563x89c10333) {
            this.f15552x14aac1ae.mo30011xfb89cf80();
        } else {
            this.f15552x14aac1ae.mo30013xf9a3f7a9();
        }
        this.f15552x14aac1ae.mo29985x8fd95bb0(c3890xc5128a18.f15559x2eec3e99, 5);
        this.f15552x14aac1ae.mo29985x8fd95bb0(c3890xc5128a18.f15559x2eec3e99, 100);
        this.f15552x14aac1ae.mo29985x8fd95bb0(c3890xc5128a18.f15559x2eec3e99, 242);
        this.f15552x14aac1ae.mo29985x8fd95bb0(c3890xc5128a18.f15559x2eec3e99, 243);
        this.f15552x14aac1ae.mo30024xcdf6351b(c3890xc5128a18.f15558x6f9b6155);
        this.f15552x14aac1ae.mo30015x8b5725e6(java.lang.Math.min(c3890xc5128a18.f15566xace13c50, c3890xc5128a18.f15565x16bfd87e), java.lang.Math.max(c3890xc5128a18.f15566xace13c50, c3890xc5128a18.f15565x16bfd87e));
        this.f15552x14aac1ae.mo29986x740a3599(c3890xc5128a18.f15569x199fd88b);
        this.f15552x14aac1ae.mo30018x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15450x3ca3210e, java.lang.Integer.valueOf(c3890xc5128a18.f15557x5ba01c13));
        this.f15552x14aac1ae.mo30019x1c840e7e(c3890xc5128a18.f15560xd48829c6);
        this.f15552x14aac1ae.mo30020x4594f436(c3890xc5128a18.f15568x8f06bf34);
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p423xc53e9ae1.C3890xc5128a18 c3890xc5128a182 = this.f15546xfeabaa0f;
        if (c3890xc5128a182.f15562xdf3b1de9 && c3890xc5128a182.f15561x267714cd && !android.text.TextUtils.isEmpty(c3890xc5128a182.url)) {
            if (this.f15552x14aac1ae.mo29989xc00617a4() == 1) {
                this.f15552x14aac1ae.mo30029x66343656();
                m31946x93dde0fb("Set full config:[auto play is true, player is playing], need to stop play", false);
            }
            m31947xaee7d2f7("Set full config:[auto play is true, url is not empty, player is not playing], need to start auto play", false);
            com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p423xc53e9ae1.C3890xc5128a18 c3890xc5128a183 = this.f15546xfeabaa0f;
            m31954x79bfdd40(c3890xc5128a183.url, c3890xc5128a183.f15567x3339a3);
        }
    }

    /* renamed from: startPlayInner */
    private void m31954x79bfdd40(java.lang.String str, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            m31946x93dde0fb("Start play failed, url is empty", false);
            return;
        }
        int i18 = i17 == 1 ? ((str.startsWith("http://") || str.startsWith("https://")) && str.contains(".flv")) ? 1 : 0 : 5;
        m31947xaee7d2f7("Start play,[url:" + str + "][type:" + i18 + "]", false);
        this.f15551x94f62684 = com.p314xaae8f345.p420x6236cc6.p421x316220.C3884x280948e5.m31922x25cf2482(str);
        this.f15552x14aac1ae.mo30018x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15445x2997aef2, java.lang.Boolean.valueOf(i18 == 5));
        int i19 = (str.startsWith(com.p314xaae8f345.p420x6236cc6.p421x316220.C3884x280948e5.f15470x6f8f616f) || str.startsWith(com.p314xaae8f345.p420x6236cc6.p421x316220.C3884x280948e5.f15471x6f8f6170)) ? 3 : str.startsWith("trtc://") ? 9 : 0;
        if (i19 > 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46634x1dde913b, i19);
                jSONObject.put("component", 0);
            } catch (org.json.JSONException unused) {
            }
            this.f15552x14aac1ae.mo30018x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15452x8ae8e1a3, jSONObject.toString());
        }
        this.f15552x14aac1ae.mo30026x5c1200c2(str);
    }

    /* renamed from: initLivePlayer */
    public com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m31955x64e5041d(android.os.Bundle bundle) {
        m31948x2fdb5163();
        return m31951xeb526439(null, bundle);
    }

    /* renamed from: isMuted */
    public boolean m31957x7b1f9e61() {
        return this.f15546xfeabaa0f.f15563x89c10333;
    }

    /* renamed from: isPlaying */
    public boolean m31958xc00617a4() {
        return this.f15552x14aac1ae.mo29989xc00617a4() == 1;
    }

    @Override // com.p314xaae8f345.p420x6236cc6.p421x316220.a.a
    /* renamed from: onNetworkQuality */
    public void mo31926xf01276b0(int i17) {
        this.f15549xc7f7d8be = i17;
    }

    @Override // com.p314xaae8f345.p420x6236cc6.p421x316220.a.a
    /* renamed from: onPlayEvent */
    public void mo31927x8cd414a7(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1 = this.f15550xbe0c5915;
        if (interfaceC25479x1853e9c1 != null) {
            m31947xaee7d2f7("OnPlayEvent: event[" + i17 + "], msg[" + bundle.toString() + "]", false);
            interfaceC25479x1853e9c1.mo15376x8cd414a7(i17, bundle);
        }
    }

    @Override // com.p314xaae8f345.p420x6236cc6.p421x316220.a.a
    /* renamed from: onPlayNetStatus */
    public void mo31928x61e7cf7c(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.putInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46323x28b0e3f9, this.f15549xc7f7d8be);
        }
        com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1 = this.f15550xbe0c5915;
        if (interfaceC25479x1853e9c1 != null) {
            interfaceC25479x1853e9c1.mo15382x3bee38d0(bundle);
        }
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323
    /* renamed from: onPlayoutVolumeUpdate */
    public void mo31678x4b08ccde(com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d abstractC3875xd023692d, int i17) {
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener = this.f15545x194e5db7;
        if (iTXAudioVolumeEvaluationListener != null) {
            iTXAudioVolumeEvaluationListener.mo94542x4d82ef6(i17);
        }
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323
    /* renamed from: onReceiveSeiMessage */
    public void mo31679x5d08b6d4(com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d abstractC3875xd023692d, int i17, byte[] bArr) {
        com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1 = this.f15550xbe0c5915;
        if (interfaceC25479x1853e9c1 == null || !this.f15546xfeabaa0f.f15559x2eec3e99 || bArr.length <= 0) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            bundle.putString(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46285x5018f760, new java.lang.String(bArr, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        interfaceC25479x1853e9c1.mo15376x8cd414a7(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46353xae58057, bundle);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3876x3753a323
    /* renamed from: onSnapshotComplete */
    public void mo31681x7ddd1b1c(com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d abstractC3875xd023692d, android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXSnapshotListener iTXSnapshotListener = this.f15554x65e9c525;
        if (iTXSnapshotListener == null) {
            return;
        }
        m31947xaee7d2f7("OnSnapshotComplete image:".concat(java.lang.String.valueOf(bitmap)), false);
        if (bitmap == null) {
            iTXSnapshotListener.mo94544xb614f8c3(bitmap);
            return;
        }
        if (!this.f15548x408a4009) {
            iTXSnapshotListener.mo94544xb614f8c3(bitmap);
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(0.5f, 0.5f);
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        aVar.c(java.lang.Boolean.FALSE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(height));
        aVar.c(java.lang.Integer.valueOf(width));
        aVar.c(0);
        aVar.c(0);
        aVar.c(bitmap);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/live2/jsplugin/player/V2TXLivePlayerJSAdapter", "onSnapshotComplete", "(Lcom/tencent/live2/V2TXLivePlayer;Landroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/live2/jsplugin/player/V2TXLivePlayerJSAdapter", "onSnapshotComplete", "(Lcom/tencent/live2/V2TXLivePlayer;Landroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        iTXSnapshotListener.mo94544xb614f8c3(createBitmap);
        if (createBitmap == null || createBitmap.isRecycled()) {
            return;
        }
        createBitmap.recycle();
    }

    /* renamed from: operateLivePlayer */
    public com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m31959xf14ea791(java.lang.String str, org.json.JSONObject jSONObject) {
        java.lang.String optString;
        boolean z17 = false;
        if (android.text.TextUtils.isEmpty(str)) {
            m31946x93dde0fb("Call operate failed, operate name is null", false);
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-1, "Call operate failed, operate name is null");
        }
        boolean z18 = str.equals("start") || str.equals("stop") || str.equals("resume") || str.equals("pause") || str.equals("mute");
        if (!this.f15547x9106827) {
            m31946x93dde0fb("Call operate failed, player is not initialized, operate name:".concat(str), z18);
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-3, "Call operate failed, player is not initialized");
        }
        if (z18) {
            m31947xaee7d2f7("Call operate [name:" + str + "]", true);
        }
        if (str.equalsIgnoreCase(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27)) {
            com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p423xc53e9ae1.C3890xc5128a18 c3890xc5128a18 = this.f15546xfeabaa0f;
            m31954x79bfdd40(c3890xc5128a18.url, c3890xc5128a18.f15567x3339a3);
        } else if (str.equalsIgnoreCase("stop")) {
            this.f15552x14aac1ae.mo30029x66343656();
        } else if (str.equalsIgnoreCase("pause")) {
            this.f15552x14aac1ae.mo30011xfb89cf80();
            this.f15552x14aac1ae.mo30012xfcac4825();
        } else if (str.equalsIgnoreCase("resume")) {
            if (!this.f15546xfeabaa0f.f15563x89c10333) {
                this.f15552x14aac1ae.mo30013xf9a3f7a9();
            }
            this.f15552x14aac1ae.mo30014xfac6704e();
        } else if (str.equalsIgnoreCase("mute")) {
            com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p423xc53e9ae1.C3890xc5128a18 c3890xc5128a182 = this.f15546xfeabaa0f;
            boolean z19 = !c3890xc5128a182.f15563x89c10333;
            c3890xc5128a182.f15563x89c10333 = z19;
            if (z19) {
                this.f15552x14aac1ae.mo30011xfb89cf80();
            } else {
                this.f15552x14aac1ae.mo30013xf9a3f7a9();
            }
        } else {
            if (!str.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159978f)) {
                return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-4, "Call operate failed, invalid operate name:".concat(str));
            }
            if (jSONObject != null && (optString = jSONObject.optString("quality")) != null && optString.equalsIgnoreCase("compressed")) {
                z17 = true;
            }
            m31965x5880d5eb(z17, this.f15554x65e9c525);
        }
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: setAudioVolumeListener */
    public void m31960xd526eba2(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f15545x194e5db7 = iTXAudioVolumeEvaluationListener;
    }

    /* renamed from: setPlayListener */
    public void m31961xbdb2cd8a(com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1) {
        this.f15550xbe0c5915 = interfaceC25479x1853e9c1;
    }

    /* renamed from: setSnapshotListener */
    public void m31962x8ba6f71a(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXSnapshotListener iTXSnapshotListener) {
        this.f15554x65e9c525 = iTXSnapshotListener;
    }

    /* renamed from: setSurface */
    public com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m31963x42c875eb(android.view.Surface surface) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Set surface:");
        sb6.append(surface != null ? java.lang.Integer.valueOf(surface.hashCode()) : "0");
        m31947xaee7d2f7(sb6.toString(), false);
        this.f15552x14aac1ae.mo30018x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15457x14b68192, surface);
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: setSurfaceSize */
    public com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m31964x1c9cdc8c(int i17, int i18) {
        m31947xaee7d2f7("Set surface size [width:" + i17 + "][height:" + i18 + "]", false);
        this.f15552x14aac1ae.mo30018x3b607c57(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15458xebbebcb3, new com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.SurfaceSize(i17, i18));
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: takePhoto */
    public void m31965x5880d5eb(boolean z17, com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXSnapshotListener iTXSnapshotListener) {
        this.f15548x408a4009 = z17;
        this.f15554x65e9c525 = iTXSnapshotListener;
        int mo30025x10fad5c4 = this.f15552x14aac1ae.mo30025x10fad5c4();
        m31947xaee7d2f7("Snapshot, image compress:".concat(java.lang.String.valueOf(z17)), false);
        com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1 = this.f15550xbe0c5915;
        if (interfaceC25479x1853e9c1 == null || mo30025x10fad5c4 == 0) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        m31947xaee7d2f7("OnPlayEvent: event[-3], msg[" + bundle.toString() + "]", false);
        interfaceC25479x1853e9c1.mo15376x8cd414a7(-3, bundle);
    }

    /* renamed from: uninitLivePlayer */
    public com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m31966x18d712f6() {
        if (!this.f15547x9106827) {
            m31946x93dde0fb("Uninit player failed, player is not initialized", false);
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-3, "Uninit player failed, player is not initialized");
        }
        m31947xaee7d2f7("Uninit player success", false);
        this.f15547x9106827 = false;
        this.f15552x14aac1ae.mo30029x66343656();
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: updateLivePlayer */
    public com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m31967xe1cd4496(android.os.Bundle bundle) {
        if (bundle == null) {
            m31946x93dde0fb("Update player params failed, params is null", false);
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-1, "Update player params failed, params is null");
        }
        if (!this.f15547x9106827) {
            m31946x93dde0fb("Update player params failed, player not initialized", false);
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-3, "Update player params failed, player not initialized");
        }
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p423xc53e9ae1.C3890xc5128a18 c3890xc5128a18 = new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p423xc53e9ae1.C3890xc5128a18(this.f15546xfeabaa0f);
        c3890xc5128a18.m31971x1726ba75(bundle);
        m31952x5eaa1fed(this.f15546xfeabaa0f, c3890xc5128a18);
        if (!android.text.TextUtils.isEmpty(c3890xc5128a18.url) && !c3890xc5128a18.url.equals(this.f15546xfeabaa0f.url)) {
            this.f15553x95011769 = m31950xbc6e2f66(c3890xc5128a18.url);
        }
        this.f15546xfeabaa0f = c3890xc5128a18;
        return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602();
    }

    /* renamed from: initLivePlayer */
    public com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m31956x64e5041d(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, android.os.Bundle bundle) {
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf == null) {
            return new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602(-1, "Init player failed, view is null");
        }
        return m31951xeb526439(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, bundle);
    }
}
