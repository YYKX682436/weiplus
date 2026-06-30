package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f97011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.l0 f97013f;

    public d0(com.tencent.mm.plugin.downloader.model.l0 l0Var, long j17, java.lang.String str) {
        this.f97013f = l0Var;
        this.f97011d = j17;
        this.f97012e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (com.tencent.mm.plugin.downloader.model.g1 g1Var : com.tencent.mm.plugin.downloader.model.l0.a(this.f97013f)) {
            g1Var.l(this.f97011d, this.f97012e);
        }
        java.util.Vector vector = com.tencent.mm.plugin.downloader.model.l0.f97078a;
    }
}
