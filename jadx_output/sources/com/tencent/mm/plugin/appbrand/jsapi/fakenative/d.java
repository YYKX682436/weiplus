package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f80946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f80947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f80948f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.fakenative.e f80949g;

    public d(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.fakenative.e eVar) {
        this.f80946d = o6Var;
        this.f80947e = c0Var;
        this.f80948f = i17;
        this.f80949g = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f80946d;
        com.tencent.mm.plugin.appbrand.ui.vc vcVar = o6Var.f74811t;
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.e eVar = this.f80949g;
        int i17 = this.f80948f;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f80947e;
        if (vcVar == null) {
            c0Var.a(i17, eVar.o("fail: timeout"));
        } else if (!(vcVar instanceof com.tencent.mm.plugin.appbrand.ui.uc)) {
            c0Var.a(i17, eVar.o("fail: screenshot invalid"));
        } else {
            o6Var.H0();
            c0Var.a(i17, eVar.o("ok"));
        }
    }
}
