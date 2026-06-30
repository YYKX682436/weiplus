package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class g9 {
    public g9(kotlin.jvm.internal.i iVar) {
    }

    public static final boolean a(com.tencent.mm.plugin.appbrand.appcache.g9 g9Var, com.tencent.mm.plugin.appbrand.appcache.o9 o9Var) {
        g9Var.getClass();
        if (o9Var == null) {
            return false;
        }
        java.lang.String str = o9Var.field_appId;
        if (str == null || str.length() == 0) {
            return false;
        }
        java.lang.String str2 = o9Var.field_versionDesc;
        return !(str2 == null || str2.length() == 0);
    }

    public static java.lang.String b(com.tencent.mm.plugin.appbrand.appcache.g9 g9Var, com.tencent.mm.plugin.appbrand.appcache.o9 o9Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        g9Var.getClass();
        if (o9Var == null) {
            return "(null)";
        }
        java.util.ArrayList d17 = kz5.c0.d("appId:" + o9Var.field_appId, "versionType:" + o9Var.field_debugType, "versionDesc:" + o9Var.field_versionDesc);
        if (z17) {
            java.lang.String str = o9Var.field_pkgPath;
            if (str == null) {
                str = "";
            }
            d17.add("filePath:".concat(str));
        }
        return kz5.n0.g0(d17, ", ", "(", ")", 0, null, null, 56, null);
    }
}
