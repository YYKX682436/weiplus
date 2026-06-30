package ae1;

/* loaded from: classes7.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ae1.w1 f3421a = new ae1.w1();

    public final ae1.d a(ze.n runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        ae1.d dVar = (ae1.d) runtime.k(ae1.d.class);
        if (dVar != null) {
            return dVar;
        }
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU u07 = runtime.u0();
        java.lang.String a17 = u07 != null ? kk.v.a(u07.f47279x0) : null;
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.SmStorageFactory", "getOrCreate, uin is null");
            return null;
        }
        java.lang.String str = runtime.f74803n;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.SmStorageFactory", "getOrCreate, appId is null");
            return null;
        }
        com.tencent.mm.plugin.appbrand.appstorage.j3 c17 = com.tencent.mm.plugin.appbrand.jsapi.file.l2.c(a17, str);
        com.tencent.mm.plugin.appbrand.appstorage.j1 mkdir = c17.mkdir("wxfile://clientdata/TSMStorage", true);
        kotlin.jvm.internal.o.f(mkdir, "mkdir(...)");
        if (com.tencent.mm.plugin.appbrand.appstorage.j1.OK != mkdir && com.tencent.mm.plugin.appbrand.appstorage.j1.RET_ALREADY_EXISTS != mkdir) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.SmStorageFactory", "getOrCreate, mkdir fail, ret: " + mkdir);
            return null;
        }
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(new com.tencent.mm.vfs.r6(c17.f76225d, "TSMStorage").o(), true);
        if (i17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.SmStorageFactory", "getOrCreate, smStorageRootPath is null");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SmStorageFactory", "getOrCreate, uin: " + a17 + ", appId: " + str + ", smStorageRootPath: " + i17);
        ae1.z1 z1Var = new ae1.z1(i17, str, a17, null);
        runtime.l(z1Var);
        return z1Var;
    }
}
