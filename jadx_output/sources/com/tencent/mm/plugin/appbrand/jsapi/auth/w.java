package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public interface w {

    /* renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f79764q0 = 0;

    default android.content.Context b(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37;
        kotlin.jvm.internal.o.g(lVar, "<this>");
        android.content.Context context = lVar.getContext();
        if (context != null) {
            return context;
        }
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = lVar instanceof com.tencent.mm.plugin.appbrand.jsapi.d0 ? (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar : null;
        android.content.Context context2 = (d0Var == null || (t37 = d0Var.t3()) == null) ? null : t37.f74795d;
        if (context2 != null) {
            return context2;
        }
        android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        return context3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    default r45.nd7 c(r45.nd7 r4, com.tencent.mm.plugin.appbrand.jsapi.l r5) {
        /*
            r3 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.String r0 = "service"
            kotlin.jvm.internal.o.g(r5, r0)
            boolean r0 = r5 instanceof com.tencent.mm.plugin.appbrand.jsapi.d0
            r1 = 0
            if (r0 == 0) goto L2a
            r0 = r5
            com.tencent.mm.plugin.appbrand.jsapi.d0 r0 = (com.tencent.mm.plugin.appbrand.jsapi.d0) r0
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r0.t3()
            boolean r2 = r2 instanceof ze.n
            if (r2 == 0) goto L2a
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r0.t3()
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.luggage.sdk.runtime.AppBrandRuntimeLU"
            kotlin.jvm.internal.o.e(r0, r2)
            ze.n r0 = (ze.n) r0
            int r0 = r0.g2()
            goto L2b
        L2a:
            r0 = r1
        L2b:
            r4.f381296e = r0
            boolean r0 = r5 instanceof com.tencent.mm.plugin.appbrand.e9
            if (r0 == 0) goto L33
            r1 = 1
            goto L38
        L33:
            boolean r5 = r5 instanceof com.tencent.mm.plugin.appbrand.page.v5
            if (r5 == 0) goto L38
            r1 = 2
        L38:
            r4.f381297f = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.auth.w.c(r45.nd7, com.tencent.mm.plugin.appbrand.jsapi.l):r45.nd7");
    }

    default void e(android.content.Context context, android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2, ui1.z dialog) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(dialog, "dialog");
        d75.b.g(new com.tencent.mm.plugin.appbrand.jsapi.auth.v(str, context, str2, bitmap, dialog));
    }

    default void i(km5.b bVar, km5.d pipeable) {
        kotlin.jvm.internal.o.g(bVar, "<this>");
        kotlin.jvm.internal.o.g(pipeable, "pipeable");
        ((km5.q) pipeable.a(new com.tencent.mm.plugin.appbrand.jsapi.auth.t(bVar))).s(new com.tencent.mm.plugin.appbrand.jsapi.auth.u(bVar));
    }
}
