package com.tencent.mm.plugin.appbrand.keepalive;

/* loaded from: classes13.dex */
public class b implements com.tencent.mm.ipcinvoker.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.keepalive.d f84083b;

    public b(com.tencent.mm.plugin.appbrand.keepalive.d dVar, java.lang.String str) {
        this.f84083b = dVar;
        this.f84082a = str;
    }

    @Override // com.tencent.mm.ipcinvoker.s0
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "onProcessDied %s", this.f84082a);
        synchronized (this.f84083b) {
            this.f84083b.f84085a = 0;
        }
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unbindService(this.f84083b.f84087c);
        } catch (java.lang.Exception unused) {
        }
    }
}
