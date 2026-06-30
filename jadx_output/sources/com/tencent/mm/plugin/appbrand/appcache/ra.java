package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public abstract class ra {
    public static final boolean a(com.tencent.mm.plugin.appbrand.appcache.b4 b4Var, com.tencent.mm.plugin.appbrand.appcache.s record) {
        kotlin.jvm.internal.o.g(b4Var, "<this>");
        kotlin.jvm.internal.o.g(record, "record");
        if (b4Var instanceof com.tencent.mm.plugin.appbrand.appcache.qa) {
            return ((com.tencent.mm.plugin.appbrand.appcache.qa) b4Var).s((com.tencent.mm.plugin.appbrand.appcache.n9) record);
        }
        if (b4Var instanceof com.tencent.mm.plugin.appbrand.appcache.k9) {
            return ((com.tencent.mm.plugin.appbrand.appcache.k9) b4Var).insert((com.tencent.mm.plugin.appbrand.appcache.o9) record);
        }
        return false;
    }

    public static final boolean b(com.tencent.mm.plugin.appbrand.appcache.b4 b4Var, com.tencent.mm.plugin.appbrand.appcache.s record) {
        boolean z17;
        kotlin.jvm.internal.o.g(b4Var, "<this>");
        kotlin.jvm.internal.o.g(record, "record");
        if (b4Var instanceof com.tencent.mm.plugin.appbrand.appcache.qa) {
            return ((com.tencent.mm.plugin.appbrand.appcache.qa) b4Var).t((com.tencent.mm.plugin.appbrand.appcache.n9) record);
        }
        if (b4Var instanceof com.tencent.mm.plugin.appbrand.appcache.k9) {
            com.tencent.mm.plugin.appbrand.appcache.k9 k9Var = (com.tencent.mm.plugin.appbrand.appcache.k9) b4Var;
            com.tencent.mm.plugin.appbrand.appcache.o9 o9Var = (com.tencent.mm.plugin.appbrand.appcache.o9) record;
            com.tencent.mm.plugin.appbrand.appcache.g9 g9Var = com.tencent.mm.plugin.appbrand.appcache.k9.f75635f;
            if (com.tencent.mm.plugin.appbrand.appcache.g9.a(g9Var, o9Var)) {
                synchronized (k9Var) {
                    try {
                        l75.k0 k0Var = k9Var.f75637e;
                        long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                        if (k9Var.y0(o9Var)) {
                            java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.appcache.o9.f75712J;
                            z17 = k9Var.updateNotify(o9Var, true, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
                            if (z17 && com.tencent.mm.vfs.w6.j(o9Var.field_pkgPath)) {
                                ((com.tencent.mm.plugin.appbrand.appcache.p9) ((com.tencent.mm.plugin.appbrand.appcache.w3) i95.n0.c(com.tencent.mm.plugin.appbrand.appcache.w3.class))).wi(o9Var.field_pkgPath);
                            }
                            com.tencent.mars.xlog.Log.i("Luggage.WxaPkgIndexedWithDescStorage", "updateNotify appid:" + o9Var.field_appId + ",newMd5:" + o9Var.field_NewMd5 + ", versionDesc:" + o9Var.field_versionDesc + ", update ret:" + z17);
                        } else {
                            boolean insertNotify = k9Var.insertNotify(o9Var, true);
                            if (insertNotify && com.tencent.mm.vfs.w6.j(o9Var.field_pkgPath)) {
                                ((com.tencent.mm.plugin.appbrand.appcache.p9) ((com.tencent.mm.plugin.appbrand.appcache.w3) i95.n0.c(com.tencent.mm.plugin.appbrand.appcache.w3.class))).wi(o9Var.field_pkgPath);
                            }
                            com.tencent.mars.xlog.Log.i("Luggage.WxaPkgIndexedWithDescStorage", "insertNotify appid:" + o9Var.field_appId + ",newMd5:" + o9Var.field_NewMd5 + ", versionDesc:" + o9Var.field_versionDesc + ", insert ret:" + insertNotify);
                            z17 = insertNotify;
                        }
                        k0Var.w(java.lang.Long.valueOf(F));
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("Luggage.WxaPkgIndexedWithDescStorage", "insertOrUpdate(" + com.tencent.mm.plugin.appbrand.appcache.g9.b(com.tencent.mm.plugin.appbrand.appcache.k9.f75635f, o9Var, false, 1, null) + "), exception:" + e17);
                    }
                }
                return z17;
            }
            com.tencent.mars.xlog.Log.e("Luggage.WxaPkgIndexedWithDescStorage", "insertOrUpdate(" + com.tencent.mm.plugin.appbrand.appcache.g9.b(g9Var, o9Var, false, 1, null) + ") invalid record");
        }
        return false;
    }

    public static final boolean c(com.tencent.mm.plugin.appbrand.appcache.b4 b4Var, com.tencent.mm.plugin.appbrand.appcache.s record) {
        boolean updateNotify;
        kotlin.jvm.internal.o.g(b4Var, "<this>");
        kotlin.jvm.internal.o.g(record, "record");
        if (b4Var instanceof com.tencent.mm.plugin.appbrand.appcache.qa) {
            return ((com.tencent.mm.plugin.appbrand.appcache.qa) b4Var).B((com.tencent.mm.plugin.appbrand.appcache.n9) record);
        }
        if (b4Var instanceof com.tencent.mm.plugin.appbrand.appcache.k9) {
            com.tencent.mm.plugin.appbrand.appcache.k9 k9Var = (com.tencent.mm.plugin.appbrand.appcache.k9) b4Var;
            com.tencent.mm.plugin.appbrand.appcache.o9 o9Var = (com.tencent.mm.plugin.appbrand.appcache.o9) record;
            com.tencent.mm.plugin.appbrand.appcache.g9 g9Var = com.tencent.mm.plugin.appbrand.appcache.k9.f75635f;
            if (com.tencent.mm.plugin.appbrand.appcache.g9.a(g9Var, o9Var)) {
                synchronized (k9Var) {
                    java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.appcache.o9.f75712J;
                    updateNotify = k9Var.updateNotify(o9Var, true, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
                    if (updateNotify && com.tencent.mm.vfs.w6.j(o9Var.field_pkgPath)) {
                        ((com.tencent.mm.plugin.appbrand.appcache.p9) ((com.tencent.mm.plugin.appbrand.appcache.w3) i95.n0.c(com.tencent.mm.plugin.appbrand.appcache.w3.class))).wi(o9Var.field_pkgPath);
                    }
                }
                return updateNotify;
            }
            com.tencent.mars.xlog.Log.e("Luggage.WxaPkgIndexedWithDescStorage", "update(" + com.tencent.mm.plugin.appbrand.appcache.g9.b(g9Var, o9Var, false, 1, null) + ") invalid record");
        }
        return false;
    }
}
