package com.tencent.mm.plugin.appbrand.performance;

/* loaded from: classes7.dex */
public class e extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.performance.f f87340d;

    public e(com.tencent.mm.plugin.appbrand.performance.f fVar) {
        this.f87340d = fVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        this.f87340d.h();
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        super.e(w0Var);
        com.tencent.mm.plugin.appbrand.performance.f fVar = this.f87340d;
        fVar.f87346i = true;
        com.tencent.mm.plugin.appbrand.performance.t tVar = fVar.f87349o;
        if (tVar != null) {
            tVar.b();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        super.g();
        com.tencent.mm.plugin.appbrand.performance.f fVar = this.f87340d;
        fVar.f87346i = false;
        com.tencent.mm.plugin.appbrand.performance.t tVar = fVar.f87349o;
        if (tVar != null) {
            tVar.a();
        }
    }
}
