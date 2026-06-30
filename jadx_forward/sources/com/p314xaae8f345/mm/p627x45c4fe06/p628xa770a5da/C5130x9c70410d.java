package com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da;

/* renamed from: com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding */
/* loaded from: classes7.dex */
public class C5130x9c70410d {

    /* renamed from: callback */
    private android.webkit.ValueCallback<jz5.l> f21472xf5bc2045;

    /* renamed from: mJsRuntimeInst */
    private long f21473x227ea9c8 = 0;

    /* renamed from: nativeCreateRuntime */
    private native long m43182x85e4f065(long j17, long j18, java.lang.String str, boolean z17);

    /* renamed from: nativeDestroyRuntime */
    private native void m43183xfa2f6275(long j17);

    /* renamed from: nativeInvokeCallbackHandler */
    private native void m43184x8df99fd6(long j17, int i17, java.lang.String str, java.lang.String str2);

    /* renamed from: nativeSubscribeHandler */
    private native void m43185xe571f0d7(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3);

    /* renamed from: createRuntime */
    public void mo43186xe258f33c(long j17, long j18) {
        this.f21473x227ea9c8 = m43182x85e4f065(j17, j18, "WeixinJSCoreAndroid", false);
    }

    /* renamed from: destroyRuntime */
    public void mo43188x2c3bba7e() {
        m43183xfa2f6275(this.f21473x227ea9c8);
    }

    /* renamed from: invokeCallbackHandler */
    public void m43189x44c4dbad(int i17, java.lang.String str) {
        mo43190x44c4dbad(i17, str, "");
    }

    /* renamed from: onJsException */
    public void m43191x50004da7(java.lang.String str, java.lang.String str2) {
        android.webkit.ValueCallback<jz5.l> valueCallback = this.f21472xf5bc2045;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(new jz5.l(str, str2));
        }
    }

    /* renamed from: setJsExceptionCallback */
    public void mo43192xf5827fa9(android.webkit.ValueCallback<jz5.l> valueCallback) {
        this.f21472xf5bc2045 = valueCallback;
    }

    /* renamed from: subscribeHandler */
    public void mo43193xc5c86aa0(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        m43185xe571f0d7(this.f21473x227ea9c8, str, str2, i17, str3);
    }

    /* renamed from: createRuntime */
    public void mo43187xe258f33c(long j17, long j18, java.lang.String str, boolean z17) {
        this.f21473x227ea9c8 = m43182x85e4f065(j17, j18, str, z17);
    }

    /* renamed from: invokeCallbackHandler */
    public void mo43190x44c4dbad(int i17, java.lang.String str, java.lang.String str2) {
        m43184x8df99fd6(this.f21473x227ea9c8, i17, str, str2);
    }
}
