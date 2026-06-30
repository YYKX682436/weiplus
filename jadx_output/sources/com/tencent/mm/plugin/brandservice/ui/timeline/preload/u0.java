package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class u0 extends nu4.c0 {

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f94459c = jz5.h.b(com.tencent.mm.plugin.brandservice.ui.timeline.preload.o0.f94379d);

    @Override // nu4.c0
    public boolean d(int i17, nu4.a manifest, java.lang.String script, yz5.l onCallback) {
        kotlin.jvm.internal.o.g(manifest, "manifest");
        kotlin.jvm.internal.o.g(script, "script");
        kotlin.jvm.internal.o.g(onCallback, "onCallback");
        if (i17 != 1) {
            return false;
        }
        java.lang.String str = manifest.f340239g;
        if (str == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            r45.m83 m83Var = manifest.f340234b;
            sb6.append(m83Var.f380235i);
            sb6.append('-');
            sb6.append(m83Var.f380231e);
            str = nu4.d0.a(sb6.toString());
        }
        java.util.HashMap hashMap = this.f340245b;
        if (hashMap == null) {
            kotlin.jvm.internal.o.o("contextMap");
            throw null;
        }
        if (hashMap.containsKey(str)) {
            mu4.w c17 = c();
            java.util.HashMap hashMap2 = this.f340245b;
            if (hashMap2 == null) {
                kotlin.jvm.internal.o.o("contextMap");
                throw null;
            }
            java.lang.Object obj = hashMap2.get(str);
            kotlin.jvm.internal.o.d(obj);
            ((com.tencent.mm.plugin.appbrand.jsruntime.n) c17.x0(((java.lang.Number) obj).intValue())).evaluateJavascript(script, new com.tencent.mm.plugin.brandservice.ui.timeline.preload.n0(onCallback));
            return true;
        }
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.m0 m0Var = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.m0(script, onCallback);
        java.lang.String str2 = manifest.f340233a.f379226d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MpWebPrefetcherJsEngineInterceptor", "create domain:" + str2 + '#' + str);
        try {
            com.tencent.mm.plugin.appbrand.jsruntime.r t07 = c().t0();
            kotlin.jvm.internal.o.d(str2);
            e(t07, str, str2);
            mu4.w.z0(c(), t07, "MpWebPrefetcherManifest#" + str, "manifest", null, new mu4.i("__Mp_Prefetcher_FakeAppId", c().A0("manifest").getLong("idKey")), 8, null);
            java.util.HashMap hashMap3 = this.f340245b;
            if (hashMap3 == null) {
                kotlin.jvm.internal.o.o("contextMap");
                throw null;
            }
            hashMap3.put(str, java.lang.Integer.valueOf(((com.tencent.mm.plugin.appbrand.jsruntime.q) t07).f84032h));
            m0Var.invoke(t07);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MpWebPrefetcherJsEngineInterceptor", e17, "create id=" + str, new java.lang.Object[0]);
            return true;
        }
    }

    public final void e(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, java.lang.String str, java.lang.String str2) {
        new lu4.v(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.p0(str, this)).a(tVar);
        new lu4.x(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.q0()).a(tVar);
        new lu4.q(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.s0(this, str2)).a(tVar);
        new lu4.m(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.t0(this)).a(tVar);
    }
}
