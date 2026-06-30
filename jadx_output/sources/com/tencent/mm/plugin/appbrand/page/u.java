package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public abstract class u {
    public static final com.tencent.mm.plugin.appbrand.ui.z6 a(android.content.Context context) {
        return context instanceof com.tencent.mm.plugin.appbrand.ui.z6 ? com.tencent.mm.plugin.appbrand.ui.z6.b(((com.tencent.mm.plugin.appbrand.ui.z6) context).getBaseContext()) : com.tencent.mm.plugin.appbrand.ui.z6.b(context);
    }

    public static final com.tencent.mm.plugin.appbrand.ui.ia b(android.content.Context context, boolean z17) {
        com.tencent.mm.plugin.appbrand.ui.ia iaVar;
        kotlin.jvm.internal.o.g(context, "<this>");
        if (context instanceof com.tencent.mm.plugin.appbrand.ui.ia) {
            return (com.tencent.mm.plugin.appbrand.ui.ia) context;
        }
        if (context instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI) {
            iaVar = ((com.tencent.mm.plugin.appbrand.ui.AppBrandUI) context).x7(z17);
        } else if (context instanceof com.tencent.mm.plugin.appbrand.ui.z6) {
            com.tencent.mm.plugin.appbrand.ui.z6 z6Var = (com.tencent.mm.plugin.appbrand.ui.z6) context;
            if (z6Var.f90367c == null) {
                z6Var.f90367c = new com.tencent.mm.plugin.appbrand.ui.ia(z6Var);
            }
            iaVar = z6Var.f90367c;
        } else {
            iaVar = new com.tencent.mm.plugin.appbrand.ui.ia(context, com.tencent.mm.plugin.appbrand.ui.ja.a(false));
        }
        kotlin.jvm.internal.o.d(iaVar);
        return iaVar;
    }
}
