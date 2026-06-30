package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public class n6 extends qj1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f75685f = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.appcache.m6.f75676w, "PredownloadEncryptPkgInfo")};

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f75686e;

    public n6(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.appbrand.appcache.m6.f75676w, "PredownloadEncryptPkgInfo", dm.o9.f238995m);
        this.f75686e = k0Var;
    }

    public static boolean y0(com.tencent.mm.plugin.appbrand.appcache.m6 m6Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(m6Var.field_pkgPath)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PredownloadEncryptPkgStorage", "checkPkgIntegrity, with %s path nil", m6Var.t0());
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(m6Var.field_pkgMd5)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PredownloadEncryptPkgStorage", "checkPkgIntegrity, with %s record md5 nil", m6Var.t0());
            return false;
        }
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(m6Var.field_pkgPath);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PredownloadEncryptPkgStorage", "checkPkgIntegrity with %s, file_md5(%s), record_md5(%s)", m6Var.t0(), p17, m6Var.field_pkgMd5);
        return m6Var.field_pkgMd5.equals(p17);
    }

    public com.tencent.mm.plugin.appbrand.appcache.m6 D0(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.appbrand.appcache.m6 z07 = z0(str, i17, i18);
        if (z07 == null || !y0(z07)) {
            return null;
        }
        return z07;
    }

    public com.tencent.mm.plugin.appbrand.appcache.m6 z0(java.lang.String str, int i17, int i18) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.appcache.m6 m6Var = new com.tencent.mm.plugin.appbrand.appcache.m6();
        m6Var.field_appId = str;
        m6Var.field_type = i17;
        m6Var.field_version = i18;
        if (get(m6Var, com.tencent.mm.plugin.appbrand.appcache.m6.f75675v)) {
            return m6Var;
        }
        return null;
    }
}
