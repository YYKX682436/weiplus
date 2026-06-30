package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.m f129116d;

    public k(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.m mVar) {
        this.f129116d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.m mVar = this.f129116d;
        if (mVar.f129119e.f15700xee6151ec != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WxAudioNativeInstallHelper", "app enter suspend, pause all players");
            mVar.f129119e.f15700xee6151ec.m46447xdcc13257(false);
        }
    }
}
