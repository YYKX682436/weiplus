package com.tencent.live.plugin;

/* loaded from: classes16.dex */
public class V2TXLivePlayerPlugin implements io.flutter.plugin.common.MethodChannel.MethodCallHandler {
    private static final java.lang.String TAG = "V2TXLivePlayerPlugin";
    private static final int TC_COMPONENT_PUSHER = 1;
    private static final int TC_FRAMEWORK_LIVE = 23;
    private io.flutter.plugin.common.MethodChannel mChannel;
    private android.content.Context mContext;
    private java.lang.String mIdentifier;
    private io.flutter.plugin.common.BinaryMessenger mMessenger;
    private com.tencent.live2.V2TXLivePlayer mPlayer;
    private io.flutter.view.TextureRegistry.SurfaceProducer mSurfaceTextureEntry;
    private com.tencent.live.view.V2LiveRenderViewFactory mTXRenderViewFactory;
    private io.flutter.view.TextureRegistry mTextureRegistry;
    private int mRenderWidth = 0;
    private int mRenderHeight = 0;
    private int mVideoWidth = 0;
    private int mVideoHeight = 0;

    /* loaded from: classes16.dex */
    public class V2TXLivePlayerObserverImpl extends com.tencent.live2.V2TXLivePlayerObserver {
        public V2TXLivePlayerObserverImpl() {
        }

        public void invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePlayerObserverType v2TXLivePlayerObserverType, java.util.Map map) {
            v2TXLivePlayerObserverType.getName();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("type", v2TXLivePlayerObserverType.getName());
            if (map != null) {
                hashMap.put("params", map);
            }
            com.tencent.live.plugin.V2TXLivePlayerPlugin.this.mChannel.invokeMethod("onPlayerListener", hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onAudioLoading(com.tencent.live2.V2TXLivePlayer v2TXLivePlayer, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, com.tencent.live.utils.AndroidUtils.getMapByBundle(bundle));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePlayerObserverType.getByName("onAudioLoading"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onAudioPlaying(com.tencent.live2.V2TXLivePlayer v2TXLivePlayer, boolean z17, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("firstPlay", java.lang.Boolean.valueOf(z17));
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, com.tencent.live.utils.AndroidUtils.getMapByBundle(bundle));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePlayerObserverType.getByName("onAudioPlaying"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onConnected(com.tencent.live2.V2TXLivePlayer v2TXLivePlayer, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, com.tencent.live.utils.AndroidUtils.getMapByBundle(bundle));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePlayerObserverType.getByName("onConnected"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onError(com.tencent.live2.V2TXLivePlayer v2TXLivePlayer, int i17, java.lang.String str, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(i17));
            hashMap.put("errMsg", str);
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, com.tencent.live.utils.AndroidUtils.getMapByBundle(bundle));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePlayerObserverType.getByName("onError"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onPlayoutVolumeUpdate(com.tencent.live2.V2TXLivePlayer v2TXLivePlayer, int i17) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("volume", java.lang.Integer.valueOf(i17));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePlayerObserverType.getByName("onPlayoutVolumeUpdate"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onReceiveSeiMessage(com.tencent.live2.V2TXLivePlayer v2TXLivePlayer, int i17, byte[] bArr) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("payloadType", java.lang.Integer.valueOf(i17));
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, bArr);
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePlayerObserverType.getByName("onReceiveSeiMessage"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onRenderVideoFrame(com.tencent.live2.V2TXLivePlayer v2TXLivePlayer, com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("videoFrame", com.tencent.live.utils.MethodUtils.handleVideoFrame(v2TXLiveVideoFrame));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePlayerObserverType.getByName("onRenderVideoFrame"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onSnapshotComplete(com.tencent.live2.V2TXLivePlayer v2TXLivePlayer, android.graphics.Bitmap bitmap) {
            if (bitmap == null) {
                return;
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("image", byteArray);
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePlayerObserverType.getByName("onSnapshotComplete"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onStatisticsUpdate(com.tencent.live2.V2TXLivePlayer v2TXLivePlayer, com.tencent.live2.V2TXLiveDef.V2TXLivePlayerStatistics v2TXLivePlayerStatistics) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("appCpu", java.lang.Integer.valueOf(v2TXLivePlayerStatistics.appCpu));
            hashMap.put("systemCpu", java.lang.Integer.valueOf(v2TXLivePlayerStatistics.systemCpu));
            hashMap.put("width", java.lang.Integer.valueOf(v2TXLivePlayerStatistics.width));
            hashMap.put("height", java.lang.Integer.valueOf(v2TXLivePlayerStatistics.height));
            hashMap.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, java.lang.Integer.valueOf(v2TXLivePlayerStatistics.fps));
            hashMap.put("videoBitrate", java.lang.Integer.valueOf(v2TXLivePlayerStatistics.videoBitrate));
            hashMap.put("audioBitrate", java.lang.Integer.valueOf(v2TXLivePlayerStatistics.audioBitrate));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePlayerObserverType.getByName("onStatisticsUpdate"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onVideoLoading(com.tencent.live2.V2TXLivePlayer v2TXLivePlayer, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, com.tencent.live.utils.AndroidUtils.getMapByBundle(bundle));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePlayerObserverType.getByName("onVideoLoading"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onVideoPlaying(com.tencent.live2.V2TXLivePlayer v2TXLivePlayer, boolean z17, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("firstPlay", java.lang.Boolean.valueOf(z17));
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, com.tencent.live.utils.AndroidUtils.getMapByBundle(bundle));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePlayerObserverType.getByName("onVideoPlaying"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onVideoResolutionChanged(com.tencent.live2.V2TXLivePlayer v2TXLivePlayer, int i17, int i18) {
            if (i17 != com.tencent.live.plugin.V2TXLivePlayerPlugin.this.mVideoWidth || i18 != com.tencent.live.plugin.V2TXLivePlayerPlugin.this.mVideoHeight) {
                com.tencent.live.plugin.V2TXLivePlayerPlugin.this.mVideoWidth = i17;
                com.tencent.live.plugin.V2TXLivePlayerPlugin.this.mVideoHeight = i18;
                com.tencent.live.plugin.V2TXLivePlayerPlugin.this.updateDefaultBufferSize();
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("width", java.lang.Integer.valueOf(i17));
            hashMap.put("height", java.lang.Integer.valueOf(i18));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePlayerObserverType.getByName("onVideoResolutionChanged"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onWarning(com.tencent.live2.V2TXLivePlayer v2TXLivePlayer, int i17, java.lang.String str, android.os.Bundle bundle) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(i17));
            hashMap.put("errMsg", str);
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, com.tencent.live.utils.AndroidUtils.getMapByBundle(bundle));
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePlayerObserverType.getByName("onWarning"), hashMap);
        }
    }

    public V2TXLivePlayerPlugin(java.lang.String str, io.flutter.plugin.common.BinaryMessenger binaryMessenger, android.content.Context context, com.tencent.live.view.V2LiveRenderViewFactory v2LiveRenderViewFactory, io.flutter.view.TextureRegistry textureRegistry) {
        this.mMessenger = binaryMessenger;
        this.mIdentifier = str;
        this.mContext = context;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(binaryMessenger, "player_" + this.mIdentifier);
        this.mChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        com.tencent.live2.impl.V2TXLivePlayerImpl v2TXLivePlayerImpl = new com.tencent.live2.impl.V2TXLivePlayerImpl(this.mContext);
        this.mPlayer = v2TXLivePlayerImpl;
        v2TXLivePlayerImpl.setObserver(new com.tencent.live.plugin.V2TXLivePlayerPlugin.V2TXLivePlayerObserverImpl());
        this.mTXRenderViewFactory = v2LiveRenderViewFactory;
        this.mTextureRegistry = textureRegistry;
    }

    private void setFramework() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.tencent.shadow.core.common.HostConstants.FRAMEWORK_APPID, 23);
            jSONObject.put("component", 1);
            this.mPlayer.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetFramework, jSONObject.toString());
        } catch (org.json.JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDefaultBufferSize() {
        int i17;
        int i18;
        int i19;
        com.tencent.live.utils.Logger.playerPrint(this.mPlayer, 2, "V2TXLivePlayerPlugin, updateDefaultBufferSize: mRenderWidth-" + this.mRenderWidth + ", mRenderHeight-" + this.mRenderHeight + ", mVideoWidth-" + this.mVideoWidth + ", mVideoHeight-" + this.mVideoHeight);
        if (this.mSurfaceTextureEntry != null && (i17 = this.mRenderHeight) > 0 && (i18 = this.mRenderWidth) > 0) {
            int i27 = this.mVideoWidth;
            float f17 = 1.0f;
            if (i27 > 0 && (i19 = this.mVideoHeight) > 0) {
                f17 = java.lang.Math.max(java.lang.Math.max(i19 / i17, i27 / i18), 1.0f);
            }
            this.mSurfaceTextureEntry.setSize((int) (this.mRenderWidth * f17), (int) (this.mRenderHeight * f17));
        }
    }

    public void destroy() {
        this.mPlayer.setObserver(null);
        this.mChannel.setMethodCallHandler(null);
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = this.mSurfaceTextureEntry;
        if (surfaceProducer != null) {
            surfaceProducer.release();
            this.mSurfaceTextureEntry = null;
        }
    }

    public void enableObserveVideoFrame(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        boolean booleanValue = ((java.lang.Boolean) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "enable")).booleanValue();
        int intValue = ((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "pixelFormat")).intValue();
        int intValue2 = ((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "bufferType")).intValue();
        result.success(java.lang.Integer.valueOf(this.mPlayer.enableObserveVideoFrame(booleanValue, com.tencent.live.utils.EnumUtils.getV2TXLivePixelFormat(intValue), com.tencent.live.utils.EnumUtils.getV2TXLiveBufferType(intValue2))));
    }

    public void enablePictureInPicture(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        com.tencent.live.utils.Logger.playerPrint(this.mPlayer, 4, "V2TXLivePlayerPlugin, Not support PictureInPicture");
        result.success(-4);
    }

    public void enableReceiveSeiMessage(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPlayer.enableReceiveSeiMessage(((java.lang.Boolean) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "enable")).booleanValue(), ((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "payloadType")).intValue())));
    }

    public void enableVolumeEvaluation(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPlayer.enableVolumeEvaluation(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "intervalMs")).intValue())));
    }

    public void getTextureId(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        com.tencent.live.utils.Logger.playerPrint(this.mPlayer, 2, "V2TXLivePlayerPlugin, getTextureId: method-" + methodCall.method + ", arguments-" + methodCall.arguments);
        if (this.mSurfaceTextureEntry == null) {
            this.mSurfaceTextureEntry = this.mTextureRegistry.createSurfaceProducer();
        }
        long id6 = this.mSurfaceTextureEntry.id();
        updateDefaultBufferSize();
        this.mPlayer.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface, this.mSurfaceTextureEntry.getSurface());
        com.tencent.live.utils.Logger.playerPrint(this.mPlayer, 2, "V2TXLivePlayerPlugin, getTextureId: " + id6);
        result.success(java.lang.Long.valueOf(id6));
    }

    public void isPlaying(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPlayer.isPlaying()));
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        com.tencent.live.utils.Logger.playerPrint(this.mPlayer, 2, "V2TXLivePlayerPlugin, onMethodCall -> method:" + methodCall.method + ", arguments:" + methodCall.arguments);
        try {
            com.tencent.live.plugin.V2TXLivePlayerPlugin.class.getDeclaredMethod(methodCall.method, io.flutter.plugin.common.MethodCall.class, io.flutter.plugin.common.MethodChannel.Result.class).invoke(this, methodCall, result);
        } catch (java.lang.IllegalAccessException e17) {
            com.tencent.live.utils.Logger.playerPrint(this.mPlayer, 4, "V2TXLivePlayerPlugin, method=" + methodCall.method + "|arguments=" + methodCall.arguments + "|error=" + e17);
        } catch (java.lang.NoSuchMethodException e18) {
            com.tencent.live.utils.Logger.playerPrint(this.mPlayer, 4, "V2TXLivePlayerPlugin, method=" + methodCall.method + "|arguments=" + methodCall.arguments + "|error=" + e18);
        } catch (java.lang.Exception e19) {
            com.tencent.live.utils.Logger.playerPrint(this.mPlayer, 4, "V2TXLivePlayerPlugin, method=" + methodCall.method + "|arguments=" + methodCall.arguments + "|error=" + e19);
        }
    }

    public void pauseAudio(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPlayer.pauseAudio()));
    }

    public void pauseVideo(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPlayer.pauseVideo()));
    }

    public void resumeAudio(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPlayer.resumeAudio()));
    }

    public void resumeVideo(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPlayer.resumeVideo()));
    }

    public void setCacheParams(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPlayer.setCacheParams(java.lang.Float.parseFloat((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "minTime")), java.lang.Float.parseFloat((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "maxTime")))));
    }

    public void setObserver(com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver) {
    }

    public void setPlayoutVolume(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPlayer.setPlayoutVolume(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "volume")).intValue())));
    }

    public void setProperty(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPlayer.setProperty((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "key"), com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "value"))));
    }

    public void setRenderFillMode(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPlayer.setRenderFillMode(com.tencent.live.utils.EnumUtils.getV2TXLiveFillMode(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "mode")).intValue()))));
    }

    public void setRenderRotation(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPlayer.setRenderRotation(com.tencent.live.utils.EnumUtils.getV2TXLiveRotation(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "rotation")).intValue()))));
    }

    public int setRenderView(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        int renderView = this.mPlayer.setRenderView((com.tencent.rtmp.ui.TXCloudVideoView) this.mTXRenderViewFactory.getViewById(((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, dm.i4.COL_ID)).intValue()).getView());
        result.success(java.lang.Integer.valueOf(renderView));
        return renderView;
    }

    public void setTextureSize(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        com.tencent.live.utils.Logger.playerPrint(this.mPlayer, 2, "V2TXLivePlayerPlugin, setTextureSize: method-" + methodCall.method + ", arguments-" + methodCall.arguments);
        java.lang.Double d17 = (java.lang.Double) methodCall.argument("width");
        java.lang.Double d18 = (java.lang.Double) methodCall.argument("height");
        if (d17 == null || d18 == null || d17.doubleValue() <= 0.0d || d18.doubleValue() <= 0.0d) {
            result.success(null);
            return;
        }
        if (this.mRenderWidth == d17.intValue() && this.mRenderHeight == d18.intValue()) {
            result.success(null);
            return;
        }
        this.mRenderWidth = d17.intValue();
        this.mRenderHeight = d18.intValue();
        updateDefaultBufferSize();
        this.mPlayer.setProperty(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface, this.mSurfaceTextureEntry.getSurface());
        result.success(null);
    }

    public void showDebugView(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.mPlayer.showDebugView(((java.lang.Boolean) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "isShow")).booleanValue());
        result.success(0);
    }

    public void snapshot(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPlayer.snapshot()));
    }

    public void startLivePlay(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        setFramework();
        result.success(java.lang.Integer.valueOf(this.mPlayer.startLivePlay((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "url"))));
    }

    public void stopPlay(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(java.lang.Integer.valueOf(this.mPlayer.stopPlay()));
    }
}
