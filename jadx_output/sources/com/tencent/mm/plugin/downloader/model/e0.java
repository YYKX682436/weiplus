package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f97020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.l0 f97022f;

    public e0(com.tencent.mm.plugin.downloader.model.l0 l0Var, long j17, java.lang.String str) {
        this.f97022f = l0Var;
        this.f97020d = j17;
        this.f97021e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (com.tencent.mm.plugin.downloader.model.g1 g1Var : com.tencent.mm.plugin.downloader.model.l0.a(this.f97022f)) {
            g1Var.i(this.f97020d, this.f97021e);
        }
        java.util.Vector vector = com.tencent.mm.plugin.downloader.model.l0.f97078a;
    }
}
