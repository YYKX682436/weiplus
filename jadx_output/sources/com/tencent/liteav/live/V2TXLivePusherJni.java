package com.tencent.liteav.live;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes16.dex */
public class V2TXLivePusherJni extends com.tencent.live2.V2TXLivePusher {
    private static final java.lang.String TAG = "V2TXLivePusherJni";
    private com.tencent.liteav.audio.TXAudioEffectManager mAudioEffectManager;
    private com.tencent.liteav.beauty.TXBeautyManagerImpl mBeautyManager;
    private com.tencent.liteav.device.TXDeviceManager mDeviceManager;
    private long mNativeV2TXLivePusherJni;
    private com.tencent.live2.V2TXLivePusherObserver mObserver;

    /* renamed from: com.tencent.liteav.live.V2TXLivePusherJni$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46486a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f46487b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f46488c;

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f46489d;

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f46490e;

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ int[] f46491f;

        static {
            int[] iArr = new int[com.tencent.liteav.videobase.base.GLConstants.a.values().length];
            f46491f = iArr;
            try {
                iArr[com.tencent.liteav.videobase.base.GLConstants.a.TEXTURE_2D.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f46491f[com.tencent.liteav.videobase.base.GLConstants.a.BYTE_ARRAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f46491f[com.tencent.liteav.videobase.base.GLConstants.a.BYTE_BUFFER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.values().length];
            f46490e = iArr2;
            try {
                iArr2[com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.I420.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f46490e[com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.values().length];
            f46489d = iArr3;
            try {
                iArr3[com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f46489d[com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f46489d[com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            int[] iArr4 = new int[com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.values().length];
            f46488c = iArr4;
            try {
                iArr4[com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                f46488c[com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            int[] iArr5 = new int[com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode.values().length];
            f46487b = iArr5;
            try {
                iArr5[com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFill.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                f46487b[com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFit.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                f46487b[com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeScaleFill.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            int[] iArr6 = new int[com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.values().length];
            f46486a = iArr6;
            try {
                iArr6[com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation90.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                f46486a[com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation180.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                f46486a[com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation270.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
        }
    }

    public V2TXLivePusherJni(android.content.Context context, int i17) {
        com.tencent.liteav.base.ContextUtils.initApplicationContext(context.getApplicationContext());
        com.tencent.liteav.base.ContextUtils.setDataDirectorySuffix("liteav");
        long nativeCreate = nativeCreate(new java.lang.ref.WeakReference(this), i17);
        this.mNativeV2TXLivePusherJni = nativeCreate;
        this.mAudioEffectManager = new com.tencent.liteav.audio.TXAudioEffectManagerImpl(nativeCreateAudioEffectManager(nativeCreate));
        this.mBeautyManager = new com.tencent.liteav.beauty.TXBeautyManagerImpl(nativeCreateBeautyManager(this.mNativeV2TXLivePusherJni));
        this.mDeviceManager = new com.tencent.liteav.device.TXDeviceManagerImpl(nativeCreateDeviceManager(this.mNativeV2TXLivePusherJni));
        if (context instanceof android.app.Activity) {
            com.tencent.liteav.base.util.i.a().a((android.app.Activity) context);
        }
    }

    private static java.lang.Object getEglContextFromLiveVideoFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        com.tencent.live2.V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = v2TXLiveVideoFrame.texture;
        java.lang.Object obj = v2TXLiveTexture.eglContext10;
        if (obj == null) {
            obj = null;
        }
        java.lang.Object obj2 = v2TXLiveTexture.eglContext14;
        if (obj2 != null) {
            obj = obj2;
        }
        return obj == null ? android.opengl.EGL14.eglGetCurrentContext() : obj;
    }

    private static native long nativeCreate(java.lang.ref.WeakReference<com.tencent.liteav.live.V2TXLivePusherJni> weakReference, int i17);

    private static native long nativeCreateAudioEffectManager(long j17);

    private static native long nativeCreateBeautyManager(long j17);

    private static native long nativeCreateDeviceManager(long j17);

    private static native void nativeDestroy(long j17);

    private static native int nativeEnableAudioProcessObserver(long j17, boolean z17, int i17, int i18, int i19, int i27);

    private static native int nativeEnableCustomAudioCapture(long j17, boolean z17);

    private static native int nativeEnableCustomVideoCapture(long j17, boolean z17);

    private static native int nativeEnableCustomVideoProcess(long j17, boolean z17, int i17, int i18);

    private static native void nativeEnableExtensionCallback(long j17, boolean z17);

    private static native void nativeEnableVoiceActivityDetection(long j17, boolean z17);

    private static native int nativeEnableVolumeEvaluation(long j17, int i17);

    private static native int nativeIsPushing(long j17);

    private static native int nativePauseAudio(long j17);

    private static native int nativePauseVideo(long j17);

    private static native int nativeResumeAudio(long j17);

    private static native int nativeResumeVideo(long j17);

    private static native int nativeSendCustomAudioFrame(long j17, byte[] bArr, int i17, int i18, long j18);

    private static native int nativeSendCustomVideoFrame(long j17, int i17, int i18, int i19, int i27, int i28, int i29, java.lang.Object obj, byte[] bArr, java.nio.ByteBuffer byteBuffer);

    private static native int nativeSendSeiMessage(long j17, int i17, byte[] bArr);

    private static native int nativeSetAudioQuality(long j17, int i17);

    private static native int nativeSetEncoderMirror(long j17, boolean z17);

    private static native int nativeSetMixTranscodingConfig(long j17, java.lang.String str);

    private static native int nativeSetProperty(long j17, java.lang.String str, java.lang.Object obj);

    private static native int nativeSetRenderFillMode(long j17, int i17);

    private static native int nativeSetRenderMirror(long j17, int i17);

    private static native int nativeSetRenderRotation(long j17, int i17);

    private static native int nativeSetRenderView(long j17, com.tencent.liteav.videobase.videobase.DisplayTarget displayTarget);

    private static native int nativeSetVideoQuality(long j17, int i17, int i18, int i19, int i27, int i28);

    private static native int nativeSetWatermark(long j17, android.graphics.Bitmap bitmap, float f17, float f18, float f19);

    private static native void nativeShowDebugView(long j17, boolean z17);

    private static native int nativeSnapshot(long j17);

    private static native int nativeStartCamera(long j17, boolean z17);

    private static native int nativeStartMicrophone(long j17);

    private static native int nativeStartPush(long j17, java.lang.String str);

    private static native int nativeStartRecord(long j17, java.lang.String str, int i17, int i18);

    private static native int nativeStartScreenCapture(long j17);

    private static native int nativeStartSystemAudioLoopback(long j17);

    private static native int nativeStartVirtualCamera(long j17, android.graphics.Bitmap bitmap);

    private static native int nativeStopCamera(long j17);

    private static native int nativeStopMicrophone(long j17);

    private static native int nativeStopPush(long j17);

    private static native void nativeStopRecord(long j17);

    private static native int nativeStopScreenCapture(long j17);

    private static native int nativeStopSystemAudioLoopback(long j17);

    private static native int nativeStopVirtualCamera(long j17);

    public static com.tencent.liteav.live.V2TXLivePusherJni weakToStrongReference(java.lang.ref.WeakReference<com.tencent.liteav.live.V2TXLivePusherJni> weakReference) {
        return weakReference.get();
    }

    public com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame createV2TXLiveVideoFrame(int i17, int i18, int i19, int i27, int i28, int i29, java.lang.Object obj, byte[] bArr, java.nio.ByteBuffer byteBuffer) {
        com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame = new com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame();
        int i37 = com.tencent.liteav.live.V2TXLivePusherJni.AnonymousClass1.f46490e[com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.a(i27).ordinal()];
        if (i37 == 1) {
            v2TXLiveVideoFrame.pixelFormat = com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        } else {
            if (i37 != 2) {
                return null;
            }
            v2TXLiveVideoFrame.pixelFormat = com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D;
        }
        int i38 = com.tencent.liteav.live.V2TXLivePusherJni.AnonymousClass1.f46491f[com.tencent.liteav.videobase.base.GLConstants.a.a(i19).ordinal()];
        if (i38 == 1) {
            v2TXLiveVideoFrame.bufferType = com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture;
            com.tencent.live2.V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = new com.tencent.live2.V2TXLiveDef.V2TXLiveTexture();
            v2TXLiveVideoFrame.texture = v2TXLiveTexture;
            v2TXLiveTexture.textureId = i29;
            if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
                v2TXLiveTexture.eglContext10 = (javax.microedition.khronos.egl.EGLContext) obj;
            } else if (obj instanceof android.opengl.EGLContext) {
                v2TXLiveTexture.eglContext14 = (android.opengl.EGLContext) obj;
            }
        } else if (i38 == 2) {
            v2TXLiveVideoFrame.bufferType = com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray;
            v2TXLiveVideoFrame.data = bArr;
        } else {
            if (i38 != 3) {
                return null;
            }
            v2TXLiveVideoFrame.bufferType = com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer;
            v2TXLiveVideoFrame.buffer = byteBuffer;
        }
        v2TXLiveVideoFrame.width = i17;
        v2TXLiveVideoFrame.height = i18;
        v2TXLiveVideoFrame.rotation = i28;
        return v2TXLiveVideoFrame;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableAudioProcessObserver(boolean z17, com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        if (v2TXLiveAudioFrameObserverFormat == null) {
            return -2;
        }
        return nativeEnableAudioProcessObserver(this.mNativeV2TXLivePusherJni, z17, v2TXLiveAudioFrameObserverFormat.sampleRate, v2TXLiveAudioFrameObserverFormat.channel, v2TXLiveAudioFrameObserverFormat.samplesPerCall, v2TXLiveAudioFrameObserverFormat.mode.ordinal());
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableCustomAudioCapture(boolean z17) {
        return nativeEnableCustomAudioCapture(this.mNativeV2TXLivePusherJni, z17);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableCustomVideoCapture(boolean z17) {
        return nativeEnableCustomVideoCapture(this.mNativeV2TXLivePusherJni, z17);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableCustomVideoProcess(boolean z17, com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType) {
        if (!z17) {
            return nativeEnableCustomVideoProcess(this.mNativeV2TXLivePusherJni, z17, v2TXLivePixelFormat.ordinal(), v2TXLiveBufferType.ordinal());
        }
        boolean z18 = true;
        if ((v2TXLiveBufferType != com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer || v2TXLivePixelFormat != com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420) && (v2TXLiveBufferType != com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture || v2TXLivePixelFormat != com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D)) {
            z18 = false;
        }
        if (z18) {
            return nativeEnableCustomVideoProcess(this.mNativeV2TXLivePusherJni, z17, v2TXLivePixelFormat.ordinal(), v2TXLiveBufferType.ordinal());
        }
        return -4;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void enableVoiceActivityDetection(boolean z17) {
        nativeEnableVoiceActivityDetection(this.mNativeV2TXLivePusherJni, z17);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableVolumeEvaluation(int i17) {
        return nativeEnableVolumeEvaluation(this.mNativeV2TXLivePusherJni, i17);
    }

    public void finalize() {
        super.finalize();
        release();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public com.tencent.liteav.audio.TXAudioEffectManager getAudioEffectManager() {
        return this.mAudioEffectManager;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public com.tencent.liteav.beauty.TXBeautyManager getBeautyManager() {
        return this.mBeautyManager;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public com.tencent.liteav.device.TXDeviceManager getDeviceManager() {
        return this.mDeviceManager;
    }

    public int getFrameBufferType(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        com.tencent.liteav.videobase.base.GLConstants.a aVar = com.tencent.liteav.videobase.base.GLConstants.a.BYTE_BUFFER;
        int i17 = com.tencent.liteav.live.V2TXLivePusherJni.AnonymousClass1.f46489d[v2TXLiveVideoFrame.bufferType.ordinal()];
        if (i17 == 1) {
            aVar = com.tencent.liteav.videobase.base.GLConstants.a.TEXTURE_2D;
        } else if (i17 == 2) {
            aVar = com.tencent.liteav.videobase.base.GLConstants.a.BYTE_ARRAY;
        }
        return aVar.mValue;
    }

    public byte[] getFrameByteArray(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.data;
    }

    public java.nio.ByteBuffer getFrameByteBuffer(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.buffer;
    }

    public java.lang.Object getFrameEglContext(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        com.tencent.live2.V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture;
        if (v2TXLiveVideoFrame == null || (v2TXLiveTexture = v2TXLiveVideoFrame.texture) == null) {
            return null;
        }
        javax.microedition.khronos.egl.EGLContext eGLContext = v2TXLiveTexture.eglContext10;
        javax.microedition.khronos.egl.EGLContext eGLContext2 = eGLContext != null ? eGLContext : null;
        android.opengl.EGLContext eGLContext3 = v2TXLiveTexture.eglContext14;
        return eGLContext3 != null ? eGLContext3 : eGLContext2;
    }

    public int getFrameHeight(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.height;
    }

    public int getFramePixelFormat(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        com.tencent.liteav.videobase.base.GLConstants.PixelFormatType pixelFormatType = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.I420;
        int i17 = com.tencent.liteav.live.V2TXLivePusherJni.AnonymousClass1.f46488c[v2TXLiveVideoFrame.pixelFormat.ordinal()];
        if (i17 != 1 && i17 == 2) {
            pixelFormatType = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA;
        }
        return pixelFormatType.getValue();
    }

    public int getFrameRotation(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.rotation;
    }

    public int getFrameTextureId(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        com.tencent.live2.V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture;
        if (v2TXLiveVideoFrame == null || (v2TXLiveTexture = v2TXLiveVideoFrame.texture) == null) {
            return -1;
        }
        return v2TXLiveTexture.textureId;
    }

    public int getFrameWidth(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.width;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int isPushing() {
        return nativeIsPushing(this.mNativeV2TXLivePusherJni);
    }

    public void onCaptureFirstAudioFrame() {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onCaptureFirstAudioFrame();
        }
    }

    public void onCaptureFirstVideoFrame() {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onCaptureFirstVideoFrame();
        }
    }

    public int onCustomPreprocessFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame, com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame2) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            return v2TXLivePusherObserver.onProcessVideoFrame(v2TXLiveVideoFrame, v2TXLiveVideoFrame2);
        }
        return -1;
    }

    public void onEnterRoom(int i17, java.lang.String str) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver == null || !(v2TXLivePusherObserver instanceof com.tencent.live2.impl.a.b)) {
            return;
        }
        ((com.tencent.live2.impl.a.b) v2TXLivePusherObserver).onEnterRoom(i17);
    }

    public void onError(int i17, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onError(i17, str, bundle);
        }
    }

    public void onExitRoom(int i17, java.lang.String str) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver == null || !(v2TXLivePusherObserver instanceof com.tencent.live2.impl.a.b)) {
            return;
        }
        ((com.tencent.live2.impl.a.b) v2TXLivePusherObserver).onExitRoom(i17);
    }

    public void onGLContextCreated() {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onGLContextCreated();
        }
    }

    public void onGLContextDestroyed() {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onGLContextDestroyed();
        }
    }

    public void onMicrophoneVolumeUpdate(int i17) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onMicrophoneVolumeUpdate(i17);
        }
    }

    public void onNetworkQuality(int i17) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver == null || !(v2TXLivePusherObserver instanceof com.tencent.live2.impl.a.b)) {
            return;
        }
        ((com.tencent.live2.impl.a.b) v2TXLivePusherObserver).onNetworkQuality(i17);
    }

    public void onProcessAudioFrame(byte[] bArr, long j17, int i17, int i18) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver == null) {
            return;
        }
        com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.sampleRate = i17;
        v2TXLiveAudioFrame.channel = i18;
        v2TXLiveAudioFrame.timestamp = j17;
        v2TXLivePusherObserver.onProcessAudioFrame(v2TXLiveAudioFrame);
    }

    public void onPushEvent(int i17, android.os.Bundle bundle) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver == null || !(v2TXLivePusherObserver instanceof com.tencent.live2.impl.a.b)) {
            return;
        }
        ((com.tencent.live2.impl.a.b) v2TXLivePusherObserver).onPushEvent(i17, bundle);
    }

    public void onPushNetStatus(android.os.Bundle bundle) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver == null || !(v2TXLivePusherObserver instanceof com.tencent.live2.impl.a.b)) {
            return;
        }
        ((com.tencent.live2.impl.a.b) v2TXLivePusherObserver).onPushNetStatus(bundle);
    }

    public void onPushStatusUpdate(int i17, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        com.tencent.live2.V2TXLiveDef.V2TXLivePushStatus v2TXLivePushStatus = com.tencent.live2.V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusDisconnected;
        if (i17 == 0) {
            v2TXLivePushStatus = com.tencent.live2.V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusConnecting;
            str = "connecting to the server.";
        } else if (i17 == 1) {
            v2TXLivePushStatus = com.tencent.live2.V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusConnectSuccess;
            str = "connected to the server successfully.";
        } else if (i17 == 2) {
            v2TXLivePushStatus = com.tencent.live2.V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusReconnecting;
            str = "reconnecting to the server.";
        } else if (i17 == 3) {
            str = "disconnected from the server.";
        }
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onPushStatusUpdate(v2TXLivePushStatus, str, bundle);
        }
    }

    public void onRecordBegin(int i17, java.lang.String str) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onLocalRecordBegin(i17, str);
        }
    }

    public void onRecordComplete(int i17, java.lang.String str) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onLocalRecordComplete(i17, str);
        }
    }

    public void onRecordProgress(long j17, java.lang.String str) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onLocalRecording(j17, str);
        }
    }

    public void onScreenCaptureStarted() {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onScreenCaptureStarted();
        }
    }

    public void onScreenCaptureStoped(int i17) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onScreenCaptureStopped(i17);
        }
    }

    public void onSetMixTranscodingConfig(int i17, java.lang.String str) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onSetMixTranscodingConfig(i17, str);
        }
    }

    public void onSnapshotComplete(android.graphics.Bitmap bitmap) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onSnapshotComplete(bitmap);
        }
    }

    public void onStatisticsUpdate(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            com.tencent.live2.V2TXLiveDef.V2TXLivePusherStatistics v2TXLivePusherStatistics = new com.tencent.live2.V2TXLiveDef.V2TXLivePusherStatistics();
            v2TXLivePusherStatistics.appCpu = i17;
            v2TXLivePusherStatistics.systemCpu = i18;
            v2TXLivePusherStatistics.width = i19;
            v2TXLivePusherStatistics.height = i27;
            v2TXLivePusherStatistics.fps = i28;
            v2TXLivePusherStatistics.videoBitrate = i29;
            v2TXLivePusherStatistics.audioBitrate = i37;
            v2TXLivePusherStatistics.rtt = i38;
            v2TXLivePusherStatistics.netSpeed = i39;
            v2TXLivePusherObserver.onStatisticsUpdate(v2TXLivePusherStatistics);
        }
    }

    public void onUserAudioAvailable(java.lang.String str, boolean z17) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver == null || !(v2TXLivePusherObserver instanceof com.tencent.live2.impl.a.b)) {
            return;
        }
        ((com.tencent.live2.impl.a.b) v2TXLivePusherObserver).onUserAudioAvailable(str, z17);
    }

    public void onUserOffline(java.lang.String str) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver == null || !(v2TXLivePusherObserver instanceof com.tencent.live2.impl.a.b)) {
            return;
        }
        ((com.tencent.live2.impl.a.b) v2TXLivePusherObserver).onRemoteUserExit(str, 0);
    }

    public void onUserOnline(java.lang.String str) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver == null || !(v2TXLivePusherObserver instanceof com.tencent.live2.impl.a.b)) {
            return;
        }
        ((com.tencent.live2.impl.a.b) v2TXLivePusherObserver).onRemoteUserEnter(str);
    }

    public void onUserVideoAvailable(java.lang.String str, int i17, boolean z17) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver == null || !(v2TXLivePusherObserver instanceof com.tencent.live2.impl.a.b)) {
            return;
        }
        ((com.tencent.live2.impl.a.b) v2TXLivePusherObserver).onUserVideoAvailable(str, i17, z17);
    }

    public void onVoiceActivityDetectionUpdate(boolean z17) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onVoiceActivityDetectionUpdate(z17);
        }
    }

    public void onWarning(int i17, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onWarning(i17, str, bundle);
        }
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int pauseAudio() {
        return nativePauseAudio(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int pauseVideo() {
        return nativePauseVideo(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void release() {
        com.tencent.liteav.beauty.TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManager;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.clear();
        }
        long j17 = this.mNativeV2TXLivePusherJni;
        if (j17 != 0) {
            nativeDestroy(j17);
            this.mNativeV2TXLivePusherJni = 0L;
        }
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int resumeAudio() {
        return nativeResumeAudio(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int resumeVideo() {
        return nativeResumeVideo(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int sendCustomAudioFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
        if (v2TXLiveAudioFrame == null) {
            return -2;
        }
        return nativeSendCustomAudioFrame(this.mNativeV2TXLivePusherJni, v2TXLiveAudioFrame.data, v2TXLiveAudioFrame.sampleRate, v2TXLiveAudioFrame.channel, v2TXLiveAudioFrame.timestamp);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int sendCustomVideoFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        com.tencent.liteav.videobase.base.GLConstants.PixelFormatType pixelFormatType;
        com.tencent.liteav.videobase.base.GLConstants.a aVar;
        java.lang.Object eglContextFromLiveVideoFrame;
        if (v2TXLiveVideoFrame == null) {
            return -2;
        }
        int i17 = com.tencent.liteav.live.V2TXLivePusherJni.AnonymousClass1.f46488c[v2TXLiveVideoFrame.pixelFormat.ordinal()];
        int i18 = -1;
        if (i17 == 1) {
            pixelFormatType = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.I420;
        } else {
            if (i17 != 2) {
                return -1;
            }
            pixelFormatType = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA;
        }
        int i19 = com.tencent.liteav.live.V2TXLivePusherJni.AnonymousClass1.f46489d[v2TXLiveVideoFrame.bufferType.ordinal()];
        if (i19 != 1) {
            eglContextFromLiveVideoFrame = null;
            if (i19 == 2) {
                aVar = com.tencent.liteav.videobase.base.GLConstants.a.BYTE_ARRAY;
            } else {
                if (i19 != 3) {
                    return -1;
                }
                aVar = com.tencent.liteav.videobase.base.GLConstants.a.BYTE_BUFFER;
            }
        } else {
            aVar = com.tencent.liteav.videobase.base.GLConstants.a.TEXTURE_2D;
            com.tencent.live2.V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = v2TXLiveVideoFrame.texture;
            if (v2TXLiveTexture == null) {
                return -1;
            }
            i18 = v2TXLiveTexture.textureId;
            eglContextFromLiveVideoFrame = getEglContextFromLiveVideoFrame(v2TXLiveVideoFrame);
        }
        return nativeSendCustomVideoFrame(this.mNativeV2TXLivePusherJni, v2TXLiveVideoFrame.width, v2TXLiveVideoFrame.height, aVar.mValue, pixelFormatType.getValue(), v2TXLiveVideoFrame.rotation, i18, eglContextFromLiveVideoFrame, v2TXLiveVideoFrame.data, v2TXLiveVideoFrame.buffer);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int sendSeiMessage(int i17, byte[] bArr) {
        return nativeSendSeiMessage(this.mNativeV2TXLivePusherJni, i17, bArr);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setAudioQuality(com.tencent.live2.V2TXLiveDef.V2TXLiveAudioQuality v2TXLiveAudioQuality) {
        return nativeSetAudioQuality(this.mNativeV2TXLivePusherJni, v2TXLiveAudioQuality.ordinal());
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setEncoderMirror(boolean z17) {
        return nativeSetEncoderMirror(this.mNativeV2TXLivePusherJni, z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v2, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Override // com.tencent.live2.V2TXLivePusher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int setMixTranscodingConfig(com.tencent.live2.V2TXLiveDef.V2TXLiveTranscodingConfig r9) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.live.V2TXLivePusherJni.setMixTranscodingConfig(com.tencent.live2.V2TXLiveDef$V2TXLiveTranscodingConfig):int");
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void setObserver(com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver) {
        this.mObserver = v2TXLivePusherObserver;
        if (v2TXLivePusherObserver == null || !(v2TXLivePusherObserver instanceof com.tencent.live2.impl.a.b)) {
            return;
        }
        nativeEnableExtensionCallback(this.mNativeV2TXLivePusherJni, true);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setProperty(java.lang.String str, java.lang.Object obj) {
        str.getClass();
        if (str.equals(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurfaceSize)) {
            com.tencent.liteav.base.util.LiteavLog.i(TAG, "set surface size is unnecessary");
            return 0;
        }
        if (!str.equals(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface)) {
            return nativeSetProperty(this.mNativeV2TXLivePusherJni, str, obj);
        }
        if (obj == null) {
            nativeSetRenderView(this.mNativeV2TXLivePusherJni, null);
            return 0;
        }
        if (obj instanceof android.view.Surface) {
            nativeSetRenderView(this.mNativeV2TXLivePusherJni, new com.tencent.liteav.videobase.videobase.DisplayTarget((android.view.Surface) obj));
            return 0;
        }
        com.tencent.liteav.base.util.LiteavLog.e(TAG, "setProperty error, key:" + str + ", value:" + obj);
        return -2;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderFillMode(com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode) {
        com.tencent.liteav.videobase.base.GLConstants.GLScaleType gLScaleType = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.CENTER_CROP;
        int i17 = com.tencent.liteav.live.V2TXLivePusherJni.AnonymousClass1.f46487b[v2TXLiveFillMode.ordinal()];
        if (i17 != 1) {
            if (i17 == 2) {
                gLScaleType = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.FIT_CENTER;
            } else if (i17 == 3) {
                gLScaleType = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.FILL;
            }
        }
        return nativeSetRenderFillMode(this.mNativeV2TXLivePusherJni, gLScaleType.mValue);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderMirror(com.tencent.live2.V2TXLiveDef.V2TXLiveMirrorType v2TXLiveMirrorType) {
        return nativeSetRenderMirror(this.mNativeV2TXLivePusherJni, v2TXLiveMirrorType.ordinal());
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderRotation(com.tencent.live2.V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation) {
        int i17 = com.tencent.liteav.live.V2TXLivePusherJni.AnonymousClass1.f46486a[v2TXLiveRotation.ordinal()];
        return nativeSetRenderRotation(this.mNativeV2TXLivePusherJni, (i17 != 1 ? i17 != 2 ? i17 != 3 ? com.tencent.liteav.base.util.k.NORMAL : com.tencent.liteav.base.util.k.ROTATION_270 : com.tencent.liteav.base.util.k.ROTATION_180 : com.tencent.liteav.base.util.k.ROTATION_90).mValue);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderView(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        return nativeSetRenderView(this.mNativeV2TXLivePusherJni, new com.tencent.liteav.videobase.videobase.DisplayTarget(tXCloudVideoView));
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setVideoQuality(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoEncoderParam v2TXLiveVideoEncoderParam) {
        if (v2TXLiveVideoEncoderParam == null) {
            return -2;
        }
        return nativeSetVideoQuality(this.mNativeV2TXLivePusherJni, v2TXLiveVideoEncoderParam.videoResolution.ordinal(), v2TXLiveVideoEncoderParam.videoResolutionMode.ordinal(), v2TXLiveVideoEncoderParam.videoFps, v2TXLiveVideoEncoderParam.videoBitrate, v2TXLiveVideoEncoderParam.minVideoBitrate);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setWatermark(android.graphics.Bitmap bitmap, float f17, float f18, float f19) {
        return nativeSetWatermark(this.mNativeV2TXLivePusherJni, bitmap, f17, f18, f19);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void showDebugView(boolean z17) {
        nativeShowDebugView(this.mNativeV2TXLivePusherJni, z17);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int snapshot() {
        return nativeSnapshot(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startCamera(boolean z17) {
        return nativeStartCamera(this.mNativeV2TXLivePusherJni, z17);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startLocalRecording(com.tencent.live2.V2TXLiveDef.V2TXLiveLocalRecordingParams v2TXLiveLocalRecordingParams) {
        if (v2TXLiveLocalRecordingParams == null || android.text.TextUtils.isEmpty(v2TXLiveLocalRecordingParams.filePath)) {
            return -2;
        }
        return nativeStartRecord(this.mNativeV2TXLivePusherJni, v2TXLiveLocalRecordingParams.filePath, v2TXLiveLocalRecordingParams.recordMode.ordinal(), v2TXLiveLocalRecordingParams.interval);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startMicrophone() {
        return nativeStartMicrophone(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startPush(java.lang.String str) {
        return nativeStartPush(this.mNativeV2TXLivePusherJni, str);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startScreenCapture() {
        return nativeStartScreenCapture(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startSystemAudioLoopback() {
        return nativeStartSystemAudioLoopback(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startVirtualCamera(android.graphics.Bitmap bitmap) {
        return nativeStartVirtualCamera(this.mNativeV2TXLivePusherJni, bitmap);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopCamera() {
        return nativeStopCamera(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void stopLocalRecording() {
        nativeStopRecord(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopMicrophone() {
        return nativeStopMicrophone(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopPush() {
        return nativeStopPush(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopScreenCapture() {
        return nativeStopScreenCapture(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopSystemAudioLoopback() {
        return nativeStopSystemAudioLoopback(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopVirtualCamera() {
        return nativeStopVirtualCamera(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderView(android.view.TextureView textureView) {
        return nativeSetRenderView(this.mNativeV2TXLivePusherJni, new com.tencent.liteav.videobase.videobase.DisplayTarget(textureView));
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderView(android.view.SurfaceView surfaceView) {
        return nativeSetRenderView(this.mNativeV2TXLivePusherJni, new com.tencent.liteav.videobase.videobase.DisplayTarget(surfaceView));
    }
}
