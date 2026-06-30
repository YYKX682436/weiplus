package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class ma implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.n9 f75679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.qa f75680e;

    public ma(com.tencent.mm.plugin.appbrand.appcache.qa qaVar, com.tencent.mm.plugin.appbrand.appcache.n9 n9Var) {
        this.f75680e = qaVar;
        this.f75679d = n9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.appcache.qa qaVar = this.f75680e;
        qaVar.getClass();
        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "select count(%s) from %s where %s=? and %s=? and %s=?", "appId", "AppBrandWxaPkgManifestRecord", "appId", "debugType", "version");
        com.tencent.mm.plugin.appbrand.appcache.n9 n9Var = this.f75679d;
        android.database.Cursor B = qaVar.f75921d.B(format, new java.lang.String[]{n9Var.field_appId, n9Var.field_debugType + "", n9Var.field_version + ""});
        boolean z17 = false;
        if (B != null) {
            try {
                if (B.moveToNext()) {
                    if (B.getInt(0) > 0) {
                        z17 = true;
                    }
                }
            } catch (java.lang.Throwable th6) {
                try {
                    B.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        }
        if (B != null) {
            B.close();
        }
        com.tencent.mm.plugin.appbrand.appcache.pa paVar = qaVar.f75922e;
        if (z17) {
            boolean update = paVar.update(n9Var, com.tencent.mm.plugin.appbrand.appcache.n9.I);
            if (update && com.tencent.mm.vfs.w6.j(n9Var.field_pkgPath)) {
                ((com.tencent.mm.plugin.appbrand.appcache.p9) ((com.tencent.mm.plugin.appbrand.appcache.w3) i95.n0.c(com.tencent.mm.plugin.appbrand.appcache.w3.class))).wi(n9Var.field_pkgPath);
            }
            return java.lang.Boolean.valueOf(update);
        }
        boolean insert = paVar.insert(n9Var);
        if (insert && com.tencent.mm.vfs.w6.j(n9Var.field_pkgPath)) {
            ((com.tencent.mm.plugin.appbrand.appcache.p9) ((com.tencent.mm.plugin.appbrand.appcache.w3) i95.n0.c(com.tencent.mm.plugin.appbrand.appcache.w3.class))).wi(n9Var.field_pkgPath);
        }
        return java.lang.Boolean.valueOf(insert);
    }
}
