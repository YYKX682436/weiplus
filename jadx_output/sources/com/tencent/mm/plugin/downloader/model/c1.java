package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f97008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.f1 f97009e;

    public c1(com.tencent.mm.plugin.downloader.model.f1 f1Var, long j17) {
        this.f97009e = f1Var;
        this.f97008d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.downloader.model.f1 f1Var = this.f97009e;
        long j17 = this.f97008d;
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo d17 = f1Var.d(j17);
        if (d17.f96963f == 1) {
            if (com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.cdn.CdnManager.class) != null) {
                ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.cdn.CdnManager.class)).pauseHttpMultiSocketDownloadTask(d17.f96962e);
            }
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
            if (c17 != null) {
                c17.field_status = 2;
                com.tencent.mm.plugin.downloader.model.m0.l(c17);
            }
            f1Var.f97212a.e(j17);
        }
    }
}
