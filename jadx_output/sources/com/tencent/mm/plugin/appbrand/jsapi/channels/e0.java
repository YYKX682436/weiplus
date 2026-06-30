package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class e0 extends com.tencent.mm.plugin.appbrand.jsapi.channels.d0 {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.channels.d0
    public java.lang.String C(com.tencent.mm.plugin.appbrand.jsapi.l env) {
        kotlin.jvm.internal.o.g(env, "env");
        if (!(env instanceof com.tencent.mm.plugin.appbrand.service.c0)) {
            return "";
        }
        com.tencent.mm.plugin.appbrand.o6 t37 = ((com.tencent.mm.plugin.appbrand.service.c0) env).t3();
        java.lang.String n07 = t37 != null ? t37.n0() : null;
        return n07 == null ? "" : n07;
    }
}
