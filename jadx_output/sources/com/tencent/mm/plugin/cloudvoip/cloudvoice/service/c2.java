package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes7.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fw1.b f95874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95877g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95878h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95879i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95880m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95881n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f95882o;

    public c2(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var, fw1.b bVar, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar2, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar3, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar4, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar5, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar6, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar7, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar8) {
        this.f95882o = p0Var;
        this.f95874d = bVar;
        this.f95875e = bVar2;
        this.f95876f = bVar3;
        this.f95877g = bVar4;
        this.f95878h = bVar5;
        this.f95879i = bVar6;
        this.f95880m = bVar7;
        this.f95881n = bVar8;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = this.f95882o;
        p0Var.U = true;
        fw1.b bVar = this.f95874d;
        bVar.f267055i = 480;
        bVar.f267056j = 640;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.a(p0Var, bVar, this.f95875e, this.f95876f, this.f95877g, this.f95878h, this.f95879i, this.f95880m, this.f95881n);
    }
}
