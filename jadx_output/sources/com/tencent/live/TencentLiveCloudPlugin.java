package com.tencent.live;

/* loaded from: classes15.dex */
public class TencentLiveCloudPlugin implements io.flutter.embedding.engine.plugins.FlutterPlugin {
    private com.tencent.live.TXLivePluginManager mTXLiveManager;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.mTXLiveManager = new com.tencent.live.TXLivePluginManager(flutterPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        com.tencent.live.TXLivePluginManager tXLivePluginManager = this.mTXLiveManager;
        if (tXLivePluginManager != null) {
            tXLivePluginManager.destroy();
        }
    }
}
