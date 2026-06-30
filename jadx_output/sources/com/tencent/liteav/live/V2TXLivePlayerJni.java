package com.tencent.liteav.live;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes16.dex */
public class V2TXLivePlayerJni extends com.tencent.live2.V2TXLivePlayer {
    private static final java.lang.String TAG = "V2TXLivePlayerJni";
    private boolean mClearLastImage = true;
    protected long mNativeV2TXLivePlayerJni;
    private com.tencent.live2.V2TXLivePlayerObserver mObserver;
    private com.tencent.live2.impl.V2TXLivePlayerImpl mProxy;

    /* renamed from: com.tencent.liteav.live.V2TXLivePlayerJni$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46481a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f46482b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f46483c;

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f46484d;

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f46485e;

        static {
            int[] iArr = new int[com.tencent.liteav.base.util.k.values().length];
            f46485e = iArr;
            try {
                iArr[com.tencent.liteav.base.util.k.NORMAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f46485e[com.tencent.liteav.base.util.k.ROTATION_90.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f46485e[com.tencent.liteav.base.util.k.ROTATION_180.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f46485e[com.tencent.liteav.base.util.k.ROTATION_270.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.tencent.liteav.videobase.base.GLConstants.a.values().length];
            f46484d = iArr2;
            try {
                iArr2[com.tencent.liteav.videobase.base.GLConstants.a.BYTE_BUFFER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f46484d[com.tencent.liteav.videobase.base.GLConstants.a.BYTE_ARRAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f46484d[com.tencent.liteav.videobase.base.GLConstants.a.TEXTURE_2D.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.values().length];
            f46483c = iArr3;
            try {
                iArr3[com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.I420.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f46483c[com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode.values().length];
            f46482b = iArr4;
            try {
                iArr4[com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFill.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                f46482b[com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeScaleFill.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            int[] iArr5 = new int[com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.values().length];
            f46481a = iArr5;
            try {
                iArr5[com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation90.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                f46481a[com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation180.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                f46481a[com.tencent.live2.V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation270.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
        }
    }

    public V2TXLivePlayerJni(android.content.Context context, com.tencent.live2.impl.V2TXLivePlayerImpl v2TXLivePlayerImpl) {
        this.mNativeV2TXLivePlayerJni = 0L;
        this.mProxy = v2TXLivePlayerImpl;
        com.tencent.liteav.base.ContextUtils.initApplicationContext(context.getApplicationContext());
        com.tencent.liteav.base.ContextUtils.setDataDirectorySuffix("liteav");
        this.mNativeV2TXLivePlayerJni = nativeCreate(new java.lang.ref.WeakReference(this));
    }

    private void enableExtensionCallback(boolean z17) {
        synchronized (this) {
            nativeEnableExtensionCallback(this.mNativeV2TXLivePlayerJni, z17);
        }
    }

    public static com.tencent.live2.V2TXLiveDef.V2TXLivePlayerStatistics getJavaV2TXLivePlayerStatistics(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, int i59, int i66) {
        com.tencent.live2.V2TXLiveDef.V2TXLivePlayerStatistics v2TXLivePlayerStatistics = new com.tencent.live2.V2TXLiveDef.V2TXLivePlayerStatistics();
        v2TXLivePlayerStatistics.appCpu = i17;
        v2TXLivePlayerStatistics.systemCpu = i18;
        v2TXLivePlayerStatistics.rtt = i19;
        v2TXLivePlayerStatistics.width = i27;
        v2TXLivePlayerStatistics.height = i28;
        v2TXLivePlayerStatistics.fps = i29;
        v2TXLivePlayerStatistics.videoBitrate = i37;
        v2TXLivePlayerStatistics.audioBitrate = i38;
        v2TXLivePlayerStatistics.audioPacketLoss = i39;
        v2TXLivePlayerStatistics.videoPacketLoss = i47;
        v2TXLivePlayerStatistics.jitterBufferDelay = i48;
        v2TXLivePlayerStatistics.audioTotalBlockTime = i49;
        v2TXLivePlayerStatistics.audioBlockRate = i57;
        v2TXLivePlayerStatistics.videoTotalBlockTime = i58;
        v2TXLivePlayerStatistics.videoBlockRate = i59;
        v2TXLivePlayerStatistics.netSpeed = i66;
        return v2TXLivePlayerStatistics;
    }

    private static java.util.ArrayList<com.tencent.live2.V2TXLiveDef.V2TXLiveStreamInfo> getStreamListFormJsonString(java.lang.String str) {
        java.util.ArrayList<com.tencent.live2.V2TXLiveDef.V2TXLiveStreamInfo> arrayList = new java.util.ArrayList<>();
        if (str != null && !str.isEmpty()) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                    arrayList.add(new com.tencent.live2.V2TXLiveDef.V2TXLiveStreamInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), jSONObject.getInt(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE), (float) jSONObject.getDouble(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FRAMERATE), jSONObject.getString("url")));
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return arrayList;
    }

    private static native long nativeCreate(java.lang.ref.WeakReference<com.tencent.liteav.live.V2TXLivePlayerJni> weakReference);

    private static native void nativeDestroy(long j17);

    private static native int nativeEnableCustomRendering(long j17, boolean z17, int i17, int i18);

    private static native void nativeEnableExtensionCallback(long j17, boolean z17);

    private static native int nativeEnableObserveAudioFrame(long j17, boolean z17);

    private static native int nativeEnableReceiveSeiMessage(long j17, boolean z17, int i17);

    private static native int nativeEnableVolumeEvaluation(long j17, int i17);

    private static native java.lang.String nativeGetStreamList(long j17);

    private static native int nativeIsPlaying(long j17);

    private static native int nativePauseAudio(long j17);

    private static native int nativePauseVideo(long j17);

    private static native int nativeResumeAudio(long j17);

    private static native int nativeResumeVideo(long j17);

    private static native int nativeSetCacheParams(long j17, float f17, float f18);

    private static native int nativeSetPlayoutVolume(long j17, int i17);

    private static native int nativeSetProperty(long j17, java.lang.String str, java.lang.Object obj);

    private static native int nativeSetRenderFillMode(long j17, int i17);

    private static native int nativeSetRenderRotation(long j17, int i17);

    private static native int nativeSetRenderView(long j17, com.tencent.liteav.videobase.videobase.DisplayTarget displayTarget);

    private static native void nativeSetSharedEGLContext(long j17, java.lang.Object obj);

    private static native void nativeShowDebugView(long j17, boolean z17);

    private static native int nativeSnapshot(long j17);

    private static native int nativeStartPlay(long j17, java.lang.String str);

    private static native int nativeStartRecord(long j17, java.lang.String str, int i17, int i18);

    private static native int nativeStopPlay(long j17, boolean z17);

    private static native void nativeStopRecord(long j17);

    private static native int nativeSwitchStream(long j17, java.lang.String str);

    public static com.tencent.liteav.live.V2TXLivePlayerJni weakToStrongReference(java.lang.ref.WeakReference<com.tencent.liteav.live.V2TXLivePlayerJni> weakReference) {
        return weakReference.get();
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableObserveAudioFrame(boolean z17) {
        return nativeEnableObserveAudioFrame(this.mNativeV2TXLivePlayerJni, z17);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableObserveVideoFrame(boolean z17, com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType) {
        com.tencent.liteav.videobase.base.GLConstants.PixelFormatType pixelFormatType;
        com.tencent.liteav.videobase.base.GLConstants.a aVar;
        com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat2 = com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        if (v2TXLivePixelFormat == v2TXLivePixelFormat2 && v2TXLiveBufferType == com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray) {
            pixelFormatType = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.I420;
            aVar = com.tencent.liteav.videobase.base.GLConstants.a.BYTE_ARRAY;
        } else if (v2TXLivePixelFormat == com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D && v2TXLiveBufferType == com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture) {
            pixelFormatType = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA;
            aVar = com.tencent.liteav.videobase.base.GLConstants.a.TEXTURE_2D;
        } else {
            if (v2TXLivePixelFormat != v2TXLivePixelFormat2 || v2TXLiveBufferType != com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer) {
                com.tencent.liteav.base.util.LiteavLog.e(TAG, "Enable custom render failed, invalid params. format:" + v2TXLivePixelFormat + " type:" + v2TXLiveBufferType);
                return -4;
            }
            pixelFormatType = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.I420;
            aVar = com.tencent.liteav.videobase.base.GLConstants.a.BYTE_BUFFER;
        }
        return nativeEnableCustomRendering(this.mNativeV2TXLivePlayerJni, z17, pixelFormatType.getValue(), aVar.ordinal());
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableReceiveSeiMessage(boolean z17, int i17) {
        return nativeEnableReceiveSeiMessage(this.mNativeV2TXLivePlayerJni, z17, i17);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableVolumeEvaluation(int i17) {
        return nativeEnableVolumeEvaluation(this.mNativeV2TXLivePlayerJni, i17);
    }

    public void finalize() {
        nativeDestroy(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public java.util.ArrayList<com.tencent.live2.V2TXLiveDef.V2TXLiveStreamInfo> getStreamList() {
        return getStreamListFormJsonString(nativeGetStreamList(this.mNativeV2TXLivePlayerJni));
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int isPlaying() {
        return nativeIsPlaying(this.mNativeV2TXLivePlayerJni);
    }

    public void onAudioLoading(android.os.Bundle bundle) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onAudioLoading(this.mProxy, bundle);
        }
    }

    public void onAudioPlaying(boolean z17, android.os.Bundle bundle) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onAudioPlaying(this.mProxy, z17, bundle);
        }
    }

    public void onConnected(android.os.Bundle bundle) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onConnected(this.mProxy, bundle);
        }
    }

    public void onError(int i17, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onError(this.mProxy, i17, str, bundle);
        }
    }

    public void onNetworkQuality(int i17) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver == null || !(v2TXLivePlayerObserver instanceof com.tencent.live2.impl.a.a)) {
            return;
        }
        ((com.tencent.live2.impl.a.a) v2TXLivePlayerObserver).onNetworkQuality(i17);
    }

    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver == null || !(v2TXLivePlayerObserver instanceof com.tencent.live2.impl.a.a)) {
            return;
        }
        ((com.tencent.live2.impl.a.a) v2TXLivePlayerObserver).onPlayEvent(i17, bundle);
    }

    public void onPlayNetStatus(android.os.Bundle bundle) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver == null || !(v2TXLivePlayerObserver instanceof com.tencent.live2.impl.a.a)) {
            return;
        }
        ((com.tencent.live2.impl.a.a) v2TXLivePlayerObserver).onPlayNetStatus(bundle);
    }

    public void onPlayoutAudioFrame(byte[] bArr, int i17, int i18) {
        com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.sampleRate = i17;
        v2TXLiveAudioFrame.channel = i18;
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onPlayoutAudioFrame(this.mProxy, v2TXLiveAudioFrame);
        }
    }

    public void onPlayoutVolumeUpdate(int i17) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onPlayoutVolumeUpdate(this.mProxy, i17);
        }
    }

    public void onReceiveSeiMessage(int i17, byte[] bArr) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onReceiveSeiMessage(this.mProxy, i17, bArr);
        }
    }

    public void onRecordBegin(int i17, java.lang.String str) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onLocalRecordBegin(this.mProxy, i17, str);
        }
    }

    public void onRecordComplete(int i17, java.lang.String str) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onLocalRecordComplete(this.mProxy, i17, str);
        }
    }

    public void onRecordProgress(long j17, java.lang.String str) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onLocalRecording(this.mProxy, j17, str);
        }
    }

    public void onRenderVideoFrame(int i17, int i18, java.lang.Object obj, int i19, int i27, int i28, int i29, long j17, byte[] bArr, java.nio.ByteBuffer byteBuffer) {
        com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame = new com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame();
        com.tencent.liteav.videobase.base.GLConstants.PixelFormatType a17 = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.a(i17);
        int i37 = com.tencent.liteav.live.V2TXLivePlayerJni.AnonymousClass1.f46483c[a17.ordinal()];
        if (i37 == 1) {
            v2TXLiveVideoFrame.pixelFormat = com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        } else if (i37 != 2) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "Invalid pixelFormat. pixelFormat:" + a17 + ".");
        } else {
            v2TXLiveVideoFrame.pixelFormat = com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D;
        }
        com.tencent.liteav.videobase.base.GLConstants.a a18 = com.tencent.liteav.videobase.base.GLConstants.a.a(i18);
        int i38 = com.tencent.liteav.live.V2TXLivePlayerJni.AnonymousClass1.f46484d[a18.ordinal()];
        if (i38 == 1) {
            v2TXLiveVideoFrame.bufferType = com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer;
        } else if (i38 == 2) {
            v2TXLiveVideoFrame.bufferType = com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray;
        } else if (i38 != 3) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "Invalid bufferType. bufferType:" + a18 + ".");
        } else {
            v2TXLiveVideoFrame.bufferType = com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture;
        }
        com.tencent.live2.V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = new com.tencent.live2.V2TXLiveDef.V2TXLiveTexture();
        v2TXLiveTexture.textureId = i19;
        if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
            v2TXLiveTexture.eglContext10 = (javax.microedition.khronos.egl.EGLContext) obj;
        } else if (obj instanceof android.opengl.EGLContext) {
            v2TXLiveTexture.eglContext14 = (android.opengl.EGLContext) obj;
        }
        v2TXLiveVideoFrame.texture = v2TXLiveTexture;
        v2TXLiveVideoFrame.data = bArr;
        v2TXLiveVideoFrame.buffer = byteBuffer;
        v2TXLiveVideoFrame.width = i27;
        v2TXLiveVideoFrame.height = i28;
        int i39 = com.tencent.liteav.live.V2TXLivePlayerJni.AnonymousClass1.f46485e[com.tencent.liteav.base.util.k.a(i29).ordinal()];
        if (i39 == 1) {
            v2TXLiveVideoFrame.rotation = 0;
        } else if (i39 == 2) {
            v2TXLiveVideoFrame.rotation = 90;
        } else if (i39 == 3) {
            v2TXLiveVideoFrame.rotation = 180;
        } else if (i39 != 4) {
            v2TXLiveVideoFrame.rotation = 0;
        } else {
            v2TXLiveVideoFrame.rotation = 270;
        }
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onRenderVideoFrame(this.mProxy, v2TXLiveVideoFrame);
        }
    }

    public void onSnapshotComplete(android.graphics.Bitmap bitmap) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onSnapshotComplete(this.mProxy, bitmap);
        }
    }

    public void onStatisticsUpdate(com.tencent.live2.V2TXLiveDef.V2TXLivePlayerStatistics v2TXLivePlayerStatistics) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onStatisticsUpdate(this.mProxy, v2TXLivePlayerStatistics);
        }
    }

    public void onStreamSwitched(int i17, java.lang.String str) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onStreamSwitched(this.mProxy, str, i17);
        }
    }

    public void onVideoLoading(android.os.Bundle bundle) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onVideoLoading(this.mProxy, bundle);
        }
    }

    public void onVideoPlaying(boolean z17, android.os.Bundle bundle) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onVideoPlaying(this.mProxy, z17, bundle);
        }
    }

    public void onVideoResolutionChanged(int i17, int i18) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onVideoResolutionChanged(this.mProxy, i17, i18);
        }
    }

    public void onWarning(int i17, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onWarning(this.mProxy, i17, str, bundle);
        }
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int pauseAudio() {
        return nativePauseAudio(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int pauseVideo() {
        return nativePauseVideo(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int resumeAudio() {
        return nativeResumeAudio(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int resumeVideo() {
        return nativeResumeVideo(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setCacheParams(float f17, float f18) {
        if (f17 < 0.0f || f18 < 0.0f) {
            return -2;
        }
        return nativeSetCacheParams(this.mNativeV2TXLivePlayerJni, f17, f18);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public void setObserver(com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver) {
        this.mObserver = v2TXLivePlayerObserver;
        if (v2TXLivePlayerObserver == null || !(v2TXLivePlayerObserver instanceof com.tencent.live2.impl.a.a)) {
            return;
        }
        enableExtensionCallback(true);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setPlayoutVolume(int i17) {
        return nativeSetPlayoutVolume(this.mNativeV2TXLivePlayerJni, i17);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setProperty(java.lang.String str, java.lang.Object obj) {
        char c17;
        synchronized (this) {
            switch (str.hashCode()) {
                case 480042124:
                    if (str.equals(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurfaceSize)) {
                        c17 = 2;
                        break;
                    }
                    c17 = 65535;
                    break;
                case 582452376:
                    if (str.equals(com.tencent.live2.impl.V2TXLiveProperty.kV2ClearLastImage)) {
                        c17 = 0;
                        break;
                    }
                    c17 = 65535;
                    break;
                case 1120433643:
                    if (str.equals(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface)) {
                        c17 = 1;
                        break;
                    }
                    c17 = 65535;
                    break;
                case 1615550654:
                    if (str.equals(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetOpenGLContext)) {
                        c17 = 3;
                        break;
                    }
                    c17 = 65535;
                    break;
                default:
                    c17 = 65535;
                    break;
            }
            if (c17 != 0) {
                if (c17 == 1) {
                    if (obj == null) {
                        return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, null);
                    }
                    if (obj instanceof android.view.Surface) {
                        return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, new com.tencent.liteav.videobase.videobase.DisplayTarget((android.view.Surface) obj));
                    }
                    com.tencent.liteav.base.util.LiteavLog.e(TAG, "setProperty error, key:" + str + ", value:" + obj);
                    return -2;
                }
                if (c17 == 2) {
                    com.tencent.liteav.base.util.LiteavLog.i(TAG, "set surface size is unnecessary");
                } else {
                    if (c17 != 3) {
                        return nativeSetProperty(this.mNativeV2TXLivePlayerJni, str, obj);
                    }
                    if (!(obj instanceof javax.microedition.khronos.egl.EGLContext) && !(obj instanceof android.opengl.EGLContext)) {
                        com.tencent.liteav.base.util.LiteavLog.e(TAG, "setProperty error, key:" + str + ", value:" + obj);
                        return -2;
                    }
                    nativeSetSharedEGLContext(this.mNativeV2TXLivePlayerJni, obj);
                }
            } else {
                if (!(obj instanceof java.lang.Boolean)) {
                    com.tencent.liteav.base.util.LiteavLog.e(TAG, "setProperty error, key:" + str + ", value:" + obj);
                    return -2;
                }
                this.mClearLastImage = ((java.lang.Boolean) obj).booleanValue();
            }
            return 0;
        }
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderFillMode(com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode) {
        int i17 = com.tencent.liteav.live.V2TXLivePlayerJni.AnonymousClass1.f46482b[v2TXLiveFillMode.ordinal()];
        return nativeSetRenderFillMode(this.mNativeV2TXLivePlayerJni, (i17 != 1 ? i17 != 2 ? com.tencent.liteav.videobase.base.GLConstants.GLScaleType.FIT_CENTER : com.tencent.liteav.videobase.base.GLConstants.GLScaleType.FILL : com.tencent.liteav.videobase.base.GLConstants.GLScaleType.CENTER_CROP).mValue);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderRotation(com.tencent.live2.V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation) {
        int i17 = com.tencent.liteav.live.V2TXLivePlayerJni.AnonymousClass1.f46481a[v2TXLiveRotation.ordinal()];
        return nativeSetRenderRotation(this.mNativeV2TXLivePlayerJni, (i17 != 1 ? i17 != 2 ? i17 != 3 ? com.tencent.liteav.base.util.k.NORMAL : com.tencent.liteav.base.util.k.ROTATION_270 : com.tencent.liteav.base.util.k.ROTATION_180 : com.tencent.liteav.base.util.k.ROTATION_90).mValue);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderView(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, tXCloudVideoView != null ? new com.tencent.liteav.videobase.videobase.DisplayTarget(tXCloudVideoView) : null);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public void showDebugView(boolean z17) {
        nativeShowDebugView(this.mNativeV2TXLivePlayerJni, z17);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int snapshot() {
        return nativeSnapshot(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int startLivePlay(java.lang.String str) {
        return nativeStartPlay(this.mNativeV2TXLivePlayerJni, str);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int startLocalRecording(com.tencent.live2.V2TXLiveDef.V2TXLiveLocalRecordingParams v2TXLiveLocalRecordingParams) {
        if (v2TXLiveLocalRecordingParams == null || android.text.TextUtils.isEmpty(v2TXLiveLocalRecordingParams.filePath)) {
            return -2;
        }
        return nativeStartRecord(this.mNativeV2TXLivePlayerJni, v2TXLiveLocalRecordingParams.filePath, v2TXLiveLocalRecordingParams.recordMode.ordinal(), v2TXLiveLocalRecordingParams.interval);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public void stopLocalRecording() {
        nativeStopRecord(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int stopPlay() {
        return nativeStopPlay(this.mNativeV2TXLivePlayerJni, this.mClearLastImage);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int switchStream(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            return nativeSwitchStream(this.mNativeV2TXLivePlayerJni, str);
        }
        com.tencent.liteav.base.util.LiteavLog.e(TAG, "Invalid params.");
        return -2;
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderView(android.view.TextureView textureView) {
        return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, textureView != null ? new com.tencent.liteav.videobase.videobase.DisplayTarget(textureView) : null);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderView(android.view.SurfaceView surfaceView) {
        return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, surfaceView != null ? new com.tencent.liteav.videobase.videobase.DisplayTarget(surfaceView) : null);
    }
}
