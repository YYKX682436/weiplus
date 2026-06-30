package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f97044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f97045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f97046f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.l0 f97047g;

    public h0(com.tencent.mm.plugin.downloader.model.l0 l0Var, long j17, int i17, boolean z17) {
        this.f97047g = l0Var;
        this.f97044d = j17;
        this.f97045e = i17;
        this.f97046f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (com.tencent.mm.plugin.downloader.model.g1 g1Var : com.tencent.mm.plugin.downloader.model.l0.a(this.f97047g)) {
            g1Var.b(this.f97044d, this.f97045e, this.f97046f);
        }
        java.util.Vector vector = com.tencent.mm.plugin.downloader.model.l0.f97078a;
    }
}
