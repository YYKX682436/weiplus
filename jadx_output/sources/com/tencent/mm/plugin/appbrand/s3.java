package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km5.b f88445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f88446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.u3 f88447f;

    public s3(com.tencent.mm.plugin.appbrand.u3 u3Var, km5.b bVar, long j17) {
        this.f88447f = u3Var;
        this.f88445d = bVar;
        this.f88446e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.da.c(new com.tencent.mm.plugin.appbrand.r3(this));
    }
}
