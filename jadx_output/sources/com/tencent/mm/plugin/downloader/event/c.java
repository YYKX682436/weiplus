package com.tencent.mm.plugin.downloader.event;

/* loaded from: classes8.dex */
public class c implements com.tencent.mm.plugin.downloader.model.g1 {

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.plugin.downloader.event.c f96907d;

    /* renamed from: e, reason: collision with root package name */
    public static android.content.BroadcastReceiver f96908e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f96909f = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f96910g = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f96911h;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f96911h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetAppIdByUrlEvent>(a0Var) { // from class: com.tencent.mm.plugin.downloader.event.DownloadEventBus$1
            {
                this.__eventId = 566931480;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GetAppIdByUrlEvent getAppIdByUrlEvent) {
                h02.a f17;
                com.tencent.mm.autogen.events.GetAppIdByUrlEvent getAppIdByUrlEvent2 = getAppIdByUrlEvent;
                java.lang.String str = getAppIdByUrlEvent2.f54379g.f6759a;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (f17 = com.tencent.mm.plugin.downloader.model.m0.f(str)) == null) {
                    return false;
                }
                getAppIdByUrlEvent2.f54380h.f6833a = f17.field_appId;
                return false;
            }
        };
    }

    public static void a(int i17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadEventBus", "dispatch event = %d, id = %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null) {
            return;
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) f96909f).iterator();
        while (it.hasNext()) {
            ((vz.i1) it.next()).Z(i17, c17.field_downloadId);
        }
        for (fs.q qVar : ((fs.c) fs.g.f(vz.k1.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((vz.k1) ((fs.n) qVar.get())).Z(i17, c17.field_downloadId);
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", c17.field_appId);
        bundle.putInt("state", c17.field_status);
        long j18 = c17.field_totalSize;
        if (j18 > 0) {
            bundle.putInt("progress", (int) ((c17.field_downloadedSize * 100) / j18));
        }
        bundle.putBoolean("downloadInWidget", c17.field_fromDownloadApp);
        bundle.putInt("event", i17);
        com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.a(bundle, com.tencent.mm.plugin.downloader.event.b.class, null);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void b(long j17, int i17, boolean z17) {
        a(5, j17);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        a(3, j17);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void f(long j17) {
        a(8, j17);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
        a(6, j17);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void i(long j17, java.lang.String str) {
        a(7, j17);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void k(long j17) {
        a(2, j17);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void l(long j17, java.lang.String str) {
        a(1, j17);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void m(long j17) {
        a(4, j17);
    }
}
