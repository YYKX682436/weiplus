package com.tencent.mm.plugin.appbrand.jsapi.video.jsapi;

/* loaded from: classes7.dex */
public class e extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.v f83614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.x f83615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.w f83616f;

    public e(com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a aVar, com.tencent.mm.plugin.appbrand.jsapi.v vVar, com.tencent.mm.plugin.appbrand.jsapi.x xVar, com.tencent.mm.plugin.appbrand.jsapi.w wVar) {
        this.f83614d = vVar;
        this.f83615e = xVar;
        this.f83616f = wVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        this.f83616f.onDestroy();
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        super.e(w0Var);
        this.f83614d.c();
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        super.g();
        this.f83615e.b();
    }
}
