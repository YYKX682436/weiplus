package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f97039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f97041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.l0 f97042g;

    public g0(com.tencent.mm.plugin.downloader.model.l0 l0Var, long j17, java.lang.String str, boolean z17) {
        this.f97042g = l0Var;
        this.f97039d = j17;
        this.f97040e = str;
        this.f97041f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (com.tencent.mm.plugin.downloader.model.g1 g1Var : com.tencent.mm.plugin.downloader.model.l0.a(this.f97042g)) {
            g1Var.c(this.f97039d, this.f97040e, this.f97041f);
        }
        java.util.Vector vector = com.tencent.mm.plugin.downloader.model.l0.f97078a;
    }
}
