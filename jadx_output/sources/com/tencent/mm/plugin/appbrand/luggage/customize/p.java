package com.tencent.mm.plugin.appbrand.luggage.customize;

/* loaded from: classes7.dex */
public final class p extends com.tencent.mm.app.w6 implements be1.n {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.luggage.customize.p f85536d = new com.tencent.mm.plugin.appbrand.luggage.customize.p();

    /* renamed from: e, reason: collision with root package name */
    public static float f85537e;

    @Override // be1.n
    public float k6() {
        float f17;
        if (f85537e <= 0.0f) {
            try {
                f17 = i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a);
            } catch (java.lang.Throwable unused) {
                f17 = 1.0f;
            }
            f85537e = f17;
        }
        return f85537e;
    }

    @Override // com.tencent.mm.app.w6, com.tencent.mm.app.v6
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (activity instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI) {
            pm0.v.K(null, com.tencent.mm.plugin.appbrand.luggage.customize.o.f85535d);
        }
    }
}
