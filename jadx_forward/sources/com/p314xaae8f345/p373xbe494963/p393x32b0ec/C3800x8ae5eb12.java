package com.p314xaae8f345.p373xbe494963.p393x32b0ec;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.live.V2TXLivePusherJni */
/* loaded from: classes16.dex */
public class C3800x8ae5eb12 extends com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 {
    private static final java.lang.String TAG = "V2TXLivePusherJni";

    /* renamed from: mAudioEffectManager */
    private com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a f14838x4b0e93f3;

    /* renamed from: mBeautyManager */
    private com.p314xaae8f345.p373xbe494963.p389xacf8107c.C3786x3af8072d f14839x9ff75c24;

    /* renamed from: mDeviceManager */
    private com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853 f14840x4a2be50a;

    /* renamed from: mNativeV2TXLivePusherJni */
    private long f14841x7c1f98ae;

    /* renamed from: mObserver */
    private com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 f14842x39c4fa63;

    /* renamed from: com.tencent.liteav.live.V2TXLivePusherJni$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128019a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f128020b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f128021c;

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f128022d;

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f128023e;

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ int[] f128024f;

        static {
            int[] iArr = new int[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.m30958xcee59d22().length];
            f128024f = iArr;
            try {
                iArr[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.TEXTURE_2D.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f128024f[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_ARRAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f128024f[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_BUFFER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.m30954xcee59d22().length];
            f128023e = iArr2;
            try {
                iArr2[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.I420.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f128023e[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.RGBA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.m31859xcee59d22().length];
            f128022d = iArr3;
            try {
                iArr3[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeTexture.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f128022d[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f128022d[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            int[] iArr4 = new int[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.m31875xcee59d22().length];
            f128021c = iArr4;
            try {
                iArr4[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatI420.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                f128021c[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            int[] iArr5 = new int[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveFillMode.m31862xcee59d22().length];
            f128020b = iArr5;
            try {
                iArr5[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveFillMode.V2TXLiveFillModeFill.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                f128020b[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveFillMode.V2TXLiveFillModeFit.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                f128020b[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveFillMode.V2TXLiveFillModeScaleFill.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            int[] iArr6 = new int[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRotation.m31884xcee59d22().length];
            f128019a = iArr6;
            try {
                iArr6[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRotation.V2TXLiveRotation90.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                f128019a[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRotation.V2TXLiveRotation180.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                f128019a[com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRotation.V2TXLiveRotation270.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
        }
    }

    public C3800x8ae5eb12(android.content.Context context, int i17) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29241x91f62b6f(context.getApplicationContext());
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29246xa5f59752("liteav");
        long m30048x73c02ff3 = m30048x73c02ff3(new java.lang.ref.WeakReference(this), i17);
        this.f14841x7c1f98ae = m30048x73c02ff3;
        this.f14838x4b0e93f3 = new com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a(m30049x3df02df9(m30048x73c02ff3));
        this.f14839x9ff75c24 = new com.p314xaae8f345.p373xbe494963.p389xacf8107c.C3786x3af8072d(m30050x3653165e(this.f14841x7c1f98ae));
        this.f14840x4a2be50a = new com.p314xaae8f345.p373xbe494963.p390xb06b1e56.C3788x3451ad13(m30051xe0879f44(this.f14841x7c1f98ae));
        if (context instanceof android.app.Activity) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.i.a().a((android.app.Activity) context);
        }
    }

    /* renamed from: getEglContextFromLiveVideoFrame */
    private static java.lang.Object m30047x932b43a3(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveTexture v2TXLiveTexture = v2TXLiveVideoFrame.f15421xab7dd51b;
        java.lang.Object obj = v2TXLiveTexture.f15395x5f488f24;
        if (obj == null) {
            obj = null;
        }
        java.lang.Object obj2 = v2TXLiveTexture.f15396x5f488f28;
        if (obj2 != null) {
            obj = obj2;
        }
        return obj == null ? android.opengl.EGL14.eglGetCurrentContext() : obj;
    }

    /* renamed from: nativeCreate */
    private static native long m30048x73c02ff3(java.lang.ref.WeakReference<com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12> weakReference, int i17);

    /* renamed from: nativeCreateAudioEffectManager */
    private static native long m30049x3df02df9(long j17);

    /* renamed from: nativeCreateBeautyManager */
    private static native long m30050x3653165e(long j17);

    /* renamed from: nativeCreateDeviceManager */
    private static native long m30051xe0879f44(long j17);

    /* renamed from: nativeDestroy */
    private static native void m30052x23caefe3(long j17);

    /* renamed from: nativeEnableAudioProcessObserver */
    private static native int m30053xef401349(long j17, boolean z17, int i17, int i18, int i19, int i27);

    /* renamed from: nativeEnableCustomAudioCapture */
    private static native int m30054xae022abb(long j17, boolean z17);

    /* renamed from: nativeEnableCustomVideoCapture */
    private static native int m30055x3ca9e76(long j17, boolean z17);

    /* renamed from: nativeEnableCustomVideoProcess */
    private static native int m30056xd067f59f(long j17, boolean z17, int i17, int i18);

    /* renamed from: nativeEnableExtensionCallback */
    private static native void m30057x9147c04a(long j17, boolean z17);

    /* renamed from: nativeEnableVoiceActivityDetection */
    private static native void m30058x25070a3e(long j17, boolean z17);

    /* renamed from: nativeEnableVolumeEvaluation */
    private static native int m30059x516df690(long j17, int i17);

    /* renamed from: nativeIsPushing */
    private static native int m30060xb6ba9ba7(long j17);

    /* renamed from: nativePauseAudio */
    private static native int m30061xe1860af7(long j17);

    /* renamed from: nativePauseVideo */
    private static native int m30062xe2a8839c(long j17);

    /* renamed from: nativeResumeAudio */
    private static native int m30063xd32f2b12(long j17);

    /* renamed from: nativeResumeVideo */
    private static native int m30064xd451a3b7(long j17);

    /* renamed from: nativeSendCustomAudioFrame */
    private static native int m30065xe31937e7(long j17, byte[] bArr, int i17, int i18, long j18);

    /* renamed from: nativeSendCustomVideoFrame */
    private static native int m30066x26515e62(long j17, int i17, int i18, int i19, int i27, int i28, int i29, java.lang.Object obj, byte[] bArr, java.nio.ByteBuffer byteBuffer);

    /* renamed from: nativeSendSeiMessage */
    private static native int m30067xc040254f(long j17, int i17, byte[] bArr);

    /* renamed from: nativeSetAudioQuality */
    private static native int m30068x4fffc4b4(long j17, int i17);

    /* renamed from: nativeSetEncoderMirror */
    private static native int m30069x56aa40f0(long j17, boolean z17);

    /* renamed from: nativeSetMixTranscodingConfig */
    private static native int m30070x6902d863(long j17, java.lang.String str);

    /* renamed from: nativeSetProperty */
    private static native int m30071x14ebafc0(long j17, java.lang.String str, java.lang.Object obj);

    /* renamed from: nativeSetRenderFillMode */
    private static native int m30072xf20b4f27(long j17, int i17);

    /* renamed from: nativeSetRenderMirror */
    private static native int m30073xa91c7560(long j17, int i17);

    /* renamed from: nativeSetRenderRotation */
    private static native int m30074x1b1c34df(long j17, int i17);

    /* renamed from: nativeSetRenderView */
    private static native int m30075x71e3886(long j17, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3 c3826xc46e8cd3);

    /* renamed from: nativeSetVideoQuality */
    private static native int m30076xa5c8386f(long j17, int i17, int i18, int i19, int i27, int i28);

    /* renamed from: nativeSetWatermark */
    private static native int m30077xa6e3d3d9(long j17, android.graphics.Bitmap bitmap, float f17, float f18, float f19);

    /* renamed from: nativeShowDebugView */
    private static native void m30078x71823244(long j17, boolean z17);

    /* renamed from: nativeSnapshot */
    private static native int m30079x28ed82fb(long j17);

    /* renamed from: nativeStartCamera */
    private static native int m30080x4df45590(long j17, boolean z17);

    /* renamed from: nativeStartMicrophone */
    private static native int m30081xb37bfe15(long j17);

    /* renamed from: nativeStartPush */
    private static native int m30082x6776e045(long j17, java.lang.String str);

    /* renamed from: nativeStartRecord */
    private static native int m30083x67c0febc(long j17, java.lang.String str, int i17, int i18);

    /* renamed from: nativeStartScreenCapture */
    private static native int m30084x2d447c6f(long j17);

    /* renamed from: nativeStartSystemAudioLoopback */
    private static native int m30085x5c609907(long j17);

    /* renamed from: nativeStartVirtualCamera */
    private static native int m30086xb9f40945(long j17, android.graphics.Bitmap bitmap);

    /* renamed from: nativeStopCamera */
    private static native int m30087x7937693e(long j17);

    /* renamed from: nativeStopMicrophone */
    private static native int m30088x9a918ac3(long j17);

    /* renamed from: nativeStopPush */
    private static native int m30089x7e270773(long j17);

    /* renamed from: nativeStopRecord */
    private static native void m30090x9304126a(long j17);

    /* renamed from: nativeStopScreenCapture */
    private static native int m30091xb2028901(long j17);

    /* renamed from: nativeStopSystemAudioLoopback */
    private static native int m30092xd0b37019(long j17);

    /* renamed from: nativeStopVirtualCamera */
    private static native int m30093x3eb215d7(long j17);

    /* renamed from: weakToStrongReference */
    public static com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12 m30094x259965e1(java.lang.ref.WeakReference<com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12> weakReference) {
        return weakReference.get();
    }

    /* renamed from: createV2TXLiveVideoFrame */
    public com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame m30095x6322dbfa(int i17, int i18, int i19, int i27, int i28, int i29, java.lang.Object obj, byte[] bArr, java.nio.ByteBuffer byteBuffer) {
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame = new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame();
        int i37 = com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12.AnonymousClass1.f128023e[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.a(i27).ordinal()];
        if (i37 == 1) {
            v2TXLiveVideoFrame.f15419xa0fe3a1d = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        } else {
            if (i37 != 2) {
                return null;
            }
            v2TXLiveVideoFrame.f15419xa0fe3a1d = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D;
        }
        int i38 = com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12.AnonymousClass1.f128024f[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.a(i19).ordinal()];
        if (i38 == 1) {
            v2TXLiveVideoFrame.f15416x719f779a = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeTexture;
            com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveTexture v2TXLiveTexture = new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveTexture();
            v2TXLiveVideoFrame.f15421xab7dd51b = v2TXLiveTexture;
            v2TXLiveTexture.f15397xc35d0396 = i29;
            if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
                v2TXLiveTexture.f15395x5f488f24 = (javax.microedition.khronos.egl.EGLContext) obj;
            } else if (obj instanceof android.opengl.EGLContext) {
                v2TXLiveTexture.f15396x5f488f28 = (android.opengl.EGLContext) obj;
            }
        } else if (i38 == 2) {
            v2TXLiveVideoFrame.f15416x719f779a = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray;
            v2TXLiveVideoFrame.f15417x2eefaa = bArr;
        } else {
            if (i38 != 3) {
                return null;
            }
            v2TXLiveVideoFrame.f15416x719f779a = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer;
            v2TXLiveVideoFrame.f15415xaddb9440 = byteBuffer;
        }
        v2TXLiveVideoFrame.f15422x6be2dc6 = i17;
        v2TXLiveVideoFrame.f15418xb7389127 = i18;
        v2TXLiveVideoFrame.f15420xfd990f7e = i28;
        return v2TXLiveVideoFrame;
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: enableAudioProcessObserver */
    public int mo30096xdc23a5d2(boolean z17, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        if (v2TXLiveAudioFrameObserverFormat == null) {
            return -2;
        }
        return m30053xef401349(this.f14841x7c1f98ae, z17, v2TXLiveAudioFrameObserverFormat.f15301x88751aa, v2TXLiveAudioFrameObserverFormat.f15299x2c0b7d03, v2TXLiveAudioFrameObserverFormat.f15302xb3cdb4d2, v2TXLiveAudioFrameObserverFormat.f15300x3339a3.ordinal());
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: enableCustomAudioCapture */
    public int mo30097x9a8acb84(boolean z17) {
        return m30054xae022abb(this.f14841x7c1f98ae, z17);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: enableCustomVideoCapture */
    public int mo30098xf0533f3f(boolean z17) {
        return m30055x3ca9e76(this.f14841x7c1f98ae, z17);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: enableCustomVideoProcess */
    public int mo30099xbcf09668(boolean z17, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat v2TXLivePixelFormat, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType v2TXLiveBufferType) {
        if (!z17) {
            return m30056xd067f59f(this.f14841x7c1f98ae, z17, v2TXLivePixelFormat.ordinal(), v2TXLiveBufferType.ordinal());
        }
        boolean z18 = true;
        if ((v2TXLiveBufferType != com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer || v2TXLivePixelFormat != com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatI420) && (v2TXLiveBufferType != com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeTexture || v2TXLivePixelFormat != com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D)) {
            z18 = false;
        }
        if (z18) {
            return m30056xd067f59f(this.f14841x7c1f98ae, z17, v2TXLivePixelFormat.ordinal(), v2TXLiveBufferType.ordinal());
        }
        return -4;
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: enableVoiceActivityDetection */
    public void mo30100x67501e87(boolean z17) {
        m30058x25070a3e(this.f14841x7c1f98ae, z17);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: enableVolumeEvaluation */
    public int mo30101x740a3599(int i17) {
        return m30059x516df690(this.f14841x7c1f98ae, i17);
    }

    /* renamed from: finalize */
    public void m30102xd764dc1e() {
        super.finalize();
        mo30146x41012807();
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: getAudioEffectManager */
    public com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a mo30103x5f1b9a9c() {
        return this.f14838x4b0e93f3;
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: getBeautyManager */
    public com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d mo30104x2490fdb() {
        return this.f14839x9ff75c24;
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: getDeviceManager */
    public com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853 mo30105xac7d98c1() {
        return this.f14840x4a2be50a;
    }

    /* renamed from: getFrameBufferType */
    public int m30106x9386aab1(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a aVar = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_BUFFER;
        int i17 = com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12.AnonymousClass1.f128022d[v2TXLiveVideoFrame.f15416x719f779a.ordinal()];
        if (i17 == 1) {
            aVar = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.TEXTURE_2D;
        } else if (i17 == 2) {
            aVar = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_ARRAY;
        }
        return aVar.f14885xbee9dd04;
    }

    /* renamed from: getFrameByteArray */
    public byte[] m30107xcf81143a(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.f15417x2eefaa;
    }

    /* renamed from: getFrameByteBuffer */
    public java.nio.ByteBuffer m30108x227b2e7f(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.f15415xaddb9440;
    }

    /* renamed from: getFrameEglContext */
    public java.lang.Object m30109x9958395c(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveTexture v2TXLiveTexture;
        if (v2TXLiveVideoFrame == null || (v2TXLiveTexture = v2TXLiveVideoFrame.f15421xab7dd51b) == null) {
            return null;
        }
        javax.microedition.khronos.egl.EGLContext eGLContext = v2TXLiveTexture.f15395x5f488f24;
        javax.microedition.khronos.egl.EGLContext eGLContext2 = eGLContext != null ? eGLContext : null;
        android.opengl.EGLContext eGLContext3 = v2TXLiveTexture.f15396x5f488f28;
        return eGLContext3 != null ? eGLContext3 : eGLContext2;
    }

    /* renamed from: getFrameHeight */
    public int m30110xbdeae7be(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.f15418xb7389127;
    }

    /* renamed from: getFramePixelFormat */
    public int m30111xbbfd69e6(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType pixelFormatType = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.I420;
        int i17 = com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12.AnonymousClass1.f128021c[v2TXLiveVideoFrame.f15419xa0fe3a1d.ordinal()];
        if (i17 != 1 && i17 == 2) {
            pixelFormatType = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.RGBA;
        }
        return pixelFormatType.m30955x754a37bb();
    }

    /* renamed from: getFrameRotation */
    public int m30112x21101c55(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.f15420xfd990f7e;
    }

    /* renamed from: getFrameTextureId */
    public int m30113xec7919f(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveTexture v2TXLiveTexture;
        if (v2TXLiveVideoFrame == null || (v2TXLiveTexture = v2TXLiveVideoFrame.f15421xab7dd51b) == null) {
            return -1;
        }
        return v2TXLiveTexture.f15397xc35d0396;
    }

    /* renamed from: getFrameWidth */
    public int m30114xddab284f(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.f15422x6be2dc6;
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: isPushing */
    public int mo30115xd057a1fe() {
        return m30060xb6ba9ba7(this.f14841x7c1f98ae);
    }

    /* renamed from: onCaptureFirstAudioFrame */
    public void m30116x94595aa0() {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 != null) {
            abstractC3879x413c9f89.mo31809x94595aa0();
        }
    }

    /* renamed from: onCaptureFirstVideoFrame */
    public void m30117xd791811b() {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 != null) {
            abstractC3879x413c9f89.mo31810xd791811b();
        }
    }

    /* renamed from: onCustomPreprocessFrame */
    public int m30118xd4d3ce11(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame, com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame2) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 != null) {
            return abstractC3879x413c9f89.mo31815x20bf0162(v2TXLiveVideoFrame, v2TXLiveVideoFrame2);
        }
        return -1;
    }

    /* renamed from: onEnterRoom */
    public void m30119xcb050cb4(int i17, java.lang.String str) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 == null || !(abstractC3879x413c9f89 instanceof com.p314xaae8f345.p420x6236cc6.p421x316220.a.b)) {
            return;
        }
        ((com.p314xaae8f345.p420x6236cc6.p421x316220.a.b) abstractC3879x413c9f89).mo31929xcb050cb4(i17);
    }

    /* renamed from: onError */
    public void m30120xaf8aa769(int i17, java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 != null) {
            abstractC3879x413c9f89.mo31811xaf8aa769(i17, str, bundle);
        }
    }

    /* renamed from: onExitRoom */
    public void m30121x26931218(int i17, java.lang.String str) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 == null || !(abstractC3879x413c9f89 instanceof com.p314xaae8f345.p420x6236cc6.p421x316220.a.b)) {
            return;
        }
        ((com.p314xaae8f345.p420x6236cc6.p421x316220.a.b) abstractC3879x413c9f89).mo31930x26931218(i17);
    }

    /* renamed from: onGLContextCreated */
    public void m30122x2453e5d() {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 != null) {
            abstractC3879x413c9f89.mo31812x2453e5d();
        }
    }

    /* renamed from: onGLContextDestroyed */
    public void m30123xd8b04c4e() {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 != null) {
            abstractC3879x413c9f89.mo31813xd8b04c4e();
        }
    }

    /* renamed from: onMicrophoneVolumeUpdate */
    public void m30124xde91c78c(int i17) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 != null) {
            abstractC3879x413c9f89.mo31814xde91c78c(i17);
        }
    }

    /* renamed from: onNetworkQuality */
    public void m30125xf01276b0(int i17) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 == null || !(abstractC3879x413c9f89 instanceof com.p314xaae8f345.p420x6236cc6.p421x316220.a.b)) {
            return;
        }
        ((com.p314xaae8f345.p420x6236cc6.p421x316220.a.b) abstractC3879x413c9f89).mo31931xf01276b0(i17);
    }

    /* renamed from: onProcessAudioFrame */
    public void m30126xdd86dae7(byte[] bArr, long j17, int i17, int i18) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 == null) {
            return;
        }
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrame v2TXLiveAudioFrame = new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.f15296x2eefaa = bArr;
        v2TXLiveAudioFrame.f15297x88751aa = i17;
        v2TXLiveAudioFrame.f15295x2c0b7d03 = i18;
        v2TXLiveAudioFrame.f15298x3492916 = j17;
        abstractC3879x413c9f89.m31915xdd86dae7(v2TXLiveAudioFrame);
    }

    /* renamed from: onPushEvent */
    public void m30127xceec7081(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 == null || !(abstractC3879x413c9f89 instanceof com.p314xaae8f345.p420x6236cc6.p421x316220.a.b)) {
            return;
        }
        ((com.p314xaae8f345.p420x6236cc6.p421x316220.a.b) abstractC3879x413c9f89).mo31932xceec7081(i17, bundle);
    }

    /* renamed from: onPushNetStatus */
    public void m30128xe65aae56(android.os.Bundle bundle) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 == null || !(abstractC3879x413c9f89 instanceof com.p314xaae8f345.p420x6236cc6.p421x316220.a.b)) {
            return;
        }
        ((com.p314xaae8f345.p420x6236cc6.p421x316220.a.b) abstractC3879x413c9f89).mo31933xe65aae56(bundle);
    }

    /* renamed from: onPushStatusUpdate */
    public void m30129x58c29794(int i17, java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePushStatus v2TXLivePushStatus = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePushStatus.V2TXLivePushStatusDisconnected;
        if (i17 == 0) {
            v2TXLivePushStatus = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePushStatus.V2TXLivePushStatusConnecting;
            str = "connecting to the server.";
        } else if (i17 == 1) {
            v2TXLivePushStatus = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePushStatus.V2TXLivePushStatusConnectSuccess;
            str = "connected to the server successfully.";
        } else if (i17 == 2) {
            v2TXLivePushStatus = com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePushStatus.V2TXLivePushStatusReconnecting;
            str = "reconnecting to the server.";
        } else if (i17 == 3) {
            str = "disconnected from the server.";
        }
        if (abstractC3879x413c9f89 != null) {
            abstractC3879x413c9f89.mo31816x58c29794(v2TXLivePushStatus, str, bundle);
        }
    }

    /* renamed from: onRecordBegin */
    public void m30130x6975af79(int i17, java.lang.String str) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 != null) {
            abstractC3879x413c9f89.m31912x795c626c(i17, str);
        }
    }

    /* renamed from: onRecordComplete */
    public void m30131xf9aec869(int i17, java.lang.String str) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 != null) {
            abstractC3879x413c9f89.m31913x69614c96(i17, str);
        }
    }

    /* renamed from: onRecordProgress */
    public void m30132xe1be595d(long j17, java.lang.String str) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 != null) {
            abstractC3879x413c9f89.m31914x92f8e85(j17, str);
        }
    }

    /* renamed from: onScreenCaptureStarted */
    public void m30133x42f07266() {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 != null) {
            abstractC3879x413c9f89.mo31817x42f07266();
        }
    }

    /* renamed from: onScreenCaptureStoped */
    public void m30134xc01e999c(int i17) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 != null) {
            abstractC3879x413c9f89.mo31818x43b4c3b2(i17);
        }
    }

    /* renamed from: onSetMixTranscodingConfig */
    public void m30135xed58199b(int i17, java.lang.String str) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 != null) {
            abstractC3879x413c9f89.mo31819xed58199b(i17, str);
        }
    }

    /* renamed from: onSnapshotComplete */
    public void m30136x7ddd1b1c(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 != null) {
            abstractC3879x413c9f89.mo31820x7ddd1b1c(bitmap);
        }
    }

    /* renamed from: onStatisticsUpdate */
    public void m30137x7935e3cb(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 != null) {
            com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePusherStatistics v2TXLivePusherStatistics = new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLivePusherStatistics();
            v2TXLivePusherStatistics.f15374xabe44fc7 = i17;
            v2TXLivePusherStatistics.f15378x434cb4f9 = i18;
            v2TXLivePusherStatistics.f15380x6be2dc6 = i19;
            v2TXLivePusherStatistics.f15376xb7389127 = i27;
            v2TXLivePusherStatistics.fps = i28;
            v2TXLivePusherStatistics.f15379xf1220e72 = i29;
            v2TXLivePusherStatistics.f15375x9b599ab7 = i37;
            v2TXLivePusherStatistics.rtt = i38;
            v2TXLivePusherStatistics.f15377x4c4ee0aa = i39;
            abstractC3879x413c9f89.mo31821x7935e3cb(v2TXLivePusherStatistics);
        }
    }

    /* renamed from: onUserAudioAvailable */
    public void m30138xf752687d(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 == null || !(abstractC3879x413c9f89 instanceof com.p314xaae8f345.p420x6236cc6.p421x316220.a.b)) {
            return;
        }
        ((com.p314xaae8f345.p420x6236cc6.p421x316220.a.b) abstractC3879x413c9f89).mo31936xf752687d(str, z17);
    }

    /* renamed from: onUserOffline */
    public void m30139xae427839(java.lang.String str) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 == null || !(abstractC3879x413c9f89 instanceof com.p314xaae8f345.p420x6236cc6.p421x316220.a.b)) {
            return;
        }
        ((com.p314xaae8f345.p420x6236cc6.p421x316220.a.b) abstractC3879x413c9f89).mo31935xd74899ae(str, 0);
    }

    /* renamed from: onUserOnline */
    public void m30140x1ed8a93d(java.lang.String str) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 == null || !(abstractC3879x413c9f89 instanceof com.p314xaae8f345.p420x6236cc6.p421x316220.a.b)) {
            return;
        }
        ((com.p314xaae8f345.p420x6236cc6.p421x316220.a.b) abstractC3879x413c9f89).mo31934x11c63848(str);
    }

    /* renamed from: onUserVideoAvailable */
    public void m30141xfcccd978(java.lang.String str, int i17, boolean z17) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 == null || !(abstractC3879x413c9f89 instanceof com.p314xaae8f345.p420x6236cc6.p421x316220.a.b)) {
            return;
        }
        ((com.p314xaae8f345.p420x6236cc6.p421x316220.a.b) abstractC3879x413c9f89).mo31937xfcccd978(str, i17, z17);
    }

    /* renamed from: onVoiceActivityDetectionUpdate */
    public void m30142xcd45088c(boolean z17) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 != null) {
            abstractC3879x413c9f89.m31916xcd45088c(z17);
        }
    }

    /* renamed from: onWarning */
    public void m30143x92abb0bd(int i17, java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89 = this.f14842x39c4fa63;
        if (abstractC3879x413c9f89 != null) {
            abstractC3879x413c9f89.mo31822x92abb0bd(i17, str, bundle);
        }
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: pauseAudio */
    public int mo30144xfb89cf80() {
        return m30061xe1860af7(this.f14841x7c1f98ae);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: pauseVideo */
    public int mo30145xfcac4825() {
        return m30062xe2a8839c(this.f14841x7c1f98ae);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: release */
    public void mo30146x41012807() {
        com.p314xaae8f345.p373xbe494963.p389xacf8107c.C3786x3af8072d c3786x3af8072d = this.f14839x9ff75c24;
        if (c3786x3af8072d != null) {
            c3786x3af8072d.m29653x5a5b64d();
        }
        long j17 = this.f14841x7c1f98ae;
        if (j17 != 0) {
            m30052x23caefe3(j17);
            this.f14841x7c1f98ae = 0L;
        }
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: resumeAudio */
    public int mo30147xf9a3f7a9() {
        return m30063xd32f2b12(this.f14841x7c1f98ae);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: resumeVideo */
    public int mo30148xfac6704e() {
        return m30064xd451a3b7(this.f14841x7c1f98ae);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: sendCustomAudioFrame */
    public int mo30149x5c9ba530(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
        if (v2TXLiveAudioFrame == null) {
            return -2;
        }
        return m30065xe31937e7(this.f14841x7c1f98ae, v2TXLiveAudioFrame.f15296x2eefaa, v2TXLiveAudioFrame.f15297x88751aa, v2TXLiveAudioFrame.f15295x2c0b7d03, v2TXLiveAudioFrame.f15298x3492916);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: sendCustomVideoFrame */
    public int mo30150x9fd3cbab(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType pixelFormatType;
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a aVar;
        java.lang.Object m30047x932b43a3;
        if (v2TXLiveVideoFrame == null) {
            return -2;
        }
        int i17 = com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12.AnonymousClass1.f128021c[v2TXLiveVideoFrame.f15419xa0fe3a1d.ordinal()];
        int i18 = -1;
        if (i17 == 1) {
            pixelFormatType = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.I420;
        } else {
            if (i17 != 2) {
                return -1;
            }
            pixelFormatType = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.RGBA;
        }
        int i19 = com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12.AnonymousClass1.f128022d[v2TXLiveVideoFrame.f15416x719f779a.ordinal()];
        if (i19 != 1) {
            m30047x932b43a3 = null;
            if (i19 == 2) {
                aVar = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_ARRAY;
            } else {
                if (i19 != 3) {
                    return -1;
                }
                aVar = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_BUFFER;
            }
        } else {
            aVar = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.TEXTURE_2D;
            com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveTexture v2TXLiveTexture = v2TXLiveVideoFrame.f15421xab7dd51b;
            if (v2TXLiveTexture == null) {
                return -1;
            }
            i18 = v2TXLiveTexture.f15397xc35d0396;
            m30047x932b43a3 = m30047x932b43a3(v2TXLiveVideoFrame);
        }
        return m30066x26515e62(this.f14841x7c1f98ae, v2TXLiveVideoFrame.f15422x6be2dc6, v2TXLiveVideoFrame.f15418xb7389127, aVar.f14885xbee9dd04, pixelFormatType.m30955x754a37bb(), v2TXLiveVideoFrame.f15420xfd990f7e, i18, m30047x932b43a3, v2TXLiveVideoFrame.f15417x2eefaa, v2TXLiveVideoFrame.f15415xaddb9440);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: sendSeiMessage */
    public int mo30151xf24c7d58(int i17, byte[] bArr) {
        return m30067xc040254f(this.f14841x7c1f98ae, i17, bArr);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setAudioQuality */
    public int mo30152x5f7e6dcb(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveAudioQuality v2TXLiveAudioQuality) {
        return m30068x4fffc4b4(this.f14841x7c1f98ae, v2TXLiveAudioQuality.ordinal());
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setEncoderMirror */
    public int mo30153x3700bab9(boolean z17) {
        return m30069x56aa40f0(this.f14841x7c1f98ae, z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v2, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setMixTranscodingConfig */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo30154x99ee7a7a(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveTranscodingConfig r9) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12.mo30154x99ee7a7a(com.tencent.live2.V2TXLiveDef$V2TXLiveTranscodingConfig):int");
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setObserver */
    public void mo30155x8b59f158(com.p314xaae8f345.p420x6236cc6.AbstractC3879x413c9f89 abstractC3879x413c9f89) {
        this.f14842x39c4fa63 = abstractC3879x413c9f89;
        if (abstractC3879x413c9f89 == null || !(abstractC3879x413c9f89 instanceof com.p314xaae8f345.p420x6236cc6.p421x316220.a.b)) {
            return;
        }
        m30057x9147c04a(this.f14841x7c1f98ae, true);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setProperty */
    public int mo30156x3b607c57(java.lang.String str, java.lang.Object obj) {
        str.getClass();
        if (str.equals(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15458xebbebcb3)) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "set surface size is unnecessary");
            return 0;
        }
        if (!str.equals(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15457x14b68192)) {
            return m30071x14ebafc0(this.f14841x7c1f98ae, str, obj);
        }
        if (obj == null) {
            m30075x71e3886(this.f14841x7c1f98ae, null);
            return 0;
        }
        if (obj instanceof android.view.Surface) {
            m30075x71e3886(this.f14841x7c1f98ae, new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3((android.view.Surface) obj));
            return 0;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "setProperty error, key:" + str + ", value:" + obj);
        return -2;
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setRenderFillMode */
    public int mo30157x1c840e7e(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveFillMode v2TXLiveFillMode) {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType gLScaleType = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.CENTER_CROP;
        int i17 = com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12.AnonymousClass1.f128020b[v2TXLiveFillMode.ordinal()];
        if (i17 != 1) {
            if (i17 == 2) {
                gLScaleType = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.FIT_CENTER;
            } else if (i17 == 3) {
                gLScaleType = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.FILL;
            }
        }
        return m30072xf20b4f27(this.f14841x7c1f98ae, gLScaleType.f14883xbee9dd04);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setRenderMirror */
    public int mo30158xb89b1e77(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveMirrorType v2TXLiveMirrorType) {
        return m30073xa91c7560(this.f14841x7c1f98ae, v2TXLiveMirrorType.ordinal());
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setRenderRotation */
    public int mo30159x4594f436(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveRotation v2TXLiveRotation) {
        int i17 = com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3800x8ae5eb12.AnonymousClass1.f128019a[v2TXLiveRotation.ordinal()];
        return m30074x1b1c34df(this.f14841x7c1f98ae, (i17 != 1 ? i17 != 2 ? i17 != 3 ? com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270 : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_180 : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90).f14773xbee9dd04);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setRenderView */
    public int mo30162x63923b5d(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        return m30075x71e3886(this.f14841x7c1f98ae, new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf));
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setVideoQuality */
    public int mo30163xb546e186(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoEncoderParam v2TXLiveVideoEncoderParam) {
        if (v2TXLiveVideoEncoderParam == null) {
            return -2;
        }
        return m30076xa5c8386f(this.f14841x7c1f98ae, v2TXLiveVideoEncoderParam.f15413xe9fc4b87.ordinal(), v2TXLiveVideoEncoderParam.f15414xb471ddca.ordinal(), v2TXLiveVideoEncoderParam.f15412x44a06a6e, v2TXLiveVideoEncoderParam.f15411xf1220e72, v2TXLiveVideoEncoderParam.f15410x5d9e1de4);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setWatermark */
    public int mo30164x4f089a22(android.graphics.Bitmap bitmap, float f17, float f18, float f19) {
        return m30077xa6e3d3d9(this.f14841x7c1f98ae, bitmap, f17, f18, f19);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: showDebugView */
    public void mo30165xcdf6351b(boolean z17) {
        m30078x71823244(this.f14841x7c1f98ae, z17);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: snapshot */
    public int mo30166x10fad5c4() {
        return m30079x28ed82fb(this.f14841x7c1f98ae);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: startCamera */
    public int mo30167x74692227(boolean z17) {
        return m30080x4df45590(this.f14841x7c1f98ae, z17);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: startLocalRecording */
    public int mo30168xcf0b23c8(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveLocalRecordingParams v2TXLiveLocalRecordingParams) {
        if (v2TXLiveLocalRecordingParams == null || android.text.TextUtils.isEmpty(v2TXLiveLocalRecordingParams.f15319xd426afc1)) {
            return -2;
        }
        return m30083x67c0febc(this.f14841x7c1f98ae, v2TXLiveLocalRecordingParams.f15319xd426afc1, v2TXLiveLocalRecordingParams.f15321x2bca8994.ordinal(), v2TXLiveLocalRecordingParams.f15320x21ffe4c5);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: startMicrophone */
    public int mo30169xc2faa72c() {
        return m30081xb37bfe15(this.f14841x7c1f98ae);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: startPush */
    public int mo30170x8113e69c(java.lang.String str) {
        return m30082x6776e045(this.f14841x7c1f98ae, str);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: startScreenCapture */
    public int mo30171x51e3a7f8() {
        return m30084x2d447c6f(this.f14841x7c1f98ae);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: startSystemAudioLoopback */
    public int mo30172x48e939d0() {
        return m30085x5c609907(this.f14841x7c1f98ae);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: startVirtualCamera */
    public int mo30173xde9334ce(android.graphics.Bitmap bitmap) {
        return m30086xb9f40945(this.f14841x7c1f98ae, bitmap);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: stopCamera */
    public int mo30174x933b2dc7() {
        return m30087x7937693e(this.f14841x7c1f98ae);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: stopLocalRecording */
    public void mo30175x97678f68() {
        m30090x9304126a(this.f14841x7c1f98ae);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: stopMicrophone */
    public int mo30176xcc9de2cc() {
        return m30088x9a918ac3(this.f14841x7c1f98ae);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: stopPush */
    public int mo30177x66345a3c() {
        return m30089x7e270773(this.f14841x7c1f98ae);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: stopScreenCapture */
    public int mo30178xdc7b4858() {
        return m30091xb2028901(this.f14841x7c1f98ae);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: stopSystemAudioLoopback */
    public int mo30179x19f1230() {
        return m30092xd0b37019(this.f14841x7c1f98ae);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: stopVirtualCamera */
    public int mo30180x692ad52e() {
        return m30093x3eb215d7(this.f14841x7c1f98ae);
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setRenderView */
    public int mo30161x63923b5d(android.view.TextureView textureView) {
        return m30075x71e3886(this.f14841x7c1f98ae, new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3(textureView));
    }

    @Override // com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93
    /* renamed from: setRenderView */
    public int mo30160x63923b5d(android.view.SurfaceView surfaceView) {
        return m30075x71e3886(this.f14841x7c1f98ae, new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3(surfaceView));
    }
}
