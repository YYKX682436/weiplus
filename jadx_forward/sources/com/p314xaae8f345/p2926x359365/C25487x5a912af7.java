package com.p314xaae8f345.p2926x359365;

/* renamed from: com.tencent.rtmp.TXLivePusher */
/* loaded from: classes16.dex */
public class C25487x5a912af7 implements com.p314xaae8f345.p2926x359365.b {

    /* renamed from: RGB_BGRA */
    public static final int f46574x67f47586 = 4;

    /* renamed from: RGB_RGBA */
    public static final int f46575x67fbb986 = 5;
    private static final java.lang.String TAG = "TXLivePusher";

    /* renamed from: YUV_420P */
    public static final int f46576x45ce2983 = 3;

    /* renamed from: YUV_420SP */
    public static final int f46577x73f7078a = 1;

    /* renamed from: YUV_420YpCbCr */
    public static final int f46578x16d423b2 = 2;

    /* renamed from: mImpl */
    private com.p314xaae8f345.p2926x359365.b f46579x622d82d;

    /* renamed from: com.tencent.rtmp.TXLivePusher$AudioCustomProcessListener */
    /* loaded from: classes16.dex */
    public interface AudioCustomProcessListener {
        /* renamed from: onRecordPcmData */
        void mo29889xc438da74(byte[] bArr, long j17, int i17, int i18, int i19);

        /* renamed from: onRecordRawPcmData */
        void mo29891xe0b1858c(byte[] bArr, long j17, int i17, int i18, int i19, boolean z17);
    }

    /* renamed from: com.tencent.rtmp.TXLivePusher$ITXAudioVolumeEvaluationListener */
    /* loaded from: classes15.dex */
    public interface ITXAudioVolumeEvaluationListener {
        /* renamed from: onAudioVolumeEvaluationNotify */
        void mo29876x4d82ef6(int i17);
    }

    /* renamed from: com.tencent.rtmp.TXLivePusher$ITXSnapshotListener */
    /* loaded from: classes15.dex */
    public interface ITXSnapshotListener {
        /* renamed from: onSnapshot */
        void mo29892xb614f8c3(android.graphics.Bitmap bitmap);
    }

    @java.lang.Deprecated
    /* renamed from: com.tencent.rtmp.TXLivePusher$OnBGMNotify */
    /* loaded from: classes16.dex */
    public interface OnBGMNotify {
        /* renamed from: onBGMComplete */
        void mo29877x552e4ec2(int i17);

        /* renamed from: onBGMProgress */
        void mo29878x3d3ddfb6(long j17, long j18);

        /* renamed from: onBGMStart */
        void mo29879x9d54bb79();
    }

    /* renamed from: com.tencent.rtmp.TXLivePusher$VideoCustomProcessListener */
    /* loaded from: classes15.dex */
    public interface VideoCustomProcessListener {
        /* renamed from: onDetectFacePoints */
        void mo29881xb9d12ca2(float[] fArr);

        /* renamed from: onTextureCustomProcess */
        int mo29893x2613f4e2(int i17, int i18, int i19);

        /* renamed from: onTextureDestoryed */
        void mo29894x6fb839d7();
    }

    static {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.q.a();
    }

    public C25487x5a912af7(android.content.Context context) {
        this.f46579x622d82d = new com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3797x6358012e(context);
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "Create instance:" + this.f46579x622d82d.toString());
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: callExperimentalAPI */
    public synchronized void mo29867xd33a8dd4(java.lang.String str) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29867xd33a8dd4(str);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: enableAudioVolumeEvaluation */
    public synchronized void mo29868xe3d7029(int i17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29868xe3d7029(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: getAudioEffectManager */
    public synchronized com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a mo29870x5f1b9a9c() {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return null;
        }
        return bVar.mo29870x5f1b9a9c();
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: getBeautyManager */
    public synchronized com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d mo29871x2490fdb() {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return null;
        }
        return bVar.mo29871x2490fdb();
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: getConfig */
    public synchronized com.p314xaae8f345.p2926x359365.C25486xcd8958ac mo29872x1456a638() {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return new com.p314xaae8f345.p2926x359365.C25486xcd8958ac();
        }
        return bVar.mo29872x1456a638();
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: getMaxZoom */
    public synchronized int mo29873x70202721() {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return 0;
        }
        return bVar.mo29873x70202721();
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: getMusicDuration */
    public synchronized int mo29874xc7cb6723(java.lang.String str) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return 0;
        }
        return bVar.mo29874xc7cb6723(str);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: isPushing */
    public synchronized boolean mo29875xd057a1fe() {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return false;
        }
        return bVar.mo29875xd057a1fe();
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: onLogRecord */
    public synchronized void mo29882x6ff8b596(java.lang.String str) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29882x6ff8b596(str);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: pauseBGM */
    public synchronized boolean mo29895x4bea8ef2() {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return false;
        }
        return bVar.mo29895x4bea8ef2();
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: pausePusher */
    public synchronized void mo29896x8f4f9edd() {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29896x8f4f9edd();
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: playBGM */
    public synchronized boolean mo29897xe29438f4(java.lang.String str) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return false;
        }
        return bVar.mo29897xe29438f4(str);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: release */
    public synchronized void mo29898x41012807() {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29898x41012807();
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "Release instance:" + this.f46579x622d82d.toString());
        this.f46579x622d82d = null;
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: resumeBGM */
    public synchronized boolean mo29899x9392ad5b() {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return false;
        }
        return bVar.mo29899x9392ad5b();
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: resumePusher */
    public synchronized void mo29900x547a7bd4() {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29900x547a7bd4();
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: sendCustomPCMData */
    public synchronized void mo29901x19756c4b(byte[] bArr) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29901x19756c4b(bArr);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: sendCustomVideoData */
    public synchronized int mo29902x70818dac(byte[] bArr, int i17, int i18, int i19) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return -1;
        }
        return bVar.mo29902x70818dac(bArr, i17, i18, i19);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: sendCustomVideoTexture */
    public synchronized int mo29903xc9bf5fd9(int i17, int i18, int i19) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return -1;
        }
        return bVar.mo29903xc9bf5fd9(i17, i18, i19);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: sendMessage */
    public synchronized void mo29904x2936bf5f(byte[] bArr) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29904x2936bf5f(bArr);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: sendMessageEx */
    public synchronized boolean mo29905xb6846c72(byte[] bArr) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return false;
        }
        return bVar.mo29905xb6846c72(bArr);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setAudioProcessListener */
    public synchronized void mo29906x101c890f(com.p314xaae8f345.p2926x359365.C25487x5a912af7.AudioCustomProcessListener audioCustomProcessListener) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29906x101c890f(audioCustomProcessListener);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setAudioVolumeEvaluationListener */
    public synchronized void mo29907x81e7097e(com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29907x81e7097e(iTXAudioVolumeEvaluationListener);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setBGMNofify */
    public synchronized void mo29908x620d1abd(com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify onBGMNotify) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29908x620d1abd(onBGMNotify);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setBGMPitch */
    public synchronized void mo29909x6e9e35da(float f17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29909x6e9e35da(f17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setBGMPosition */
    public synchronized boolean mo29910xf928e84f(int i17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return false;
        }
        return bVar.mo29910xf928e84f(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setBGMVolume */
    public synchronized boolean mo29911x6fb6c7c0(float f17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return false;
        }
        return bVar.mo29911x6fb6c7c0(f17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setBeautyFilter */
    public synchronized boolean mo29912x2ada0896(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return false;
        }
        return bVar.mo29912x2ada0896(i17, i18, i19, i27);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setChinLevel */
    public synchronized void mo29913x58346718(int i17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29913x58346718(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setConfig */
    public synchronized void mo29914x78bda44(com.p314xaae8f345.p2926x359365.C25486xcd8958ac c25486xcd8958ac) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29914x78bda44(c25486xcd8958ac);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setExposureCompensation */
    public synchronized void mo29915xf5004e83(float f17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29915xf5004e83(f17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setEyeScaleLevel */
    public synchronized void mo29916xb38b2029(int i17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29916xb38b2029(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setFaceShortLevel */
    public synchronized void mo29917x9f95eba7(int i17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29917x9f95eba7(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setFaceSlimLevel */
    public synchronized void mo29918x8e214528(int i17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29918x8e214528(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setFaceVLevel */
    public synchronized void mo29919x419f536d(int i17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29919x419f536d(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setFilter */
    public synchronized void mo29920xc55227a(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29920xc55227a(bitmap);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setFocusPosition */
    public synchronized void mo29921xb39e1cdf(float f17, float f18) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29921xb39e1cdf(f17, f18);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setGreenScreenFile */
    public synchronized boolean mo29922x523b82a9(java.lang.String str) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return false;
        }
        return bVar.mo29922x523b82a9(str);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setMicVolume */
    public synchronized boolean mo29923x265899ff(float f17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return false;
        }
        return bVar.mo29923x265899ff(f17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setMirror */
    public synchronized boolean mo29924x1849c2c1(boolean z17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return false;
        }
        return bVar.mo29924x1849c2c1(z17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setMotionMute */
    public synchronized void mo29925xf169c0f1(boolean z17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29925xf169c0f1(z17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setMotionTmpl */
    public synchronized void mo29926xf16cd10d(java.lang.String str) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29926xf16cd10d(str);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setMute */
    public synchronized void mo29927x764d819b(boolean z17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29927x764d819b(z17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setNoseSlimLevel */
    public synchronized void mo29928xbc3bb072(int i17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29928xbc3bb072(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setPushListener */
    public synchronized void mo29929x4e5bab70(com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7 interfaceC25480xa8fcc7a7) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29929x4e5bab70(interfaceC25480xa8fcc7a7);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setRenderRotation */
    public synchronized void mo29930x4594f436(int i17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29930x4594f436(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setReverb */
    public synchronized void mo29931x209b40d4(int i17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29931x209b40d4(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setSpecialRatio */
    public synchronized void mo29932x4b1c3854(float f17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29932x4b1c3854(f17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setSurface */
    public synchronized void mo29933x42c875eb(android.view.Surface surface) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29933x42c875eb(surface);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setSurfaceSize */
    public synchronized void mo29934x1c9cdc8c(int i17, int i18) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29934x1c9cdc8c(i17, i18);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setVideoProcessListener */
    public synchronized void mo29935x29bf11ca(com.p314xaae8f345.p2926x359365.C25487x5a912af7.VideoCustomProcessListener videoCustomProcessListener) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29935x29bf11ca(videoCustomProcessListener);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setVideoQuality */
    public synchronized void mo29936xb546e186(int i17, boolean z17, boolean z18) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29936xb546e186(i17, z17, z18);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setVideoRecordListener */
    public synchronized void mo29937x8cfd3dbe(com.p314xaae8f345.ugc.C26824x75ddfa40.ITXVideoRecordListener iTXVideoRecordListener) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29937x8cfd3dbe(iTXVideoRecordListener);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: setVoiceChangerType */
    public synchronized void mo29938x26b7a50c(int i17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29938x26b7a50c(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: setZoom */
    public synchronized boolean mo29939x76535355(int i17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return false;
        }
        return bVar.mo29939x76535355(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: snapshot */
    public synchronized void mo29940x10fad5c4(com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXSnapshotListener iTXSnapshotListener) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29940x10fad5c4(iTXSnapshotListener);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: startCameraPreview */
    public synchronized void mo29941x7efbefa1(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29941x7efbefa1(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: startPusher */
    public synchronized int mo29942x8bb4bc49(java.lang.String str) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return -1;
        }
        return bVar.mo29942x8bb4bc49(str);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: startRecord */
    public synchronized int mo29943x8e35cb53(java.lang.String str) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return -3;
        }
        return bVar.mo29943x8e35cb53(str);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: startScreenCapture */
    public synchronized void mo29944x51e3a7f8() {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29944x51e3a7f8();
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    @java.lang.Deprecated
    /* renamed from: stopBGM */
    public synchronized boolean mo29945x8faee166() {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return false;
        }
        return bVar.mo29945x8faee166();
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: stopCameraPreview */
    public synchronized void mo29946x9939001(boolean z17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29946x9939001(z17);
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: stopPusher */
    public synchronized void mo29947xaa86c7e9() {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29947xaa86c7e9();
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: stopRecord */
    public synchronized void mo29948xad07d6f3() {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29948xad07d6f3();
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: stopScreenCapture */
    public synchronized void mo29949xdc7b4858() {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29949xdc7b4858();
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: switchCamera */
    public synchronized void mo29950x2db92f79() {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return;
        }
        bVar.mo29950x2db92f79();
    }

    @Override // com.p314xaae8f345.p2926x359365.b
    /* renamed from: turnOnFlashLight */
    public synchronized boolean mo29951xe1122b62(boolean z17) {
        com.p314xaae8f345.p2926x359365.b bVar = this.f46579x622d82d;
        if (bVar == null) {
            return false;
        }
        return bVar.mo29951xe1122b62(z17);
    }
}
