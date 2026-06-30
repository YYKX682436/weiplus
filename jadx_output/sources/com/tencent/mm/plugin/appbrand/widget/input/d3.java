package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class d3 {
    public d3(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.appbrand.widget.input.f3 a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View rootView = view.getRootView();
        com.tencent.mm.plugin.appbrand.widget.input.d3 d3Var = com.tencent.mm.plugin.appbrand.widget.input.f3.f91442n;
        return (com.tencent.mm.plugin.appbrand.widget.input.f3) rootView.findViewById(com.tencent.mm.R.id.f483161y8);
    }

    public final com.tencent.mm.plugin.appbrand.widget.input.f3 b(android.view.View view, boolean z17, jg1.b bVar) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.appbrand.widget.input.f3 a17 = a(view);
        if (a17 != null) {
            a17.v(z17, bVar);
            return a17;
        }
        com.tencent.mm.plugin.appbrand.widget.input.h1 d17 = com.tencent.mm.plugin.appbrand.widget.input.h1.d(view);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandSecureKeyboardPanel", "settleKeyboardPanel, rootFrameLayout is null");
            return null;
        }
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.appbrand.widget.input.f3 f3Var = new com.tencent.mm.plugin.appbrand.widget.input.f3(context, z17, bVar);
        d17.a(f3Var, false);
        return f3Var;
    }
}
