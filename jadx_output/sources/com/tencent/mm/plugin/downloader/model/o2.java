package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f97099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f97100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f97101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f97102g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vz.n1 f97103h;

    public o2(android.content.Context context, long j17, boolean z17, boolean z18, vz.n1 n1Var) {
        this.f97099d = context;
        this.f97100e = j17;
        this.f97101f = z17;
        this.f97102g = z18;
        this.f97103h = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.downloader.model.j1.f(this.f97099d, this.f97100e, this.f97101f, this.f97102g, false, new com.tencent.mm.plugin.downloader.model.n2(this));
    }
}
