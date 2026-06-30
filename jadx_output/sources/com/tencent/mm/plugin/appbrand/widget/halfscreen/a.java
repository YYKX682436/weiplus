package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(android.content.Context context, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig config) {
        kotlin.jvm.internal.o.g(config, "config");
        nf.y yVar = nf.x.f336616b;
        if (!(yVar != null ? yVar.e() : false)) {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            if (!com.tencent.mm.plugin.appbrand.utils.m3.b(context2)) {
                return false;
            }
        }
        if (com.tencent.mm.plugin.appbrand.ui.b1.Companion.c(context)) {
            return false;
        }
        return config.D == k91.x2.f305817e || !config.c();
    }
}
