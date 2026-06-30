package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f81095f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.file.n0 f81096g;

    public m0(com.tencent.mm.plugin.appbrand.jsapi.file.n0 n0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, int i17) {
        this.f81096g = n0Var;
        this.f81093d = lVar;
        this.f81094e = str;
        this.f81095f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81093d;
        if (lVar.isRunning()) {
            com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = lVar.getFileSystem();
            java.lang.String str = this.f81094e;
            com.tencent.mm.vfs.r6 absoluteFile = fileSystem.getAbsoluteFile(str);
            com.tencent.mm.plugin.appbrand.jsapi.file.n0 n0Var = this.f81096g;
            int i17 = this.f81095f;
            if (absoluteFile == null) {
                lVar.a(i17, n0Var.o(java.lang.String.format(java.util.Locale.US, "fail no such file \"%s\"", str)));
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap(3);
            hashMap.put("size", java.lang.Long.valueOf(absoluteFile.C()));
            hashMap.put("createTime", java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(absoluteFile.B())));
            lVar.a(i17, n0Var.p("ok", hashMap));
        }
    }
}
