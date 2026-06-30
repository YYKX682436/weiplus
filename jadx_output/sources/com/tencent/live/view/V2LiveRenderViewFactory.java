package com.tencent.live.view;

/* loaded from: classes13.dex */
public class V2LiveRenderViewFactory extends io.flutter.plugin.platform.PlatformViewFactory implements com.tencent.live.view.DestroyViewListener {
    public static final java.lang.String SIGN = "v2_live_view_factory";
    private static final java.lang.String TAG = "TRTCCloudFlutter";
    private android.content.Context mContext;
    private io.flutter.plugin.common.BinaryMessenger mMessenger;
    private java.util.Map<java.lang.Integer, com.tencent.live.view.V2LiveRenderView> mViewMap;

    public V2LiveRenderViewFactory(android.content.Context context, io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
        super(io.flutter.plugin.common.StandardMessageCodec.INSTANCE);
        this.mViewMap = new java.util.HashMap();
        this.mContext = context;
        this.mMessenger = binaryMessenger;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public io.flutter.plugin.platform.PlatformView create(android.content.Context context, int i17, java.lang.Object obj) {
        com.tencent.live.view.V2LiveRenderView v2LiveRenderView = this.mViewMap.get(java.lang.Integer.valueOf(i17));
        if (v2LiveRenderView != null) {
            return v2LiveRenderView;
        }
        com.tencent.live.view.V2LiveRenderView v2LiveRenderView2 = new com.tencent.live.view.V2LiveRenderView(i17, context, this.mMessenger, this);
        this.mViewMap.put(java.lang.Integer.valueOf(i17), v2LiveRenderView2);
        return v2LiveRenderView2;
    }

    public com.tencent.live.view.V2LiveRenderView getViewById(int i17) {
        return this.mViewMap.get(java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.live.view.DestroyViewListener
    public void onDestroy(int i17) {
        if (this.mViewMap.containsKey(java.lang.Integer.valueOf(i17))) {
            this.mViewMap.remove(java.lang.Integer.valueOf(i17));
        }
    }

    public V2LiveRenderViewFactory(io.flutter.plugin.common.MessageCodec<java.lang.Object> messageCodec) {
        super(messageCodec);
        this.mViewMap = new java.util.HashMap();
    }
}
