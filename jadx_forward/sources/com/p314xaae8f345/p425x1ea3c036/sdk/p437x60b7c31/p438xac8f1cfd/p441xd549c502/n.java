package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502;

/* loaded from: classes7.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd f129120d;

    public n(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd c3932x19b83abd) {
        this.f129120d = c3932x19b83abd;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f129120d) {
            if (this.f129120d.f15700xee6151ec != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WxAudioNativeInstallHelper", "DestroyTask destroy wxAudioNative");
                this.f129120d.f15700xee6151ec.m46445xbc3bfb13();
                this.f129120d.f15700xee6151ec = null;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WxAudioNativeInstallHelper", "DestroyTask wxAudioNative is null");
            }
        }
    }
}
