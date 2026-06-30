package com.tencent.kinda.framework.app;

/* loaded from: classes15.dex */
public class KindaDeviceFrameDrawLoopCallback implements com.tencent.kinda.gen.IDeviceFrameDrawLoopCallback {
    private com.tencent.kinda.gen.VoidI64Callback frameDrawCallback;
    private android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
    private android.view.Choreographer.FrameCallback frameCallback = new android.view.Choreographer.FrameCallback() { // from class: com.tencent.kinda.framework.app.KindaDeviceFrameDrawLoopCallback.1
        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j17) {
            com.tencent.kinda.framework.app.KindaDeviceFrameDrawLoopCallback.this.onDoFrame(j17);
        }
    };
    private volatile boolean isStart = false;

    public void onDoFrame(long j17) {
        this.frameDrawCallback.call(j17 / 1000000);
        if (this.isStart) {
            this.choreographer.postFrameCallback(this.frameCallback);
        }
    }

    @Override // com.tencent.kinda.gen.IDeviceFrameDrawLoopCallback
    public void startListenerImpl(com.tencent.kinda.gen.VoidI64Callback voidI64Callback) {
        this.isStart = true;
        this.frameDrawCallback = voidI64Callback;
        this.choreographer.removeFrameCallback(this.frameCallback);
        this.choreographer.postFrameCallback(this.frameCallback);
    }

    @Override // com.tencent.kinda.gen.IDeviceFrameDrawLoopCallback
    public void stopListener() {
        this.isStart = false;
        this.choreographer.removeFrameCallback(this.frameCallback);
    }
}
