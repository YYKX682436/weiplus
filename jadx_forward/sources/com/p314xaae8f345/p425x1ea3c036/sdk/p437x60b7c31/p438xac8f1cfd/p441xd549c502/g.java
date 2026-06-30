package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502;

/* loaded from: classes7.dex */
public class g implements com.p314xaae8f345.mm.p818xc991f70.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd f129107a;

    public g(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd c3932x19b83abd) {
        this.f129107a = c3932x19b83abd;
    }

    @Override // com.p314xaae8f345.mm.p818xc991f70.b
    /* renamed from: loadLibrary */
    public void mo32201xeb57c8f5(java.lang.String str) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd c3932x19b83abd = this.f129107a;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WxAudioNativeInstallHelper", "loadLibrary libName:%s", str);
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd.class.getClassLoader();
            fp.d0.n(str);
            c3932x19b83abd.f15695x7832709f = true;
        } catch (java.lang.SecurityException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WxAudioNativeInstallHelper", e17, "load so %s error!!", str);
            c3932x19b83abd.f15695x7832709f = false;
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WxAudioNativeInstallHelper", e18, "load so %s error!!", str);
            c3932x19b83abd.f15695x7832709f = false;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WxAudioNativeInstallHelper", th6, "load so %s error!!", str);
            c3932x19b83abd.f15695x7832709f = false;
        }
    }
}
