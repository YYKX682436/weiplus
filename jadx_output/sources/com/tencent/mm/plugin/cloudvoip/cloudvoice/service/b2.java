package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes7.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fw1.b f95831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95833f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95834g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95835h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95836i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95837m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95838n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f95839o;

    public b2(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var, fw1.b bVar, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar2, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar3, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar4, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar5, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar6, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar7, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar8) {
        this.f95839o = p0Var;
        this.f95831d = bVar;
        this.f95832e = bVar2;
        this.f95833f = bVar3;
        this.f95834g = bVar4;
        this.f95835h = bVar5;
        this.f95836i = bVar6;
        this.f95837m = bVar7;
        this.f95838n = bVar8;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = this.f95839o;
        p0Var.U = false;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.a(p0Var, this.f95831d, this.f95832e, this.f95833f, this.f95834g, this.f95835h, this.f95836i, this.f95837m, this.f95838n);
    }
}
