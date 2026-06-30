package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public final class a implements nh1.c {
    public a(int i17, int i18) {
    }

    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.luggage.sdk.jsapi.component.b pageView = (com.tencent.luggage.sdk.jsapi.component.b) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        java.lang.String appId = pageView.getAppId();
        java.lang.String X1 = pageView.X1();
        java.lang.String string = bundle != null ? bundle.getString("key_action_note", "") : null;
        com.tencent.mm.plugin.appbrand.report.v0.e(appId, X1, 68, string == null ? "" : string, com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }
}
