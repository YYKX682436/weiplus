package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes.dex */
public class b implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.model.d f87926d;

    public b(com.tencent.mm.plugin.appbrand.report.model.d dVar) {
        this.f87926d = dVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.report.model.d dVar = this.f87926d;
        if (dVar != null) {
            com.tencent.mm.plugin.appbrand.jsapi.y1 y1Var = (com.tencent.mm.plugin.appbrand.jsapi.y1) dVar;
            y1Var.f83924a.a(y1Var.f83925b, y1Var.f83926c.o("ok"));
        }
    }
}
