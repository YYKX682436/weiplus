package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Vector f97078a;

    static {
        java.util.Vector vector = new java.util.Vector();
        f97078a = vector;
        vector.add(new com.tencent.mm.plugin.downloader.model.c0());
    }

    public static com.tencent.mm.plugin.downloader.model.g1[] a(com.tencent.mm.plugin.downloader.model.l0 l0Var) {
        l0Var.getClass();
        java.util.Vector vector = f97078a;
        return (com.tencent.mm.plugin.downloader.model.g1[]) vector.toArray(new com.tencent.mm.plugin.downloader.model.g1[vector.size()]);
    }

    public void b(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderCallbackManager", "notifyMd5Checking: %d", java.lang.Long.valueOf(j17));
        ((java.util.HashSet) com.tencent.mm.plugin.downloader.model.n0.f97088a).add(java.lang.Long.valueOf(j17));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.downloader.model.k0(this, j17));
    }

    public void c(long j17, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskFailed: %d, errCode : %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        ((java.util.HashSet) com.tencent.mm.plugin.downloader.model.n0.f97088a).remove(java.lang.Long.valueOf(j17));
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 != null) {
            com.tencent.mm.plugin.downloader.api.f.d(c17.field_downloadUrl, c17.field_secondaryUrl);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.downloader.model.h0(this, j17, i17, z17));
    }

    public void d(long j17, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskFinished: %d", java.lang.Long.valueOf(j17));
        ((java.util.HashSet) com.tencent.mm.plugin.downloader.model.n0.f97088a).remove(java.lang.Long.valueOf(j17));
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 != null) {
            com.tencent.mm.plugin.downloader.api.f.d(c17.field_downloadUrl, c17.field_secondaryUrl);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.downloader.model.g0(this, j17, str, z17));
    }

    public void e(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskPaused: %d", java.lang.Long.valueOf(j17));
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 != null) {
            com.tencent.mm.plugin.downloader.api.f.d(c17.field_downloadUrl, c17.field_secondaryUrl);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.downloader.model.i0(this, j17));
    }

    public void f(long j17, java.lang.String str, long j18, long j19) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.downloader.model.j0(this, j17, str, j18, j19));
    }

    public void g(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskRemoved: %d", java.lang.Long.valueOf(j17));
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 != null) {
            com.tencent.mm.plugin.downloader.api.f.d(c17.field_downloadUrl, c17.field_secondaryUrl);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.downloader.model.f0(this, j17));
    }

    public void h(long j17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskResumed: %d, %s", java.lang.Long.valueOf(j17), str);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.downloader.model.e0(this, j17, str));
    }

    public void i(long j17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskStarted: %d, %s", java.lang.Long.valueOf(j17), str);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.downloader.model.d0(this, j17, str));
    }
}
