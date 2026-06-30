package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class n implements com.tencent.mm.plugin.appbrand.jsruntime.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f88717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f88719c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.t f88720d;

    public n(com.tencent.mm.plugin.appbrand.service.j jVar, boolean z17, java.lang.String str, long j17, com.tencent.mm.plugin.appbrand.jsruntime.t tVar) {
        this.f88717a = z17;
        this.f88718b = str;
        this.f88719c = j17;
        this.f88720d = tVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.d0
    public void a() {
        com.tencent.mm.plugin.appbrand.report.quality.e.f88172a.l(this.f88717a ? com.tencent.mm.plugin.appbrand.task.x0.WASERVICE : null, this.f88718b, this.f88719c, com.tencent.mm.plugin.appbrand.report.j0.a(this.f88720d));
    }
}
