package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f97027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.l0 f97028e;

    public f0(com.tencent.mm.plugin.downloader.model.l0 l0Var, long j17) {
        this.f97028e = l0Var;
        this.f97027d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (com.tencent.mm.plugin.downloader.model.g1 g1Var : com.tencent.mm.plugin.downloader.model.l0.a(this.f97028e)) {
            g1Var.m(this.f97027d);
        }
        java.util.Vector vector = com.tencent.mm.plugin.downloader.model.l0.f97078a;
    }
}
