package com.tencent.mars.sdt;

/* loaded from: classes12.dex */
public class SdtManager extends com.tencent.mars.app.BaseManager {
    protected long nativeHandle = 0;
    protected long callbackHandle = 0;

    /* loaded from: classes12.dex */
    public interface CallBack {
        void reportSignalDetectResults(java.lang.String str);
    }

    public SdtManager(long j17) {
        OnJniCreateSdtManagerFromHandle(j17);
    }

    public native void OnJniCreateSdtManagerFromContext(java.lang.Object obj);

    public native void OnJniCreateSdtManagerFromHandle(long j17);

    public native void OnJniDestroySdtManager();

    public native java.util.ArrayList<java.lang.String> OnJniGetLoadLibraries();

    public native void OnJniSetCallback(java.lang.Object obj);

    public native void OnJniSetHttpNetCheckCGI(java.lang.String str);

    public java.util.ArrayList<java.lang.String> getLoadLibraries() {
        return OnJniGetLoadLibraries();
    }

    @Override // com.tencent.mars.app.BaseManager
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public void onDestroy() {
        OnJniDestroySdtManager();
        this.nativeHandle = 0L;
        this.callbackHandle = 0L;
    }

    public void setCallback(com.tencent.mars.sdt.SdtManager.CallBack callBack) {
        OnJniSetCallback(callBack);
    }

    public void setHttpNetCheckCGI(java.lang.String str) {
        OnJniSetHttpNetCheckCGI(str);
    }

    public SdtManager(com.tencent.mars.app.Context context) {
        OnJniCreateSdtManagerFromContext(context);
    }
}
