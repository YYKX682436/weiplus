package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.y0 f97194d;

    public x0(com.tencent.mm.plugin.downloader.model.y0 y0Var) {
        this.f97194d = y0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.downloader.model.y0 y0Var = this.f97194d;
        try {
            java.util.Iterator it = y0Var.f97203e.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.downloader.model.y0.g(y0Var, java.lang.Long.valueOf(((java.lang.Long) it.next()).longValue()));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImpl23", e17.getMessage());
        }
    }
}
