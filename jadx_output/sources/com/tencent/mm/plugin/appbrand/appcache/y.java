package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.z f76057d;

    public y(com.tencent.mm.plugin.appbrand.appcache.z zVar) {
        this.f76057d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.appcache.z zVar = this.f76057d;
        long j17 = zVar.f76084f;
        if (j17 > 0) {
            long j18 = zVar.f76085g;
            if (j18 > 0 && j18 <= j17) {
                yz5.p pVar = zVar.f76083e;
                if (pVar == null) {
                    return;
                }
                pVar.invoke(java.lang.Long.valueOf(j18), java.lang.Long.valueOf(zVar.f76084f));
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ChromiumCronetDownloadCallback", "notifyProgressChange invalid bodyLength=" + zVar.f76084f + " currentWriteByte=" + zVar.f76085g);
    }
}
