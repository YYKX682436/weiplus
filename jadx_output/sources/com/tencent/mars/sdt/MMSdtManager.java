package com.tencent.mars.sdt;

/* loaded from: classes12.dex */
public class MMSdtManager extends com.tencent.mars.app.BaseManager {
    protected long nativeHandle = 0;
    protected long callbackHandle = 0;

    /* loaded from: classes12.dex */
    public interface CallBack {
        void startTraceRoute(java.lang.String str);
    }

    public MMSdtManager(long j17) {
        OnJniCreateMMSdtManagerFromHandle(j17);
    }

    public native void OnJniCreateMMSdtManagerFromContext(java.lang.Object obj);

    public native void OnJniCreateMMSdtManagerFromHandle(long j17);

    public native void OnJniDestroyMMSdtManager();

    public native void OnJniSetCallback(java.lang.Object obj);

    @Override // com.tencent.mars.app.BaseManager
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public void onDestroy() {
        OnJniDestroyMMSdtManager();
        this.nativeHandle = 0L;
        this.callbackHandle = 0L;
    }

    public void setCallback(com.tencent.mars.sdt.MMSdtManager.CallBack callBack) {
        OnJniSetCallback(callBack);
    }

    public MMSdtManager(com.tencent.mars.app.Context context) {
        OnJniCreateMMSdtManagerFromContext(context);
    }
}
