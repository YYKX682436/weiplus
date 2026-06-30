package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f97073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.l0 f97074e;

    public k0(com.tencent.mm.plugin.downloader.model.l0 l0Var, long j17) {
        this.f97074e = l0Var;
        this.f97073d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (com.tencent.mm.plugin.downloader.model.g1 g1Var : com.tencent.mm.plugin.downloader.model.l0.a(this.f97074e)) {
            g1Var.f(this.f97073d);
        }
    }
}
