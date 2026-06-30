package com.tencent.live;

/* loaded from: classes15.dex */
public class TXLivePluginManager implements io.flutter.plugin.common.MethodChannel.MethodCallHandler {
    private static final java.lang.String CHANNEL_NAME = "live_cloud_manager_channel";
    private static final java.lang.String TAG = "TXLivePluginManager";
    private static com.tencent.live.beauty.custom.ITXCustomBeautyProcesserFactory sProcesserFactory;
    private io.flutter.plugin.common.MethodChannel mChannel;
    private android.content.Context mContext;
    private io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets mFlutterAssets;
    private io.flutter.plugin.common.BinaryMessenger mMessager;
    private com.tencent.live.plugin.V2TXLivePremierPlugin mTXLivePremierPlugin;
    private io.flutter.view.TextureRegistry mTextureRegistry;
    private com.tencent.live.view.V2LiveRenderViewFactory mViewFactory;
    private java.util.Map<java.lang.String, com.tencent.live.plugin.V2TXLivePusherPlugin> mPusherMap = new java.util.HashMap();
    private java.util.Map<java.lang.String, com.tencent.live.plugin.V2TXLivePlayerPlugin> mPlayerMap = new java.util.HashMap();

    /* loaded from: classes15.dex */
    public interface MethodName {
        public static final java.lang.String CREATE_NATIVE_PLAYER = "createNativePlayer";
        public static final java.lang.String CREATE_NATIVE_PUSHER = "createNativePusher";
        public static final java.lang.String DESTROY_NATIVE_PLAYER = "destroyNativePlayer";
        public static final java.lang.String DESTROY_NATIVE_PUSHER = "destroyNativePusher";
    }

    public TXLivePluginManager(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(flutterPluginBinding.getBinaryMessenger(), CHANNEL_NAME);
        this.mChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.mMessager = flutterPluginBinding.getBinaryMessenger();
        this.mContext = flutterPluginBinding.getApplicationContext();
        this.mFlutterAssets = flutterPluginBinding.getFlutterAssets();
        this.mViewFactory = new com.tencent.live.view.V2LiveRenderViewFactory(this.mContext, this.mMessager);
        this.mTXLivePremierPlugin = new com.tencent.live.plugin.V2TXLivePremierPlugin(this.mMessager, this.mContext);
        this.mTextureRegistry = flutterPluginBinding.getTextureRegistry();
        flutterPluginBinding.getPlatformViewRegistry().registerViewFactory(com.tencent.live.view.V2LiveRenderViewFactory.SIGN, this.mViewFactory);
    }

    private com.tencent.live.plugin.V2TXLivePlayerPlugin createV2TXLivePlayerPlugin(java.lang.String str) {
        com.tencent.live.plugin.V2TXLivePlayerPlugin v2TXLivePlayerPlugin = this.mPlayerMap.get(str);
        if (v2TXLivePlayerPlugin == null) {
            com.tencent.live.plugin.V2TXLivePlayerPlugin v2TXLivePlayerPlugin2 = new com.tencent.live.plugin.V2TXLivePlayerPlugin(str, this.mMessager, this.mContext, this.mViewFactory, this.mTextureRegistry);
            this.mPlayerMap.put(str, v2TXLivePlayerPlugin2);
            return v2TXLivePlayerPlugin2;
        }
        com.tencent.live.utils.Logger.premierPrint(4, "TXLivePluginManager, The Player has been created before， id:" + str);
        return v2TXLivePlayerPlugin;
    }

    private com.tencent.live.plugin.V2TXLivePusherPlugin createV2TXLivePusherPlugin(java.lang.String str, int i17) {
        com.tencent.live.plugin.V2TXLivePusherPlugin v2TXLivePusherPlugin = this.mPusherMap.get(str);
        if (v2TXLivePusherPlugin == null) {
            com.tencent.live.plugin.V2TXLivePusherPlugin v2TXLivePusherPlugin2 = new com.tencent.live.plugin.V2TXLivePusherPlugin(str, i17, this.mMessager, this.mContext, this.mFlutterAssets, this.mViewFactory);
            this.mPusherMap.put(str, v2TXLivePusherPlugin2);
            return v2TXLivePusherPlugin2;
        }
        com.tencent.live.utils.Logger.premierPrint(4, "TXLivePluginManager, createV2TXLivePusherPlugin -> id:" + str);
        return v2TXLivePusherPlugin;
    }

    private void destroyNativePlayer(java.lang.String str) {
        com.tencent.live.plugin.V2TXLivePlayerPlugin v2TXLivePlayerPlugin = this.mPlayerMap.get(str);
        if (v2TXLivePlayerPlugin != null) {
            v2TXLivePlayerPlugin.destroy();
            this.mPlayerMap.remove(str);
        }
    }

    private void destroyNativePusher(java.lang.String str) {
        com.tencent.live.plugin.V2TXLivePusherPlugin v2TXLivePusherPlugin = this.mPusherMap.get(str);
        if (v2TXLivePusherPlugin != null) {
            v2TXLivePusherPlugin.destroy();
            this.mPusherMap.remove(str);
        }
    }

    public static com.tencent.live.beauty.custom.ITXCustomBeautyProcesserFactory getBeautyProcesserFactory() {
        return sProcesserFactory;
    }

    private com.tencent.live.view.V2LiveRenderViewFactory getV2LiveRenderViewFactory() {
        return this.mViewFactory;
    }

    public static void register(com.tencent.live.beauty.custom.ITXCustomBeautyProcesserFactory iTXCustomBeautyProcesserFactory) {
        sProcesserFactory = iTXCustomBeautyProcesserFactory;
    }

    public void destroy() {
        this.mChannel.setMethodCallHandler(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r2.equals(com.tencent.live.TXLivePluginManager.MethodName.CREATE_NATIVE_PLAYER) == false) goto L8;
     */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r9, io.flutter.plugin.common.MethodChannel.Result r10) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TXLivePluginManager, TXLivePluginManager onMethodCall -> method:"
            r0.<init>(r1)
            java.lang.String r1 = r9.method
            r0.append(r1)
            java.lang.String r1 = ", arguments:"
            r0.append(r1)
            java.lang.Object r1 = r9.arguments
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 2
            com.tencent.live.utils.Logger.premierPrint(r1, r0)
            java.lang.String r0 = "identifier"
            java.lang.Object r0 = com.tencent.live.utils.MethodUtils.getMethodParams(r9, r10, r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 4
            if (r2 == 0) goto L3c
            java.lang.String r9 = "TXLivePluginManager, Can not find param by key: identifier"
            com.tencent.live.utils.Logger.premierPrint(r3, r9)
            java.lang.String r9 = "Error"
            java.lang.String r0 = "Can not find param by key: identifier"
            java.lang.String r1 = "-1001"
            r10.error(r1, r9, r0)
            return
        L3c:
            java.lang.String r2 = r9.method
            r2.getClass()
            int r4 = r2.hashCode()
            r5 = 1
            r6 = 0
            r7 = -1
            switch(r4) {
                case -1732905230: goto L6c;
                case -1724073640: goto L61;
                case 5539060: goto L58;
                case 14370650: goto L4d;
                default: goto L4b;
            }
        L4b:
            r1 = r7
            goto L76
        L4d:
            java.lang.String r1 = "createNativePusher"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L56
            goto L4b
        L56:
            r1 = 3
            goto L76
        L58:
            java.lang.String r4 = "createNativePlayer"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L76
            goto L4b
        L61:
            java.lang.String r1 = "destroyNativePusher"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L6a
            goto L4b
        L6a:
            r1 = r5
            goto L76
        L6c:
            java.lang.String r1 = "destroyNativePlayer"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L75
            goto L4b
        L75:
            r1 = r6
        L76:
            switch(r1) {
                case 0: goto Lae;
                case 1: goto Laa;
                case 2: goto La6;
                case 3: goto L96;
                default: goto L79;
            }
        L79:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TXLivePluginManager, Method:"
            r0.<init>(r1)
            java.lang.String r9 = r9.method
            r0.append(r9)
            java.lang.String r9 = "is not defined"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.tencent.live.utils.Logger.premierPrint(r3, r9)
            r10.notImplemented()
            r5 = r6
            goto Lb1
        L96:
            java.lang.String r1 = "mode"
            java.lang.Object r9 = com.tencent.live.utils.MethodUtils.getMethodParams(r9, r10, r1)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r8.createV2TXLivePusherPlugin(r0, r9)
            goto Lb1
        La6:
            r8.createV2TXLivePlayerPlugin(r0)
            goto Lb1
        Laa:
            r8.destroyNativePusher(r0)
            goto Lb1
        Lae:
            r8.destroyNativePlayer(r0)
        Lb1:
            if (r5 == 0) goto Lba
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r10.success(r9)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.live.TXLivePluginManager.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }
}
