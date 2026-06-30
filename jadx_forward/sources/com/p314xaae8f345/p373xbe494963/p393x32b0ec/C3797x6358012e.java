package com.p314xaae8f345.p373xbe494963.p393x32b0ec;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.live.TXLivePusherJni */
/* loaded from: classes16.dex */
public class C3797x6358012e implements com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7, com.p314xaae8f345.p2926x359365.C25487x5a912af7.AudioCustomProcessListener, com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXAudioVolumeEvaluationListener, com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXSnapshotListener, com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify, com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener, com.p314xaae8f345.p2926x359365.b, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.b {

    /* renamed from: mAudioCustomProcessListener */
    private com.p314xaae8f345.p2926x359365.C25487x5a912af7.AudioCustomProcessListener f14820x980078a9;

    /* renamed from: mAudioEffectManager */
    private com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a f14821x4b0e93f3;

    /* renamed from: mBeautyManager */
    private com.p314xaae8f345.p373xbe494963.p389xacf8107c.C3786x3af8072d f14822x9ff75c24;

    /* renamed from: mConfig */
    private com.p314xaae8f345.p2926x359365.C25486xcd8958ac f14823xfeabaa0f;

    /* renamed from: mITXAudioVolumeEvaluationListener */
    private com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXAudioVolumeEvaluationListener f14824x487f89a0;

    /* renamed from: mITXLivePushListener */
    private com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7 f14825x48e50e1a;

    /* renamed from: mITXSnapshotListener */
    private com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXSnapshotListener f14826x8d56e7b8;

    /* renamed from: mITXVideoRecordListener */
    private com.p314xaae8f345.ugc.C26824x75ddfa40.ITXVideoRecordListener f14827xe64f2060;

    /* renamed from: mNativeTXLivePusherJni */
    private long f14828x431865ca;

    /* renamed from: mOnBGMNotify */
    private com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify f14829xae899465;

    /* renamed from: mVideoCustomProcessListener */
    private com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener f14830x63ca4924;

    /* renamed from: mVideoQuality */
    private int f14831xb5a06d11 = -1;

    public C3797x6358012e(android.content.Context context) {
        this.f14828x431865ca = 0L;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29241x91f62b6f(context.getApplicationContext());
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29246xa5f59752("liteav");
        this.f14823xfeabaa0f = new com.p314xaae8f345.p2926x359365.C25486xcd8958ac();
        long m29814x73c02ff3 = m29814x73c02ff3(new java.lang.ref.WeakReference(this));
        this.f14828x431865ca = m29814x73c02ff3;
        this.f14821x4b0e93f3 = new com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a(m29815x3df02df9(m29814x73c02ff3));
        this.f14822x9ff75c24 = new com.p314xaae8f345.p373xbe494963.p389xacf8107c.C3786x3af8072d(m29816x3653165e(this.f14828x431865ca));
        if (context instanceof android.app.Activity) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.i.a().a((android.app.Activity) context);
        }
    }

    /* renamed from: getMapKeys */
    public static java.lang.String[] m29810x6fa8753a(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        java.lang.String[] strArr = new java.lang.String[hashMap.size()];
        java.util.Iterator<java.lang.String> it = hashMap.keySet().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            strArr[i17] = it.next();
            i17++;
        }
        return strArr;
    }

    /* renamed from: getMapValues */
    public static java.lang.String[] m29811x39e72ae8(java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.lang.String[] strArr) {
        java.lang.String[] strArr2 = new java.lang.String[hashMap.size()];
        int length = strArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            strArr2[i18] = hashMap.get(strArr[i17]);
            i17++;
            i18++;
        }
        return strArr2;
    }

    /* renamed from: isMapValid */
    public static boolean m29812xdadc9b4a(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        for (java.lang.String str : hashMap.keySet()) {
            if (str == null || hashMap.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: nativeCallExperimentalAPI */
    private static native void m29813x63f4483d(long j17, java.lang.String str);

    /* renamed from: nativeCreate */
    private static native long m29814x73c02ff3(java.lang.ref.WeakReference<com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3797x6358012e> weakReference);

    /* renamed from: nativeCreateAudioEffectManager */
    private static native long m29815x3df02df9(long j17);

    /* renamed from: nativeCreateBeautyManager */
    private static native long m29816x3653165e(long j17);

    /* renamed from: nativeDestroy */
    private static native void m29817x23caefe3(long j17);

    /* renamed from: nativeEnableAudioVolumeEvaluation */
    private static native void m29818x5eaeb192(long j17, int i17);

    /* renamed from: nativeGetMaxZoom */
    private static native int m29819x561c6298(long j17);

    /* renamed from: nativeGetMusicDuration */
    private static native int m29820xe774ed5a(long j17, java.lang.String str);

    /* renamed from: nativeIsPushing */
    private static native boolean m29821xb6ba9ba7(long j17);

    /* renamed from: nativeOnLogRecord */
    private static native void m29822x4983e8ff(long j17, java.lang.String str);

    /* renamed from: nativePauseBGM */
    private static native boolean m29823x63dd3c29(long j17);

    /* renamed from: nativePausePusher */
    private static native void m29824x68dad246(long j17);

    /* renamed from: nativePlayBGM */
    private static native boolean m29825xa98b88dd(long j17, java.lang.String str);

    /* renamed from: nativeResumeBGM */
    private static native boolean m29826x79f5a704(long j17);

    /* renamed from: nativeResumePusher */
    private static native void m29827xac55b58b(long j17);

    /* renamed from: nativeSendCustomPCMData */
    private static native void m29828xeefcacf4(long j17, byte[] bArr);

    /* renamed from: nativeSendCustomVideoFrame */
    private static native void m29829x26515e62(long j17, int i17, int i18, int i19, int i27, int i28, java.lang.Object obj, byte[] bArr);

    /* renamed from: nativeSendMessage */
    private static native void m29830x2c1f2c8(long j17, byte[] bArr);

    /* renamed from: nativeSendMessageEx */
    private static native boolean m29831x5a10699b(long j17, byte[] bArr);

    /* renamed from: nativeSetAudioConfig */
    private static native void m29832x3cf6b4ed(long j17, int i17, int i18, int i19, boolean z17, boolean z18);

    /* renamed from: nativeSetBGMPitch */
    private static native void m29833x48296943(long j17, float f17);

    /* renamed from: nativeSetBGMPosition */
    private static native boolean m29834xc71c9046(long j17, int i17);

    /* renamed from: nativeSetBGMVolume */
    private static native boolean m29835xc7920177(long j17, float f17);

    /* renamed from: nativeSetBeautyFilter */
    private static native boolean m29836x1b5b5f7f(long j17, int i17, int i18, int i19, int i27);

    /* renamed from: nativeSetCaptureConfig */
    private static native void m29837xc936d31d(long j17, int i17, int i18, android.graphics.Bitmap bitmap, int i19, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, int i27);

    /* renamed from: nativeSetEncoderConfig */
    private static native void m29838x45ec5873(long j17, int i17, int i18, boolean z17, int i19, int i27, int i28, int i29, int i37, boolean z18, int i38, boolean z19);

    /* renamed from: nativeSetExposureCompensation */
    private static native void m29839xc414ac6c(long j17, float f17);

    /* renamed from: nativeSetFilter */
    private static native void m29840xf2b81c23(long j17, android.graphics.Bitmap bitmap);

    /* renamed from: nativeSetFocusPosition */
    private static native void m29841xd347a316(long j17, float f17, float f18);

    /* renamed from: nativeSetMicVolume */
    private static native boolean m29842x7e33d3b6(long j17, float f17);

    /* renamed from: nativeSetMirror */
    private static native boolean m29843xfeacbc6a(long j17, boolean z17);

    /* renamed from: nativeSetMute */
    private static native void m29844x3d44d184(long j17, boolean z17);

    /* renamed from: nativeSetNetworkConfig */
    private static native void m29845x1bd89805(long j17, int i17, boolean z17, int i18, int i19, int i27, java.util.HashMap hashMap);

    /* renamed from: nativeSetRenderRotation */
    private static native void m29846x1b1c34df(long j17, int i17);

    /* renamed from: nativeSetReverb */
    private static native void m29847x6fe3a7d(long j17, int i17);

    /* renamed from: nativeSetSpecialRatio */
    private static native void m29848x3b9d8f3d(long j17, float f17);

    /* renamed from: nativeSetView */
    private static native void m29849x3d48ba10(long j17, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3 c3826xc46e8cd3);

    /* renamed from: nativeSetVoiceChangerType */
    private static native void m29850xb7715f75(long j17, int i17);

    /* renamed from: nativeSetWaterMark */
    private static native void m29851xa6d547f9(long j17, android.graphics.Bitmap bitmap, float f17, float f18, float f19);

    /* renamed from: nativeSetZoom */
    private static native boolean m29852x3d4aa33e(long j17, int i17);

    /* renamed from: nativeShowDebugView */
    private static native void m29853x71823244(long j17, boolean z17);

    /* renamed from: nativeSnapshot */
    private static native void m29854x28ed82fb(long j17);

    /* renamed from: nativeStartCamera */
    private static native void m29855x4df45590(long j17);

    /* renamed from: nativeStartPusher */
    private static native int m29856x653fefb2(long j17, java.lang.String str);

    /* renamed from: nativeStartRecord */
    private static native int m29857x67c0febc(long j17, java.lang.String str);

    /* renamed from: nativeStartScreenCapture */
    private static native void m29858x2d447c6f(long j17);

    /* renamed from: nativeStopBGM */
    private static native boolean m29859x56a6314f(long j17);

    /* renamed from: nativeStopCameraPreview */
    private static native void m29860xdf1ad0aa(long j17, boolean z17);

    /* renamed from: nativeStopPusher */
    private static native void m29861x90830360(long j17);

    /* renamed from: nativeStopRecord */
    private static native void m29862x9304126a(long j17);

    /* renamed from: nativeStopScreenCapture */
    private static native void m29863xb2028901(long j17);

    /* renamed from: nativeSwitchCamera */
    private static native void m29864x85946930(long j17);

    /* renamed from: nativeTurnOnFlashLight */
    private static native boolean m29865xbbb199(long j17, boolean z17);

    /* renamed from: weakToStrongReference */
    public static com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3797x6358012e m29866x259965e1(java.lang.ref.WeakReference<com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3797x6358012e> weakReference) {
        return weakReference.get();
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: callExperimentalAPI */
    public void mo29867xd33a8dd4(java.lang.String str) {
        m29813x63f4483d(this.f14828x431865ca, str);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: enableAudioVolumeEvaluation */
    public void mo29868xe3d7029(int i17) {
        m29818x5eaeb192(this.f14828x431865ca, i17);
    }

    /* renamed from: finalize */
    public void m29869xd764dc1e() {
        super.finalize();
        mo29898x41012807();
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: getAudioEffectManager */
    public com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a mo29870x5f1b9a9c() {
        return this.f14821x4b0e93f3;
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: getBeautyManager */
    public com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d mo29871x2490fdb() {
        return this.f14822x9ff75c24;
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: getConfig */
    public com.p314xaae8f345.p2926x359365.C25486xcd8958ac mo29872x1456a638() {
        return this.f14823xfeabaa0f;
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: getMaxZoom */
    public int mo29873x70202721() {
        return m29819x561c6298(this.f14828x431865ca);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: getMusicDuration */
    public int mo29874xc7cb6723(java.lang.String str) {
        return m29820xe774ed5a(this.f14828x431865ca, str);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: isPushing */
    public boolean mo29875xd057a1fe() {
        return m29821xb6ba9ba7(this.f14828x431865ca);
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXAudioVolumeEvaluationListener
    /* renamed from: onAudioVolumeEvaluationNotify */
    public void mo29876x4d82ef6(int i17) {
        com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener = this.f14824x487f89a0;
        if (iTXAudioVolumeEvaluationListener != null) {
            iTXAudioVolumeEvaluationListener.mo29876x4d82ef6(i17);
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify
    /* renamed from: onBGMComplete */
    public void mo29877x552e4ec2(int i17) {
        com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify onBGMNotify = this.f14829xae899465;
        if (onBGMNotify != null) {
            onBGMNotify.mo29877x552e4ec2(i17);
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify
    /* renamed from: onBGMProgress */
    public void mo29878x3d3ddfb6(long j17, long j18) {
        com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify onBGMNotify = this.f14829xae899465;
        if (onBGMNotify != null) {
            onBGMNotify.mo29878x3d3ddfb6(j17, j18);
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify
    /* renamed from: onBGMStart */
    public void mo29879x9d54bb79() {
        com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify onBGMNotify = this.f14829xae899465;
        if (onBGMNotify != null) {
            onBGMNotify.mo29879x9d54bb79();
        }
    }

    /* renamed from: onCustomPreprocessFrame */
    public int m29880xd4d3ce11(int i17, int i18, int i19) {
        return mo29893x2613f4e2(i17, i18, i19);
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener
    /* renamed from: onDetectFacePoints */
    public void mo29881xb9d12ca2(float[] fArr) {
        com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener videoCustomProcessListener = this.f14830x63ca4924;
        if (videoCustomProcessListener != null) {
            videoCustomProcessListener.mo29881xb9d12ca2(fArr);
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: onLogRecord */
    public void mo29882x6ff8b596(java.lang.String str) {
        m29822x4983e8ff(this.f14828x431865ca, str);
    }

    /* renamed from: onNativeRecordPcmData */
    public byte[] m29883x7d464add(byte[] bArr, long j17, int i17, int i18, int i19) {
        mo29889xc438da74(bArr, j17, i17, i18, i19);
        return bArr;
    }

    /* renamed from: onNativeRecordRawPcmData */
    public byte[] m29884xa39dd083(byte[] bArr, long j17, int i17, int i18, int i19, boolean z17) {
        mo29891xe0b1858c(bArr, j17, i17, i18, i19, z17);
        return bArr;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7
    /* renamed from: onNetStatus */
    public void mo29885x3bee38d0(android.os.Bundle bundle) {
        com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7 interfaceC25480xa8fcc7a7 = this.f14825x48e50e1a;
        if (interfaceC25480xa8fcc7a7 != null) {
            interfaceC25480xa8fcc7a7.mo29885x3bee38d0(bundle);
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7
    /* renamed from: onPushEvent */
    public void mo29886xceec7081(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7 interfaceC25480xa8fcc7a7 = this.f14825x48e50e1a;
        if (interfaceC25480xa8fcc7a7 != null) {
            interfaceC25480xa8fcc7a7.mo29886xceec7081(i17, bundle);
        }
    }

    /* renamed from: onRecordComplete */
    public void m29887xf9aec869(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.ugc.C26824x75ddfa40.ITXVideoRecordListener iTXVideoRecordListener = this.f14827xe64f2060;
        if (iTXVideoRecordListener != null) {
            com.p314xaae8f345.ugc.C26824x75ddfa40.TXRecordResult tXRecordResult = new com.p314xaae8f345.ugc.C26824x75ddfa40.TXRecordResult();
            if (i17 == 0) {
                tXRecordResult.f57619x4162a22e = 0;
            } else {
                tXRecordResult.f57619x4162a22e = -1;
            }
            tXRecordResult.f57618x5ccb5b30 = str;
            tXRecordResult.f57620x4f713740 = str2;
            tXRecordResult.f57617x75fe787c = str3;
            iTXVideoRecordListener.m105974xf9aec869(tXRecordResult);
        }
    }

    /* renamed from: onRecordEvent */
    public void m29888x69a7a96a(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.ugc.C26824x75ddfa40.ITXVideoRecordListener iTXVideoRecordListener = this.f14827xe64f2060;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.m105975x69a7a96a(i17, bundle);
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.AudioCustomProcessListener
    /* renamed from: onRecordPcmData */
    public void mo29889xc438da74(byte[] bArr, long j17, int i17, int i18, int i19) {
        com.p314xaae8f345.p2926x359365.C25487x5a912af7.AudioCustomProcessListener audioCustomProcessListener = this.f14820x980078a9;
        if (audioCustomProcessListener != null) {
            audioCustomProcessListener.mo29889xc438da74(bArr, j17, i17, i18, i19);
        }
    }

    /* renamed from: onRecordProgress */
    public void m29890xe1be595d(long j17) {
        com.p314xaae8f345.ugc.C26824x75ddfa40.ITXVideoRecordListener iTXVideoRecordListener = this.f14827xe64f2060;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.m105976xe1be595d(j17);
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.AudioCustomProcessListener
    /* renamed from: onRecordRawPcmData */
    public void mo29891xe0b1858c(byte[] bArr, long j17, int i17, int i18, int i19, boolean z17) {
        com.p314xaae8f345.p2926x359365.C25487x5a912af7.AudioCustomProcessListener audioCustomProcessListener = this.f14820x980078a9;
        if (audioCustomProcessListener != null) {
            audioCustomProcessListener.mo29891xe0b1858c(bArr, j17, i17, i18, i19, z17);
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.b
    /* renamed from: onShowLog */
    public void mo29784xcade1428(boolean z17) {
        m29853x71823244(this.f14828x431865ca, z17);
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXSnapshotListener
    /* renamed from: onSnapshot */
    public void mo29892xb614f8c3(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXSnapshotListener iTXSnapshotListener = this.f14826x8d56e7b8;
        if (iTXSnapshotListener != null) {
            iTXSnapshotListener.mo29892xb614f8c3(bitmap);
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener
    /* renamed from: onTextureCustomProcess */
    public int mo29893x2613f4e2(int i17, int i18, int i19) {
        com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener videoCustomProcessListener = this.f14830x63ca4924;
        if (videoCustomProcessListener != null) {
            return videoCustomProcessListener.mo29893x2613f4e2(i17, i18, i19);
        }
        return -1;
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener
    /* renamed from: onTextureDestoryed */
    public void mo29894x6fb839d7() {
        com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener videoCustomProcessListener = this.f14830x63ca4924;
        if (videoCustomProcessListener != null) {
            videoCustomProcessListener.mo29894x6fb839d7();
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: pauseBGM */
    public boolean mo29895x4bea8ef2() {
        return m29823x63dd3c29(this.f14828x431865ca);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: pausePusher */
    public void mo29896x8f4f9edd() {
        m29824x68dad246(this.f14828x431865ca);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: playBGM */
    public boolean mo29897xe29438f4(java.lang.String str) {
        return m29825xa98b88dd(this.f14828x431865ca, str);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: release */
    public void mo29898x41012807() {
        com.p314xaae8f345.p373xbe494963.p389xacf8107c.C3786x3af8072d c3786x3af8072d = this.f14822x9ff75c24;
        if (c3786x3af8072d != null) {
            c3786x3af8072d.m29653x5a5b64d();
        }
        long j17 = this.f14828x431865ca;
        if (j17 != 0) {
            m29817x23caefe3(j17);
            this.f14828x431865ca = 0L;
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: resumeBGM */
    public boolean mo29899x9392ad5b() {
        return m29826x79f5a704(this.f14828x431865ca);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: resumePusher */
    public void mo29900x547a7bd4() {
        m29827xac55b58b(this.f14828x431865ca);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: sendCustomPCMData */
    public void mo29901x19756c4b(byte[] bArr) {
        m29828xeefcacf4(this.f14828x431865ca, bArr);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: sendCustomVideoData */
    public int mo29902x70818dac(byte[] bArr, int i17, int i18, int i19) {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType pixelFormatType;
        if (i17 == 3) {
            pixelFormatType = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.I420;
        } else {
            if (i17 != 5) {
                return -3;
            }
            pixelFormatType = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.RGBA;
        }
        m29829x26515e62(this.f14828x431865ca, i18, i19, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_ARRAY.f14885xbee9dd04, pixelFormatType.m30955x754a37bb(), -1, null, bArr);
        return 0;
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: sendCustomVideoTexture */
    public int mo29903xc9bf5fd9(int i17, int i18, int i19) {
        android.opengl.EGLContext eglGetCurrentContext = android.opengl.EGL14.eglGetCurrentContext();
        if (eglGetCurrentContext == null) {
            return -1;
        }
        m29829x26515e62(this.f14828x431865ca, i18, i19, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.TEXTURE_2D.f14885xbee9dd04, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.RGBA.m30955x754a37bb(), i17, eglGetCurrentContext, null);
        return 0;
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: sendMessage */
    public void mo29904x2936bf5f(byte[] bArr) {
        m29830x2c1f2c8(this.f14828x431865ca, bArr);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: sendMessageEx */
    public boolean mo29905xb6846c72(byte[] bArr) {
        return m29831x5a10699b(this.f14828x431865ca, bArr);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setAudioProcessListener */
    public void mo29906x101c890f(com.p314xaae8f345.p2926x359365.C25487x5a912af7.AudioCustomProcessListener audioCustomProcessListener) {
        this.f14820x980078a9 = audioCustomProcessListener;
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setAudioVolumeEvaluationListener */
    public void mo29907x81e7097e(com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f14824x487f89a0 = iTXAudioVolumeEvaluationListener;
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setBGMNofify */
    public void mo29908x620d1abd(com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify onBGMNotify) {
        this.f14829xae899465 = onBGMNotify;
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setBGMPitch */
    public void mo29909x6e9e35da(float f17) {
        m29833x48296943(this.f14828x431865ca, f17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setBGMPosition */
    public boolean mo29910xf928e84f(int i17) {
        return m29834xc71c9046(this.f14828x431865ca, i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setBGMVolume */
    public boolean mo29911x6fb6c7c0(float f17) {
        return m29835xc7920177(this.f14828x431865ca, f17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setBeautyFilter */
    public boolean mo29912x2ada0896(int i17, int i18, int i19, int i27) {
        return m29836x1b5b5f7f(this.f14828x431865ca, i17, i18, i19, i27);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setChinLevel */
    public void mo29913x58346718(int i17) {
        this.f14822x9ff75c24.mo29595x58346718(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setConfig */
    public void mo29914x78bda44(com.p314xaae8f345.p2926x359365.C25486xcd8958ac c25486xcd8958ac) {
        if (c25486xcd8958ac == null) {
            return;
        }
        this.f14823xfeabaa0f = c25486xcd8958ac;
        m29837xc936d31d(this.f14828x431865ca, c25486xcd8958ac.f46532x39adabdb, c25486xcd8958ac.f46548x8246bb96, c25486xcd8958ac.f46554x70e8557a, c25486xcd8958ac.f46553x70e84aa0, c25486xcd8958ac.f46545x227f9c01, c25486xcd8958ac.f46558x7b9e2d26, c25486xcd8958ac.f46542x4d0d3c43, c25486xcd8958ac.f46540xf9e8c254, c25486xcd8958ac.f46537x3c85fd08, c25486xcd8958ac.f46552xac20f895);
        long j17 = this.f14828x431865ca;
        com.p314xaae8f345.p2926x359365.C25486xcd8958ac c25486xcd8958ac2 = this.f14823xfeabaa0f;
        int i17 = c25486xcd8958ac2.f46547xe4786744;
        int ordinal = c25486xcd8958ac2.f46565xb9aa7b5a.ordinal();
        com.p314xaae8f345.p2926x359365.C25486xcd8958ac c25486xcd8958ac3 = this.f14823xfeabaa0f;
        m29838x45ec5873(j17, i17, ordinal, c25486xcd8958ac3.f46527xd251da82, c25486xcd8958ac3.f46559x88b7277f, c25486xcd8958ac3.f46549x6f7c41c9, c25486xcd8958ac3.f46551x2d4c4db7, c25486xcd8958ac3.f46560x73790a24, c25486xcd8958ac3.f46562x699e0dfb, c25486xcd8958ac3.f46561x9a727549, c25486xcd8958ac3.f46546x6be40c73, c25486xcd8958ac3.f46541x1ef1072a);
        long j18 = this.f14828x431865ca;
        com.p314xaae8f345.p2926x359365.C25486xcd8958ac c25486xcd8958ac4 = this.f14823xfeabaa0f;
        m29851xa6d547f9(j18, c25486xcd8958ac4.f46567x6dfeb277, c25486xcd8958ac4.f46570xe91bfba5, c25486xcd8958ac4.f46572xe91bfbc4, c25486xcd8958ac4.f46568x2f6c7d8f);
        long j19 = this.f14828x431865ca;
        com.p314xaae8f345.p2926x359365.C25486xcd8958ac c25486xcd8958ac5 = this.f14823xfeabaa0f;
        m29832x3cf6b4ed(j19, c25486xcd8958ac5.f46523x3d43f659, c25486xcd8958ac5.f46526xc35c5673, c25486xcd8958ac5.f46566x7fa7c5c1, c25486xcd8958ac5.f46536xfa7ab82, c25486xcd8958ac5.f46535x55109376);
        long j27 = this.f14828x431865ca;
        com.p314xaae8f345.p2926x359365.C25486xcd8958ac c25486xcd8958ac6 = this.f14823xfeabaa0f;
        m29845x1bd89805(j27, c25486xcd8958ac6.f46528x9f7126fe, c25486xcd8958ac6.f46539xb3651188, c25486xcd8958ac6.f46530x2dee6e4, c25486xcd8958ac6.f46531x498502d0, c25486xcd8958ac6.f46556x8b25ea0b, c25486xcd8958ac6.f46550xa1c96dc);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setExposureCompensation */
    public void mo29915xf5004e83(float f17) {
        m29839xc414ac6c(this.f14828x431865ca, f17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setEyeScaleLevel */
    public void mo29916xb38b2029(int i17) {
        this.f14822x9ff75c24.mo29599xb38b2029(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setFaceShortLevel */
    public void mo29917x9f95eba7(int i17) {
        this.f14822x9ff75c24.mo29602x9f95eba7(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setFaceSlimLevel */
    public void mo29918x8e214528(int i17) {
        this.f14822x9ff75c24.mo29603x8e214528(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setFaceVLevel */
    public void mo29919x419f536d(int i17) {
        this.f14822x9ff75c24.mo29604x419f536d(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setFilter */
    public void mo29920xc55227a(android.graphics.Bitmap bitmap) {
        m29840xf2b81c23(this.f14828x431865ca, bitmap);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setFocusPosition */
    public void mo29921xb39e1cdf(float f17, float f18) {
        m29841xd347a316(this.f14828x431865ca, f17, f18);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setGreenScreenFile */
    public boolean mo29922x523b82a9(java.lang.String str) {
        return this.f14822x9ff75c24.mo29608x523b82a9(str) != 0;
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setMicVolume */
    public boolean mo29923x265899ff(float f17) {
        return m29842x7e33d3b6(this.f14828x431865ca, f17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setMirror */
    public boolean mo29924x1849c2c1(boolean z17) {
        return m29843xfeacbc6a(this.f14828x431865ca, z17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setMotionMute */
    public void mo29925xf169c0f1(boolean z17) {
        this.f14822x9ff75c24.mo29610xf169c0f1(z17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setMotionTmpl */
    public void mo29926xf16cd10d(java.lang.String str) {
        this.f14822x9ff75c24.mo29611xf16cd10d(str);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setMute */
    public void mo29927x764d819b(boolean z17) {
        m29844x3d44d184(this.f14828x431865ca, z17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setNoseSlimLevel */
    public void mo29928xbc3bb072(int i17) {
        this.f14822x9ff75c24.mo29614xbc3bb072(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setPushListener */
    public void mo29929x4e5bab70(com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7 interfaceC25480xa8fcc7a7) {
        this.f14825x48e50e1a = interfaceC25480xa8fcc7a7;
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setRenderRotation */
    public void mo29930x4594f436(int i17) {
        m29846x1b1c34df(this.f14828x431865ca, i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setReverb */
    public void mo29931x209b40d4(int i17) {
        m29847x6fe3a7d(this.f14828x431865ca, i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setSpecialRatio */
    public void mo29932x4b1c3854(float f17) {
        m29848x3b9d8f3d(this.f14828x431865ca, f17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setSurface */
    public void mo29933x42c875eb(android.view.Surface surface) {
        m29849x3d48ba10(this.f14828x431865ca, new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3(surface));
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setSurfaceSize */
    public void mo29934x1c9cdc8c(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setVideoProcessListener */
    public void mo29935x29bf11ca(com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener videoCustomProcessListener) {
        this.f14830x63ca4924 = videoCustomProcessListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setVideoQuality */
    public void mo29936xb546e186(int i17, boolean z17, boolean z18) {
        java.lang.Object[] objArr = z17 && z18;
        this.f14823xfeabaa0f.m94567xca01de0a(1);
        this.f14823xfeabaa0f.m94557x643ae72d(z17);
        switch (i17) {
            case 1:
                this.f14823xfeabaa0f.m94582x534b6c5(0);
                this.f14823xfeabaa0f.m94558x4aa9afb3(z18 ? 1 : 0);
                this.f14823xfeabaa0f.m94579x23543559(3);
                if (objArr == true) {
                    this.f14823xfeabaa0f.m94572x78d68922(301);
                } else {
                    this.f14823xfeabaa0f.m94572x78d68922(500);
                }
                this.f14823xfeabaa0f.m94578x885d9bf4(800);
                this.f14823xfeabaa0f.m94570xbb067d34(900);
                break;
            case 2:
                this.f14823xfeabaa0f.m94582x534b6c5(1);
                this.f14823xfeabaa0f.m94558x4aa9afb3(z18 ? 1 : 0);
                this.f14823xfeabaa0f.m94579x23543559(3);
                if (objArr == true) {
                    this.f14823xfeabaa0f.m94572x78d68922(600);
                } else {
                    this.f14823xfeabaa0f.m94572x78d68922(800);
                }
                this.f14823xfeabaa0f.m94578x885d9bf4(1200);
                this.f14823xfeabaa0f.m94570xbb067d34(1500);
                break;
            case 3:
                this.f14823xfeabaa0f.m94582x534b6c5(2);
                this.f14823xfeabaa0f.m94558x4aa9afb3(z18 ? 1 : 0);
                this.f14823xfeabaa0f.m94579x23543559(3);
                if (objArr == true) {
                    this.f14823xfeabaa0f.m94572x78d68922(600);
                } else {
                    this.f14823xfeabaa0f.m94572x78d68922(1000);
                }
                this.f14823xfeabaa0f.m94578x885d9bf4(1800);
                this.f14823xfeabaa0f.m94570xbb067d34(1800);
                break;
            case 4:
                int i18 = this.f14831xb5a06d11;
                if (i18 == 1) {
                    this.f14823xfeabaa0f.m94582x534b6c5(0);
                    this.f14823xfeabaa0f.m94572x78d68922(500);
                    this.f14823xfeabaa0f.m94578x885d9bf4(800);
                    this.f14823xfeabaa0f.m94570xbb067d34(900);
                } else if (i18 == 3) {
                    this.f14823xfeabaa0f.m94582x534b6c5(2);
                    this.f14823xfeabaa0f.m94572x78d68922(1000);
                    this.f14823xfeabaa0f.m94578x885d9bf4(1800);
                    this.f14823xfeabaa0f.m94570xbb067d34(1800);
                } else if (i18 == 7) {
                    this.f14823xfeabaa0f.m94582x534b6c5(30);
                    this.f14823xfeabaa0f.m94572x78d68922(2000);
                    this.f14823xfeabaa0f.m94578x885d9bf4(3000);
                    this.f14823xfeabaa0f.m94570xbb067d34(3000);
                } else {
                    this.f14823xfeabaa0f.m94582x534b6c5(1);
                    this.f14823xfeabaa0f.m94572x78d68922(800);
                    this.f14823xfeabaa0f.m94578x885d9bf4(1200);
                    this.f14823xfeabaa0f.m94570xbb067d34(1500);
                }
                this.f14823xfeabaa0f.m94558x4aa9afb3(4);
                this.f14823xfeabaa0f.m94579x23543559(1);
                break;
            case 5:
                this.f14823xfeabaa0f.m94582x534b6c5(6);
                this.f14823xfeabaa0f.m94572x78d68922(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a);
                this.f14823xfeabaa0f.m94578x885d9bf4(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a);
                this.f14823xfeabaa0f.m94570xbb067d34(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a);
                this.f14823xfeabaa0f.m94558x4aa9afb3(4);
                this.f14823xfeabaa0f.m94579x23543559(1);
                break;
            case 6:
                this.f14823xfeabaa0f.m94582x534b6c5(0);
                this.f14823xfeabaa0f.m94558x4aa9afb3(5);
                this.f14823xfeabaa0f.m94579x23543559(1);
                this.f14823xfeabaa0f.m94572x78d68922(190);
                this.f14823xfeabaa0f.m94578x885d9bf4(400);
                this.f14823xfeabaa0f.m94570xbb067d34(810);
                break;
            case 7:
                this.f14823xfeabaa0f.m94582x534b6c5(30);
                this.f14823xfeabaa0f.m94558x4aa9afb3(z18 ? 1 : 0);
                this.f14823xfeabaa0f.m94579x23543559(3);
                if (objArr == true) {
                    this.f14823xfeabaa0f.m94572x78d68922(600);
                } else {
                    this.f14823xfeabaa0f.m94572x78d68922(2500);
                }
                this.f14823xfeabaa0f.m94578x885d9bf4(3000);
                this.f14823xfeabaa0f.m94570xbb067d34(3000);
                break;
            default:
                return;
        }
        this.f14831xb5a06d11 = i17;
        mo29914x78bda44(this.f14823xfeabaa0f);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setVideoRecordListener */
    public void mo29937x8cfd3dbe(com.p314xaae8f345.ugc.C26824x75ddfa40.ITXVideoRecordListener iTXVideoRecordListener) {
        this.f14827xe64f2060 = iTXVideoRecordListener;
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setVoiceChangerType */
    public void mo29938x26b7a50c(int i17) {
        m29850xb7715f75(this.f14828x431865ca, i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setZoom */
    public boolean mo29939x76535355(int i17) {
        return m29852x3d4aa33e(this.f14828x431865ca, i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: snapshot */
    public void mo29940x10fad5c4(com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXSnapshotListener iTXSnapshotListener) {
        this.f14826x8d56e7b8 = iTXSnapshotListener;
        m29854x28ed82fb(this.f14828x431865ca);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: startCameraPreview */
    public void mo29941x7efbefa1(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
            com.p314xaae8f345.p373xbe494963.p393x32b0ec.a.a(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, new java.lang.ref.WeakReference(this));
            m29853x71823244(this.f14828x431865ca, com.p314xaae8f345.p373xbe494963.p393x32b0ec.a.a(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf));
        }
        m29849x3d48ba10(this.f14828x431865ca, new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf));
        m29855x4df45590(this.f14828x431865ca);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: startPusher */
    public int mo29942x8bb4bc49(java.lang.String str) {
        return m29856x653fefb2(this.f14828x431865ca, str);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: startRecord */
    public int mo29943x8e35cb53(java.lang.String str) {
        return m29857x67c0febc(this.f14828x431865ca, str);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: startScreenCapture */
    public void mo29944x51e3a7f8() {
        m29858x2d447c6f(this.f14828x431865ca);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: stopBGM */
    public boolean mo29945x8faee166() {
        return m29859x56a6314f(this.f14828x431865ca);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: stopCameraPreview */
    public void mo29946x9939001(boolean z17) {
        m29860xdf1ad0aa(this.f14828x431865ca, z17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: stopPusher */
    public void mo29947xaa86c7e9() {
        m29861x90830360(this.f14828x431865ca);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: stopRecord */
    public void mo29948xad07d6f3() {
        m29862x9304126a(this.f14828x431865ca);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: stopScreenCapture */
    public void mo29949xdc7b4858() {
        m29863xb2028901(this.f14828x431865ca);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: switchCamera */
    public void mo29950x2db92f79() {
        this.f14823xfeabaa0f.m94566xe8ae44ec(!r0.f46545x227f9c01);
        m29864x85946930(this.f14828x431865ca);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: turnOnFlashLight */
    public boolean mo29951xe1122b62(boolean z17) {
        return m29865xbbb199(this.f14828x431865ca, z17);
    }
}
