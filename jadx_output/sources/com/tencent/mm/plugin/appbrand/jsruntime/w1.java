package com.tencent.mm.plugin.appbrand.jsruntime;

@j95.b
/* loaded from: classes7.dex */
public final class w1 extends i95.w {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        jz5.g gVar = com.tencent.mm.plugin.appbrand.utils.s.f90548a;
        if (((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.appbrand.utils.s.f90548a).getValue()).booleanValue()) {
            ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
            bm5.v1.a("V8EnvPreloader.preload", com.tencent.mm.plugin.appbrand.jsruntime.v1.f84044d);
        }
    }
}
