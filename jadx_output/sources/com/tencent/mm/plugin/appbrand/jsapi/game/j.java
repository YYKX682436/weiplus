package com.tencent.mm.plugin.appbrand.jsapi.game;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.game.j f81260a = new com.tencent.mm.plugin.appbrand.jsapi.game.j();

    public final void a(java.lang.String tag, com.tencent.mm.plugin.appbrand.e9 e9Var, k91.z zVar, java.lang.Integer num, int i17, int i18, int i19) {
        java.lang.String icon;
        kotlin.jvm.internal.o.g(tag, "tag");
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.w(tag, "invoke env is empty");
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = e9Var.t3();
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(i17, t37.n0());
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (zVar != null) {
            try {
                java.lang.String text = zVar.f305840b;
                kotlin.jvm.internal.o.f(text, "text");
                java.lang.String format = java.lang.String.format(text, java.util.Arrays.copyOf(new java.lang.Object[]{t37.n0()}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                string = format;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(tag, "invoke, string format error: " + e17);
            }
            icon = zVar.f305839a;
            kotlin.jvm.internal.o.f(icon, "icon");
        } else {
            icon = "";
        }
        java.lang.String str = icon;
        mi1.o0.f326652a.b(t37, new mi1.r1(string, str, str, str.length() > 0 ? null : num, i18, true, 0, new com.tencent.mm.plugin.appbrand.jsapi.game.i(e9Var, i19), 64, null), -1, null);
    }
}
