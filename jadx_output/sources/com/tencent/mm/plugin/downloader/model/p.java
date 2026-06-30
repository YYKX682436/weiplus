package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f97104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f97105e;

    public p(long j17, int i17) {
        this.f97104d = j17;
        this.f97105e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f97104d;
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null) {
            return;
        }
        if (c17.field_status == 4) {
            com.tencent.mm.plugin.downloader.model.r0.i().x(c17);
        }
        c17.field_downloadType = 3;
        com.tencent.mm.plugin.downloader.model.m0.l(c17);
        g02.c cVar = new g02.c();
        cVar.a(c17);
        g02.b.c(24, cVar);
        com.tencent.mm.plugin.downloader.model.q.f97116a.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f97105e + 1));
    }
}
