package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz.j f95999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f96000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96001f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f96002g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f96003h;

    public o1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var, dz.j jVar, int i17, java.lang.String str, java.util.Map map) {
        this.f96003h = p0Var;
        this.f95999d = jVar;
        this.f96000e = i17;
        this.f96001f = str;
        this.f96002g = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar = this.f96003h.F;
        if (bVar == null) {
            return;
        }
        bVar.a(this.f95999d.f244754d, this.f96000e, this.f96001f, this.f96002g);
    }
}
