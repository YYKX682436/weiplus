package com.p314xaae8f345.p420x6236cc6.p421x316220;

/* renamed from: com.tencent.live2.impl.V2TXLivePusherImpl */
/* loaded from: classes16.dex */
public class C3883xd1d70053 extends com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 {
    private static final java.lang.String TAG = "V2TXLivePusherImpl";

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f128723a = 0;

    /* renamed from: mImpl */
    private com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 f15469x622d82d;

    static {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.q.a();
    }

    public C3883xd1d70053(android.content.Context context, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMode v2TXLiveMode) {
        this(context, v2TXLiveMode.ordinal());
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: enableAudioProcessObserver */
    public int mo30096xdc23a5d2(boolean z17, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30096xdc23a5d2(z17, v2TXLiveAudioFrameObserverFormat);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: enableCustomAudioCapture */
    public synchronized int mo30097x9a8acb84(boolean z17) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30097x9a8acb84(z17);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: enableCustomVideoCapture */
    public synchronized int mo30098xf0533f3f(boolean z17) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30098xf0533f3f(z17);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: enableCustomVideoProcess */
    public synchronized int mo30099xbcf09668(boolean z17, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat v2TXLivePixelFormat, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType v2TXLiveBufferType) {
        return this.f15469x622d82d.mo30099xbcf09668(z17, v2TXLivePixelFormat, v2TXLiveBufferType);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: enableVoiceActivityDetection */
    public synchronized void mo30100x67501e87(boolean z17) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return;
        }
        c3800x8ae5eb12.mo30100x67501e87(z17);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: enableVolumeEvaluation */
    public synchronized int mo30101x740a3599(int i17) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30101x740a3599(i17);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: getAudioEffectManager */
    public synchronized com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a mo30103x5f1b9a9c() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return null;
        }
        return c3800x8ae5eb12.mo30103x5f1b9a9c();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: getBeautyManager */
    public synchronized com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d mo30104x2490fdb() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return null;
        }
        return c3800x8ae5eb12.mo30104x2490fdb();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: getDeviceManager */
    public synchronized com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853 mo30105xac7d98c1() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return null;
        }
        return c3800x8ae5eb12.mo30105xac7d98c1();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: isPushing */
    public synchronized int mo30115xd057a1fe() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30115xd057a1fe();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: pauseAudio */
    public synchronized int mo30144xfb89cf80() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30144xfb89cf80();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: pauseVideo */
    public synchronized int mo30145xfcac4825() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30145xfcac4825();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: release */
    public synchronized void mo30146x41012807() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return;
        }
        c3800x8ae5eb12.mo30146x41012807();
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "Release instance:" + this.f15469x622d82d.toString());
        this.f15469x622d82d = null;
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: resumeAudio */
    public synchronized int mo30147xf9a3f7a9() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30147xf9a3f7a9();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: resumeVideo */
    public synchronized int mo30148xfac6704e() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30148xfac6704e();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: sendCustomAudioFrame */
    public synchronized int mo30149x5c9ba530(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30149x5c9ba530(v2TXLiveAudioFrame);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: sendCustomVideoFrame */
    public synchronized int mo30150x9fd3cbab(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30150x9fd3cbab(v2TXLiveVideoFrame);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: sendSeiMessage */
    public synchronized int mo30151xf24c7d58(int i17, byte[] bArr) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30151xf24c7d58(i17, bArr);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setAudioQuality */
    public synchronized int mo30152x5f7e6dcb(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioQuality v2TXLiveAudioQuality) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30152x5f7e6dcb(v2TXLiveAudioQuality);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setEncoderMirror */
    public synchronized int mo30153x3700bab9(boolean z17) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30153x3700bab9(z17);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setMixTranscodingConfig */
    public synchronized int mo30154x99ee7a7a(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveTranscodingConfig v2TXLiveTranscodingConfig) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30154x99ee7a7a(v2TXLiveTranscodingConfig);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setObserver */
    public synchronized void mo30155x8b59f158(com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return;
        }
        c3800x8ae5eb12.mo30155x8b59f158(abstractC3879x413c9f89);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setProperty */
    public synchronized int mo30156x3b607c57(java.lang.String str, java.lang.Object obj) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30156x3b607c57(str, obj);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setRenderFillMode */
    public synchronized int mo30157x1c840e7e(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveFillMode v2TXLiveFillMode) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30157x1c840e7e(v2TXLiveFillMode);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setRenderMirror */
    public synchronized int mo30158xb89b1e77(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMirrorType v2TXLiveMirrorType) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30158xb89b1e77(v2TXLiveMirrorType);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setRenderRotation */
    public synchronized int mo30159x4594f436(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRotation v2TXLiveRotation) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30159x4594f436(v2TXLiveRotation);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setRenderView */
    public synchronized int mo30162x63923b5d(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30162x63923b5d(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setVideoQuality */
    public synchronized int mo30163xb546e186(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoEncoderParam v2TXLiveVideoEncoderParam) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30163xb546e186(v2TXLiveVideoEncoderParam);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setWatermark */
    public synchronized int mo30164x4f089a22(android.graphics.Bitmap bitmap, float f17, float f18, float f19) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30164x4f089a22(bitmap, f17, f18, f19);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: showDebugView */
    public synchronized void mo30165xcdf6351b(boolean z17) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return;
        }
        c3800x8ae5eb12.mo30165xcdf6351b(z17);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: snapshot */
    public synchronized int mo30166x10fad5c4() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30166x10fad5c4();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: startCamera */
    public synchronized int mo30167x74692227(boolean z17) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30167x74692227(z17);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: startLocalRecording */
    public synchronized int mo30168xcf0b23c8(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveLocalRecordingParams v2TXLiveLocalRecordingParams) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30168xcf0b23c8(v2TXLiveLocalRecordingParams);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: startMicrophone */
    public synchronized int mo30169xc2faa72c() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30169xc2faa72c();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: startPush */
    public synchronized int mo30170x8113e69c(java.lang.String str) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30170x8113e69c(str);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: startScreenCapture */
    public synchronized int mo30171x51e3a7f8() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30171x51e3a7f8();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: startSystemAudioLoopback */
    public synchronized int mo30172x48e939d0() {
        if (this.f15469x622d82d == null) {
            return -3;
        }
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() < 29) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "current system don't support system audio loopback");
            return -4;
        }
        return this.f15469x622d82d.mo30172x48e939d0();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: startVirtualCamera */
    public synchronized int mo30173xde9334ce(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30173xde9334ce(bitmap);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: stopCamera */
    public synchronized int mo30174x933b2dc7() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30174x933b2dc7();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: stopLocalRecording */
    public synchronized void mo30175x97678f68() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return;
        }
        c3800x8ae5eb12.mo30175x97678f68();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: stopMicrophone */
    public synchronized int mo30176xcc9de2cc() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30176xcc9de2cc();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: stopPush */
    public synchronized int mo30177x66345a3c() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30177x66345a3c();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: stopScreenCapture */
    public synchronized int mo30178xdc7b4858() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30178xdc7b4858();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: stopSystemAudioLoopback */
    public synchronized int mo30179x19f1230() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30179x19f1230();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: stopVirtualCamera */
    public synchronized int mo30180x692ad52e() {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30180x692ad52e();
    }

    private C3883xd1d70053(android.content.Context context, int i17) {
        this.f15469x622d82d = new com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12(context, i17);
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "Create instance:" + this.f15469x622d82d.toString());
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setRenderView */
    public synchronized int mo30161x63923b5d(android.view.TextureView textureView) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30161x63923b5d(textureView);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setRenderView */
    public synchronized int mo30160x63923b5d(android.view.SurfaceView surfaceView) {
        com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 c3800x8ae5eb12 = this.f15469x622d82d;
        if (c3800x8ae5eb12 == null) {
            return -3;
        }
        return c3800x8ae5eb12.mo30160x63923b5d(surfaceView);
    }
}
