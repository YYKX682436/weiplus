package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f97057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f97059f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f97060g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.l0 f97061h;

    public j0(com.tencent.mm.plugin.downloader.model.l0 l0Var, long j17, java.lang.String str, long j18, long j19) {
        this.f97061h = l0Var;
        this.f97057d = j17;
        this.f97058e = str;
        this.f97059f = j18;
        this.f97060g = j19;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (com.tencent.mm.plugin.downloader.model.g1 g1Var : com.tencent.mm.plugin.downloader.model.l0.a(this.f97061h)) {
            g1Var.h(this.f97057d, this.f97058e, this.f97059f, this.f97060g);
        }
    }
}
