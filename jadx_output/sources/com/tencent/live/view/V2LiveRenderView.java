package com.tencent.live.view;

/* loaded from: classes13.dex */
public class V2LiveRenderView implements io.flutter.plugin.platform.PlatformView, io.flutter.plugin.common.MethodChannel.MethodCallHandler {
    private static final java.lang.String TAG = "V2LiveRenderView";
    private io.flutter.plugin.common.MethodChannel mChannel;
    private android.content.Context mContext;
    private com.tencent.live.view.DestroyViewListener mListener;
    private io.flutter.plugin.common.BinaryMessenger mMessenger;
    private com.tencent.rtmp.ui.TXCloudVideoView mRemoteView;
    private int mViewId;

    public V2LiveRenderView(int i17, android.content.Context context, io.flutter.plugin.common.BinaryMessenger binaryMessenger, com.tencent.live.view.DestroyViewListener destroyViewListener) {
        com.tencent.live.utils.Logger.premierPrint(2, "V2LiveRenderView, V2LiveRenderView create viewId:" + i17);
        this.mContext = context;
        this.mMessenger = binaryMessenger;
        this.mViewId = i17;
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = new com.tencent.rtmp.ui.TXCloudVideoView(context);
        this.mRemoteView = tXCloudVideoView;
        tXCloudVideoView.addVideoView(new android.view.TextureView(context));
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(this.mMessenger, "tx_Live_video_view_" + this.mViewId);
        this.mChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.mListener = destroyViewListener;
    }

    private void destroyRenderView() {
        com.tencent.live.utils.Logger.premierPrint(2, "V2LiveRenderView, V2LiveRenderView destroy viewId:" + this.mViewId);
        com.tencent.live.view.DestroyViewListener destroyViewListener = this.mListener;
        if (destroyViewListener != null) {
            destroyViewListener.onDestroy(this.mViewId);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public android.view.View getView() {
        return this.mRemoteView;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        com.tencent.live.utils.Logger.premierPrint(2, "V2LiveRenderView, V2LiveRenderView( " + this.mViewId + ")onMethodCall -> method:" + methodCall.method + ", arguments:" + methodCall.arguments);
        java.lang.String str = methodCall.method;
        str.getClass();
        if (str.equals("destroyRenderView")) {
            destroyRenderView();
        }
    }
}
