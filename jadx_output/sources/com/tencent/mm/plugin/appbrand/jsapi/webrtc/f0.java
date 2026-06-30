package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

/* loaded from: classes7.dex */
public class f0 implements com.tencent.mm.plugin.downloader.model.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.webrtc.h0 f83821d;

    public f0(com.tencent.mm.plugin.appbrand.jsapi.webrtc.h0 h0Var) {
        this.f83821d = h0Var;
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void b(long j17, int i17, boolean z17) {
        com.tencent.mm.plugin.appbrand.jsapi.webrtc.h0 h0Var = this.f83821d;
        if (((java.util.concurrent.ConcurrentHashMap) h0Var.f83832d).containsKey(java.lang.Long.valueOf(j17))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SRDownloadFile", "down fail, id:%d errCode:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.g0 g0Var = (com.tencent.mm.plugin.appbrand.jsapi.webrtc.g0) ((java.util.concurrent.ConcurrentHashMap) h0Var.f83832d).get(java.lang.Long.valueOf(j17));
            if (((java.util.concurrent.ConcurrentHashMap) h0Var.f83833e).containsKey(g0Var.f83824a)) {
                ((java.util.concurrent.ConcurrentHashMap) h0Var.f83833e).remove(g0Var.f83824a);
            }
            ((java.util.concurrent.ConcurrentHashMap) h0Var.f83832d).remove(java.lang.Long.valueOf(j17));
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.a aVar = g0Var.f83826c;
            if (aVar != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.webrtc.q) aVar).a(1);
            }
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.appbrand.jsapi.webrtc.h0 h0Var = this.f83821d;
        if (((java.util.concurrent.ConcurrentHashMap) h0Var.f83832d).containsKey(java.lang.Long.valueOf(j17))) {
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.g0 g0Var = (com.tencent.mm.plugin.appbrand.jsapi.webrtc.g0) ((java.util.concurrent.ConcurrentHashMap) h0Var.f83832d).get(java.lang.Long.valueOf(j17));
            if (((java.util.concurrent.ConcurrentHashMap) h0Var.f83833e).containsKey(g0Var.f83824a)) {
                ((java.util.concurrent.ConcurrentHashMap) h0Var.f83833e).remove(g0Var.f83824a);
            }
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.a aVar = g0Var.f83826c;
            if (K0) {
                ((java.util.concurrent.ConcurrentHashMap) h0Var.f83832d).remove(java.lang.Long.valueOf(j17));
                if (aVar != null) {
                    ((com.tencent.mm.plugin.appbrand.jsapi.webrtc.q) aVar).a(1);
                    return;
                }
                return;
            }
            if (!g0Var.f83825b.equals(uk.k.b(str))) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SRDownloadFile", "MD5 error!");
                ((java.util.concurrent.ConcurrentHashMap) h0Var.f83832d).remove(java.lang.Long.valueOf(j17));
                if (aVar != null) {
                    ((com.tencent.mm.plugin.appbrand.jsapi.webrtc.q) aVar).a(2);
                    return;
                }
                return;
            }
            ((java.util.concurrent.ConcurrentHashMap) h0Var.f83832d).remove(java.lang.Long.valueOf(j17));
            java.lang.String f17 = lp0.b.f();
            com.tencent.mars.xlog.Log.i("MicroMsg.SRDownloadFile", "download success, path:%s", str);
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(f17);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
                if (m18.a()) {
                    m18.f213266a.r(m18.f213267b);
                }
            }
            try {
                if (com.tencent.mm.vfs.w6.Q(com.tencent.mm.vfs.w6.i(str, false), f17) < 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SRDownloadFile", "unzip error!");
                    if (aVar != null) {
                        ((com.tencent.mm.plugin.appbrand.jsapi.webrtc.q) aVar).a(3);
                        return;
                    }
                    return;
                }
                if (aVar != null) {
                    com.tencent.mm.plugin.appbrand.jsapi.webrtc.q qVar = (com.tencent.mm.plugin.appbrand.jsapi.webrtc.q) aVar;
                    qVar.getClass();
                    com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiRequestSRFile$GetDownloadStatus jsApiRequestSRFile$GetDownloadStatus = new com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiRequestSRFile$GetDownloadStatus(0);
                    com.tencent.mm.ipcinvoker.r rVar = qVar.f83852a;
                    if (rVar != null) {
                        rVar.a(jsApiRequestSRFile$GetDownloadStatus);
                    }
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.SRDownloadFile", "download Success");
            } catch (java.lang.Exception e17) {
                if (aVar != null) {
                    ((com.tencent.mm.plugin.appbrand.jsapi.webrtc.q) aVar).a(4);
                }
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SRDownloadFile", e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.i("MicroMsg.SRDownloadFile", "download Fail, in exception");
            }
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void f(long j17) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void i(long j17, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void k(long j17) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void l(long j17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SRDownloadFile", "onTaskStarted id:%s savedFilePath:%s", java.lang.Long.valueOf(j17), str);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void m(long j17) {
        com.tencent.mm.plugin.appbrand.jsapi.webrtc.h0 h0Var = this.f83821d;
        if (((java.util.concurrent.ConcurrentHashMap) h0Var.f83832d).containsKey(java.lang.Long.valueOf(j17))) {
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.g0 g0Var = (com.tencent.mm.plugin.appbrand.jsapi.webrtc.g0) ((java.util.concurrent.ConcurrentHashMap) h0Var.f83832d).get(java.lang.Long.valueOf(j17));
            if (((java.util.concurrent.ConcurrentHashMap) h0Var.f83833e).containsKey(g0Var.f83824a)) {
                ((java.util.concurrent.ConcurrentHashMap) h0Var.f83833e).remove(g0Var.f83824a);
            }
            ((java.util.concurrent.ConcurrentHashMap) h0Var.f83832d).remove(java.lang.Long.valueOf(j17));
        }
    }
}
