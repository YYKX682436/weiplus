package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class g0 implements com.tencent.mm.plugin.appbrand.jsapi.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f88673a;

    public g0(com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f88673a = c0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.i
    public boolean c(java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        if ("requireRenderContext".equals(str) || "onWxServiceInit".equals(str)) {
            return true;
        }
        java.util.Map map = i81.j.f289592a;
        if (c0Var instanceof com.tencent.mm.plugin.appbrand.d) {
            return true;
        }
        if ("loadLibFiles".equals(str)) {
            return false;
        }
        return this.f88673a.isRunning();
    }
}
