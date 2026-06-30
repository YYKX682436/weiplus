package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f97085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.a f97086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz.n1 f97087f;

    public m2(android.content.Context context, com.tencent.mm.plugin.downloader_app.model.a aVar, vz.n1 n1Var) {
        this.f97085d = context;
        this.f97086e = aVar;
        this.f97087f = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.downloader.model.j1.c(this.f97085d, this.f97086e, false, new com.tencent.mm.plugin.downloader.model.l2(this));
    }
}
