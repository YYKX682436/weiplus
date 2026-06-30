package com.tencent.mm.appbrand.commonjni;

/* loaded from: classes7.dex */
public class AppBrandJsBridgeBinding {
    private android.webkit.ValueCallback<jz5.l> callback;
    private long mJsRuntimeInst = 0;

    private native long nativeCreateRuntime(long j17, long j18, java.lang.String str, boolean z17);

    private native void nativeDestroyRuntime(long j17);

    private native void nativeInvokeCallbackHandler(long j17, int i17, java.lang.String str, java.lang.String str2);

    private native void nativeSubscribeHandler(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3);

    public void createRuntime(long j17, long j18) {
        this.mJsRuntimeInst = nativeCreateRuntime(j17, j18, "WeixinJSCoreAndroid", false);
    }

    public void destroyRuntime() {
        nativeDestroyRuntime(this.mJsRuntimeInst);
    }

    public void invokeCallbackHandler(int i17, java.lang.String str) {
        invokeCallbackHandler(i17, str, "");
    }

    public void onJsException(java.lang.String str, java.lang.String str2) {
        android.webkit.ValueCallback<jz5.l> valueCallback = this.callback;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(new jz5.l(str, str2));
        }
    }

    public void setJsExceptionCallback(android.webkit.ValueCallback<jz5.l> valueCallback) {
        this.callback = valueCallback;
    }

    public void subscribeHandler(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        nativeSubscribeHandler(this.mJsRuntimeInst, str, str2, i17, str3);
    }

    public void createRuntime(long j17, long j18, java.lang.String str, boolean z17) {
        this.mJsRuntimeInst = nativeCreateRuntime(j17, j18, str, z17);
    }

    public void invokeCallbackHandler(int i17, java.lang.String str, java.lang.String str2) {
        nativeInvokeCallbackHandler(this.mJsRuntimeInst, i17, str, str2);
    }
}
