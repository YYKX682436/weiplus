package com.p314xaae8f345.p373xbe494963.p396x36756d;

/* renamed from: com.tencent.liteav.trtc.TRTCCloudImpl */
/* loaded from: classes16.dex */
public class C3805xe22f0f08 extends com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 implements com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f128100a;

    /* renamed from: b, reason: collision with root package name */
    private static com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08 f128101b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f128102c;

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c f128103d;

    /* renamed from: e, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd f128104e;

    /* renamed from: f, reason: collision with root package name */
    private com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8.BGMNotify f128105f;

    /* renamed from: g, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a f128106g;

    /* renamed from: h, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p390xb06b1e56.C3788x3451ad13 f128107h;

    /* renamed from: i, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p389xacf8107c.C3786x3af8072d f128108i;

    /* renamed from: j, reason: collision with root package name */
    private int f128109j;

    /* renamed from: k, reason: collision with root package name */
    private java.util.ArrayList<com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08> f128110k = new java.util.ArrayList<>();

    private C3805xe22f0f08(android.content.Context context, boolean z17) {
        b(context);
        this.f128102c = context;
        a(context, 0L, z17);
    }

    private static void b(android.content.Context context) {
        synchronized (com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08.class) {
            if (!f128100a) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29241x91f62b6f(context.getApplicationContext());
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29246xa5f59752("liteav");
                com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.m30500x316510(0);
                f128100a = true;
            }
            if (context instanceof android.app.Activity) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.i.a().a((android.app.Activity) context);
            }
        }
    }

    private java.lang.String c() {
        return this.f128102c.getCacheDir() + java.io.File.separator + "liteav_effect";
    }

    /* renamed from: createInstance */
    public static com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 m30256x5813ddb1(android.content.Context context) {
        return new com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08(context, false);
    }

    /* renamed from: destroyInstance */
    public static void m30257x4a89feaf(com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 abstractC26786xbe57dcc8) {
        if (abstractC26786xbe57dcc8 instanceof com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08) {
            ((com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08) abstractC26786xbe57dcc8).b();
        } else {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w("TRTCCloudImpl", "destroyInstance trtcCloud=".concat(java.lang.String.valueOf(abstractC26786xbe57dcc8)));
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: ConnectOtherRoom */
    public void mo30258xdb2dbe61(java.lang.String str) {
        this.f128104e.m30629xd697a41(str);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: DisconnectOtherRoom */
    public void mo30259x8acfeaaf() {
        this.f128104e.m30636x401c22cf();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: addListener */
    public void mo30260x162a7075(com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c abstractC26788x7049bd9c) {
        this.f128104e.m30627x162a7075(abstractC26788x7049bd9c);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: callExperimentalAPI */
    public java.lang.String mo30261xd33a8dd4(java.lang.String str) {
        return this.f128104e.m30628xd33a8dd4(str);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: checkAudioCapabilitySupport */
    public int mo30262xb3bc2d89(int i17) {
        return (i17 == 2 && this.f128107h.m29705x45cd5376()) ? 1 : 0;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: createSubCloud */
    public com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 mo30263xb97b60f1() {
        com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08 c3805xe22f0f08;
        synchronized (com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08.class) {
            c3805xe22f0f08 = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08(com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035(), this.f128104e.m30660x78204c33());
            this.f128110k.add(c3805xe22f0f08);
        }
        return c3805xe22f0f08;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: destroySubCloud */
    public void mo30264xabf181ef(com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 abstractC26786xbe57dcc8) {
        synchronized (com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08.class) {
            if (abstractC26786xbe57dcc8 instanceof com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("TRTCCloudImpl", "destructor destroySubCloud");
                ((com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08) abstractC26786xbe57dcc8).b();
                this.f128110k.remove(abstractC26786xbe57dcc8);
            }
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: enable3DSpatialAudioEffect */
    public void mo30265xc74bb7b7(boolean z17) {
        this.f128104e.m30637xc74bb7b7(z17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: enableAudioEarMonitoring */
    public void mo30266xa24faeb(boolean z17) {
        this.f128106g.mo29046x52f4e3f3(z17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: enableAudioVolumeEvaluation */
    public void mo30269xe3d7029(boolean z17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioVolumeEvaluateParams tRTCAudioVolumeEvaluateParams) {
        this.f128104e.m30638xe3d7029(z17, tRTCAudioVolumeEvaluateParams);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: enableCustomAudioCapture */
    public void mo30270x9a8acb84(boolean z17) {
        this.f128104e.m30639x9a8acb84(z17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: enableCustomAudioRendering */
    public void mo30271xec91d34a(boolean z17) {
        this.f128104e.m30640xec91d34a(z17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: enableCustomVideoCapture */
    public void mo30272xf0533f3f(int i17, boolean z17) {
        this.f128104e.m30641xf0533f3f(i17, z17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: enableEncSmallVideoStream */
    public int mo30274x4ff04ecb(boolean z17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoEncParam tRTCVideoEncParam) {
        return this.f128104e.m30642x4ff04ecb(z17, tRTCVideoEncParam);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: enableMixExternalAudioFrame */
    public void mo30275x9c741f1b(boolean z17, boolean z18) {
        this.f128104e.m30643x9c741f1b(z17, z18);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: enablePayloadPrivateEncryption */
    public int mo30276x6274e61b(boolean z17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPayloadPrivateEncryptionConfig tRTCPayloadPrivateEncryptionConfig) {
        return this.f128104e.m30644x6274e61b(z17, tRTCPayloadPrivateEncryptionConfig);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: enableTorch */
    public boolean mo30277xaa38b839(boolean z17) {
        return this.f128107h.mo29656xc8a25254(z17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: enterRoom */
    public void mo30278xccdacfd3(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams tRTCParams, int i17) {
        this.f128104e.m30645xccdacfd3(tRTCParams, i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: exitRoom */
    public void mo30279x8178ef19() {
        this.f128104e.m30646x8178ef19();
        try {
            java.io.File file = new java.io.File(c());
            if (file.exists() && file.isDirectory() && com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.e.a(file, 5) > 52428800) {
                for (java.io.File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w("TRTCCloudImpl", "clearCache error " + e17.toString());
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: generateCustomPTS */
    public long mo30280xfc7087c9() {
        return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3781x8808ec8f.a();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: getAudioCaptureVolume */
    public int mo30281xfccaefc0() {
        return this.f128104e.m30647xfccaefc0();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: getAudioEffectManager */
    public com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a mo30282x5f1b9a9c() {
        return this.f128106g;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: getAudioPlayoutVolume */
    public int mo30283x51a38114() {
        return this.f128104e.m30648x51a38114();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: getBGMDuration */
    public int mo30284xbf752946(java.lang.String str) {
        return (int) this.f128106g.mo29048x97cff34e(str);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: getBeautyManager */
    public com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d mo30285x2490fdb() {
        return this.f128108i;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: getCustomAudioRenderingFrame */
    public void mo30286xe43b9dd0(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame == null) {
            return;
        }
        this.f128104e.m30649xe43b9dd0(tRTCAudioFrame);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: getDeviceManager */
    public com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853 mo30287xac7d98c1() {
        return this.f128107h;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: isCameraAutoFocusFaceModeSupported */
    public boolean mo30288x8a09f1d4() {
        return this.f128107h.m29701x8a09f1d4();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: isCameraFocusPositionInPreviewSupported */
    public boolean mo30289x56cf6e1d() {
        return this.f128107h.m29702x56cf6e1d();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: isCameraTorchSupported */
    public boolean mo30290xa3f08ee1() {
        return this.f128107h.m29703xa3f08ee1();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: isCameraZoomSupported */
    public boolean mo30291xafb6a56c() {
        return this.f128107h.m29704xafb6a56c();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: mixExternalAudioFrame */
    public int mo30292xd8a054de(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame == null) {
            return -1;
        }
        return this.f128104e.m30661xd8a054de(tRTCAudioFrame);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: muteAllRemoteAudio */
    public void mo30293x57697d48(boolean z17) {
        this.f128104e.m30662x57697d48(z17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: muteAllRemoteVideoStreams */
    public void mo30294xa38a2e46(boolean z17) {
        this.f128104e.m30663xa38a2e46(z17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: muteLocalAudio */
    public void mo30295x2aeada24(boolean z17) {
        this.f128104e.m30664x2aeada24(z17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: muteLocalVideo */
    public void mo30296x2c0d52c9(int i17, boolean z17) {
        this.f128104e.m30665x2c0d52c9(i17, z17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: muteRemoteAudio */
    public void mo30298x7fb62b57(java.lang.String str, boolean z17) {
        this.f128104e.m30666x7fb62b57(str, z17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: muteRemoteVideoStream */
    public void mo30299xbd6ef29c(java.lang.String str, int i17, boolean z17) {
        this.f128104e.m30667xbd6ef29c(str, i17, z17);
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
    /* renamed from: onComplete */
    public void mo10551x815f5438(int i17, int i18) {
        com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8.BGMNotify bGMNotify = this.f128105f;
        if (bGMNotify != null) {
            bGMNotify.m105557x552e4ec2(i18);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
    /* renamed from: onPlayProgress */
    public void mo10552xfd1c900(int i17, long j17, long j18) {
        com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8.BGMNotify bGMNotify = this.f128105f;
        if (bGMNotify != null) {
            bGMNotify.m105558x3d3ddfb6(j17, j18);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
    /* renamed from: onStart */
    public void mo10553xb05099c3(int i17, int i18) {
        com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8.BGMNotify bGMNotify = this.f128105f;
        if (bGMNotify != null) {
            bGMNotify.m105559x9d54bb79(i18);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: pauseAudioEffect */
    public void mo30301x895bd531(int i17) {
        this.f128106g.m29110x895bd531(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: pauseBGM */
    public void mo30302x4bea8ef2() {
        this.f128106g.mo29050xff20a1fb(Integer.MAX_VALUE);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: pauseScreenCapture */
    public void mo30303xc4d476e4() {
        this.f128104e.m30733xc4d476e4(this.f128109j);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: playAudioEffect */
    public void mo30304x1445d33(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioEffectParam tRTCAudioEffectParam) {
        if (tRTCAudioEffectParam == null) {
            return;
        }
        final int i17 = tRTCAudioEffectParam.f57035xc35ea28c;
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam = new com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam(i17, b(tRTCAudioEffectParam.f57037x346425));
        audioMusicParam.f14522xf1f89d0f = tRTCAudioEffectParam.f57038xf1f89d0f;
        audioMusicParam.f14520x4a5820cb = tRTCAudioEffectParam.f57036x4a5820cb;
        audioMusicParam.f14519xcd55920e = true;
        this.f128106g.m29111x1445d33(audioMusicParam);
        this.f128106g.m29115x6a508489(i17, new com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver() { // from class: com.tencent.liteav.trtc.TRTCCloudImpl.1
            @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
            /* renamed from: onComplete */
            public final void mo10551x815f5438(int i18, int i19) {
                com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c abstractC26788x7049bd9c = com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08.this.f128103d;
                if (abstractC26788x7049bd9c != null) {
                    abstractC26788x7049bd9c.mo105565x45380e3a(i17, i19);
                }
            }

            @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
            /* renamed from: onPlayProgress */
            public final void mo10552xfd1c900(int i18, long j17, long j18) {
            }

            @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver
            /* renamed from: onStart */
            public final void mo10553xb05099c3(int i18, int i19) {
                com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c abstractC26788x7049bd9c = com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08.this.f128103d;
                if (abstractC26788x7049bd9c == null || i19 >= 0) {
                    return;
                }
                abstractC26788x7049bd9c.mo105565x45380e3a(i17, i19);
            }
        });
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: playBGM */
    public void mo30305xe29438f4(java.lang.String str, com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8.BGMNotify bGMNotify) {
        this.f128105f = bGMNotify;
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam = new com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam(Integer.MAX_VALUE, str);
        audioMusicParam.f14522xf1f89d0f = true;
        audioMusicParam.f14520x4a5820cb = 0;
        this.f128106g.mo29055xe624d2d9(Integer.MAX_VALUE, this);
        this.f128106g.mo29068x79fb7d0f(audioMusicParam);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: removeListener */
    public void mo30306xf1335d58(com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c abstractC26788x7049bd9c) {
        this.f128104e.m30734xf1335d58(abstractC26788x7049bd9c);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: resumeAudioEffect */
    public void mo30307x7e177a9a(int i17) {
        this.f128106g.m29112x7e177a9a(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: resumeBGM */
    public void mo30308x9392ad5b() {
        this.f128106g.mo29052x96288da4(Integer.MAX_VALUE);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: resumeScreenCapture */
    public void mo30309x793c660d() {
        this.f128104e.m30735x793c660d(this.f128109j);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: selectMotionTmpl */
    public void mo30310xe887d127(java.lang.String str) {
        this.f128108i.mo29611xf16cd10d(str);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: sendCustomAudioData */
    public void mo30311x2c45ef87(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame == null) {
            return;
        }
        this.f128104e.m30736x2c45ef87(tRTCAudioFrame);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: sendCustomCmdMsg */
    public boolean mo30312x5c3e260(int i17, byte[] bArr, boolean z17, boolean z18) {
        if (bArr != null) {
            return this.f128104e.m30737x5c3e260(i17, bArr, z17, z18);
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w("TRTCCloudImpl", "custom msg data is null.");
        return false;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: sendCustomVideoData */
    public void mo30313x70818dac(int i17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame) {
        if (tRTCVideoFrame == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w("TRTCCloudImpl", "sendCustomVideoData frame is null");
            return;
        }
        if (tRTCVideoFrame.f57169x719f779a == 3) {
            android.opengl.GLES20.glFinish();
        }
        this.f128104e.m30738x70818dac(i17, tRTCVideoFrame);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: sendSEIMsg */
    public boolean mo30315x1a3ef952(byte[] bArr, int i17) {
        if (bArr != null && i17 != 0) {
            return this.f128104e.m30739x1a3ef952(bArr, i17);
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w("TRTCCloudImpl", "sei msg data is null or repeatCount is zero.");
        return false;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: set3DSpatialReceivingRange */
    public void mo30316x516ce3ce(java.lang.String str, int i17) {
        this.f128104e.m30740x516ce3ce(str, i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setAllAudioEffectsVolume */
    public void mo30317x9ed8f6c5(int i17) {
        this.f128106g.m29113x9ed8f6c5(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setAudioCaptureVolume */
    public void mo30318x93f671cc(int i17) {
        this.f128104e.m30741x93f671cc(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setAudioEffectVolume */
    public void mo30319xf709cebf(int i17, int i18) {
        this.f128106g.m29114xf709cebf(i17, i18);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setAudioFrameListener */
    public void mo30320xd087f90d(com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener tRTCAudioFrameListener) {
        this.f128104e.m30742xd087f90d(tRTCAudioFrameListener);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setAudioPlayoutVolume */
    public void mo30321xe8cf0320(int i17) {
        this.f128104e.m30743xe8cf0320(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setAudioQuality */
    public void mo30322x5f7e6dcb(int i17) {
        this.f128104e.m30744x5f7e6dcb(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setAudioRoute */
    public void mo30323x78052215(int i17) {
        this.f128107h.mo29660x78052215(com.p314xaae8f345.p373xbe494963.p390xb06b1e56.C3788x3451ad13.m29677xe6ca4052(i17));
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setBGMPlayoutVolume */
    public void mo30324x7f7657ee(int i17) {
        this.f128106g.mo29057xc0cc2931(Integer.MAX_VALUE, i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setBGMPosition */
    public int mo30325xf928e84f(int i17) {
        this.f128106g.mo29053x9b52caf7(Integer.MAX_VALUE, i17);
        return 0;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setBGMPublishVolume */
    public void mo30326x2db761a3(int i17) {
        this.f128106g.mo29058x6f0d32e6(Integer.MAX_VALUE, i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setBGMVolume */
    public void mo30327x6fb6c7c0(int i17) {
        this.f128106g.mo29057xc0cc2931(Integer.MAX_VALUE, i17);
        this.f128106g.mo29058x6f0d32e6(Integer.MAX_VALUE, i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setBeautyStyle */
    public void mo30328x442ec4d3(int i17, int i18, int i19, int i27) {
        this.f128108i.mo29594x442ec4d3(i17);
        this.f128108i.mo29593x43c542a6(i18);
        this.f128108i.mo29620xd7a00666(i19);
        this.f128108i.mo29617xb91ddc50(i27);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setCapturedAudioFrameCallbackFormat */
    public int mo30329xc2833433(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
        if (tRTCAudioFrameCallbackFormat == null) {
            return -1;
        }
        return this.f128104e.m30745xc2833433(tRTCAudioFrameCallbackFormat.f57047x88751aa, tRTCAudioFrameCallbackFormat.f57045x2c0b7d03, tRTCAudioFrameCallbackFormat.f57048xb3cdb4d2, tRTCAudioFrameCallbackFormat.f57046x3339a3);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setChinLevel */
    public void mo30330x58346718(int i17) {
        this.f128108i.mo29595x58346718(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setDebugViewMargin */
    public void mo30331x856aea4(java.lang.String str, com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8.TRTCViewMargin tRTCViewMargin) {
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setDefaultStreamRecvMode */
    public void mo30332x553779a8(boolean z17, boolean z18) {
        this.f128104e.m30746x553779a8(z17, z18);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setEyeScaleLevel */
    public void mo30333xb38b2029(int i17) {
        this.f128108i.mo29599xb38b2029(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setFaceShortLevel */
    public void mo30334x9f95eba7(int i17) {
        this.f128108i.mo29602x9f95eba7(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setFaceSlimLevel */
    public void mo30335x8e214528(int i17) {
        this.f128108i.mo29603x8e214528(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setFaceVLevel */
    public void mo30336x419f536d(int i17) {
        this.f128108i.mo29604x419f536d(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setFilter */
    public void mo30337xc55227a(android.graphics.Bitmap bitmap) {
        this.f128108i.mo29605xc55227a(bitmap);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setFilterConcentration */
    public void mo30338x956ac813(float f17) {
        this.f128108i.mo29606x154fbcdb(f17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setFocusPosition */
    public void mo30339xb39e1cdf(int i17, int i18) {
        this.f128107h.mo29662x2d45073a(i17, i18);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setGSensorMode */
    public void mo30340x35121682(int i17) {
        this.f128104e.m30747x35121682(0, i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setGravitySensorAdaptiveMode */
    public void mo30341x1449a6bf(int i17) {
        this.f128104e.m30748x1449a6bf(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setGreenScreenFile */
    public boolean mo30342x523b82a9(java.lang.String str) {
        return false;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setListener */
    public void mo30343xc6cf6336(com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c abstractC26788x7049bd9c) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.d("TRTCCloudImpl", "setListener ".concat(java.lang.String.valueOf(abstractC26788x7049bd9c)), new java.lang.Object[0]);
        this.f128103d = abstractC26788x7049bd9c;
        this.f128104e.m30749xc6cf6336(abstractC26788x7049bd9c);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setListenerHandler */
    public void mo30344x4caea334(android.os.Handler handler) {
        this.f128104e.m30750x4caea334(handler);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setLocalProcessedAudioFrameCallbackFormat */
    public int mo30345x87919df8(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
        if (tRTCAudioFrameCallbackFormat == null) {
            return -1;
        }
        return this.f128104e.m30751x87919df8(tRTCAudioFrameCallbackFormat.f57047x88751aa, tRTCAudioFrameCallbackFormat.f57045x2c0b7d03, tRTCAudioFrameCallbackFormat.f57048xb3cdb4d2, tRTCAudioFrameCallbackFormat.f57046x3339a3);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setLocalRenderParams */
    public void mo30346x28b61d85(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCRenderParams tRTCRenderParams) {
        if (tRTCRenderParams == null) {
            return;
        }
        mo30349xc5845254(tRTCRenderParams.f57098xd48829c6);
        mo30351xee95380c(tRTCRenderParams.f57100xfd990f7e);
        mo30350xe7665fcd(tRTCRenderParams.f57099x67fb7799);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setLocalVideoProcessListener */
    public int mo30347x2c264c11(int i17, int i18, com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoFrameListener tRTCVideoFrameListener) {
        return this.f128104e.m30752x2c264c11(0, i17, i18, tRTCVideoFrameListener);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setLocalVideoRenderListener */
    public int mo30348xb403dedc(int i17, int i18, com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener tRTCVideoRenderListener) {
        return this.f128104e.m30753xb403dedc(i17, i18, tRTCVideoRenderListener);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setLocalViewFillMode */
    public void mo30349xc5845254(int i17) {
        this.f128104e.m30754xc5845254(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setLocalViewMirror */
    public void mo30350xe7665fcd(int i17) {
        this.f128104e.m30755xe7665fcd(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setLocalViewRotation */
    public void mo30351xee95380c(int i17) {
        this.f128104e.m30756xee95380c(b(i17));
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setMicVolumeOnMixing */
    public void mo30352x37a969e4(int i17) {
        this.f128106g.mo29063x49fdc1f0(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setMixExternalAudioVolume */
    public void mo30353xf2a4bccb(int i17, int i18) {
        this.f128104e.m30757xf2a4bccb(i17, i18);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setMixTranscodingConfig */
    public void mo30354x99ee7a7a(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTranscodingConfig tRTCTranscodingConfig) {
        this.f128104e.m30758x99ee7a7a(tRTCTranscodingConfig);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setMixedPlayAudioFrameCallbackFormat */
    public int mo30355xea2c4460(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
        if (tRTCAudioFrameCallbackFormat == null) {
            return -1;
        }
        return this.f128104e.m30759xea2c4460(tRTCAudioFrameCallbackFormat.f57047x88751aa, tRTCAudioFrameCallbackFormat.f57045x2c0b7d03, tRTCAudioFrameCallbackFormat.f57048xb3cdb4d2, tRTCAudioFrameCallbackFormat.f57046x3339a3);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setMotionMute */
    public void mo30356xf169c0f1(boolean z17) {
        this.f128108i.mo29610xf169c0f1(z17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setNetworkQosParam */
    public void mo30357x62511304(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCNetworkQosParam tRTCNetworkQosParam) {
        this.f128104e.m30760x62511304(tRTCNetworkQosParam);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setNoseSlimLevel */
    public void mo30358xbc3bb072(int i17) {
        this.f128108i.mo29614xbc3bb072(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setPerspectiveCorrectionPoints */
    public void mo30359xd2daee7b(java.lang.String str, android.graphics.PointF[] pointFArr, android.graphics.PointF[] pointFArr2) {
        this.f128104e.m30761xd2daee7b(str, pointFArr, pointFArr2);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setPriorRemoteVideoStreamType */
    public int mo30360xf616b1e7(int i17) {
        return this.f128104e.m30762xf616b1e7(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setRemoteAudioParallelParams */
    public void mo30361xb88f8f7b(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioParallelParams tRTCAudioParallelParams) {
        this.f128104e.m30763xb88f8f7b(tRTCAudioParallelParams);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setRemoteAudioVolume */
    public void mo30362xe9a43228(java.lang.String str, int i17) {
        this.f128104e.m30764xe9a43228(str, i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setRemoteRenderParams */
    public void mo30363xa9cb1624(java.lang.String str, int i17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCRenderParams tRTCRenderParams) {
        if (tRTCRenderParams == null) {
            return;
        }
        this.f128104e.m30767x46994af3(str, i17, tRTCRenderParams.f57098xd48829c6);
        this.f128104e.m30769x6faa30ab(str, i17, b(tRTCRenderParams.f57100xfd990f7e));
        this.f128104e.m30768x4ef42c(str, i17, tRTCRenderParams.f57099x67fb7799);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setRemoteSubStreamViewFillMode */
    public void mo30364xda08ff23(java.lang.String str, int i17) {
        this.f128104e.m30767x46994af3(str, 2, i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setRemoteSubStreamViewRotation */
    public void mo30365x319e4db(java.lang.String str, int i17) {
        this.f128104e.m30769x6faa30ab(str, 2, b(i17));
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setRemoteVideoRenderListener */
    public int mo30366x3cc2c55d(java.lang.String str, int i17, int i18, com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener tRTCVideoRenderListener) {
        return this.f128104e.m30765x3cc2c55d(str, i17, i18, tRTCVideoRenderListener);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setRemoteVideoStreamType */
    public int mo30367xf9be554d(java.lang.String str, int i17) {
        return this.f128104e.m30766xf9be554d(str, i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setRemoteViewFillMode */
    public void mo30368x46994af3(java.lang.String str, int i17) {
        this.f128104e.m30767x46994af3(str, 0, i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setRemoteViewRotation */
    public void mo30369x6faa30ab(java.lang.String str, int i17) {
        this.f128104e.m30769x6faa30ab(str, 0, b(i17));
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setReverbType */
    public void mo30370xecceba2e(int i17) {
        this.f128106g.mo29067x486c863c(com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a.m29108x8010b307(i17));
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setSubStreamEncoderParam */
    public void mo30371x7764c78f(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoEncParam tRTCVideoEncParam) {
        this.f128104e.m30771xf63f8509(2, tRTCVideoEncParam);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setSystemVolumeType */
    public void mo30372x2bcf6985(int i17) {
        this.f128107h.mo29665x2bcf6985(com.p314xaae8f345.p373xbe494963.p390xb06b1e56.C3788x3451ad13.m29699x7176982(i17));
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setVideoEncoderMirror */
    public void mo30373xf191f742(boolean z17) {
        this.f128104e.m30770xf191f742(z17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setVideoEncoderParam */
    public void mo30374x8c1290aa(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoEncParam tRTCVideoEncParam) {
        if (tRTCVideoEncParam == null) {
            return;
        }
        this.f128104e.m30771xf63f8509(0, tRTCVideoEncParam);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setVideoEncoderRotation */
    public void mo30375x1c38c641(int i17) {
        this.f128104e.m30772x1c38c641(b(i17));
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setVideoMuteImage */
    public void mo30376xd60e989(android.graphics.Bitmap bitmap, int i17) {
        this.f128104e.m30773xd60e989(bitmap, i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setVoiceChangerType */
    public boolean mo30377x26b7a50c(int i17) {
        this.f128106g.mo29064x26b7a50c(com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a.m29107x877e0ffb(i17));
        return true;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: setWatermark */
    public void mo30378x4f089a22(android.graphics.Bitmap bitmap, int i17, float f17, float f18, float f19) {
        this.f128104e.m30774x4f089a22(bitmap, i17, f17, f18, f19);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: setZoom */
    public void mo30379x76535355(int i17) {
        this.f128107h.mo29663xbdde2991(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: showDebugView */
    public void mo30380xcdf6351b(int i17) {
        this.f128104e.m30775xe84ff396(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: snapshotVideo */
    public void mo30381x46e54917(java.lang.String str, int i17, int i18, com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCSnapshotListener tRTCSnapshotListener) {
        this.f128104e.m30776x46e54917(str, i17, i18, tRTCSnapshotListener);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: startAudioRecording */
    public int mo30383x3d492fbd(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
        return this.f128104e.m30777x3d492fbd(tRTCAudioRecordingParams);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: startLocalAudio */
    public void mo30385xbd52c52d(int i17) {
        this.f128104e.m30779xbd52c52d(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: startLocalPreview */
    public void mo30386xc829135f(boolean z17, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        this.f128104e.m30780xc829135f(z17, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: startLocalRecording */
    public void mo30387xcf0b23c8(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
        this.f128104e.m30781xcf0b23c8(tRTCLocalRecordingParams);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: startPublishCDNStream */
    public void mo30388xa71cea40(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPublishCDNParam tRTCPublishCDNParam) {
        this.f128104e.m30782xa71cea40(tRTCPublishCDNParam);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: startPublishMediaStream */
    public void mo30389x2c0bb7f7(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPublishTarget tRTCPublishTarget, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamEncoderParam tRTCStreamEncoderParam, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.f128104e.m30783x2c0bb7f7(tRTCPublishTarget, tRTCStreamEncoderParam, tRTCStreamMixingConfig);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: startPublishing */
    public void mo30390xe3b2ba75(java.lang.String str, int i17) {
        this.f128104e.m30784xe3b2ba75(str, i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: startRemoteSubStreamView */
    public void mo30391xcdbff63d(java.lang.String str, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        mo30392xaf56220d(str, 2, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: startRemoteView */
    public void mo30392xaf56220d(java.lang.String str, int i17, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        this.f128104e.m30785xaf56220d(str, i17, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: startScreenCapture */
    public void mo30394x51e3a7f8(int i17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoEncParam tRTCVideoEncParam, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCScreenShareParams tRTCScreenShareParams) {
        this.f128109j = i17;
        this.f128104e.m30787x51e3a7f8(i17, tRTCVideoEncParam, tRTCScreenShareParams);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: startSpeedTest */
    public int mo30396x88fa6737(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCSpeedTestParams tRTCSpeedTestParams) {
        this.f128104e.m30789x88fa6737(tRTCSpeedTestParams);
        return 0;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: startSystemAudioLoopback */
    public void mo30398x48e939d0() {
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() < 29) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("TRTCCloudImpl", "current system don't support system audio loopback");
        } else {
            this.f128104e.m30790x48e939d0();
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: stopAllAudioEffects */
    public void mo30399x1698682b() {
        this.f128106g.m29116x1698682b();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: stopAllRemoteView */
    public void mo30400x8d284faa() {
        this.f128104e.m30791x8d284faa();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: stopAudioEffect */
    public void mo30401xe3b073a5(int i17) {
        this.f128106g.m29117xe3b073a5(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: stopAudioRecording */
    public void mo30402x5a59b5d() {
        this.f128104e.m30792x5a59b5d();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: stopBGM */
    public void mo30403x8faee166() {
        this.f128106g.mo29069x17324d6f(Integer.MAX_VALUE);
        this.f128106g.mo29055xe624d2d9(Integer.MAX_VALUE, null);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: stopLocalAudio */
    public void mo30404xc6f600cd() {
        this.f128104e.m30793xc6f600cd();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: stopLocalPreview */
    public void mo30405xf5ebe6ff() {
        this.f128104e.m30794xf5ebe6ff();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: stopLocalRecording */
    public void mo30406x97678f68() {
        this.f128104e.m30795x97678f68();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: stopPublishCDNStream */
    public void mo30407xca0cede0() {
        this.f128104e.m30796xca0cede0();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: stopPublishMediaStream */
    public void mo30408x53095397(java.lang.String str) {
        this.f128104e.m30797x53095397(str);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: stopPublishing */
    public void mo30409xed55f615() {
        this.f128104e.m30798xed55f615();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: stopRemoteSubStreamView */
    public void mo30410x8675ce9d(java.lang.String str) {
        mo30412xb8f95dad(str, 2);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: stopRemoteView */
    public void mo30412xb8f95dad(java.lang.String str, int i17) {
        this.f128104e.m30800xb8f95dad(str, i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: stopScreenCapture */
    public void mo30413xdc7b4858() {
        this.f128104e.m30801xdc7b4858(this.f128109j);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: stopSpeedTest */
    public void mo30414x26313797() {
        this.f128104e.m30802x26313797();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: stopSystemAudioLoopback */
    public void mo30415x19f1230() {
        this.f128104e.m30803x19f1230();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: switchCamera */
    public void mo30416x2db92f79() {
        this.f128107h.mo29666x2db92f79(!this.f128107h.mo29659x24672724());
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: switchRole */
    public void mo30417xeb4bf1ca(int i17) {
        this.f128104e.m30804xeb4bf1ca(i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: switchRoom */
    public void mo30419xeb4bf22f(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
        this.f128104e.m30806xeb4bf22f(tRTCSwitchRoomConfig);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: updateLocalView */
    public void mo30420x599e7(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        this.f128104e.m30807x599e7(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: updateOtherRoomForwardMode */
    public void mo30421x24065b66(java.lang.String str) {
        this.f128104e.m30808x24065b66(str);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: updatePublishMediaStream */
    public void mo30422xd419809e(java.lang.String str, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPublishTarget tRTCPublishTarget, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamEncoderParam tRTCStreamEncoderParam, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.f128104e.m30809xd419809e(str, tRTCPublishTarget, tRTCStreamEncoderParam, tRTCStreamMixingConfig);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: updateRemote3DSpatialPosition */
    public void mo30423x3301e10d(java.lang.String str, int[] iArr) {
        this.f128104e.m30810x3301e10d(str, iArr);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: updateRemoteView */
    public void mo30424xf18e81b4(java.lang.String str, int i17, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        this.f128104e.m30811xf18e81b4(str, i17, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: updateSelf3DSpatialPosition */
    public void mo30425x8b180887(int[] iArr, float[] fArr, float[] fArr2, float[] fArr3) {
        this.f128104e.m30812x8b180887(iArr, fArr, fArr2, fArr3);
    }

    public static com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 a(android.content.Context context) {
        com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08 c3805xe22f0f08;
        synchronized (com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08.class) {
            if (f128101b == null) {
                f128101b = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08(context, true);
            }
            c3805xe22f0f08 = f128101b;
        }
        return c3805xe22f0f08;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: enableAudioVolumeEvaluation */
    public void mo30268xe3d7029(int i17, boolean z17) {
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioVolumeEvaluateParams tRTCAudioVolumeEvaluateParams = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioVolumeEvaluateParams();
        tRTCAudioVolumeEvaluateParams.f57057x21ffe4c5 = i17;
        tRTCAudioVolumeEvaluateParams.f57056xed715c8f = z17;
        tRTCAudioVolumeEvaluateParams.f57054xf6353f0c = false;
        tRTCAudioVolumeEvaluateParams.f57055x3bfe47b5 = false;
        mo30269xe3d7029(true, tRTCAudioVolumeEvaluateParams);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: enableCustomVideoCapture */
    public void mo30273xf0533f3f(boolean z17) {
        mo30272xf0533f3f(0, z17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: muteLocalVideo */
    public void mo30297x2c0d52c9(boolean z17) {
        this.f128104e.m30665x2c0d52c9(0, z17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: muteRemoteVideoStream */
    public void mo30300xbd6ef29c(java.lang.String str, boolean z17) {
        mo30299xbd6ef29c(str, 0, z17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: snapshotVideo */
    public void mo30382x46e54917(java.lang.String str, int i17, com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCSnapshotListener tRTCSnapshotListener) {
        this.f128104e.m30776x46e54917(str, i17, 1, tRTCSnapshotListener);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: startLocalAudio */
    public void mo30384xbd52c52d() {
        this.f128104e.m30778xbd52c52d();
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: startRemoteView */
    public void mo30393xaf56220d(java.lang.String str, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        this.f128104e.m30786xaf56220d(str, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: startSpeedTest */
    public void mo30397x88fa6737(int i17, java.lang.String str, java.lang.String str2) {
        this.f128104e.m30788x88fa6737(i17, str, str2);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: stopRemoteView */
    public void mo30411xb8f95dad(java.lang.String str) {
        this.f128104e.m30799xb8f95dad(str);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8
    /* renamed from: switchRole */
    public void mo30418xeb4bf1ca(int i17, java.lang.String str) {
        this.f128104e.m30805xeb4bf1ca(i17, str);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: startScreenCapture */
    public void mo30395x51e3a7f8(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoEncParam tRTCVideoEncParam, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCScreenShareParams tRTCScreenShareParams) {
        this.f128109j = 0;
        mo30394x51e3a7f8(0, tRTCVideoEncParam, tRTCScreenShareParams);
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: sendCustomVideoData */
    public void mo30314x70818dac(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame) {
        mo30313x70818dac(0, tRTCVideoFrame);
    }

    private C3805xe22f0f08(android.content.Context context, long j17) {
        b(context);
        this.f128102c = context;
        a(context, j17, false);
    }

    public static void a() {
        synchronized (com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08.class) {
            if (f128101b != null) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("TRTCCloudImpl", "destructor destroySharedInstance");
                java.util.Iterator<com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08> it = f128101b.f128110k.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
                f128101b.b();
                f128101b = null;
            }
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855
    /* renamed from: enableAudioVolumeEvaluation */
    public void mo30267xe3d7029(int i17) {
        mo30268xe3d7029(i17, false);
    }

    private void b() {
        com.p314xaae8f345.p373xbe494963.p389xacf8107c.C3786x3af8072d c3786x3af8072d = this.f128108i;
        if (c3786x3af8072d != null) {
            c3786x3af8072d.m29653x5a5b64d();
        }
        this.f128104e.m30635x5cd39ffa();
    }

    public static void b(boolean z17) {
        com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.m30622xa9828d9d(z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf A[Catch: Exception -> 0x010e, TRY_LEAVE, TryCatch #1 {Exception -> 0x010e, blocks: (B:11:0x003f, B:13:0x004e, B:14:0x005e, B:17:0x006a, B:18:0x00a4, B:20:0x00aa, B:22:0x00b5, B:26:0x00bf, B:35:0x00d2, B:36:0x00d5, B:37:0x00d8, B:42:0x00f8, B:44:0x00fd, B:50:0x0102, B:55:0x0107, B:52:0x010d, B:67:0x008a, B:68:0x0052, B:70:0x0058, B:75:0x0028, B:10:0x0018), top: B:9:0x0018, inners: #5 }] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v24, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08.b(java.lang.String):java.lang.String");
    }

    private void a(android.content.Context context, long j17, boolean z17) {
        this.f128102c = context.getApplicationContext();
        if (j17 == 0) {
            this.f128104e = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd(z17);
        } else {
            this.f128104e = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd(j17, z17);
        }
        this.f128107h = new com.p314xaae8f345.p373xbe494963.p390xb06b1e56.C3788x3451ad13(this.f128104e.m30633x4fcde4db());
        this.f128106g = new com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a(this.f128104e.m30630x2a78cec2());
        this.f128108i = new com.p314xaae8f345.p373xbe494963.p389xacf8107c.C3786x3af8072d(this.f128104e.m30631xa5995bf5());
    }

    public static void a(int i17) {
        com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.m30624xed871122(i17);
    }

    public static void a(boolean z17) {
        com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.m30621x230a12ec(z17);
    }

    public static void a(java.lang.String str) {
        com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.m30623x766d470(str);
    }

    private static int b(int i17) {
        if (i17 < 0) {
            return 0;
        }
        return i17 > 3 ? (i17 / 90) % 4 : i17;
    }
}
