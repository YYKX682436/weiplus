package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes5.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.wxassistant.e f92195d = new com.tencent.mm.plugin.appbrand.wxassistant.e();

    @Override // java.lang.Runnable
    public final void run() {
        if (com.tencent.mm.plugin.appbrand.wxassistant.c4.f92156a) {
            com.tencent.mm.plugin.appbrand.wxassistant.c4.f92156a = false;
            com.tencent.mm.plugin.appbrand.wxassistant.w3 w3Var = com.tencent.mm.plugin.appbrand.wxassistant.c4.f92157b;
            kotlin.jvm.internal.o.d(w3Var);
            try {
                w3Var.f92335i.removeView(w3Var);
            } catch (java.lang.Throwable unused) {
            }
            com.tencent.mm.plugin.appbrand.wxassistant.c4.f92157b = null;
        }
    }
}
