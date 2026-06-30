package com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi;

/* loaded from: classes7.dex */
public final class b implements c00.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.service.c0 f80790a;

    public b(com.tencent.mm.plugin.appbrand.service.c0 env) {
        kotlin.jvm.internal.o.g(env, "env");
        this.f80790a = env;
    }

    @Override // c00.q3
    public com.tencent.mm.vfs.r6 allocTempFile(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = this.f80790a.getFileSystem();
        if (fileSystem != null) {
            return fileSystem.allocTempFile(name);
        }
        return null;
    }

    @Override // c00.q3
    public java.lang.String getAbsoluteFilePath(java.lang.String rawPath) {
        com.tencent.mm.vfs.r6 absoluteFile;
        kotlin.jvm.internal.o.g(rawPath, "rawPath");
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = this.f80790a.getFileSystem();
        if (fileSystem == null || (absoluteFile = fileSystem.getAbsoluteFile(rawPath)) == null) {
            return null;
        }
        return absoluteFile.o();
    }

    @Override // c00.q3
    public org.json.JSONObject getConfig() {
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = this.f80790a.t3().E0();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = this.f80790a.t3().u0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("sourceAppID", E0.f305842e);
        jSONObject.put("sourceAppName", E0.f305841d);
        jSONObject.put("sourceUsername", u07.f47278x);
        jSONObject.put("sourceVersion", E0.f305852r.pkgVersion);
        jSONObject.put("sourceBrandIconUrl", E0.f305843f);
        jSONObject.put("sourceMD5", E0.f305852r.f75372md5);
        jSONObject.put("sourcePkgType", E0.f305852r.f75399d);
        jSONObject.put("isHalfScreenApp", this.f80790a.t3().Q0());
        jSONObject.put("enableExpandToStatusBarTop", u07.L1.W);
        return jSONObject;
    }
}
