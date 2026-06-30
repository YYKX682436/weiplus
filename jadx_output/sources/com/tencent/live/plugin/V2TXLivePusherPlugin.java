package com.tencent.live.plugin;

/* loaded from: classes16.dex */
public class V2TXLivePusherPlugin implements io.flutter.plugin.common.MethodChannel.MethodCallHandler {
    private static final java.lang.String TAG = "V2TXLivePusherPlugin";
    private static final int TC_COMPONENT_PUSHER = 1;
    private static final int TC_FRAMEWORK_LIVE = 23;
    private byte _hellAccFlag_;
    private io.flutter.plugin.common.MethodChannel mChannel;
    private android.content.Context mContext;
    private com.tencent.live.beauty.custom.ITXCustomBeautyProcesser mCustomBeautyProcesser;
    private io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets mFlutterAssets;
    private java.lang.String mIdentifier;
    private io.flutter.plugin.common.BinaryMessenger mMessenger;
    private com.tencent.live2.V2TXLivePusher mPusher;
    private com.tencent.liteav.audio.TXAudioEffectManager mTXAudioEffectManager;
    private com.tencent.liteav.beauty.TXBeautyManager mTXBeautyManager;
    private com.tencent.liteav.device.TXDeviceManager mTXDeviceManager;
    private com.tencent.live.view.V2LiveRenderViewFactory mTXRenderViewFactory;

    /* renamed from: com.tencent.live.plugin.V2TXLivePusherPlugin$5, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyBufferType;
        static final /* synthetic */ int[] $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyPixelFormat;

        static {
            int[] iArr = new int[com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyPixelFormat.values().length];
            $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyPixelFormat = iArr;
            try {
                iArr[com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyPixelFormat.TXCustomBeautyPixelFormatUnknown.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyPixelFormat[com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyPixelFormat.TXCustomBeautyPixelFormatI420.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyPixelFormat[com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyPixelFormat.TXCustomBeautyPixelFormatTexture2D.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyBufferType.values().length];
            $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyBufferType = iArr2;
            try {
                iArr2[com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeUnknown.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyBufferType[com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeByteBuffer.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyBufferType[com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeByteArray.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyBufferType[com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeTexture.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes16.dex */
    public class V2TXLivePusherObserverImpl extends com.tencent.live2.V2TXLivePusherObserver {
        public V2TXLivePusherObserverImpl() {
        }

        public void invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePusherObserverType v2TXLivePusherObserverType, java.util.Map map) {
            v2TXLivePusherObserverType.getName();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("type", v2TXLivePusherObserverType.getName());
            if (map != null) {
                hashMap.put("params", map);
            }
            if (com.tencent.live.plugin.V2TXLivePusherPlugin.this.mChannel != null) {
                com.tencent.live.plugin.V2TXLivePusherPlugin.this.mChannel.invokeMethod("onPusherListener", hashMap);
            }
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onCaptureFirstAudioFrame() {
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePusherObserverType.getByName("onCaptureFirstAudioFrame"), java.util.Collections.emptyMap());
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onCaptureFirstVideoFrame() {
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePusherObserverType.getByName("onCaptureFirstVideoFrame"), java.util.Collections.emptyMap());
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onError(int i17, java.lang.String str, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(i17));
            hashMap.put("errMsg", str);
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, com.tencent.live.utils.AndroidUtils.getMapByBundle(bundle));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePusherObserverType.getByName("onError"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onGLContextCreated() {
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onGLContextDestroyed() {
            com.tencent.live.beauty.custom.ITXCustomBeautyProcesserFactory beautyProcesserFactory = com.tencent.live.TXLivePluginManager.getBeautyProcesserFactory();
            if (beautyProcesserFactory != null) {
                beautyProcesserFactory.destroyCustomBeautyProcesser();
            }
            com.tencent.live.plugin.V2TXLivePusherPlugin.this.mCustomBeautyProcesser = null;
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onMicrophoneVolumeUpdate(int i17) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("volume", java.lang.Integer.valueOf(i17));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePusherObserverType.getByName("onMicrophoneVolumeUpdate"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public int onProcessVideoFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame, com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame2) {
            if (com.tencent.live.plugin.V2TXLivePusherPlugin.this.mCustomBeautyProcesser == null) {
                return com.tencent.live.TXLivePluginDef.ErrorCode.CODE_VALUEISNULL;
            }
            com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyVideoFrame createCustomBeautyVideoFrame = com.tencent.live.plugin.V2TXLivePusherPlugin.createCustomBeautyVideoFrame(v2TXLiveVideoFrame);
            com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyVideoFrame createCustomBeautyVideoFrame2 = com.tencent.live.plugin.V2TXLivePusherPlugin.createCustomBeautyVideoFrame(v2TXLiveVideoFrame2);
            com.tencent.live.plugin.V2TXLivePusherPlugin.this.mCustomBeautyProcesser.onProcessVideoFrame(createCustomBeautyVideoFrame, createCustomBeautyVideoFrame2);
            com.tencent.live.beauty.custom.TXCustomBeautyDef.TXThirdTexture tXThirdTexture = createCustomBeautyVideoFrame2.texture;
            if (tXThirdTexture != null) {
                v2TXLiveVideoFrame2.texture.textureId = tXThirdTexture.textureId;
            }
            v2TXLiveVideoFrame2.data = createCustomBeautyVideoFrame2.data;
            v2TXLiveVideoFrame2.buffer = createCustomBeautyVideoFrame2.buffer;
            v2TXLiveVideoFrame2.width = createCustomBeautyVideoFrame2.width;
            v2TXLiveVideoFrame2.height = createCustomBeautyVideoFrame2.height;
            v2TXLiveVideoFrame2.rotation = createCustomBeautyVideoFrame2.rotation;
            return 0;
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onPushStatusUpdate(com.tencent.live2.V2TXLiveDef.V2TXLivePushStatus v2TXLivePushStatus, java.lang.String str, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("status", v2TXLivePushStatus.name());
            hashMap.put("errMsg", str);
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, com.tencent.live.utils.AndroidUtils.getMapByBundle(bundle));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePusherObserverType.getByName("onPushStatusUpdate"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onScreenCaptureStarted() {
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePusherObserverType.getByName("onScreenCaptureStarted"), java.util.Collections.emptyMap());
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onScreenCaptureStopped(int i17) {
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePusherObserverType.getByName("onScreenCaptureStopped"), java.util.Collections.emptyMap());
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onSetMixTranscodingConfig(int i17, java.lang.String str) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(i17));
            hashMap.put("errMsg", str);
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePusherObserverType.getByName("onSetMixTranscodingConfig"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onSnapshotComplete(android.graphics.Bitmap bitmap) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("image", byteArray);
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePusherObserverType.getByName("onSnapshotComplete"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onStatisticsUpdate(com.tencent.live2.V2TXLiveDef.V2TXLivePusherStatistics v2TXLivePusherStatistics) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("appCpu", java.lang.Integer.valueOf(v2TXLivePusherStatistics.appCpu));
            hashMap.put("systemCpu", java.lang.Integer.valueOf(v2TXLivePusherStatistics.systemCpu));
            hashMap.put("width", java.lang.Integer.valueOf(v2TXLivePusherStatistics.width));
            hashMap.put("height", java.lang.Integer.valueOf(v2TXLivePusherStatistics.height));
            hashMap.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, java.lang.Integer.valueOf(v2TXLivePusherStatistics.fps));
            hashMap.put("videoBitrate", java.lang.Integer.valueOf(v2TXLivePusherStatistics.videoBitrate));
            hashMap.put("audioBitrate", java.lang.Integer.valueOf(v2TXLivePusherStatistics.audioBitrate));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePusherObserverType.getByName("onStatisticsUpdate"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onWarning(int i17, java.lang.String str, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(i17));
            hashMap.put("errMsg", str);
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, com.tencent.live.utils.AndroidUtils.getMapByBundle(bundle));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePusherObserverType.getByName("onWarning"), hashMap);
        }
    }

    /* loaded from: classes16.dex */
    public class V2TXMusicPlayObserverImpl implements com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver {
        public V2TXMusicPlayObserverImpl() {
        }

        public void invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePusherObserverType v2TXLivePusherObserverType, java.util.Map map) {
            v2TXLivePusherObserverType.getName();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("type", v2TXLivePusherObserverType.getName());
            if (map != null) {
                hashMap.put("params", map);
            }
            if (com.tencent.live.plugin.V2TXLivePusherPlugin.this.mChannel != null) {
                com.tencent.live.plugin.V2TXLivePusherPlugin.this.mChannel.invokeMethod("onPusherListener", hashMap);
            }
        }

        @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
        public void onComplete(int i17, int i18) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(dm.i4.COL_ID, java.lang.Integer.valueOf(i17));
            hashMap.put("errCode", java.lang.Integer.valueOf(i18));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePusherObserverType.getByName("onMusicObserverComplete"), hashMap);
        }

        @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
        public void onPlayProgress(int i17, long j17, long j18) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(dm.i4.COL_ID, java.lang.Integer.valueOf(i17));
            hashMap.put("progressMs", java.lang.Long.valueOf(j17));
            hashMap.put("durationMs", java.lang.Long.valueOf(j18));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePusherObserverType.getByName("onMusicObserverPlayProgress"), hashMap);
        }

        @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
        public void onStart(int i17, int i18) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(dm.i4.COL_ID, java.lang.Integer.valueOf(i17));
            hashMap.put("errCode", java.lang.Integer.valueOf(i18));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePusherObserverType.getByName("onMusicObserverStart"), hashMap);
        }
    }

    public V2TXLivePusherPlugin(java.lang.String str, int i17, io.flutter.plugin.common.BinaryMessenger binaryMessenger, android.content.Context context, io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets flutterAssets, com.tencent.live.view.V2LiveRenderViewFactory v2LiveRenderViewFactory) {
        this.mMessenger = binaryMessenger;
        this.mIdentifier = str;
        this.mContext = context;
        this.mFlutterAssets = flutterAssets;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(binaryMessenger, "pusher_" + this.mIdentifier);
        this.mChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        if (i17 == 0) {
            this.mPusher = new com.tencent.live2.impl.V2TXLivePusherImpl(this.mContext, com.tencent.live2.V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTMP);
        } else {
            this.mPusher = new com.tencent.live2.impl.V2TXLivePusherImpl(this.mContext, com.tencent.live2.V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTC);
        }
        this.mPusher.setObserver(new com.tencent.live.plugin.V2TXLivePusherPlugin.V2TXLivePusherObserverImpl());
        this.mTXRenderViewFactory = v2LiveRenderViewFactory;
        this.mTXBeautyManager = this.mPusher.getBeautyManager();
        this.mTXDeviceManager = this.mPusher.getDeviceManager();
        this.mTXAudioEffectManager = this.mPusher.getAudioEffectManager();
    }

    private static com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType convertV2LiveBufferType(com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyBufferType tXCustomBeautyBufferType) {
        int i17 = com.tencent.live.plugin.V2TXLivePusherPlugin.AnonymousClass5.$SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyBufferType[tXCustomBeautyBufferType.ordinal()];
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeUnknown : com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture : com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray : com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer : com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeUnknown;
    }

    private static final com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat convertV2LivePixelFormat(com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyPixelFormat tXCustomBeautyPixelFormat) {
        int i17 = com.tencent.live.plugin.V2TXLivePusherPlugin.AnonymousClass5.$SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyPixelFormat[tXCustomBeautyPixelFormat.ordinal()];
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatUnknown : com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D : com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420 : com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatUnknown;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyVideoFrame createCustomBeautyVideoFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyVideoFrame tXCustomBeautyVideoFrame = new com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyVideoFrame();
        com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat = v2TXLiveVideoFrame.pixelFormat;
        if (v2TXLivePixelFormat == com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatUnknown) {
            tXCustomBeautyVideoFrame.pixelFormat = com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyPixelFormat.TXCustomBeautyPixelFormatUnknown;
        } else if (v2TXLivePixelFormat == com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420) {
            tXCustomBeautyVideoFrame.pixelFormat = com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyPixelFormat.TXCustomBeautyPixelFormatI420;
        } else if (v2TXLivePixelFormat == com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D) {
            tXCustomBeautyVideoFrame.pixelFormat = com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyPixelFormat.TXCustomBeautyPixelFormatTexture2D;
        }
        com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType = v2TXLiveVideoFrame.bufferType;
        if (v2TXLiveBufferType == com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeUnknown) {
            tXCustomBeautyVideoFrame.bufferType = com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeUnknown;
        } else if (v2TXLiveBufferType == com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray) {
            tXCustomBeautyVideoFrame.bufferType = com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeByteArray;
        } else if (v2TXLiveBufferType == com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer) {
            tXCustomBeautyVideoFrame.bufferType = com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeByteBuffer;
        } else if (v2TXLiveBufferType == com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture) {
            tXCustomBeautyVideoFrame.bufferType = com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeTexture;
        }
        if (v2TXLiveVideoFrame.texture != null) {
            com.tencent.live.beauty.custom.TXCustomBeautyDef.TXThirdTexture tXThirdTexture = new com.tencent.live.beauty.custom.TXCustomBeautyDef.TXThirdTexture();
            tXCustomBeautyVideoFrame.texture = tXThirdTexture;
            com.tencent.live2.V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = v2TXLiveVideoFrame.texture;
            tXThirdTexture.textureId = v2TXLiveTexture.textureId;
            tXThirdTexture.eglContext10 = v2TXLiveTexture.eglContext10;
            tXThirdTexture.eglContext14 = v2TXLiveTexture.eglContext14;
        }
        tXCustomBeautyVideoFrame.data = v2TXLiveVideoFrame.data;
        tXCustomBeautyVideoFrame.buffer = v2TXLiveVideoFrame.buffer;
        tXCustomBeautyVideoFrame.width = v2TXLiveVideoFrame.width;
        tXCustomBeautyVideoFrame.height = v2TXLiveVideoFrame.height;
        tXCustomBeautyVideoFrame.rotation = v2TXLiveVideoFrame.rotation;
        return tXCustomBeautyVideoFrame;
    }

    private com.tencent.live2.V2TXLiveDef.V2TXLiveTranscodingConfig getMixTranscodingConfigByMap(java.util.Map map) {
        java.util.List list;
        if (map == null || map.isEmpty()) {
            return null;
        }
        com.tencent.live2.V2TXLiveDef.V2TXLiveTranscodingConfig v2TXLiveTranscodingConfig = new com.tencent.live2.V2TXLiveDef.V2TXLiveTranscodingConfig();
        if (map.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH)) {
            v2TXLiveTranscodingConfig.videoWidth = ((java.lang.Integer) map.get(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH)).intValue();
        }
        if (map.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT)) {
            v2TXLiveTranscodingConfig.videoHeight = ((java.lang.Integer) map.get(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT)).intValue();
        }
        if (map.containsKey("videoBitrate")) {
            v2TXLiveTranscodingConfig.videoBitrate = ((java.lang.Integer) map.get("videoBitrate")).intValue();
        }
        if (map.containsKey("videoFramerate")) {
            v2TXLiveTranscodingConfig.videoFramerate = ((java.lang.Integer) map.get("videoFramerate")).intValue();
        }
        if (map.containsKey("videoGOP")) {
            v2TXLiveTranscodingConfig.videoGOP = ((java.lang.Integer) map.get("videoGOP")).intValue();
        }
        if (map.containsKey("backgroundColor")) {
            v2TXLiveTranscodingConfig.backgroundColor = ((java.lang.Integer) map.get("backgroundColor")).intValue();
        }
        if (map.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE)) {
            v2TXLiveTranscodingConfig.backgroundImage = (java.lang.String) map.get(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE);
        }
        if (map.containsKey("audioSampleRate")) {
            v2TXLiveTranscodingConfig.audioSampleRate = ((java.lang.Integer) map.get("audioSampleRate")).intValue();
        }
        if (map.containsKey("audioBitrate")) {
            v2TXLiveTranscodingConfig.audioBitrate = ((java.lang.Integer) map.get("audioBitrate")).intValue();
        }
        if (map.containsKey("audioChannels")) {
            v2TXLiveTranscodingConfig.audioChannels = ((java.lang.Integer) map.get("audioChannels")).intValue();
        }
        if (map.containsKey("mixStreams") && (list = (java.util.List) map.get("mixStreams")) != null && list.size() > 0) {
            v2TXLiveTranscodingConfig.mixStreams = getV2TXLiveMixStreamByList(list);
        }
        if (v2TXLiveTranscodingConfig.mixStreams == null) {
            v2TXLiveTranscodingConfig.mixStreams = new java.util.ArrayList<>();
        }
        if (map.containsKey("outputStreamId")) {
            v2TXLiveTranscodingConfig.outputStreamId = (java.lang.String) map.get("outputStreamId");
        }
        return v2TXLiveTranscodingConfig;
    }

    private java.util.ArrayList<com.tencent.live2.V2TXLiveDef.V2TXLiveMixStream> getV2TXLiveMixStreamByList(java.util.List list) {
        java.util.ArrayList<com.tencent.live2.V2TXLiveDef.V2TXLiveMixStream> arrayList = new java.util.ArrayList<>();
        if (list == null) {
            return arrayList;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.util.Map map = (java.util.Map) list.get(i17);
            com.tencent.live2.V2TXLiveDef.V2TXLiveMixStream v2TXLiveMixStream = new com.tencent.live2.V2TXLiveDef.V2TXLiveMixStream();
            if (map.containsKey("userId")) {
                v2TXLiveMixStream.userId = (java.lang.String) map.get("userId");
            }
            if (map.containsKey("streamId")) {
                v2TXLiveMixStream.streamId = (java.lang.String) map.get("streamId");
            }
            if (map.containsKey("x")) {
                v2TXLiveMixStream.f47188x = ((java.lang.Integer) map.get("x")).intValue();
            }
            if (map.containsKey("y")) {
                v2TXLiveMixStream.f47189y = ((java.lang.Integer) map.get("y")).intValue();
            }
            if (map.containsKey("width")) {
                v2TXLiveMixStream.width = ((java.lang.Integer) map.get("width")).intValue();
            }
            if (map.containsKey("height")) {
                v2TXLiveMixStream.height = ((java.lang.Integer) map.get("height")).intValue();
            }
            if (map.containsKey("zOrder")) {
                v2TXLiveMixStream.zOrder = ((java.lang.Integer) map.get("zOrder")).intValue();
            }
            if (map.containsKey("inputType")) {
                v2TXLiveMixStream.inputType = com.tencent.live.utils.EnumUtils.getV2TXLiveMixInputType(((java.lang.Integer) map.get("inputType")).intValue());
            }
            arrayList.add(v2TXLiveMixStream);
        }
        return arrayList;
    }

    private void setFramework() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.tencent.shadow.core.common.HostConstants.FRAMEWORK_APPID, 23);
            jSONObject.put("component", 1);
            this.mPusher.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetFramework, jSONObject.toString());
        } catch (org.json.JSONException unused) {
        }
    }

    public void destroy() {
        this.mPusher.setObserver(null);
        this.mChannel.setMethodCallHandler(null);
    }

    public void enableCameraAutoFocus(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXDeviceManager.enableCameraAutoFocus(((java.lang.Boolean) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "enable")).booleanValue())));
    }

    public void enableCameraTorch(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Boolean.valueOf(this.mTXDeviceManager.enableCameraTorch(((java.lang.Boolean) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "enable")).booleanValue())));
    }

    public void enableCustomAudioCapture(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.enableCustomAudioCapture(((java.lang.Boolean) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "enable")).booleanValue())));
    }

    public void enableCustomVideoCapture(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.enableCustomVideoCapture(((java.lang.Boolean) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "enable")).booleanValue())));
    }

    public void enableCustomVideoProcess(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        boolean booleanValue = ((java.lang.Boolean) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "enable")).booleanValue();
        com.tencent.live.beauty.custom.ITXCustomBeautyProcesserFactory beautyProcesserFactory = com.tencent.live.TXLivePluginManager.getBeautyProcesserFactory();
        if (beautyProcesserFactory == null) {
            result.error("Missing parameter", "beautyInstance is null!!!", java.lang.Integer.valueOf(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_VALUEISNULL));
            return;
        }
        com.tencent.live.beauty.custom.ITXCustomBeautyProcesser createCustomBeautyProcesser = beautyProcesserFactory.createCustomBeautyProcesser();
        this.mCustomBeautyProcesser = createCustomBeautyProcesser;
        com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyBufferType supportedBufferType = createCustomBeautyProcesser.getSupportedBufferType();
        result.success(java.lang.Integer.valueOf(this.mPusher.enableCustomVideoProcess(booleanValue, convertV2LivePixelFormat(this.mCustomBeautyProcesser.getSupportedPixelFormat()), convertV2LiveBufferType(supportedBufferType))));
    }

    public void enableSharpnessEnhancement(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXBeautyManager.enableSharpnessEnhancement(((java.lang.Boolean) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "enable")).booleanValue());
        result.success(null);
    }

    public void enableVoiceEarMonitor(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXAudioEffectManager.enableVoiceEarMonitor(((java.lang.Boolean) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "enable")).booleanValue());
        result.success(null);
    }

    public void enableVolumeEvaluation(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.enableVolumeEvaluation(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "intervalMs")).intValue())));
    }

    public void getAudioEffectManager(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXAudioEffectManager = this.mPusher.getAudioEffectManager();
        result.success(0);
    }

    public void getBeautyManager(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXBeautyManager = this.mPusher.getBeautyManager();
        result.success(0);
    }

    public void getCameraZoomMaxRatio(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Float.valueOf(this.mTXDeviceManager.getCameraZoomMaxRatio()));
    }

    public void getDeviceManager(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXDeviceManager = this.mPusher.getDeviceManager();
        result.success(0);
    }

    public void getMusicCurrentPosInMS(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Long.valueOf(this.mTXAudioEffectManager.getMusicCurrentPosInMS(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getParamCanBeNull(methodCall, result, dm.i4.COL_ID)).intValue())));
    }

    public void getMusicDurationInMS(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Long.valueOf(this.mTXAudioEffectManager.getMusicDurationInMS((java.lang.String) com.tencent.live.utils.MethodUtils.getParamCanBeNull(methodCall, result, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH))));
    }

    public void isAutoFocusEnabled(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Boolean.valueOf(this.mTXDeviceManager.isAutoFocusEnabled()));
    }

    public void isFrontCamera(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Boolean.valueOf(this.mTXDeviceManager.isFrontCamera()));
    }

    public void isPushing(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.isPushing()));
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        com.tencent.live.utils.Logger.pusherPrint(this.mPusher, 2, "V2TXLivePusherPlugin, onMethodCall -> method:" + methodCall.method + ", arguments:" + methodCall.arguments);
        try {
            com.tencent.live.plugin.V2TXLivePusherPlugin.class.getDeclaredMethod(methodCall.method, io.flutter.plugin.common.MethodCall.class, io.flutter.plugin.common.MethodChannel.Result.class).invoke(this, methodCall, result);
        } catch (java.lang.IllegalAccessException e17) {
            com.tencent.live.utils.Logger.pusherPrint(this.mPusher, 4, "V2TXLivePusherPlugin, method=" + methodCall.method + "|arguments=" + methodCall.arguments + "|error=" + e17);
        } catch (java.lang.NoSuchMethodException e18) {
            com.tencent.live.utils.Logger.pusherPrint(this.mPusher, 4, "V2TXLivePusherPlugin, method=" + methodCall.method + "|arguments=" + methodCall.arguments + "|error=" + e18);
        } catch (java.lang.Exception e19) {
            com.tencent.live.utils.Logger.pusherPrint(this.mPusher, 4, "V2TXLivePusherPlugin, method=" + methodCall.method + "|arguments=" + methodCall.arguments + "|error=" + e19);
        }
    }

    public void pauseAudio(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.pauseAudio()));
    }

    public void pausePlayMusic(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXAudioEffectManager.pausePlayMusic(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getParamCanBeNull(methodCall, result, dm.i4.COL_ID)).intValue());
        result.success(null);
    }

    public void pauseVideo(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.pauseVideo()));
    }

    public void resumeAudio(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.resumeAudio()));
    }

    public void resumePlayMusic(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXAudioEffectManager.resumePlayMusic(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getParamCanBeNull(methodCall, result, dm.i4.COL_ID)).intValue());
        result.success(null);
    }

    public void resumeVideo(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.resumeVideo()));
    }

    public void seekMusicToPosInMS(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXAudioEffectManager.seekMusicToPosInMS(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getParamCanBeNull(methodCall, result, dm.i4.COL_ID)).intValue(), ((java.lang.Integer) com.tencent.live.utils.MethodUtils.getParamCanBeNull(methodCall, result, "pts")).intValue());
        result.success(null);
    }

    public int sendCustomAudioFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
        return -1;
    }

    public int sendCustomVideoFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return -1;
    }

    public void sendSeiMessage(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.sendSeiMessage(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "payloadType")).intValue(), (byte[]) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA))));
    }

    public void setAllMusicVolume(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXAudioEffectManager.setAllMusicVolume(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getParamCanBeNull(methodCall, result, "volume")).intValue());
        result.success(null);
    }

    public void setAudioQuality(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.setAudioQuality(com.tencent.live.utils.EnumUtils.getV2TXLiveAudioQuality(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "quality")).intValue()))));
    }

    public void setAudioRoute(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXDeviceManager.setAudioRoute(com.tencent.live.utils.EnumUtils.getTXAudioRoute(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.LOCATION_KEY_ROUTE)).intValue()))));
    }

    public void setBeautyLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXBeautyManager.setBeautyLevel(java.lang.Float.parseFloat((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "beautyLevel")));
        result.success(null);
    }

    public void setBeautyStyle(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXBeautyManager.setBeautyStyle(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY_STYLE)).intValue());
        result.success(null);
    }

    public void setCameraFocusPosition(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXDeviceManager.setCameraFocusPosition(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "x")).intValue(), ((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "y")).intValue());
        result.success(null);
    }

    public void setCameraZoomRatio(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXDeviceManager.setCameraZoomRatio(java.lang.Float.parseFloat((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "value")))));
    }

    public void setChinLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setChinLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "chinLevel")).intValue())));
    }

    public void setEncoderMirror(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.setEncoderMirror(((java.lang.Boolean) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MIRROR)).booleanValue())));
    }

    public void setEyeAngleLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setEyeAngleLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "eyeAngleLevel")).intValue())));
    }

    public void setEyeDistanceLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setEyeDistanceLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "eyeDistanceLevel")).intValue())));
    }

    public void setEyeLightenLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setEyeLightenLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "eyeLightenLevel")).intValue())));
    }

    public void setEyeScaleLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setEyeScaleLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "eyeScaleLevel")).intValue())));
    }

    public void setFaceBeautyLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setFaceBeautyLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "faceBeautyLevel")).intValue())));
    }

    public void setFaceNarrowLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setFaceNarrowLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, ya.b.LEVEL)).intValue())));
    }

    public void setFaceShortLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setFaceShortLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "faceShortLevel")).intValue())));
    }

    public void setFaceSlimLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setFaceSlimLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "faceSlimLevel")).intValue())));
    }

    public void setFaceVLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setFaceVLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "faceVLevel")).intValue())));
    }

    public void setFilter(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        android.graphics.Bitmap decodeStream;
        java.lang.String str = (java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "type");
        final java.lang.String str2 = (java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "imageUrl");
        if (str.equals("network")) {
            new java.lang.Thread() { // from class: com.tencent.live.plugin.V2TXLivePusherPlugin.3
                private byte _hellAccFlag_;

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str2).openConnection();
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.connect();
                        java.io.InputStream inputStream = httpURLConnection.getInputStream();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(inputStream);
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj, arrayList.toArray(), "com/tencent/live/plugin/V2TXLivePusherPlugin$3", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap decodeStream2 = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0));
                        yj0.a.e(obj, decodeStream2, "com/tencent/live/plugin/V2TXLivePusherPlugin$3", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                        com.tencent.live.plugin.V2TXLivePusherPlugin.this.mTXBeautyManager.setFilter(decodeStream2);
                    } catch (java.io.IOException e17) {
                        com.tencent.liteav.basic.log.TXCLog.e(com.tencent.live.plugin.V2TXLivePusherPlugin.TAG, "|method=setFilter|error=" + e17);
                    }
                }
            }.start();
        } else {
            try {
                if (str2.startsWith("/")) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(str2);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/live/plugin/V2TXLivePusherPlugin", "setFilter", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                    decodeStream = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
                    yj0.a.e(obj, decodeStream, "com/tencent/live/plugin/V2TXLivePusherPlugin", "setFilter", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                } else {
                    java.io.InputStream open = this.mContext.getAssets().open(this.mFlutterAssets.getAssetFilePathByName(str2));
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(open);
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/live/plugin/V2TXLivePusherPlugin", "setFilter", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                    decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList2.get(0));
                    yj0.a.e(obj2, decodeStream, "com/tencent/live/plugin/V2TXLivePusherPlugin", "setFilter", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                }
                this.mTXBeautyManager.setFilter(decodeStream);
            } catch (java.lang.Exception e17) {
                com.tencent.liteav.basic.log.TXCLog.e(TAG, "|method=setFilter|error=" + e17);
            }
        }
        result.success(null);
    }

    public void setFilterStrength(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXBeautyManager.setFilterStrength(java.lang.Float.parseFloat((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "strength")));
        result.success(null);
    }

    public void setForeheadLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setForeheadLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "foreheadLevel")).intValue())));
    }

    public void setGreenScreenFile(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setGreenScreenFile((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH))));
    }

    public void setLipsThicknessLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setLipsThicknessLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "lipsThicknessLevel")).intValue())));
    }

    public void setMixTranscodingConfig(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        com.tencent.live2.V2TXLiveDef.V2TXLiveTranscodingConfig mixTranscodingConfigByMap = getMixTranscodingConfigByMap((java.util.Map) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "config"));
        new com.google.gson.i().g(mixTranscodingConfigByMap);
        result.success(java.lang.Integer.valueOf(this.mPusher.setMixTranscodingConfig(mixTranscodingConfigByMap)));
    }

    public void setMotionMute(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXBeautyManager.setMotionMute(((java.lang.Boolean) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "motionMute")).booleanValue());
        result.success(null);
    }

    public void setMotionTmpl(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXBeautyManager.setMotionTmpl((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "tmplPath"));
        result.success(null);
    }

    public void setMouthShapeLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setMouthShapeLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "mouthShapeLevel")).intValue())));
    }

    public void setMusicObserver(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXAudioEffectManager.setMusicObserver(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "musicId")).intValue(), new com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver() { // from class: com.tencent.live.plugin.V2TXLivePusherPlugin.4
            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public void onComplete(int i17, int i18) {
            }

            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public void onPlayProgress(int i17, long j17, long j18) {
            }

            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public void onStart(int i17, int i18) {
            }
        });
        result.success(null);
    }

    public void setMusicPitch(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXAudioEffectManager.setMusicPitch(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getParamCanBeNull(methodCall, result, dm.i4.COL_ID)).intValue(), java.lang.Float.parseFloat((java.lang.String) com.tencent.live.utils.MethodUtils.getParamCanBeNull(methodCall, result, "pitch")));
        result.success(null);
    }

    public void setMusicPlayoutVolume(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXAudioEffectManager.setMusicPlayoutVolume(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getParamCanBeNull(methodCall, result, dm.i4.COL_ID)).intValue(), ((java.lang.Integer) com.tencent.live.utils.MethodUtils.getParamCanBeNull(methodCall, result, "volume")).intValue());
        result.success(null);
    }

    public void setMusicPublishVolume(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXAudioEffectManager.setMusicPublishVolume(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getParamCanBeNull(methodCall, result, dm.i4.COL_ID)).intValue(), ((java.lang.Integer) com.tencent.live.utils.MethodUtils.getParamCanBeNull(methodCall, result, "volume")).intValue());
        result.success(null);
    }

    public void setMusicSpeedRate(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXAudioEffectManager.setMusicSpeedRate(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getParamCanBeNull(methodCall, result, dm.i4.COL_ID)).intValue(), java.lang.Float.parseFloat((java.lang.String) com.tencent.live.utils.MethodUtils.getParamCanBeNull(methodCall, result, "speedRate")));
        result.success(null);
    }

    public void setNosePositionLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setNosePositionLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "nosePositionLevel")).intValue())));
    }

    public void setNoseSlimLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setNoseSlimLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "noseSlimLevel")).intValue())));
    }

    public void setNoseWingLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setNoseWingLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "noseWingLevel")).intValue())));
    }

    public void setObserver(com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver) {
    }

    public void setPounchRemoveLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setPounchRemoveLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "pounchRemoveLevel")).intValue())));
    }

    public void setProperty(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.setProperty((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "key"), com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "value"))));
    }

    public void setRenderMirror(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.setRenderMirror(com.tencent.live.utils.EnumUtils.getV2TXLiveMirrorType(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "mirrorType")).intValue()))));
    }

    public void setRenderRotation(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.setRenderRotation(com.tencent.live.utils.EnumUtils.getV2TXLiveRotation(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "rotation")).intValue()))));
    }

    public int setRenderView(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        int renderView = this.mPusher.setRenderView((com.tencent.rtmp.ui.TXCloudVideoView) this.mTXRenderViewFactory.getViewById(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, dm.i4.COL_ID)).intValue()).getView());
        result.success(java.lang.Integer.valueOf(renderView));
        return renderView;
    }

    public void setRuddyLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXBeautyManager.setRuddyLevel(java.lang.Float.parseFloat((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "ruddyLevel")));
        result.success(null);
    }

    public void setSmileLinesRemoveLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setSmileLinesRemoveLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "smileLinesRemoveLevel")).intValue())));
    }

    public void setSystemVolumeType(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXDeviceManager.setSystemVolumeType(com.tencent.live.utils.EnumUtils.getTXSystemVolumeType(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "type")).intValue()))));
    }

    public void setToothWhitenLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setToothWhitenLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "toothWhitenLevel")).intValue())));
    }

    public void setVideoQuality(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        int intValue = ((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "videoFps")).intValue();
        int intValue2 = ((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "videoBitrate")).intValue();
        int intValue3 = ((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "minVideoBitrate")).intValue();
        int intValue4 = ((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "videoResolution")).intValue();
        int intValue5 = ((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "videoResolutionMode")).intValue();
        com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolution v2TXLiveVideoResolution = com.tencent.live.utils.EnumUtils.getV2TXLiveVideoResolution(intValue4);
        com.tencent.live2.V2TXLiveDef.V2TXLiveVideoResolutionMode v2TXLiveVideoResolutionMode = com.tencent.live.utils.EnumUtils.getV2TXLiveVideoResolutionMode(intValue5);
        com.tencent.live2.V2TXLiveDef.V2TXLiveVideoEncoderParam v2TXLiveVideoEncoderParam = new com.tencent.live2.V2TXLiveDef.V2TXLiveVideoEncoderParam(v2TXLiveVideoResolution);
        v2TXLiveVideoEncoderParam.minVideoBitrate = intValue3;
        v2TXLiveVideoEncoderParam.videoBitrate = intValue2;
        v2TXLiveVideoEncoderParam.videoFps = intValue;
        v2TXLiveVideoEncoderParam.videoResolutionMode = v2TXLiveVideoResolutionMode;
        result.success(java.lang.Integer.valueOf(this.mPusher.setVideoQuality(v2TXLiveVideoEncoderParam)));
    }

    public void setVoiceCaptureVolume(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXAudioEffectManager.setVoiceCaptureVolume(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "volume")).intValue());
        result.success(null);
    }

    public void setVoiceChangerType(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXAudioEffectManager.setVoiceChangerType(com.tencent.live.utils.EnumUtils.getTXVoiceChangerType(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "type")).intValue()));
        result.success(null);
    }

    public void setVoiceEarMonitorVolume(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXAudioEffectManager.setVoiceEarMonitorVolume(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "volume")).intValue());
        result.success(null);
    }

    public void setVoicePitch(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXAudioEffectManager.setVoicePitch(java.lang.Double.parseDouble((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "pitch")));
        result.success(null);
    }

    public void setVoiceReverbType(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXAudioEffectManager.setVoiceReverbType(com.tencent.live.utils.EnumUtils.getTXVoiceReverbType(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "type")).intValue()));
        result.success(null);
    }

    public void setWatermark(io.flutter.plugin.common.MethodCall methodCall, final io.flutter.plugin.common.MethodChannel.Result result) {
        android.graphics.Bitmap bitmap;
        final java.lang.String str = (java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "image");
        java.lang.String str2 = (java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "type");
        final float parseFloat = java.lang.Float.parseFloat((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "x"));
        final float parseFloat2 = java.lang.Float.parseFloat((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "y"));
        final float parseFloat3 = java.lang.Float.parseFloat((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "scale"));
        if (str2.equals("network")) {
            new java.lang.Thread() { // from class: com.tencent.live.plugin.V2TXLivePusherPlugin.2
                private byte _hellAccFlag_;

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.connect();
                        java.io.InputStream inputStream = httpURLConnection.getInputStream();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(inputStream);
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj, arrayList.toArray(), "com/tencent/live/plugin/V2TXLivePusherPlugin$2", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0));
                        yj0.a.e(obj, decodeStream, "com/tencent/live/plugin/V2TXLivePusherPlugin$2", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                        result.success(java.lang.Integer.valueOf(com.tencent.live.plugin.V2TXLivePusherPlugin.this.mPusher.setWatermark(decodeStream, parseFloat, parseFloat2, parseFloat3)));
                    } catch (java.io.IOException e17) {
                        e17.toString();
                    }
                }
            }.start();
            return;
        }
        try {
            if (str.startsWith("/")) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/live/plugin/V2TXLivePusherPlugin", "setWatermark", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                bitmap = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
                yj0.a.e(obj, bitmap, "com/tencent/live/plugin/V2TXLivePusherPlugin", "setWatermark", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            } else {
                java.io.InputStream open = this.mContext.getAssets().open(this.mFlutterAssets.getAssetFilePathByName(str));
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(open);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/live/plugin/V2TXLivePusherPlugin", "setWatermark", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList2.get(0));
                yj0.a.e(obj2, decodeStream, "com/tencent/live/plugin/V2TXLivePusherPlugin", "setWatermark", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                bitmap = decodeStream;
            }
            result.success(java.lang.Integer.valueOf(this.mPusher.setWatermark(bitmap, parseFloat, parseFloat2, parseFloat3)));
        } catch (java.lang.Exception e17) {
            e17.toString();
        }
    }

    public void setWhitenessLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mTXBeautyManager.setWhitenessLevel(java.lang.Float.parseFloat((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "whitenessLevel")));
        result.success(null);
    }

    public void setWrinkleRemoveLevel(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXBeautyManager.setWrinkleRemoveLevel(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "wrinkleRemoveLevel")).intValue())));
    }

    public void showDebugView(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mPusher.showDebugView(((java.lang.Boolean) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "isShow")).booleanValue());
        result.success(0);
    }

    public void snapshot(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.snapshot()));
    }

    public void startCamera(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        if (b3.l.checkSelfPermission(this.mContext, "android.permission.CAMERA") != 0) {
            result.success(-1314);
        } else {
            result.success(java.lang.Integer.valueOf(this.mPusher.startCamera(((java.lang.Boolean) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "frontCamera")).booleanValue())));
        }
    }

    public void startMicrophone(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        if (b3.l.checkSelfPermission(this.mContext, "android.permission.RECORD_AUDIO") != 0) {
            result.success(-1317);
        } else {
            result.success(java.lang.Integer.valueOf(this.mPusher.startMicrophone()));
        }
    }

    public void startPlayMusic(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam = (com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam) new com.google.gson.i().b((java.lang.String) com.tencent.live.utils.MethodUtils.getParamCanBeNull(methodCall, result, "musicParam"), com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam.class);
        this.mTXAudioEffectManager.setMusicObserver(audioMusicParam.f46245id, new com.tencent.live.plugin.V2TXLivePusherPlugin.V2TXMusicPlayObserverImpl());
        result.success(java.lang.Boolean.valueOf(this.mTXAudioEffectManager.startPlayMusic(audioMusicParam)));
    }

    public void startPush(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        setFramework();
        result.success(java.lang.Integer.valueOf(this.mPusher.startPush((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "url"))));
    }

    public void startScreenCapture(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.startScreenCapture()));
    }

    public void startVirtualCamera(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        android.graphics.Bitmap decodeStream;
        java.lang.String str = (java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "type");
        final java.lang.String str2 = (java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "imageUrl");
        if (str.equals("network")) {
            new java.lang.Thread() { // from class: com.tencent.live.plugin.V2TXLivePusherPlugin.1
                private byte _hellAccFlag_;

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str2).openConnection();
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.connect();
                        java.io.InputStream inputStream = httpURLConnection.getInputStream();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(inputStream);
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj, arrayList.toArray(), "com/tencent/live/plugin/V2TXLivePusherPlugin$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap decodeStream2 = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0));
                        yj0.a.e(obj, decodeStream2, "com/tencent/live/plugin/V2TXLivePusherPlugin$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                        com.tencent.live.plugin.V2TXLivePusherPlugin.this.mPusher.startVirtualCamera(decodeStream2);
                    } catch (java.io.IOException e17) {
                        e17.toString();
                    }
                }
            }.start();
        } else {
            try {
                if (str2.startsWith("/")) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(str2);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/live/plugin/V2TXLivePusherPlugin", "startVirtualCamera", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                    decodeStream = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
                    yj0.a.e(obj, decodeStream, "com/tencent/live/plugin/V2TXLivePusherPlugin", "startVirtualCamera", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                } else {
                    java.io.InputStream open = this.mContext.getAssets().open(this.mFlutterAssets.getAssetFilePathByName(str2));
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(open);
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/live/plugin/V2TXLivePusherPlugin", "startVirtualCamera", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                    decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList2.get(0));
                    yj0.a.e(obj2, decodeStream, "com/tencent/live/plugin/V2TXLivePusherPlugin", "startVirtualCamera", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                }
                this.mPusher.startVirtualCamera(decodeStream);
            } catch (java.lang.Exception e17) {
                e17.toString();
            }
        }
        result.success(null);
    }

    public void stopCamera(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mPusher.stopCamera();
        result.success(0);
    }

    public void stopMicrophone(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.stopMicrophone()));
    }

    public void stopPlayMusic(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        int intValue = ((java.lang.Integer) com.tencent.live.utils.MethodUtils.getParamCanBeNull(methodCall, result, dm.i4.COL_ID)).intValue();
        this.mTXAudioEffectManager.setMusicObserver(intValue, null);
        this.mTXAudioEffectManager.stopPlayMusic(intValue);
        result.success(null);
    }

    public void stopPush(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.stopPush()));
    }

    public void stopScreenCapture(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.stopScreenCapture()));
    }

    public void stopVirtualCamera(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPusher.stopVirtualCamera()));
    }

    public void switchCamera(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mTXDeviceManager.switchCamera(((java.lang.Boolean) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "isFrontCamera")).booleanValue())));
    }
}
