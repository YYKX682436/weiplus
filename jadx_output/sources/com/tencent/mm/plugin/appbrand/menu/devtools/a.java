package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public final class a implements nh1.b {
    @Override // nh1.b
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.luggage.sdk.jsapi.component.b pageView = (com.tencent.luggage.sdk.jsapi.component.b) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        com.tencent.mm.plugin.appbrand.wxassistant.n.f92236a.d();
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.luggage.sdk.jsapi.component.b pageView = (com.tencent.luggage.sdk.jsapi.component.b) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        return "Debug WxAssistant";
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.luggage.sdk.jsapi.component.b pageView = (com.tencent.luggage.sdk.jsapi.component.b) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        if (z65.c.a()) {
            return true;
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        return false;
    }
}
