package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class a implements com.tencent.mm.plugin.appbrand.jsapi.auth.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.auth.o f79401d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f79402e;

    public a(com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar) {
        this.f79401d = oVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.o
    public void a() {
        if (this.f79402e) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar = this.f79401d;
        if (oVar != null) {
            oVar.a();
        }
        this.f79402e = true;
    }
}
