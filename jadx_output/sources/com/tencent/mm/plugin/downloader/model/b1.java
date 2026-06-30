package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f96988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.f1 f96989e;

    public b1(com.tencent.mm.plugin.downloader.model.f1 f1Var, long j17) {
        this.f96989e = f1Var;
        this.f96988d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f96988d;
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null) {
            return;
        }
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(c17.field_downloadUrl);
        if (c17.field_status != 5) {
            c17.field_status = 5;
            com.tencent.mm.plugin.downloader.model.m0.l(c17);
            this.f96989e.f97212a.g(j17);
        }
    }
}
